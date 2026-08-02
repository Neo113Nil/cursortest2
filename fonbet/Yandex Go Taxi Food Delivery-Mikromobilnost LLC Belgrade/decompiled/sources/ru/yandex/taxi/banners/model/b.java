package ru.yandex.taxi.banners.model;

import defpackage.at3;
import defpackage.bvf0;
import defpackage.fb7;
import defpackage.fuc;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ike;
import defpackage.iux0;
import defpackage.jl40;
import defpackage.ltc;
import defpackage.mdh;
import defpackage.noh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yu0;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class b {
    public final fuc a;
    public final fb7 b;
    public final ltc c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final ike e;
    public final kotlinx.coroutines.sync.a f;

    public b(tt2 tt2Var, fuc fucVar, fb7 fb7Var, ltc ltcVar) {
        this.a = fucVar;
        this.b = fb7Var;
        this.c = ltcVar;
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.e = bvf0.a(mdh.b.plus(jl40.a()));
        this.f = gtq0.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068 A[Catch: all -> 0x006d, LOOP:0: B:18:0x0062->B:20:0x0068, LOOP_END, TRY_LEAVE, TryCatch #4 {all -> 0x006d, blocks: (B:17:0x0060, B:18:0x0062, B:20:0x0068), top: B:16:0x0060, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, ContinuationImpl continuationImpl) {
        BannerMediaLoader$createDownload$1 bannerMediaLoader$createDownload$1;
        int i;
        File b;
        BufferedInputStream bufferedInputStream;
        BufferedOutputStream bufferedOutputStream;
        byte[] bArr;
        int read;
        bVar.getClass();
        try {
            try {
                try {
                    if (continuationImpl instanceof BannerMediaLoader$createDownload$1) {
                        bannerMediaLoader$createDownload$1 = (BannerMediaLoader$createDownload$1) continuationImpl;
                        int i2 = bannerMediaLoader$createDownload$1.label;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            bannerMediaLoader$createDownload$1.label = i2 - Integer.MIN_VALUE;
                            Object obj = bannerMediaLoader$createDownload$1.result;
                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                            i = bannerMediaLoader$createDownload$1.label;
                            if (i != 0) {
                                kotlin.b.b(obj);
                                fuc fucVar = bVar.a;
                                bannerMediaLoader$createDownload$1.L$0 = null;
                                bannerMediaLoader$createDownload$1.label = 1;
                                obj = ((ru.yandex.taxi.communications.common.repository.a) fucVar).a(str, bannerMediaLoader$createDownload$1);
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
                            InputStream inputStream = (InputStream) obj;
                            b = bVar.b.b();
                            bufferedInputStream = new BufferedInputStream(inputStream);
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(b));
                            bArr = new byte[4096];
                            while (true) {
                                read = bufferedInputStream.read(bArr);
                                if (read > 0) {
                                    bufferedOutputStream.close();
                                    bufferedInputStream.close();
                                    return b;
                                }
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                        }
                    }
                    bArr = new byte[4096];
                    while (true) {
                        read = bufferedInputStream.read(bArr);
                        if (read > 0) {
                        }
                        bufferedOutputStream.write(bArr, 0, read);
                    }
                } finally {
                }
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(b));
            } finally {
            }
            bufferedInputStream = new BufferedInputStream(inputStream);
        } catch (IOException e) {
            if (b.exists()) {
                b.delete();
            }
            throw e;
        }
        bannerMediaLoader$createDownload$1 = new BannerMediaLoader$createDownload$1(bVar, continuationImpl);
        Object obj2 = bannerMediaLoader$createDownload$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannerMediaLoader$createDownload$1.label;
        if (i != 0) {
        }
        InputStream inputStream2 = (InputStream) obj2;
        b = bVar.b.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        BannerMediaLoader$cacheFileOrNull$1 bannerMediaLoader$cacheFileOrNull$1;
        int i;
        try {
            if (continuationImpl instanceof BannerMediaLoader$cacheFileOrNull$1) {
                bannerMediaLoader$cacheFileOrNull$1 = (BannerMediaLoader$cacheFileOrNull$1) continuationImpl;
                int i2 = bannerMediaLoader$cacheFileOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannerMediaLoader$cacheFileOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannerMediaLoader$cacheFileOrNull$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannerMediaLoader$cacheFileOrNull$1.label;
                    int i3 = 1;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.d.computeIfAbsent(str, new yu0(i3, new at3(19)));
                        noh nohVar = (noh) concurrentHashMap.computeIfAbsent(str2, new yu0(2, new a(this, str2)));
                        bannerMediaLoader$cacheFileOrNull$1.L$0 = null;
                        bannerMediaLoader$cacheFileOrNull$1.L$1 = str2;
                        bannerMediaLoader$cacheFileOrNull$1.L$2 = concurrentHashMap;
                        bannerMediaLoader$cacheFileOrNull$1.label = 1;
                        obj = nohVar.k(bannerMediaLoader$cacheFileOrNull$1);
                        str = concurrentHashMap;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) bannerMediaLoader$cacheFileOrNull$1.L$2;
                        str2 = (String) bannerMediaLoader$cacheFileOrNull$1.L$1;
                        kotlin.b.b(obj);
                        str = concurrentHashMap2;
                    }
                    return (File) obj;
                }
            }
            if (i != 0) {
            }
            return (File) obj;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            iux0 iux0Var = (iux0) this.c;
            iux0Var.getClass();
            iux0Var.c("Error downloading media file", th, "Error downloading media file " + str2, "CRITICAL");
            str.remove(str2);
            return null;
        }
        bannerMediaLoader$cacheFileOrNull$1 = new BannerMediaLoader$cacheFileOrNull$1(this, continuationImpl);
        Object obj2 = bannerMediaLoader$cacheFileOrNull$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannerMediaLoader$cacheFileOrNull$1.label;
        int i32 = 1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(2:10|11)(2:19|20))(2:21|(2:23|24)(2:25|(1:27)))|12|13|(1:15)|16))|32|6|7|(0)(0)|12|13|(0)|16) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002e, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0054, code lost:
    
        if ((r5 instanceof java.util.concurrent.CancellationException) != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(noh nohVar, ContinuationImpl continuationImpl) {
        BannerMediaLoader$deleteFile$1 bannerMediaLoader$deleteFile$1;
        int i;
        File file;
        if (continuationImpl instanceof BannerMediaLoader$deleteFile$1) {
            bannerMediaLoader$deleteFile$1 = (BannerMediaLoader$deleteFile$1) continuationImpl;
            int i2 = bannerMediaLoader$deleteFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bannerMediaLoader$deleteFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bannerMediaLoader$deleteFile$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bannerMediaLoader$deleteFile$1.label;
                zy11 zy11Var = zy11.a;
                file = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!nohVar.k0()) {
                        nohVar.a(null);
                        return zy11Var;
                    }
                    bannerMediaLoader$deleteFile$1.L$0 = null;
                    bannerMediaLoader$deleteFile$1.label = 1;
                    obj = nohVar.k(bannerMediaLoader$deleteFile$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                file = (File) obj;
                if (file != null) {
                    fb7.a(Collections.singletonList(file.getAbsolutePath()));
                }
                return zy11Var;
            }
        }
        bannerMediaLoader$deleteFile$1 = new BannerMediaLoader$deleteFile$1(this, continuationImpl);
        Object obj3 = bannerMediaLoader$deleteFile$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannerMediaLoader$deleteFile$1.label;
        zy11 zy11Var2 = zy11.a;
        file = null;
        if (i != 0) {
        }
        file = (File) obj3;
        if (file != null) {
        }
        return zy11Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x009b A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:12:0x0047, B:14:0x0095, B:16:0x009b, B:19:0x00b3, B:28:0x00ca, B:30:0x00d0, B:37:0x007e, B:41:0x008a), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #0 {all -> 0x004b, blocks: (B:12:0x0047, B:14:0x0095, B:16:0x009b, B:19:0x00b3, B:28:0x00ca, B:30:0x00d0, B:37:0x007e, B:41:0x008a), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0086 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008a A[Catch: all -> 0x004b, TRY_ENTER, TryCatch #0 {all -> 0x004b, blocks: (B:12:0x0047, B:14:0x0095, B:16:0x009b, B:19:0x00b3, B:28:0x00ca, B:30:0x00d0, B:37:0x007e, B:41:0x008a), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v0, types: [ru.yandex.taxi.banners.model.b] */
    /* JADX WARN: Type inference failed for: r11v5, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v1, types: [g050] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v4, types: [g050, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, Collection collection, ContinuationImpl continuationImpl) {
        BannerMediaLoader$removeDownloadsExcept$1 bannerMediaLoader$removeDownloadsExcept$1;
        int i;
        Collection collection2;
        kotlinx.coroutines.sync.a aVar;
        ConcurrentHashMap concurrentHashMap;
        String str2;
        Iterator it;
        Collection collection3;
        try {
            if (continuationImpl instanceof BannerMediaLoader$removeDownloadsExcept$1) {
                bannerMediaLoader$removeDownloadsExcept$1 = (BannerMediaLoader$removeDownloadsExcept$1) continuationImpl;
                int i2 = bannerMediaLoader$removeDownloadsExcept$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bannerMediaLoader$removeDownloadsExcept$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = bannerMediaLoader$removeDownloadsExcept$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bannerMediaLoader$removeDownloadsExcept$1.label;
                    zy11 zy11Var = zy11.a;
                    ConcurrentHashMap concurrentHashMap2 = this.d;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        bannerMediaLoader$removeDownloadsExcept$1.L$0 = str;
                        bannerMediaLoader$removeDownloadsExcept$1.L$1 = collection;
                        kotlinx.coroutines.sync.a aVar2 = this.f;
                        bannerMediaLoader$removeDownloadsExcept$1.L$2 = aVar2;
                        bannerMediaLoader$removeDownloadsExcept$1.label = 1;
                        if (aVar2.a(bannerMediaLoader$removeDownloadsExcept$1) != coroutineSingletons) {
                            collection2 = collection;
                            aVar = aVar2;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = (Iterator) bannerMediaLoader$removeDownloadsExcept$1.L$3;
                        g050 g050Var = (g050) bannerMediaLoader$removeDownloadsExcept$1.L$2;
                        collection3 = (Collection) bannerMediaLoader$removeDownloadsExcept$1.L$1;
                        str2 = (String) bannerMediaLoader$removeDownloadsExcept$1.L$0;
                        kotlin.b.b(obj);
                        collection = g050Var;
                        while (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            String str3 = (String) entry.getKey();
                            noh nohVar = (noh) entry.getValue();
                            if (!collection3.contains(str3)) {
                                bannerMediaLoader$removeDownloadsExcept$1.L$0 = str2;
                                bannerMediaLoader$removeDownloadsExcept$1.L$1 = collection3;
                                bannerMediaLoader$removeDownloadsExcept$1.L$2 = collection;
                                bannerMediaLoader$removeDownloadsExcept$1.L$3 = it;
                                bannerMediaLoader$removeDownloadsExcept$1.L$4 = null;
                                bannerMediaLoader$removeDownloadsExcept$1.L$5 = null;
                                bannerMediaLoader$removeDownloadsExcept$1.L$6 = null;
                                bannerMediaLoader$removeDownloadsExcept$1.label = 2;
                                if (c(nohVar, bannerMediaLoader$removeDownloadsExcept$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        if (collection3.isEmpty()) {
                            concurrentHashMap2.remove(str2);
                        }
                        return zy11Var;
                    }
                    ?? r11 = (g050) bannerMediaLoader$removeDownloadsExcept$1.L$2;
                    Collection collection4 = (Collection) bannerMediaLoader$removeDownloadsExcept$1.L$1;
                    String str4 = (String) bannerMediaLoader$removeDownloadsExcept$1.L$0;
                    kotlin.b.b(obj);
                    collection2 = collection4;
                    aVar = r11;
                    str = str4;
                    concurrentHashMap = (ConcurrentHashMap) concurrentHashMap2.get(str);
                    if (concurrentHashMap != null) {
                        return zy11Var;
                    }
                    str2 = str;
                    it = concurrentHashMap.entrySet().iterator();
                    collection3 = collection2;
                    collection = aVar;
                    while (it.hasNext()) {
                    }
                    if (collection3.isEmpty()) {
                    }
                    return zy11Var;
                }
            }
            if (i != 0) {
            }
            concurrentHashMap = (ConcurrentHashMap) concurrentHashMap2.get(str);
            if (concurrentHashMap != null) {
            }
        } finally {
            collection.d(null);
        }
        bannerMediaLoader$removeDownloadsExcept$1 = new BannerMediaLoader$removeDownloadsExcept$1(this, continuationImpl);
        Object obj2 = bannerMediaLoader$removeDownloadsExcept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bannerMediaLoader$removeDownloadsExcept$1.label;
        zy11 zy11Var2 = zy11.a;
        ConcurrentHashMap concurrentHashMap22 = this.d;
    }
}
