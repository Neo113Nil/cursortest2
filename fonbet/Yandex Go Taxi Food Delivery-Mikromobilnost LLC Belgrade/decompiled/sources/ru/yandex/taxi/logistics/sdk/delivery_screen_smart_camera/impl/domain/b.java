package ru.yandex.taxi.logistics.sdk.delivery_screen_smart_camera.impl.domain;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bvf0;
import defpackage.fzw;
import defpackage.g400;
import defpackage.gci0;
import defpackage.hp7;
import defpackage.ht10;
import defpackage.ike;
import defpackage.iys0;
import defpackage.jqr;
import defpackage.jys0;
import defpackage.kt7;
import defpackage.kys0;
import defpackage.lys0;
import defpackage.m33;
import defpackage.ny61;
import defpackage.o33;
import defpackage.pz40;
import defpackage.q8s;
import defpackage.rk6;
import defpackage.rys0;
import defpackage.s33;
import defpackage.st2;
import defpackage.sxs0;
import defpackage.sys0;
import defpackage.tje;
import defpackage.txs0;
import defpackage.uxs0;
import defpackage.vxs0;
import defpackage.vys0;
import defpackage.w511;
import defpackage.wxs0;
import defpackage.xxs0;
import defpackage.y670;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.j;

/* loaded from: classes5.dex */
public final class b implements kt7 {
    public final q8s a;
    public g400 b;
    public y670 c;
    public final ike d;
    public final r0 e;
    public final gci0 f;

    public b(q8s q8sVar, st2 st2Var) {
        this.a = q8sVar;
        this.d = bvf0.a(st2Var.a);
        r0 c = bvf0.c(sys0.a);
        this.e = c;
        this.f = e.d(c);
    }

    @Override // defpackage.kt7
    public final gci0 a() {
        return this.f;
    }

    @Override // defpackage.kt7
    public final void b() {
        bvf0.j(this.d, null);
    }

    @Override // defpackage.kt7
    public final void c(xxs0 xxs0Var) {
        s33 s33Var;
        s33 s33Var2;
        if (xxs0Var instanceof vxs0) {
            vxs0 vxs0Var = (vxs0) xxs0Var;
            if (vxs0Var instanceof sxs0) {
                g400 g400Var = this.b;
                if (g400Var != null) {
                    o33 o33Var = ((sxs0) xxs0Var).a;
                    m33 m33Var = new m33(o33Var.a, o33Var.b, o33Var.c);
                    s33 s33Var3 = g400Var.b;
                    if (s33Var3 != null) {
                        s33Var3.L = true;
                        s33Var3.M = m33Var;
                        com.yandex.smartcamera.arscene.ar_core.helpers.b bVar = s33Var3.c0;
                        bVar.c = m33Var;
                        bVar.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (vxs0Var.equals(uxs0.a)) {
                g400 g400Var2 = this.b;
                if (g400Var2 == null || (s33Var2 = g400Var2.b) == null) {
                    return;
                }
                s33Var2.c0.b();
                return;
            }
            if (vxs0Var.equals(txs0.a)) {
                g400 g400Var3 = this.b;
                if (g400Var3 == null || (s33Var = g400Var3.b) == null) {
                    return;
                }
                s33Var.c0.c();
                return;
            }
            if (!vxs0Var.equals(wxs0.a)) {
                w511.b();
                return;
            }
            y670 y670Var = this.c;
            if (y670Var != null) {
                y670Var.a.f.b(y670Var.b.a);
            }
        }
    }

    @Override // defpackage.kt7
    public final void d(lys0 lys0Var, rk6 rk6Var) {
        if (lys0Var instanceof kys0) {
            kys0 kys0Var = (kys0) lys0Var;
            if (kys0Var.equals(iys0.a)) {
                rk6Var.invoke();
            } else if (!kys0Var.equals(jys0.a)) {
                w511.b();
            } else {
                tje.N(this.d, null, null, new ArBoxesCameraStrategy$handleInnerCameraAction$1(this, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kt7
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(hp7 hp7Var, y670 y670Var, ContinuationImpl continuationImpl) {
        ArBoxesCameraStrategy$initialize$1 arBoxesCameraStrategy$initialize$1;
        int i;
        g400 g400Var;
        hp7 hp7Var2;
        pz40 pz40Var;
        if (continuationImpl instanceof ArBoxesCameraStrategy$initialize$1) {
            arBoxesCameraStrategy$initialize$1 = (ArBoxesCameraStrategy$initialize$1) continuationImpl;
            int i2 = arBoxesCameraStrategy$initialize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                arBoxesCameraStrategy$initialize$1.label = i2 - Integer.MIN_VALUE;
                Object obj = arBoxesCameraStrategy$initialize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = arBoxesCameraStrategy$initialize$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    this.c = y670Var;
                    o33 o33Var = hp7Var.c;
                    g400 g400Var2 = new g400(new m33(o33Var != null ? o33Var.a : 0.0f, o33Var != null ? o33Var.b : 0.0f, o33Var != null ? o33Var.c : 0.0f));
                    this.b = g400Var2;
                    FormattedText formattedText = hp7Var.a;
                    arBoxesCameraStrategy$initialize$1.L$0 = hp7Var;
                    arBoxesCameraStrategy$initialize$1.L$1 = null;
                    arBoxesCameraStrategy$initialize$1.L$2 = null;
                    arBoxesCameraStrategy$initialize$1.L$3 = g400Var2;
                    r0 r0Var = this.e;
                    arBoxesCameraStrategy$initialize$1.L$4 = r0Var;
                    arBoxesCameraStrategy$initialize$1.label = 1;
                    Object a = this.a.a(formattedText, arBoxesCameraStrategy$initialize$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    g400Var = g400Var2;
                    hp7Var2 = hp7Var;
                    pz40Var = r0Var;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pz40Var = (pz40) arBoxesCameraStrategy$initialize$1.L$4;
                    g400Var = (g400) arBoxesCameraStrategy$initialize$1.L$3;
                    hp7Var2 = (hp7) arBoxesCameraStrategy$initialize$1.L$0;
                    kotlin.b.b(obj);
                }
                rys0 rys0Var = new rys0((CharSequence) obj, hp7Var2.b, g400Var);
                r0 r0Var2 = (r0) pz40Var;
                r0Var2.getClass();
                r0Var2.m(null, rys0Var);
                ht10 ht10Var = hp7Var2.e;
                e.H(this.d, new jqr(new fzw(15, ((j) ht10Var.b).d.e(), (vys0) ht10Var.c), new ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1(hp7Var2, this, null), 3));
                return zy11.a;
            }
        }
        arBoxesCameraStrategy$initialize$1 = new ArBoxesCameraStrategy$initialize$1(this, continuationImpl);
        Object obj2 = arBoxesCameraStrategy$initialize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = arBoxesCameraStrategy$initialize$1.label;
        if (i != 0) {
        }
        rys0 rys0Var2 = new rys0((CharSequence) obj2, hp7Var2.b, g400Var);
        r0 r0Var22 = (r0) pz40Var;
        r0Var22.getClass();
        r0Var22.m(null, rys0Var2);
        ht10 ht10Var2 = hp7Var2.e;
        e.H(this.d, new jqr(new fzw(15, ((j) ht10Var2.b).d.e(), (vys0) ht10Var2.c), new ArBoxesCameraStrategy$subscribeToBoxSizeChanges$1(hp7Var2, this, null), 3));
        return zy11.a;
    }
}
