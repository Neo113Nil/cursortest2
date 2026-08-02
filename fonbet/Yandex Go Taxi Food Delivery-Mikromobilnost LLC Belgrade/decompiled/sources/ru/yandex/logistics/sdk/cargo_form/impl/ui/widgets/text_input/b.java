package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.text_input;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bqy0;
import defpackage.cqy0;
import defpackage.dqy0;
import defpackage.fws0;
import defpackage.gvu0;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.jpy0;
import defpackage.jvs0;
import defpackage.kpy0;
import defpackage.ldc;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.qa6;
import defpackage.tky0;
import defpackage.x2s;
import defpackage.zpy0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x01de -> B:24:0x01f4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(j6s j6sVar, kpy0 kpy0Var, ContinuationImpl continuationImpl) {
        TextInputMapper$map$1 textInputMapper$map$1;
        int i;
        bqy0 bqy0Var;
        float f;
        cqy0 cqy0Var;
        cqy0 cqy0Var2;
        Iterator it;
        String str;
        bqy0 bqy0Var2;
        ArrayList arrayList;
        tky0 tky0Var;
        TextInputMapper$map$1 textInputMapper$map$12;
        CoroutineSingletons coroutineSingletons;
        String str2;
        int i2;
        int i3;
        int i4;
        bqy0 bqy0Var3;
        ArrayList arrayList2;
        tky0 tky0Var2;
        float f2;
        cqy0 cqy0Var3;
        String str3;
        cqy0 cqy0Var4;
        String str4;
        CharSequence charSequence;
        FormattedText formattedText;
        float f3;
        String str5;
        kpy0 kpy0Var2;
        tky0 tky0Var3;
        cqy0 cqy0Var5;
        cqy0 cqy0Var6;
        String str6;
        bqy0 bqy0Var4;
        j6s j6sVar2 = j6sVar;
        kpy0 kpy0Var3 = kpy0Var;
        if (continuationImpl instanceof TextInputMapper$map$1) {
            textInputMapper$map$1 = (TextInputMapper$map$1) continuationImpl;
            int i5 = textInputMapper$map$1.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                textInputMapper$map$1.label = i5 - Integer.MIN_VALUE;
                Object obj = textInputMapper$map$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = textInputMapper$map$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    Object obj2 = j6sVar2.a.get(kpy0Var3.f);
                    String str7 = obj2 instanceof String ? (String) obj2 : null;
                    if (str7 == null) {
                        str7 = "";
                    }
                    zpy0 zpy0Var = kpy0Var3.h;
                    if (zpy0Var != null) {
                        Object obj3 = j6sVar2.a.get(zpy0Var.b);
                        Iterator it2 = zpy0Var.a.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                bqy0Var3 = 0;
                                break;
                            }
                            bqy0Var3 = it2.next();
                            if (jl40.l(((bqy0) bqy0Var3).c, obj3)) {
                                break;
                            }
                        }
                        bqy0Var = bqy0Var3;
                    } else {
                        bqy0Var = null;
                    }
                    String A0 = gvu0.A0(kpy0Var3.i, str7);
                    f = kpy0Var3.b;
                    String str8 = kpy0Var3.c;
                    dqy0 dqy0Var = kpy0Var3.d;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.b;
                    if (dqy0Var != null) {
                        ldc f4 = aVar.g.f(dqy0Var.a);
                        qa6 qa6Var = dqy0Var.b;
                        cqy0Var = new cqy0(f4, qa6Var != null ? aVar.d(qa6Var) : null);
                    } else {
                        cqy0Var = null;
                    }
                    dqy0 dqy0Var2 = kpy0Var3.e;
                    if (dqy0Var2 != null) {
                        ldc f5 = aVar.g.f(dqy0Var2.a);
                        qa6 qa6Var2 = dqy0Var2.b;
                        cqy0Var2 = new cqy0(f5, qa6Var2 != null ? aVar.d(qa6Var2) : null);
                    } else {
                        cqy0Var2 = null;
                    }
                    tky0 tky0Var4 = new tky0(kpy0Var3.f, false, kpy0Var3.h, kpy0Var3.a, null);
                    List list = kpy0Var3.g;
                    ArrayList arrayList3 = new ArrayList();
                    it = list.iterator();
                    str = A0;
                    bqy0Var2 = bqy0Var;
                    arrayList = arrayList3;
                    tky0Var = tky0Var4;
                    textInputMapper$map$12 = textInputMapper$map$1;
                    coroutineSingletons = coroutineSingletons2;
                    str2 = str8;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    if (it.hasNext()) {
                    }
                    return r6;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f3 = textInputMapper$map$1.F$0;
                    arrayList2 = (List) textInputMapper$map$1.L$10;
                    tky0Var3 = (tky0) textInputMapper$map$1.L$9;
                    cqy0Var5 = (cqy0) textInputMapper$map$1.L$8;
                    cqy0Var6 = (cqy0) textInputMapper$map$1.L$7;
                    str5 = (String) textInputMapper$map$1.L$6;
                    str6 = (String) textInputMapper$map$1.L$5;
                    bqy0Var4 = (bqy0) textInputMapper$map$1.L$3;
                    kpy0Var2 = (kpy0) textInputMapper$map$1.L$1;
                    kotlin.b.b(obj);
                    f2 = f3;
                    tky0Var2 = tky0Var3;
                    charSequence = (CharSequence) obj;
                    cqy0Var3 = cqy0Var5;
                    cqy0Var4 = cqy0Var6;
                    str3 = str5;
                    str4 = str6;
                    bqy0Var2 = bqy0Var4;
                    kpy0Var3 = kpy0Var2;
                    return new jpy0(str4, f2, str3, cqy0Var4, cqy0Var3, tky0Var2, arrayList2, charSequence, new x2s(bqy0Var2 != null ? bqy0Var2.d : null, null), new Integer(kpy0Var3.i), kpy0Var3.j, kpy0Var3.k, kpy0Var3.l, kpy0Var3.a);
                }
                float f6 = textInputMapper$map$1.F$0;
                int i6 = textInputMapper$map$1.I$2;
                int i7 = textInputMapper$map$1.I$1;
                int i8 = textInputMapper$map$1.I$0;
                tky0 tky0Var5 = (tky0) textInputMapper$map$1.L$16;
                cqy0 cqy0Var7 = (cqy0) textInputMapper$map$1.L$15;
                cqy0 cqy0Var8 = (cqy0) textInputMapper$map$1.L$14;
                String str9 = (String) textInputMapper$map$1.L$13;
                String str10 = (String) textInputMapper$map$1.L$12;
                Iterator it3 = (Iterator) textInputMapper$map$1.L$8;
                ?? r9 = (Collection) textInputMapper$map$1.L$6;
                bqy0 bqy0Var5 = (bqy0) textInputMapper$map$1.L$3;
                kpy0 kpy0Var4 = (kpy0) textInputMapper$map$1.L$1;
                j6s j6sVar3 = (j6s) textInputMapper$map$1.L$0;
                kotlin.b.b(obj);
                float f7 = f6;
                j6s j6sVar4 = j6sVar3;
                ArrayList arrayList4 = r9;
                int i9 = i7;
                CoroutineSingletons coroutineSingletons3 = coroutineSingletons2;
                i3 = i8;
                str2 = str9;
                String str11 = str10;
                bqy0 bqy0Var6 = bqy0Var5;
                Iterator it4 = it3;
                TextInputMapper$map$1 textInputMapper$map$13 = textInputMapper$map$1;
                i2 = i6;
                kpy0Var3 = kpy0Var4;
                jvs0 jvs0Var = (jvs0) obj;
                if (jvs0Var != null) {
                    arrayList4.add(jvs0Var);
                }
                bqy0 bqy0Var7 = bqy0Var6;
                coroutineSingletons = coroutineSingletons3;
                textInputMapper$map$12 = textInputMapper$map$13;
                f = f7;
                i4 = i9;
                it = it4;
                cqy0Var2 = cqy0Var7;
                str = str11;
                bqy0Var2 = bqy0Var7;
                tky0Var = tky0Var5;
                cqy0Var = cqy0Var8;
                arrayList = arrayList4;
                j6sVar2 = j6sVar4;
                if (it.hasNext()) {
                    fws0 fws0Var = (fws0) it.next();
                    textInputMapper$map$12.L$0 = j6sVar2;
                    textInputMapper$map$12.L$1 = kpy0Var3;
                    j6s j6sVar5 = j6sVar2;
                    textInputMapper$map$12.L$2 = null;
                    textInputMapper$map$12.L$3 = bqy0Var2;
                    textInputMapper$map$12.L$4 = null;
                    textInputMapper$map$12.L$5 = null;
                    textInputMapper$map$12.L$6 = arrayList;
                    textInputMapper$map$12.L$7 = null;
                    textInputMapper$map$12.L$8 = it;
                    textInputMapper$map$12.L$9 = null;
                    textInputMapper$map$12.L$10 = null;
                    textInputMapper$map$12.L$11 = null;
                    textInputMapper$map$12.L$12 = str;
                    textInputMapper$map$12.L$13 = str2;
                    textInputMapper$map$12.L$14 = cqy0Var;
                    textInputMapper$map$12.L$15 = cqy0Var2;
                    textInputMapper$map$12.L$16 = tky0Var;
                    textInputMapper$map$12.I$0 = i3;
                    textInputMapper$map$12.I$1 = i4;
                    textInputMapper$map$12.I$2 = i2;
                    textInputMapper$map$12.I$3 = 0;
                    textInputMapper$map$12.I$4 = 0;
                    textInputMapper$map$12.F$0 = f;
                    textInputMapper$map$12.label = 1;
                    TextInputMapper$map$1 textInputMapper$map$14 = textInputMapper$map$12;
                    Object u = this.b.u(fws0Var, j6sVar5, false, true, textInputMapper$map$14);
                    coroutineSingletons3 = coroutineSingletons;
                    int i10 = i2;
                    if (u != coroutineSingletons3) {
                        tky0 tky0Var6 = tky0Var;
                        obj = u;
                        arrayList4 = arrayList;
                        cqy0Var8 = cqy0Var;
                        tky0Var5 = tky0Var6;
                        float f8 = f;
                        textInputMapper$map$13 = textInputMapper$map$14;
                        i2 = i10;
                        bqy0Var6 = bqy0Var2;
                        str11 = str;
                        cqy0Var7 = cqy0Var2;
                        it4 = it;
                        i9 = i4;
                        f7 = f8;
                        j6sVar4 = j6sVar5;
                        jvs0 jvs0Var2 = (jvs0) obj;
                        if (jvs0Var2 != null) {
                        }
                        bqy0 bqy0Var72 = bqy0Var6;
                        coroutineSingletons = coroutineSingletons3;
                        textInputMapper$map$12 = textInputMapper$map$13;
                        f = f7;
                        i4 = i9;
                        it = it4;
                        cqy0Var2 = cqy0Var7;
                        str = str11;
                        bqy0Var2 = bqy0Var72;
                        tky0Var = tky0Var5;
                        cqy0Var = cqy0Var8;
                        arrayList = arrayList4;
                        j6sVar2 = j6sVar4;
                        if (it.hasNext()) {
                            TextInputMapper$map$1 textInputMapper$map$15 = textInputMapper$map$12;
                            coroutineSingletons3 = coroutineSingletons;
                            arrayList2 = arrayList;
                            if (bqy0Var2 == null || (formattedText = bqy0Var2.b) == null) {
                                tky0Var2 = tky0Var;
                                f2 = f;
                                cqy0Var3 = cqy0Var2;
                                str3 = str2;
                                cqy0Var4 = cqy0Var;
                                str4 = str;
                                charSequence = null;
                                return new jpy0(str4, f2, str3, cqy0Var4, cqy0Var3, tky0Var2, arrayList2, charSequence, new x2s(bqy0Var2 != null ? bqy0Var2.d : null, null), new Integer(kpy0Var3.i), kpy0Var3.j, kpy0Var3.k, kpy0Var3.l, kpy0Var3.a);
                            }
                            textInputMapper$map$15.L$0 = null;
                            textInputMapper$map$15.L$1 = kpy0Var3;
                            textInputMapper$map$15.L$2 = null;
                            textInputMapper$map$15.L$3 = bqy0Var2;
                            textInputMapper$map$15.L$4 = null;
                            textInputMapper$map$15.L$5 = str;
                            textInputMapper$map$15.L$6 = str2;
                            textInputMapper$map$15.L$7 = cqy0Var;
                            textInputMapper$map$15.L$8 = cqy0Var2;
                            textInputMapper$map$15.L$9 = tky0Var;
                            textInputMapper$map$15.L$10 = arrayList2;
                            textInputMapper$map$15.L$11 = null;
                            textInputMapper$map$15.L$12 = null;
                            textInputMapper$map$15.L$13 = null;
                            textInputMapper$map$15.L$14 = null;
                            textInputMapper$map$15.L$15 = null;
                            textInputMapper$map$15.L$16 = null;
                            textInputMapper$map$15.I$0 = 0;
                            textInputMapper$map$15.F$0 = f;
                            textInputMapper$map$15.label = 2;
                            Object a = this.a.a(formattedText, textInputMapper$map$15);
                            if (a != coroutineSingletons3) {
                                tky0 tky0Var7 = tky0Var;
                                obj = a;
                                f3 = f;
                                str5 = str2;
                                kpy0Var2 = kpy0Var3;
                                tky0Var3 = tky0Var7;
                                cqy0Var5 = cqy0Var2;
                                cqy0Var6 = cqy0Var;
                                str6 = str;
                                bqy0Var4 = bqy0Var2;
                                f2 = f3;
                                tky0Var2 = tky0Var3;
                                charSequence = (CharSequence) obj;
                                cqy0Var3 = cqy0Var5;
                                cqy0Var4 = cqy0Var6;
                                str3 = str5;
                                str4 = str6;
                                bqy0Var2 = bqy0Var4;
                                kpy0Var3 = kpy0Var2;
                                return new jpy0(str4, f2, str3, cqy0Var4, cqy0Var3, tky0Var2, arrayList2, charSequence, new x2s(bqy0Var2 != null ? bqy0Var2.d : null, null), new Integer(kpy0Var3.i), kpy0Var3.j, kpy0Var3.k, kpy0Var3.l, kpy0Var3.a);
                            }
                        }
                    }
                }
                return coroutineSingletons3;
            }
        }
        textInputMapper$map$1 = new TextInputMapper$map$1(this, continuationImpl);
        Object obj4 = textInputMapper$map$1.result;
        CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = textInputMapper$map$1.label;
        if (i != 0) {
        }
    }
}
