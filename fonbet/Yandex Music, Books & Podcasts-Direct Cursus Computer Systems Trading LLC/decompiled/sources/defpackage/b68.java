package defpackage;

import com.yandex.music.shared.disclaimers.db.DisclaimerDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class b68 extends aur implements Function2 {
    public final /* synthetic */ int j;
    public final /* synthetic */ znk k;
    public final /* synthetic */ String l;
    public final /* synthetic */ String m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b68(Continuation continuation, znk znkVar, String str, String str2, int i) {
        super(2, continuation);
        this.j = i;
        this.k = znkVar;
        this.l = str;
        this.m = str2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b68(continuation, this.k, this.l, this.m, 0);
            default:
                return new b68(continuation, this.k, this.l, this.m, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b68) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        String str = this.m;
        String str2 = this.l;
        znk znkVar = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                t51 v = ((DisclaimerDatabase) znkVar.b).v();
                s51 s51Var = new s51(0L, str2, str);
                v.getClass();
                up6.F(v.a, false, true, new kc(13, v, s51Var));
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                return znkVar.w(str2, str);
        }
    }
}
