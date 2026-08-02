package defpackage;

import android.util.Log;
import com.connectsdk.etc.helper.HttpMessage;
import com.connectsdk.service.NetcastTVService;
import com.connectsdk.service.command.ServiceCommand;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.impl.tracking.event.EventDefault;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class ylr {
    public final OkHttpClient a;
    public final Executor b;
    public final l4f c;
    public final cke d;
    public final ngl e;
    public final wpt f;

    public ylr(OkHttpClient okHttpClient, Executor executor, l4f l4fVar, cke ckeVar, ngl nglVar, wpt wptVar) {
        okHttpClient.getClass();
        l4fVar.getClass();
        this.a = okHttpClient;
        this.b = executor;
        this.c = l4fVar;
        this.d = ckeVar;
        this.e = nglVar;
        this.f = wptVar == null ? new wpt("https", "log.strm.yandex.ru", "log") : wptVar;
        btf.b(new kgk(25, this));
    }

    public final u7e a(EventDefault eventDefault) {
        s7e s7eVar = new s7e();
        wpt wptVar = this.f;
        s7eVar.n(wptVar.a);
        s7eVar.g(wptVar.b);
        s7eVar.c(wptVar.c, false);
        s7eVar.d(eventDefault.getService(), eventDefault.getLabels().getAppVersionCode());
        String eventType = eventDefault.getEventType();
        String str = NetcastTVService.UDAP_API_EVENT;
        if (!Intrinsics.d(eventType, NetcastTVService.UDAP_API_EVENT)) {
            str = "error";
        }
        s7eVar.d(str, eventDefault.getEventName());
        return s7eVar.e();
    }

    public final void b(EventDefault eventDefault) {
        Executor executor = this.b;
        if (executor != null) {
            y2x.s(new xlr(0, this, eventDefault), executor);
        }
    }

    public final void c(EventDefault eventDefault) {
        try {
            u7e a = a(eventDefault);
            String str = this.c.to(eventDefault);
            Timber.INSTANCE.tag("StrmTrackingApi").d(str, new Object[0]);
            b0o b0oVar = new b0o();
            b0oVar.a = a;
            b0oVar.d(HttpMessage.USER_AGENT, this.d.c());
            Pattern pattern = twh.e;
            b0oVar.e(ServiceCommand.TYPE_POST, ybl.b(str, q5g.C("application/json")));
            d0o b = b0oVar.b();
            OkHttpClient okHttpClient = this.a;
            okHttpClient.getClass();
            new mkn(okHttpClient, b, false).z(new p7j(1));
        } catch (Throwable th) {
            this.e.M("StrmTrackingApi", "trackEvent", eventDefault, th, new Object[0]);
            Log.e("StrmTrackingApi", String.valueOf(th.getMessage()));
        }
    }
}
