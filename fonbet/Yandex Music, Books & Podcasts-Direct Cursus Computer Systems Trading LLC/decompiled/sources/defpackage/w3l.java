package defpackage;

import com.yandex.music.shared.playback.core.api.PlaybackQueueStartValidator$InvalidQueueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class w3l extends aur implements Function2 {
    public oqi j;
    public x3l k;
    public g4q l;
    public l7q m;
    public Object n;
    public Object o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public final /* synthetic */ x3l u;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ g4q w;
    public final /* synthetic */ l7q x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ y3l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3l(x3l x3lVar, boolean z, g4q g4qVar, l7q l7qVar, boolean z2, y3l y3lVar, Continuation continuation) {
        super(2, continuation);
        this.u = x3lVar;
        this.v = z;
        this.w = g4qVar;
        this.x = l7qVar;
        this.y = z2;
        this.z = y3lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new w3l(this.u, this.v, this.w, this.x, this.y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w3l) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01c9 A[Catch: all -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x002d, blocks: (B:10:0x0028, B:12:0x01c9), top: B:9:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01d5 A[Catch: all -> 0x01d9, TryCatch #6 {all -> 0x01d9, blocks: (B:14:0x01d1, B:16:0x01d5, B:17:0x01dc, B:22:0x0208, B:24:0x020c, B:25:0x020f, B:26:0x0214), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x020c A[Catch: all -> 0x01d9, TryCatch #6 {all -> 0x01d9, blocks: (B:14:0x01d1, B:16:0x01d5, B:17:0x01dc, B:22:0x0208, B:24:0x020c, B:25:0x020f, B:26:0x0214), top: B:2:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0179 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        oqi oqiVar;
        l7q l7qVar;
        y3l y3lVar;
        boolean z;
        boolean z2;
        g4q g4qVar;
        x3l x3lVar;
        int i;
        tqn tqnVar;
        int i2;
        Object h0;
        int i3;
        boolean z3;
        g4q g4qVar2;
        oqi oqiVar2;
        y3l y3lVar2;
        l7q l7qVar2;
        q7q q;
        n7q n7qVar;
        tqn tqnVar2;
        boolean z4;
        l7q l7qVar3;
        g4q g4qVar3;
        x3l x3lVar2;
        int i4;
        g4q g4qVar4;
        oqi oqiVar3;
        tqn tqnVar3;
        int i5;
        l7q l7qVar4;
        x3l x3lVar3;
        g4q g4qVar5;
        g4q g4qVar6;
        l8j l8jVar;
        v3l v3lVar;
        x3l x3lVar4;
        tqn tqnVar4;
        g4q g4qVar7;
        nm6 nm6Var = nm6.a;
        int i6 = this.t;
        ecn ecnVar = ecn.a;
        Continuation continuation = null;
        try {
            try {
                if (i6 == 0) {
                    qgg.h0(obj);
                    x3l x3lVar5 = this.u;
                    qqi qqiVar = x3lVar5.g;
                    this.j = qqiVar;
                    this.k = x3lVar5;
                    g4q g4qVar8 = this.w;
                    this.l = g4qVar8;
                    l7qVar = this.x;
                    this.m = l7qVar;
                    y3lVar = this.z;
                    this.n = y3lVar;
                    z = this.v;
                    this.p = z;
                    z2 = this.y;
                    this.q = z2;
                    this.r = 0;
                    this.t = 1;
                    if (qqiVar.a(this) != nm6Var) {
                        oqiVar = qqiVar;
                        g4qVar = g4qVar8;
                        x3lVar = x3lVar5;
                        i = 0;
                    }
                    return nm6Var;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        int i7 = this.s;
                        int i8 = this.r;
                        boolean z5 = this.p;
                        tqn tqnVar5 = (tqn) this.o;
                        y3lVar2 = (y3l) this.n;
                        l7qVar2 = this.m;
                        g4qVar2 = this.l;
                        x3l x3lVar6 = this.k;
                        oqi oqiVar4 = this.j;
                        try {
                            qgg.h0(obj);
                            i3 = i8;
                            z3 = z5;
                            tqnVar = tqnVar5;
                            x3lVar = x3lVar6;
                            oqiVar2 = oqiVar4;
                            i2 = i7;
                            h0 = obj;
                        } catch (Throwable th) {
                            th = th;
                            tqnVar = tqnVar5;
                            g4qVar = g4qVar2;
                            x3lVar2 = x3lVar6;
                        }
                        try {
                            q = pcg.q((t7q) h0);
                            if (q != null || (n7qVar = q.a) == null) {
                                throw new PlaybackQueueStartValidator$InvalidQueueException(new RuntimeException("queue was unable to prepare"), null);
                            }
                            if (y3lVar2 == null) {
                                tqnVar2 = tqnVar;
                                z4 = z3;
                                l7qVar3 = l7qVar2;
                                g4qVar3 = g4qVar2;
                                x3lVar2 = x3lVar;
                                if (z4) {
                                }
                                g4qVar6 = g4qVar5;
                                l8jVar = l8j.c;
                                x3lVar4 = x3lVar2;
                                v3lVar = new v3l(x3lVar4, z4, g4qVar3, tqnVar2, g4qVar6, null);
                                x3lVar = x3lVar4;
                                g4qVar2 = g4qVar3;
                                tqnVar4 = tqnVar2;
                                this.j = oqiVar2;
                                this.k = x3lVar;
                                this.l = g4qVar2;
                                this.m = l7qVar3;
                                this.n = tqnVar4;
                                this.o = g4qVar6;
                                this.r = i3;
                                this.s = i2;
                                this.t = 4;
                                if (x97.V(l8jVar, v3lVar, this) != nm6Var) {
                                }
                                return nm6Var;
                            }
                            this.j = oqiVar2;
                            this.k = x3lVar;
                            this.l = g4qVar2;
                            this.m = l7qVar2;
                            this.n = tqnVar;
                            this.o = null;
                            this.p = z3;
                            this.r = i3;
                            this.s = i2;
                            this.t = 3;
                            if (((z3l) y3lVar2).a(n7qVar) != nm6Var) {
                                i4 = i3;
                                g4qVar4 = g4qVar2;
                                oqiVar3 = oqiVar2;
                                tqnVar3 = tqnVar;
                                i5 = i2;
                                l7qVar4 = l7qVar2;
                                x3lVar3 = x3lVar;
                                i3 = i4;
                                z4 = z3;
                                tqnVar2 = tqnVar3;
                                l7qVar3 = l7qVar4;
                                g4qVar3 = g4qVar4;
                                x3lVar2 = x3lVar3;
                                oqiVar2 = oqiVar3;
                                i2 = i5;
                                if (z4) {
                                }
                                g4qVar6 = g4qVar5;
                                l8jVar = l8j.c;
                                x3lVar4 = x3lVar2;
                                v3lVar = new v3l(x3lVar4, z4, g4qVar3, tqnVar2, g4qVar6, null);
                                x3lVar = x3lVar4;
                                g4qVar2 = g4qVar3;
                                tqnVar4 = tqnVar2;
                                this.j = oqiVar2;
                                this.k = x3lVar;
                                this.l = g4qVar2;
                                this.m = l7qVar3;
                                this.n = tqnVar4;
                                this.o = g4qVar6;
                                this.r = i3;
                                this.s = i2;
                                this.t = 4;
                                if (x97.V(l8jVar, v3lVar, this) != nm6Var) {
                                }
                            }
                            return nm6Var;
                        } catch (Throwable th2) {
                            th = th2;
                            g4qVar = g4qVar2;
                            x3lVar2 = x3lVar;
                            if (tqnVar.a) {
                            }
                            x3lVar2.e.l(null);
                            throw th;
                        }
                    }
                    if (i6 == 3) {
                        i5 = this.s;
                        i4 = this.r;
                        z3 = this.p;
                        tqnVar3 = (tqn) this.n;
                        l7qVar4 = this.m;
                        g4qVar4 = this.l;
                        x3lVar3 = this.k;
                        oqiVar3 = this.j;
                        try {
                            qgg.h0(obj);
                            i3 = i4;
                            z4 = z3;
                            tqnVar2 = tqnVar3;
                            l7qVar3 = l7qVar4;
                            g4qVar3 = g4qVar4;
                            x3lVar2 = x3lVar3;
                            oqiVar2 = oqiVar3;
                            i2 = i5;
                            if (z4) {
                                try {
                                    g4qVar5 = (g4q) x3lVar2.c.getValue();
                                } catch (Throwable th3) {
                                    th = th3;
                                    g4qVar = g4qVar3;
                                    tqnVar = tqnVar2;
                                }
                            } else {
                                try {
                                    g4qVar5 = (g4q) x3lVar2.a.getValue();
                                } catch (Throwable th4) {
                                    th = th4;
                                    tqnVar = tqnVar2;
                                    g4qVar = g4qVar3;
                                }
                            }
                            g4qVar6 = g4qVar5;
                            l8jVar = l8j.c;
                            x3lVar4 = x3lVar2;
                            try {
                                v3lVar = new v3l(x3lVar4, z4, g4qVar3, tqnVar2, g4qVar6, null);
                                x3lVar = x3lVar4;
                                g4qVar2 = g4qVar3;
                                tqnVar4 = tqnVar2;
                                try {
                                    this.j = oqiVar2;
                                    this.k = x3lVar;
                                    this.l = g4qVar2;
                                    this.m = l7qVar3;
                                    this.n = tqnVar4;
                                    this.o = g4qVar6;
                                    this.r = i3;
                                    this.s = i2;
                                    this.t = 4;
                                    if (x97.V(l8jVar, v3lVar, this) != nm6Var) {
                                        g4qVar7 = g4qVar6;
                                        tqnVar = tqnVar4;
                                        g4qVar = g4qVar2;
                                        x3lVar2 = x3lVar;
                                        if (g4qVar7 != null) {
                                        }
                                        if (tqnVar.a) {
                                        }
                                        x3lVar2.e.l(null);
                                        oqiVar2.b(null);
                                        return Unit.a;
                                    }
                                    return nm6Var;
                                } catch (Throwable th5) {
                                    th = th5;
                                    tqnVar = tqnVar4;
                                    g4qVar = g4qVar2;
                                    x3lVar2 = x3lVar;
                                    if (tqnVar.a) {
                                    }
                                    x3lVar2.e.l(null);
                                    throw th;
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                x3lVar = x3lVar4;
                                g4qVar2 = g4qVar3;
                                tqnVar4 = tqnVar2;
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            tqnVar = tqnVar3;
                            g4qVar = g4qVar4;
                            x3lVar2 = x3lVar3;
                        }
                    } else {
                        if (i6 != 4) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        g4qVar7 = (g4q) this.o;
                        tqnVar = (tqn) this.n;
                        l7qVar3 = this.m;
                        g4qVar = this.l;
                        x3lVar2 = this.k;
                        oqiVar2 = this.j;
                        try {
                            qgg.h0(obj);
                            if (g4qVar7 != null) {
                                g4qVar7.a(new dcn(l7qVar3));
                            }
                            if (tqnVar.a) {
                                g4qVar.a(ecnVar);
                            }
                            x3lVar2.e.l(null);
                            oqiVar2.b(null);
                            return Unit.a;
                        } catch (Throwable th8) {
                            th = th8;
                        }
                    }
                    if (tqnVar.a) {
                        g4qVar.a(ecnVar);
                    }
                    x3lVar2.e.l(null);
                    throw th;
                }
                i = this.r;
                boolean z6 = this.q;
                boolean z7 = this.p;
                y3l y3lVar3 = (y3l) this.n;
                l7qVar = this.m;
                g4q g4qVar9 = this.l;
                x3lVar = this.k;
                oqi oqiVar5 = this.j;
                qgg.h0(obj);
                oqiVar = oqiVar5;
                g4qVar = g4qVar9;
                z2 = z6;
                z = z7;
                y3lVar = y3lVar3;
                tqn tqnVar6 = new tqn();
                tqnVar6.a = true;
                if (!z) {
                    try {
                        xdr xdrVar = x3lVar.e;
                        x7q x7qVar = new x7q(g4qVar.getDescriptor(), l7qVar, z2);
                        xdrVar.getClass();
                        xdrVar.m(null, x7qVar);
                    } catch (Throwable th9) {
                        th = th9;
                        tqnVar = tqnVar6;
                        x3lVar2 = x3lVar;
                        if (tqnVar.a) {
                        }
                        x3lVar2.e.l(null);
                        throw th;
                    }
                }
                g4qVar.start();
                vdr state = g4qVar.getState();
                z0i z0iVar = new z0i(2, 9, continuation);
                this.j = oqiVar;
                this.k = x3lVar;
                this.l = g4qVar;
                this.m = l7qVar;
                this.n = y3lVar;
                this.o = tqnVar6;
                this.p = z;
                this.r = i;
                i2 = 0;
                this.s = 0;
                this.t = 2;
                h0 = zsd.h0(state, z0iVar, this);
                if (h0 != nm6Var) {
                    g4q g4qVar10 = g4qVar;
                    i3 = i;
                    tqnVar = tqnVar6;
                    z3 = z;
                    g4qVar2 = g4qVar10;
                    oqiVar2 = oqiVar;
                    y3lVar2 = y3lVar;
                    l7qVar2 = l7qVar;
                    q = pcg.q((t7q) h0);
                    if (q != null) {
                    }
                    throw new PlaybackQueueStartValidator$InvalidQueueException(new RuntimeException("queue was unable to prepare"), null);
                }
                return nm6Var;
            } catch (Throwable th10) {
                th = th10;
                oqiVar.b(null);
                throw th;
            }
        } catch (Throwable th11) {
            th = th11;
            oqiVar = 1;
        }
    }
}
