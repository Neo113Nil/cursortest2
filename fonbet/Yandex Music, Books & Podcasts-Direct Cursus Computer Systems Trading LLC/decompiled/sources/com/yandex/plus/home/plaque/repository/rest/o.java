package com.yandex.plus.home.plaque.repository.rest;

import com.yandex.plus.bdui.flex.ui.s;
import com.yandex.plus.home.datasource.openapi.apis.CrossPlaqueControllerApi;
import com.yandex.plus.home.datasource.openapi.models.e8;
import com.yandex.plus.home.datasource.openapi.models.g0;
import com.yandex.plus.home.datasource.openapi.models.g4;
import com.yandex.plus.home.datasource.openapi.models.g7;
import com.yandex.plus.home.datasource.openapi.models.j0;
import com.yandex.plus.home.datasource.openapi.models.j5;
import com.yandex.plus.home.datasource.openapi.models.j7;
import com.yandex.plus.home.datasource.openapi.models.n3;
import com.yandex.plus.home.datasource.openapi.models.t7;
import com.yandex.plus.home.datasource.openapi.models.z7;
import com.yandex.plus.plaquesdk.plaque.api.models.i0;
import defpackage.b6e;
import defpackage.c5b;
import defpackage.cg6;
import defpackage.e5b;
import defpackage.gld;
import defpackage.inr;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oi3;
import defpackage.oqi;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.rqi;
import defpackage.t75;
import defpackage.t7o;
import defpackage.ujd;
import defpackage.v24;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.ydr;
import defpackage.z7o;
import defpackage.zsd;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class o implements com.yandex.plus.home.plaque.repository.api.a {
    public final CrossPlaqueControllerApi a;
    public final com.yandex.passport.internal.core.accounts.h b;
    public final com.yandex.plus.core.openapi.g c;
    public final com.yandex.plus.core.location.a d;
    public final com.yandex.plus.home.k e;
    public final com.yandex.plus.home.plaque.plugin.internal.di.a f;
    public final com.yandex.plus.home.k g;
    public final com.yandex.plus.home.plaque.plugin.internal.di.b h;
    public final com.yandex.plus.home.k i;
    public final com.yandex.plus.home.k j;
    public final com.yandex.plus.home.k k;
    public final com.yandex.plus.home.core.network.d l;
    public final com.yandex.plus.log.api.b m;
    public final kotlinx.coroutines.a n;
    public final xdr o;
    public final x0q p;
    public final xdr q;
    public final xdr r;
    public final com.yandex.passport.internal.core.accounts.h s;
    public final qqi t;

    public o(CrossPlaqueControllerApi crossPlaqueControllerApi, com.yandex.passport.internal.core.accounts.h hVar, com.yandex.plus.core.openapi.g gVar, com.yandex.plus.core.location.a aVar, s sVar, com.yandex.plus.core.imageloader.b bVar, com.yandex.plus.home.k kVar, com.yandex.plus.home.plaque.plugin.internal.di.a aVar2, com.yandex.plus.home.k kVar2, com.yandex.plus.home.plaque.plugin.internal.di.b bVar2, com.yandex.plus.home.k kVar3, com.yandex.plus.home.k kVar4, com.yandex.plus.home.k kVar5, com.yandex.plus.home.core.network.d dVar, com.yandex.plus.log.api.b bVar3, mm6 mm6Var, kotlinx.coroutines.a aVar3) {
        crossPlaqueControllerApi.getClass();
        gVar.getClass();
        aVar.getClass();
        dVar.getClass();
        bVar3.getClass();
        mm6Var.getClass();
        aVar3.getClass();
        this.a = crossPlaqueControllerApi;
        this.b = hVar;
        this.c = gVar;
        this.d = aVar;
        this.e = kVar;
        this.f = aVar2;
        this.g = kVar2;
        this.h = bVar2;
        this.i = kVar3;
        this.j = kVar4;
        this.k = kVar5;
        this.l = dVar;
        this.m = bVar3;
        this.n = aVar3;
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        this.o = ydr.a(e5bVar);
        x0q b = y0q.b(1, 0, oi3.b, 2);
        b.a(null);
        this.p = b;
        this.q = ydr.a(Boolean.FALSE);
        this.r = ydr.a(null);
        this.s = new com.yandex.passport.internal.core.accounts.h(sVar, bVar, mm6Var, aVar3);
        this.t = rqi.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x022b A[Catch: all -> 0x023f, TRY_LEAVE, TryCatch #8 {all -> 0x023f, blocks: (B:108:0x0224, B:113:0x022b), top: B:107:0x0224 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x03ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0353 A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:14:0x003f, B:16:0x0386, B:29:0x034e, B:32:0x0353, B:34:0x035c, B:38:0x0359, B:42:0x0311, B:47:0x02da, B:49:0x02de, B:55:0x031a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0359 A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:14:0x003f, B:16:0x0386, B:29:0x034e, B:32:0x0353, B:34:0x035c, B:38:0x0359, B:42:0x0311, B:47:0x02da, B:49:0x02de, B:55:0x031a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02de A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:14:0x003f, B:16:0x0386, B:29:0x034e, B:32:0x0353, B:34:0x035c, B:38:0x0359, B:42:0x0311, B:47:0x02da, B:49:0x02de, B:55:0x031a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x031a A[Catch: all -> 0x0045, TryCatch #4 {all -> 0x0045, blocks: (B:14:0x003f, B:16:0x0386, B:29:0x034e, B:32:0x0353, B:34:0x035c, B:38:0x0359, B:42:0x0311, B:47:0x02da, B:49:0x02de, B:55:0x031a), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0296 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00d7  */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r15v4, types: [com.yandex.plus.home.benchmark.b, com.yandex.plus.home.plaque.repository.rest.o, oqi] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.yandex.plus.home.datasource.openapi.models.j5] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v29, types: [com.yandex.plus.home.benchmark.b, com.yandex.plus.home.datasource.openapi.models.j5, com.yandex.plus.home.plaque.repository.rest.o, java.lang.Object, oqi] */
    /* JADX WARN: Type inference failed for: r1v34, types: [com.yandex.plus.home.benchmark.b, com.yandex.plus.home.datasource.openapi.models.j5, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v37, types: [com.yandex.plus.home.benchmark.b, com.yandex.plus.home.datasource.openapi.models.j5, com.yandex.plus.home.plaque.repository.rest.a] */
    /* JADX WARN: Type inference failed for: r1v47 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v62 */
    /* JADX WARN: Type inference failed for: r1v66 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v49, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v56 */
    /* JADX WARN: Type inference failed for: r2v57 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(o oVar, j5 j5Var, boolean z, Map map, com.yandex.plus.home.benchmark.b bVar, Continuation continuation) {
        i iVar;
        ?? r2;
        Object obj;
        oqi oqiVar;
        com.yandex.plus.home.benchmark.b bVar2;
        j5 j5Var2;
        boolean z2;
        Object obj2;
        Map map2;
        ?? r1;
        Map map3;
        boolean z3;
        ?? r15;
        j5 j5Var3;
        a aVar;
        boolean z4;
        Object obj3;
        int i;
        com.yandex.plus.home.plaque.repository.api.model.d dVar;
        Map map4;
        com.yandex.plus.home.plaque.repository.api.model.d dVar2;
        int i2;
        a aVar2;
        boolean z5;
        Map map5;
        j5 j5Var4;
        oqi oqiVar2;
        int i3;
        int i4;
        ?? r152;
        oqi oqiVar3;
        com.yandex.plus.home.plaque.repository.api.model.d dVar3;
        oqi oqiVar4;
        com.yandex.plus.home.plaque.repository.api.model.d dVar4;
        a aVar3;
        Object Q;
        a aVar4;
        com.yandex.plus.home.plaque.repository.api.model.d dVar5;
        oqi oqiVar5;
        com.yandex.plus.home.plaque.repository.api.model.d dVar6;
        oqi oqiVar6;
        a aVar5;
        int i5;
        com.yandex.plus.home.plaque.repository.api.model.d dVar7;
        com.yandex.plus.home.plaque.repository.api.model.d dVar8;
        ?? r12;
        com.yandex.plus.log.api.a aVar6;
        Object V;
        int i6;
        oqi oqiVar7;
        boolean z6;
        int i7;
        o oVar2;
        ?? r13;
        String str;
        Map map6;
        o oVar3;
        List list;
        boolean z7;
        oqi oqiVar8;
        g7 g7Var;
        oqi oqiVar9;
        String str2;
        Object i8;
        oqi oqiVar10;
        com.yandex.plus.home.plaque.repository.api.model.d dVar9;
        o oVar4 = oVar;
        com.yandex.passport.internal.core.accounts.h hVar = oVar4.b;
        kotlinx.coroutines.a aVar7 = (kotlinx.coroutines.a) hVar.c;
        oqi oqiVar11 = oVar4.t;
        com.yandex.plus.log.api.b bVar3 = oVar4.m;
        try {
            try {
                if (continuation instanceof i) {
                    iVar = (i) continuation;
                    int i9 = iVar.x;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        iVar.x = i9 - Integer.MIN_VALUE;
                        i iVar2 = iVar;
                        Object obj4 = iVar2.v;
                        nm6 nm6Var = nm6.a;
                        r2 = iVar2.x;
                        switch (r2) {
                            case 0:
                                qgg.h0(obj4);
                                iVar2.j = j5Var;
                                iVar2.k = map;
                                bVar2 = bVar;
                                iVar2.l = bVar2;
                                iVar2.r = z;
                                iVar2.x = 1;
                                Object g = oVar4.g(iVar2);
                                if (g != nm6Var) {
                                    j5Var2 = j5Var;
                                    z2 = z;
                                    obj2 = g;
                                    map2 = map;
                                    com.yandex.plus.home.benchmark.b bVar4 = bVar2;
                                    a aVar8 = (a) obj2;
                                    if (j5Var2 == null) {
                                        com.yandex.plus.log.api.a aVar9 = com.yandex.plus.log.api.a.b;
                                        if (bVar3.b(aVar9)) {
                                            bVar3.c(aVar9, "RestPlaqueRepository", "try construct network config");
                                        }
                                        List list2 = j5Var2.b;
                                        g7 g7Var2 = j5Var2.a;
                                        List list3 = j5Var2.e;
                                        i0 i0Var = i0.a;
                                        iVar2.j = j5Var2;
                                        iVar2.k = map2;
                                        iVar2.l = null;
                                        iVar2.m = aVar8;
                                        iVar2.n = null;
                                        iVar2.r = z2;
                                        iVar2.s = 0;
                                        iVar2.x = 2;
                                        boolean z8 = z2;
                                        j5 j5Var5 = j5Var2;
                                        r15 = 0;
                                        Object i10 = oVar.i(list2, g7Var2, list3, map2, bVar4, i0Var, iVar2);
                                        if (i10 != nm6Var) {
                                            j5Var3 = j5Var5;
                                            aVar = aVar8;
                                            z4 = z8;
                                            obj3 = i10;
                                            i = 0;
                                            dVar = (com.yandex.plus.home.plaque.repository.api.model.d) obj3;
                                            if (dVar == null) {
                                                iVar2.j = j5Var3;
                                                iVar2.k = map2;
                                                iVar2.l = r15;
                                                iVar2.m = aVar;
                                                iVar2.n = r15;
                                                iVar2.o = dVar;
                                                iVar2.p = r15;
                                                iVar2.q = oqiVar11;
                                                iVar2.r = z4;
                                                iVar2.s = i;
                                                iVar2.t = 0;
                                                iVar2.u = 0;
                                                iVar2.x = 3;
                                                if (oqiVar11.a(iVar2) != nm6Var) {
                                                    a aVar10 = aVar;
                                                    i2 = i;
                                                    aVar2 = aVar10;
                                                    z5 = z4;
                                                    map5 = map2;
                                                    j5Var4 = j5Var3;
                                                    oqiVar2 = oqiVar11;
                                                    i3 = 0;
                                                    i4 = 0;
                                                    r152 = r15;
                                                    try {
                                                        iVar2.j = r152;
                                                        try {
                                                            iVar2.k = map5;
                                                            r152 = 0;
                                                            boolean z9 = false;
                                                            iVar2.l = null;
                                                            iVar2.m = aVar2;
                                                            iVar2.n = null;
                                                            iVar2.o = dVar;
                                                            iVar2.p = null;
                                                            iVar2.q = oqiVar2;
                                                            iVar2.r = z5;
                                                            iVar2.s = i2;
                                                            iVar2.t = i4;
                                                            iVar2.u = i3;
                                                            iVar2.x = 4;
                                                            dVar4 = dVar;
                                                            oqiVar3 = oqiVar2;
                                                            aVar3 = aVar2;
                                                            try {
                                                                oVar4 = oVar;
                                                                dVar3 = null;
                                                            } catch (Throwable th) {
                                                                th = th;
                                                                dVar3 = null;
                                                            }
                                                        } catch (Throwable th2) {
                                                            th = th2;
                                                            oqiVar3 = oqiVar2;
                                                            dVar3 = null;
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        oqiVar3 = oqiVar2;
                                                        dVar3 = r152;
                                                    }
                                                    try {
                                                        Q = gld.Q(new v24((Object) oVar, (Object) aVar3, (Object) j5Var4, (Continuation) (z9 ? 1 : 0), 24), iVar2);
                                                        if (Q == nm6Var) {
                                                            Q = Unit.a;
                                                        }
                                                        if (Q != nm6Var) {
                                                            boolean z10 = z5;
                                                            aVar4 = aVar3;
                                                            z4 = z10;
                                                            dVar5 = dVar4;
                                                            map4 = map5;
                                                            oqiVar5 = oqiVar3;
                                                            dVar8 = dVar3;
                                                            oqiVar5.b(dVar8);
                                                            dVar2 = dVar5;
                                                            aVar = aVar4;
                                                            dVar7 = dVar8;
                                                            if (dVar2 != null) {
                                                                return dVar2;
                                                            }
                                                            z3 = z4;
                                                            aVar8 = aVar;
                                                            map3 = map4;
                                                            r1 = dVar7;
                                                            iVar2.j = r1;
                                                            iVar2.k = map3;
                                                            iVar2.l = r1;
                                                            iVar2.m = aVar8;
                                                            iVar2.n = oqiVar11;
                                                            iVar2.o = r1;
                                                            iVar2.p = r1;
                                                            iVar2.q = r1;
                                                            iVar2.r = z3;
                                                            iVar2.s = 0;
                                                            iVar2.x = 5;
                                                            if (oqiVar11.a(iVar2) != nm6Var) {
                                                                oqiVar6 = oqiVar11;
                                                                aVar5 = aVar8;
                                                                i5 = 0;
                                                                r12 = r1;
                                                                try {
                                                                    aVar6 = com.yandex.plus.log.api.a.b;
                                                                    if (bVar3.b(aVar6)) {
                                                                        try {
                                                                            StringBuilder sb = new StringBuilder("try construct cached config, showPrefetch=");
                                                                            sb.append(!z3);
                                                                            bVar3.c(aVar6, "RestPlaqueRepository", sb.toString());
                                                                        } catch (Throwable th4) {
                                                                            th = th4;
                                                                            obj = r12;
                                                                            oqiVar = oqiVar6;
                                                                            oqiVar.b(obj);
                                                                            throw th;
                                                                        }
                                                                    }
                                                                    iVar2.j = r12;
                                                                    iVar2.k = map3;
                                                                    iVar2.l = r12;
                                                                    iVar2.m = aVar5;
                                                                    iVar2.n = oqiVar6;
                                                                    iVar2.o = oVar4;
                                                                    iVar2.r = z3;
                                                                    iVar2.s = i5;
                                                                    iVar2.t = 0;
                                                                    iVar2.x = 6;
                                                                    V = x97.V(aVar7, new com.yandex.plus.home.plaque.plugin.internal.defaults.d(hVar, aVar5, r12, 2), iVar2);
                                                                    if (V != nm6Var) {
                                                                        boolean z11 = z3;
                                                                        i6 = i5;
                                                                        oqiVar7 = oqiVar6;
                                                                        z6 = z11;
                                                                        i7 = 0;
                                                                        oVar2 = oVar4;
                                                                        r13 = r12;
                                                                        List list4 = (List) V;
                                                                        if (z6) {
                                                                            Map map7 = map3;
                                                                            str = "RestPlaqueRepository";
                                                                            iVar2.j = r13;
                                                                            iVar2.k = map7;
                                                                            iVar2.l = r13;
                                                                            iVar2.m = r13;
                                                                            iVar2.n = oqiVar7;
                                                                            iVar2.o = list4;
                                                                            iVar2.p = oVar2;
                                                                            iVar2.r = z6;
                                                                            iVar2.s = i6;
                                                                            iVar2.t = i7;
                                                                            iVar2.x = 8;
                                                                            obj4 = x97.V(aVar7, new com.yandex.plus.home.plaque.plugin.internal.defaults.d(hVar, aVar5, null, 1), iVar2);
                                                                            if (obj4 != nm6Var) {
                                                                                map6 = map7;
                                                                                oVar3 = oVar2;
                                                                                list = list4;
                                                                                z7 = z6;
                                                                                oqiVar10 = oqiVar7;
                                                                                g7Var = (g7) obj4;
                                                                                oqiVar9 = oqiVar10;
                                                                                int i11 = i7;
                                                                                g7 g7Var3 = g7Var;
                                                                                List list5 = list;
                                                                                Map map8 = map6;
                                                                                i0 i0Var2 = !z7 ? i0.d : i0.c;
                                                                                iVar2.j = null;
                                                                                iVar2.k = null;
                                                                                iVar2.l = null;
                                                                                iVar2.m = null;
                                                                                iVar2.n = oqiVar9;
                                                                                iVar2.o = null;
                                                                                iVar2.p = null;
                                                                                iVar2.r = z7;
                                                                                iVar2.s = i6;
                                                                                iVar2.t = i11;
                                                                                iVar2.x = 9;
                                                                                str2 = str;
                                                                                i8 = oVar3.i(list5, g7Var3, null, map8, null, i0Var2, iVar2);
                                                                                if (i8 != nm6Var) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            iVar2.j = r13;
                                                                            iVar2.k = map3;
                                                                            iVar2.l = null;
                                                                            iVar2.m = null;
                                                                            iVar2.n = oqiVar7;
                                                                            iVar2.o = list4;
                                                                            iVar2.p = oVar2;
                                                                            iVar2.r = z6;
                                                                            iVar2.s = i6;
                                                                            iVar2.t = i7;
                                                                            iVar2.x = 7;
                                                                            Map map9 = map3;
                                                                            str = "RestPlaqueRepository";
                                                                            obj4 = x97.V(aVar7, new com.yandex.plus.home.plaque.plugin.internal.defaults.d(hVar, aVar5, null, 0), iVar2);
                                                                            if (obj4 != nm6Var) {
                                                                                map6 = map9;
                                                                                oVar3 = oVar2;
                                                                                list = list4;
                                                                                z7 = z6;
                                                                                oqiVar8 = oqiVar7;
                                                                                g7Var = (g7) obj4;
                                                                                oqiVar9 = oqiVar8;
                                                                                int i112 = i7;
                                                                                g7 g7Var32 = g7Var;
                                                                                List list52 = list;
                                                                                Map map82 = map6;
                                                                                i0 i0Var22 = !z7 ? i0.d : i0.c;
                                                                                iVar2.j = null;
                                                                                iVar2.k = null;
                                                                                iVar2.l = null;
                                                                                iVar2.m = null;
                                                                                iVar2.n = oqiVar9;
                                                                                iVar2.o = null;
                                                                                iVar2.p = null;
                                                                                iVar2.r = z7;
                                                                                iVar2.s = i6;
                                                                                iVar2.t = i112;
                                                                                iVar2.x = 9;
                                                                                str2 = str;
                                                                                i8 = oVar3.i(list52, g7Var32, null, map82, null, i0Var22, iVar2);
                                                                                if (i8 != nm6Var) {
                                                                                    return nm6Var;
                                                                                }
                                                                                obj4 = i8;
                                                                                r2 = oqiVar9;
                                                                                dVar9 = (com.yandex.plus.home.plaque.repository.api.model.d) obj4;
                                                                                r2.b(null);
                                                                                if (dVar9 == null) {
                                                                                    return dVar9;
                                                                                }
                                                                                com.yandex.plus.log.api.a aVar11 = com.yandex.plus.log.api.a.b;
                                                                                if (bVar3.b(aVar11)) {
                                                                                    bVar3.c(aVar11, str2, "fallback to empty config");
                                                                                }
                                                                                oVar4.s.getClass();
                                                                                return new com.yandex.plus.home.plaque.repository.api.model.d(c5b.a, t75.c(com.yandex.plus.home.plaque.repository.api.model.b.g));
                                                                            }
                                                                        }
                                                                    }
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    r2 = oqiVar6;
                                                                    obj = null;
                                                                    oqiVar = r2;
                                                                    oqiVar.b(obj);
                                                                    throw th;
                                                                }
                                                            }
                                                        }
                                                    } catch (Throwable th6) {
                                                        th = th6;
                                                        oqiVar4 = oqiVar3;
                                                        dVar6 = dVar3;
                                                        oqiVar4.b(dVar6);
                                                        throw th;
                                                    }
                                                }
                                            } else {
                                                oVar4 = oVar;
                                                com.yandex.plus.home.plaque.repository.api.model.d dVar10 = r15;
                                                map4 = map2;
                                                dVar2 = dVar10;
                                                dVar7 = dVar10;
                                                if (dVar2 != null) {
                                                }
                                            }
                                        }
                                    } else {
                                        boolean z12 = z2;
                                        r1 = 0;
                                        map3 = map2;
                                        z3 = z12;
                                        iVar2.j = r1;
                                        iVar2.k = map3;
                                        iVar2.l = r1;
                                        iVar2.m = aVar8;
                                        iVar2.n = oqiVar11;
                                        iVar2.o = r1;
                                        iVar2.p = r1;
                                        iVar2.q = r1;
                                        iVar2.r = z3;
                                        iVar2.s = 0;
                                        iVar2.x = 5;
                                        if (oqiVar11.a(iVar2) != nm6Var) {
                                        }
                                    }
                                }
                                return nm6Var;
                            case 1:
                                obj2 = obj4;
                                z2 = iVar2.r;
                                bVar2 = iVar2.l;
                                Map map10 = iVar2.k;
                                j5 j5Var6 = iVar2.j;
                                qgg.h0(obj2);
                                j5Var2 = j5Var6;
                                map2 = map10;
                                com.yandex.plus.home.benchmark.b bVar42 = bVar2;
                                a aVar82 = (a) obj2;
                                if (j5Var2 == null) {
                                }
                                break;
                            case 2:
                                obj3 = obj4;
                                i = iVar2.s;
                                z4 = iVar2.r;
                                aVar = iVar2.m;
                                map2 = iVar2.k;
                                j5Var3 = iVar2.j;
                                qgg.h0(obj3);
                                r15 = 0;
                                dVar = (com.yandex.plus.home.plaque.repository.api.model.d) obj3;
                                if (dVar == null) {
                                }
                                break;
                            case 3:
                                i3 = iVar2.u;
                                i4 = iVar2.t;
                                int i12 = iVar2.s;
                                z5 = iVar2.r;
                                oqi oqiVar12 = iVar2.q;
                                com.yandex.plus.home.plaque.repository.api.model.d dVar11 = (com.yandex.plus.home.plaque.repository.api.model.d) iVar2.o;
                                a aVar12 = iVar2.m;
                                Map map11 = iVar2.k;
                                j5 j5Var7 = iVar2.j;
                                qgg.h0(obj4);
                                map5 = map11;
                                j5Var4 = j5Var7;
                                dVar = dVar11;
                                i2 = i12;
                                oqiVar2 = oqiVar12;
                                aVar2 = aVar12;
                                r152 = 0;
                                iVar2.j = r152;
                                iVar2.k = map5;
                                r152 = 0;
                                boolean z92 = false;
                                iVar2.l = null;
                                iVar2.m = aVar2;
                                iVar2.n = null;
                                iVar2.o = dVar;
                                iVar2.p = null;
                                iVar2.q = oqiVar2;
                                iVar2.r = z5;
                                iVar2.s = i2;
                                iVar2.t = i4;
                                iVar2.u = i3;
                                iVar2.x = 4;
                                dVar4 = dVar;
                                oqiVar3 = oqiVar2;
                                aVar3 = aVar2;
                                oVar4 = oVar;
                                dVar3 = null;
                                Q = gld.Q(new v24((Object) oVar, (Object) aVar3, (Object) j5Var4, (Continuation) (z92 ? 1 : 0), 24), iVar2);
                                if (Q == nm6Var) {
                                }
                                if (Q != nm6Var) {
                                }
                                return nm6Var;
                            case 4:
                                z4 = iVar2.r;
                                oqi oqiVar13 = iVar2.q;
                                com.yandex.plus.home.plaque.repository.api.model.d dVar12 = (com.yandex.plus.home.plaque.repository.api.model.d) iVar2.o;
                                aVar4 = iVar2.m;
                                map4 = iVar2.k;
                                try {
                                    qgg.h0(obj4);
                                    dVar5 = dVar12;
                                    dVar8 = null;
                                    oqiVar5 = oqiVar13;
                                    oqiVar5.b(dVar8);
                                    dVar2 = dVar5;
                                    aVar = aVar4;
                                    dVar7 = dVar8;
                                    if (dVar2 != null) {
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    dVar6 = null;
                                    oqiVar4 = oqiVar13;
                                    oqiVar4.b(dVar6);
                                    throw th;
                                }
                                break;
                            case 5:
                                i5 = iVar2.s;
                                z3 = iVar2.r;
                                oqi oqiVar14 = iVar2.n;
                                a aVar13 = iVar2.m;
                                map3 = iVar2.k;
                                qgg.h0(obj4);
                                oqiVar6 = oqiVar14;
                                r12 = 0;
                                aVar5 = aVar13;
                                aVar6 = com.yandex.plus.log.api.a.b;
                                if (bVar3.b(aVar6)) {
                                }
                                iVar2.j = r12;
                                iVar2.k = map3;
                                iVar2.l = r12;
                                iVar2.m = aVar5;
                                iVar2.n = oqiVar6;
                                iVar2.o = oVar4;
                                iVar2.r = z3;
                                iVar2.s = i5;
                                iVar2.t = 0;
                                iVar2.x = 6;
                                V = x97.V(aVar7, new com.yandex.plus.home.plaque.plugin.internal.defaults.d(hVar, aVar5, r12, 2), iVar2);
                                if (V != nm6Var) {
                                }
                                return nm6Var;
                            case 6:
                                i7 = iVar2.t;
                                int i13 = iVar2.s;
                                boolean z13 = iVar2.r;
                                oVar2 = (o) iVar2.o;
                                oqi oqiVar15 = iVar2.n;
                                aVar5 = iVar2.m;
                                Map map12 = iVar2.k;
                                try {
                                    qgg.h0(obj4);
                                    z6 = z13;
                                    i6 = i13;
                                    oqiVar7 = oqiVar15;
                                    map3 = map12;
                                    V = obj4;
                                    r13 = 0;
                                    List list42 = (List) V;
                                    if (z6) {
                                    }
                                    return nm6Var;
                                } catch (Throwable th8) {
                                    th = th8;
                                    r2 = oqiVar15;
                                    obj = null;
                                    oqiVar = r2;
                                    oqiVar.b(obj);
                                    throw th;
                                }
                            case 7:
                                int i14 = iVar2.t;
                                i6 = iVar2.s;
                                z7 = iVar2.r;
                                oVar3 = iVar2.p;
                                list = (List) iVar2.o;
                                oqi oqiVar16 = iVar2.n;
                                map6 = iVar2.k;
                                qgg.h0(obj4);
                                i7 = i14;
                                oqiVar8 = oqiVar16;
                                str = "RestPlaqueRepository";
                                g7Var = (g7) obj4;
                                oqiVar9 = oqiVar8;
                                int i1122 = i7;
                                g7 g7Var322 = g7Var;
                                List list522 = list;
                                Map map822 = map6;
                                i0 i0Var222 = !z7 ? i0.d : i0.c;
                                iVar2.j = null;
                                iVar2.k = null;
                                iVar2.l = null;
                                iVar2.m = null;
                                iVar2.n = oqiVar9;
                                iVar2.o = null;
                                iVar2.p = null;
                                iVar2.r = z7;
                                iVar2.s = i6;
                                iVar2.t = i1122;
                                iVar2.x = 9;
                                str2 = str;
                                i8 = oVar3.i(list522, g7Var322, null, map822, null, i0Var222, iVar2);
                                if (i8 != nm6Var) {
                                }
                                break;
                            case 8:
                                int i15 = iVar2.t;
                                i6 = iVar2.s;
                                z7 = iVar2.r;
                                oVar3 = iVar2.p;
                                list = (List) iVar2.o;
                                oqi oqiVar17 = iVar2.n;
                                map6 = iVar2.k;
                                qgg.h0(obj4);
                                i7 = i15;
                                oqiVar10 = oqiVar17;
                                str = "RestPlaqueRepository";
                                g7Var = (g7) obj4;
                                oqiVar9 = oqiVar10;
                                int i11222 = i7;
                                g7 g7Var3222 = g7Var;
                                List list5222 = list;
                                Map map8222 = map6;
                                i0 i0Var2222 = !z7 ? i0.d : i0.c;
                                iVar2.j = null;
                                iVar2.k = null;
                                iVar2.l = null;
                                iVar2.m = null;
                                iVar2.n = oqiVar9;
                                iVar2.o = null;
                                iVar2.p = null;
                                iVar2.r = z7;
                                iVar2.s = i6;
                                iVar2.t = i11222;
                                iVar2.x = 9;
                                str2 = str;
                                i8 = oVar3.i(list5222, g7Var3222, null, map8222, null, i0Var2222, iVar2);
                                if (i8 != nm6Var) {
                                }
                                break;
                            case 9:
                                oqi oqiVar18 = iVar2.n;
                                qgg.h0(obj4);
                                str2 = "RestPlaqueRepository";
                                r2 = oqiVar18;
                                dVar9 = (com.yandex.plus.home.plaque.repository.api.model.d) obj4;
                                r2.b(null);
                                if (dVar9 == null) {
                                }
                                break;
                            default:
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                        }
                    }
                }
                switch (r2) {
                }
            } catch (Throwable th9) {
                th = th9;
                r2 = aVar7;
            }
        } catch (Throwable th10) {
            th = th10;
        }
        iVar = new i(oVar4, continuation);
        i iVar22 = iVar;
        Object obj42 = iVar22.v;
        nm6 nm6Var2 = nm6.a;
        r2 = iVar22.x;
    }

    public static final void h(HashSet hashSet, LinkedHashMap linkedHashMap, String str) {
        hashSet.add(str);
        e8 e8Var = (e8) linkedHashMap.get(str);
        if (e8Var instanceof g0) {
            Iterator it = ((g0) e8Var).e.iterator();
            while (it.hasNext()) {
                h(hashSet, linkedHashMap, (String) it.next());
            }
        } else if (e8Var instanceof g4) {
            Iterator it2 = ((g4) e8Var).e.iterator();
            while (it2.hasNext()) {
                h(hashSet, linkedHashMap, (String) it2.next());
            }
        } else {
            if ((e8Var instanceof j0) || (e8Var instanceof n3) || (e8Var instanceof j7) || (e8Var instanceof t7) || (e8Var instanceof z7) || e8Var == null) {
                return;
            }
            b6e.s();
        }
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object a(String str, String str2, cg6 cg6Var) {
        Object V = x97.V(this.n, new l(this, str, str2, null), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object b(String str, String str2, cg6 cg6Var) {
        Object V = x97.V(this.n, new k(this, str, str2, null), cg6Var);
        return V == nm6.a ? V : Unit.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object c(int i, int i2, cg6 cg6Var) {
        return x97.V(this.n, new n(this, i, i2, null), cg6Var);
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final Object d(Map map, cg6 cg6Var) {
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.b;
        com.yandex.plus.log.api.b bVar = this.m;
        if (bVar.b(aVar)) {
            bVar.c(aVar, "RestPlaqueRepository", "updateTemplates(templates=" + map + ')');
        }
        this.o.l(map);
        return Unit.a;
    }

    @Override // com.yandex.plus.home.plaque.repository.api.a
    public final pjc e() {
        return zsd.k0(zsd.C(zsd.P(this.p, this.q, this.o, this.r, new ujd(5, this, o.class, "constructPlaqueConfig", "constructPlaqueConfig(Lcom/yandex/plus/home/datasource/openapi/models/NetworkPlaqueDefinitionsModel;ZLjava/util/Map;Lcom/yandex/plus/core/benchmark/DataFetchingBenchmark;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4)), -1), this.n);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(cg6 cg6Var) {
        j jVar;
        int i;
        Long l;
        boolean z;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                if (i != 0) {
                    qgg.h0(obj);
                    Long id = ((com.yandex.plus.domain.auth.api.e) this.g.invoke()).getId();
                    boolean booleanValue = ((Boolean) this.e.invoke()).booleanValue();
                    jVar.j = id;
                    jVar.k = booleanValue;
                    jVar.n = 1;
                    Object invoke = this.h.invoke(jVar);
                    if (invoke == nm6Var) {
                        return nm6Var;
                    }
                    l = id;
                    obj = invoke;
                    z = booleanValue;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = jVar.k;
                    l = jVar.j;
                    qgg.h0(obj);
                }
                return new a(l, z, (String) obj);
            }
        }
        jVar = new j(this, cg6Var);
        Object obj2 = jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jVar.n;
        if (i != 0) {
        }
        return new a(l, z, (String) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(List list, g7 g7Var, List list2, Map map, com.yandex.plus.home.benchmark.b bVar, i0 i0Var, cg6 cg6Var) {
        m mVar;
        int i;
        Object B;
        Map map2;
        com.yandex.plus.home.plaque.repository.api.model.b bVar2;
        List list3;
        Object obj;
        com.yandex.plus.home.benchmark.b bVar3;
        List O;
        com.yandex.plus.home.benchmark.b bVar4 = bVar;
        if (cg6Var instanceof m) {
            mVar = (m) cg6Var;
            int i2 = mVar.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar.q = i2 - Integer.MIN_VALUE;
                m mVar2 = mVar;
                Object obj2 = mVar2.o;
                nm6 nm6Var = nm6.a;
                i = mVar2.q;
                if (i != 0) {
                    qgg.h0(obj2);
                    if (list != null && g7Var != null) {
                        if (bVar4 != null) {
                            bVar4.e();
                        }
                        mVar2.j = list;
                        mVar2.k = list2;
                        mVar2.l = map;
                        mVar2.m = bVar4;
                        mVar2.q = 1;
                        B = this.s.B(g7Var, list, map, i0Var, mVar2);
                        if (B != nm6Var) {
                            map2 = map;
                        }
                        return nm6Var;
                    }
                    return null;
                }
                if (i != 1) {
                    if (i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.plus.home.plaque.repository.api.model.b bVar5 = mVar2.n;
                    bVar3 = mVar2.m;
                    Map map3 = mVar2.l;
                    List list4 = mVar2.k;
                    List list5 = mVar2.j;
                    qgg.h0(obj2);
                    obj = obj2;
                    bVar2 = bVar5;
                    list3 = (List) obj;
                    bVar4 = bVar3;
                    List c = t75.c(bVar2);
                    O = list3 != null ? CollectionsKt.O(list3) : null;
                    if (O == null) {
                        O = c5b.a;
                    }
                    com.yandex.plus.home.plaque.repository.api.model.d dVar = new com.yandex.plus.home.plaque.repository.api.model.d(O, c);
                    if (bVar4 != null) {
                        bVar4.d();
                    }
                    return dVar;
                }
                com.yandex.plus.home.benchmark.b bVar6 = mVar2.m;
                map2 = mVar2.l;
                list2 = mVar2.k;
                List list6 = mVar2.j;
                qgg.h0(obj2);
                B = ((z7o) obj2).a;
                bVar4 = bVar6;
                list = list6;
                r7o r7oVar = z7o.b;
                if (!(B instanceof t7o)) {
                    Throwable a = z7o.a(B);
                    if (a != null) {
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.e;
                        com.yandex.plus.log.api.b bVar7 = this.m;
                        if (bVar7.b(aVar)) {
                            bVar7.a(aVar, "RestPlaqueRepository", "can't map default plaque", a);
                        }
                    }
                    return null;
                }
                bVar2 = (com.yandex.plus.home.plaque.repository.api.model.b) B;
                if (list2 == null) {
                    list3 = null;
                    List c2 = t75.c(bVar2);
                    if (list3 != null) {
                    }
                    if (O == null) {
                    }
                    com.yandex.plus.home.plaque.repository.api.model.d dVar2 = new com.yandex.plus.home.plaque.repository.api.model.d(O, c2);
                    if (bVar4 != null) {
                    }
                    return dVar2;
                }
                inr inrVar = new inr(list2, (Continuation) null, this, list, map2);
                mVar2.j = null;
                mVar2.k = null;
                mVar2.l = null;
                mVar2.m = bVar4;
                mVar2.n = bVar2;
                mVar2.q = 2;
                Object Q = gld.Q(inrVar, mVar2);
                if (Q != nm6Var) {
                    obj = Q;
                    bVar3 = bVar4;
                    list3 = (List) obj;
                    bVar4 = bVar3;
                    List c22 = t75.c(bVar2);
                    if (list3 != null) {
                    }
                    if (O == null) {
                    }
                    com.yandex.plus.home.plaque.repository.api.model.d dVar22 = new com.yandex.plus.home.plaque.repository.api.model.d(O, c22);
                    if (bVar4 != null) {
                    }
                    return dVar22;
                }
                return nm6Var;
            }
        }
        mVar = new m(this, cg6Var);
        m mVar22 = mVar;
        Object obj22 = mVar22.o;
        nm6 nm6Var2 = nm6.a;
        i = mVar22.q;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (!(B instanceof t7o)) {
        }
    }
}
