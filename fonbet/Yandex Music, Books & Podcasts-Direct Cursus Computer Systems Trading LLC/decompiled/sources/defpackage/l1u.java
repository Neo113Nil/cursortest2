package defpackage;

import android.content.Context;
import java.util.concurrent.Future;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxy;
import ru.yandex.video.m3.ott.data.dto.drm.DrmProxyWithFreeRequestParams;
import ru.yandex.video.m3.player.a;

/* loaded from: classes6.dex */
public final class l1u extends a {
    public final Context f;
    public final e18 g;
    public final ngl h;
    public final v8h i;
    public final g8c j;
    public final cke k;
    public v2t l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1u(paw pawVar, Context context, e18 e18Var, ngl nglVar, v8h v8hVar, g8c g8cVar) {
        super(pawVar, new z23(context), nglVar);
        context.getClass();
        cke ckeVar = new cke(context);
        this.f = context;
        this.g = e18Var;
        this.h = nglVar;
        this.i = v8hVar;
        this.j = g8cVar;
        this.k = ckeVar;
    }

    @Override // ru.yandex.video.m3.player.a
    public final String a(VideoData videoData) {
        VhVideoData vhVideoData = (VhVideoData) videoData;
        vhVideoData.getClass();
        return vhVideoData.getContentId();
    }

    @Override // ru.yandex.video.m3.player.a
    public final boolean c() {
        paw pawVar = this.a;
        VideoData G = pawVar.G();
        if (G == null) {
            return false;
        }
        VhVideoData vhVideoData = G instanceof VhVideoData ? (VhVideoData) G : null;
        if (vhVideoData == null) {
            return false;
        }
        pawVar.H(vhVideoData.getContentId(), a4g.e(true, new hxo(21, this)));
        return true;
    }

    public final Long d(Long l, VideoData videoData) {
        VhVideoData vhVideoData = (VhVideoData) videoData;
        ngl nglVar = this.h;
        nglVar.getClass();
        nglVar.H("VhPlayerStrategy", "getStartPosition", null, "userAskedStartPosition=" + l, "videoData.watchProgressPosition=" + vhVideoData.getWatchProgressPositionMs());
        return Long.valueOf(l != null ? l.longValue() : vhVideoData.getWatchProgressPositionMs());
    }

    public final gom e(VideoData videoData) {
        VhVideoData vhVideoData = (VhVideoData) videoData;
        ngl nglVar = this.h;
        nglVar.getClass();
        StringBuilder sb = new StringBuilder("videoData=");
        sb.append(vhVideoData.getDrmConfig() instanceof DrmProxyWithFreeRequestParams ? vhVideoData.copy(zyt.L) : vhVideoData.copy(zyt.X));
        nglVar.H("VhPlayerStrategy", "prepareDrm", null, sb.toString());
        DrmProxy drmConfig = vhVideoData.getDrmConfig();
        if (drmConfig != null) {
            return gut.e(new gcp(27, this, drmConfig));
        }
        return null;
    }

    public final Future f(String str) {
        str.getClass();
        ngl nglVar = this.h;
        nglVar.getClass();
        nglVar.H("VhPlayerStrategy", "prepareVideoData", null, "contentId=".concat(str));
        this.k.b.f();
        v8h v8hVar = this.i;
        v8hVar.getClass();
        str.getClass();
        return v8hVar.a(str);
    }
}
