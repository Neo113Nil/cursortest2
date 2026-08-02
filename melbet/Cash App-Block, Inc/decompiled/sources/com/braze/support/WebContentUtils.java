package com.braze.support;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.j1$$ExternalSyntheticLambda7;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import okio.Utf8;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u001a\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\f*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u001b\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010 \u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u0019H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J+\u0010)\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060'H\u0007¢\u0006\u0004\b)\u0010*J\u001f\u0010-\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u00062\u0006\u0010,\u001a\u00020\u0006H\u0007¢\u0006\u0004\b-\u0010.R(\u0010/\u001a\u00020\u00128\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b/\u00100\u0012\u0004\b5\u0010\u0003\u001a\u0004\b1\u00102\"\u0004\b3\u00104R(\u00106\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b6\u00107\u0012\u0004\b<\u0010\u0003\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R(\u0010=\u001a\u00020\u00198\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b=\u00107\u0012\u0004\b@\u0010\u0003\u001a\u0004\b>\u00109\"\u0004\b?\u0010;¨\u0006A"}, d2 = {"Lcom/braze/support/WebContentUtils;", "", "<init>", "()V", "Ljava/io/File;", "localDirectory", "", "remoteZipUrl", "getLocalHtmlUrlFromRemoteUrl", "(Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "unpackDirectory", "zipFile", "", "unpackZipIntoDirectory", "(Ljava/lang/String;Ljava/io/File;)Z", "Ljava/util/zip/ZipEntry;", "shouldSkip", "(Ljava/util/zip/ZipEntry;)Z", "", "entryCount", "hasTooManyZipEntries", "(I)Z", "Ljava/util/zip/ZipInputStream;", "zipInputStream", "zipEntry", "", "totalUnpackedBytes", "unpackZipEntry", "(Ljava/lang/String;Ljava/util/zip/ZipInputStream;Ljava/util/zip/ZipEntry;J)J", "Ljava/io/BufferedOutputStream;", "outputStream", "initialTotalUnpackedBytes", "copyZipEntryToOutputStream", "(Ljava/util/zip/ZipInputStream;Ljava/io/BufferedOutputStream;J)J", "Landroid/content/Context;", "context", "getHtmlInAppMessageAssetCacheDirectory", "(Landroid/content/Context;)Ljava/io/File;", "originalString", "", "remoteToLocalAssetMap", "replacePrefetchedUrlsWithLocalAssets", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "intendedParentDirectory", "childFilePath", "validateChildFileExistsUnderParent", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "maxUnpackedZipEntryCount", "I", "getMaxUnpackedZipEntryCount$android_sdk_base_release", "()I", "setMaxUnpackedZipEntryCount$android_sdk_base_release", "(I)V", "getMaxUnpackedZipEntryCount$android_sdk_base_release$annotations", "maxUnpackedZipEntrySizeBytes", "J", "getMaxUnpackedZipEntrySizeBytes$android_sdk_base_release", "()J", "setMaxUnpackedZipEntrySizeBytes$android_sdk_base_release", "(J)V", "getMaxUnpackedZipEntrySizeBytes$android_sdk_base_release$annotations", "maxUnpackedZipSizeBytes", "getMaxUnpackedZipSizeBytes$android_sdk_base_release", "setMaxUnpackedZipSizeBytes$android_sdk_base_release", "getMaxUnpackedZipSizeBytes$android_sdk_base_release$annotations", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WebContentUtils {
    public static final WebContentUtils INSTANCE = new WebContentUtils();
    private static int maxUnpackedZipEntryCount = 1024;
    private static long maxUnpackedZipEntrySizeBytes = 26214400;
    private static long maxUnpackedZipSizeBytes = 104857600;

    private WebContentUtils() {
    }

    private final long copyZipEntryToOutputStream(ZipInputStream zipInputStream, BufferedOutputStream outputStream, long initialTotalUnpackedBytes) {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        int read = zipInputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            long j2 = read;
            j += j2;
            initialTotalUnpackedBytes += j2;
            if (j > maxUnpackedZipEntrySizeBytes) {
                a$$ExternalSyntheticBUOutline0.m$4("Zip entry exceeds maximum unpacked size.");
                return 0L;
            }
            if (initialTotalUnpackedBytes > maxUnpackedZipSizeBytes) {
                a$$ExternalSyntheticBUOutline0.m$4("Zip file exceeds maximum total unpacked size.");
                return 0L;
            }
            outputStream.write(bArr, 0, read);
            read = zipInputStream.read(bArr);
        }
        return initialTotalUnpackedBytes;
    }

    public static final File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        context.getClass();
        return new File(Recorder$$ExternalSyntheticOutline2.m$1(context.getCacheDir().getPath(), "/braze-html-inapp-messages"));
    }

    public static final String getLocalHtmlUrlFromRemoteUrl(File localDirectory, String remoteZipUrl) {
        localDirectory.getClass();
        remoteZipUrl.getClass();
        if (StringsKt.isBlank(remoteZipUrl)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(25), 6, (Object) null);
            return null;
        }
        String absolutePath = localDirectory.getAbsolutePath();
        String valueOf = String.valueOf(IntentUtils.getRequestCode());
        String m = Recorder$$ExternalSyntheticOutline2.m(absolutePath, "/", valueOf);
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        WebContentUtils webContentUtils = INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new j1$$ExternalSyntheticLambda7(remoteZipUrl, m, 29), 7, (Object) null);
        try {
            File file = (File) BrazeFileUtils.downloadFileToPath(m, remoteZipUrl, valueOf, ".zip").first;
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new WebContentUtils$$ExternalSyntheticLambda2(remoteZipUrl, m, 0), 7, (Object) null);
            if (unpackZipIntoDirectory(m, file)) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(m, 21), 7, (Object) null);
                return m;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) webContentUtils, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(27), 6, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(m));
            return null;
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda1(remoteZipUrl, 22), 4, (Object) null);
            BrazeFileUtils.deleteFileOrDirectory(new File(m));
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$0() {
        return "Remote zip url is empty. No local URL will be created.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$1(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Starting download of url: ", str, " to ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$2(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Could not download zip file to local storage. ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$3(String str, String str2) {
        return CameraSelector$$ExternalSyntheticOutline0.m("Html content zip downloaded. ", str, " to ", str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$4() {
        return "Error during the zip unpack.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getLocalHtmlUrlFromRemoteUrl$lambda$5(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Html content zip unpacked to to ", str, ".");
    }

    private final boolean hasTooManyZipEntries(int entryCount) {
        if (entryCount <= maxUnpackedZipEntryCount) {
            return false;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(26), 6, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String hasTooManyZipEntries$lambda$0() {
        return "Zip file contains too many entries.";
    }

    public static final String replacePrefetchedUrlsWithLocalAssets(String originalString, Map<String, String> remoteToLocalAssetMap) {
        List split$default;
        originalString.getClass();
        remoteToLocalAssetMap.getClass();
        for (Map.Entry<String, String> entry : remoteToLocalAssetMap.entrySet()) {
            String value = entry.getValue();
            if (new File(value).exists()) {
                String key = entry.getKey();
                if (StringsKt.contains((CharSequence) value, (CharSequence) "ab_triggers", false)) {
                    split$default = StringsKt__StringsKt.split$default(value, new String[]{"ab_triggers"}, false, 0, 6, null);
                    int i = 1;
                    String m = Recorder$$ExternalSyntheticOutline2.m("https://iamcache.braze/ab_triggers", (String) split$default.get(1));
                    if (StringsKt.contains((CharSequence) originalString, (CharSequence) key, false)) {
                        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new WebContentUtils$$ExternalSyntheticLambda2(key, m, i), 7, (Object) null);
                        originalString = StringsKt__StringsJVMKt.replace$default(originalString, key, m);
                    }
                }
            } else {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(value, 23), 6, (Object) null);
            }
        }
        return originalString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$0(String str) {
        return Recorder$$ExternalSyntheticOutline2.m("Cannot find local asset file at path: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String replacePrefetchedUrlsWithLocalAssets$lambda$1(String str, String str2) {
        return Boxes$$ExternalSyntheticOutline1.m("Replacing remote url \"", str, "\" with local uri \"", str2, "\"");
    }

    private final boolean shouldSkip(ZipEntry zipEntry) {
        String name = zipEntry.getName();
        name.getClass();
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        lowerCase.getClass();
        return StringsKt__StringsJVMKt.startsWith(lowerCase, "__macosx", false);
    }

    private final long unpackZipEntry(String unpackDirectory, ZipInputStream zipInputStream, ZipEntry zipEntry, long totalUnpackedBytes) {
        String validateChildFileExistsUnderParent = validateChildFileExistsUnderParent(unpackDirectory, unpackDirectory + "/" + zipEntry.getName());
        if (zipEntry.isDirectory()) {
            new File(validateChildFileExistsUnderParent).mkdirs();
            return totalUnpackedBytes;
        }
        File parentFile = new File(validateChildFileExistsUnderParent).getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(validateChildFileExistsUnderParent));
        try {
            long copyZipEntryToOutputStream = INSTANCE.copyZipEntryToOutputStream(zipInputStream, bufferedOutputStream, totalUnpackedBytes);
            bufferedOutputStream.close();
            return copyZipEntryToOutputStream;
        } finally {
        }
    }

    public static final boolean unpackZipIntoDirectory(String unpackDirectory, File zipFile) {
        String str;
        unpackDirectory.getClass();
        zipFile.getClass();
        if (StringsKt.isBlank(unpackDirectory)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda0(28), 6, (Object) null);
            return false;
        }
        new File(unpackDirectory).mkdirs();
        try {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(zipFile));
                try {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    int i = 0;
                    long j = 0;
                    while (nextEntry != null) {
                        WebContentUtils webContentUtils = INSTANCE;
                        if (webContentUtils.shouldSkip(nextEntry)) {
                            str = unpackDirectory;
                        } else {
                            i++;
                            if (webContentUtils.hasTooManyZipEntries(i)) {
                                zipInputStream.close();
                                return false;
                            }
                            str = unpackDirectory;
                            try {
                                j = webContentUtils.unpackZipEntry(str, zipInputStream, nextEntry, j);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    Utf8.closeFinally(zipInputStream, th2);
                                    throw th3;
                                }
                            }
                        }
                        zipInputStream.closeEntry();
                        nextEntry = zipInputStream.getNextEntry();
                        unpackDirectory = str;
                    }
                    zipInputStream.close();
                    return true;
                } catch (Throwable th4) {
                    th = th4;
                    str = unpackDirectory;
                }
            } catch (Throwable th5) {
                th = th5;
                str = unpackDirectory;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, th, false, (Function0) new t7$$ExternalSyntheticLambda4(18, zipFile, str), 4, (Object) null);
                return false;
            }
        } catch (Throwable th6) {
            th = th6;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) INSTANCE, BrazeLogger.Priority.E, th, false, (Function0) new t7$$ExternalSyntheticLambda4(18, zipFile, str), 4, (Object) null);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$0() {
        return "Unpack directory is blank. Zip file not unpacked.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String unpackZipIntoDirectory$lambda$2(File file, String str) {
        return Boxes$$ExternalSyntheticOutline1.m("Error during unpack of zip file ", file.getAbsolutePath(), " to ", str, ".");
    }

    public static final String validateChildFileExistsUnderParent(String intendedParentDirectory, String childFilePath) {
        intendedParentDirectory.getClass();
        childFilePath.getClass();
        String canonicalPath = new File(intendedParentDirectory).getCanonicalPath();
        String canonicalPath2 = new File(childFilePath).getCanonicalPath();
        canonicalPath2.getClass();
        if (StringsKt__StringsJVMKt.startsWith(canonicalPath2, canonicalPath + File.separator, false)) {
            return canonicalPath2;
        }
        a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Invalid file with original path: ", childFilePath, " with canonical path: ", canonicalPath2, " does not exist under intended parent with  path: "), intendedParentDirectory, " and canonical path: ", canonicalPath));
        return null;
    }
}
