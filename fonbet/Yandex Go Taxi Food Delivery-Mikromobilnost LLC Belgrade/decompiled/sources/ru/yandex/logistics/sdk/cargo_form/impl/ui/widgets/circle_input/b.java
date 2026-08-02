package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.circle_input;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import defpackage.a1w;
import defpackage.ayv;
import defpackage.b1w;
import defpackage.bvu0;
import defpackage.byv;
import defpackage.dty0;
import defpackage.gty0;
import defpackage.hty0;
import defpackage.j6s;
import defpackage.l7x0;
import defpackage.ldc;
import defpackage.lub;
import defpackage.lvi0;
import defpackage.m6s;
import defpackage.n131;
import defpackage.nnn;
import defpackage.ny61;
import defpackage.p6s;
import defpackage.q8s;
import defpackage.qdc;
import defpackage.qub;
import defpackage.r9x0;
import defpackage.rub;
import defpackage.rzo;
import defpackage.s6b1;
import defpackage.sub;
import defpackage.t4v;
import defpackage.tcc;
import defpackage.u4v;
import defpackage.w511;
import defpackage.x2s;
import defpackage.x9x0;
import defpackage.zez0;
import defpackage.zxv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class b {
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a a;
    public final q8s b;
    public final p6s c;
    public final l7x0 d;
    public final qdc e;
    public final m6s f;

    public b(ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar, q8s q8sVar, p6s p6sVar, l7x0 l7x0Var, qdc qdcVar, m6s m6sVar) {
        this.a = aVar;
        this.b = q8sVar;
        this.c = p6sVar;
        this.d = l7x0Var;
        this.e = qdcVar;
        this.f = m6sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sub subVar, boolean z, j6s j6sVar, ContinuationImpl continuationImpl) {
        CircleInputMapper$map$1 circleInputMapper$map$1;
        int i;
        int i2;
        String str;
        String str2;
        gty0 gty0Var;
        ArrayList arrayList;
        String str3;
        boolean z2;
        String str4;
        String str5;
        int i3;
        int i4;
        gty0 gty0Var2;
        CharSequence charSequence;
        int i5;
        ArrayList arrayList2;
        Object a;
        int i6;
        int i7;
        gty0 gty0Var3;
        ArrayList arrayList3;
        boolean z3;
        Integer l;
        boolean z4;
        Object obj;
        lvi0 lvi0Var;
        Map map;
        String str6;
        ArrayList arrayList4;
        sub subVar2 = subVar;
        if (continuationImpl instanceof CircleInputMapper$map$1) {
            circleInputMapper$map$1 = (CircleInputMapper$map$1) continuationImpl;
            int i8 = circleInputMapper$map$1.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                circleInputMapper$map$1.label = i8 - Integer.MIN_VALUE;
                Object obj2 = circleInputMapper$map$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = circleInputMapper$map$1.label;
                gty0 gty0Var4 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    a1w a1wVar = subVar2.b;
                    ArrayList<n131> arrayList5 = a1wVar.b;
                    i2 = a1wVar.a;
                    Object obj3 = j6sVar.a.get(subVar2.h);
                    String str7 = obj3 instanceof String ? (String) obj3 : null;
                    int intValue = (str7 == null || (l = bvu0.l(10, str7)) == null) ? i2 : l.intValue();
                    Iterator it = arrayList5.iterator();
                    if (!it.hasNext()) {
                        ny61.p();
                        return null;
                    }
                    Object next = it.next();
                    if (it.hasNext()) {
                        int i9 = ((n131) next).a;
                        while (true) {
                            Object next2 = it.next();
                            int i10 = ((n131) next2).a;
                            if (i9 < i10) {
                                next = next2;
                                i9 = i10;
                            }
                            if (!it.hasNext()) {
                                break;
                            }
                            gty0Var4 = gty0Var4;
                        }
                    }
                    int i11 = ((n131) next).a;
                    ArrayList arrayList6 = new ArrayList(tcc.n(arrayList5, 10));
                    for (n131 n131Var : arrayList5) {
                        arrayList6.add(new b1w(n131Var.a, n131Var.b));
                    }
                    str = subVar2.f;
                    str2 = subVar2.c;
                    hty0 hty0Var = subVar2.d;
                    ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar = this.a;
                    if (hty0Var != null) {
                        dty0 v = aVar.v(hty0Var);
                        gty0Var = new gty0(v.a, v.b, v.c);
                    } else {
                        gty0Var = gty0Var4;
                    }
                    String str8 = subVar2.e;
                    List list = subVar2.g;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        Iterator it3 = it2;
                        ldc f = aVar.g.f((String) it2.next());
                        if (f != null) {
                            arrayList7.add(f);
                        }
                        it2 = it3;
                    }
                    FormattedText formattedText = subVar2.i;
                    if (formattedText == null) {
                        arrayList = arrayList7;
                        str3 = str;
                        z2 = z;
                        str4 = str2;
                        str5 = str8;
                        i3 = intValue;
                        i4 = i11;
                        gty0Var2 = gty0Var;
                        charSequence = null;
                        i5 = i2;
                        arrayList2 = arrayList6;
                        lub lubVar = new lub(i3, i5, i4, arrayList2, str3, str4, gty0Var2, str5, charSequence, z2, arrayList);
                        s6b1 s6b1Var = subVar2.j;
                        String str9 = subVar2.l;
                        z4 = s6b1Var instanceof ayv;
                        l7x0 l7x0Var = this.d;
                        if (!z4) {
                            if (s6b1Var instanceof zxv) {
                                j6s b = this.c.b();
                                if (b != null && (map = b.a) != null) {
                                    loop0: for (u4v u4vVar : kotlin.collections.a.x0(((zxv) s6b1Var).a, new qub())) {
                                        Iterator it4 = u4vVar.b.iterator();
                                        while (it4.hasNext()) {
                                            t4v t4vVar = (t4v) it4.next();
                                            String str10 = t4vVar.a;
                                            Object obj4 = t4vVar.b;
                                            Object obj5 = map.get(str10);
                                            if (obj5 == null) {
                                                obj5 = null;
                                            } else if (obj5 instanceof Collection) {
                                                obj5 = kotlin.collections.a.J0((Iterable) obj5);
                                            }
                                            if (!this.f.a(obj5, obj4, false)) {
                                                break;
                                            }
                                        }
                                        lvi0Var = new lvi0(l7x0Var.a(u4vVar.a), null, null, null, null, 62);
                                    }
                                }
                                obj = null;
                                lvi0Var = null;
                            } else {
                                if (!(s6b1Var instanceof byv) && s6b1Var != null) {
                                    w511.b();
                                    return null;
                                }
                                obj = null;
                                lvi0Var = null;
                            }
                            r9x0 r9x0Var = subVar2.k;
                            return new rub(lubVar, lvi0Var, r9x0Var == null ? new x9x0(r9x0Var, null, null, str9 != null ? new x2s(str9.concat(".SliderCenter"), obj) : null, 6) : null, new nnn(subVar2.h, str9), str9 == null ? new x2s(str9.concat(".SliderAmount"), null) : null, subVar2.a);
                        }
                        ayv ayvVar = (ayv) s6b1Var;
                        String str11 = ayvVar.a;
                        if (str11 == null || (str6 = l7x0Var.a(str11)) == null) {
                            str6 = ayvVar.b;
                        }
                        String str12 = str6;
                        Integer b2 = this.e.b(ayvVar.c);
                        lvi0Var = new lvi0(str12, null, null, null, b2 != null ? new zez0(rzo.d(b2.intValue())) : null, 46);
                        obj = null;
                        r9x0 r9x0Var2 = subVar2.k;
                        if (r9x0Var2 == null) {
                        }
                        return new rub(lubVar, lvi0Var, r9x0Var2 == null ? new x9x0(r9x0Var2, null, null, str9 != null ? new x2s(str9.concat(".SliderCenter"), obj) : null, 6) : null, new nnn(subVar2.h, str9), str9 == null ? new x2s(str9.concat(".SliderAmount"), null) : null, subVar2.a);
                    }
                    circleInputMapper$map$1.L$0 = subVar2;
                    circleInputMapper$map$1.L$1 = null;
                    circleInputMapper$map$1.L$2 = null;
                    circleInputMapper$map$1.L$3 = null;
                    circleInputMapper$map$1.L$4 = arrayList6;
                    circleInputMapper$map$1.L$5 = str;
                    circleInputMapper$map$1.L$6 = str2;
                    circleInputMapper$map$1.L$7 = gty0Var;
                    circleInputMapper$map$1.L$8 = str8;
                    circleInputMapper$map$1.L$9 = arrayList7;
                    circleInputMapper$map$1.L$10 = null;
                    circleInputMapper$map$1.Z$0 = z;
                    circleInputMapper$map$1.I$0 = intValue;
                    circleInputMapper$map$1.I$1 = i11;
                    circleInputMapper$map$1.I$2 = i2;
                    circleInputMapper$map$1.I$3 = 0;
                    circleInputMapper$map$1.label = 1;
                    a = this.b.a(formattedText, circleInputMapper$map$1);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str5 = str8;
                    i6 = intValue;
                    i7 = i11;
                    gty0Var3 = gty0Var;
                    arrayList3 = arrayList7;
                    z3 = z;
                    arrayList4 = arrayList6;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i12 = circleInputMapper$map$1.I$2;
                    i7 = circleInputMapper$map$1.I$1;
                    i6 = circleInputMapper$map$1.I$0;
                    z3 = circleInputMapper$map$1.Z$0;
                    ?? r9 = (List) circleInputMapper$map$1.L$9;
                    str5 = (String) circleInputMapper$map$1.L$8;
                    gty0Var3 = (gty0) circleInputMapper$map$1.L$7;
                    str2 = (String) circleInputMapper$map$1.L$6;
                    str = (String) circleInputMapper$map$1.L$5;
                    ?? r14 = (List) circleInputMapper$map$1.L$4;
                    sub subVar3 = (sub) circleInputMapper$map$1.L$0;
                    kotlin.b.b(obj2);
                    i2 = i12;
                    subVar2 = subVar3;
                    a = obj2;
                    arrayList3 = r9;
                    arrayList4 = r14;
                }
                str4 = str2;
                z2 = z3;
                str3 = str;
                arrayList = arrayList3;
                gty0Var2 = gty0Var3;
                charSequence = (CharSequence) a;
                i3 = i6;
                i4 = i7;
                arrayList2 = arrayList4;
                i5 = i2;
                lub lubVar2 = new lub(i3, i5, i4, arrayList2, str3, str4, gty0Var2, str5, charSequence, z2, arrayList);
                s6b1 s6b1Var2 = subVar2.j;
                String str92 = subVar2.l;
                z4 = s6b1Var2 instanceof ayv;
                l7x0 l7x0Var2 = this.d;
                if (!z4) {
                }
                obj = null;
                r9x0 r9x0Var22 = subVar2.k;
                if (r9x0Var22 == null) {
                }
                return new rub(lubVar2, lvi0Var, r9x0Var22 == null ? new x9x0(r9x0Var22, null, null, str92 != null ? new x2s(str92.concat(".SliderCenter"), obj) : null, 6) : null, new nnn(subVar2.h, str92), str92 == null ? new x2s(str92.concat(".SliderAmount"), null) : null, subVar2.a);
            }
        }
        circleInputMapper$map$1 = new CircleInputMapper$map$1(this, continuationImpl);
        Object obj22 = circleInputMapper$map$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = circleInputMapper$map$1.label;
        gty0 gty0Var42 = null;
        if (i != 0) {
        }
        str4 = str2;
        z2 = z3;
        str3 = str;
        arrayList = arrayList3;
        gty0Var2 = gty0Var3;
        charSequence = (CharSequence) a;
        i3 = i6;
        i4 = i7;
        arrayList2 = arrayList4;
        i5 = i2;
        lub lubVar22 = new lub(i3, i5, i4, arrayList2, str3, str4, gty0Var2, str5, charSequence, z2, arrayList);
        s6b1 s6b1Var22 = subVar2.j;
        String str922 = subVar2.l;
        z4 = s6b1Var22 instanceof ayv;
        l7x0 l7x0Var22 = this.d;
        if (!z4) {
        }
        obj = null;
        r9x0 r9x0Var222 = subVar2.k;
        if (r9x0Var222 == null) {
        }
        return new rub(lubVar22, lvi0Var, r9x0Var222 == null ? new x9x0(r9x0Var222, null, null, str922 != null ? new x2s(str922.concat(".SliderCenter"), obj) : null, 6) : null, new nnn(subVar2.h, str922), str922 == null ? new x2s(str922.concat(".SliderAmount"), null) : null, subVar2.a);
    }
}
