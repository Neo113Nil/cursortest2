package defpackage;

import android.content.SharedPreferences;
import com.yandex.payment.sdk.ui.SplashActivity;
import io.appmetrica.analytics.AppMetrica;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class m6r extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ SplashActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m6r(SplashActivity splashActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = splashActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new m6r(this.l, continuation, 0);
            default:
                return new m6r(this.l, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((m6r) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        SplashActivity splashActivity = this.l;
        Continuation continuation = null;
        int i2 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    yks yksVar = new yks(splashActivity, (ugk) splashActivity.l().q.get(), splashActivity.l().c());
                    jyr jyrVar = (jyr) yksVar.d;
                    l9i l9iVar = (l9i) splashActivity.l().m.get();
                    xt0 xt0Var = splashActivity.l().a().d;
                    SharedPreferences sharedPreferences = (SharedPreferences) splashActivity.l().g.get();
                    g0c c = splashActivity.l().c();
                    x60 x60Var = (x60) splashActivity.l().w.get();
                    this.k = 1;
                    zt3 zt3Var = new zt3(1, qxe.b(this));
                    zt3Var.s();
                    try {
                        fhc fhcVar = fhc.b;
                        fhcVar.a(pek.a);
                        fhcVar.a(ygc.a);
                        Iterator it = q6c.H.iterator();
                        while (it.hasNext()) {
                            q6c q6cVar = (q6c) it.next();
                            fhc fhcVar2 = fhc.b;
                            lc3 lc3Var = ygc.a;
                            fhcVar2.a(fgq.F(q6cVar.a, String.valueOf(q6cVar.b)));
                        }
                        Object value = jyrVar.getValue();
                        value.getClass();
                        qac qacVar = (qac) ((u77) value).b.get();
                        Object value2 = jyrVar.getValue();
                        value2.getClass();
                        mm7 mm7Var = (mm7) ((u77) value2).d.get();
                        qacVar.getClass();
                        mm7Var.getClass();
                        qdq.h(sk3.i.b(mif.b(mif.a(mif.a(qacVar.a.t(qacVar.b.c), new pac(qacVar, i2), null, 5), new pac(qacVar, 0), null, 5), new kma(11, mm7Var), null, 5)), 500L);
                        qne H = gut.H();
                        x60 x60Var2 = (x60) c;
                        x60Var2.getClass();
                        x60Var2.a(H);
                        String packageName = splashActivity.getApplicationContext().getPackageName();
                        if (packageName == null) {
                            String str = xt0Var.c;
                            if (str != null) {
                                packageName = str.toLowerCase(Locale.ROOT);
                                packageName.getClass();
                            } else {
                                packageName = null;
                            }
                            if (packageName == null) {
                                packageName = "";
                            }
                        }
                        String uuid = AppMetrica.getUuid(splashActivity.getApplicationContext());
                        bj4 bj4Var = new bj4(packageName, uuid != null ? uuid : "", 1);
                        l9iVar.getClass();
                        mif.b(mif.b(mif.a(l9iVar.a.C(bj4Var, vsf.w0, p1j.a), new ak0(yksVar, sharedPreferences, x60Var, c, 24), null, 5), new hxo(25, zt3Var), null, 5), lhb.x0, new qqv(2, c, zt3Var), 1);
                        boolean booleanValue = ((Boolean) ygc.a.u()).booleanValue();
                        LinkedHashMap linkedHashMap = sqg.a;
                        String str2 = "xmail_flushEnvVariables " + booleanValue;
                        if (((f7w) sqg.a.get("default")) != null) {
                            f7w.a("generic_info", str2);
                        }
                        ((x60) c).a(gut.E(((Boolean) pek.a.u()).booleanValue()));
                    } catch (Throwable th) {
                        LinkedHashMap linkedHashMap2 = sqg.a;
                        uwf.l("Failed to initialize flags: " + th.getMessage());
                        r7o r7oVar = z7o.b;
                        zt3Var.resumeWith(Unit.a);
                    }
                    Object q = zt3Var.q();
                    if (q != nm6.a) {
                        q = Unit.a;
                    }
                    if (q == nm6Var) {
                        break;
                    }
                } else if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i4 = this.k;
                if (i4 == 0) {
                    qgg.h0(obj);
                    int i5 = SplashActivity.l;
                    tc4 u0 = zsd.u0(new eno(new v0r(splashActivity, continuation, 4)), splashActivity.i);
                    this.k = 1;
                    if (zsd.i0(u0, this) == nm6Var2) {
                        break;
                    }
                } else if (i4 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                splashActivity.j.a(splashActivity.getIntent().getExtras());
                splashActivity.overridePendingTransition(0, 0);
                break;
        }
        return Unit.a;
    }
}
