package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain;

import android.graphics.Bitmap;
import com.yandex.go.litert.api.config.LiteRtImageResizeMode;
import defpackage.aan0;
import defpackage.evu0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.jdv;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u9n0;
import defpackage.uyj;
import defpackage.v9n0;
import defpackage.vuy;
import defpackage.wuy;
import defpackage.xuy;
import defpackage.y9n0;
import defpackage.zgz;
import defpackage.zuo0;
import defpackage.zy11;
import java.io.File;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model.ScootersVehicleDetectionOnPhotoExperiment;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionFrameResult;

/* loaded from: classes6.dex */
public final class c {
    public final tt2 a;
    public final wuy b;
    public final aan0 c;
    public final e d;
    public final kotlinx.coroutines.sync.a e = gtq0.a();
    public u9n0 f;
    public v9n0 g;
    public String h;

    public c(tt2 tt2Var, wuy wuyVar, aan0 aan0Var, e eVar) {
        this.a = tt2Var;
        this.b = wuyVar;
        this.c = aan0Var;
        this.d = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0052, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r2v3, types: [g050] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.c] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1 scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zy11 zy11Var;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        cVar.getClass();
        try {
            if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1) {
                scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1 = (ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1) continuationImpl;
                int i2 = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label;
                    zy11Var = zy11.a;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        aVar = cVar.e;
                        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.L$0 = aVar;
                        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                g050Var.d(null);
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.L$0 = aVar;
                    scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label = 2;
                    cVar.d(scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1);
                    if (zy11Var != coroutineSingletons) {
                        g050Var = aVar;
                        g050Var.d(null);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.L$0 = aVar;
            scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label = 2;
            cVar.d(scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1);
            if (zy11Var != coroutineSingletons) {
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1(cVar, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifier$1.label;
        zy11Var = zy11.a;
        if (i != 0) {
        }
    }

    public static final void b(c cVar, jdv jdvVar) {
        cVar.getClass();
        try {
            jdvVar.close();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            zgz.a("Failed to close completion photo vehicle detection frame", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum c(c cVar, jdv jdvVar, ScootersVehicleDetectionOnPhotoExperiment.b bVar, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1 scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1;
        Object obj;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1) {
            scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1 = (ScootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1) continuationImpl;
            int i2 = scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    File b = cVar.c.b(bVar.a);
                    if (!b.isFile()) {
                        if (!jl40.l(cVar.h, "Completion photo vehicle detection model file is missing during inference")) {
                            cVar.h = "Completion photo vehicle detection model file is missing during inference";
                            zgz.a("Completion photo vehicle detection model file is missing during inference", new IllegalStateException());
                        }
                        return ScootersCompletionPhotoVehicleDetectionFrameResult.Unavailable;
                    }
                    scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.L$0 = jdvVar;
                    scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.L$1 = null;
                    scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.L$2 = null;
                    scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.label = 1;
                    obj = cVar.e(b, bVar, scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Bitmap bitmap = (Bitmap) scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.L$4;
                        if (scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.L$3 != null) {
                            ny61.u();
                            return null;
                        }
                        try {
                            try {
                                try {
                                    kotlin.b.b(obj);
                                    if (obj == null) {
                                        throw null;
                                    }
                                    throw new ClassCastException();
                                } catch (CancellationException e) {
                                    throw e;
                                }
                            } catch (Throwable th) {
                                zgz.a("Completion photo vehicle detection inference failed", th);
                                ScootersCompletionPhotoVehicleDetectionFrameResult scootersCompletionPhotoVehicleDetectionFrameResult = ScootersCompletionPhotoVehicleDetectionFrameResult.Unavailable;
                                bitmap.recycle();
                                return scootersCompletionPhotoVehicleDetectionFrameResult;
                            }
                        } catch (Throwable th2) {
                            bitmap.recycle();
                            throw th2;
                        }
                    }
                    kotlin.b.b(obj);
                }
                if (obj == null) {
                    ny61.u();
                    return null;
                }
                if (!jl40.l(cVar.h, "Completion photo vehicle detection classifier could not be opened")) {
                    cVar.h = "Completion photo vehicle detection classifier could not be opened";
                    zgz.a("Completion photo vehicle detection classifier could not be opened", new IllegalStateException());
                }
                return ScootersCompletionPhotoVehicleDetectionFrameResult.Unavailable;
            }
        }
        scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1(cVar, continuationImpl);
        obj = scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionInteractor$detectVehicleInFrame$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zy11 d(ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1 scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1;
        int i;
        zy11 zy11Var;
        try {
            try {
                if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1) {
                    scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1 = (ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1) continuationImpl;
                    int i2 = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.label = i2 - Integer.MIN_VALUE;
                        Object obj = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.label;
                        zy11Var = zy11.a;
                        if (i == 0) {
                            if (i != 1) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        kotlin.b.b(obj);
                        if (this.f == null) {
                            return zy11Var;
                        }
                        this.f = null;
                        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.L$0 = null;
                        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.label = 1;
                        throw null;
                    }
                }
                if (i == 0) {
                }
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            zgz.a("Failed to close completion photo vehicle detection classifier", th);
            return zy11Var;
        }
        scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionInteractor$closeCachedClassifierLocked$1.label;
        zy11Var = zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x009c, code lost:
    
        if (r9.a(r2) == r3) goto L56;
     */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x0070: MOVE (r4 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]), block:B:71:0x0070 */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014d A[Catch: all -> 0x004d, TryCatch #0 {all -> 0x004d, blocks: (B:14:0x0042, B:15:0x0134, B:18:0x013c, B:23:0x0147, B:24:0x014c, B:25:0x014d, B:28:0x015a), top: B:13:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f6 A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:35:0x006a, B:36:0x00ea, B:38:0x00f6, B:42:0x0108, B:43:0x0116, B:47:0x010b, B:48:0x0110, B:49:0x0111, B:50:0x0114, B:51:0x0164, B:52:0x016b, B:54:0x00a0, B:56:0x00b9, B:57:0x00bd, B:59:0x00c3, B:60:0x00c8, B:63:0x00d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0164 A[Catch: all -> 0x006f, TRY_ENTER, TryCatch #1 {all -> 0x006f, blocks: (B:35:0x006a, B:36:0x00ea, B:38:0x00f6, B:42:0x0108, B:43:0x0116, B:47:0x010b, B:48:0x0110, B:49:0x0111, B:50:0x0114, B:51:0x0164, B:52:0x016b, B:54:0x00a0, B:56:0x00b9, B:57:0x00bd, B:59:0x00c3, B:60:0x00c8, B:63:0x00d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b9 A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:35:0x006a, B:36:0x00ea, B:38:0x00f6, B:42:0x0108, B:43:0x0116, B:47:0x010b, B:48:0x0110, B:49:0x0111, B:50:0x0114, B:51:0x0164, B:52:0x016b, B:54:0x00a0, B:56:0x00b9, B:57:0x00bd, B:59:0x00c3, B:60:0x00c8, B:63:0x00d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3 A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:35:0x006a, B:36:0x00ea, B:38:0x00f6, B:42:0x0108, B:43:0x0116, B:47:0x010b, B:48:0x0110, B:49:0x0111, B:50:0x0114, B:51:0x0164, B:52:0x016b, B:54:0x00a0, B:56:0x00b9, B:57:0x00bd, B:59:0x00c3, B:60:0x00c8, B:63:0x00d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c8 A[Catch: all -> 0x006f, TryCatch #1 {all -> 0x006f, blocks: (B:35:0x006a, B:36:0x00ea, B:38:0x00f6, B:42:0x0108, B:43:0x0116, B:47:0x010b, B:48:0x0110, B:49:0x0111, B:50:0x0114, B:51:0x0164, B:52:0x016b, B:54:0x00a0, B:56:0x00b9, B:57:0x00bd, B:59:0x00c3, B:60:0x00c8, B:63:0x00d2), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons e(File file, ScootersVehicleDetectionOnPhotoExperiment.b bVar, ContinuationImpl continuationImpl) {
        ScootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1 scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1;
        int i;
        g050 g050Var;
        g050 g050Var2;
        File file2;
        ScootersVehicleDetectionOnPhotoExperiment.b bVar2;
        g050 g050Var3;
        v9n0 v9n0Var;
        u9n0 u9n0Var;
        ScootersVehicleDetectionOnPhotoExperiment.b bVar3;
        v9n0 v9n0Var2;
        File file3;
        Object a;
        v9n0 v9n0Var3;
        Throwable a2;
        try {
            if (continuationImpl instanceof ScootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1) {
                scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1 = (ScootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1) continuationImpl;
                int i2 = scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        file2 = file;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$0 = file2;
                        bVar2 = bVar;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$1 = bVar2;
                        g050Var3 = this.e;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$2 = g050Var3;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                v9n0Var3 = (v9n0) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$3;
                                g050Var2 = (g050) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$2;
                                try {
                                    kotlin.b.b(obj);
                                    a = ((Result) obj).getValue();
                                    a2 = Result.a(a);
                                    if (a2 == null) {
                                        this.g = v9n0Var3;
                                        if (!jl40.l(this.h, "Failed to open completion photo vehicle detection classifier")) {
                                            this.h = "Failed to open completion photo vehicle detection classifier";
                                            zgz.a("Failed to open completion photo vehicle detection classifier", a2);
                                        }
                                    } else {
                                        if (a != null) {
                                            throw new ClassCastException();
                                        }
                                        this.g = null;
                                        this.f = new u9n0(v9n0Var3);
                                    }
                                    g050Var3 = g050Var2;
                                    g050Var3.d(null);
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    g050Var2.d(null);
                                    throw th;
                                }
                            }
                            v9n0Var2 = (v9n0) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$3;
                            g050Var3 = (g050) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$2;
                            bVar3 = (ScootersVehicleDetectionOnPhotoExperiment.b) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$1;
                            file3 = (File) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$0;
                            kotlin.b.b(obj);
                            wuy wuyVar = this.b;
                            if (!evu0.J(file3.getPath())) {
                                throw new IllegalArgumentException("file path must not be blank");
                            }
                            int i3 = y9n0.a[bVar3.d.ordinal()];
                            if (i3 == 1) {
                                LiteRtImageResizeMode liteRtImageResizeMode = LiteRtImageResizeMode.RESIZE;
                            } else if (i3 == 2) {
                                LiteRtImageResizeMode liteRtImageResizeMode2 = LiteRtImageResizeMode.RESIZE;
                            } else {
                                if (i3 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                LiteRtImageResizeMode liteRtImageResizeMode3 = LiteRtImageResizeMode.RESIZE;
                            }
                            int i4 = vuy.a;
                            xuy xuyVar = new xuy();
                            scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$0 = null;
                            scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$1 = null;
                            scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$2 = g050Var3;
                            scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$3 = v9n0Var2;
                            scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$4 = null;
                            scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label = 3;
                            a = ((com.yandex.go.litert.classification.a) wuyVar).a(file3, xuyVar, "scooters_completion_photo_vehicle_detection", scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1);
                            if (a != coroutineSingletons) {
                                v9n0Var3 = v9n0Var2;
                                g050Var2 = g050Var3;
                                a2 = Result.a(a);
                                if (a2 == null) {
                                }
                                g050Var3 = g050Var2;
                                g050Var3.d(null);
                                return null;
                            }
                            return coroutineSingletons;
                        }
                        g050 g050Var4 = (g050) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$2;
                        ScootersVehicleDetectionOnPhotoExperiment.b bVar4 = (ScootersVehicleDetectionOnPhotoExperiment.b) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$1;
                        File file4 = (File) scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$0;
                        kotlin.b.b(obj);
                        g050Var3 = g050Var4;
                        bVar2 = bVar4;
                        file2 = file4;
                    }
                    v9n0Var = new v9n0(file2.getAbsolutePath(), file2.length(), file2.lastModified(), bVar2.d);
                    u9n0Var = this.f;
                    if (!jl40.l(u9n0Var == null ? u9n0Var.a : null, v9n0Var)) {
                        u9n0Var.getClass();
                    } else if (!jl40.l(this.g, v9n0Var)) {
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$0 = file2;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$1 = bVar2;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$2 = g050Var3;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$3 = v9n0Var;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.L$4 = null;
                        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label = 2;
                        d(scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1);
                        if (zy11.a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        bVar3 = bVar2;
                        v9n0Var2 = v9n0Var;
                        file3 = file2;
                        wuy wuyVar2 = this.b;
                        if (!evu0.J(file3.getPath())) {
                        }
                    }
                    g050Var3.d(null);
                    return null;
                }
            }
            if (i != 0) {
            }
            v9n0Var = new v9n0(file2.getAbsolutePath(), file2.length(), file2.lastModified(), bVar2.d);
            u9n0Var = this.f;
            if (!jl40.l(u9n0Var == null ? u9n0Var.a : null, v9n0Var)) {
            }
            g050Var3.d(null);
            return null;
        } catch (Throwable th2) {
            th = th2;
            g050Var2 = g050Var;
        }
        scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1 = new ScootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1(this, continuationImpl);
        Object obj2 = scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCompletionPhotoVehicleDetectionInteractor$getOrOpenClassifier$1.label;
    }

    public final tpr f(ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar, zuo0 zuo0Var) {
        tpr t = kotlinx.coroutines.flow.e.t(new rol0(new ScootersCompletionPhotoVehicleDetectionInteractor$vehicleDetectionStateFlow$1(this, zuo0Var, aVar, null)));
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(t, uyj.a);
    }
}
