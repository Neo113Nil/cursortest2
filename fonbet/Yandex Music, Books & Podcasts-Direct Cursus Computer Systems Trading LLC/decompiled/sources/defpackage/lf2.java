package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class lf2 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lf2(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                lf2 lf2Var = new lf2(2, 0, continuation);
                lf2Var.k = ((Boolean) obj).booleanValue();
                return lf2Var;
            case 1:
                lf2 lf2Var2 = new lf2(2, 1, continuation);
                lf2Var2.k = ((Boolean) obj).booleanValue();
                return lf2Var2;
            case 2:
                lf2 lf2Var3 = new lf2(2, 2, continuation);
                lf2Var3.k = ((Boolean) obj).booleanValue();
                return lf2Var3;
            case 3:
                lf2 lf2Var4 = new lf2(2, 3, continuation);
                lf2Var4.k = ((Boolean) obj).booleanValue();
                return lf2Var4;
            case 4:
                lf2 lf2Var5 = new lf2(2, 4, continuation);
                lf2Var5.k = ((Boolean) obj).booleanValue();
                return lf2Var5;
            case 5:
                lf2 lf2Var6 = new lf2(2, 5, continuation);
                lf2Var6.k = ((Boolean) obj).booleanValue();
                return lf2Var6;
            case 6:
                lf2 lf2Var7 = new lf2(2, 6, continuation);
                lf2Var7.k = ((Boolean) obj).booleanValue();
                return lf2Var7;
            case 7:
                lf2 lf2Var8 = new lf2(2, 7, continuation);
                lf2Var8.k = ((Boolean) obj).booleanValue();
                return lf2Var8;
            case 8:
                lf2 lf2Var9 = new lf2(2, 8, continuation);
                lf2Var9.k = ((Boolean) obj).booleanValue();
                return lf2Var9;
            case 9:
                lf2 lf2Var10 = new lf2(2, 9, continuation);
                lf2Var10.k = ((Boolean) obj).booleanValue();
                return lf2Var10;
            case 10:
                lf2 lf2Var11 = new lf2(2, 10, continuation);
                lf2Var11.k = ((Boolean) obj).booleanValue();
                return lf2Var11;
            case 11:
                lf2 lf2Var12 = new lf2(2, 11, continuation);
                lf2Var12.k = ((Boolean) obj).booleanValue();
                return lf2Var12;
            case 12:
                lf2 lf2Var13 = new lf2(2, 12, continuation);
                lf2Var13.k = ((Boolean) obj).booleanValue();
                return lf2Var13;
            case 13:
                lf2 lf2Var14 = new lf2(2, 13, continuation);
                lf2Var14.k = ((Boolean) obj).booleanValue();
                return lf2Var14;
            case 14:
                lf2 lf2Var15 = new lf2(2, 14, continuation);
                lf2Var15.k = ((Boolean) obj).booleanValue();
                return lf2Var15;
            case 15:
                lf2 lf2Var16 = new lf2(2, 15, continuation);
                lf2Var16.k = ((Boolean) obj).booleanValue();
                return lf2Var16;
            case 16:
                lf2 lf2Var17 = new lf2(2, 16, continuation);
                lf2Var17.k = ((Boolean) obj).booleanValue();
                return lf2Var17;
            case 17:
                lf2 lf2Var18 = new lf2(2, 17, continuation);
                lf2Var18.k = ((Boolean) obj).booleanValue();
                return lf2Var18;
            case 18:
                lf2 lf2Var19 = new lf2(2, 18, continuation);
                lf2Var19.k = ((Boolean) obj).booleanValue();
                return lf2Var19;
            case 19:
                lf2 lf2Var20 = new lf2(2, 19, continuation);
                lf2Var20.k = ((Boolean) obj).booleanValue();
                return lf2Var20;
            case 20:
                lf2 lf2Var21 = new lf2(2, 20, continuation);
                lf2Var21.k = ((Boolean) obj).booleanValue();
                return lf2Var21;
            default:
                lf2 lf2Var22 = new lf2(2, 21, continuation);
                lf2Var22.k = ((Boolean) obj).booleanValue();
                return lf2Var22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.j;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        Continuation continuation = (Continuation) obj2;
        switch (i) {
        }
        return ((lf2) create(bool, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                boolean z = this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!z);
            case 1:
                boolean z2 = this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!z2);
            case 2:
                boolean z3 = this.k;
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z3);
            case 3:
                boolean z4 = this.k;
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z4);
            case 4:
                boolean z5 = this.k;
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                ssg.a(4, "ChromeCastDiscoveryCenter", "Requirements passed: " + z5, null);
                return Unit.a;
            case 5:
                boolean z6 = this.k;
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z6);
            case 6:
                boolean z7 = this.k;
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!z7);
            case 7:
                boolean z8 = this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z8);
            case 8:
                boolean z9 = this.k;
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z9);
            case 9:
                boolean z10 = this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z10);
            case 10:
                boolean z11 = this.k;
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z11);
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(this.k);
            case 12:
                boolean z12 = this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z12);
            case 13:
                boolean z13 = this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z13);
            case 14:
                boolean z14 = this.k;
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z14);
            case 15:
                boolean z15 = this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z15);
            case 16:
                boolean z16 = this.k;
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z16);
            case 17:
                boolean z17 = this.k;
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!z17);
            case 18:
                boolean z18 = this.k;
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(!z18);
            case 19:
                boolean z19 = this.k;
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z19);
            case 20:
                boolean z20 = this.k;
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z20);
            default:
                boolean z21 = this.k;
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                return Boolean.valueOf(z21);
        }
    }
}
