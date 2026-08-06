package E0;

import G0.b;
import H0.d;
import P0.A;
import R1.l;
import Z0.j;
import a1.InterfaceC0086b;
import a1.InterfaceC0087c;
import a1.InterfaceC0095k;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.watchfacestudio.spraktum.MainActivity;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import com.yandex.varioqub.config.Varioqub;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0318c2;
import io.appmetrica.analytics.impl.C0783u2;
import io.appmetrica.analytics.impl.EnumC0835w2;
import io.appmetrica.analytics.impl.I5;
import io.appmetrica.analytics.location.impl.u;
import java.util.ArrayList;
import k.C0975d;
import kotlin.jvm.internal.i;
import org.json.JSONException;
import org.json.JSONObject;
import x0.e;
import z1.g;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0095k, InterfaceC0086b, FunctionWithThrowable, InterfaceC0087c, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f308a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f308a = i2;
        this.f309b = obj;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        EnumC0835w2 a2;
        switch (this.f308a) {
            case 2:
                return u.a((u) this.f309b, (LocationManager) obj);
            default:
                a2 = C0783u2.a((C0318c2) this.f309b, (UsageStatsManager) obj);
                return a2;
        }
    }

    @Override // a1.InterfaceC0087c
    public void f(Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((A) ((a) this.f309b).f309b).a(z2);
    }

    @Override // a1.InterfaceC0086b
    public void g(Object obj, e eVar) {
        switch (this.f308a) {
            case 1:
                b bVar = (b) this.f309b;
                ArrayList arrayList = new ArrayList();
                d dVar = (d) ((ArrayList) obj).get(0);
                try {
                    Context context = bVar.f642a;
                    try {
                        Varioqub.init(G0.d.a(dVar), new AppMetricaAdapter(context), context);
                    } catch (Throwable th) {
                        Log.e("VarioqubFlutter", "Something went wrong while parsing Varioqub Settings", th);
                    }
                    arrayList.add(0, null);
                } catch (Throwable th2) {
                    arrayList = l.J(th2);
                }
                eVar.f(arrayList);
                break;
            case 5:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f309b, obj, eVar);
                break;
            default:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f309b, obj, eVar);
                break;
        }
    }

    @Override // a1.InterfaceC0095k
    public void i(e call, j jVar) {
        MainActivity mainActivity = (MainActivity) this.f309b;
        int i2 = MainActivity.f2707g;
        i.e(call, "call");
        if (!i.a((String) call.f8530b, "unfurlPassage")) {
            jVar.b();
            return;
        }
        Object obj = call.f8531c;
        String str = obj instanceof String ? (String) obj : null;
        if (str == null || g.a0(str)) {
            jVar.a("empty_trail", "missing", null);
            return;
        }
        try {
            e a2 = new C0975d().a();
            Uri parse = Uri.parse(str);
            Intent intent = (Intent) a2.f8530b;
            intent.setData(parse);
            mainActivity.startActivity(intent, (Bundle) a2.f8531c);
            jVar.c(Boolean.TRUE);
        } catch (Exception e2) {
            jVar.a("unfurl_fail", e2.getMessage(), null);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        I5.a((I5) this.f309b);
    }
}
