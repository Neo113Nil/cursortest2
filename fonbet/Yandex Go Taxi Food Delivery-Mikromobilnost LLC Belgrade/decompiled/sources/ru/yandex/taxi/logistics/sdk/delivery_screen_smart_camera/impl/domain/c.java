package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import defpackage.bvf0;
import defpackage.czh;
import defpackage.gci0;
import defpackage.gp7;
import defpackage.h3y;
import defpackage.hp7;
import defpackage.ike;
import defpackage.ip7;
import defpackage.kt7;
import defpackage.ny61;
import defpackage.nys0;
import defpackage.oq7;
import defpackage.pzt0;
import defpackage.qv10;
import defpackage.qys0;
import defpackage.rys0;
import defpackage.so7;
import defpackage.st2;
import defpackage.sys0;
import defpackage.tje;
import defpackage.tys0;
import defpackage.w511;
import defpackage.wxs0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class c {
    public final oq7 a;
    public final h3y b;
    public final st2 c;
    public ike d;
    public pzt0 e;
    public kt7 f;
    public nys0 g;
    public boolean h;
    public final r0 i;
    public final gci0 j;

    public c(oq7 oq7Var, h3y h3yVar, st2 st2Var) {
        this.a = oq7Var;
        this.b = h3yVar;
        this.c = st2Var;
        r0 c = bvf0.c(sys0.a);
        this.i = c;
        this.j = e.d(c);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(c cVar, ContinuationImpl continuationImpl) {
        CameraManagerImpl$waitForDelayToComplete$1 cameraManagerImpl$waitForDelayToComplete$1;
        int i;
        cVar.getClass();
        if (continuationImpl instanceof CameraManagerImpl$waitForDelayToComplete$1) {
            cameraManagerImpl$waitForDelayToComplete$1 = (CameraManagerImpl$waitForDelayToComplete$1) continuationImpl;
            int i2 = cameraManagerImpl$waitForDelayToComplete$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cameraManagerImpl$waitForDelayToComplete$1.label = i2 - Integer.MIN_VALUE;
                Object obj = cameraManagerImpl$waitForDelayToComplete$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cameraManagerImpl$waitForDelayToComplete$1.label;
                if (i == 0 && i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                while (cVar.h) {
                    cameraManagerImpl$waitForDelayToComplete$1.label = 1;
                    if (kotlinx.coroutines.a.i(100L, cameraManagerImpl$waitForDelayToComplete$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11.a;
            }
        }
        cameraManagerImpl$waitForDelayToComplete$1 = new CameraManagerImpl$waitForDelayToComplete$1(cVar, continuationImpl);
        Object obj2 = cameraManagerImpl$waitForDelayToComplete$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cameraManagerImpl$waitForDelayToComplete$1.label;
        if (i == 0) {
        }
        kotlin.b.b(obj2);
        while (cVar.h) {
        }
        return zy11.a;
    }

    public final void b() {
        czh czhVar;
        kt7 kt7Var = this.f;
        if (kt7Var != null) {
            kt7Var.c(wxs0.a);
        }
        kt7 kt7Var2 = this.f;
        if (kt7Var2 != null) {
            kt7Var2.b();
        }
        nys0 nys0Var = this.g;
        if (nys0Var != null && (czhVar = nys0Var.c) != null) {
            czhVar.dismiss();
        }
        this.g = null;
        this.f = null;
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.e = null;
        ike ikeVar = this.d;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.d = null;
        this.h = false;
    }

    public final void c() {
        tys0 tys0Var;
        gci0 a;
        kt7 kt7Var = this.f;
        if (kt7Var == null || (a = kt7Var.a()) == null || (tys0Var = (tys0) a.a.getValue()) == null) {
            tys0Var = (tys0) this.j.a.getValue();
        }
        if (tys0Var instanceof rys0) {
            b();
            return;
        }
        if (!(tys0Var instanceof qys0)) {
            if (tys0Var instanceof sys0) {
                return;
            }
            w511.b();
        } else {
            if (((qys0) tys0Var).c != null) {
                b();
                return;
            }
            ike ikeVar = this.d;
            if (ikeVar != null) {
                tje.N(ikeVar, null, null, new CameraManagerImpl$onOverCameraModalViewDismiss$1(this, null), 3);
            }
        }
    }

    public final void d() {
        if (this.h) {
            return;
        }
        ike ikeVar = this.d;
        if (ikeVar != null) {
            bvf0.j(ikeVar, null);
        }
        this.d = qv10.e(this.c.a);
        pzt0 pzt0Var = this.e;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        r0 r0Var = this.i;
        r0Var.getClass();
        r0Var.m(null, sys0.a);
        this.h = true;
        ike ikeVar2 = this.d;
        if (ikeVar2 != null) {
            tje.N(ikeVar2, null, null, new CameraManagerImpl$startLoadingDelay$1(this, null), 3);
        }
        kt7 kt7Var = this.f;
        if (kt7Var != null) {
            kt7Var.c(wxs0.a);
        }
        kt7 kt7Var2 = this.f;
        if (kt7Var2 != null) {
            kt7Var2.b();
        }
    }

    public final void e(ip7 ip7Var, so7 so7Var) {
        kt7 kt7Var;
        d();
        boolean z = ip7Var instanceof hp7;
        oq7 oq7Var = this.a;
        if (z) {
            kt7Var = (kt7) oq7Var.a.get();
        } else {
            if (!(ip7Var instanceof gp7)) {
                w511.b();
                return;
            }
            kt7Var = (kt7) oq7Var.b.get();
        }
        kt7 kt7Var2 = kt7Var;
        this.f = kt7Var2;
        ike ikeVar = this.d;
        if (ikeVar != null) {
            tje.N(ikeVar, null, null, new CameraManagerImpl$switchCameraType$1(ip7Var, kt7Var2, so7Var, this, null), 3);
        }
    }
}
