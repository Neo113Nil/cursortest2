package defpackage;

import com.yandex.passport.api.exception.a;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.m;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.credentials.f;
import com.yandex.passport.internal.impl.r0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class f9k extends uif implements Function2 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f9k(g9k g9kVar, boolean z, r0 r0Var) {
        super(2);
        this.r = 0;
        this.s = z;
        this.t = r0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b bVar;
        int i = this.r;
        Object obj3 = this.t;
        boolean z = this.s;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                pz1 pz1Var = (pz1) obj2;
                pz1Var.getClass();
                if (z) {
                    bVar = m.b;
                    bVar.getClass();
                } else {
                    bVar = m.a;
                    bVar.getClass();
                }
                b bVar2 = b.c;
                b a = b.a(bVar.d());
                a.getClass();
                try {
                    return ((r0) obj3).a(new z1(a, longValue), new f(pz1Var.a, pz1Var.b)).a;
                } catch (a e) {
                    throw new d9k(e.getMessage());
                }
            case 1:
                ((Number) obj2).intValue();
                q5g.f(z, (Function2) obj3, (hq5) obj, rvf.R(1));
                return Unit.a;
            default:
                ((Number) obj2).intValue();
                bfs.a(z, (wn5) obj3, (hq5) obj, rvf.R(49));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f9k(boolean z, Function2 function2, int i, int i2) {
        super(2);
        this.r = i2;
        this.s = z;
        this.t = function2;
    }
}
