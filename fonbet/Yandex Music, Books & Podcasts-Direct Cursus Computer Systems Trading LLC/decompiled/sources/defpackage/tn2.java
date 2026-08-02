package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class tn2 extends aur implements pyc {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ rjc l;
    public /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tn2(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        rjc rjcVar = (rjc) obj;
        Continuation continuation = (Continuation) obj3;
        switch (this.j) {
            case 0:
                tn2 tn2Var = new tn2(3, 0, continuation);
                tn2Var.l = rjcVar;
                tn2Var.m = obj2;
                return tn2Var.invokeSuspend(Unit.a);
            case 1:
                tn2 tn2Var2 = new tn2(3, 1, continuation);
                tn2Var2.l = rjcVar;
                tn2Var2.m = obj2;
                return tn2Var2.invokeSuspend(Unit.a);
            case 2:
                tn2 tn2Var3 = new tn2(3, 2, continuation);
                tn2Var3.l = rjcVar;
                tn2Var3.m = obj2;
                return tn2Var3.invokeSuspend(Unit.a);
            case 3:
                tn2 tn2Var4 = new tn2(3, 3, continuation);
                tn2Var4.l = rjcVar;
                tn2Var4.m = obj2;
                return tn2Var4.invokeSuspend(Unit.a);
            case 4:
                tn2 tn2Var5 = new tn2(3, 4, continuation);
                tn2Var5.l = rjcVar;
                tn2Var5.m = obj2;
                return tn2Var5.invokeSuspend(Unit.a);
            case 5:
                tn2 tn2Var6 = new tn2(3, 5, continuation);
                tn2Var6.l = rjcVar;
                tn2Var6.m = obj2;
                return tn2Var6.invokeSuspend(Unit.a);
            case 6:
                tn2 tn2Var7 = new tn2(3, 6, continuation);
                tn2Var7.l = rjcVar;
                tn2Var7.m = obj2;
                return tn2Var7.invokeSuspend(Unit.a);
            case 7:
                tn2 tn2Var8 = new tn2(3, 7, continuation);
                tn2Var8.l = rjcVar;
                tn2Var8.m = obj2;
                return tn2Var8.invokeSuspend(Unit.a);
            case 8:
                tn2 tn2Var9 = new tn2(3, 8, continuation);
                tn2Var9.l = rjcVar;
                tn2Var9.m = obj2;
                return tn2Var9.invokeSuspend(Unit.a);
            case 9:
                tn2 tn2Var10 = new tn2(3, 9, continuation);
                tn2Var10.l = rjcVar;
                tn2Var10.m = obj2;
                return tn2Var10.invokeSuspend(Unit.a);
            case 10:
                tn2 tn2Var11 = new tn2(3, 10, continuation);
                tn2Var11.l = rjcVar;
                tn2Var11.m = obj2;
                return tn2Var11.invokeSuspend(Unit.a);
            case 11:
                tn2 tn2Var12 = new tn2(3, 11, continuation);
                tn2Var12.l = rjcVar;
                tn2Var12.m = obj2;
                return tn2Var12.invokeSuspend(Unit.a);
            case 12:
                tn2 tn2Var13 = new tn2(3, 12, continuation);
                tn2Var13.l = rjcVar;
                tn2Var13.m = obj2;
                return tn2Var13.invokeSuspend(Unit.a);
            case 13:
                tn2 tn2Var14 = new tn2(3, 13, continuation);
                tn2Var14.l = rjcVar;
                tn2Var14.m = obj2;
                return tn2Var14.invokeSuspend(Unit.a);
            case 14:
                tn2 tn2Var15 = new tn2(3, 14, continuation);
                tn2Var15.l = rjcVar;
                tn2Var15.m = obj2;
                return tn2Var15.invokeSuspend(Unit.a);
            case 15:
                tn2 tn2Var16 = new tn2(3, 15, continuation);
                tn2Var16.l = rjcVar;
                tn2Var16.m = obj2;
                return tn2Var16.invokeSuspend(Unit.a);
            default:
                tn2 tn2Var17 = new tn2(3, 16, continuation);
                tn2Var17.l = rjcVar;
                tn2Var17.m = obj2;
                return tn2Var17.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        p08 p08Var;
        mch e;
        switch (this.j) {
            case 0:
                Object obj2 = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    rjc rjcVar = this.l;
                    List list = (List) this.m;
                    ArrayList arrayList = new ArrayList(v75.o(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((cn2) it.next()).getData());
                    }
                    pjc[] pjcVarArr = (pjc[]) CollectionsKt.w0(CollectionsKt.h0(arrayList, new fs(15, on2.a))).toArray(new pjc[0]);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar);
                    Object y = tt0.y(rjcVar, new sn2(3, 0, null), this, new tn1(pjcVarArr, 1), pjcVarArr);
                    Object obj3 = nm6.a;
                    if (y != obj3) {
                        y = Unit.a;
                    }
                    if (y != obj3) {
                        y = Unit.a;
                    }
                    if (y == obj2) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 1:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar2 = this.l;
                    svh svhVar = (svh) this.m;
                    int i3 = 0;
                    if (svhVar != null) {
                        mch e2 = svhVar.e();
                        int i4 = e2.b;
                        n8n n8nVar = new n8n(1);
                        n8nVar.c = 0;
                        n8nVar.d = i4;
                        p08Var = new p08(n8nVar);
                        i3 = e2.c;
                    } else {
                        p08Var = p08.e;
                        p08Var.getClass();
                    }
                    xdr a = ydr.a(new y08(p08Var, i3, svhVar, svhVar != null ? new enp(svhVar.e()) : null));
                    if (svhVar != null && (e = svhVar.e()) != null) {
                        e.e = new anx(i3, a, p08Var, svhVar);
                    }
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar2, a, this) == nm6Var) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 2:
                nm6 nm6Var2 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar3 = this.l;
                    m1q m1qVar = ((t1q) this.m).c;
                    m1qVar.getClass();
                    l18 l18Var = l18.b;
                    bdt I = hag.I(t3g.class);
                    qdc qdcVar = l18Var.a;
                    qdcVar.getClass();
                    h7a d0 = zsd.d0(((t3g) qdcVar.C(I)).v(m1qVar), 1);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar3, d0, this) == nm6Var2) {
                    }
                } else if (i5 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 3:
                Object obj4 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar4 = this.l;
                    List list2 = (List) this.m;
                    List list3 = list2;
                    ArrayList arrayList2 = new ArrayList(v75.o(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((lke) it2.next()).getVisibility());
                    }
                    pjc[] pjcVarArr2 = (pjc[]) CollectionsKt.w0(arrayList2).toArray(new pjc[0]);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    zsd.f0(rjcVar4);
                    Object y2 = tt0.y(new o0b(rjcVar4, list2, 1), new sn2(3, 1, null), this, new tn1(pjcVarArr2, 2), pjcVarArr2);
                    Object obj5 = nm6.a;
                    if (y2 != obj5) {
                        y2 = Unit.a;
                    }
                    if (y2 != obj5) {
                        y2 = Unit.a;
                    }
                    if (y2 != obj5) {
                        y2 = Unit.a;
                    }
                    if (y2 == obj4) {
                    }
                } else if (i6 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 4:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar5 = this.l;
                    mwk mwkVar = (mwk) this.m;
                    mwkVar.getClass();
                    l18 l18Var2 = l18.b;
                    bdt I2 = hag.I(t3g.class);
                    qdc qdcVar2 = l18Var2.a;
                    qdcVar2.getClass();
                    h7a d02 = zsd.d0(((t3g) qdcVar2.C(I2)).v(mwkVar), 1);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar5, d02, this) == nm6Var3) {
                    }
                } else if (i7 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 5:
                nm6 nm6Var4 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar6 = this.l;
                    vdr j = ((v2s) this.m).a.j();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar6, j, this) == nm6Var4) {
                    }
                } else if (i8 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 6:
                nm6 nm6Var5 = nm6.a;
                int i9 = this.k;
                if (i9 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar7 = this.l;
                    vdr g = ((wdj) this.m).g();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar7, g, this) == nm6Var5) {
                    }
                } else if (i9 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 7:
                nm6 nm6Var6 = nm6.a;
                int i10 = this.k;
                if (i10 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar8 = this.l;
                    vdr h = ((wdj) this.m).h();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar8, h, this) == nm6Var6) {
                    }
                } else if (i10 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 8:
                nm6 nm6Var7 = nm6.a;
                int i11 = this.k;
                if (i11 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar9 = this.l;
                    vdr l = ((wdj) this.m).l();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar9, l, this) == nm6Var7) {
                    }
                } else if (i11 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 9:
                nm6 nm6Var8 = nm6.a;
                int i12 = this.k;
                if (i12 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar10 = this.l;
                    vdr c = ((wdj) this.m).c();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar10, c, this) == nm6Var8) {
                    }
                } else if (i12 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 10:
                nm6 nm6Var9 = nm6.a;
                int i13 = this.k;
                if (i13 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar11 = this.l;
                    vdr g2 = ((wdj) this.m).g();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar11, g2, this) == nm6Var9) {
                    }
                } else if (i13 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 11:
                nm6 nm6Var10 = nm6.a;
                int i14 = this.k;
                if (i14 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar12 = this.l;
                    vdr h2 = ((wdj) this.m).h();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar12, h2, this) == nm6Var10) {
                    }
                } else if (i14 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 12:
                nm6 nm6Var11 = nm6.a;
                int i15 = this.k;
                if (i15 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar13 = this.l;
                    vdr l2 = ((wdj) this.m).l();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar13, l2, this) == nm6Var11) {
                    }
                } else if (i15 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 13:
                nm6 nm6Var12 = nm6.a;
                int i16 = this.k;
                if (i16 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar14 = this.l;
                    vdr c2 = ((wdj) this.m).c();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar14, c2, this) == nm6Var12) {
                    }
                } else if (i16 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 14:
                nm6 nm6Var13 = nm6.a;
                int i17 = this.k;
                if (i17 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar15 = this.l;
                    vdr state = ((g4q) this.m).getState();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar15, state, this) == nm6Var13) {
                    }
                } else if (i17 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            case 15:
                nm6 nm6Var14 = nm6.a;
                int i18 = this.k;
                if (i18 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar16 = this.l;
                    vdr state2 = ((g4q) this.m).getState();
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar16, state2, this) == nm6Var14) {
                    }
                } else if (i18 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var15 = nm6.a;
                int i19 = this.k;
                if (i19 == 0) {
                    qgg.h0(obj);
                    rjc rjcVar17 = this.l;
                    mwk mwkVar2 = (mwk) this.m;
                    mwkVar2.getClass();
                    l18 l18Var3 = l18.b;
                    bdt I3 = hag.I(t3g.class);
                    qdc qdcVar3 = l18Var3.a;
                    qdcVar3.getClass();
                    h7a d03 = zsd.d0(((t3g) qdcVar3.C(I3)).v(mwkVar2), 1);
                    this.l = null;
                    this.m = null;
                    this.k = 1;
                    if (zsd.e0(rjcVar17, d03, this) == nm6Var15) {
                    }
                } else if (i19 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
