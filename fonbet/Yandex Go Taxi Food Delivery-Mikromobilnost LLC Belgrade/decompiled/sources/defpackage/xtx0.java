package defpackage;

import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.care.ui.h;
import ru.yandex.logistics.care.ui.l;
import ru.yandex.logistics.care.web_view.impl.js.TaxiAppJsCallback$ErrorType;
import ru.yandex.taxi.logistics.sdk.webview.api.WebViewState;

/* loaded from: classes4.dex */
public final /* synthetic */ class xtx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytx0 b;

    public /* synthetic */ xtx0(ytx0 ytx0Var, int i) {
        this.a = i;
        this.b = ytx0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ytx0 ytx0Var = this.b;
        switch (i) {
            case 0:
                dt8 dt8Var = ytx0Var.b.b.b;
                ytx0Var.a.c();
                break;
            case 1:
                dt8 dt8Var2 = ytx0Var.b.b.b;
                h hVar = ytx0Var.a;
                long currentTimeMillis = System.currentTimeMillis();
                l lVar = hVar.a;
                xt8 a = xt8.a(lVar.D, 0L, 0L, currentTimeMillis, 7);
                lVar.D = a;
                hVar.c.k(new kr8(currentTimeMillis - a.a));
                break;
            case 2:
                dt8 dt8Var3 = ytx0Var.b.b.b;
                r0 r0Var = ytx0Var.a.a.Q;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            case 3:
                dt8 dt8Var4 = ytx0Var.b.b.b;
                l.c0(ytx0Var.a.a);
                break;
            case 4:
                dt8 dt8Var5 = ytx0Var.b.b.b;
                h hVar2 = ytx0Var.a;
                or8 or8Var = hVar2.c;
                l lVar2 = hVar2.a;
                if (lVar2.K.a.a.getValue() != WebViewState.ERROR) {
                    r0 r0Var2 = lVar2.J;
                    zt8 zt8Var = new zt8(WebViewState.READY);
                    r0Var2.getClass();
                    r0Var2.m(null, zt8Var);
                    pzt0 pzt0Var = lVar2.F;
                    if (pzt0Var != null) {
                        pzt0Var.a(null);
                    }
                    xt8 xt8Var = lVar2.D;
                    long currentTimeMillis2 = System.currentTimeMillis();
                    long j = xt8Var.a;
                    long j2 = currentTimeMillis2 - j;
                    or8Var.k(new lr8(j2));
                    long j3 = xt8Var.b;
                    Long valueOf = j3 > 0 ? Long.valueOf(j3 - j) : null;
                    long j4 = xt8Var.c;
                    Long valueOf2 = j4 > 0 ? Long.valueOf(j4 - j) : null;
                    long j5 = xt8Var.d;
                    or8Var.k(new dr8(valueOf, valueOf2, j5 > 0 ? Long.valueOf(j5 - j) : null, j2));
                    break;
                }
                break;
            default:
                ytx0Var.a.a("empty_uri", null, TaxiAppJsCallback$ErrorType.General);
                dt8 dt8Var6 = ytx0Var.b.b.b;
                break;
        }
    }
}
