package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.main_header;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bcu;
import defpackage.d9u;
import defpackage.fws0;
import defpackage.g8e;
import defpackage.hty0;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.obu;
import defpackage.oo0;
import defpackage.q8s;
import defpackage.qv0;
import defpackage.ru0;
import defpackage.sbv;
import defpackage.v4v;
import defpackage.xau;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r1v11, types: [v4v] */
    /* JADX WARN: Type inference failed for: r4v8, types: [v4v] */
    /* JADX WARN: Type inference failed for: r5v26, types: [v4v] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(obu obuVar, j6s j6sVar, ContinuationImpl continuationImpl) {
        HeaderMapper$map$1 headerMapper$map$1;
        int i;
        String str;
        Object a;
        lvi0 lvi0Var;
        oo0 oo0Var;
        oo0 oo0Var2;
        fws0 fws0Var;
        j6s j6sVar2;
        CharSequence charSequence;
        obu obuVar2;
        bcu bcuVar;
        jvs0 jvs0Var;
        j6s j6sVar3;
        lvi0 lvi0Var2;
        obu obuVar3;
        hty0 hty0Var;
        fws0 fws0Var2;
        jvs0 jvs0Var2;
        obu obuVar4;
        lvi0 lvi0Var3;
        jvs0 jvs0Var3;
        lvi0 lvi0Var4;
        obu obuVar5 = obuVar;
        j6s j6sVar4 = j6sVar;
        if (continuationImpl instanceof HeaderMapper$map$1) {
            headerMapper$map$1 = (HeaderMapper$map$1) continuationImpl;
            int i2 = headerMapper$map$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerMapper$map$1.label = i2 - Integer.MIN_VALUE;
                HeaderMapper$map$1 headerMapper$map$12 = headerMapper$map$1;
                Object obj = headerMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerMapper$map$12.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                jvs0 jvs0Var4 = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    qv0 qv0Var = (qv0) kotlin.collections.a.S(0, j6sVar4.c.a);
                    String str2 = (qv0Var == null || (oo0Var2 = qv0Var.a) == null) ? null : oo0Var2.a;
                    if (obuVar5.h instanceof ru0) {
                        String str3 = (qv0Var == null || (oo0Var = qv0Var.a) == null) ? null : oo0Var.g;
                        if (str3 != null && str3.length() != 0 && str2 != null && str2.length() != 0) {
                            str = g8e.p(str3, Extension.FIX_SPACE, str2);
                            sbv sbvVar = obuVar5.b;
                            lvi0 g = sbvVar == null ? ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.g(aVar, sbvVar, null, null, 14) : null;
                            FormattedText formattedText = obuVar5.c;
                            headerMapper$map$12.L$0 = obuVar5;
                            headerMapper$map$12.L$1 = j6sVar4;
                            headerMapper$map$12.L$2 = null;
                            headerMapper$map$12.L$3 = null;
                            headerMapper$map$12.L$4 = str;
                            headerMapper$map$12.L$5 = g;
                            headerMapper$map$12.label = 1;
                            a = this.b.a(formattedText, headerMapper$map$12);
                            if (a != coroutineSingletons) {
                                lvi0Var = g;
                            }
                            return coroutineSingletons;
                        }
                    }
                    str = str2;
                    sbv sbvVar2 = obuVar5.b;
                    if (sbvVar2 == null) {
                    }
                    FormattedText formattedText2 = obuVar5.c;
                    headerMapper$map$12.L$0 = obuVar5;
                    headerMapper$map$12.L$1 = j6sVar4;
                    headerMapper$map$12.L$2 = null;
                    headerMapper$map$12.L$3 = null;
                    headerMapper$map$12.L$4 = str;
                    headerMapper$map$12.L$5 = g;
                    headerMapper$map$12.label = 1;
                    a = this.b.a(formattedText2, headerMapper$map$12);
                    if (a != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        jvs0Var3 = (jvs0) headerMapper$map$12.L$9;
                        bcuVar = (bcu) headerMapper$map$12.L$8;
                        charSequence = (CharSequence) headerMapper$map$12.L$7;
                        ?? r4 = (v4v) headerMapper$map$12.L$6;
                        obuVar4 = (obu) headerMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        lvi0Var4 = r4;
                        jvs0Var4 = (jvs0) obj;
                        jvs0Var2 = jvs0Var3;
                        lvi0Var3 = lvi0Var4;
                        return new xau(lvi0Var3, charSequence, bcuVar, jvs0Var2, jvs0Var4, new d9u(obuVar4.h), obuVar4.a);
                    }
                    bcuVar = (bcu) headerMapper$map$12.L$8;
                    charSequence = (CharSequence) headerMapper$map$12.L$7;
                    ?? r5 = (v4v) headerMapper$map$12.L$6;
                    j6sVar3 = (j6s) headerMapper$map$12.L$1;
                    obuVar3 = (obu) headerMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    lvi0Var2 = r5;
                    jvs0Var = (jvs0) obj;
                    lvi0Var = lvi0Var2;
                    obuVar2 = obuVar3;
                    j6sVar2 = j6sVar3;
                    fws0Var2 = obuVar2.g;
                    if (fws0Var2 == null) {
                        jvs0Var2 = jvs0Var;
                        obuVar4 = obuVar2;
                        lvi0Var3 = lvi0Var;
                        return new xau(lvi0Var3, charSequence, bcuVar, jvs0Var2, jvs0Var4, new d9u(obuVar4.h), obuVar4.a);
                    }
                    headerMapper$map$12.L$0 = obuVar2;
                    headerMapper$map$12.L$1 = null;
                    headerMapper$map$12.L$2 = null;
                    headerMapper$map$12.L$3 = null;
                    headerMapper$map$12.L$4 = null;
                    headerMapper$map$12.L$5 = null;
                    headerMapper$map$12.L$6 = lvi0Var;
                    headerMapper$map$12.L$7 = charSequence;
                    headerMapper$map$12.L$8 = bcuVar;
                    headerMapper$map$12.L$9 = jvs0Var;
                    headerMapper$map$12.I$0 = 0;
                    headerMapper$map$12.label = 3;
                    Object u = this.a.u(fws0Var2, j6sVar2, false, true, headerMapper$map$12);
                    if (u != coroutineSingletons) {
                        jvs0 jvs0Var5 = jvs0Var;
                        obj = u;
                        jvs0Var3 = jvs0Var5;
                        lvi0Var4 = lvi0Var;
                        obuVar4 = obuVar2;
                        jvs0Var4 = (jvs0) obj;
                        jvs0Var2 = jvs0Var3;
                        lvi0Var3 = lvi0Var4;
                        return new xau(lvi0Var3, charSequence, bcuVar, jvs0Var2, jvs0Var4, new d9u(obuVar4.h), obuVar4.a);
                    }
                    return coroutineSingletons;
                }
                ?? r1 = (v4v) headerMapper$map$12.L$5;
                String str4 = (String) headerMapper$map$12.L$4;
                j6s j6sVar5 = (j6s) headerMapper$map$12.L$1;
                obu obuVar6 = (obu) headerMapper$map$12.L$0;
                kotlin.b.b(obj);
                lvi0Var = r1;
                obuVar5 = obuVar6;
                a = obj;
                str = str4;
                j6sVar4 = j6sVar5;
                CharSequence charSequence2 = (CharSequence) a;
                bcu bcuVar2 = (str == null && (hty0Var = obuVar5.d) != null && obuVar5.e) ? new bcu(str, aVar.v(hty0Var)) : null;
                fws0Var = obuVar5.f;
                if (fws0Var == null) {
                    headerMapper$map$12.L$0 = obuVar5;
                    headerMapper$map$12.L$1 = j6sVar4;
                    headerMapper$map$12.L$2 = null;
                    headerMapper$map$12.L$3 = null;
                    headerMapper$map$12.L$4 = null;
                    headerMapper$map$12.L$5 = null;
                    headerMapper$map$12.L$6 = lvi0Var;
                    headerMapper$map$12.L$7 = charSequence2;
                    headerMapper$map$12.L$8 = bcuVar2;
                    headerMapper$map$12.I$0 = 0;
                    headerMapper$map$12.label = 2;
                    j6s j6sVar6 = j6sVar4;
                    Object u2 = this.a.u(fws0Var, j6sVar6, false, true, headerMapper$map$12);
                    if (u2 != coroutineSingletons) {
                        j6sVar3 = j6sVar6;
                        lvi0Var2 = lvi0Var;
                        obuVar3 = obuVar5;
                        bcuVar = bcuVar2;
                        obj = u2;
                        charSequence = charSequence2;
                        jvs0Var = (jvs0) obj;
                        lvi0Var = lvi0Var2;
                        obuVar2 = obuVar3;
                        j6sVar2 = j6sVar3;
                        fws0Var2 = obuVar2.g;
                        if (fws0Var2 == null) {
                        }
                    }
                    return coroutineSingletons;
                }
                j6sVar2 = j6sVar4;
                charSequence = charSequence2;
                obuVar2 = obuVar5;
                bcuVar = bcuVar2;
                jvs0Var = null;
                fws0Var2 = obuVar2.g;
                if (fws0Var2 == null) {
                }
            }
        }
        headerMapper$map$1 = new HeaderMapper$map$1(this, continuationImpl);
        HeaderMapper$map$1 headerMapper$map$122 = headerMapper$map$1;
        Object obj2 = headerMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerMapper$map$122.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        jvs0 jvs0Var42 = null;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) a;
        if (str == null) {
        }
        fws0Var = obuVar5.f;
        if (fws0Var == null) {
        }
    }
}
