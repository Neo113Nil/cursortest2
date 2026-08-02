package defpackage;

import com.yandex.music.shared.playback.api.commands.PauseCommand;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public final class mj0 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj0(long j, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = j;
        this.m = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new mj0((oj0) this.m, this.l, continuation, 0);
            case 1:
                return new mj0((jac) this.m, this.l, continuation, 1);
            case 2:
                return new mj0((zfd) this.m, this.l, continuation, 2);
            case 3:
                return new mj0(this.l, (kmd) this.m, continuation, 3);
            case 4:
                return new mj0((qmg) this.m, this.l, continuation, 4);
            case 5:
                return new mj0((nnd) this.m, this.l, continuation, 5);
            case 6:
                return new mj0((ayn) this.m, this.l, continuation, 6);
            case 7:
                return new mj0((n5q) this.m, this.l, continuation, 7);
            case 8:
                return new mj0((cr) this.m, this.l, continuation, 8);
            case 9:
                return new mj0((s7r) this.m, this.l, continuation, 9);
            case 10:
                return new mj0(this.l, (e8r) this.m, continuation, 10);
            default:
                return new mj0(this.l, (hur) this.m, continuation, 11);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((mj0) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        if (defpackage.y2x.o(8, r15) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0031, code lost:
    
        if (defpackage.y2x.o(r2 - 8, r15) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
    
        if (r2.emit(r3, r15) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (defpackage.y2x.o(r2, r15) == r0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        if (defpackage.lmm.a((defpackage.wb7) r5, r6, r15) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ae, code lost:
    
        if (r5 == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01b7, code lost:
    
        if (defpackage.fk0.c(r0, r2, r3, null, r15, 12) == r10) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x017d, code lost:
    
        if (r0.f(r5, r15) == r10) goto L90;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object H;
        Object value;
        Object g0;
        Object a;
        int i = this.j;
        int i2 = 2;
        long j = this.l;
        Object obj2 = this.m;
        int i3 = 1;
        boolean z = false;
        boolean z2 = false;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    cyi cyiVar = ((oj0) obj2).a;
                    this.k = 1;
                    if (cyiVar.b(j, this) == nm6Var) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    ced cedVar = (ced) ((jac) obj2).e;
                    if (cedVar != null) {
                        this.k = 1;
                        double d = j / 1000;
                        mdg mdgVar = cedVar.a;
                        String d2 = dfi.d(j, "rewind ");
                        mdk rewindPayload = cedVar.b().getPayloadFactory().getRewindPayload(d);
                        rewindPayload.getClass();
                        H = cedVar.H(mdgVar, d2, rewindPayload, this);
                        if (H == nm6Var2) {
                            break;
                        }
                    }
                    break;
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    H = obj;
                }
                wdd wddVar = (wdd) H;
                boolean z3 = wddVar != null ? wddVar.a : false;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    jac jacVar = ((zfd) obj2).j;
                    this.k = 1;
                    jacVar.getClass();
                    if (x97.V(dm6.b, new mj0(jacVar, this.l, (Continuation) null, 1), this) == nm6Var3) {
                        break;
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                kmd kmdVar = (kmd) obj2;
                nm6 nm6Var4 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    int i8 = lgc.c;
                    lgc.a = j;
                    msa msaVar = nsa.b;
                    lgc.b = yd5.N(System.currentTimeMillis(), ssa.MILLISECONDS);
                    eno enoVar = new eno(new z21(i2, 18, z ? 1 : 0));
                    imd imdVar = new imd(kmdVar, i3);
                    this.k = 1;
                    if (enoVar.collect(imdVar, this) == nm6Var4) {
                        break;
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                ((k1l) kmdVar.b.getValue()).a(PauseCommand.INSTANCE, a3t.a);
                rar rarVar = kmdVar.c;
                if (rarVar != null) {
                    rarVar.g(null);
                }
                xdr xdrVar = kmdVar.d;
                do {
                    value = xdrVar.getValue();
                } while (!xdrVar.k(value, ljs.a));
            case 4:
                qmg qmgVar = (qmg) obj2;
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    kvh L = y1g.L(qmgVar.c.a);
                    this.k = 1;
                    g0 = zsd.g0(L, this);
                    if (g0 == nm6Var5) {
                        break;
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    g0 = obj;
                }
                String str = (String) wdg.A(((d6l) g0).a, b3i.j);
                jmg.a.getClass();
                Pair pair = new Pair("uuid", qmgVar.f);
                Pair pair2 = new Pair("reason", qmgVar.k);
                Pair pair3 = new Pair("time", Long.valueOf(System.currentTimeMillis() - j));
                omg omgVar = qmgVar.g;
                nmg nmgVar = omgVar instanceof nmg ? (nmg) omgVar : null;
                qmgVar.u("RESTORE_PLAYER_SUCCESS", uah.e(pair, pair2, pair3, new Pair("source", nmgVar != null ? nmgVar.a : "storage"), new Pair("queueType", str)));
                break;
            case 5:
                Object obj3 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    cr crVar = (cr) ((nnd) obj2).b;
                    this.k = 1;
                    Object V = x97.V((a) crVar.g, new kgn(crVar, j, null), this);
                    Object obj4 = V;
                    if (V != obj3) {
                        obj4 = Unit.a;
                    }
                    if (obj4 == obj3) {
                        break;
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                ayn aynVar = (ayn) obj2;
                nm6 nm6Var6 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    fk0 fk0Var = aynVar.t;
                    enj enjVar = new enj(j);
                    this.k = 1;
                    break;
                } else if (i11 == 1) {
                    qgg.h0(obj);
                } else if (i11 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    aynVar.s.setValue(null);
                    break;
                }
                fk0 fk0Var2 = aynVar.t;
                enj enjVar2 = new enj(0L);
                b9r Q = weo.Q(0.0f, 400.0f, new enj((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L)), 1);
                this.k = 2;
                break;
            case 7:
                n5q n5qVar = (n5q) obj2;
                a7q a7qVar = n5qVar.a;
                Object obj5 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    Object firstOrNull = CollectionsKt.firstOrNull(a7qVar.n.d.b());
                    h5q h5qVar = h5q.b;
                    long j2 = this.l;
                    if (firstOrNull != h5qVar) {
                        this.k = 1;
                        a7qVar.getClass();
                        Object V2 = x97.V(mal.b(), new g84(a7qVar, j2, null, 2), this);
                        Object obj6 = V2;
                        if (V2 != obj5) {
                            obj6 = Unit.a;
                        }
                        if (obj6 == obj5) {
                            break;
                        }
                    } else {
                        n5qVar.g = new Long(j2);
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var7 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    ssg.a(3, "SmartSwapPlayerWrapper", "seekTo(position=" + j + ")", null);
                    s5d s5dVar = (s5d) ((cr) obj2).h;
                    this.k = 1;
                    if (s5dVar.o(j, this) == nm6Var7) {
                        break;
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 9:
                nm6 nm6Var8 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    a = s7r.a((s7r) obj2, this);
                    break;
                } else if (i14 == 1) {
                    qgg.h0(obj);
                    a = obj;
                } else if (i14 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                jxo jxoVar = new jxo(j, z2 ? 1 : 0, i3);
                this.k = 2;
                break;
            case 10:
                nm6 nm6Var9 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else if (i15 == 1) {
                    qgg.h0(obj);
                } else if (i15 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                j0q j0qVar = ((e8r) obj2).r;
                y6r y6rVar = y6r.a;
                this.k = 2;
                break;
            default:
                nm6 nm6Var10 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    break;
                } else if (i16 == 1) {
                    qgg.h0(obj);
                } else if (i16 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    zt3 zt3Var = ((hur) obj2).c;
                    if (zt3Var != null) {
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(new t7o(new hfm(j)));
                    }
                    break;
                }
                this.k = 2;
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj0(Object obj, long j, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = obj;
        this.l = j;
    }
}
