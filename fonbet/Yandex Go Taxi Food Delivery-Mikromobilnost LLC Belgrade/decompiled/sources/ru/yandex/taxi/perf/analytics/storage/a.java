package ru.yandex.taxi.perf.analytics.storage;

import android.content.Context;
import android.support.v4.media.session.PlaybackStateCompat;
import defpackage.ac20;
import defpackage.b64;
import defpackage.c2r;
import defpackage.cne0;
import defpackage.dne0;
import defpackage.f22;
import defpackage.gw00;
import defpackage.h3r;
import defpackage.j73;
import defpackage.jbh;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.s5r;
import defpackage.t1b0;
import defpackage.unr0;
import defpackage.zy11;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FileWalkDirection;
import ru.yandex.taxi.analytics.q;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;

/* loaded from: classes9.dex */
public final class a {
    public final Context a;
    public final jtq0 b;
    public final ac20 c;
    public final dne0 d;
    public final t1b0 e;

    public a(rqo rqoVar, Context context, jtq0 jtq0Var, ac20 ac20Var, dne0 dne0Var) {
        this.a = context;
        this.b = jtq0Var;
        this.c = ac20Var;
        this.d = dne0Var;
        this.e = ((jbh) rqoVar).f(SimplePersistentBooleanExperiment.STORAGE_PERFORMANCE_ANALYTICS);
    }

    public static long d(HashMap hashMap, File file, String str) {
        Pair pair;
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            listFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        long j = 0;
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                s5r s5rVar = new s5r(kotlin.sequences.b.g(h3r.i(file2, FileWalkDirection.TOP_DOWN), AppStorageAnalytics$scanDirectory$dirs$1$size$1.b));
                long j2 = 0;
                while (s5rVar.hasNext()) {
                    j2 = ((File) s5rVar.next()).length() + j2;
                }
                j += j2;
                pair = new Pair(b64.j(str, file2.getName()), Long.valueOf((j2 + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
            } else {
                if (file2.isFile()) {
                    j += file2.length();
                }
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        kotlin.collections.b.p(hashMap, arrayList);
        long j3 = (1048575 + j) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        hashMap.put(str.concat("TOTAL"), Long.valueOf(j3));
        unr0.C(new Object[]{str, Long.valueOf(j3), kotlin.collections.a.X(arrayList, "\n", null, null, new f22(21), 30)}, 3, "AppFilesAllocations of %s (total = %sMB):\n%s", jst.e);
        return j;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        AppStorageAnalytics$analyzeAndSendAsync$1 appStorageAnalytics$analyzeAndSendAsync$1;
        Object obj;
        int i;
        if (continuationImpl instanceof AppStorageAnalytics$analyzeAndSendAsync$1) {
            appStorageAnalytics$analyzeAndSendAsync$1 = (AppStorageAnalytics$analyzeAndSendAsync$1) continuationImpl;
            int i2 = appStorageAnalytics$analyzeAndSendAsync$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                appStorageAnalytics$analyzeAndSendAsync$1.label = i2 - Integer.MIN_VALUE;
                obj = appStorageAnalytics$analyzeAndSendAsync$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = appStorageAnalytics$analyzeAndSendAsync$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    try {
                        b();
                    } catch (Throwable th) {
                        jst.e.k(th, "Unable to analyze cache emptiness");
                    }
                    appStorageAnalytics$analyzeAndSendAsync$1.label = 1;
                    obj = this.e.b(appStorageAnalytics$analyzeAndSendAsync$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    try {
                        c();
                    } catch (Throwable th2) {
                        jst.e.k(th2, "Unable to analyze storage use");
                    }
                }
                return zy11.a;
            }
        }
        appStorageAnalytics$analyzeAndSendAsync$1 = new AppStorageAnalytics$analyzeAndSendAsync$1(this, continuationImpl);
        obj = appStorageAnalytics$analyzeAndSendAsync$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = appStorageAnalytics$analyzeAndSendAsync$1.label;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
        return zy11.a;
    }

    public final void b() {
        File cacheDir = this.a.getCacheDir();
        cne0 a = this.d.a("cache_emptiness");
        long d = this.b.d();
        c2r c2rVar = new c2r(h3r.i(cacheDir, FileWalkDirection.TOP_DOWN));
        while (c2rVar.hasNext()) {
            if (((File) c2rVar.next()).isFile()) {
                a.q(d, "non_empty_cache_last_time");
                return;
            }
        }
        long j = a.j("non_empty_cache_last_time", 0L);
        if (j <= 0) {
            return;
        }
        a.w("non_empty_cache_last_time");
        ((q) this.c).h("performance.AppCacheMissReceived", gw00.e(new Pair("days", Long.valueOf((d - j) / 86400000))));
    }

    public final void c() {
        Context context = this.a;
        File filesDir = context.getFilesDir();
        File cacheDir = context.getCacheDir();
        File noBackupFilesDir = context.getNoBackupFilesDir();
        HashMap hashMap = new HashMap();
        long d = d(hashMap, noBackupFilesDir, "no_backup/") + d(hashMap, cacheDir, "cache/") + d(hashMap, filesDir, "files/");
        final Set f0 = j73.f0(new File[]{filesDir, cacheDir, noBackupFilesDir});
        File[] listFiles = context.getDataDir().listFiles(new FileFilter() { // from class: py2
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                return file.isDirectory() && !f0.contains(file);
            }
        });
        if (listFiles == null) {
            listFiles = new File[0];
        }
        long j = 0;
        for (File file : listFiles) {
            j += d(hashMap, file, "data/" + file.getName() + "/");
        }
        long j2 = d + j;
        File[] externalFilesDirs = context.getExternalFilesDirs(null);
        if (externalFilesDirs == null) {
            externalFilesDirs = new File[0];
        }
        for (File file2 : j73.A(externalFilesDirs)) {
            j2 += d(hashMap, file2, "ext/" + file2.getName() + "/");
        }
        File[] externalCacheDirs = context.getExternalCacheDirs();
        if (externalCacheDirs == null) {
            externalCacheDirs = new File[0];
        }
        for (File file3 : j73.A(externalCacheDirs)) {
            j2 += d(hashMap, file3, "ext_cache/" + file3.getName() + "/");
        }
        File[] externalMediaDirs = context.getExternalMediaDirs();
        if (externalMediaDirs == null) {
            externalMediaDirs = new File[0];
        }
        for (File file4 : j73.A(externalMediaDirs)) {
            j2 += d(hashMap, file4, "ext_media/" + file4.getName() + "/");
        }
        long j3 = (j2 + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
        hashMap.put("TOTAL", Long.valueOf(j3));
        ((q) this.c).h("performance.AppFilesAllocation", hashMap);
        unr0.C(new Object[]{Long.valueOf(j3)}, 1, "AppFilesAllocation total = %sMB", jst.e);
    }
}
