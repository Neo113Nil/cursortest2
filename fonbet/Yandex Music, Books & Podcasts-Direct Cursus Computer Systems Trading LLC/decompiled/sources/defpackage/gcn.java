package defpackage;

import com.yandex.media.ynison.service.a0;
import com.yandex.media.ynison.service.e0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class gcn extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ocn l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcn(ocn ocnVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = ocnVar;
        this.m = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new gcn(this.l, this.m, continuation, 0);
            default:
                return new gcn(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((gcn) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        b5n b5nVar;
        b5n b5nVar2;
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                Continuation continuation = null;
                if (i == 0) {
                    qgg.h0(obj);
                    fkg fkgVar = this.l.c;
                    this.k = 1;
                    obj = x97.V(dm6.b, new zjg(fkgVar, this.m, "remote_protobuf", continuation, 3), this);
                    if (obj == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                e0 e0Var = (e0) obj;
                if (e0Var != null && (b5nVar = (b5n) e0Var.m30toBuilder()) != null) {
                    a0 h = b5nVar.h();
                    h.getClass();
                    b5nVar.i(uwf.N(h, false));
                    break;
                } else {
                    break;
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                Continuation continuation2 = null;
                if (i2 == 0) {
                    qgg.h0(obj);
                    fkg fkgVar2 = this.l.c;
                    this.k = 1;
                    obj = x97.V(dm6.b, new zjg(fkgVar2, this.m, "protobuf", continuation2, 3), this);
                    if (obj == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                e0 e0Var2 = (e0) obj;
                if (e0Var2 != null && (b5nVar2 = (b5n) e0Var2.m30toBuilder()) != null) {
                    a0 h2 = b5nVar2.h();
                    h2.getClass();
                    b5nVar2.i(uwf.N(h2, false));
                    break;
                } else {
                    break;
                }
                break;
        }
        return null;
    }
}
