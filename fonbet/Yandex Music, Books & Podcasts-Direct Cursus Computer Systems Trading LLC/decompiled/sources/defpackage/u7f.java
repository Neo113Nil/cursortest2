package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class u7f implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v7f b;

    public /* synthetic */ u7f(v7f v7fVar, int i) {
        this.a = i;
        this.b = v7fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                evl evlVar = (evl) obj;
                evlVar.getClass();
                v7f v7fVar = this.b;
                uu5 uu5Var = v7fVar.n;
                if (uu5Var != null) {
                    if (v7fVar.l == null) {
                        Intrinsics.j("track");
                        throw null;
                    }
                    cvl cvlVar = evlVar.a;
                    String e = cvlVar.e();
                    boolean z = !evlVar.b;
                    ((HashMap) uu5Var.f).put(e, Boolean.valueOf(z));
                    ((LinkedHashSet) uu5Var.g).add(e);
                    w7f w7fVar = (w7f) uu5Var.j;
                    if (w7fVar != null) {
                        w7fVar.a(new evl(cvlVar, z));
                    }
                }
                return Unit.a;
            default:
                List list = (List) obj;
                list.getClass();
                w7f w7fVar2 = this.b.m;
                if (w7fVar2 != null) {
                    s7f s7fVar = w7fVar2.e;
                    s7fVar.getClass();
                    int c = s7fVar.c();
                    ((ArrayList) s7fVar.h).addAll(list);
                    s7fVar.a.e(c, 1);
                }
                return Unit.a;
        }
    }
}
