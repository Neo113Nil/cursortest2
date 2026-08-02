package defpackage;

import java.util.EnumSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m5q extends aur implements Function2 {
    public p5d j;
    public boolean k;
    public long l;
    public int m;
    public final /* synthetic */ n5q n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5q(n5q n5qVar, Continuation continuation) {
        super(2, continuation);
        this.n = n5qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new m5q(this.n, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m5q) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00ed, code lost:
    
        if (r1.c(r2, r19) != r3) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object V;
        p5d p5dVar;
        boolean z;
        long j;
        Object V2;
        boolean z2;
        long j2;
        p5d p5dVar2;
        n5q n5qVar = this.n;
        a7q a7qVar = n5qVar.a;
        nm6 nm6Var = nm6.a;
        int i = this.m;
        Continuation continuation = null;
        if (i == 0) {
            qgg.h0(obj);
            p5d p5dVar3 = n5qVar.f.a;
            if (p5dVar3 == null) {
                return Unit.a;
            }
            boolean booleanValue = ((Boolean) a7qVar.n.e.getValue()).booleanValue();
            this.j = p5dVar3;
            this.k = booleanValue;
            this.m = 1;
            a7qVar.getClass();
            V = x97.V(mal.b(), new x6q(a7qVar, continuation, 8), this);
            if (V != nm6Var) {
                p5dVar = p5dVar3;
                z = booleanValue;
            }
            return nm6Var;
        }
        if (i == 1) {
            z = this.k;
            p5d p5dVar4 = this.j;
            qgg.h0(obj);
            p5dVar = p5dVar4;
            V = obj;
        } else {
            if (i == 2) {
                j = this.l;
                z = this.k;
                p5dVar = this.j;
                qgg.h0(obj);
                this.j = p5dVar;
                this.k = z;
                this.l = j;
                this.m = 3;
                a7qVar.getClass();
                V2 = x97.V(mal.b(), new x6q(a7qVar, continuation, 10), this);
                if (V2 != nm6Var) {
                    V2 = Unit.a;
                }
                if (V2 != nm6Var) {
                    z2 = z;
                    j2 = j;
                    p5dVar2 = p5dVar;
                    EnumSet enumSet = p5dVar2.h;
                    enumSet.remove(o5d.c);
                    p5d a = p5d.a(p5dVar2, z2, j2, null, enumSet, 53);
                    this.j = null;
                    this.k = z2;
                    this.l = j2;
                    this.m = 4;
                }
                return nm6Var;
            }
            if (i != 3) {
                if (i == 4) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.l;
            boolean z3 = this.k;
            p5d p5dVar5 = this.j;
            qgg.h0(obj);
            z2 = z3;
            p5dVar2 = p5dVar5;
            j2 = j3;
            EnumSet enumSet2 = p5dVar2.h;
            enumSet2.remove(o5d.c);
            p5d a2 = p5d.a(p5dVar2, z2, j2, null, enumSet2, 53);
            this.j = null;
            this.k = z2;
            this.l = j2;
            this.m = 4;
        }
        long longValue = ((Number) V).longValue();
        this.j = p5dVar;
        this.k = z;
        this.l = longValue;
        this.m = 2;
        a7qVar.getClass();
        Object V3 = x97.V(mal.b(), new x6q(a7qVar, continuation, 6), this);
        if (V3 != nm6Var) {
            V3 = Unit.a;
        }
        if (V3 != nm6Var) {
            j = longValue;
            this.j = p5dVar;
            this.k = z;
            this.l = j;
            this.m = 3;
            a7qVar.getClass();
            V2 = x97.V(mal.b(), new x6q(a7qVar, continuation, 10), this);
            if (V2 != nm6Var) {
            }
            if (V2 != nm6Var) {
            }
        }
        return nm6Var;
    }
}
