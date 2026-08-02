package defpackage;

import android.os.SystemClock;
import com.yandex.plus.core.debug.panel.internal.presentation.viewModel.c;
import com.yandex.plus.home.feature.webviews.internal.home.g;
import com.yandex.plus.home.feature.webviews.internal.purchase.button.section.delegates.f;
import com.yandex.plus.pay.graphql.analytics.b;
import com.yandex.plus.pay.internal.feature.payment.inapp.google.d;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class ow1 extends aur implements pyc {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow1(Object obj, Continuation continuation, int i) {
        super(3, continuation);
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.j) {
            case 0:
                return new ow1((n4c) this.k, (Continuation) obj3, 0).invokeSuspend(Unit.a);
            case 1:
                ow1 ow1Var = new ow1(3, 1, (Continuation) obj3);
                ow1Var.k = (List) obj;
                return ow1Var.invokeSuspend(Unit.a);
            case 2:
                return new ow1((vgi) this.k, (Continuation) obj3, 2).invokeSuspend(Unit.a);
            case 3:
                return new ow1((xqn) this.k, (Continuation) obj3, 3).invokeSuspend(Unit.a);
            case 4:
                return new ow1((tyi) this.k, (Continuation) obj3, 4).invokeSuspend(Unit.a);
            case 5:
                return new ow1((tqn) this.k, (Continuation) obj3, 5).invokeSuspend(Unit.a);
            case 6:
                long j = ((enj) obj2).a;
                return new ow1((Function0) this.k, (Continuation) obj3, 6).invokeSuspend(Unit.a);
            case 7:
                ow1 ow1Var2 = new ow1(3, 7, (Continuation) obj3);
                ow1Var2.k = (u7u) obj;
                return ow1Var2.invokeSuspend(Unit.a);
            case 8:
                return new ow1((cju) this.k, (Continuation) obj3, 8).invokeSuspend(Unit.a);
            case 9:
                ow1 ow1Var3 = new ow1(3, 9, (Continuation) obj3);
                ow1Var3.k = (xxu) obj2;
                return ow1Var3.invokeSuspend(Unit.a);
            case 10:
                return new ow1((ccw) this.k, (Continuation) obj3, 10).invokeSuspend(Unit.a);
            case 11:
                return new ow1((epw) this.k, (Continuation) obj3, 11).invokeSuspend(Unit.a);
            case 12:
                return new ow1((c) this.k, (Continuation) obj3, 12).invokeSuspend(Unit.a);
            case 13:
                ow1 ow1Var4 = new ow1(3, 13, (Continuation) obj3);
                ow1Var4.k = obj2;
                return ow1Var4.invokeSuspend(Unit.a);
            case 14:
                ((Boolean) obj2).booleanValue();
                return new ow1((g) this.k, (Continuation) obj3, 14).invokeSuspend(Unit.a);
            case 15:
                return new ow1((b) this.k, (Continuation) obj3, 15).invokeSuspend(Unit.a);
            default:
                return new ow1((d) this.k, (Continuation) obj3, 16).invokeSuspend(Unit.a);
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((n4c) this.k).l(1.0f, h4c.QUEUE_LAUNCHER);
                break;
            case 1:
                List list = (List) this.k;
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                ((vgi) this.k).getClass();
                break;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                xqn xqnVar = (xqn) this.k;
                try {
                    r7o r7oVar = z7o.b;
                    dhi dhiVar = (dhi) xqnVar.a;
                    if (dhiVar != null) {
                        dhiVar.close();
                    }
                } catch (Throwable unused) {
                    r7o r7oVar2 = z7o.b;
                }
                break;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                tyi.b((tyi) this.k);
                break;
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                ((tqn) this.k).a = true;
                break;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                ((Function0) this.k).invoke();
                break;
            case 7:
                u7u u7uVar = (u7u) this.k;
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                break;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                cju cjuVar = (cju) this.k;
                if (cjuVar.f.getAndDecrement() <= 1) {
                    ssg.a(3, cju.k, "unregistered", null);
                    cjuVar.a.getContentResolver().unregisterContentObserver(cjuVar.h);
                    rar rarVar = cjuVar.e;
                    if (rarVar != null) {
                        rarVar.g(null);
                    }
                    cjuVar.e = null;
                }
                break;
            case 9:
                xxu xxuVar = (xxu) this.k;
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                break;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                ((ccw) this.k).f();
                break;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                epw epwVar = (epw) this.k;
                s9f[] s9fVarArr = epw.l;
                rmw b = epwVar.b();
                b.c.V();
                b.e.l(qmw.f);
                break;
            case 12:
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                c cVar = (c) this.k;
                cVar.a();
                cVar.b();
                break;
            case 13:
                Object obj2 = this.k;
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                break;
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                g gVar = (g) this.k;
                f h0 = gVar.h0();
                String str = gVar.g.c;
                String str2 = gVar.J;
                h0.getClass();
                h0.j(new aa0(h0, str, str2, null, 17));
                break;
            case 15:
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                z75.x(((b) this.k).d.entrySet(), new fn1(SystemClock.elapsedRealtime() - 60000, 22));
                break;
            default:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                gld.L(((d) this.k).h, null);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow1(int i, int i2, Continuation continuation) {
        super(i, continuation);
        this.j = i2;
    }
}
