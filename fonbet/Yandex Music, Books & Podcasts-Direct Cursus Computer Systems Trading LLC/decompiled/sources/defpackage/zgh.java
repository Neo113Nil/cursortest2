package defpackage;

import com.connectsdk.service.webos.lgcast.remotecamera.service.CameraService;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.Map;
import ru.yandex.music.common.media.mediabrowser.MusicBrowserService;

/* loaded from: classes5.dex */
public final class zgh extends hjq {
    public static final zgh b = new zgh(1);
    public static String c = "";

    public final void g() {
        y60 e = e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, "custom_seek");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    public final void h(boolean z) {
        y60 e = e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, z ? "dislike" : "undislike");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    public final void i(boolean z) {
        y60 e = e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        bwf bwfVar = bwf.c;
        arf g = tlm.g(bwfVar);
        Map map = (Map) g.getValue();
        arf g2 = tlm.g(bwfVar);
        ((Map) g2.getValue()).put(Constants.KEY_ACTION, z ? "like" : "unlike");
        map.put("MediaSession", g2.isInitialized() ? (Map) g2.getValue() : null);
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }

    public final void j(nyn nynVar, boolean z) {
        String str;
        int ordinal = nynVar.ordinal();
        if (ordinal == 0) {
            str = "none";
        } else if (ordinal == 1) {
            str = "one";
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            str = "all";
        }
        y60 e = e();
        String str2 = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        arf g = tlm.g(bwf.c);
        Map map = (Map) g.getValue();
        ub ubVar = new ub();
        ubVar.c(new String[]{Constants.KEY_ACTION, z ? "custom_repeat" : "repeat"}, str);
        map.put("MediaSession", ubVar.b());
        tlm.o(e, str2, g.isInitialized() ? (Map) g.getValue() : null);
    }

    public final void k(boolean z) {
        y60 e = e();
        String str = MusicBrowserService.n ? "AndroidAuto" : "OtherMedia";
        arf g = tlm.g(bwf.c);
        Map map = (Map) g.getValue();
        ub ubVar = new ub();
        ubVar.c(new String[]{"search", CameraService.RESULT}, Boolean.valueOf(z));
        map.put("MediaSession", ubVar.b());
        tlm.o(e, str, g.isInitialized() ? (Map) g.getValue() : null);
    }
}
