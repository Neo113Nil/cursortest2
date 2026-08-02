package com.bugsnag.android;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Result;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.LinesSequence;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u0082 ¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bugsnag/android/RootDetector;", "", "", "performNativeRootChecks", "()Z", "bugsnag-android-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RootDetector {
    public static final File BUILD_PROP_FILE = new File("/system/build.prop");
    public static final List ROOT_INDICATORS = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"/system/xbin/su", "/system/bin/su", "/system/app/Superuser.apk", "/system/app/SuperSU.apk", "/system/app/Superuser", "/system/app/SuperSU", "/system/xbin/daemonsu", "/su/bin"});
    public final File buildProps;
    public final DeviceBuildInfo deviceBuildInfo;
    public volatile boolean libraryLoaded;
    public final Logger logger;
    public final List rootBinaryLocations;

    public RootDetector(DeviceBuildInfo deviceBuildInfo, Logger logger) {
        List list = ROOT_INDICATORS;
        File file = BUILD_PROP_FILE;
        this.deviceBuildInfo = deviceBuildInfo;
        this.rootBinaryLocations = list;
        this.buildProps = file;
        this.logger = logger;
        try {
            System.loadLibrary("bugsnag-root-detection");
            this.libraryLoaded = true;
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
    
        if (0 != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
    
        r2.destroy();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006c, code lost:
    
        if (0 == 0) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean checkSuExists() {
        boolean z;
        ProcessBuilder processBuilder = new ProcessBuilder(new String[0]);
        processBuilder.command(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"which", "su"}));
        Process process = null;
        try {
            try {
                Process start = processBuilder.start();
                if (!start.waitFor(250L, TimeUnit.MILLISECONDS)) {
                    start.destroy();
                    return false;
                }
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), Charsets.UTF_8), PKIFailureInfo.certRevoked);
                while (true) {
                    try {
                        int read = bufferedReader.read();
                        if (read == -1) {
                            z = false;
                            break;
                        }
                        if (!CharsKt.isWhitespace((char) read)) {
                            z = true;
                            break;
                        }
                    } finally {
                    }
                }
                bufferedReader.close();
                start.destroy();
                return z;
            } catch (Throwable th) {
                if (0 != 0) {
                    process.destroy();
                }
                throw th;
            }
        } catch (IOException unused) {
        } catch (InterruptedException unused2) {
            java.lang.Thread.currentThread().interrupt();
        }
    }

    private final native boolean performNativeRootChecks();

    public final boolean checkBuildProps$bugsnag_android_core_release() {
        boolean z;
        try {
            Result.Companion companion = Result.Companion;
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.buildProps), Charsets.UTF_8), PKIFailureInfo.certRevoked);
            try {
                FilteringSequence filter = SequencesKt___SequencesKt.filter(SequencesKt___SequencesKt.map(new ConstrainedOnceSequence(new LinesSequence(bufferedReader, 0)), RootDetector$checkBuildProps$1$1$1.INSTANCE), RootDetector$checkBuildProps$1$1$1.INSTANCE$1);
                Iterator it = filter.sequence.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (((Boolean) filter.predicate.invoke(it.next())).booleanValue() == filter.sendWhen) {
                        z = true;
                        break;
                    }
                }
                boolean z2 = z;
                bufferedReader.close();
                return z2;
            } finally {
            }
        } catch (Throwable unused) {
            Result.Companion companion2 = Result.Companion;
            return false;
        }
    }

    public final boolean isRooted() {
        try {
            String str = (String) this.deviceBuildInfo.tags;
            if ((str == null || !StringsKt.contains((CharSequence) str, (CharSequence) "test-keys", false)) && !checkSuExists() && !checkBuildProps$bugsnag_android_core_release()) {
                try {
                    Result.Companion companion = Result.Companion;
                    Iterator it = this.rootBinaryLocations.iterator();
                    while (it.hasNext()) {
                        if (new File((String) it.next()).exists()) {
                            break;
                        }
                    }
                    Result.Companion companion2 = Result.Companion;
                } catch (Throwable unused) {
                    Result.Companion companion3 = Result.Companion;
                }
                if (!(this.libraryLoaded ? performNativeRootChecks() : false)) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            this.logger.w("Root detection failed", th);
            return false;
        }
    }
}
