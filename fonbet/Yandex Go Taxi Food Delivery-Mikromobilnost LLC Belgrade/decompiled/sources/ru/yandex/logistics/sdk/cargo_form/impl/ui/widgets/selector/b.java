package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.selector;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.bfq0;
import defpackage.gw00;
import defpackage.j6s;
import defpackage.jl40;
import defpackage.jlq0;
import defpackage.l7x0;
import defpackage.lvi0;
import defpackage.ny61;
import defpackage.q8s;
import defpackage.r9x0;
import defpackage.rlq0;
import defpackage.tcc;
import defpackage.v4v;
import defpackage.x2s;
import defpackage.xlq0;
import defpackage.ylq0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final q8s a;
    public final l7x0 b;

    public b(q8s q8sVar, l7x0 l7x0Var) {
        this.a = q8sVar;
        this.b = l7x0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r0v45, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r12v20, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v42, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v60, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v78, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v19, types: [int] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r8v23, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x03fc -> B:21:0x040e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0425 -> B:22:0x041e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ylq0 ylq0Var, j6s j6sVar, ContinuationImpl continuationImpl) {
        SelectorMapper$map$1 selectorMapper$map$1;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        int i4;
        Iterator it;
        SelectorMapper$map$1 selectorMapper$map$12;
        ?? r3;
        j6s j6sVar2;
        boolean z;
        v4v v4vVar;
        boolean z2;
        CoroutineSingletons coroutineSingletons;
        Iterator it2;
        CharSequence charSequence;
        ArrayList arrayList2;
        CharSequence charSequence2;
        int i5;
        int i6;
        int i7;
        int i8;
        SelectorMapper$map$1 selectorMapper$map$13;
        j6s j6sVar3;
        boolean z3;
        ylq0 ylq0Var2;
        CharSequence charSequence3;
        xlq0 xlq0Var;
        q8s q8sVar;
        FormattedText formattedText;
        ylq0 ylq0Var3;
        ArrayList arrayList3;
        CharSequence charSequence4;
        Object obj;
        boolean z4;
        CharSequence charSequence5;
        int i9;
        xlq0 xlq0Var2;
        CoroutineSingletons coroutineSingletons2;
        boolean z5;
        boolean z6;
        q8s q8sVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        ylq0 ylq0Var4;
        CharSequence charSequence6;
        CharSequence charSequence7;
        v4v v4vVar2;
        FormattedText formattedText2;
        ylq0 ylq0Var5;
        v4v v4vVar3;
        xlq0 xlq0Var3;
        CharSequence charSequence8;
        boolean z7;
        Object obj2;
        j6s j6sVar4;
        CoroutineSingletons coroutineSingletons3;
        boolean z8;
        q8s q8sVar3;
        Object obj3;
        boolean z9;
        int i14;
        int i15;
        int i16;
        xlq0 xlq0Var4;
        int i17;
        ylq0 ylq0Var6;
        boolean z10;
        v4v v4vVar4;
        FormattedText formattedText3;
        ArrayList arrayList4;
        CharSequence charSequence9;
        ArrayList arrayList5;
        b bVar = this;
        ylq0 ylq0Var7 = ylq0Var;
        if (continuationImpl instanceof SelectorMapper$map$1) {
            selectorMapper$map$1 = (SelectorMapper$map$1) continuationImpl;
            int i18 = selectorMapper$map$1.label;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                selectorMapper$map$1.label = i18 - Integer.MIN_VALUE;
                Object obj4 = selectorMapper$map$1.result;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = selectorMapper$map$1.label;
                q8s q8sVar4 = bVar.a;
                if (i != 0) {
                    i2 = 1;
                    kotlin.b.b(obj4);
                    boolean z11 = !ylq0Var7.d;
                    ArrayList arrayList6 = ylq0Var7.c;
                    arrayList = new ArrayList(tcc.n(arrayList6, 10));
                    i3 = 0;
                    i4 = 0;
                    it = arrayList6.iterator();
                    selectorMapper$map$12 = selectorMapper$map$1;
                    r3 = z11;
                    j6sVar2 = j6sVar;
                    if (!it.hasNext()) {
                    }
                } else if (i == 1) {
                    boolean z12 = selectorMapper$map$1.Z$2;
                    boolean z13 = selectorMapper$map$1.Z$1;
                    boolean z14 = selectorMapper$map$1.Z$0;
                    int i19 = selectorMapper$map$1.I$3;
                    i16 = selectorMapper$map$1.I$2;
                    i15 = selectorMapper$map$1.I$1;
                    i14 = selectorMapper$map$1.I$0;
                    ?? r12 = (Collection) selectorMapper$map$1.L$10;
                    v4v v4vVar5 = (v4v) selectorMapper$map$1.L$8;
                    xlq0 xlq0Var5 = (xlq0) selectorMapper$map$1.L$7;
                    it2 = (Iterator) selectorMapper$map$1.L$5;
                    ?? r1 = (Collection) selectorMapper$map$1.L$4;
                    j6s j6sVar5 = (j6s) selectorMapper$map$1.L$1;
                    ylq0 ylq0Var8 = (ylq0) selectorMapper$map$1.L$0;
                    kotlin.b.b(obj4);
                    arrayList = r1;
                    obj3 = obj4;
                    ylq0Var6 = ylq0Var8;
                    z10 = z12;
                    coroutineSingletons = coroutineSingletons4;
                    i17 = i19;
                    z9 = z13;
                    xlq0Var4 = xlq0Var5;
                    v4vVar4 = v4vVar5;
                    arrayList2 = r12;
                    z4 = z14;
                    selectorMapper$map$13 = selectorMapper$map$1;
                    j6sVar4 = j6sVar5;
                    q8s q8sVar5 = q8sVar4;
                    CharSequence charSequence10 = (CharSequence) obj3;
                    boolean z15 = z10;
                    formattedText3 = xlq0Var4.d;
                    if (formattedText3 == null) {
                    }
                } else if (i == 2) {
                    boolean z16 = selectorMapper$map$1.Z$2;
                    z7 = selectorMapper$map$1.Z$1;
                    boolean z17 = selectorMapper$map$1.Z$0;
                    int i20 = selectorMapper$map$1.I$3;
                    int i21 = selectorMapper$map$1.I$2;
                    int i22 = selectorMapper$map$1.I$1;
                    int i23 = selectorMapper$map$1.I$0;
                    ?? r122 = (Collection) selectorMapper$map$1.L$12;
                    CharSequence charSequence11 = (CharSequence) selectorMapper$map$1.L$11;
                    v4v v4vVar6 = (v4v) selectorMapper$map$1.L$9;
                    xlq0 xlq0Var6 = (xlq0) selectorMapper$map$1.L$7;
                    Iterator it3 = (Iterator) selectorMapper$map$1.L$5;
                    ?? r13 = (Collection) selectorMapper$map$1.L$4;
                    j6s j6sVar6 = (j6s) selectorMapper$map$1.L$1;
                    ylq0 ylq0Var9 = (ylq0) selectorMapper$map$1.L$0;
                    kotlin.b.b(obj4);
                    obj2 = obj4;
                    coroutineSingletons3 = coroutineSingletons4;
                    ylq0Var5 = ylq0Var9;
                    q8sVar3 = q8sVar4;
                    v4vVar3 = v4vVar6;
                    z8 = z16;
                    i10 = i23;
                    charSequence8 = charSequence11;
                    xlq0Var3 = xlq0Var6;
                    it2 = it3;
                    i11 = i22;
                    arrayList2 = r122;
                    z4 = z17;
                    i12 = i21;
                    selectorMapper$map$13 = selectorMapper$map$1;
                    i13 = i20;
                    j6sVar4 = j6sVar6;
                    arrayList = r13;
                    boolean z18 = z7;
                    j6sVar3 = j6sVar4;
                    charSequence6 = (CharSequence) obj2;
                    ylq0Var4 = ylq0Var5;
                    z6 = z18;
                    q8sVar2 = q8sVar3;
                    v4vVar2 = v4vVar3;
                    z2 = z8;
                    xlq0Var = xlq0Var3;
                    coroutineSingletons = coroutineSingletons3;
                    charSequence7 = charSequence8;
                    formattedText2 = xlq0Var.f;
                    if (formattedText2 != null) {
                    }
                } else if (i == 3) {
                    boolean z19 = selectorMapper$map$1.Z$2;
                    boolean z20 = selectorMapper$map$1.Z$1;
                    boolean z21 = selectorMapper$map$1.Z$0;
                    i9 = selectorMapper$map$1.I$3;
                    i8 = selectorMapper$map$1.I$2;
                    i7 = selectorMapper$map$1.I$1;
                    i6 = selectorMapper$map$1.I$0;
                    ?? r123 = (Collection) selectorMapper$map$1.L$13;
                    CharSequence charSequence12 = (CharSequence) selectorMapper$map$1.L$12;
                    CharSequence charSequence13 = (CharSequence) selectorMapper$map$1.L$11;
                    v4v v4vVar7 = (v4v) selectorMapper$map$1.L$9;
                    xlq0 xlq0Var7 = (xlq0) selectorMapper$map$1.L$7;
                    Iterator it4 = (Iterator) selectorMapper$map$1.L$5;
                    arrayList3 = (Collection) selectorMapper$map$1.L$4;
                    j6s j6sVar7 = (j6s) selectorMapper$map$1.L$1;
                    ylq0 ylq0Var10 = (ylq0) selectorMapper$map$1.L$0;
                    kotlin.b.b(obj4);
                    ylq0Var3 = ylq0Var10;
                    q8sVar = q8sVar4;
                    charSequence5 = charSequence12;
                    v4vVar = v4vVar7;
                    z5 = z19;
                    it2 = it4;
                    arrayList2 = r123;
                    charSequence4 = charSequence13;
                    obj = obj4;
                    coroutineSingletons2 = coroutineSingletons4;
                    z3 = z20;
                    z4 = z21;
                    j6sVar3 = j6sVar7;
                    selectorMapper$map$13 = selectorMapper$map$1;
                    xlq0Var2 = xlq0Var7;
                    charSequence = (CharSequence) obj;
                    CharSequence charSequence14 = charSequence4;
                    coroutineSingletons = coroutineSingletons2;
                    charSequence3 = charSequence14;
                    z2 = z5;
                    xlq0Var = xlq0Var2;
                    ylq0Var2 = ylq0Var3;
                    z = z4;
                    charSequence2 = charSequence5;
                    i5 = i9;
                    arrayList = arrayList3;
                    q8s q8sVar6 = q8sVar;
                    v4v v4vVar8 = v4vVar;
                    boolean z22 = z3;
                    formattedText = xlq0Var.g;
                    if (formattedText != null) {
                    }
                } else {
                    if (i != 4) {
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r0 = (List) selectorMapper$map$1.L$3;
                        ylq0Var7 = (ylq0) selectorMapper$map$1.L$0;
                        kotlin.b.b(obj4);
                        arrayList5 = r0;
                        arrayList4 = arrayList5;
                        charSequence9 = (CharSequence) obj4;
                        return new rlq0(arrayList4, charSequence9, new x2s(ylq0Var7.f, null), ylq0Var7.a);
                    }
                    boolean z23 = selectorMapper$map$1.Z$2;
                    boolean z24 = selectorMapper$map$1.Z$1;
                    boolean z25 = selectorMapper$map$1.Z$0;
                    int i24 = selectorMapper$map$1.I$2;
                    int i25 = selectorMapper$map$1.I$1;
                    int i26 = selectorMapper$map$1.I$0;
                    ?? r8 = (Collection) selectorMapper$map$1.L$14;
                    CharSequence charSequence15 = (CharSequence) selectorMapper$map$1.L$13;
                    CharSequence charSequence16 = (CharSequence) selectorMapper$map$1.L$12;
                    CharSequence charSequence17 = (CharSequence) selectorMapper$map$1.L$11;
                    v4v v4vVar9 = (v4v) selectorMapper$map$1.L$9;
                    xlq0 xlq0Var8 = (xlq0) selectorMapper$map$1.L$7;
                    Iterator it5 = (Iterator) selectorMapper$map$1.L$5;
                    ArrayList arrayList7 = (Collection) selectorMapper$map$1.L$4;
                    j6s j6sVar8 = (j6s) selectorMapper$map$1.L$1;
                    ylq0 ylq0Var11 = (ylq0) selectorMapper$map$1.L$0;
                    kotlin.b.b(obj4);
                    Object a = obj4;
                    CoroutineSingletons coroutineSingletons5 = coroutineSingletons4;
                    ylq0 ylq0Var12 = ylq0Var11;
                    q8s q8sVar7 = q8sVar4;
                    boolean z26 = z23;
                    boolean z27 = z24;
                    j6sVar3 = j6sVar8;
                    int i27 = i24;
                    it2 = it5;
                    boolean z28 = z25;
                    charSequence = charSequence15;
                    i7 = i25;
                    selectorMapper$map$13 = selectorMapper$map$1;
                    xlq0 xlq0Var9 = xlq0Var8;
                    ArrayList arrayList8 = r8;
                    boolean z29 = z26;
                    CharSequence charSequence18 = (CharSequence) a;
                    int i28 = i7;
                    CharSequence charSequence19 = charSequence16;
                    CharSequence charSequence20 = charSequence17;
                    v4v v4vVar10 = v4vVar9;
                    boolean z30 = z28;
                    arrayList2 = arrayList8;
                    boolean z31 = z27;
                    CharSequence charSequence21 = charSequence;
                    ylq0 ylq0Var13 = ylq0Var12;
                    String str = ylq0Var13.b;
                    r9x0 r9x0Var = xlq0Var9.h;
                    Object obj5 = xlq0Var9.a;
                    arrayList2.add(new jlq0(v4vVar10, z29, z31, charSequence20, charSequence19, charSequence21, charSequence18, new bfq0(z30, i26 != 0, r9x0Var, str, obj5, new x2s(ylq0Var13.f, gw00.e(new Pair("selected_option", obj5))))));
                    q8sVar4 = q8sVar7;
                    i3 = i28;
                    r3 = i26;
                    ylq0Var7 = ylq0Var13;
                    arrayList = arrayList7;
                    i4 = i27;
                    i2 = 1;
                    bVar = this;
                    coroutineSingletons4 = coroutineSingletons5;
                    j6sVar2 = j6sVar3;
                    selectorMapper$map$12 = selectorMapper$map$13;
                    it = it2;
                    if (!it.hasNext()) {
                        xlq0 xlq0Var10 = (xlq0) it.next();
                        z4 = jl40.l(j6sVar2.a.get(ylq0Var7.b), xlq0Var10.a);
                        String str2 = xlq0Var10.e;
                        lvi0 lvi0Var = new lvi0(str2 != null ? bVar.b.a(str2) : null, null, null, null, null, 62);
                        z9 = xlq0Var10.b;
                        FormattedText formattedText4 = xlq0Var10.c;
                        selectorMapper$map$12.L$0 = ylq0Var7;
                        selectorMapper$map$12.L$1 = j6sVar2;
                        selectorMapper$map$12.L$2 = null;
                        selectorMapper$map$12.L$3 = null;
                        selectorMapper$map$12.L$4 = arrayList;
                        selectorMapper$map$12.L$5 = it;
                        selectorMapper$map$12.L$6 = null;
                        selectorMapper$map$12.L$7 = xlq0Var10;
                        selectorMapper$map$12.L$8 = lvi0Var;
                        selectorMapper$map$12.L$9 = null;
                        selectorMapper$map$12.L$10 = arrayList;
                        selectorMapper$map$12.L$11 = null;
                        selectorMapper$map$12.L$12 = null;
                        selectorMapper$map$12.L$13 = null;
                        selectorMapper$map$12.L$14 = null;
                        selectorMapper$map$12.I$0 = r3;
                        selectorMapper$map$12.I$1 = i3;
                        selectorMapper$map$12.I$2 = i4;
                        selectorMapper$map$12.I$3 = 0;
                        selectorMapper$map$12.Z$0 = z4;
                        selectorMapper$map$12.Z$1 = z9;
                        selectorMapper$map$12.Z$2 = z4;
                        selectorMapper$map$12.label = i2;
                        Object a2 = q8sVar4.a(formattedText4, selectorMapper$map$12);
                        if (a2 == coroutineSingletons4) {
                            return coroutineSingletons4;
                        }
                        int i29 = i4;
                        i15 = i3;
                        i16 = i29;
                        coroutineSingletons = coroutineSingletons4;
                        v4vVar4 = lvi0Var;
                        obj3 = a2;
                        i17 = 0;
                        it2 = it;
                        arrayList2 = arrayList;
                        selectorMapper$map$13 = selectorMapper$map$12;
                        xlq0Var4 = xlq0Var10;
                        i14 = r3;
                        j6sVar4 = j6sVar2;
                        ylq0Var6 = ylq0Var7;
                        z10 = z4;
                        q8s q8sVar52 = q8sVar4;
                        CharSequence charSequence102 = (CharSequence) obj3;
                        boolean z152 = z10;
                        formattedText3 = xlq0Var4.d;
                        if (formattedText3 == null) {
                            selectorMapper$map$13.L$0 = ylq0Var6;
                            selectorMapper$map$13.L$1 = j6sVar4;
                            ylq0Var5 = ylq0Var6;
                            selectorMapper$map$13.L$2 = null;
                            selectorMapper$map$13.L$3 = null;
                            selectorMapper$map$13.L$4 = arrayList;
                            selectorMapper$map$13.L$5 = it2;
                            selectorMapper$map$13.L$6 = null;
                            selectorMapper$map$13.L$7 = xlq0Var4;
                            selectorMapper$map$13.L$8 = null;
                            selectorMapper$map$13.L$9 = v4vVar4;
                            selectorMapper$map$13.L$10 = null;
                            selectorMapper$map$13.L$11 = charSequence102;
                            selectorMapper$map$13.L$12 = arrayList2;
                            selectorMapper$map$13.I$0 = i14;
                            selectorMapper$map$13.I$1 = i15;
                            selectorMapper$map$13.I$2 = i16;
                            selectorMapper$map$13.I$3 = i17;
                            selectorMapper$map$13.Z$0 = z4;
                            selectorMapper$map$13.I$4 = 0;
                            selectorMapper$map$13.Z$1 = z9;
                            selectorMapper$map$13.Z$2 = z152;
                            v4vVar3 = v4vVar4;
                            selectorMapper$map$13.label = 2;
                            q8sVar3 = q8sVar52;
                            Object a3 = q8sVar3.a(formattedText3, selectorMapper$map$13);
                            coroutineSingletons3 = coroutineSingletons;
                            if (a3 == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                            xlq0Var3 = xlq0Var4;
                            z7 = z9;
                            charSequence8 = charSequence102;
                            i10 = i14;
                            i11 = i15;
                            i12 = i16;
                            i13 = i17;
                            obj2 = a3;
                            z8 = z152;
                            boolean z182 = z7;
                            j6sVar3 = j6sVar4;
                            charSequence6 = (CharSequence) obj2;
                            ylq0Var4 = ylq0Var5;
                            z6 = z182;
                            q8sVar2 = q8sVar3;
                            v4vVar2 = v4vVar3;
                            z2 = z8;
                            xlq0Var = xlq0Var3;
                            coroutineSingletons = coroutineSingletons3;
                            charSequence7 = charSequence8;
                            formattedText2 = xlq0Var.f;
                            if (formattedText2 != null) {
                                selectorMapper$map$13.L$0 = ylq0Var4;
                                selectorMapper$map$13.L$1 = j6sVar3;
                                ylq0Var3 = ylq0Var4;
                                selectorMapper$map$13.L$2 = null;
                                selectorMapper$map$13.L$3 = null;
                                selectorMapper$map$13.L$4 = arrayList;
                                selectorMapper$map$13.L$5 = it2;
                                selectorMapper$map$13.L$6 = null;
                                selectorMapper$map$13.L$7 = xlq0Var;
                                selectorMapper$map$13.L$8 = null;
                                selectorMapper$map$13.L$9 = v4vVar2;
                                selectorMapper$map$13.L$10 = null;
                                selectorMapper$map$13.L$11 = charSequence7;
                                selectorMapper$map$13.L$12 = charSequence6;
                                selectorMapper$map$13.L$13 = arrayList2;
                                selectorMapper$map$13.I$0 = i10;
                                selectorMapper$map$13.I$1 = i11;
                                selectorMapper$map$13.I$2 = i12;
                                selectorMapper$map$13.I$3 = i13;
                                selectorMapper$map$13.Z$0 = z4;
                                selectorMapper$map$13.I$4 = 0;
                                z3 = z6;
                                selectorMapper$map$13.Z$1 = z3;
                                v4vVar = v4vVar2;
                                selectorMapper$map$13.Z$2 = z2;
                                selectorMapper$map$13.label = 3;
                                q8sVar = q8sVar2;
                                obj = q8sVar.a(formattedText2, selectorMapper$map$13);
                                CharSequence charSequence22 = charSequence7;
                                coroutineSingletons2 = coroutineSingletons;
                                if (obj == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                                charSequence4 = charSequence22;
                                arrayList3 = arrayList;
                                i9 = i13;
                                i8 = i12;
                                i7 = i11;
                                i6 = i10;
                                charSequence5 = charSequence6;
                                xlq0Var2 = xlq0Var;
                                z5 = z2;
                                charSequence = (CharSequence) obj;
                                CharSequence charSequence142 = charSequence4;
                                coroutineSingletons = coroutineSingletons2;
                                charSequence3 = charSequence142;
                                z2 = z5;
                                xlq0Var = xlq0Var2;
                                ylq0Var2 = ylq0Var3;
                                z = z4;
                                charSequence2 = charSequence5;
                                i5 = i9;
                                arrayList = arrayList3;
                                q8s q8sVar62 = q8sVar;
                                v4v v4vVar82 = v4vVar;
                                boolean z222 = z3;
                                formattedText = xlq0Var.g;
                                if (formattedText != null) {
                                    selectorMapper$map$13.L$0 = ylq0Var2;
                                    selectorMapper$map$13.L$1 = j6sVar3;
                                    ylq0Var12 = ylq0Var2;
                                    selectorMapper$map$13.L$2 = null;
                                    selectorMapper$map$13.L$3 = null;
                                    selectorMapper$map$13.L$4 = arrayList;
                                    selectorMapper$map$13.L$5 = it2;
                                    selectorMapper$map$13.L$6 = null;
                                    selectorMapper$map$13.L$7 = xlq0Var;
                                    selectorMapper$map$13.L$8 = null;
                                    selectorMapper$map$13.L$9 = v4vVar82;
                                    selectorMapper$map$13.L$10 = null;
                                    selectorMapper$map$13.L$11 = charSequence3;
                                    selectorMapper$map$13.L$12 = charSequence2;
                                    selectorMapper$map$13.L$13 = charSequence;
                                    selectorMapper$map$13.L$14 = arrayList2;
                                    selectorMapper$map$13.I$0 = i6;
                                    selectorMapper$map$13.I$1 = i7;
                                    selectorMapper$map$13.I$2 = i8;
                                    selectorMapper$map$13.I$3 = i5;
                                    boolean z32 = z;
                                    selectorMapper$map$13.Z$0 = z32;
                                    selectorMapper$map$13.I$4 = 0;
                                    z27 = z222;
                                    selectorMapper$map$13.Z$1 = z27;
                                    selectorMapper$map$13.Z$2 = z2;
                                    selectorMapper$map$13.label = 4;
                                    q8sVar7 = q8sVar62;
                                    a = q8sVar7.a(formattedText, selectorMapper$map$13);
                                    CharSequence charSequence23 = charSequence3;
                                    coroutineSingletons5 = coroutineSingletons;
                                    if (a == coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    arrayList7 = arrayList;
                                    i26 = i6;
                                    charSequence16 = charSequence2;
                                    charSequence17 = charSequence23;
                                    z28 = z32;
                                    xlq0Var9 = xlq0Var;
                                    z26 = z2;
                                    i27 = i8;
                                    arrayList8 = arrayList2;
                                    v4vVar9 = v4vVar82;
                                    boolean z292 = z26;
                                    CharSequence charSequence182 = (CharSequence) a;
                                    int i282 = i7;
                                    CharSequence charSequence192 = charSequence16;
                                    CharSequence charSequence202 = charSequence17;
                                    v4v v4vVar102 = v4vVar9;
                                    boolean z302 = z28;
                                    arrayList2 = arrayList8;
                                    boolean z312 = z27;
                                    CharSequence charSequence212 = charSequence;
                                    ylq0 ylq0Var132 = ylq0Var12;
                                    String str3 = ylq0Var132.b;
                                    r9x0 r9x0Var2 = xlq0Var9.h;
                                    Object obj52 = xlq0Var9.a;
                                    arrayList2.add(new jlq0(v4vVar102, z292, z312, charSequence202, charSequence192, charSequence212, charSequence182, new bfq0(z302, i26 != 0, r9x0Var2, str3, obj52, new x2s(ylq0Var132.f, gw00.e(new Pair("selected_option", obj52))))));
                                    q8sVar4 = q8sVar7;
                                    i3 = i282;
                                    r3 = i26;
                                    ylq0Var7 = ylq0Var132;
                                    arrayList = arrayList7;
                                    i4 = i27;
                                    i2 = 1;
                                    bVar = this;
                                    coroutineSingletons4 = coroutineSingletons5;
                                    j6sVar2 = j6sVar3;
                                    selectorMapper$map$12 = selectorMapper$map$13;
                                    it = it2;
                                    if (!it.hasNext()) {
                                        CoroutineSingletons coroutineSingletons6 = coroutineSingletons4;
                                        q8s q8sVar8 = q8sVar4;
                                        arrayList4 = arrayList;
                                        FormattedText formattedText5 = ylq0Var7.e;
                                        if (formattedText5 == null) {
                                            charSequence9 = null;
                                            return new rlq0(arrayList4, charSequence9, new x2s(ylq0Var7.f, null), ylq0Var7.a);
                                        }
                                        selectorMapper$map$12.L$0 = ylq0Var7;
                                        selectorMapper$map$12.L$1 = null;
                                        selectorMapper$map$12.L$2 = null;
                                        selectorMapper$map$12.L$3 = arrayList4;
                                        selectorMapper$map$12.L$4 = null;
                                        selectorMapper$map$12.L$5 = null;
                                        selectorMapper$map$12.L$6 = null;
                                        selectorMapper$map$12.L$7 = null;
                                        selectorMapper$map$12.L$8 = null;
                                        selectorMapper$map$12.L$9 = null;
                                        selectorMapper$map$12.L$10 = null;
                                        selectorMapper$map$12.L$11 = null;
                                        selectorMapper$map$12.L$12 = null;
                                        selectorMapper$map$12.L$13 = null;
                                        selectorMapper$map$12.L$14 = null;
                                        selectorMapper$map$12.I$0 = r3;
                                        selectorMapper$map$12.I$1 = 0;
                                        selectorMapper$map$12.label = 5;
                                        Object a4 = q8sVar8.a(formattedText5, selectorMapper$map$12);
                                        if (a4 == coroutineSingletons6) {
                                            return coroutineSingletons6;
                                        }
                                        obj4 = a4;
                                        arrayList5 = arrayList4;
                                        arrayList4 = arrayList5;
                                        charSequence9 = (CharSequence) obj4;
                                        return new rlq0(arrayList4, charSequence9, new x2s(ylq0Var7.f, null), ylq0Var7.a);
                                    }
                                } else {
                                    ylq0Var12 = ylq0Var2;
                                    z27 = z222;
                                    q8sVar7 = q8sVar62;
                                    CharSequence charSequence24 = charSequence3;
                                    coroutineSingletons5 = coroutineSingletons;
                                    i282 = i7;
                                    charSequence192 = charSequence2;
                                    charSequence202 = charSequence24;
                                    z292 = z2;
                                    v4vVar102 = v4vVar82;
                                    charSequence182 = null;
                                    z302 = z;
                                    arrayList7 = arrayList;
                                    i27 = i8;
                                    i26 = i6;
                                    xlq0Var9 = xlq0Var;
                                    boolean z3122 = z27;
                                    CharSequence charSequence2122 = charSequence;
                                    ylq0 ylq0Var1322 = ylq0Var12;
                                    String str32 = ylq0Var1322.b;
                                    r9x0 r9x0Var22 = xlq0Var9.h;
                                    Object obj522 = xlq0Var9.a;
                                    arrayList2.add(new jlq0(v4vVar102, z292, z3122, charSequence202, charSequence192, charSequence2122, charSequence182, new bfq0(z302, i26 != 0, r9x0Var22, str32, obj522, new x2s(ylq0Var1322.f, gw00.e(new Pair("selected_option", obj522))))));
                                    q8sVar4 = q8sVar7;
                                    i3 = i282;
                                    r3 = i26;
                                    ylq0Var7 = ylq0Var1322;
                                    arrayList = arrayList7;
                                    i4 = i27;
                                    i2 = 1;
                                    bVar = this;
                                    coroutineSingletons4 = coroutineSingletons5;
                                    j6sVar2 = j6sVar3;
                                    selectorMapper$map$12 = selectorMapper$map$13;
                                    it = it2;
                                    if (!it.hasNext()) {
                                    }
                                }
                            } else {
                                ylq0 ylq0Var14 = ylq0Var4;
                                z3 = z6;
                                v4vVar = v4vVar2;
                                q8sVar = q8sVar2;
                                CharSequence charSequence25 = charSequence7;
                                boolean z33 = z4;
                                charSequence2 = charSequence6;
                                ylq0Var2 = ylq0Var14;
                                z = z33;
                                int i30 = i10;
                                i5 = i13;
                                i8 = i12;
                                i7 = i11;
                                i6 = i30;
                                charSequence3 = charSequence25;
                                charSequence = null;
                                q8s q8sVar622 = q8sVar;
                                v4v v4vVar822 = v4vVar;
                                boolean z2222 = z3;
                                formattedText = xlq0Var.g;
                                if (formattedText != null) {
                                }
                            }
                        } else {
                            ylq0 ylq0Var15 = ylq0Var6;
                            q8sVar2 = q8sVar52;
                            v4vVar2 = v4vVar4;
                            z2 = z152;
                            xlq0Var = xlq0Var4;
                            charSequence7 = charSequence102;
                            j6sVar3 = j6sVar4;
                            i10 = i14;
                            charSequence6 = null;
                            i11 = i15;
                            i12 = i16;
                            i13 = i17;
                            ylq0Var4 = ylq0Var15;
                            z6 = z9;
                            formattedText2 = xlq0Var.f;
                            if (formattedText2 != null) {
                            }
                        }
                    }
                }
            }
        }
        selectorMapper$map$1 = new SelectorMapper$map$1(bVar, continuationImpl);
        Object obj42 = selectorMapper$map$1.result;
        CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = selectorMapper$map$1.label;
        q8s q8sVar42 = bVar.a;
        if (i != 0) {
        }
    }
}
