package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class pi extends aur implements Function2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ tqg B;
    public final /* synthetic */ g3a C;
    public final /* synthetic */ q2a D;
    public final /* synthetic */ q2a E;
    public xqn j;
    public List k;
    public tqg l;
    public q2a m;
    public g3a n;
    public q2a o;
    public q2a p;
    public Iterator q;
    public p5a r;
    public Iterator s;
    public xqn t;
    public int u;
    public int v;
    public int w;
    public int x;
    public final /* synthetic */ List y;
    public final /* synthetic */ q2a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi(List list, q2a q2aVar, List list2, tqg tqgVar, g3a g3aVar, q2a q2aVar2, q2a q2aVar3, Continuation continuation) {
        super(2, continuation);
        this.y = list;
        this.z = q2aVar;
        this.A = list2;
        this.B = tqgVar;
        this.C = g3aVar;
        this.D = q2aVar2;
        this.E = q2aVar3;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new pi(this.y, this.z, this.A, this.B, this.C, this.D, this.E, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pi) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x006a -> B:5:0x007a). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        q2a q2aVar;
        Iterator it;
        List list;
        tqg tqgVar;
        g3a g3aVar;
        q2a q2aVar2;
        q2a q2aVar3;
        int i;
        xqn xqnVar;
        nm6 nm6Var = nm6.a;
        int i2 = this.x;
        q2a q2aVar4 = this.z;
        if (i2 == 0) {
            obj2 = null;
            xqn i3 = hrg.i(obj);
            Iterator it2 = this.y.iterator();
            List list2 = this.A;
            tqg tqgVar2 = this.B;
            q2aVar = q2aVar4;
            it = it2;
            list = list2;
            tqgVar = tqgVar2;
            g3aVar = this.C;
            q2aVar2 = this.D;
            q2aVar3 = this.E;
            i = 0;
            xqnVar = i3;
            if (it.hasNext()) {
            }
        } else {
            if (i2 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i4 = this.w;
            int i5 = this.v;
            i = this.u;
            xqn xqnVar2 = this.t;
            Iterator it3 = this.s;
            p5a p5aVar = this.r;
            it = this.q;
            q2aVar3 = this.p;
            q2aVar2 = this.o;
            g3aVar = this.n;
            q2aVar = this.m;
            tqgVar = this.l;
            list = this.k;
            obj2 = null;
            xqnVar = this.j;
            qgg.h0(obj);
            xqnVar2.a = obj;
            int i6 = i4;
            if (it3.hasNext()) {
                if (it3.next() != null) {
                    l1j.f();
                    return obj2;
                }
                if (tqgVar != null) {
                    Object obj3 = obj2;
                    if (ywf.L(tqgVar, obj3) != null) {
                        l1j.f();
                        return obj3;
                    }
                }
                this.j = xqnVar;
                this.k = list;
                this.l = tqgVar;
                this.m = q2aVar;
                this.n = g3aVar;
                this.o = q2aVar2;
                this.p = q2aVar3;
                this.q = it;
                this.r = p5aVar;
                this.s = it3;
                this.t = xqnVar;
                this.u = i;
                this.v = i5;
                this.w = i6;
                this.x = 1;
                throw null;
            }
            if (it.hasNext()) {
                p5aVar = (p5a) it.next();
                it3 = list.iterator();
                i6 = 0;
                i5 = 0;
                if (it3.hasNext()) {
                }
                if (it.hasNext()) {
                    q2a q2aVar5 = (q2a) xqnVar.a;
                    return q2aVar5 == null ? q2aVar4 : q2aVar5;
                }
            }
        }
    }
}
