package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.field_display;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.dty0;
import defpackage.fws0;
import defpackage.hts0;
import defpackage.j6s;
import defpackage.jvs0;
import defpackage.lts0;
import defpackage.mxq;
import defpackage.nxq;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.r9x0;
import defpackage.x2s;
import defpackage.x9x0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.FieldPosition;

/* loaded from: classes5.dex */
public final class a {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;

    public a(q8s q8sVar, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar) {
        this.a = aVar;
        this.b = q8sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d1, code lost:
    
        if (r7 == r4) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f6, code lost:
    
        if (r7 == r4) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nxq nxqVar, j6s j6sVar, ContinuationImpl continuationImpl) {
        FieldDisplayMapper$map$1 fieldDisplayMapper$map$1;
        int i;
        int i2;
        String str;
        Object a;
        j6s j6sVar2;
        CharSequence charSequence;
        Object a2;
        CharSequence charSequence2;
        int i3;
        hts0 s;
        fws0 fws0Var;
        dty0 dty0Var;
        CharSequence charSequence3;
        String str2;
        hts0 hts0Var;
        jvs0 jvs0Var;
        String str3;
        nxq nxqVar2;
        CharSequence charSequence4;
        hts0 hts0Var2;
        dty0 dty0Var2;
        int i4;
        nxq nxqVar3 = nxqVar;
        j6s j6sVar3 = j6sVar;
        if (continuationImpl instanceof FieldDisplayMapper$map$1) {
            fieldDisplayMapper$map$1 = (FieldDisplayMapper$map$1) continuationImpl;
            int i5 = fieldDisplayMapper$map$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fieldDisplayMapper$map$1.label = i5 - Integer.MIN_VALUE;
                FieldDisplayMapper$map$1 fieldDisplayMapper$map$12 = fieldDisplayMapper$map$1;
                Object obj = fieldDisplayMapper$map$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fieldDisplayMapper$map$12.label;
                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object obj2 = j6sVar3.a.get(nxqVar3.c);
                    i2 = obj2 != null ? 1 : 0;
                    str = obj2 instanceof String ? (String) obj2 : null;
                    q8s q8sVar = this.b;
                    if (i2 != 0) {
                        FormattedText formattedText = nxqVar3.e;
                        if (formattedText != null) {
                            fieldDisplayMapper$map$12.L$0 = nxqVar3;
                            fieldDisplayMapper$map$12.L$1 = j6sVar3;
                            fieldDisplayMapper$map$12.L$2 = null;
                            fieldDisplayMapper$map$12.L$3 = null;
                            fieldDisplayMapper$map$12.L$4 = str;
                            fieldDisplayMapper$map$12.I$0 = i2;
                            fieldDisplayMapper$map$12.I$1 = 0;
                            fieldDisplayMapper$map$12.label = 1;
                            a2 = q8sVar.a(formattedText, fieldDisplayMapper$map$12);
                        } else {
                            j6sVar2 = j6sVar3;
                            charSequence = null;
                            i3 = nxqVar3.b == FieldPosition.SUBTITLE ? 1 : 0;
                            dty0 v = aVar.v(nxqVar3.d);
                            if (i2 != 0) {
                                lts0 lts0Var = nxqVar3.f;
                                if (lts0Var != null) {
                                    s = aVar.s(lts0Var);
                                    fws0Var = nxqVar3.i;
                                    if (fws0Var != null) {
                                        dty0Var = v;
                                        charSequence3 = charSequence;
                                        str2 = str;
                                        hts0Var = s;
                                        jvs0Var = null;
                                        r9x0 r9x0Var = nxqVar3.j;
                                        String str4 = nxqVar3.k;
                                        return new mxq(str2, charSequence3, i3 != 0, dty0Var, hts0Var, jvs0Var, new x9x0(r9x0Var, null, null, new x2s(str4, null), 6), new x2s(str4, null), aVar.t(nxqVar3.l), nxqVar3.a);
                                    }
                                    fieldDisplayMapper$map$12.L$0 = nxqVar3;
                                    fieldDisplayMapper$map$12.L$1 = null;
                                    fieldDisplayMapper$map$12.L$2 = null;
                                    fieldDisplayMapper$map$12.L$3 = null;
                                    fieldDisplayMapper$map$12.L$4 = str;
                                    fieldDisplayMapper$map$12.L$5 = charSequence;
                                    fieldDisplayMapper$map$12.L$6 = v;
                                    fieldDisplayMapper$map$12.L$7 = s;
                                    fieldDisplayMapper$map$12.I$0 = i2;
                                    fieldDisplayMapper$map$12.I$1 = 0;
                                    fieldDisplayMapper$map$12.I$2 = i3;
                                    fieldDisplayMapper$map$12.label = 3;
                                    hts0 hts0Var3 = s;
                                    Object u = this.a.u(fws0Var, j6sVar2, false, true, fieldDisplayMapper$map$12);
                                    if (u != coroutineSingletons) {
                                        str3 = str;
                                        obj = u;
                                        nxqVar2 = nxqVar3;
                                        charSequence4 = charSequence;
                                        hts0Var2 = hts0Var3;
                                        dty0Var2 = v;
                                        i4 = i3;
                                        i3 = i4;
                                        hts0Var = hts0Var2;
                                        dty0Var = dty0Var2;
                                        jvs0Var = (jvs0) obj;
                                        charSequence3 = charSequence4;
                                        str2 = str3;
                                        nxqVar3 = nxqVar2;
                                        r9x0 r9x0Var2 = nxqVar3.j;
                                        String str42 = nxqVar3.k;
                                        return new mxq(str2, charSequence3, i3 != 0, dty0Var, hts0Var, jvs0Var, new x9x0(r9x0Var2, null, null, new x2s(str42, null), 6), new x2s(str42, null), aVar.t(nxqVar3.l), nxqVar3.a);
                                    }
                                }
                                s = null;
                                fws0Var = nxqVar3.i;
                                if (fws0Var != null) {
                                }
                            } else {
                                lts0 lts0Var2 = nxqVar3.h;
                                if (lts0Var2 != null) {
                                    s = aVar.s(lts0Var2);
                                    fws0Var = nxqVar3.i;
                                    if (fws0Var != null) {
                                    }
                                }
                                s = null;
                                fws0Var = nxqVar3.i;
                                if (fws0Var != null) {
                                }
                            }
                        }
                    } else {
                        FormattedText formattedText2 = nxqVar3.g;
                        fieldDisplayMapper$map$12.L$0 = nxqVar3;
                        fieldDisplayMapper$map$12.L$1 = j6sVar3;
                        fieldDisplayMapper$map$12.L$2 = null;
                        fieldDisplayMapper$map$12.L$3 = null;
                        fieldDisplayMapper$map$12.L$4 = str;
                        fieldDisplayMapper$map$12.I$0 = i2;
                        fieldDisplayMapper$map$12.I$1 = 0;
                        fieldDisplayMapper$map$12.label = 2;
                        a = q8sVar.a(formattedText2, fieldDisplayMapper$map$12);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    int i6 = fieldDisplayMapper$map$12.I$0;
                    String str5 = (String) fieldDisplayMapper$map$12.L$4;
                    j6s j6sVar4 = (j6s) fieldDisplayMapper$map$12.L$1;
                    nxq nxqVar4 = (nxq) fieldDisplayMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    i2 = i6;
                    nxqVar3 = nxqVar4;
                    a2 = obj;
                    str = str5;
                    j6sVar3 = j6sVar4;
                    charSequence2 = (CharSequence) a2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i4 = fieldDisplayMapper$map$12.I$2;
                        hts0Var2 = (hts0) fieldDisplayMapper$map$12.L$7;
                        dty0Var2 = (dty0) fieldDisplayMapper$map$12.L$6;
                        charSequence4 = (CharSequence) fieldDisplayMapper$map$12.L$5;
                        str3 = (String) fieldDisplayMapper$map$12.L$4;
                        nxqVar2 = (nxq) fieldDisplayMapper$map$12.L$0;
                        kotlin.b.b(obj);
                        i3 = i4;
                        hts0Var = hts0Var2;
                        dty0Var = dty0Var2;
                        jvs0Var = (jvs0) obj;
                        charSequence3 = charSequence4;
                        str2 = str3;
                        nxqVar3 = nxqVar2;
                        r9x0 r9x0Var22 = nxqVar3.j;
                        String str422 = nxqVar3.k;
                        return new mxq(str2, charSequence3, i3 != 0, dty0Var, hts0Var, jvs0Var, new x9x0(r9x0Var22, null, null, new x2s(str422, null), 6), new x2s(str422, null), aVar.t(nxqVar3.l), nxqVar3.a);
                    }
                    int i7 = fieldDisplayMapper$map$12.I$0;
                    String str6 = (String) fieldDisplayMapper$map$12.L$4;
                    j6s j6sVar5 = (j6s) fieldDisplayMapper$map$12.L$1;
                    nxq nxqVar5 = (nxq) fieldDisplayMapper$map$12.L$0;
                    kotlin.b.b(obj);
                    i2 = i7;
                    nxqVar3 = nxqVar5;
                    a = obj;
                    str = str6;
                    j6sVar3 = j6sVar5;
                    charSequence2 = (CharSequence) a;
                }
                CharSequence charSequence5 = charSequence2;
                j6sVar2 = j6sVar3;
                charSequence = charSequence5;
                if (nxqVar3.b == FieldPosition.SUBTITLE) {
                }
                dty0 v2 = aVar.v(nxqVar3.d);
                if (i2 != 0) {
                }
            }
        }
        fieldDisplayMapper$map$1 = new FieldDisplayMapper$map$1(this, continuationImpl);
        FieldDisplayMapper$map$1 fieldDisplayMapper$map$122 = fieldDisplayMapper$map$1;
        Object obj3 = fieldDisplayMapper$map$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fieldDisplayMapper$map$122.label;
        ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence52 = charSequence2;
        j6sVar2 = j6sVar3;
        charSequence = charSequence52;
        if (nxqVar3.b == FieldPosition.SUBTITLE) {
        }
        dty0 v22 = aVar2.v(nxqVar3.d);
        if (i2 != 0) {
        }
    }
}
