package defpackage;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class r65 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public u65 k;
    public int l;
    public int m;
    public int n;
    public final /* synthetic */ u65 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r65(u65 u65Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.o = u65Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r65(this.o, continuation, 0);
            default:
                return new r65(this.o, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((r65) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        q65 q65Var;
        int i3;
        int i4;
        q65 q65Var2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i5 = this.n;
                u65 u65Var = this.o;
                if (i5 == 0) {
                    qgg.h0(obj);
                    pjc g = u65Var.k.g();
                    this.n = 1;
                    obj = zsd.g0(g, this);
                    if (obj == nm6Var) {
                    }
                } else if (i5 == 1) {
                    qgg.h0(obj);
                } else if (i5 == 2) {
                    i2 = this.m;
                    int i6 = this.l;
                    u65 u65Var2 = this.k;
                    qgg.h0(obj);
                    i = i6;
                    u65Var = u65Var2;
                    q65Var = new q65(u65Var, 1);
                    this.k = null;
                    this.l = i;
                    this.m = i2;
                    this.n = 3;
                    if (((pjc) obj).collect(q65Var, this) == nm6Var) {
                    }
                } else if (i5 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                String str = ((xxq) obj).a;
                str.getClass();
                p3u p3uVar = u65Var.l;
                Set b = uop.b(j1g.a);
                this.k = u65Var;
                i = 0;
                this.l = 0;
                this.m = 0;
                this.n = 2;
                obj = ((b4u) p3uVar).h(str, b, this);
                if (obj != nm6Var) {
                    i2 = 0;
                    q65Var = new q65(u65Var, 1);
                    this.k = null;
                    this.l = i;
                    this.m = i2;
                    this.n = 3;
                    if (((pjc) obj).collect(q65Var, this) == nm6Var) {
                    }
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i7 = this.n;
                u65 u65Var3 = this.o;
                if (i7 == 0) {
                    qgg.h0(obj);
                    pjc g2 = u65Var3.k.g();
                    this.n = 1;
                    obj = zsd.g0(g2, this);
                    if (obj == nm6Var2) {
                    }
                } else if (i7 == 1) {
                    qgg.h0(obj);
                } else if (i7 == 2) {
                    i4 = this.m;
                    int i8 = this.l;
                    u65 u65Var4 = this.k;
                    qgg.h0(obj);
                    i3 = i8;
                    u65Var3 = u65Var4;
                    q65Var2 = new q65(u65Var3, 2);
                    this.k = null;
                    this.l = i3;
                    this.m = i4;
                    this.n = 3;
                    if (((pjc) obj).collect(q65Var2, this) == nm6Var2) {
                    }
                } else if (i7 != 3) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                    break;
                }
                String str2 = ((xxq) obj).a;
                str2.getClass();
                a65 a65Var = u65Var3.m;
                this.k = u65Var3;
                i3 = 0;
                this.l = 0;
                this.m = 0;
                this.n = 2;
                obj = a65Var.a(str2, this);
                if (obj != nm6Var2) {
                    i4 = 0;
                    q65Var2 = new q65(u65Var3, 2);
                    this.k = null;
                    this.l = i3;
                    this.m = i4;
                    this.n = 3;
                    if (((pjc) obj).collect(q65Var2, this) == nm6Var2) {
                    }
                }
                break;
        }
        return Unit.a;
    }
}
