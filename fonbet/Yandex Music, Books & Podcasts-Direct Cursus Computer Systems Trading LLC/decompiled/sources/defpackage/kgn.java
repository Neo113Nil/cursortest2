package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class kgn extends aur implements Function2 {
    public oqi j;
    public cr k;
    public long l;
    public int m;
    public int n;
    public final /* synthetic */ cr o;
    public final /* synthetic */ long p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kgn(cr crVar, long j, Continuation continuation) {
        super(2, continuation);
        this.o = crVar;
        this.p = j;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new kgn(this.o, this.p, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kgn) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0095 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0015, B:9:0x0087, B:11:0x0095, B:12:0x009c, B:15:0x00c0, B:21:0x00a9), top: B:6:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0015, B:9:0x0087, B:11:0x0095, B:12:0x009c, B:15:0x00c0, B:21:0x00a9), top: B:6:0x0015 }] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        cr crVar;
        int i;
        oqi oqiVar;
        long j;
        oqi oqiVar2;
        cr crVar2;
        long j2;
        cr crVar3;
        rgn rgnVar;
        nm6 nm6Var = nm6.a;
        int i2 = this.n;
        try {
            if (i2 == 0) {
                qgg.h0(obj);
                crVar = this.o;
                qqi qqiVar = (qqi) crVar.i;
                this.j = qqiVar;
                this.k = crVar;
                long j3 = this.p;
                this.l = j3;
                i = 0;
                this.m = 0;
                this.n = 1;
                if (qqiVar.a(this) != nm6Var) {
                    oqiVar = qqiVar;
                    j = j3;
                }
                return nm6Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                long j4 = this.l;
                crVar2 = this.k;
                oqiVar2 = this.j;
                try {
                    qgg.h0(obj);
                    j2 = j4;
                    bjt bjtVar = (bjt) crVar2.d;
                    xdr xdrVar = (xdr) crVar2.b;
                    crVar3 = (cr) bjtVar.d;
                    if (crVar3 != null) {
                        gld.L((tf6) crVar3.f, null);
                    }
                    bjtVar.d = null;
                    rgnVar = (rgn) xdrVar.getValue();
                    if (!(rgnVar instanceof pgn)) {
                        f7u f7uVar = ((pgn) rgnVar).b;
                        ((yks) crVar2.f).n(w5j.a, ((pgn) rgnVar).a, f7uVar.c(), j2);
                    }
                    xdrVar.m(null, qgn.a);
                    oqiVar = oqiVar2;
                    oqiVar.b(null);
                    return Unit.a;
                } catch (Throwable th) {
                    th = th;
                    oqiVar2.b(null);
                    throw th;
                }
            }
            int i3 = this.m;
            j = this.l;
            cr crVar4 = this.k;
            oqiVar = this.j;
            qgg.h0(obj);
            i = i3;
            crVar = crVar4;
            ssg.a(3, "RadioPlaybackImpl", "Stopping", null);
            if (((xdr) crVar.b).getValue() instanceof qgn) {
                ssg.a(6, "RadioPlaybackImpl", "Already stopped. Call skipped", null);
                oqiVar.b(null);
                return Unit.a;
            }
            n3m n3mVar = (n3m) crVar.e;
            this.j = oqiVar;
            this.k = crVar;
            this.l = j;
            this.m = i;
            this.n = 2;
            if (n3mVar.O0(this) != nm6Var) {
                crVar2 = crVar;
                j2 = j;
                oqiVar2 = oqiVar;
                bjt bjtVar2 = (bjt) crVar2.d;
                xdr xdrVar2 = (xdr) crVar2.b;
                crVar3 = (cr) bjtVar2.d;
                if (crVar3 != null) {
                }
                bjtVar2.d = null;
                rgnVar = (rgn) xdrVar2.getValue();
                if (!(rgnVar instanceof pgn)) {
                }
                xdrVar2.m(null, qgn.a);
                oqiVar = oqiVar2;
                oqiVar.b(null);
                return Unit.a;
            }
            return nm6Var;
        } catch (Throwable th2) {
            th = th2;
            oqiVar2 = oqiVar;
            oqiVar2.b(null);
            throw th;
        }
    }
}
