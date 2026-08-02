package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class vw4 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ yx4 l;
    public final /* synthetic */ Integer m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw4(yx4 yx4Var, Integer num, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.l = yx4Var;
        this.m = num;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new vw4(this.l, this.m, continuation, 0);
            case 1:
                return new vw4(this.l, this.m, continuation, 1);
            case 2:
                return new vw4(this.l, this.m, continuation, 2);
            case 3:
                return new vw4(this.l, this.m, continuation, 3);
            case 4:
                return new vw4(this.l, this.m, continuation, 4);
            case 5:
                return new vw4(this.l, this.m, continuation, 5);
            case 6:
                return new vw4(this.l, this.m, continuation, 6);
            default:
                return new vw4(this.l, this.m, continuation, 7);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((vw4) create(continuation)).invokeSuspend(Unit.a);
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
                this.k = 1;
                yx4 yx4Var = this.l;
                yx4Var.getClass();
                List list = dw.MyMusicAlbums.a;
                Serializable k = yx4Var.k(vz1.k(list, list), Boolean.FALSE, this.m, this);
                return k == nm6Var ? nm6Var : k;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Object b = this.l.b(this.m, this);
                    return b == nm6Var2 ? nm6Var2 : b;
                }
                if (i2 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                this.k = 1;
                yx4 yx4Var2 = this.l;
                yx4Var2.getClass();
                List list2 = dw.MyMusicBooks.a;
                Serializable k2 = yx4Var2.k(vz1.k(list2, list2), Boolean.FALSE, this.m, this);
                return k2 == nm6Var3 ? nm6Var3 : k2;
            case 3:
                nm6 nm6Var4 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable d = this.l.d(this.m, this);
                    return d == nm6Var4 ? nm6Var4 : d;
                }
                if (i4 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                nm6 nm6Var5 = nm6.a;
                int i5 = this.k;
                if (i5 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable k3 = this.l.k(null, Boolean.TRUE, this.m, this);
                    return k3 == nm6Var5 ? nm6Var5 : k3;
                }
                if (i5 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 5:
                nm6 nm6Var6 = nm6.a;
                int i6 = this.k;
                if (i6 != 0) {
                    if (i6 == 1) {
                        qgg.h0(obj);
                    } else {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        obj = null;
                    }
                    return obj;
                }
                qgg.h0(obj);
                Boolean bool = Boolean.TRUE;
                this.k = 1;
                yx4 yx4Var3 = this.l;
                yx4Var3.getClass();
                Serializable m = yx4.m(yx4Var3, null, bool, this.m, bool, this, 17);
                return m == nm6Var6 ? nm6Var6 : m;
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
                this.k = 1;
                yx4 yx4Var4 = this.l;
                yx4Var4.getClass();
                List list3 = dw.MyMusicPodcasts.a;
                Serializable k4 = yx4Var4.k(vz1.k(list3, list3), Boolean.FALSE, this.m, this);
                return k4 == nm6Var7 ? nm6Var7 : k4;
            default:
                nm6 nm6Var8 = nm6.a;
                int i8 = this.k;
                if (i8 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    Serializable C = this.l.C(this.m, this);
                    return C == nm6Var8 ? nm6Var8 : C;
                }
                if (i8 == 1) {
                    qgg.h0(obj);
                    return obj;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
