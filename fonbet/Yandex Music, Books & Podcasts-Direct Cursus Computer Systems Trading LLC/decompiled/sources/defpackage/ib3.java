package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class ib3 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;
    public /* synthetic */ boolean l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ib3(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.j;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        Continuation continuation = (Continuation) obj3;
        switch (i) {
            case 0:
                ib3 ib3Var = new ib3(3, 0, continuation);
                ib3Var.k = booleanValue;
                ib3Var.l = booleanValue2;
                return ib3Var.invokeSuspend(Unit.a);
            case 1:
                ib3 ib3Var2 = new ib3(3, 1, continuation);
                ib3Var2.k = booleanValue;
                ib3Var2.l = booleanValue2;
                return ib3Var2.invokeSuspend(Unit.a);
            case 2:
                ib3 ib3Var3 = new ib3(3, 2, continuation);
                ib3Var3.k = booleanValue;
                ib3Var3.l = booleanValue2;
                return ib3Var3.invokeSuspend(Unit.a);
            case 3:
                ib3 ib3Var4 = new ib3(3, 3, continuation);
                ib3Var4.k = booleanValue;
                ib3Var4.l = booleanValue2;
                return ib3Var4.invokeSuspend(Unit.a);
            case 4:
                ib3 ib3Var5 = new ib3(3, 4, continuation);
                ib3Var5.k = booleanValue;
                ib3Var5.l = booleanValue2;
                return ib3Var5.invokeSuspend(Unit.a);
            case 5:
                ib3 ib3Var6 = new ib3(3, 5, continuation);
                ib3Var6.k = booleanValue;
                ib3Var6.l = booleanValue2;
                return ib3Var6.invokeSuspend(Unit.a);
            case 6:
                ib3 ib3Var7 = new ib3(3, 6, continuation);
                ib3Var7.k = booleanValue;
                ib3Var7.l = booleanValue2;
                return ib3Var7.invokeSuspend(Unit.a);
            case 7:
                ib3 ib3Var8 = new ib3(3, 7, continuation);
                ib3Var8.k = booleanValue;
                ib3Var8.l = booleanValue2;
                return ib3Var8.invokeSuspend(Unit.a);
            case 8:
                ib3 ib3Var9 = new ib3(3, 8, continuation);
                ib3Var9.k = booleanValue;
                ib3Var9.l = booleanValue2;
                return ib3Var9.invokeSuspend(Unit.a);
            case 9:
                ib3 ib3Var10 = new ib3(3, 9, continuation);
                ib3Var10.k = booleanValue;
                ib3Var10.l = booleanValue2;
                return ib3Var10.invokeSuspend(Unit.a);
            case 10:
                ib3 ib3Var11 = new ib3(3, 10, continuation);
                ib3Var11.k = booleanValue;
                ib3Var11.l = booleanValue2;
                return ib3Var11.invokeSuspend(Unit.a);
            case 11:
                ib3 ib3Var12 = new ib3(3, 11, continuation);
                ib3Var12.k = booleanValue;
                ib3Var12.l = booleanValue2;
                return ib3Var12.invokeSuspend(Unit.a);
            default:
                ib3 ib3Var13 = new ib3(3, 12, continuation);
                ib3Var13.k = booleanValue;
                ib3Var13.l = booleanValue2;
                return ib3Var13.invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                boolean z = this.k;
                boolean z2 = this.l;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z || z2);
            case 1:
                boolean z3 = this.k;
                boolean z4 = this.l;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return !z3 ? uo4.b : !z4 ? uo4.a : uo4.d;
            case 2:
                boolean z5 = this.k;
                boolean z6 = this.l;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z5 || z6);
            case 3:
                boolean z7 = this.k;
                boolean z8 = this.l;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                if (z7 && z8) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 4:
                boolean z9 = this.k;
                boolean z10 = this.l;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                if (z9 && !z10) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 5:
                boolean z11 = this.k;
                boolean z12 = this.l;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                if (z11 && !z12) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 6:
                boolean z13 = this.k;
                boolean z14 = this.l;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                if (!z13 && z14) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 7:
                boolean z15 = this.k;
                boolean z16 = this.l;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                if (z15 && !z16) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 8:
                boolean z17 = this.k;
                boolean z18 = this.l;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                if (z17 && z18) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 9:
                boolean z19 = this.k;
                boolean z20 = this.l;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                if (z19 && !z20) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            case 10:
                boolean z21 = this.k;
                boolean z22 = this.l;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z21 || z22);
            case 11:
                boolean z23 = this.k;
                boolean z24 = this.l;
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                if (z23 && z24) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
            default:
                boolean z25 = this.k;
                boolean z26 = this.l;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                if (z25 && z26) {
                    r1 = true;
                }
                return Boolean.valueOf(r1);
        }
    }
}
