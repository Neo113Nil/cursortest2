package defpackage;

import com.yandex.pulse.metrics.o;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final /* synthetic */ class ej6 extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ej6(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 20;
        ai7 ai7Var = ai7.a;
        Continuation continuation = null;
        switch (i) {
            case 0:
                ((c6h) this.receiver).f();
                break;
            case 1:
                ((c6h) this.receiver).d();
                break;
            case 2:
                ((c6h) this.receiver).m();
                break;
            case 3:
                ((pc5) this.receiver).a();
                break;
            case 4:
                ((pc5) this.receiver).e();
                break;
            case 5:
                ((bg5) this.receiver).a();
                break;
            case 6:
                ((bg5) this.receiver).d();
                break;
            case 7:
                ((bg5) this.receiver).e();
                break;
            case 8:
                ((wq6) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                break;
            case 9:
                ((wq6) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                break;
            case 10:
                ((wq6) this.receiver).getClass();
                break;
            case 11:
                lr6 lr6Var = ((kr6) this.receiver).a;
                xdr xdrVar = lr6Var.m;
                Object value = xdrVar.getValue();
                qr6 qr6Var = value instanceof qr6 ? (qr6) value : null;
                if (qr6Var != null) {
                    String obj = StringsKt.t0(qr6Var.a).toString();
                    if (!StringsKt.U(obj)) {
                        xdrVar.m(null, qr6.a(qr6Var, null, false, 1));
                        x97.y(ot0.F(lr6Var), null, null, new vv4(lr6Var, obj, continuation, 29), 3);
                    }
                }
                break;
            case 12:
                g47 g47Var = (g47) this.receiver;
                g47Var.q.getClass();
                g47Var.K(new y37(R.string.paymentsdk_sbp_open_bank_title, false, null));
                g47Var.M();
                z37 z37Var = g47Var.y;
                if (z37Var != null) {
                    g47Var.K(z37Var);
                }
                break;
            case 13:
                g47 g47Var2 = (g47) this.receiver;
                hpo hpoVar = g47Var2.s;
                hpoVar.b.invoke();
                hpoVar.a = false;
                if (g47Var2.z) {
                    g47Var2.K(b47.a);
                } else {
                    g47Var2.K(a47.a);
                    x97.y(ot0.F(g47Var2), null, null, new ja4(g47Var2, continuation, 22), 3);
                }
                break;
            case 14:
                g47 g47Var3 = (g47) this.receiver;
                g47Var3.q.getClass();
                g47Var3.K(new y37(R.string.paymentsdk_sbp_open_bank_title, false, null));
                g47Var3.M();
                z37 z37Var2 = g47Var3.y;
                if (z37Var2 != null) {
                    g47Var3.K(z37Var2);
                }
                break;
            case 15:
                y57 y57Var = (y57) this.receiver;
                int T = CollectionsKt.T(y57Var.D0, y57Var.C0);
                Integer valueOf = Integer.valueOf(T);
                if (T != -1) {
                    break;
                }
                break;
            case 16:
                ((th7) this.receiver).a.finish();
                break;
            case 17:
                th7 th7Var = (th7) this.receiver;
                di7 di7Var = th7Var.b;
                hn5 hn5Var = th7Var.a;
                hn5Var.getClass();
                xdr xdrVar2 = di7Var.q;
                xdrVar2.getClass();
                xdrVar2.m(null, ai7Var);
                x97.y(ot0.F(di7Var), null, null, new bv6(di7Var, hn5Var, continuation, i2), 3);
                break;
            case 18:
                ((th7) this.receiver).a.finish();
                break;
            case 19:
                th7 th7Var2 = (th7) this.receiver;
                di7 di7Var2 = th7Var2.b;
                hn5 hn5Var2 = th7Var2.a;
                hn5Var2.getClass();
                xdr xdrVar3 = di7Var2.q;
                xdrVar3.getClass();
                xdrVar3.m(null, ai7Var);
                x97.y(ot0.F(di7Var2), null, null, new bv6(di7Var2, hn5Var2, continuation, i2), 3);
                break;
            case 20:
                ((bc5) this.receiver).a();
                break;
            case 21:
                ((bc5) this.receiver).a();
                break;
            case 22:
                s48 s48Var = (s48) this.receiver;
                x97.y(s48Var.a, null, null, new ja4(s48Var, continuation, 27), 3);
                break;
            case 23:
                ((n78) this.receiver).b.a();
                break;
            case 24:
                ((z88) this.receiver).b.a.finish();
                break;
            case 25:
                ((z88) this.receiver).a();
                break;
            case 26:
                ((z88) this.receiver).a();
                break;
            case 27:
                o3a o3aVar = (o3a) this.receiver;
                if (!o3aVar.J) {
                    b2c b2cVar = o3aVar.h.A;
                }
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((p7a) this.receiver).b();
                break;
            default:
                ((p7a) this.receiver).a();
                break;
        }
        return Unit.a;
    }
}
