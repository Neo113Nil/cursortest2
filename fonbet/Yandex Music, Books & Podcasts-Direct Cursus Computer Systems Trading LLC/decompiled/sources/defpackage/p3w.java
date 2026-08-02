package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lp3w;", "Lem7;", "wave-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class p3w extends em7 {
    public final jyr e;

    public p3w() {
        super("androidWordsInWaveSlowConnectionConfiguration", 6);
        this.e = btf.b(new dxv(7, this));
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        bqi bqiVar = (bqi) this.e.getValue();
        n8v d = d();
        xdr xdrVar = (xdr) bqiVar;
        xdrVar.getClass();
        xdrVar.m(null, d);
    }

    public final n8v d() {
        jxb a = a();
        Boolean a2 = a.a("enabled");
        boolean booleanValue = a2 != null ? a2.booleanValue() : false;
        Long e = a.e("delaySeconds");
        return new n8v(booleanValue, e != null ? TimeUnit.SECONDS.toMillis(e.longValue()) : Long.MAX_VALUE);
    }
}
