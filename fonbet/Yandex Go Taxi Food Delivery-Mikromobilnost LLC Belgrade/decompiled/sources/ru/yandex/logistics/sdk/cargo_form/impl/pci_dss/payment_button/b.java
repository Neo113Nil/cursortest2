package ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_button;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bx90;
import defpackage.cuj0;
import defpackage.dty0;
import defpackage.dx90;
import defpackage.e770;
import defpackage.ex90;
import defpackage.j4z;
import defpackage.j6s;
import defpackage.ldc;
import defpackage.mea0;
import defpackage.ny61;
import defpackage.pzg0;
import defpackage.q8s;
import defpackage.ra90;
import defpackage.w511;
import defpackage.x2s;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ex90 ex90Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        PaymentButtonMapper$map$1 paymentButtonMapper$map$1;
        int i;
        String str;
        float f;
        ra90 j4zVar;
        dty0 v;
        CharSequence charSequence;
        float f2;
        ra90 ra90Var;
        String str2;
        String str3;
        float f3;
        ex90 ex90Var2 = ex90Var;
        if (continuationImpl instanceof PaymentButtonMapper$map$1) {
            paymentButtonMapper$map$1 = (PaymentButtonMapper$map$1) continuationImpl;
            int i2 = paymentButtonMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentButtonMapper$map$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentButtonMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentButtonMapper$map$1.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mea0 mea0Var = j6sVar.b;
                    if (mea0Var == null || (str = mea0Var.d) == null) {
                        str = mea0Var != null ? mea0Var.c : null;
                    }
                    int i3 = bx90.a[ex90Var2.e.ordinal()];
                    if (i3 == 1) {
                        f = 32.0f;
                    } else if (i3 == 2) {
                        f = 40.0f;
                    } else if (i3 == 3) {
                        f = 48.0f;
                    } else {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        f = 56.0f;
                    }
                    j4zVar = mea0Var != null ? new j4z(mea0Var.f, null, 30) : new cuj0(pzg0.ic_payment_not_selected, null, null, null, 30);
                    String str4 = str == null ? ex90Var2.d : str;
                    v = aVar.v(ex90Var2.c);
                    FormattedText formattedText = ex90Var2.b;
                    if (formattedText == null) {
                        charSequence = null;
                        f2 = f;
                        ra90Var = j4zVar;
                        str2 = str4;
                        dty0 dty0Var = v;
                        ldc f4 = aVar.g.f(ex90Var2.f);
                        String str5 = ex90Var2.h;
                        return new dx90(f2, ra90Var, str2, dty0Var, charSequence, f4, new e770(ex90Var2.g, new x2s(str5, null)), new x2s(str5, null), ex90Var2.a);
                    }
                    paymentButtonMapper$map$1.L$0 = ex90Var2;
                    paymentButtonMapper$map$1.L$1 = null;
                    paymentButtonMapper$map$1.L$2 = null;
                    paymentButtonMapper$map$1.L$3 = null;
                    paymentButtonMapper$map$1.L$4 = j4zVar;
                    paymentButtonMapper$map$1.L$5 = str4;
                    paymentButtonMapper$map$1.L$6 = v;
                    paymentButtonMapper$map$1.L$7 = null;
                    paymentButtonMapper$map$1.F$0 = f;
                    paymentButtonMapper$map$1.I$0 = 0;
                    paymentButtonMapper$map$1.label = 1;
                    Object a = this.b.a(formattedText, paymentButtonMapper$map$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str4;
                    obj = a;
                    f3 = f;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3 = paymentButtonMapper$map$1.F$0;
                    dty0 dty0Var2 = (dty0) paymentButtonMapper$map$1.L$6;
                    str3 = (String) paymentButtonMapper$map$1.L$5;
                    ra90 ra90Var2 = (ra90) paymentButtonMapper$map$1.L$4;
                    ex90 ex90Var3 = (ex90) paymentButtonMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    j4zVar = ra90Var2;
                    v = dty0Var2;
                    ex90Var2 = ex90Var3;
                }
                f2 = f3;
                charSequence = (CharSequence) obj;
                ra90Var = j4zVar;
                str2 = str3;
                dty0 dty0Var3 = v;
                ldc f42 = aVar.g.f(ex90Var2.f);
                String str52 = ex90Var2.h;
                return new dx90(f2, ra90Var, str2, dty0Var3, charSequence, f42, new e770(ex90Var2.g, new x2s(str52, null)), new x2s(str52, null), ex90Var2.a);
            }
        }
        paymentButtonMapper$map$1 = new PaymentButtonMapper$map$1(this, continuationImpl);
        Object obj2 = paymentButtonMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentButtonMapper$map$1.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        if (i != 0) {
        }
        f2 = f3;
        charSequence = (CharSequence) obj2;
        ra90Var = j4zVar;
        str2 = str3;
        dty0 dty0Var32 = v;
        ldc f422 = aVar2.g.f(ex90Var2.f);
        String str522 = ex90Var2.h;
        return new dx90(f2, ra90Var, str2, dty0Var32, charSequence, f422, new e770(ex90Var2.g, new x2s(str522, null)), new x2s(str522, null), ex90Var2.a);
    }
}
