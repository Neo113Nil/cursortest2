package com.gamericefishpro.space.g7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.b3.l;
import com.gamericefishpro.space.b3.m;
import com.gamericefishpro.space.b3.p;
import com.gamericefishpro.space.b3.q;
import com.gamericefishpro.space.c3.n;
import com.gamericefishpro.space.c3.o;
import com.gamericefishpro.space.ei.b0;
import com.gamericefishpro.space.f7.j;
import com.gamericefishpro.space.h0.v0;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.o1.j0;
import com.gamericefishpro.space.o1.s;
import com.gamericefishpro.space.ph.x;
import com.gamericefishpro.space.r2.c;
import com.gamericefishpro.space.r2.d0;
import com.gamericefishpro.space.r2.e;
import com.gamericefishpro.space.r2.g;
import com.gamericefishpro.space.r2.h0;
import com.gamericefishpro.space.r2.k0;
import com.gamericefishpro.space.r2.y;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.t7.d;
import com.gamericefishpro.space.u2.k;
import com.gamericefishpro.space.u6.f;
import com.gamericefishpro.space.v7.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;

    public /* synthetic */ a(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        Object objA;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.pj.a viewModel = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it, "it");
                return new d((j) viewModel.a(b0.a(j.class)));
            case 1:
                com.gamericefishpro.space.pj.a viewModel2 = (com.gamericefishpro.space.pj.a) obj;
                com.gamericefishpro.space.lj.a it2 = (com.gamericefishpro.space.lj.a) obj2;
                Intrinsics.checkNotNullParameter(viewModel2, "$this$viewModel");
                Intrinsics.checkNotNullParameter(it2, "it");
                return new i((j) viewModel2.a(b0.a(j.class)));
            case 2:
                Map mapD = ((v0) obj2).d();
                if (mapD.isEmpty()) {
                    return null;
                }
                return mapD;
            case 3:
                ((Integer) obj2).getClass();
                y3.c((r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case 4:
                ((Integer) obj2).getClass();
                f.c((r) obj, com.gamericefishpro.space.t0.i.D(1));
                return Unit.a;
            case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((CoroutineContext) obj).o((CoroutineContext.Element) obj2);
            case com.gamericefishpro.space.o4.i.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((CoroutineContext) obj).o((CoroutineContext.Element) obj2);
            case com.gamericefishpro.space.o4.i.BYTES_FIELD_NUMBER /* 8 */:
                e eVar = (e) obj2;
                return x.d(eVar.e, y.a(eVar.d, y.a, (com.gamericefishpro.space.e1.b) obj));
            case 9:
                return Integer.valueOf(((l) obj2).a);
            case 10:
                p pVar = (p) obj2;
                return x.d(Float.valueOf(pVar.a), Float.valueOf(pVar.b));
            case RequestError.STOP_TRACKING /* 11 */:
                com.gamericefishpro.space.e1.b bVar = (com.gamericefishpro.space.e1.b) obj;
                q qVar = (q) obj2;
                n nVar = new n(qVar.a);
                com.gamericefishpro.space.r2.x xVar = y.v;
                return x.d(y.a(nVar, xVar, bVar), y.a(new n(qVar.b), xVar, bVar));
            case 12:
                return Integer.valueOf(((k) obj2).d);
            case 13:
                com.gamericefishpro.space.r2.j jVar = (com.gamericefishpro.space.r2.j) obj2;
                return x.d(jVar.a, y.a(jVar.b, y.i, (com.gamericefishpro.space.e1.b) obj));
            case 14:
                return Float.valueOf(((com.gamericefishpro.space.b3.a) obj2).a);
            case 15:
                com.gamericefishpro.space.e1.b bVar2 = (com.gamericefishpro.space.e1.b) obj;
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    arrayList.add(y.a((c) list.get(i), y.b, bVar2));
                }
                return arrayList;
            case 16:
                h0 h0Var = (h0) obj2;
                return x.d(Integer.valueOf((int) (h0Var.a >> 32)), Integer.valueOf((int) (h0Var.a & 4294967295L)));
            case 17:
                com.gamericefishpro.space.e1.b bVar3 = (com.gamericefishpro.space.e1.b) obj;
                j0 j0Var = (j0) obj2;
                return x.d(y.a(new s(j0Var.a), y.p, bVar3), y.a(new com.gamericefishpro.space.n1.b(j0Var.b), y.x, bVar3), Float.valueOf(j0Var.c));
            case 18:
                return Integer.valueOf(((com.gamericefishpro.space.b3.k) obj2).a);
            case 19:
                return Integer.valueOf(((m) obj2).a);
            case 20:
                return Integer.valueOf(((com.gamericefishpro.space.b3.d) obj2).a);
            case 21:
                return Integer.valueOf(((com.gamericefishpro.space.u2.i) obj2).a);
            case 22:
                return Integer.valueOf(((com.gamericefishpro.space.u2.j) obj2).a);
            case 23:
                n nVar2 = (n) obj2;
                return nVar2 == null ? false : n.a(nVar2.a, n.c) ? Boolean.FALSE : x.d(Float.valueOf(n.c(nVar2.a)), y.a(new o(n.b(nVar2.a)), y.w, (com.gamericefishpro.space.e1.b) obj));
            case 24:
                com.gamericefishpro.space.r2.i iVar = (com.gamericefishpro.space.r2.i) obj2;
                return x.d(iVar.a, y.a(iVar.b, y.i, (com.gamericefishpro.space.e1.b) obj));
            case 25:
                long j = ((o) obj2).a;
                if (o.a(j, 8589934592L)) {
                    return 0;
                }
                if (o.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 26:
                com.gamericefishpro.space.n1.b bVar4 = (com.gamericefishpro.space.n1.b) obj2;
                return bVar4 == null ? false : com.gamericefishpro.space.n1.b.b(bVar4.a, 9205357640488583168L) ? Boolean.FALSE : x.d(Float.valueOf(Float.intBitsToFloat((int) (bVar4.a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar4.a & 4294967295L))));
            case 27:
                com.gamericefishpro.space.e1.b bVar5 = (com.gamericefishpro.space.e1.b) obj;
                c cVar = (c) obj2;
                Object obj3 = cVar.a;
                if (obj3 instanceof com.gamericefishpro.space.r2.p) {
                    gVar = g.d;
                } else if (obj3 instanceof com.gamericefishpro.space.r2.b0) {
                    gVar = g.e;
                } else if (obj3 instanceof k0) {
                    gVar = g.i;
                } else if (obj3 instanceof com.gamericefishpro.space.r2.j0) {
                    gVar = g.v;
                } else if (obj3 instanceof com.gamericefishpro.space.r2.j) {
                    gVar = g.w;
                } else if (obj3 instanceof com.gamericefishpro.space.r2.i) {
                    gVar = g.y;
                } else {
                    if (!(obj3 instanceof d0)) {
                        throw new UnsupportedOperationException();
                    }
                    gVar = g.z;
                }
                switch (gVar.ordinal()) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = y.a((com.gamericefishpro.space.r2.p) obj3, y.g, bVar5);
                        break;
                    case 1:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = y.a((com.gamericefishpro.space.r2.b0) obj3, y.h, bVar5);
                        break;
                    case 2:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = y.a((k0) obj3, y.c, bVar5);
                        break;
                    case 3:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = y.a((com.gamericefishpro.space.r2.j0) obj3, y.d, bVar5);
                        break;
                    case 4:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = y.a((com.gamericefishpro.space.r2.j) obj3, y.e, bVar5);
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_FIELD_NUMBER /* 5 */:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = y.a((com.gamericefishpro.space.r2.i) obj3, y.f, bVar5);
                        break;
                    case com.gamericefishpro.space.o4.i.STRING_SET_FIELD_NUMBER /* 6 */:
                        Intrinsics.c(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((d0) obj3).a;
                        break;
                    default:
                        throw new com.gamericefishpro.space.oh.k();
                }
                return x.d(gVar, objA, Integer.valueOf(cVar.b), Integer.valueOf(cVar.c), cVar.d);
            case 28:
                com.gamericefishpro.space.e1.b bVar6 = (com.gamericefishpro.space.e1.b) obj;
                List list2 = ((com.gamericefishpro.space.x2.b) obj2).d;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList2.add(y.a((com.gamericefishpro.space.x2.a) list2.get(i2), y.z, bVar6));
                }
                return arrayList2;
            default:
                return ((com.gamericefishpro.space.x2.a) obj2).a.toLanguageTag();
        }
    }

    public /* synthetic */ a(int i, int i2) {
        this.d = i2;
    }
}
