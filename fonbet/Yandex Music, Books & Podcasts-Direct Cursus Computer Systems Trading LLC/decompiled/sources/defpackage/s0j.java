package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ls0j;", "Lgxb;", "r0j", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes6.dex */
public final class s0j extends gxb {
    public static final r0j e;
    public static final AtomicReference f;

    static {
        r0j r0jVar = new r0j(0);
        e = r0jVar;
        f = new AtomicReference(r0jVar);
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        Integer b = a().b("http_errors_quota");
        f.set(new r0j(b != null ? b.intValue() : 0));
    }
}
