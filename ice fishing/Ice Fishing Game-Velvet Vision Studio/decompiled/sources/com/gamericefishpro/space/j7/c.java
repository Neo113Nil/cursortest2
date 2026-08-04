package com.gamericefishpro.space.j7;

import com.android.installreferrer.api.InstallReferrerClient;
import com.appsflyer.attribution.RequestError;
import com.gamericefishpro.space.f0.h;
import com.gamericefishpro.space.f5.h0;
import com.gamericefishpro.space.f5.r0;
import com.gamericefishpro.space.n7.g;
import com.gamericefishpro.space.o2.s;
import com.gamericefishpro.space.o2.u;
import com.gamericefishpro.space.o2.v;
import com.gamericefishpro.space.o2.w;
import com.gamericefishpro.space.o4.i;
import com.gamericefishpro.space.pi.t;
import com.gamericefishpro.space.pi.v0;
import com.gamericefishpro.space.r2.b0;
import com.gamericefishpro.space.r2.g0;
import com.gamericefishpro.space.r2.m;
import com.gamericefishpro.space.r2.y;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;

    public /* synthetic */ c(int i) {
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 4;
        int i2 = 5;
        b0 b0Var = null;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r0 popUpTo = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
                popUpTo.a = true;
                return Unit.a;
            case 1:
                h0 navigate = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
                navigate.a("level_complete/{level}/{score}/{stars}", new c(i2));
                return Unit.a;
            case 2:
                h0 navigate2 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate2, "$this$navigate");
                navigate2.a("level_complete/{level}/{score}/{stars}", new c(6));
                return Unit.a;
            case 3:
                h0 navigate3 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate3, "$this$navigate");
                navigate3.a("level_complete/{level}/{score}/{stars}", new c(i));
                return Unit.a;
            case 4:
                r0 popUpTo2 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo2, "$this$popUpTo");
                popUpTo2.a = true;
                return Unit.a;
            case i.STRING_FIELD_NUMBER /* 5 */:
                r0 popUpTo3 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo3, "$this$popUpTo");
                popUpTo3.a = true;
                return Unit.a;
            case i.STRING_SET_FIELD_NUMBER /* 6 */:
                r0 popUpTo4 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo4, "$this$popUpTo");
                popUpTo4.a = true;
                return Unit.a;
            case i.DOUBLE_FIELD_NUMBER /* 7 */:
                h0 navigate4 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate4, "$this$navigate");
                navigate4.a("defeat/{level}/{reason}", new c(8));
                return Unit.a;
            case i.BYTES_FIELD_NUMBER /* 8 */:
                r0 popUpTo5 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo5, "$this$popUpTo");
                popUpTo5.a = true;
                return Unit.a;
            case 9:
                h0 navigate5 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate5, "$this$navigate");
                navigate5.a("webview", new c(10));
                return Unit.a;
            case 10:
                r0 popUpTo6 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo6, "$this$popUpTo");
                popUpTo6.a = true;
                return Unit.a;
            case RequestError.STOP_TRACKING /* 11 */:
                h0 navigate6 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate6, "$this$navigate");
                navigate6.a("game/{level}", new c(13));
                return Unit.a;
            case 12:
                h0 navigate7 = (h0) obj;
                Intrinsics.checkNotNullParameter(navigate7, "$this$navigate");
                navigate7.a("game/{level}", new c(14));
                return Unit.a;
            case 13:
                r0 popUpTo7 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo7, "$this$popUpTo");
                popUpTo7.a = true;
                return Unit.a;
            case 14:
                r0 popUpTo8 = (r0) obj;
                Intrinsics.checkNotNullParameter(popUpTo8, "$this$popUpTo");
                popUpTo8.a = true;
                return Unit.a;
            case 15:
                return Unit.a;
            case 16:
                return Boolean.valueOf(obj == null);
            case 17:
                String it = (String) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (StringsKt.u(it)) {
                    return it.length() < 4 ? "    " : it;
                }
                return "    ".concat(it);
            case 18:
                g it2 = (g) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return g.a(it2, null, 0, 0, 0, 0, 0, null, false, 0, true, false, false, null, 0, 0, null, null, null, 261631);
            case 19:
                g it3 = (g) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return g.a(it3, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, 0, null, null, null, 261631);
            case 20:
                g it4 = (g) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                return g.a(it4, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, 0, null, null, null, 261631);
            case 21:
                g it5 = (g) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                return g.a(it5, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, 0, null, null, null, 262079);
            case 22:
                g it6 = (g) obj;
                Intrinsics.checkNotNullParameter(it6, "it");
                return g.a(it6, null, 0, 0, 0, 0, 0, null, true, 0, false, false, false, null, 0, 0, null, null, null, 261951);
            case 23:
                return g.a((g) obj, null, 0, 0, 0, 0, 0, null, false, 0, false, false, false, null, 0, 0, null, null, null, 131071);
            case 24:
                h LazyColumn = (h) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.a);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.b);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.c);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.d);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.e);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.f);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.g);
                h.p(LazyColumn, com.gamericefishpro.space.p7.b.h);
                return Unit.a;
            case 25:
                CoroutineContext.Element element = (CoroutineContext.Element) obj;
                if (element instanceof t) {
                    return (t) element;
                }
                return null;
            case 26:
                CoroutineContext.Element element2 = (CoroutineContext.Element) obj;
                if (element2 instanceof v0) {
                    return (v0) element2;
                }
                return null;
            case 27:
                com.gamericefishpro.space.ki.d[] dVarArr = u.a;
                v vVar = s.l;
                com.gamericefishpro.space.ki.d dVar = u.a[5];
                ((w) obj).b(vVar, Boolean.TRUE);
                return Unit.a;
            case 28:
                m mVar = (m) obj;
                StringBuilder sb = new StringBuilder("[");
                sb.append(mVar.b);
                sb.append(", ");
                return com.gamericefishpro.space.m5.a.i(sb, mVar.c, ')');
            default:
                Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = (Function1) y.h.e;
                Boolean bool = Boolean.FALSE;
                b0 b0Var2 = (Intrinsics.a(obj2, bool) || obj2 == null) ? null : (b0) function1.invoke(obj2);
                Object obj3 = list.get(1);
                b0 b0Var3 = (Intrinsics.a(obj3, bool) || obj3 == null) ? null : (b0) function1.invoke(obj3);
                Object obj4 = list.get(2);
                b0 b0Var4 = (Intrinsics.a(obj4, bool) || obj4 == null) ? null : (b0) function1.invoke(obj4);
                Object obj5 = list.get(3);
                if (!Intrinsics.a(obj5, bool) && obj5 != null) {
                    b0Var = (b0) function1.invoke(obj5);
                }
                return new g0(b0Var2, b0Var3, b0Var4, b0Var);
        }
    }
}
