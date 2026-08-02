package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lr78;", "Lem7;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class r78 extends em7 {
    public final xdr e;

    public r78() {
        super("androidDiskSpaceDialog", 6);
        this.e = ydr.a(null);
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        if (a().b("level1Mb") != null) {
            long intValue = r12.intValue() * 1024 * 1024;
            Integer b = a().b("level1DaysCooldown");
            if (b != null) {
                int intValue2 = b.intValue();
                if (a().b("level2Mb") != null) {
                    long intValue3 = r12.intValue() * 1024 * 1024;
                    Boolean a = a().a("showWhenDownloading");
                    p78 p78Var = new p78(intValue, intValue2, intValue3, a != null ? a.booleanValue() : false);
                    xdr xdrVar = this.e;
                    xdrVar.getClass();
                    xdrVar.m(null, p78Var);
                }
            }
        }
    }
}
