package defpackage;

import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class lia extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ wia l;
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lia(wia wiaVar, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.j = i2;
        this.l = wiaVar;
        this.m = i;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new lia(this.l, this.m, continuation, 0);
            default:
                return new lia(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((lia) create(mm6Var, continuation)).invokeSuspend(Unit.a);
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
                yx4 e = this.l.e();
                Integer num = new Integer(this.m);
                this.k = 1;
                e.getClass();
                List list = dw.MyMusicAlbums.a;
                Serializable k = e.k(vz1.k(list, list), Boolean.FALSE, num, this);
                return k == nm6Var ? nm6Var : k;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 != 0) {
                    if (i2 == 1) {
                        qgg.h0(obj);
                    } else {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        obj = null;
                    }
                    return obj;
                }
                qgg.h0(obj);
                yx4 e2 = this.l.e();
                Boolean bool = Boolean.FALSE;
                Integer num2 = new Integer(this.m);
                this.k = 1;
                Serializable z = e2.z(null, null, bool, num2, this);
                return z == nm6Var2 ? nm6Var2 : z;
        }
    }
}
