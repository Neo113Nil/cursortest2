package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class e4l extends aur implements Function2 {
    public x3l j;
    public g4l k;
    public oqi l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public final /* synthetic */ g4l r;
    public final /* synthetic */ g4q s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4l(g4l g4lVar, g4q g4qVar, Continuation continuation) {
        super(2, continuation);
        this.r = g4lVar;
        this.s = g4qVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new e4l(this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e4l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x005b, code lost:
    
        if (r13 == r2) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00bf A[Catch: all -> 0x0020, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001b, B:10:0x00bf), top: B:7:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008c A[Catch: all -> 0x0095, TRY_ENTER, TryCatch #1 {all -> 0x0095, blocks: (B:24:0x008c, B:25:0x008e, B:27:0x009d, B:30:0x00a3, B:36:0x0098), top: B:22:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:24:0x008c, B:25:0x008e, B:27:0x009d, B:30:0x00a3, B:36:0x0098), top: B:22:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0098 A[Catch: all -> 0x0095, TryCatch #1 {all -> 0x0095, blocks: (B:24:0x008c, B:25:0x008e, B:27:0x009d, B:30:0x00a3, B:36:0x0098), top: B:22:0x008a }] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        oqi oqiVar;
        int i2;
        int i3;
        int i4;
        oqi oqiVar2;
        g4l g4lVar;
        int i5;
        g4l g4lVar2 = this.r;
        x3l x3lVar = g4lVar2.a;
        nm6 nm6Var = nm6.a;
        int i6 = this.q;
        boolean z = true;
        Continuation continuation = null;
        if (i6 == 0) {
            qgg.h0(obj);
            this.q = 1;
            obj = x97.V(dm6.b(), new f51(x3lVar, this.s, continuation, 2), this);
        } else {
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = this.m;
                    oqiVar2 = this.l;
                    g4lVar = this.k;
                    try {
                        qgg.h0(obj);
                        if (i5 == 0) {
                            g4lVar.e.a(null);
                        }
                        oqiVar = oqiVar2;
                        oqiVar.b(null);
                        return Unit.a;
                    } catch (Throwable th) {
                        th = th;
                        oqiVar2.b(null);
                        throw th;
                    }
                }
                int i7 = this.p;
                int i8 = this.o;
                int i9 = this.n;
                int i10 = this.m;
                oqiVar = this.l;
                g4l g4lVar3 = this.k;
                x3l x3lVar2 = this.j;
                qgg.h0(obj);
                i3 = i7;
                g4lVar2 = g4lVar3;
                i2 = i9;
                i = i10;
                i4 = i8;
                x3lVar = x3lVar2;
                try {
                    if (((g4q) (i2 == 0 ? x3lVar.c : x3lVar.a).getValue()) == null) {
                        x6l x6lVar = g4lVar2.b;
                        if (i == 0) {
                            z = false;
                        }
                        this.j = null;
                        this.k = g4lVar2;
                        this.l = oqiVar;
                        this.m = i;
                        this.n = i2;
                        this.o = i4;
                        this.p = i3;
                        this.q = 3;
                        if (x6lVar.g(z, this) != nm6Var) {
                            g4lVar = g4lVar2;
                            i5 = i;
                            oqiVar2 = oqiVar;
                            if (i5 == 0) {
                            }
                            oqiVar = oqiVar2;
                        }
                        return nm6Var;
                    }
                    oqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th2) {
                    th = th2;
                    oqiVar2 = oqiVar;
                    oqiVar2.b(null);
                    throw th;
                }
            }
            qgg.h0(obj);
        }
        yan yanVar = (yan) obj;
        if (yanVar == null) {
            return Unit.a;
        }
        i = yanVar == yan.b ? 1 : 0;
        qqi qqiVar = x3lVar.h;
        this.j = x3lVar;
        this.k = g4lVar2;
        this.l = qqiVar;
        this.m = i;
        this.n = i;
        this.o = 0;
        this.p = 0;
        this.q = 2;
        if (qqiVar.a(this) != nm6Var) {
            oqiVar = qqiVar;
            i2 = i;
            i3 = 0;
            i4 = 0;
            if (((g4q) (i2 == 0 ? x3lVar.c : x3lVar.a).getValue()) == null) {
            }
            oqiVar.b(null);
            return Unit.a;
        }
        return nm6Var;
    }
}
