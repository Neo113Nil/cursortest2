package ru.yandex.logistics.sdk.cargo_form.impl.pci_dss.payment_method;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.cuj0;
import defpackage.dty0;
import defpackage.e770;
import defpackage.fqs0;
import defpackage.fws0;
import defpackage.h6a0;
import defpackage.hqs0;
import defpackage.j4z;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.mea0;
import defpackage.ny61;
import defpackage.pzg0;
import defpackage.q6a0;
import defpackage.q8s;
import defpackage.qzh0;
import defpackage.ra90;
import defpackage.x2s;
import defpackage.yuj0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;
    public final yuj0 c;

    public b(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar, q8s q8sVar, yuj0 yuj0Var) {
        this.a = aVar;
        this.b = q8sVar;
        this.c = yuj0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(q6a0 q6a0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        PaymentMethodMapper$map$1 paymentMethodMapper$map$1;
        int i;
        ra90 j4zVar;
        String a;
        ra90 ra90Var;
        String str;
        dty0 dty0Var;
        q6a0 q6a0Var2;
        CharSequence charSequence;
        Object a2;
        dty0 dty0Var2;
        hqs0 hqs0Var;
        q6a0 q6a0Var3;
        ra90 ra90Var2;
        j6s j6sVar2;
        dty0 dty0Var3;
        fqs0 fqs0Var;
        ra90 ra90Var3;
        q6a0 q6a0Var4;
        fws0 fws0Var;
        fqs0 fqs0Var2;
        String str2;
        jvs0 jvs0Var;
        q6a0 q6a0Var5;
        ra90 ra90Var4;
        fqs0 fqs0Var3;
        String str3;
        ra90 ra90Var5;
        j6s j6sVar3 = j6sVar;
        if (continuationImpl instanceof PaymentMethodMapper$map$1) {
            paymentMethodMapper$map$1 = (PaymentMethodMapper$map$1) continuationImpl;
            int i2 = paymentMethodMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodMapper$map$1.label = i2 - Integer.MIN_VALUE;
                PaymentMethodMapper$map$1 paymentMethodMapper$map$12 = paymentMethodMapper$map$1;
                Object obj = paymentMethodMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodMapper$map$12.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mea0 mea0Var = j6sVar3.b;
                    j4zVar = mea0Var != null ? new j4z(mea0Var.f, null, 30) : new cuj0(pzg0.ic_payment_not_selected, null, null, null, 30);
                    if (mea0Var == null || (a = mea0Var.c) == null) {
                        a = this.c.a(qzh0.cargoform_not_selected_payment_title, new Object[0]);
                    }
                    dty0 v = aVar.v(q6a0Var.b);
                    FormattedText formattedText = q6a0Var.c;
                    if (formattedText != null) {
                        paymentMethodMapper$map$12.L$0 = q6a0Var;
                        paymentMethodMapper$map$12.L$1 = j6sVar3;
                        paymentMethodMapper$map$12.L$2 = null;
                        paymentMethodMapper$map$12.L$3 = j4zVar;
                        paymentMethodMapper$map$12.L$4 = a;
                        paymentMethodMapper$map$12.L$5 = v;
                        paymentMethodMapper$map$12.L$6 = null;
                        paymentMethodMapper$map$12.I$0 = 0;
                        paymentMethodMapper$map$12.label = 1;
                        a2 = this.b.a(formattedText, paymentMethodMapper$map$12);
                        if (a2 != coroutineSingletons) {
                            q6a0Var2 = q6a0Var;
                            dty0Var2 = v;
                        }
                        return coroutineSingletons;
                    }
                    ra90Var = j4zVar;
                    str = a;
                    dty0Var = v;
                    q6a0Var2 = q6a0Var;
                    charSequence = null;
                    hqs0Var = q6a0Var2.d;
                    if (hqs0Var != null) {
                        paymentMethodMapper$map$12.L$0 = q6a0Var2;
                        paymentMethodMapper$map$12.L$1 = j6sVar3;
                        paymentMethodMapper$map$12.L$2 = null;
                        paymentMethodMapper$map$12.L$3 = ra90Var;
                        paymentMethodMapper$map$12.L$4 = str;
                        paymentMethodMapper$map$12.L$5 = dty0Var;
                        paymentMethodMapper$map$12.L$6 = charSequence;
                        paymentMethodMapper$map$12.L$7 = null;
                        paymentMethodMapper$map$12.I$0 = 0;
                        paymentMethodMapper$map$12.label = 2;
                        Object r = aVar.r(hqs0Var, paymentMethodMapper$map$12);
                        if (r != coroutineSingletons) {
                            ra90 ra90Var6 = ra90Var;
                            j6sVar2 = j6sVar3;
                            dty0Var3 = dty0Var;
                            obj = r;
                            ra90Var3 = ra90Var6;
                            q6a0Var4 = q6a0Var2;
                            fqs0Var = (fqs0) obj;
                            ra90Var2 = ra90Var3;
                            q6a0Var3 = q6a0Var4;
                            String str4 = str;
                            fws0Var = q6a0Var3.e;
                            if (fws0Var == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    q6a0Var3 = q6a0Var2;
                    ra90Var2 = ra90Var;
                    j6sVar2 = j6sVar3;
                    dty0Var3 = dty0Var;
                    fqs0Var = null;
                    String str42 = str;
                    fws0Var = q6a0Var3.e;
                    if (fws0Var == null) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fqs0Var3 = (fqs0) paymentMethodMapper$map$12.L$7;
                            charSequence = (CharSequence) paymentMethodMapper$map$12.L$6;
                            dty0Var3 = (dty0) paymentMethodMapper$map$12.L$5;
                            str3 = (String) paymentMethodMapper$map$12.L$4;
                            ra90Var5 = (ra90) paymentMethodMapper$map$12.L$3;
                            q6a0Var5 = (q6a0) paymentMethodMapper$map$12.L$0;
                            kotlin.b.b(obj);
                            fqs0Var2 = fqs0Var3;
                            jvs0Var = (jvs0) obj;
                            str2 = str3;
                            ra90Var4 = ra90Var5;
                            CharSequence charSequence2 = charSequence;
                            dty0 dty0Var4 = dty0Var3;
                            String str5 = q6a0Var5.g;
                            return new h6a0(ra90Var4, str2, dty0Var4, charSequence2, fqs0Var2, jvs0Var, new e770(q6a0Var5.f, new x2s(str5, null)), new x2s(str5, null), q6a0Var5.a);
                        }
                        charSequence = (CharSequence) paymentMethodMapper$map$12.L$6;
                        dty0Var3 = (dty0) paymentMethodMapper$map$12.L$5;
                        str = (String) paymentMethodMapper$map$12.L$4;
                        ra90Var3 = (ra90) paymentMethodMapper$map$12.L$3;
                        j6sVar2 = (j6s) paymentMethodMapper$map$12.L$1;
                        q6a0Var4 = (q6a0) paymentMethodMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        fqs0Var = (fqs0) obj;
                        ra90Var2 = ra90Var3;
                        q6a0Var3 = q6a0Var4;
                        String str422 = str;
                        fws0Var = q6a0Var3.e;
                        if (fws0Var == null) {
                            fqs0Var2 = fqs0Var;
                            str2 = str422;
                            jvs0Var = null;
                            q6a0Var5 = q6a0Var3;
                            ra90Var4 = ra90Var2;
                            CharSequence charSequence22 = charSequence;
                            dty0 dty0Var42 = dty0Var3;
                            String str52 = q6a0Var5.g;
                            return new h6a0(ra90Var4, str2, dty0Var42, charSequence22, fqs0Var2, jvs0Var, new e770(q6a0Var5.f, new x2s(str52, null)), new x2s(str52, null), q6a0Var5.a);
                        }
                        paymentMethodMapper$map$12.L$0 = q6a0Var3;
                        paymentMethodMapper$map$12.L$1 = null;
                        paymentMethodMapper$map$12.L$2 = null;
                        paymentMethodMapper$map$12.L$3 = ra90Var2;
                        paymentMethodMapper$map$12.L$4 = str422;
                        paymentMethodMapper$map$12.L$5 = dty0Var3;
                        paymentMethodMapper$map$12.L$6 = charSequence;
                        paymentMethodMapper$map$12.L$7 = fqs0Var;
                        paymentMethodMapper$map$12.L$8 = null;
                        paymentMethodMapper$map$12.I$0 = 0;
                        paymentMethodMapper$map$12.label = 3;
                        Object u = this.a.u(fws0Var, j6sVar2, false, true, paymentMethodMapper$map$12);
                        if (u != coroutineSingletons) {
                            fqs0 fqs0Var4 = fqs0Var;
                            obj = u;
                            fqs0Var3 = fqs0Var4;
                            str3 = str422;
                            ra90Var5 = ra90Var2;
                            q6a0Var5 = q6a0Var3;
                            fqs0Var2 = fqs0Var3;
                            jvs0Var = (jvs0) obj;
                            str2 = str3;
                            ra90Var4 = ra90Var5;
                            CharSequence charSequence222 = charSequence;
                            dty0 dty0Var422 = dty0Var3;
                            String str522 = q6a0Var5.g;
                            return new h6a0(ra90Var4, str2, dty0Var422, charSequence222, fqs0Var2, jvs0Var, new e770(q6a0Var5.f, new x2s(str522, null)), new x2s(str522, null), q6a0Var5.a);
                        }
                        return coroutineSingletons;
                    }
                    dty0Var2 = (dty0) paymentMethodMapper$map$12.L$5;
                    String str6 = (String) paymentMethodMapper$map$12.L$4;
                    j4zVar = (ra90) paymentMethodMapper$map$12.L$3;
                    j6s j6sVar4 = (j6s) paymentMethodMapper$map$12.L$1;
                    q6a0Var2 = (q6a0) paymentMethodMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    a = str6;
                    j6sVar3 = j6sVar4;
                    a2 = obj;
                }
                String str7 = a;
                dty0Var = dty0Var2;
                charSequence = (CharSequence) a2;
                ra90Var = j4zVar;
                str = str7;
                hqs0Var = q6a0Var2.d;
                if (hqs0Var != null) {
                }
            }
        }
        paymentMethodMapper$map$1 = new PaymentMethodMapper$map$1(this, continuationImpl);
        PaymentMethodMapper$map$1 paymentMethodMapper$map$122 = paymentMethodMapper$map$1;
        Object obj2 = paymentMethodMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodMapper$map$122.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        if (i != 0) {
        }
        String str72 = a;
        dty0Var = dty0Var2;
        charSequence = (CharSequence) a2;
        ra90Var = j4zVar;
        str = str72;
        hqs0Var = q6a0Var2.d;
        if (hqs0Var != null) {
        }
    }
}
