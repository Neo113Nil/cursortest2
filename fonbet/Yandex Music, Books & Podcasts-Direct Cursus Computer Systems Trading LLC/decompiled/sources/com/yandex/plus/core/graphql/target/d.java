package com.yandex.plus.core.graphql.target;

import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.core.graphql.type.e0;
import com.yandex.plus.core.graphql.type.h;
import com.yandex.plus.core.graphql.type.t0;
import com.yandex.plus.home.internal.di.f;
import com.yandex.plus.home.internal.di.g;
import com.yandex.plus.metrica.utils.i;
import defpackage.cg6;
import defpackage.jwj;
import defpackage.nm6;
import defpackage.q7g;
import defpackage.qgg;
import defpackage.xq0;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class d {
    public final a a;
    public final String b;
    public final com.yandex.plus.core.locale.a c;
    public final i d;
    public final f e;
    public final f f;
    public final g g;
    public final f h;

    public d(a aVar, String str, com.yandex.plus.core.locale.a aVar2, i iVar, f fVar, f fVar2, g gVar, f fVar3) {
        aVar.getClass();
        this.a = aVar;
        this.b = str;
        this.c = aVar2;
        this.d = iVar;
        this.e = fVar;
        this.f = fVar2;
        this.g = gVar;
        this.h = fVar3;
    }

    public static /* synthetic */ Object b(d dVar, String str, h hVar, String str2, cg6 cg6Var, int i) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        return dVar.a(str, hVar, str2, cg6Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, h hVar, String str2, cg6 cg6Var) {
        c cVar;
        int i;
        String str3;
        h hVar2;
        Object invoke;
        String str4;
        if (cg6Var instanceof c) {
            cVar = (c) cg6Var;
            int i2 = cVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.o = i2 - Integer.MIN_VALUE;
                Object obj = cVar.m;
                nm6 nm6Var = nm6.a;
                i = cVar.o;
                if (i != 0) {
                    qgg.h0(obj);
                    str3 = str;
                    cVar.j = str3;
                    hVar2 = hVar;
                    cVar.k = hVar2;
                    cVar.l = str2;
                    cVar.o = 1;
                    invoke = this.g.invoke(cVar);
                    if (invoke == nm6Var) {
                        return nm6Var;
                    }
                    str4 = str2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str4 = cVar.l;
                    hVar2 = cVar.k;
                    String str5 = cVar.j;
                    qgg.h0(obj);
                    invoke = obj;
                    str3 = str5;
                }
                b bVar = (b) invoke;
                q7g K = r1.K(e0.ANDROID);
                q7g K2 = r1.K(hVar2);
                q7g K3 = r1.K(str3);
                String m = com.yandex.plus.core.locale.b.m(this.c);
                this.a.a.getClass();
                q7g K4 = r1.K(this.e.invoke());
                q7g K5 = r1.K(this.h.invoke());
                Set set = (Set) this.f.invoke();
                q7g K6 = r1.K(set == null ? CollectionsKt.w0(set) : null);
                q7g K7 = r1.K(this.b);
                q7g K8 = r1.K("110.0.0");
                q7g K9 = r1.K(this.d.b());
                q7g K10 = r1.K(str4);
                q7g K11 = r1.K(bVar == null ? bVar.a : null);
                q7g K12 = r1.K(bVar == null ? Boolean.valueOf(bVar.b) : null);
                q7g K13 = r1.K(bVar != null ? bVar.c : null);
                jwj jwjVar = jwj.f;
                return new t0(K9, K7, jwjVar, K2, jwjVar, jwjVar, K6, jwjVar, K11, K12, m, jwjVar, jwjVar, jwjVar, K10, jwjVar, jwjVar, K3, K, jwjVar, K13, K8, jwjVar, "music", jwjVar, jwjVar, K4, K5);
            }
        }
        cVar = new c(this, cg6Var);
        Object obj2 = cVar.m;
        nm6 nm6Var2 = nm6.a;
        i = cVar.o;
        if (i != 0) {
        }
        b bVar2 = (b) invoke;
        q7g K14 = r1.K(e0.ANDROID);
        q7g K22 = r1.K(hVar2);
        q7g K32 = r1.K(str3);
        String m2 = com.yandex.plus.core.locale.b.m(this.c);
        this.a.a.getClass();
        q7g K42 = r1.K(this.e.invoke());
        q7g K52 = r1.K(this.h.invoke());
        Set set2 = (Set) this.f.invoke();
        q7g K62 = r1.K(set2 == null ? CollectionsKt.w0(set2) : null);
        q7g K72 = r1.K(this.b);
        q7g K82 = r1.K("110.0.0");
        q7g K92 = r1.K(this.d.b());
        q7g K102 = r1.K(str4);
        q7g K112 = r1.K(bVar2 == null ? bVar2.a : null);
        q7g K122 = r1.K(bVar2 == null ? Boolean.valueOf(bVar2.b) : null);
        q7g K132 = r1.K(bVar2 != null ? bVar2.c : null);
        jwj jwjVar2 = jwj.f;
        return new t0(K92, K72, jwjVar2, K22, jwjVar2, jwjVar2, K62, jwjVar2, K112, K122, m2, jwjVar2, jwjVar2, jwjVar2, K102, jwjVar2, jwjVar2, K32, K14, jwjVar2, K132, K82, jwjVar2, "music", jwjVar2, jwjVar2, K42, K52);
    }
}
