package F0;

import android.content.Context;
import com.yandex.varioqub.config.impl.B;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.AppMetricaLibraryAdapterConfig;
import io.appmetrica.analytics.idsync.impl.D;
import io.appmetrica.analytics.idsync.impl.n;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.impl.C0290b0;
import io.appmetrica.analytics.impl.C0756t1;
import io.appmetrica.analytics.impl.L0;
import io.appmetrica.analytics.plugins.PluginErrorDetails;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f578a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f579b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f580c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f581d;

    public /* synthetic */ b(L0 l02, PluginErrorDetails pluginErrorDetails, String str) {
        this.f578a = 2;
        this.f579b = l02;
        this.f581d = pluginErrorDetails;
        this.f580c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f578a) {
            case 0:
                B.a((B) this.f579b, (String) this.f580c, (String) this.f581d);
                break;
            case 1:
                n.a((D) this.f579b, (n) this.f580c, (RequestConfig) this.f581d);
                break;
            case 2:
                L0.a((L0) this.f579b, (PluginErrorDetails) this.f581d, (String) this.f580c);
                break;
            case 3:
                C0290b0.a((C0290b0) this.f579b, (Context) this.f580c, (AppMetricaLibraryAdapterConfig) this.f581d);
                break;
            default:
                ((C0756t1) this.f579b).b((Context) this.f580c, (AppMetricaConfig) this.f581d);
                break;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.f578a = i2;
        this.f579b = obj;
        this.f580c = obj2;
        this.f581d = obj3;
    }
}
