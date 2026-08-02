package com.yandex.plus.bdui.plus.action.serializer;

import android.util.Base64;
import com.yandex.plus.bdui.plus.checkout.action.serializer.f0;
import com.yandex.plus.bdui.plus.checkout.action.serializer.i0;
import com.yandex.plus.bdui.plus.checkout.action.serializer.l0;
import com.yandex.plus.bdui.plus.checkout.action.serializer.o0;
import com.yandex.plus.bdui.plus.checkout.content.serializer.b6;
import com.yandex.plus.bdui.plus.checkout.content.serializer.b8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.e8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.h8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.i2;
import com.yandex.plus.bdui.plus.checkout.content.serializer.i6;
import com.yandex.plus.bdui.plus.checkout.content.serializer.j6;
import com.yandex.plus.bdui.plus.checkout.content.serializer.k8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.m4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.m6;
import com.yandex.plus.bdui.plus.checkout.content.serializer.n8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.p6;
import com.yandex.plus.bdui.plus.checkout.content.serializer.q8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.s4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.t8;
import com.yandex.plus.bdui.plus.checkout.content.serializer.v4;
import com.yandex.plus.bdui.plus.checkout.content.serializer.y7;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.e5b;
import defpackage.eg7;
import defpackage.l6b;
import defpackage.t9f;
import defpackage.v75;
import defpackage.w3f;
import defpackage.x3f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class d extends com.yandex.plus.bdui.plus.utils.a {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Function0 function0, t9f t9fVar, com.yandex.plus.log.api.b bVar, String str, int i) {
        super(function0, t9fVar, bVar, str);
        this.e = i;
    }

    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object b(l6b l6bVar, Object obj) {
        switch (this.e) {
            case 0:
                ((com.yandex.plus.bdui.plus.action.d) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 1:
                com.yandex.plus.bdui.plus.action.h hVar = (com.yandex.plus.bdui.plus.action.h) obj;
                hVar.getClass();
                l6bVar.getClass();
                return new k(hVar.a, hVar.b);
            case 2:
                com.yandex.plus.bdui.plus.action.l lVar = (com.yandex.plus.bdui.plus.action.l) obj;
                lVar.getClass();
                l6bVar.getClass();
                return new n(lVar.a());
            case 3:
                com.yandex.plus.bdui.plus.action.p pVar = (com.yandex.plus.bdui.plus.action.p) obj;
                pVar.getClass();
                l6bVar.getClass();
                List<com.yandex.plus.bdui.plus.action.c> list = pVar.a;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                for (com.yandex.plus.bdui.plus.action.c cVar : list) {
                    arrayList.add(new y(cVar.a, cVar.b, cVar.c, cVar.d));
                }
                return new b0(arrayList);
            case 4:
                ((com.yandex.plus.bdui.plus.action.q) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 5:
                com.yandex.plus.bdui.plus.checkout.action.c cVar2 = (com.yandex.plus.bdui.plus.checkout.action.c) obj;
                cVar2.getClass();
                l6bVar.getClass();
                return new com.yandex.plus.bdui.plus.checkout.action.serializer.f(new com.yandex.plus.bdui.plus.checkout.action.serializer.i(cVar2.a, com.yandex.plus.bdui.flex.ui.a.N(cVar2.b)), new com.yandex.plus.bdui.plus.checkout.action.serializer.c(cVar2.c, cVar2.d));
            case 6:
                ((com.yandex.plus.bdui.plus.checkout.action.d) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 7:
                ((com.yandex.plus.bdui.plus.checkout.action.e) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 8:
                com.yandex.plus.bdui.plus.checkout.action.f fVar = (com.yandex.plus.bdui.plus.checkout.action.f) obj;
                fVar.getClass();
                l6bVar.getClass();
                return new i0(new f0(fVar.a));
            case 9:
                com.yandex.plus.bdui.plus.checkout.action.g gVar = (com.yandex.plus.bdui.plus.checkout.action.g) obj;
                gVar.getClass();
                l6bVar.getClass();
                return new o0(new l0(gVar.a, gVar.b, gVar.c));
            case 10:
                ((com.yandex.plus.bdui.plus.checkout.content.f) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 11:
                ((com.yandex.plus.bdui.plus.checkout.content.k) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 12:
                ((com.yandex.plus.bdui.plus.checkout.content.o) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 13:
                ((com.yandex.plus.bdui.plus.checkout.content.r) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 14:
                ((com.yandex.plus.bdui.plus.checkout.content.s) obj).getClass();
                l6bVar.getClass();
                a();
                throw null;
            case 15:
                com.yandex.plus.bdui.plus.shared.a aVar = (com.yandex.plus.bdui.plus.shared.a) obj;
                aVar.getClass();
                l6bVar.getClass();
                return new com.yandex.plus.bdui.plus.shared.d(aVar.b());
            default:
                com.yandex.plus.bdui.plus.shared.h hVar2 = (com.yandex.plus.bdui.plus.shared.h) obj;
                hVar2.getClass();
                l6bVar.getClass();
                return new com.yandex.plus.bdui.plus.shared.serializer.j(hVar2.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [c5b] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    @Override // com.yandex.plus.bdui.plus.utils.a
    public final Object c(Object obj, eg7 eg7Var) {
        ?? r10;
        com.yandex.plus.pay.inapp.api.h hVar;
        com.yandex.plus.pay.inapp.api.g gVar;
        com.yandex.plus.pay.inapp.api.h hVar2;
        com.yandex.plus.pay.inapp.api.g gVar2;
        switch (this.e) {
            case 0:
                c cVar = (c) obj;
                cVar.getClass();
                eg7Var.getClass();
                return new com.yandex.plus.bdui.plus.action.d(cVar.a, cVar.c, cVar.b);
            case 1:
                k kVar = (k) obj;
                kVar.getClass();
                eg7Var.getClass();
                return new com.yandex.plus.bdui.plus.action.h(kVar.a, kVar.b);
            case 2:
                n nVar = (n) obj;
                nVar.getClass();
                eg7Var.getClass();
                return new com.yandex.plus.bdui.plus.action.l(nVar.a);
            case 3:
                b0 b0Var = (b0) obj;
                b0Var.getClass();
                eg7Var.getClass();
                List list = b0Var.a;
                if (list != null) {
                    List<y> list2 = list;
                    r10 = new ArrayList(v75.o(list2, 10));
                    for (y yVar : list2) {
                        r10.add(new com.yandex.plus.bdui.plus.action.c(yVar.a, yVar.b, yVar.c, yVar.d));
                    }
                } else {
                    r10 = c5b.a;
                }
                return new com.yandex.plus.bdui.plus.action.p(r10);
            case 4:
                e0 e0Var = (e0) obj;
                e0Var.getClass();
                eg7Var.getClass();
                return new com.yandex.plus.bdui.plus.action.q(e0Var.a);
            case 5:
                com.yandex.plus.bdui.plus.checkout.action.serializer.f fVar = (com.yandex.plus.bdui.plus.checkout.action.serializer.f) obj;
                fVar.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.checkout.action.serializer.i iVar = fVar.a;
                String str = iVar.b;
                str.getClass();
                byte[] decode = Base64.decode(str, 2);
                decode.getClass();
                String str2 = new String(decode, Charsets.UTF_8);
                w3f w3fVar = x3f.d;
                w3fVar.getClass();
                com.yandex.plus.pay.api.google.model.c cVar2 = (com.yandex.plus.pay.api.google.model.c) w3fVar.b(com.yandex.plus.pay.api.google.model.c.Companion.serializer(), str2);
                String str3 = iVar.a;
                cVar2.getClass();
                com.yandex.plus.bdui.plus.checkout.action.serializer.c cVar3 = fVar.b;
                return new com.yandex.plus.bdui.plus.checkout.action.c(str3, cVar2, cVar3.a, cVar3.b);
            case 6:
                com.yandex.plus.bdui.plus.checkout.action.serializer.w wVar = (com.yandex.plus.bdui.plus.checkout.action.serializer.w) obj;
                wVar.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.checkout.action.serializer.t tVar = wVar.a;
                String str4 = tVar.a;
                com.yandex.plus.bdui.plus.checkout.action.serializer.s sVar = tVar.b;
                if (sVar != null) {
                    int ordinal = sVar.b.ordinal();
                    if (ordinal == 0) {
                        gVar = com.yandex.plus.pay.inapp.api.g.a;
                    } else {
                        if (ordinal != 1) {
                            b6e.s();
                            return null;
                        }
                        gVar = com.yandex.plus.pay.inapp.api.g.b;
                    }
                    hVar = new com.yandex.plus.pay.inapp.api.h(sVar.a, gVar);
                } else {
                    hVar = null;
                }
                com.yandex.plus.pay.inapp.api.h hVar3 = hVar;
                com.yandex.plus.bdui.plus.checkout.action.serializer.l lVar = wVar.b;
                return new com.yandex.plus.bdui.plus.checkout.action.d(str4, hVar3, lVar.a, lVar.b, lVar.c);
            case 7:
                com.yandex.plus.bdui.plus.checkout.action.serializer.c0 c0Var = (com.yandex.plus.bdui.plus.checkout.action.serializer.c0) obj;
                c0Var.getClass();
                eg7Var.getClass();
                com.yandex.plus.bdui.plus.checkout.action.serializer.z zVar = c0Var.a;
                return new com.yandex.plus.bdui.plus.checkout.action.e(zVar.a, zVar.b);
            case 8:
                i0 i0Var = (i0) obj;
                i0Var.getClass();
                eg7Var.getClass();
                f0 f0Var = i0Var.a;
                return new com.yandex.plus.bdui.plus.checkout.action.f(f0Var.a, f0Var.b);
            case 9:
                o0 o0Var = (o0) obj;
                o0Var.getClass();
                eg7Var.getClass();
                l0 l0Var = o0Var.a;
                return new com.yandex.plus.bdui.plus.checkout.action.g(l0Var.a, l0Var.b, l0Var.c);
            case 10:
                ((i2) obj).getClass();
                eg7Var.getClass();
                return com.yandex.plus.bdui.plus.checkout.content.f.a;
            case 11:
                s4 s4Var = (s4) obj;
                s4Var.getClass();
                eg7Var.getClass();
                v4 v4Var = s4Var.a;
                List list3 = v4Var.a.a;
                if (list3 == null) {
                    list3 = c5b.a;
                }
                m4 m4Var = v4Var.b;
                return new com.yandex.plus.bdui.plus.checkout.content.k(list3, m4Var.a, m4Var.b, m4Var.c);
            case 12:
                p6 p6Var = (p6) obj;
                p6Var.getClass();
                eg7Var.getClass();
                m6 m6Var = p6Var.a;
                j6 j6Var = m6Var.a;
                String str5 = j6Var.a;
                i6 i6Var = j6Var.b;
                if (i6Var != null) {
                    int ordinal2 = i6Var.b.ordinal();
                    if (ordinal2 == 0) {
                        gVar2 = com.yandex.plus.pay.inapp.api.g.a;
                    } else {
                        if (ordinal2 != 1) {
                            b6e.s();
                            return null;
                        }
                        gVar2 = com.yandex.plus.pay.inapp.api.g.b;
                    }
                    hVar2 = new com.yandex.plus.pay.inapp.api.h(i6Var.a, gVar2);
                } else {
                    hVar2 = null;
                }
                com.yandex.plus.pay.inapp.api.h hVar4 = hVar2;
                b6 b6Var = m6Var.b;
                return new com.yandex.plus.bdui.plus.checkout.content.o(str5, hVar4, b6Var.a, b6Var.b, b6Var.c, b6Var.d);
            case 13:
                h8 h8Var = (h8) obj;
                h8Var.getClass();
                eg7Var.getClass();
                e8 e8Var = h8Var.a;
                b8 b8Var = e8Var.a;
                String str6 = b8Var.a;
                String str7 = b8Var.b;
                String str8 = b8Var.c;
                y7 y7Var = e8Var.b;
                return new com.yandex.plus.bdui.plus.checkout.content.r(str6, str7, str8, y7Var.a, y7Var.b, y7Var.c, y7Var.d);
            case 14:
                t8 t8Var = (t8) obj;
                t8Var.getClass();
                eg7Var.getClass();
                q8 q8Var = t8Var.a;
                n8 n8Var = q8Var.a;
                String str9 = n8Var.a;
                String str10 = n8Var.b;
                String str11 = n8Var.c;
                k8 k8Var = q8Var.b;
                return new com.yandex.plus.bdui.plus.checkout.content.s(str9, str10, str11, k8Var.a, k8Var.b, k8Var.c, k8Var.d);
            case 15:
                com.yandex.plus.bdui.plus.shared.d dVar = (com.yandex.plus.bdui.plus.shared.d) obj;
                dVar.getClass();
                eg7Var.getClass();
                Map map = dVar.a;
                if (map == null) {
                    map = e5b.a;
                    map.getClass();
                }
                return new com.yandex.plus.bdui.plus.shared.a(map);
            default:
                com.yandex.plus.bdui.plus.shared.serializer.j jVar = (com.yandex.plus.bdui.plus.shared.serializer.j) obj;
                jVar.getClass();
                eg7Var.getClass();
                return new com.yandex.plus.bdui.plus.shared.h(jVar.a);
        }
    }
}
