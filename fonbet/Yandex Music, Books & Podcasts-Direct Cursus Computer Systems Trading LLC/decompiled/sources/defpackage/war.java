package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final class war extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ xar l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ war(xar xarVar, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = xarVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new war(this.l, continuation, 0);
            case 1:
                return new war(this.l, continuation, 1);
            case 2:
                return new war(this.l, continuation, 2);
            case 3:
                return new war(this.l, continuation, 3);
            case 4:
                return new war(this.l, continuation, 4);
            case 5:
                return new war(this.l, continuation, 5);
            case 6:
                return new war(this.l, continuation, 6);
            case 7:
                return new war(this.l, continuation, 7);
            default:
                return new war(this.l, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((war) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i != 0) {
                    if (i == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar = this.l.d;
                this.k = 1;
                Object V = x97.V(xdhVar.k(), new n7l(xdhVar, null, 1), this);
                return V == nm6Var ? nm6Var : V;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar2 = this.l.d;
                this.k = 1;
                Object V2 = x97.V(xdhVar2.k(), new n7l(xdhVar2, null, 1), this);
                return V2 == nm6Var2 ? nm6Var2 : V2;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i3 = this.k;
                if (i3 != 0) {
                    if (i3 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar3 = this.l.d;
                this.k = 1;
                Object V3 = x97.V(xdhVar3.k(), new n7l(xdhVar3, null, 3), this);
                return V3 == nm6Var3 ? nm6Var3 : V3;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar4 = this.l.d;
                this.k = 1;
                Object V4 = x97.V(xdhVar4.k(), new o7l(xdhVar4, null), this);
                return V4 == nm6Var4 ? nm6Var4 : V4;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar5 = this.l.d;
                this.k = 1;
                Object V5 = x97.V(xdhVar5.k(), new n7l(xdhVar5, null, 4), this);
                return V5 == nm6Var5 ? nm6Var5 : V5;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar6 = this.l.d;
                this.k = 1;
                Object V6 = x97.V(xdhVar6.k(), new n7l(xdhVar6, null, 5), this);
                return V6 == nm6Var6 ? nm6Var6 : V6;
            case 6:
                nm6 nm6Var7 = nm6.a;
                int i7 = this.k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar7 = this.l.d;
                this.k = 1;
                Object V7 = x97.V(xdhVar7.k(), new n7l(xdhVar7, null, 6), this);
                return V7 == nm6Var7 ? nm6Var7 : V7;
            case 7:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 != 0) {
                    if (i8 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar8 = this.l.d;
                this.k = 1;
                Object V8 = x97.V(xdhVar8.k(), new n7l(xdhVar8, null, 7), this);
                return V8 == nm6Var8 ? nm6Var8 : V8;
            default:
                nm6 nm6Var9 = nm6.a;
                int i9 = this.k;
                if (i9 != 0) {
                    if (i9 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                xdh xdhVar9 = this.l.d;
                this.k = 1;
                Object V9 = x97.V(xdhVar9.k(), new n7l(xdhVar9, null, 8), this);
                return V9 == nm6Var9 ? nm6Var9 : V9;
        }
    }
}
