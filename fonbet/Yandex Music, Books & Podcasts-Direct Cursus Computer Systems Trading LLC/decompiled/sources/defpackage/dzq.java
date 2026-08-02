package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Ldzq;", "Lgxb;", "czq", "quk", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class dzq extends gxb {
    public static final jyr f = btf.b(new nrq(9));
    public static final jyr g = btf.b(new nrq(10));
    public static final jyr h = btf.b(new nrq(11));
    public final xdr e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dzq() {
        super("androidSmartDownloading", ouj.c("default", r0, r0), 4);
        List h2 = u75.h("default", "on", "on1");
        this.e = ydr.a(new czq(false, false, false, null, null));
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        Boolean a = a().a("idleDeviceRequired");
        boolean booleanValue = a != null ? a.booleanValue() : false;
        Boolean a2 = a().a("chargingRequired");
        boolean booleanValue2 = a2 != null ? a2.booleanValue() : false;
        Boolean a3 = a().a("deleteGradually");
        czq czqVar = new czq(booleanValue, booleanValue2, a3 != null ? a3.booleanValue() : false, a().b("retryDelayMinutes") != null ? Long.valueOf(TimeUnit.MINUTES.toMillis(r11.intValue())) : null, a().b("downloadTimeoutSec") != null ? Long.valueOf(r11.intValue() * 1000) : null);
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, czqVar);
    }
}
