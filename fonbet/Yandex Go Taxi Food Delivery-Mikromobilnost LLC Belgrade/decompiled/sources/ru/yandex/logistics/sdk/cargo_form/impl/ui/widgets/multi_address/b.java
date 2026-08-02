package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.multi_address;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.a570;
import defpackage.fws0;
import defpackage.hts0;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.lts0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.xk40;
import defpackage.yk40;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a b;

    public b(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = q8sVar;
        this.b = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
    
        if (r13 == r0) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(yk40 yk40Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        MultiAddressMapper$map$1 multiAddressMapper$map$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object a;
        j6s j6sVar2;
        CharSequence charSequence;
        int i2;
        fws0 fws0Var;
        CharSequence charSequence2;
        hts0 hts0Var;
        yk40 yk40Var2;
        CharSequence charSequence3;
        hts0 hts0Var2;
        if (continuationImpl instanceof MultiAddressMapper$map$1) {
            multiAddressMapper$map$1 = (MultiAddressMapper$map$1) continuationImpl;
            int i3 = multiAddressMapper$map$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                multiAddressMapper$map$1.label = i3 - Integer.MIN_VALUE;
                MultiAddressMapper$map$1 multiAddressMapper$map$12 = multiAddressMapper$map$1;
                Object obj = multiAddressMapper$map$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multiAddressMapper$map$12.label;
                q8s q8sVar = this.a;
                jvs0 jvs0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    FormattedText formattedText = yk40Var.c;
                    multiAddressMapper$map$12.L$0 = yk40Var;
                    multiAddressMapper$map$12.L$1 = j6sVar;
                    multiAddressMapper$map$12.label = 1;
                    obj = q8sVar.a(formattedText, multiAddressMapper$map$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hts0Var2 = (hts0) multiAddressMapper$map$12.L$4;
                            charSequence3 = (CharSequence) multiAddressMapper$map$12.L$3;
                            charSequence = (CharSequence) multiAddressMapper$map$12.L$2;
                            yk40Var2 = (yk40) multiAddressMapper$map$12.L$0;
                            kotlin.b.b(obj);
                            jvs0Var = (jvs0) obj;
                            hts0Var = hts0Var2;
                            charSequence2 = charSequence3;
                            yk40Var = yk40Var2;
                            return new xk40(charSequence2, charSequence, hts0Var, jvs0Var, new a570(yk40Var.f, yk40Var.b), yk40Var.h, yk40Var.a);
                        }
                        CharSequence charSequence4 = (CharSequence) multiAddressMapper$map$12.L$2;
                        j6s j6sVar3 = (j6s) multiAddressMapper$map$12.L$1;
                        yk40 yk40Var3 = (yk40) multiAddressMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        charSequence = charSequence4;
                        yk40Var = yk40Var3;
                        i2 = 3;
                        j6sVar2 = j6sVar3;
                        CharSequence charSequence5 = (CharSequence) obj;
                        lts0 lts0Var = yk40Var.e;
                        hts0 s = lts0Var == null ? this.b.s(lts0Var) : null;
                        fws0Var = yk40Var.g;
                        if (fws0Var != null) {
                            charSequence2 = charSequence5;
                            hts0Var = s;
                            return new xk40(charSequence2, charSequence, hts0Var, jvs0Var, new a570(yk40Var.f, yk40Var.b), yk40Var.h, yk40Var.a);
                        }
                        multiAddressMapper$map$12.L$0 = yk40Var;
                        multiAddressMapper$map$12.L$1 = null;
                        multiAddressMapper$map$12.L$2 = charSequence;
                        multiAddressMapper$map$12.L$3 = charSequence5;
                        multiAddressMapper$map$12.L$4 = s;
                        multiAddressMapper$map$12.L$5 = null;
                        multiAddressMapper$map$12.I$0 = 0;
                        multiAddressMapper$map$12.label = i2;
                        Object u = this.b.u(fws0Var, j6sVar2, false, true, multiAddressMapper$map$12);
                        if (u != coroutineSingletons) {
                            yk40Var2 = yk40Var;
                            charSequence3 = charSequence5;
                            obj = u;
                            hts0Var2 = s;
                            jvs0Var = (jvs0) obj;
                            hts0Var = hts0Var2;
                            charSequence2 = charSequence3;
                            yk40Var = yk40Var2;
                            return new xk40(charSequence2, charSequence, hts0Var, jvs0Var, new a570(yk40Var.f, yk40Var.b), yk40Var.h, yk40Var.a);
                        }
                        return coroutineSingletons;
                    }
                    j6sVar = (j6s) multiAddressMapper$map$12.L$1;
                    yk40Var = (yk40) multiAddressMapper$map$12.L$0;
                    kotlin.b.b(obj);
                }
                CharSequence charSequence6 = (CharSequence) obj;
                FormattedText formattedText2 = yk40Var.d;
                multiAddressMapper$map$12.L$0 = yk40Var;
                multiAddressMapper$map$12.L$1 = j6sVar;
                multiAddressMapper$map$12.L$2 = charSequence6;
                multiAddressMapper$map$12.label = 2;
                a = q8sVar.a(formattedText2, multiAddressMapper$map$12);
                if (a != coroutineSingletons) {
                    j6sVar2 = j6sVar;
                    charSequence = charSequence6;
                    obj = a;
                    i2 = 3;
                    CharSequence charSequence52 = (CharSequence) obj;
                    lts0 lts0Var2 = yk40Var.e;
                    if (lts0Var2 == null) {
                    }
                    fws0Var = yk40Var.g;
                    if (fws0Var != null) {
                    }
                }
                return coroutineSingletons;
            }
        }
        multiAddressMapper$map$1 = new MultiAddressMapper$map$1(this, continuationImpl);
        MultiAddressMapper$map$1 multiAddressMapper$map$122 = multiAddressMapper$map$1;
        Object obj2 = multiAddressMapper$map$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multiAddressMapper$map$122.label;
        q8s q8sVar2 = this.a;
        jvs0 jvs0Var2 = null;
        if (i != 0) {
        }
        CharSequence charSequence62 = (CharSequence) obj2;
        FormattedText formattedText22 = yk40Var.d;
        multiAddressMapper$map$122.L$0 = yk40Var;
        multiAddressMapper$map$122.L$1 = j6sVar;
        multiAddressMapper$map$122.L$2 = charSequence62;
        multiAddressMapper$map$122.label = 2;
        a = q8sVar2.a(formattedText22, multiAddressMapper$map$122);
        if (a != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
