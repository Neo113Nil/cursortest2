package com.yandex.plus.bdui.plus.checkout.content.serializer;

import android.graphics.Color;
import com.yandex.plus.pay.internal.model.PlusPayRichText;
import defpackage.c5b;
import defpackage.eg7;
import defpackage.ern;
import defpackage.l6b;
import defpackage.lm4;
import defpackage.r7o;
import defpackage.t75;
import defpackage.t7o;
import defpackage.t9f;
import defpackage.u75;
import defpackage.v75;
import defpackage.wct;
import defpackage.xz0;
import defpackage.z7o;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class r extends com.yandex.plus.bdui.plus.utils.a {
    public final com.yandex.plus.core.templating.parser.b e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Function0 function0, t9f t9fVar, com.yandex.plus.core.templating.parser.b bVar, com.yandex.plus.log.api.b bVar2, String str, int i) {
        super(function0, t9fVar, bVar2, str);
        this.f = i;
        function0.getClass();
        t9fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.e = bVar;
    }

    public static int d(String str) {
        Object t7oVar;
        str.getClass();
        try {
            r7o r7oVar = z7o.b;
            t7oVar = Integer.valueOf(Color.parseColor(str));
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return ((Number) t7oVar).intValue();
        }
        throw new com.yandex.plus.bdui.plus.utils.b("Couldn't parse color: ".concat(str), a, null, 4);
    }

    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object b(l6b l6bVar, Object obj) {
        switch (this.f) {
            case 0:
                ((com.yandex.plus.bdui.plus.checkout.content.a) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 1:
                ((com.yandex.plus.bdui.plus.checkout.content.e) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 2:
                ((com.yandex.plus.bdui.plus.checkout.content.h) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 3:
                ((p3) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 4:
                ((com.yandex.plus.bdui.plus.checkout.content.j) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 5:
                ((com.yandex.plus.bdui.plus.checkout.content.l) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 6:
                ((x5) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 7:
                ((com.yandex.plus.bdui.plus.checkout.content.p) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            default:
                ((com.yandex.plus.bdui.plus.checkout.content.q) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0250  */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [c5b] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v29, types: [c5b] */
    /* JADX WARN: Type inference failed for: r3v30, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v0, types: [c5b] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11, types: [c5b] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    @Override // com.yandex.plus.bdui.plus.utils.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, eg7 eg7Var) {
        ?? r6;
        ?? r7;
        com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var;
        ?? r11;
        f4 f4Var;
        f4 f4Var2;
        lm4 a;
        Function1 function1;
        Function1 f4Var3;
        ?? r3;
        switch (this.f) {
            case 0:
                k kVar = (k) obj;
                kVar.getClass();
                eg7Var.getClass();
                q qVar = kVar.a;
                c cVar = qVar.a.a;
                return new com.yandex.plus.bdui.plus.checkout.content.a(cVar != null ? new e(this, cVar) : null, qVar.b.a);
            case 1:
                p0 p0Var = (p0) obj;
                p0Var.getClass();
                eg7Var.getClass();
                c1 c1Var = p0Var.a;
                t0 t0Var = c1Var.a;
                x1 x1Var = t0Var.a;
                d2 d2Var = x1Var != null ? new d2(x1Var, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.F(x1Var.e), this) : null;
                List list = t0Var.b;
                if (list != null) {
                    List<x1> list2 = list;
                    r6 = new ArrayList(v75.o(list2, 10));
                    for (x1 x1Var2 : list2) {
                        r6.add(new d2(x1Var2, com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.F(x1Var2.e), this));
                    }
                } else {
                    r6 = c5b.a;
                }
                ArrayList g0 = CollectionsKt.g0(u75.i(d2Var), (Iterable) r6);
                t0 t0Var2 = c1Var.a;
                List list3 = t0Var2.j;
                if (list3 != null) {
                    List<o1> list4 = list3;
                    r7 = new ArrayList(v75.o(list4, 10));
                    for (o1 o1Var : list4) {
                        List<l1> list5 = o1Var.b;
                        ArrayList arrayList = new ArrayList(v75.o(list5, 10));
                        for (l1 l1Var : list5) {
                            arrayList.add(new b2(l1Var, l1Var));
                        }
                        List list6 = o1Var.c;
                        if (list6 != null) {
                            List list7 = list6;
                            r11 = new ArrayList(v75.o(list7, 10));
                            Iterator it = list7.iterator();
                            while (it.hasNext()) {
                                r11.add(new a2((u1) it.next()));
                            }
                        } else {
                            r11 = 0;
                        }
                        if (r11 == 0) {
                            r11 = c5b.a;
                        }
                        r7.add(new y1(o1Var, arrayList, r11));
                    }
                } else {
                    r7 = 0;
                }
                if (r7 == 0) {
                    r7 = c5b.a;
                }
                List list8 = r7;
                w0 w0Var = t0Var2.f;
                com.yandex.plus.bdui.plus.checkout.content.c cVar2 = w0Var != null ? new com.yandex.plus.bdui.plus.checkout.content.c(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(w0Var.b), w0Var.a) : null;
                PlusPayRichText a2 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(t0Var2.e);
                r1 r1Var = t0Var2.l;
                List w = xz0.w(new PlusPayRichText[]{a2, (r1Var == null || (m1Var = r1Var.a) == null) ? null : com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var)});
                c cVar3 = t0Var2.i;
                return new f2(this, p0Var, g0, list8, w, cVar2, cVar3 != null ? new e(this, cVar3) : null);
            case 2:
                r2 r2Var = (r2) obj;
                r2Var.getClass();
                eg7Var.getClass();
                x2 x2Var = r2Var.a;
                c cVar4 = x2Var.a.h;
                e eVar = cVar4 != null ? new e(this, cVar4) : null;
                u2 u2Var = x2Var.a;
                com.yandex.plus.core.data.common.y F = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.F(u2Var.a);
                PlusPayRichText a3 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(u2Var.b);
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var2 = u2Var.c;
                PlusPayRichText a4 = m1Var2 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var2) : null;
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var3 = u2Var.g;
                PlusPayRichText a5 = m1Var3 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var3) : null;
                List<o2> list9 = u2Var.d;
                ArrayList arrayList2 = new ArrayList(v75.o(list9, 10));
                for (o2 o2Var : list9) {
                    PlusPayRichText a6 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(o2Var.a);
                    com.yandex.plus.core.data.common.y F2 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.F(o2Var.b);
                    PlusPayRichText a7 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(o2Var.c);
                    com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var4 = o2Var.d;
                    arrayList2.add(new com.yandex.plus.bdui.plus.checkout.content.g(a6, F2, a7, m1Var4 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var4) : null));
                }
                return new z2(eVar, F, a3, a4, arrayList2, this, r2Var, a5);
            case 3:
                i3 i3Var = (i3) obj;
                i3Var.getClass();
                eg7Var.getClass();
                o3 o3Var = i3Var.a;
                c cVar5 = o3Var.a.i;
                e eVar2 = cVar5 != null ? new e(this, cVar5) : null;
                l3 l3Var = o3Var.a;
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var5 = l3Var.a;
                PlusPayRichText a8 = m1Var5 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var5) : null;
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var6 = l3Var.b;
                PlusPayRichText a9 = m1Var6 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var6) : null;
                List list10 = l3Var.c;
                ArrayList arrayList3 = new ArrayList(v75.o(list10, 10));
                int i = 0;
                for (Object obj2 : list10) {
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    f3 f3Var = (f3) obj2;
                    Integer num = l3Var.h;
                    boolean z = num != null && i == num.intValue();
                    List c = t75.c(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u.F(f3Var.c));
                    PlusPayRichText a10 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(f3Var.a);
                    List list11 = f3Var.b;
                    ArrayList arrayList4 = new ArrayList(v75.o(list11, 10));
                    Iterator it2 = list11.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a((com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1) it2.next()));
                    }
                    arrayList3.add(new com.yandex.plus.bdui.plus.checkout.content.i(c, a10, arrayList4, f3Var.d, f3Var.e, z));
                    i = i2;
                }
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var7 = l3Var.d;
                PlusPayRichText a11 = m1Var7 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var7) : null;
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var8 = l3Var.e;
                return new p3(eVar2, a8, a9, arrayList3, a11, m1Var8 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var8) : null, i3Var);
            case 4:
                y3 y3Var = (y3) obj;
                y3Var.getClass();
                eg7Var.getClass();
                e4 e4Var = y3Var.a;
                v3 v3Var = e4Var.a;
                s3 s3Var = e4Var.b;
                String str = v3Var.f;
                lm4 a12 = ern.a(String.class);
                Class cls = Boolean.TYPE;
                boolean equals = a12.equals(ern.a(cls));
                Class cls2 = Character.TYPE;
                Class cls3 = Double.TYPE;
                Class cls4 = Float.TYPE;
                Class cls5 = Long.TYPE;
                Class cls6 = Integer.TYPE;
                Class cls7 = Short.TYPE;
                Class cls8 = Byte.TYPE;
                com.yandex.plus.core.templating.template.a aVar = com.yandex.plus.core.templating.template.a.a;
                if (equals) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 12);
                } else if (a12.equals(ern.a(cls8))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 13);
                } else if (a12.equals(ern.a(cls7))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 14);
                } else if (a12.equals(ern.a(cls6))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 15);
                } else if (a12.equals(ern.a(cls5))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 16);
                } else if (a12.equals(ern.a(BigInteger.class))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 17);
                } else if (a12.equals(ern.a(cls4))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 18);
                } else if (a12.equals(ern.a(cls3))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 19);
                } else if (a12.equals(ern.a(BigDecimal.class))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 20);
                } else if (a12.equals(ern.a(cls2))) {
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 10);
                } else {
                    if (!a12.equals(ern.a(String.class))) {
                        f4Var = null;
                        if (f4Var == null) {
                            wct.o(1, f4Var);
                        } else {
                            f4Var = null;
                        }
                        lm4 a13 = ern.a(String.class);
                        Class b = a13.b();
                        b.getClass();
                        com.yandex.plus.core.templating.template.l lVar = new com.yandex.plus.core.templating.template.l(a13, b, ern.c(String.class));
                        com.yandex.plus.core.templating.parser.b bVar = this.e;
                        com.yandex.plus.log.api.b bVar2 = this.b;
                        com.yandex.plus.core.templating.template.j v = com.yandex.plus.bdui.flex.ui.a.v(lVar, bVar, str, bVar2, f4Var);
                        com.yandex.plus.bdui.action.a aVar2 = s3Var.a;
                        String str2 = e4Var.a.g;
                        a = ern.a(String.class);
                        if (!a.equals(ern.a(cls))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBoolean", "toBoolean(Ljava/lang/Object;)Ljava/lang/Boolean;", 0, 23);
                        } else if (a.equals(ern.a(cls8))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toByte", "toByte(Ljava/lang/Object;)Ljava/lang/Byte;", 0, 24);
                        } else if (a.equals(ern.a(cls7))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toShort", "toShort(Ljava/lang/Object;)Ljava/lang/Short;", 0, 25);
                        } else if (a.equals(ern.a(cls6))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toInt", "toInt(Ljava/lang/Object;)Ljava/lang/Integer;", 0, 26);
                        } else if (a.equals(ern.a(cls5))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toLong", "toLong(Ljava/lang/Object;)Ljava/lang/Long;", 0, 27);
                        } else if (a.equals(ern.a(BigInteger.class))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigInteger", "toBigInteger(Ljava/lang/Object;)Ljava/math/BigInteger;", 0, 28);
                        } else if (a.equals(ern.a(cls4))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toFloat", "toFloat(Ljava/lang/Object;)Ljava/lang/Float;", 0, 29);
                        } else if (a.equals(ern.a(cls3))) {
                            f4Var3 = new h4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toDouble", "toDouble(Ljava/lang/Object;)Ljava/lang/Double;", 0, 0);
                        } else if (a.equals(ern.a(BigDecimal.class))) {
                            f4Var3 = new h4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toBigDecimal", "toBigDecimal(Ljava/lang/Object;)Ljava/math/BigDecimal;", 0, 1);
                        } else if (a.equals(ern.a(cls2))) {
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toChar", "toChar(Ljava/lang/Object;)Ljava/lang/Character;", 0, 21);
                        } else {
                            if (!a.equals(ern.a(String.class))) {
                                function1 = null;
                                if (function1 != null) {
                                    wct.o(1, function1);
                                } else {
                                    function1 = null;
                                }
                                lm4 a14 = ern.a(String.class);
                                Class b2 = a14.b();
                                b2.getClass();
                                return new j4(this, y3Var, v, aVar2, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a14, b2, ern.b(String.class)), bVar, str2, bVar2, function1), s3Var.b);
                            }
                            f4Var3 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 22);
                        }
                        function1 = f4Var3;
                        if (function1 != null) {
                        }
                        lm4 a142 = ern.a(String.class);
                        Class b22 = a142.b();
                        b22.getClass();
                        return new j4(this, y3Var, v, aVar2, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a142, b22, ern.b(String.class)), bVar, str2, bVar2, function1), s3Var.b);
                    }
                    f4Var2 = new f4(1, aVar, com.yandex.plus.core.templating.template.a.class, "toString", "toString(Ljava/lang/Object;)Ljava/lang/String;", 0, 11);
                }
                f4Var = f4Var2;
                if (f4Var == null) {
                }
                lm4 a132 = ern.a(String.class);
                Class b3 = a132.b();
                b3.getClass();
                com.yandex.plus.core.templating.template.l lVar2 = new com.yandex.plus.core.templating.template.l(a132, b3, ern.c(String.class));
                com.yandex.plus.core.templating.parser.b bVar3 = this.e;
                com.yandex.plus.log.api.b bVar22 = this.b;
                com.yandex.plus.core.templating.template.j v2 = com.yandex.plus.bdui.flex.ui.a.v(lVar2, bVar3, str, bVar22, f4Var);
                com.yandex.plus.bdui.action.a aVar22 = s3Var.a;
                String str22 = e4Var.a.g;
                a = ern.a(String.class);
                if (!a.equals(ern.a(cls))) {
                }
                function1 = f4Var3;
                if (function1 != null) {
                }
                lm4 a1422 = ern.a(String.class);
                Class b222 = a1422.b();
                b222.getClass();
                return new j4(this, y3Var, v2, aVar22, com.yandex.plus.bdui.flex.ui.a.v(new com.yandex.plus.core.templating.template.l(a1422, b222, ern.b(String.class)), bVar3, str22, bVar22, function1), s3Var.b);
            case 5:
                h5 h5Var = (h5) obj;
                h5Var.getClass();
                eg7Var.getClass();
                return new k5(this, h5Var);
            case 6:
                w5 w5Var = (w5) obj;
                w5Var.getClass();
                eg7Var.getClass();
                t5 t5Var = w5Var.a;
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var9 = t5Var.a.c;
                PlusPayRichText a15 = m1Var9 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var9) : null;
                q5 q5Var = t5Var.a;
                PlusPayRichText a16 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(q5Var.d);
                PlusPayRichText a17 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(q5Var.e);
                PlusPayRichText a18 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(q5Var.f);
                PlusPayRichText a19 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(q5Var.g);
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var10 = q5Var.h;
                com.yandex.plus.bdui.plus.checkout.content.m mVar = new com.yandex.plus.bdui.plus.checkout.content.m(a15, a16, a17, a18, a19, m1Var10 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var10) : null);
                PlusPayRichText a20 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(q5Var.b);
                PlusPayRichText a21 = com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(q5Var.i);
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var11 = q5Var.j;
                return new x5(w5Var, this, a20, mVar, a21, m1Var11 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var11) : null);
            case 7:
                e7 e7Var = (e7) obj;
                e7Var.getClass();
                eg7Var.getClass();
                List list12 = e7Var.a.a.d;
                if (list12 != null) {
                    List<y6> list13 = list12;
                    r3 = new ArrayList(v75.o(list13, 10));
                    for (y6 y6Var : list13) {
                        r3.add(new com.yandex.plus.core.data.common.y(y6Var.a, y6Var.b));
                    }
                } else {
                    r3 = c5b.a;
                }
                return new g7(r3, this, e7Var);
            default:
                s7 s7Var = (s7) obj;
                s7Var.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.checkout.content.serializer.dto.m1 m1Var12 = s7Var.a.a.i;
                return new v7(this, s7Var, m1Var12 != null ? com.yandex.plus.bdui.plus.checkout.content.serializer.dto.n1.a(m1Var12) : null);
        }
    }
}
