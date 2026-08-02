package ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream;

import androidx.lifecycle.v;
import defpackage.ar7;
import defpackage.bvf0;
import defpackage.d6z;
import defpackage.e70;
import defpackage.g6u;
import defpackage.g70;
import defpackage.iq7;
import defpackage.m94;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ody;
import defpackage.qp7;
import defpackage.r1s;
import defpackage.s6k0;
import defpackage.s8v;
import defpackage.sjh;
import defpackage.sls;
import defpackage.tje;
import defpackage.tob1;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.concurrent.Executor;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a {
    public final tt2 a;
    public volatile boolean c;
    public v d;
    public final r0 b = bvf0.c(null);
    public sls e = m94.c;

    public a(tt2 tt2Var, boolean z) {
        this.a = tt2Var;
        this.c = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        CameraControlRepository$disableTorch$1 cameraControlRepository$disableTorch$1;
        int i;
        qp7 b;
        if (continuationImpl instanceof CameraControlRepository$disableTorch$1) {
            cameraControlRepository$disableTorch$1 = (CameraControlRepository$disableTorch$1) continuationImpl;
            int i2 = cameraControlRepository$disableTorch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraControlRepository$disableTorch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraControlRepository$disableTorch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraControlRepository$disableTorch$1.label;
                if (i != 0) {
                    b.b(obj);
                    cameraControlRepository$disableTorch$1.label = 1;
                    obj = e.y(new mth(this.b, 6), cameraControlRepository$disableTorch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                iq7 iq7Var = (iq7) obj;
                iq7Var.getClass();
                tob1.b();
                ody odyVar = iq7Var.s;
                b = odyVar != null ? odyVar.b() : null;
                if (b != null) {
                    ((e70) b).f(false);
                }
                return zy11.a;
            }
        }
        cameraControlRepository$disableTorch$1 = new CameraControlRepository$disableTorch$1(this, continuationImpl);
        Object obj2 = cameraControlRepository$disableTorch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraControlRepository$disableTorch$1.label;
        if (i != 0) {
        }
        iq7 iq7Var2 = (iq7) obj2;
        iq7Var2.getClass();
        tob1.b();
        ody odyVar2 = iq7Var2.s;
        if (odyVar2 != null) {
        }
        if (b != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        CameraControlRepository$enableImageAnalysis$1 cameraControlRepository$enableImageAnalysis$1;
        int i;
        if (continuationImpl instanceof CameraControlRepository$enableImageAnalysis$1) {
            cameraControlRepository$enableImageAnalysis$1 = (CameraControlRepository$enableImageAnalysis$1) continuationImpl;
            int i2 = cameraControlRepository$enableImageAnalysis$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraControlRepository$enableImageAnalysis$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraControlRepository$enableImageAnalysis$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraControlRepository$enableImageAnalysis$1.label;
                if (i != 0) {
                    b.b(obj);
                    this.c = true;
                    this.a.getClass();
                    sjh sjhVar = uyj.a;
                    g6u g6uVar = o400.a;
                    CameraControlRepository$enableImageAnalysis$2 cameraControlRepository$enableImageAnalysis$2 = new CameraControlRepository$enableImageAnalysis$2(null, this);
                    cameraControlRepository$enableImageAnalysis$1.label = 1;
                    if (tje.k0(g6uVar, cameraControlRepository$enableImageAnalysis$2, cameraControlRepository$enableImageAnalysis$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return zy11.a;
            }
        }
        cameraControlRepository$enableImageAnalysis$1 = new CameraControlRepository$enableImageAnalysis$1(this, continuationImpl);
        Object obj2 = cameraControlRepository$enableImageAnalysis$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraControlRepository$enableImageAnalysis$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        CameraControlRepository$enableTorch$1 cameraControlRepository$enableTorch$1;
        int i;
        qp7 b;
        if (continuationImpl instanceof CameraControlRepository$enableTorch$1) {
            cameraControlRepository$enableTorch$1 = (CameraControlRepository$enableTorch$1) continuationImpl;
            int i2 = cameraControlRepository$enableTorch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraControlRepository$enableTorch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraControlRepository$enableTorch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraControlRepository$enableTorch$1.label;
                if (i != 0) {
                    b.b(obj);
                    cameraControlRepository$enableTorch$1.label = 1;
                    obj = e.y(new mth(this.b, 6), cameraControlRepository$enableTorch$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                iq7 iq7Var = (iq7) obj;
                iq7Var.getClass();
                tob1.b();
                ody odyVar = iq7Var.s;
                b = odyVar != null ? odyVar.b() : null;
                if (b != null) {
                    ((e70) b).f(true);
                }
                return zy11.a;
            }
        }
        cameraControlRepository$enableTorch$1 = new CameraControlRepository$enableTorch$1(this, continuationImpl);
        Object obj2 = cameraControlRepository$enableTorch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraControlRepository$enableTorch$1.label;
        if (i != 0) {
        }
        iq7 iq7Var2 = (iq7) obj2;
        iq7Var2.getClass();
        tob1.b();
        ody odyVar2 = iq7Var2.s;
        if (odyVar2 != null) {
        }
        if (b != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        CameraControlRepository$hasFlashUnit$1 cameraControlRepository$hasFlashUnit$1;
        int i;
        if (continuationImpl instanceof CameraControlRepository$hasFlashUnit$1) {
            cameraControlRepository$hasFlashUnit$1 = (CameraControlRepository$hasFlashUnit$1) continuationImpl;
            int i2 = cameraControlRepository$hasFlashUnit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraControlRepository$hasFlashUnit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraControlRepository$hasFlashUnit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraControlRepository$hasFlashUnit$1.label;
                if (i != 0) {
                    b.b(obj);
                    cameraControlRepository$hasFlashUnit$1.label = 1;
                    obj = e.y(new mth(this.b, 6), cameraControlRepository$hasFlashUnit$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                iq7 iq7Var = (iq7) obj;
                iq7Var.getClass();
                tob1.b();
                ody odyVar = iq7Var.s;
                ar7 c = odyVar != null ? odyVar.c() : null;
                return Boolean.valueOf(c == null && ((g70) c).p());
            }
        }
        cameraControlRepository$hasFlashUnit$1 = new CameraControlRepository$hasFlashUnit$1(this, continuationImpl);
        Object obj2 = cameraControlRepository$hasFlashUnit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraControlRepository$hasFlashUnit$1.label;
        if (i != 0) {
        }
        iq7 iq7Var2 = (iq7) obj2;
        iq7Var2.getClass();
        tob1.b();
        ody odyVar2 = iq7Var2.s;
        if (odyVar2 != null) {
        }
        return Boolean.valueOf(c == null && ((g70) c).p());
    }

    public final void e(r1s r1sVar, Executor executor, s6k0 s6k0Var) {
        iq7 iq7Var = (iq7) this.b.getValue();
        if (iq7Var != null) {
            tob1.b();
            d6z.y("Camera not initialized.", iq7Var.l());
            tob1.b();
            d6z.y("ImageCapture disabled.", (iq7Var.b & 1) != 0);
            tob1.b();
            if (iq7Var.e.J() == 3 && (iq7Var.h() == null || iq7Var.h().b == null)) {
                ny61.r("No window set in PreviewView despite setting FLASH_MODE_SCREEN");
                return;
            }
            if (iq7Var.a.b() != null) {
                s8v s8vVar = (s8v) r1sVar.w;
                if (!s8vVar.b) {
                    s8vVar.a = iq7Var.a.b().intValue() == 0;
                    s8vVar.b = true;
                }
            }
            iq7Var.e.O(r1sVar, executor, s6k0Var);
        }
    }
}
