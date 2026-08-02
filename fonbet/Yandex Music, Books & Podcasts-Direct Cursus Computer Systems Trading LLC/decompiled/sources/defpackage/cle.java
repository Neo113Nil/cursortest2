package defpackage;

import android.util.Log;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.pulse.metrics.o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class cle extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public cle(pyc pycVar, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        switch (i) {
            case 22:
                this.n = (aur) pycVar;
                super(3, continuation);
                break;
            default:
                this.n = (aur) pycVar;
                break;
        }
    }

    private final Object k(Object obj) {
        w5u w5uVar = (w5u) this.n;
        Object obj2 = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.l;
            Pair pair = (Pair) this.m;
            List list = (List) pair.a;
            int intValue = ((Number) pair.b).intValue();
            List list2 = list;
            ArrayList arrayList = new ArrayList(v75.o(list2, 10));
            Iterator it = list2.iterator();
            while (true) {
                Continuation continuation = null;
                if (!it.hasNext()) {
                    break;
                }
                x1u x1uVar = (x1u) it.next();
                l18 l18Var = l18.b;
                bdt I = hag.I(frt.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                String str = ((frt) qdcVar.C(I)).c().a;
                str.getClass();
                p2m p2mVar = (p2m) w5uVar.h.getValue();
                p2mVar.getClass();
                yc4 M0 = zsd.M0(p2mVar.a.a(str, new z0i(2, 11, continuation)), new gv6(continuation, w5uVar, x1uVar, 15));
                arrayList.add(new bca(new u21(10, w5uVar.g, M0, new v42(x1uVar, continuation, 15)), 18));
            }
            pjc[] pjcVarArr = (pjc[]) CollectionsKt.w0(arrayList).toArray(new pjc[0]);
            this.l = null;
            this.m = null;
            this.k = 1;
            zsd.f0(rjcVar);
            Object y = tt0.y(rjcVar, new l1k(null, w5uVar, list, intValue), this, new tn1(pjcVarArr, 5), pjcVarArr);
            Object obj3 = nm6.a;
            if (y != obj3) {
                y = Unit.a;
            }
            if (y != obj3) {
                y = Unit.a;
            }
            if (y == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    private final Object l(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.k;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.l;
            pjc pjcVar = ((y7q) this.m) instanceof u7q ? ((p6u) this.n).a.b.c : z4b.a;
            this.l = null;
            this.m = null;
            this.k = 1;
            if (zsd.e0(rjcVar, pjcVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }

    /* JADX WARN: Type inference failed for: r1v34, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r1v44, types: [aur, pyc] */
    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                cle cleVar = new cle((Continuation) obj3, (jx7) this.n, 0);
                cleVar.l = (rjc) obj;
                cleVar.m = obj2;
                return cleVar.invokeSuspend(Unit.a);
            case 1:
                cle cleVar2 = new cle((Continuation) obj3, (x8a) this.n, 1);
                cleVar2.l = (rjc) obj;
                cleVar2.m = obj2;
                return cleVar2.invokeSuspend(Unit.a);
            case 2:
                cle cleVar3 = new cle((Continuation) obj3, (rjf) this.n, 2);
                cleVar3.l = (rjc) obj;
                cleVar3.m = obj2;
                return cleVar3.invokeSuspend(Unit.a);
            case 3:
                cle cleVar4 = new cle((Continuation) obj3, (nsh) this.n, 3);
                cleVar4.l = (rjc) obj;
                cleVar4.m = obj2;
                return cleVar4.invokeSuspend(Unit.a);
            case 4:
                cle cleVar5 = new cle((Continuation) obj3, (yk3) this.n, 4);
                cleVar5.l = (rjc) obj;
                cleVar5.m = obj2;
                return cleVar5.invokeSuspend(Unit.a);
            case 5:
                cle cleVar6 = new cle((Continuation) obj3, (bui) this.n, 5);
                cleVar6.l = (rjc) obj;
                cleVar6.m = obj2;
                return cleVar6.invokeSuspend(Unit.a);
            case 6:
                cle cleVar7 = new cle((rvi) this.n, (Continuation) obj3, 6);
                cleVar7.l = (jsi) obj;
                cleVar7.m = (tui) obj2;
                return cleVar7.invokeSuspend(Unit.a);
            case 7:
                cle cleVar8 = new cle((Continuation) obj3, (tyi) this.n, 7);
                cleVar8.l = (rjc) obj;
                cleVar8.m = obj2;
                return cleVar8.invokeSuspend(Unit.a);
            case 8:
                cle cleVar9 = new cle((Continuation) obj3, (fdj) this.n, 8);
                cleVar9.l = (rjc) obj;
                cleVar9.m = obj2;
                return cleVar9.invokeSuspend(Unit.a);
            case 9:
                ((Boolean) obj2).getClass();
                cle cleVar10 = new cle((j1k) this.n, (Continuation) obj3, 9);
                cleVar10.m = (h1k) obj;
                return cleVar10.invokeSuspend(Unit.a);
            case 10:
                cle cleVar11 = new cle((Continuation) obj3, (j1k) this.n, 10);
                cleVar11.l = (rjc) obj;
                cleVar11.m = obj2;
                return cleVar11.invokeSuspend(Unit.a);
            case 11:
                cle cleVar12 = new cle((Continuation) obj3, (njf) this.n, 11);
                cleVar12.l = (rjc) obj;
                cleVar12.m = obj2;
                return cleVar12.invokeSuspend(Unit.a);
            case 12:
                cle cleVar13 = new cle((Continuation) obj3, (fkn) this.n, 12);
                cleVar13.l = (rjc) obj;
                cleVar13.m = obj2;
                return cleVar13.invokeSuspend(Unit.a);
            case 13:
                cle cleVar14 = new cle((Continuation) obj3, (mfl) this.n, 13);
                cleVar14.l = (rjc) obj;
                cleVar14.m = obj2;
                return cleVar14.invokeSuspend(Unit.a);
            case 14:
                cle cleVar15 = new cle((Continuation) obj3, (dn9) this.n, 14);
                cleVar15.l = (rjc) obj;
                cleVar15.m = obj2;
                return cleVar15.invokeSuspend(Unit.a);
            case 15:
                cle cleVar16 = new cle((Continuation) obj3, (thl) this.n, 15);
                cleVar16.l = (rjc) obj;
                cleVar16.m = obj2;
                return cleVar16.invokeSuspend(Unit.a);
            case 16:
                cle cleVar17 = new cle((Continuation) obj3, (tll) this.n, 16);
                cleVar17.l = (rjc) obj;
                cleVar17.m = obj2;
                return cleVar17.invokeSuspend(Unit.a);
            case 17:
                cle cleVar18 = new cle((pyc) this.n, (Continuation) obj3, 17);
                cleVar18.m = obj;
                cleVar18.l = obj2;
                return cleVar18.invokeSuspend(Unit.a);
            case 18:
                cle cleVar19 = new cle((Continuation) obj3, (n7q) this.n, 18);
                cleVar19.l = (rjc) obj;
                cleVar19.m = (Object[]) obj2;
                return cleVar19.invokeSuspend(Unit.a);
            case 19:
                cle cleVar20 = new cle((Continuation) obj3, (cqp) this.n, 19);
                cleVar20.l = (rjc) obj;
                cleVar20.m = obj2;
                return cleVar20.invokeSuspend(Unit.a);
            case 20:
                cle cleVar21 = new cle((Continuation) obj3, (yrp) this.n, 20);
                cleVar21.l = (rjc) obj;
                cleVar21.m = obj2;
                return cleVar21.invokeSuspend(Unit.a);
            case 21:
                cle cleVar22 = new cle((Continuation) obj3, (zrp) this.n, 21);
                cleVar22.l = (rjc) obj;
                cleVar22.m = obj2;
                return cleVar22.invokeSuspend(Unit.a);
            case 22:
                cle cleVar23 = new cle((pyc) this.n, (Continuation) obj3, 22);
                cleVar23.l = (z1q) obj;
                cleVar23.m = (PlaybackCommand$QueueBound.Basic) obj2;
                return cleVar23.invokeSuspend(Unit.a);
            case 23:
                cle cleVar24 = new cle((Continuation) obj3, (toh) this.n, 23);
                cleVar24.l = (rjc) obj;
                cleVar24.m = obj2;
                return cleVar24.invokeSuspend(Unit.a);
            case 24:
                cle cleVar25 = new cle((s8q) this.n, (Continuation) obj3, 24);
                cleVar25.l = (l7u) obj;
                cleVar25.m = (noh) obj2;
                return cleVar25.invokeSuspend(Unit.a);
            case 25:
                cle cleVar26 = new cle((vnr) this.m, (x3n) this.n, (Continuation) obj3);
                cleVar26.l = (rjc) obj;
                return cleVar26.invokeSuspend(Unit.a);
            case 26:
                cle cleVar27 = new cle((h1t) this.n, (Continuation) obj3, 26);
                cleVar27.l = (y9a) obj;
                cleVar27.m = (j1g) obj2;
                return cleVar27.invokeSuspend(Unit.a);
            case 27:
                cle cleVar28 = new cle((Continuation) obj3, (w5u) this.n, 27);
                cleVar28.l = (rjc) obj;
                cleVar28.m = obj2;
                return cleVar28.invokeSuspend(Unit.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                cle cleVar29 = new cle((Continuation) obj3, (p6u) this.n, 28);
                cleVar29.l = (rjc) obj;
                cleVar29.m = obj2;
                return cleVar29.invokeSuspend(Unit.a);
            default:
                cle cleVar30 = new cle((Continuation) obj3, (cvu) this.n, 29);
                cleVar30.l = (rjc) obj;
                cleVar30.m = obj2;
                return cleVar30.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:412:0x07b8, code lost:
    
        if (r4 == r2) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if (r3.emit(r1, r30) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0135, code lost:
    
        if (defpackage.y2x.o(3000, r30) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0128, code lost:
    
        if (r3.emit(r2, r30) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0103, code lost:
    
        if (defpackage.y2x.o(r10, r30) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0190, code lost:
    
        if (defpackage.x97.V(r1, r2, r30) == r5) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c1, code lost:
    
        if (defpackage.x97.V(r1, r2, r30) == r5) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:243:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07d8  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0812  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0848  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0814  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x07db  */
    /* JADX WARN: Type inference failed for: r4v81, types: [aur, pyc] */
    /* JADX WARN: Type inference failed for: r5v49, types: [aur, pyc] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pjc fsVar;
        Object j;
        h1k h1kVar;
        Object a;
        s4k s4kVar;
        t4k t4kVar;
        Object e;
        s4k s4kVar2;
        List list;
        t4k t4kVar2;
        List list2;
        Object c;
        t4k t4kVar3;
        pjc v0bVar;
        pjc fsVar2;
        fs fsVar3;
        pjc pjcVar;
        pjc ailVar;
        pjc pjcVar2;
        pjc z50Var;
        pjc fsVar4;
        int i = 8;
        int i2 = 9;
        int i3 = 6;
        int i4 = 4;
        int i5 = 12;
        int i6 = 0;
        int i7 = 2;
        int i8 = 15;
        int i9 = 1;
        Continuation continuation = null;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = (rjc) this.l;
                    lke lkeVar = (lke) this.m;
                    pjc a2 = lkeVar != null ? lkeVar.a((jx7) this.n) : new fs(i8, continuation);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar, a2, this) == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i10 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = (rjc) this.l;
                    pjc enoVar = ((Boolean) this.m).booleanValue() ? new eno(new jmd((x8a) this.n, continuation, 5)) : z4b.a;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, enoVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i11 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = (rjc) this.l;
                    pjc a3 = ((Boolean) this.m).booleanValue() ? ((xy1) ((jyr) ((rjf) this.n).k).getValue()).a() : new fs(i8, yy1.e);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar3, a3, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i12 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 3:
                nsh nshVar = (nsh) this.n;
                nm6 nm6Var4 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar4 = (rjc) this.l;
                    j5g j5gVar = (j5g) this.m;
                    pjc i14 = ((t3g) nshVar.c).i(j5gVar.a.a);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar4);
                    Object collect = i14.collect(new tl0(24, rjcVar4, nshVar, j5gVar), this);
                    if (collect != nm6Var4) {
                        collect = Unit.a;
                    }
                    if (collect != nm6Var4) {
                        collect = Unit.a;
                    }
                    if (collect == nm6Var4) {
                        return nm6Var4;
                    }
                } else {
                    if (i13 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 4:
                yk3 yk3Var = (yk3) this.n;
                nm6 nm6Var5 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar5 = (rjc) this.l;
                    Pair pair = (Pair) this.m;
                    mqs mqsVar = (mqs) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        hqs hqsVar = mqsVar.o;
                        fsVar = (hqsVar == null || !hqsVar.b) ? (hqsVar == null || !hqsVar.a) ? new fs(i8, new o3h(mqsVar, new g2h(null))) : zsd.K(new j2h(mqsVar, yk3Var, r2h.TEXT, null)) : zsd.K(new j2h(mqsVar, yk3Var, r2h.LRC, null));
                    } else {
                        fsVar = new fs(i8, new o3h(mqsVar, new g2h(null)));
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar5, fsVar, this) == nm6Var5) {
                        return nm6Var5;
                    }
                } else {
                    if (i15 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar6 = (rjc) this.l;
                    pjc m = ((bui) this.n).l.m(Integer.MAX_VALUE);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar6, m, this) == nm6Var6) {
                        return nm6Var6;
                    }
                } else {
                    if (i16 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 6:
                rvi rviVar = (rvi) this.n;
                jsi jsiVar = (jsi) this.l;
                tui tuiVar = (tui) this.m;
                nm6 nm6Var7 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    xdr xdrVar = rviVar.l;
                    Boolean bool = Boolean.FALSE;
                    xdrVar.getClass();
                    xdrVar.m(null, bool);
                    jsi jsiVar2 = jsiVar == null ? rviVar.t : jsiVar;
                    if (jsiVar == null && jsiVar2 != null) {
                        x97.y(ot0.F(rviVar), null, null, new ovi(rviVar, continuation, i7), 3);
                        jvi jviVar = (jvi) rviVar.k.getValue();
                        if (jviVar instanceof ivi) {
                            return jviVar;
                        }
                    }
                    if (jsiVar != null) {
                        rviVar.t = jsiVar;
                    }
                    if (jsiVar2 == null) {
                        return fvi.a;
                    }
                    iwe iweVar = rviVar.r;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    j = iweVar.j(jsiVar2, tuiVar, this);
                    if (j == nm6Var7) {
                        return nm6Var7;
                    }
                } else {
                    if (i17 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    j = obj;
                }
                nvi nviVar = (nvi) j;
                if (nviVar instanceof lvi) {
                    return new ivi((lvi) nviVar);
                }
                if (nviVar instanceof mvi) {
                    return new hvi((mvi) nviVar);
                }
                if (nviVar == null) {
                    return evi.a;
                }
                b6e.s();
                return null;
            case 7:
                tyi tyiVar = (tyi) this.n;
                nm6 nm6Var8 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar7 = (rjc) this.l;
                    pjc alcVar = ((Boolean) this.m).booleanValue() ? new alc(new eno(new m1i(tyiVar, continuation, i5)), new ow1(tyiVar, continuation, i4)) : z4b.a;
                    this.k = 1;
                    if (zsd.e0(rjcVar7, alcVar, this) == nm6Var8) {
                        return nm6Var8;
                    }
                } else {
                    if (i18 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar8 = (rjc) this.l;
                    boolean booleanValue = ((Boolean) this.m).booleanValue();
                    pjc c2 = ((fdj) this.n).a.c();
                    if (!booleanValue) {
                        c2 = null;
                    }
                    if (c2 == null) {
                        c2 = new fs(i8, Boolean.FALSE);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar8, c2, this) == nm6Var9) {
                        return nm6Var9;
                    }
                } else {
                    if (i19 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 9:
                j1k j1kVar = (j1k) this.n;
                nm6 nm6Var10 = nm6.a;
                int i20 = this.k;
                if (i20 == 0) {
                    qgg.h0(obj);
                    h1kVar = (h1k) this.m;
                    s4k s4kVar3 = h1kVar != null ? h1kVar.a.b : null;
                    this.m = h1kVar;
                    this.k = 1;
                    a = j1k.a(j1kVar, s4kVar3, this);
                    break;
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        s4kVar2 = (s4k) this.l;
                        h1kVar = (h1k) this.m;
                        qgg.h0(obj);
                        e = obj;
                        t4kVar = (t4k) e;
                        s4kVar = s4kVar2;
                        list = t4kVar != null ? t4kVar.a : null;
                        if ((list != null || list.isEmpty()) && h1kVar != null && (t4kVar2 = h1kVar.b) != null && (list2 = t4kVar2.a) != null && (!list2.isEmpty())) {
                            t4kVar = t4kVar2;
                        }
                        if ((t4kVar != null ? t4kVar.b : null) == null) {
                            if (((h1kVar == null || (t4kVar3 = h1kVar.b) == null) ? null : t4kVar3.b) != null) {
                                t4kVar = h1kVar.b;
                            }
                        }
                        if (t4kVar == null) {
                            c = null;
                        } else {
                            c = s4kVar.c(t4kVar);
                            if (hyf.a != null && Log.isLoggable("Paging", 3)) {
                                Log.d("Paging", "Refresh key " + c + " returned from PagingSource " + s4kVar);
                            }
                        }
                        if (h1kVar != null) {
                            h1kVar.a.j.g(null);
                        }
                        if (h1kVar != null) {
                            h1kVar.c.g(null);
                        }
                        return new h1k(new w1k(c, s4kVar, j1kVar.b, (b56) j1kVar.d.b, t4kVar, new msj(0, j1kVar, j1k.class, "refresh", "refresh()V", 0, 5)), t4kVar, saf.p());
                    }
                    h1kVar = (h1k) this.m;
                    qgg.h0(obj);
                    a = obj;
                }
                s4kVar = (s4k) a;
                if (h1kVar == null) {
                    t4kVar = null;
                    list = t4kVar != null ? t4kVar.a : null;
                    if (list != null) {
                    }
                    t4kVar = t4kVar2;
                    if ((t4kVar != null ? t4kVar.b : null) == null) {
                    }
                    if (t4kVar == null) {
                    }
                    if (h1kVar != null) {
                    }
                    if (h1kVar != null) {
                    }
                    return new h1k(new w1k(c, s4kVar, j1kVar.b, (b56) j1kVar.d.b, t4kVar, new msj(0, j1kVar, j1k.class, "refresh", "refresh()V", 0, 5)), t4kVar, saf.p());
                }
                w1k w1kVar = h1kVar.a;
                this.m = h1kVar;
                this.l = s4kVar;
                this.k = 2;
                e = w1kVar.e(this);
                if (e != nm6Var10) {
                    s4kVar2 = s4kVar;
                    t4kVar = (t4k) e;
                    s4kVar = s4kVar2;
                    list = t4kVar != null ? t4kVar.a : null;
                    if (list != null) {
                    }
                    t4kVar = t4kVar2;
                    if ((t4kVar != null ? t4kVar.b : null) == null) {
                    }
                    if (t4kVar == null) {
                    }
                    if (h1kVar != null) {
                    }
                    if (h1kVar != null) {
                    }
                    return new h1k(new w1k(c, s4kVar, j1kVar.b, (b56) j1kVar.d.b, t4kVar, new msj(0, j1kVar, j1k.class, "refresh", "refresh()V", 0, 5)), t4kVar, saf.p());
                }
                return nm6Var10;
            case 10:
                j1k j1kVar2 = (j1k) this.n;
                nm6 nm6Var11 = nm6.a;
                int i21 = this.k;
                if (i21 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar9 = (rjc) this.l;
                    h1k h1kVar2 = (h1k) this.m;
                    v3k v3kVar = new v3k(new ub7(i5, h1kVar2.a.k, new z0i(i7, i, continuation)), new qdc(j1kVar2, j1kVar2.d), new awc(h1kVar2.a), xuj.v);
                    this.k = 1;
                    if (rjcVar9.emit(v3kVar, this) == nm6Var11) {
                        return nm6Var11;
                    }
                } else {
                    if (i21 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                int i22 = this.k;
                if (i22 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar10 = (rjc) this.l;
                    pjc pjcVar3 = ((Boolean) this.m).booleanValue() ? (njf) this.n : z4b.a;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar10, pjcVar3, this) == nm6Var12) {
                        return nm6Var12;
                    }
                } else {
                    if (i22 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 12:
                fkn fknVar = (fkn) this.n;
                nm6 nm6Var13 = nm6.a;
                int i23 = this.k;
                if (i23 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar11 = (rjc) this.l;
                    int ordinal = ((l7l) this.m).ordinal();
                    if (ordinal == 0) {
                        v0bVar = new v0b(fknVar, i9);
                    } else if (ordinal == 1) {
                        v0bVar = new bca(fknVar, 18);
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        v0bVar = new v0b(fknVar, i7);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar11, v0bVar, this) == nm6Var13) {
                        return nm6Var13;
                    }
                } else {
                    if (i23 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                int i24 = this.k;
                if (i24 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar12 = (rjc) this.l;
                    mqs mqsVar2 = (mqs) this.m;
                    pjc fsVar5 = mqsVar2 == null ? new fs(i8, ifl.a) : new pf5(((mfl) this.n).a.i, mqsVar2, i3);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar12, fsVar5, this) == nm6Var14) {
                        return nm6Var14;
                    }
                } else {
                    if (i24 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 14:
                dn9 dn9Var = (dn9) this.n;
                Object obj2 = nm6.a;
                int i25 = this.k;
                if (i25 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar13 = (rjc) this.l;
                    mwk mwkVar = (mwk) this.m;
                    ((xdr) dn9Var.e).l(null);
                    l18 l18Var = l18.b;
                    bdt I = hag.I(frt.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    String str = ((frt) qdcVar.C(I)).c().a;
                    str.getClass();
                    p2m p2mVar = (p2m) ((jyr) dn9Var.f).getValue();
                    p2mVar.getClass();
                    int i26 = 11;
                    clc clcVar = new clc(zsd.M0(p2mVar.a.a(str, new z0i(i7, i26, continuation)), new gv6(continuation, dn9Var, mwkVar, i2)), new jud(i7, i5, continuation));
                    xdr xdrVar2 = (xdr) dn9Var.e;
                    v42 v42Var = new v42(mwkVar, continuation, i26);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar13);
                    Object y = tt0.y(rjcVar13, new l1((Object) v42Var, continuation, 25), this, wg.s, new pjc[]{xdrVar2, clcVar});
                    if (y != obj2) {
                        y = Unit.a;
                    }
                    if (y != obj2) {
                        y = Unit.a;
                    }
                    if (y == obj2) {
                        return obj2;
                    }
                } else {
                    if (i25 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 15:
                nm6 nm6Var15 = nm6.a;
                int i27 = this.k;
                if (i27 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar14 = (rjc) this.l;
                    vat vatVar = (vat) this.m;
                    xml xmlVar = (xml) vatVar.a;
                    g08 g08Var = (g08) vatVar.b;
                    v84 v84Var = (v84) vatVar.c;
                    if (Intrinsics.d(xmlVar, vml.a) || Intrinsics.d(xmlVar, vml.b)) {
                        fsVar2 = new fs(i8, ke5.a);
                    } else {
                        if (!(xmlVar instanceof wml)) {
                            b6e.s();
                            return null;
                        }
                        thl thlVar = (thl) this.n;
                        wml wmlVar = (wml) xmlVar;
                        kml kmlVar = wmlVar.a;
                        n7q n7qVar = wmlVar.b;
                        n7qVar.getClass();
                        g08Var.getClass();
                        v84Var.getClass();
                        h9n h9nVar = thlVar.a;
                        h9nVar.getClass();
                        bdc bdcVar = h9nVar.a;
                        g8c g8cVar = h9nVar.b;
                        jcl jclVar = h9nVar.c;
                        bdcVar.getClass();
                        jclVar.getClass();
                        g08Var.getClass();
                        bdcVar.getClass();
                        jclVar.getClass();
                        x3n x3nVar = new x3n();
                        x3nVar.a = g08Var;
                        x3nVar.b = bdcVar;
                        x3nVar.c = g8cVar;
                        x3nVar.d = jclVar;
                        fsVar2 = new rhl(new qm((pjc) wdg.A(n7qVar, x3nVar), n7qVar, v84Var, g08Var, 5), n7qVar, kmlVar, thlVar, g08Var);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar14, fsVar2, this) == nm6Var15) {
                        return nm6Var15;
                    }
                } else {
                    if (i27 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 16:
                nm6 nm6Var16 = nm6.a;
                int i28 = this.k;
                if (i28 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar15 = (rjc) this.l;
                    vat vatVar2 = (vat) this.m;
                    mqs mqsVar3 = (mqs) vatVar2.a;
                    boolean booleanValue2 = ((Boolean) vatVar2.b).booleanValue();
                    boolean booleanValue3 = ((Boolean) vatVar2.c).booleanValue();
                    r2h L = mqsVar3 != null ? hdg.L(mqsVar3) : null;
                    if (L == null || !booleanValue2) {
                        fsVar3 = new fs(i8, xll.a);
                    } else if (booleanValue3) {
                        pjcVar = zsd.K(new nll((tll) this.n, mqsVar3, L, null));
                        this.l = null;
                        this.m = null;
                        this.k = 1;
                        if (zsd.e0(rjcVar15, pjcVar, this) == nm6Var16) {
                            return nm6Var16;
                        }
                    } else {
                        fsVar3 = new fs(i8, vll.a);
                    }
                    pjcVar = fsVar3;
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar15, pjcVar, this) == nm6Var16) {
                    }
                } else {
                    if (i28 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 17:
                nm6 nm6Var17 = nm6.a;
                int i29 = this.k;
                if (i29 != 0) {
                    if (i29 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Object obj3 = this.m;
                Object obj4 = this.l;
                ?? r4 = (aur) this.n;
                this.m = null;
                this.k = 1;
                Object invoke = r4.invoke(obj3, obj4, this);
                return invoke == nm6Var17 ? nm6Var17 : invoke;
            case 18:
                nm6 nm6Var18 = nm6.a;
                int i30 = this.k;
                if (i30 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar16 = (rjc) this.l;
                    orp orpVar = new orp(uz0.c((brp[]) ((Object[]) this.m)), ((n7q) this.n).b());
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (rjcVar16.emit(orpVar, this) == nm6Var18) {
                        return nm6Var18;
                    }
                } else {
                    if (i30 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 19:
                cqp cqpVar = (cqp) this.n;
                nm6 nm6Var19 = nm6.a;
                int i31 = this.k;
                if (i31 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar17 = (rjc) this.l;
                    ifd ifdVar = new ifd(((odd) cqpVar.a.getValue()).b.j, i6);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar17);
                    Object collect2 = ifdVar.collect(new tek(29, rjcVar17, cqpVar), this);
                    if (collect2 != nm6Var19) {
                        collect2 = Unit.a;
                    }
                    if (collect2 != nm6Var19) {
                        collect2 = Unit.a;
                    }
                    if (collect2 == nm6Var19) {
                        return nm6Var19;
                    }
                } else {
                    if (i31 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 20:
                yrp yrpVar = (yrp) this.n;
                nm6 nm6Var20 = nm6.a;
                int i32 = this.k;
                if (i32 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar18 = (rjc) this.l;
                    csp q = yrpVar.q((n7q) this.m);
                    if (q instanceof asp) {
                        ailVar = new fs(i8, new c73(yrpVar.a()));
                    } else {
                        if (!(q instanceof bsp)) {
                            b6e.s();
                            return null;
                        }
                        ailVar = new ail(23, ((bsp) q).a, yrpVar);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar18, ailVar, this) == nm6Var20) {
                        return nm6Var20;
                    }
                } else {
                    if (i32 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 21:
                nm6 nm6Var21 = nm6.a;
                int i33 = this.k;
                if (i33 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar19 = (rjc) this.l;
                    csp q2 = ((zrp) this.n).q((n7q) this.m);
                    if (q2 instanceof asp) {
                        pjcVar2 = z4b.a;
                    } else {
                        if (!(q2 instanceof bsp)) {
                            b6e.s();
                            return null;
                        }
                        pjcVar2 = ((bsp) q2).a;
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar19, pjcVar2, this) == nm6Var21) {
                        return nm6Var21;
                    }
                } else {
                    if (i33 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 22:
                z1q z1qVar = (z1q) this.l;
                PlaybackCommand$QueueBound.Basic basic = (PlaybackCommand$QueueBound.Basic) this.m;
                nm6 nm6Var22 = nm6.a;
                int i34 = this.k;
                if (i34 == 0) {
                    qgg.h0(obj);
                    kun kunVar = new kun((pyc) this.n, basic, (Continuation) null);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    z1qVar.getClass();
                    if (kunVar.invoke(z1qVar, this) == nm6Var22) {
                        return nm6Var22;
                    }
                } else {
                    if (i34 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 23:
                toh tohVar = (toh) this.n;
                nm6 nm6Var23 = nm6.a;
                int i35 = this.k;
                if (i35 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar20 = (rjc) this.l;
                    mqs mqsVar4 = (mqs) this.m;
                    if (mqsVar4 == null) {
                        z50Var = z4b.a;
                    } else {
                        baw bawVar = (baw) ((arf) tohVar.d).getValue();
                        bawVar.getClass();
                        z50Var = new z50(zsd.d0(new u21(i2, pu1.e, ((t3g) bawVar.a.getValue()).w(mqsVar4), new w83(3, (tu1) tohVar.e, tu1.class, "scan", "scan(Lcom/yandex/music/shared/base/integration/playback/AttractivenessOperation;Lru/yandex/music/likes/LikeState;)Lcom/yandex/music/shared/base/integration/playback/AttractivenessOperation;", 4, 8)), 2), i);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar20, z50Var, this) == nm6Var23) {
                        return nm6Var23;
                    }
                } else {
                    if (i35 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 24:
                s8q s8qVar = (s8q) this.n;
                AtomicBoolean atomicBoolean = s8qVar.q;
                l7u l7uVar = (l7u) this.l;
                noh nohVar = (noh) this.m;
                nm6 nm6Var24 = nm6.a;
                int i36 = this.k;
                if (i36 == 0) {
                    qgg.h0(obj);
                    if (l7uVar instanceof i7u) {
                        r8q r8qVar = new r8q(s8qVar, continuation, i6);
                        bsd b = dm6.b();
                        this.l = null;
                        this.m = null;
                        this.k = 1;
                        break;
                    } else if (l7uVar instanceof g7u) {
                        ssg.a(6, "SharedVideoClipRadioQueue", "Could not start radio because of network error: " + ((g7u) l7uVar).a, null);
                        r8q r8qVar2 = new r8q(s8qVar, continuation, i9);
                        bsd b2 = dm6.b();
                        this.l = null;
                        this.m = null;
                        this.k = 2;
                        break;
                    } else if (l7uVar instanceof j7u) {
                        j7u j7uVar = (j7u) l7uVar;
                        f7u f7uVar = j7uVar.e;
                        e7u e7uVar = f7uVar.c;
                        String str2 = j7uVar.a;
                        b3l b3lVar = j7uVar.f;
                        y7u y7uVar = s8qVar.k;
                        m4q m4qVar = new m4q(y7uVar.a, y7uVar.c);
                        s7u s7uVar = j7uVar.b;
                        i5u b3 = s7uVar != null ? s8qVar.b(s7uVar) : null;
                        i5u b4 = s8qVar.b(j7uVar.c);
                        s7u s7uVar2 = j7uVar.d;
                        i5u b5 = s7uVar2 != null ? s8qVar.b(s7uVar2) : null;
                        List list3 = f7uVar.b;
                        ArrayList arrayList = new ArrayList(v75.o(list3, 10));
                        Iterator it = list3.iterator();
                        while (it.hasNext()) {
                            arrayList.add(s8qVar.b((s7u) it.next()));
                        }
                        Long l = s8qVar.l;
                        if (atomicBoolean.get()) {
                            l = null;
                        }
                        u7u u7uVar = new u7u(m4qVar, b3, b4, b5, l != null ? l.longValue() : 0L, nohVar, arrayList, c5b.a, e7uVar.a, b3 != null, b5 != null, str2, y7uVar.c, b3lVar);
                        xdr xdrVar3 = s8qVar.n;
                        q7q q7qVar = new q7q(u7uVar);
                        xdrVar3.getClass();
                        xdrVar3.m(null, q7qVar);
                        atomicBoolean.set(true);
                    } else if (!(l7uVar instanceof h7u) && !(l7uVar instanceof k7u)) {
                        b6e.s();
                        return null;
                    }
                } else {
                    if (i36 != 1 && i36 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            case 25:
                x3n x3nVar2 = (x3n) this.n;
                jyr jyrVar = ((vnr) this.m).f;
                rjc rjcVar21 = (rjc) this.l;
                nm6 nm6Var25 = nm6.a;
                int i37 = this.k;
                if (i37 == 0) {
                    qgg.h0(obj);
                    long size = ((wnr) jyrVar.getValue()).b * (((wnr) jyrVar.getValue()).a.size() + 1);
                    this.l = rjcVar21;
                    this.k = 1;
                    break;
                } else if (i37 == 1) {
                    qgg.h0(obj);
                } else if (i37 == 2) {
                    qgg.h0(obj);
                    this.l = rjcVar21;
                    this.k = 3;
                    break;
                } else if (i37 == 3) {
                    qgg.h0(obj);
                    Object value = ((fkn) x3nVar2.d).a.getValue();
                    this.l = null;
                    this.k = 4;
                    break;
                } else {
                    if (i37 == 4) {
                        qgg.h0(obj);
                        return Unit.a;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qor g0 = x3nVar2.g0();
                String str3 = g0.a;
                String str4 = g0.b;
                String str5 = g0.c;
                str3.getClass();
                str4.getClass();
                dor dorVar = new dor(new qor(str3, str4, str5, true));
                this.l = rjcVar21;
                this.k = 2;
                break;
            case 26:
                y9a y9aVar = (y9a) this.l;
                j1g j1gVar = (j1g) this.m;
                nm6 nm6Var26 = nm6.a;
                int i38 = this.k;
                if (i38 != 0) {
                    if (i38 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                h1t h1tVar = (h1t) this.n;
                this.l = null;
                this.m = null;
                this.k = 1;
                Serializable c3 = h1t.c(h1tVar, y9aVar, j1gVar, this);
                return c3 == nm6Var26 ? nm6Var26 : c3;
            case 27:
                return k(obj);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return l(obj);
            default:
                nm6 nm6Var27 = nm6.a;
                int i39 = this.k;
                if (i39 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar22 = (rjc) this.l;
                    boolean booleanValue4 = ((Boolean) this.m).booleanValue();
                    if (booleanValue4) {
                        fsVar4 = zsd.b0(new y4s(((oq7) ((cvu) this.n).f.getValue()).a.c, 20));
                    } else {
                        if (booleanValue4) {
                            b6e.s();
                            return null;
                        }
                        fsVar4 = new fs(i8, Boolean.FALSE);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar22, fsVar4, this) == nm6Var27) {
                        return nm6Var27;
                    }
                } else {
                    if (i39 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cle(vnr vnrVar, x3n x3nVar, Continuation continuation) {
        super(3, continuation);
        this.j = 25;
        this.m = vnrVar;
        this.n = x3nVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cle(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cle(Continuation continuation, Object obj, int i) {
        super(3, continuation);
        this.j = i;
        this.n = obj;
    }
}
