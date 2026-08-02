package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.j690;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.ldc;
import defpackage.ma6;
import defpackage.mkm0;
import defpackage.nkm0;
import defpackage.ny61;
import defpackage.o690;
import defpackage.okm0;
import defpackage.pkm0;
import defpackage.q8s;
import defpackage.qa6;
import defpackage.qkm0;
import defpackage.rkm0;
import defpackage.tcc;
import defpackage.ul4;
import defpackage.wfz;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.yfa;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
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

    /* JADX WARN: Removed duplicated region for block: B:14:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(nkm0 nkm0Var, j6s j6sVar, String str, ContinuationImpl continuationImpl) {
        ScalableSelectorMapper$map$4 scalableSelectorMapper$map$4;
        int i;
        x2s x2sVar;
        Object obj;
        FormattedText formattedText;
        String str2;
        CharSequence charSequence;
        x2s x2sVar2;
        CharSequence charSequence2;
        nkm0 nkm0Var2;
        CharSequence charSequence3;
        String str3;
        x2s x2sVar3;
        Object obj2;
        nkm0 nkm0Var3 = nkm0Var;
        String str4 = str;
        if (continuationImpl instanceof ScalableSelectorMapper$map$4) {
            scalableSelectorMapper$map$4 = (ScalableSelectorMapper$map$4) continuationImpl;
            int i2 = scalableSelectorMapper$map$4.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scalableSelectorMapper$map$4.label = i2 - Integer.MIN_VALUE;
                Object obj3 = scalableSelectorMapper$map$4.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scalableSelectorMapper$map$4.label;
                q8s q8sVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    Object obj4 = j6sVar.a.get(str4);
                    x2sVar = new x2s(nkm0Var3.f, null);
                    FormattedText formattedText2 = nkm0Var3.a;
                    scalableSelectorMapper$map$4.L$0 = nkm0Var3;
                    scalableSelectorMapper$map$4.L$1 = null;
                    scalableSelectorMapper$map$4.L$2 = str4;
                    scalableSelectorMapper$map$4.L$3 = obj4;
                    scalableSelectorMapper$map$4.L$4 = x2sVar;
                    scalableSelectorMapper$map$4.label = 1;
                    Object a = q8sVar.a(formattedText2, scalableSelectorMapper$map$4);
                    if (a != coroutineSingletons) {
                        obj = obj4;
                        obj3 = a;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) scalableSelectorMapper$map$4.L$6;
                    x2sVar3 = (x2s) scalableSelectorMapper$map$4.L$4;
                    obj2 = scalableSelectorMapper$map$4.L$3;
                    str3 = (String) scalableSelectorMapper$map$4.L$2;
                    nkm0Var2 = (nkm0) scalableSelectorMapper$map$4.L$0;
                    kotlin.b.b(obj3);
                    charSequence = charSequence3;
                    x2sVar2 = x2sVar3;
                    charSequence2 = (CharSequence) obj3;
                    nkm0Var3 = nkm0Var2;
                    obj = obj2;
                    str2 = str3;
                    ul4 ul4Var = nkm0Var3.c;
                    return new okm0(charSequence, charSequence2, ul4Var != null ? this.a.c(ul4Var) : null, jl40.l(nkm0Var3.d, obj), nkm0Var3.e, new x9x0(null, str2, nkm0Var3.d, x2sVar2, 1), x2sVar2);
                }
                x2s x2sVar4 = (x2s) scalableSelectorMapper$map$4.L$4;
                Object obj5 = scalableSelectorMapper$map$4.L$3;
                String str5 = (String) scalableSelectorMapper$map$4.L$2;
                nkm0 nkm0Var4 = (nkm0) scalableSelectorMapper$map$4.L$0;
                kotlin.b.b(obj3);
                x2sVar = x2sVar4;
                nkm0Var3 = nkm0Var4;
                obj = obj5;
                str4 = str5;
                CharSequence charSequence4 = (CharSequence) obj3;
                formattedText = nkm0Var3.b;
                if (formattedText != null) {
                    str2 = str4;
                    charSequence = charSequence4;
                    x2sVar2 = x2sVar;
                    charSequence2 = null;
                    ul4 ul4Var2 = nkm0Var3.c;
                    return new okm0(charSequence, charSequence2, ul4Var2 != null ? this.a.c(ul4Var2) : null, jl40.l(nkm0Var3.d, obj), nkm0Var3.e, new x9x0(null, str2, nkm0Var3.d, x2sVar2, 1), x2sVar2);
                }
                scalableSelectorMapper$map$4.L$0 = nkm0Var3;
                scalableSelectorMapper$map$4.L$1 = null;
                scalableSelectorMapper$map$4.L$2 = str4;
                scalableSelectorMapper$map$4.L$3 = obj;
                scalableSelectorMapper$map$4.L$4 = x2sVar;
                scalableSelectorMapper$map$4.L$5 = null;
                scalableSelectorMapper$map$4.L$6 = charSequence4;
                scalableSelectorMapper$map$4.I$0 = 0;
                scalableSelectorMapper$map$4.label = 2;
                Object a2 = q8sVar.a(formattedText, scalableSelectorMapper$map$4);
                if (a2 != coroutineSingletons) {
                    nkm0Var2 = nkm0Var3;
                    charSequence3 = charSequence4;
                    obj3 = a2;
                    x2s x2sVar5 = x2sVar;
                    str3 = str4;
                    x2sVar3 = x2sVar5;
                    obj2 = obj;
                    charSequence = charSequence3;
                    x2sVar2 = x2sVar3;
                    charSequence2 = (CharSequence) obj3;
                    nkm0Var3 = nkm0Var2;
                    obj = obj2;
                    str2 = str3;
                    ul4 ul4Var22 = nkm0Var3.c;
                    return new okm0(charSequence, charSequence2, ul4Var22 != null ? this.a.c(ul4Var22) : null, jl40.l(nkm0Var3.d, obj), nkm0Var3.e, new x9x0(null, str2, nkm0Var3.d, x2sVar2, 1), x2sVar2);
                }
                return coroutineSingletons;
            }
        }
        scalableSelectorMapper$map$4 = new ScalableSelectorMapper$map$4(this, continuationImpl);
        Object obj32 = scalableSelectorMapper$map$4.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scalableSelectorMapper$map$4.label;
        q8s q8sVar2 = this.b;
        if (i != 0) {
        }
        CharSequence charSequence42 = (CharSequence) obj32;
        formattedText = nkm0Var3.b;
        if (formattedText != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r20v0, types: [ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.scalable_selector.b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00ad -> B:10:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(pkm0 pkm0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        ScalableSelectorMapper$map$1 scalableSelectorMapper$map$1;
        int i;
        pkm0 pkm0Var2;
        Iterator it;
        int i2;
        ArrayList arrayList;
        ScalableSelectorMapper$map$1 scalableSelectorMapper$map$12;
        int i3;
        j6s j6sVar2;
        j690 j690Var;
        if (continuationImpl instanceof ScalableSelectorMapper$map$1) {
            scalableSelectorMapper$map$1 = (ScalableSelectorMapper$map$1) continuationImpl;
            int i4 = scalableSelectorMapper$map$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                scalableSelectorMapper$map$1.label = i4 - Integer.MIN_VALUE;
                Object obj = scalableSelectorMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scalableSelectorMapper$map$1.label;
                qkm0 qkm0Var = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    pkm0Var2 = pkm0Var;
                    List list = pkm0Var2.b;
                    ArrayList arrayList2 = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    i2 = 0;
                    arrayList = arrayList2;
                    scalableSelectorMapper$map$12 = scalableSelectorMapper$map$1;
                    i3 = 0;
                    j6sVar2 = j6sVar;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i5 = scalableSelectorMapper$map$1.I$1;
                    int i6 = scalableSelectorMapper$map$1.I$0;
                    Collection collection = (Collection) scalableSelectorMapper$map$1.L$8;
                    Iterator it2 = (Iterator) scalableSelectorMapper$map$1.L$5;
                    ?? r11 = (Collection) scalableSelectorMapper$map$1.L$4;
                    j6s j6sVar3 = (j6s) scalableSelectorMapper$map$1.L$1;
                    pkm0 pkm0Var3 = (pkm0) scalableSelectorMapper$map$1.L$0;
                    kotlin.b.b(obj);
                    scalableSelectorMapper$map$12 = scalableSelectorMapper$map$1;
                    j6sVar2 = j6sVar3;
                    Iterator it3 = it2;
                    int i7 = i6;
                    i3 = i5;
                    ArrayList arrayList3 = r11;
                    collection.add((okm0) obj);
                    i2 = i7;
                    arrayList = arrayList3;
                    it = it3;
                    pkm0Var2 = pkm0Var3;
                    if (it.hasNext()) {
                        nkm0 nkm0Var = (nkm0) it.next();
                        String str = pkm0Var2.d;
                        scalableSelectorMapper$map$12.L$0 = pkm0Var2;
                        scalableSelectorMapper$map$12.L$1 = j6sVar2;
                        scalableSelectorMapper$map$12.L$2 = null;
                        scalableSelectorMapper$map$12.L$3 = null;
                        scalableSelectorMapper$map$12.L$4 = arrayList;
                        scalableSelectorMapper$map$12.L$5 = it;
                        scalableSelectorMapper$map$12.L$6 = null;
                        scalableSelectorMapper$map$12.L$7 = null;
                        scalableSelectorMapper$map$12.L$8 = arrayList;
                        scalableSelectorMapper$map$12.I$0 = i2;
                        scalableSelectorMapper$map$12.I$1 = i3;
                        scalableSelectorMapper$map$12.I$2 = 0;
                        scalableSelectorMapper$map$12.label = 1;
                        Object a = a(nkm0Var, j6sVar2, str, scalableSelectorMapper$map$12);
                        if (a == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        pkm0Var3 = pkm0Var2;
                        obj = a;
                        it3 = it;
                        ArrayList arrayList4 = arrayList;
                        i7 = i2;
                        collection = arrayList4;
                        arrayList3 = arrayList4;
                        collection.add((okm0) obj);
                        i2 = i7;
                        arrayList = arrayList3;
                        it = it3;
                        pkm0Var2 = pkm0Var3;
                        if (it.hasNext()) {
                            ArrayList arrayList5 = arrayList;
                            rkm0 rkm0Var = pkm0Var2.c;
                            if (rkm0Var != null) {
                                String str2 = rkm0Var.a;
                                ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                                yfa yfaVar = aVar.g;
                                yfa yfaVar2 = aVar.g;
                                ldc f = yfaVar.f(str2);
                                ldc f2 = yfaVar2.f(rkm0Var.b);
                                ldc f3 = yfaVar2.f(rkm0Var.c);
                                qa6 qa6Var = rkm0Var.d;
                                ma6 d = qa6Var != null ? aVar.d(qa6Var) : null;
                                o690 o690Var = rkm0Var.e;
                                if (o690Var != null) {
                                    j690Var = ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a.i(o690Var);
                                } else {
                                    j690.a.getClass();
                                    j690Var = wfz.J;
                                }
                                qkm0Var = new qkm0(f, f2, f3, d, j690Var, rkm0Var.f, rkm0Var.g);
                            }
                            return new mkm0(arrayList5, qkm0Var, pkm0Var2.e, pkm0Var2.a);
                        }
                    }
                }
            }
        }
        scalableSelectorMapper$map$1 = new ScalableSelectorMapper$map$1(this, continuationImpl);
        Object obj2 = scalableSelectorMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scalableSelectorMapper$map$1.label;
        qkm0 qkm0Var2 = null;
        if (i != 0) {
        }
    }
}
