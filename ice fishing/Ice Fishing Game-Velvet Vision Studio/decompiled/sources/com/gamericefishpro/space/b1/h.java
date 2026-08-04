package com.gamericefishpro.space.b1;

import com.gamericefishpro.space.ei.e0;
import com.gamericefishpro.space.t0.p1;
import com.gamericefishpro.space.t0.r;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements e {
    public final int d;
    public final boolean e;
    public Object i;
    public p1 v;
    public ArrayList w;

    public h(int i, Object obj, boolean z) {
        this.d = i;
        this.e = z;
        this.i = obj;
    }

    @Override // com.gamericefishpro.space.di.c
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        return e(obj, (r) obj2, ((Number) obj3).intValue());
    }

    @Override // com.gamericefishpro.space.di.d
    public final /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return f(obj, obj2, (r) obj3, ((Number) obj4).intValue());
    }

    public final Object d(r rVar, int i) {
        rVar.b0(this.d);
        g(rVar);
        int iA = i | (rVar.f(this) ? n.a(2, 0) : n.a(1, 0));
        Object obj = this.i;
        Intrinsics.c(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        e0.c(2, obj);
        Object objInvoke = ((Function2) obj).invoke(rVar, Integer.valueOf(iA));
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new g(2, this, h.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 0);
        }
        return objInvoke;
    }

    public final Object e(Object obj, r rVar, int i) {
        rVar.b0(this.d);
        g(rVar);
        int iA = rVar.f(this) ? n.a(2, 1) : n.a(1, 1);
        Object obj2 = this.i;
        Intrinsics.c(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        e0.c(3, obj2);
        Object objA = ((com.gamericefishpro.space.di.c) obj2).a(obj, rVar, Integer.valueOf(iA | i));
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new f(i, 0, this, obj);
        }
        return objA;
    }

    public final Object f(Object obj, Object obj2, r rVar, int i) {
        rVar.b0(this.d);
        g(rVar);
        int iA = rVar.f(this) ? n.a(2, 2) : n.a(1, 2);
        Object obj3 = this.i;
        Intrinsics.c(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        e0.c(4, obj3);
        Object objC = ((com.gamericefishpro.space.di.d) obj3).c(obj, obj2, rVar, Integer.valueOf(iA | i));
        p1 p1VarT = rVar.t();
        if (p1VarT != null) {
            p1VarT.d = new com.gamericefishpro.space.a5.c(this, obj, obj2, i, 1);
        }
        return objC;
    }

    public final void g(r rVar) {
        p1 p1VarA;
        if (!this.e || (p1VarA = rVar.A()) == null) {
            return;
        }
        p1VarA.b |= 1;
        if (n.d(this.v, p1VarA)) {
            this.v = p1VarA;
            return;
        }
        ArrayList arrayList = this.w;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.w = arrayList2;
            arrayList2.add(p1VarA);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (n.d((p1) arrayList.get(i), p1VarA)) {
                arrayList.set(i, p1VarA);
                return;
            }
        }
        arrayList.add(p1VarA);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return d((r) obj, ((Number) obj2).intValue());
    }
}
