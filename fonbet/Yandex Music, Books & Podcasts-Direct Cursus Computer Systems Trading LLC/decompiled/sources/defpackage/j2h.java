package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class j2h extends aur implements Function2 {
    public Object j;
    public xqn k;
    public r2f l;
    public int m;
    public long n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ mqs q;
    public final /* synthetic */ yk3 r;
    public final /* synthetic */ r2h s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2h(mqs mqsVar, yk3 yk3Var, r2h r2hVar, Continuation continuation) {
        super(2, continuation);
        this.q = mqsVar;
        this.r = yk3Var;
        this.s = r2hVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        j2h j2hVar = new j2h(this.q, this.r, this.s, continuation);
        j2hVar.p = obj;
        return j2hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j2h) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ef, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0128, code lost:
    
        if (r4.d.m(r6, r16) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (defpackage.y2x.o(r11, r16) == r2) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x017a, code lost:
    
        if (r1.d.m(r4, r16) == r2) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0128 -> B:16:0x013b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x012f -> B:16:0x013b). Please report as a decompilation issue!!! */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        xqn i;
        int i2;
        long j;
        g1h g1hVar;
        xqn xqnVar;
        r2f y;
        Object obj2;
        ltm ltmVar = (ltm) this.p;
        nm6 nm6Var = nm6.a;
        int i3 = this.o;
        int i4 = 3;
        int i5 = 2;
        mqs mqsVar = this.q;
        int i6 = 1;
        Continuation continuation = null;
        if (i3 == 0) {
            i = hrg.i(obj);
            ktm ktmVar = (ktm) ltmVar;
            ktmVar.getClass();
            o3h o3hVar = new o3h(mqsVar, f2h.a);
            this.p = ltmVar;
            this.j = i;
            this.m = 0;
            this.n = 2000L;
            this.o = 1;
            if (ktmVar.d.m(o3hVar, this) != nm6Var) {
                i2 = 0;
                j = 2000;
            }
            return nm6Var;
        }
        if (i3 == 1) {
            j = this.n;
            i2 = this.m;
            i = (xqn) this.j;
            qgg.h0(obj);
        } else if (i3 == 2) {
            j = this.n;
            i2 = this.m;
            y = this.l;
            xqnVar = this.k;
            g1hVar = (g1h) this.j;
            qgg.h0(obj);
            j *= i5;
            t1f t1fVar = (t1f) this.r.b;
            this.p = ltmVar;
            this.j = g1hVar;
            this.k = xqnVar;
            this.l = y;
            this.m = i2;
            this.n = j;
            this.o = i4;
            obj2 = ((z1h) t1fVar.b).a.a(mqsVar.a, this.s, new Long(mqsVar.e), this);
        } else {
            if (i3 == 3) {
                j = this.n;
                i2 = this.m;
                y = this.l;
                xqnVar = this.k;
                g1hVar = (g1h) this.j;
                qgg.h0(obj);
                obj2 = obj;
                rj6 rj6Var = (rj6) obj2;
                if (rj6Var instanceof qj6) {
                    g1hVar = (g1h) ((qj6) rj6Var).a;
                    y.g(null);
                    ktm ktmVar2 = (ktm) ltmVar;
                    ktmVar2.getClass();
                    o3h o3hVar2 = new o3h(mqsVar, new e2h(g1hVar));
                    this.p = ltmVar;
                    this.j = g1hVar;
                    this.k = xqnVar;
                    this.l = y;
                    this.m = i2;
                    this.n = j;
                    this.o = 4;
                } else {
                    if (!(rj6Var instanceof pj6)) {
                        b6e.s();
                        return null;
                    }
                    y.g(null);
                    xqnVar.a = ((pj6) rj6Var).a();
                }
                if (g1hVar == null) {
                }
                if (((Throwable) xqnVar.a) != null) {
                }
                return Unit.a;
            }
            if (i3 != 4) {
                if (i3 != 5) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                return Unit.a;
            }
            j = this.n;
            i2 = this.m;
            y = this.l;
            xqnVar = this.k;
            g1hVar = (g1h) this.j;
            qgg.h0(obj);
            if (g1hVar == null || i2 >= 3) {
                if (((Throwable) xqnVar.a) != null) {
                    ktm ktmVar3 = (ktm) ltmVar;
                    ktmVar3.getClass();
                    o3h o3hVar3 = new o3h(mqsVar, new g2h(((Throwable) xqnVar.a).getMessage()));
                    this.p = null;
                    this.j = null;
                    this.k = null;
                    this.l = null;
                    this.m = i2;
                    this.n = j;
                    this.o = 5;
                }
                return Unit.a;
            }
            i4 = 3;
            i5 = 2;
            i6 = 1;
            i2 += i6;
            if (i2 != i6) {
                y.start();
                t1f t1fVar2 = (t1f) this.r.b;
                this.p = ltmVar;
                this.j = g1hVar;
                this.k = xqnVar;
                this.l = y;
                this.m = i2;
                this.n = j;
                this.o = i4;
                obj2 = ((z1h) t1fVar2.b).a.a(mqsVar.a, this.s, new Long(mqsVar.e), this);
            } else {
                this.p = ltmVar;
                this.j = g1hVar;
                this.k = xqnVar;
                this.l = y;
                this.m = i2;
                this.n = j;
                this.o = i5;
            }
        }
        g1hVar = null;
        xqnVar = i;
        y = x97.y(ltmVar, null, pm6.b, new zig(ltmVar, mqsVar, continuation, 4), 1);
        i2 += i6;
        if (i2 != i6) {
        }
    }
}
