package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Llee;", "Lgxb;", "kee", "shared-promo-ui-music"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class lee extends gxb {
    public static final lee e;
    public static kee f;

    static {
        ogp ogpVar = kee.b;
        List h = u75.h("default", "on", "on1");
        e = new lee("androidImpulsWithTrailer", ouj.c("default", h, h), 12);
        f = kee.c;
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        Object obj;
        ogp ogpVar = kee.b;
        String b = b();
        ogpVar.getClass();
        b.getClass();
        Iterator it = kee.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((kee) obj).a.equals(b)) {
                    break;
                }
            }
        }
        kee keeVar = (kee) obj;
        if (keeVar == null) {
            keeVar = kee.c;
        }
        f = keeVar;
    }
}
