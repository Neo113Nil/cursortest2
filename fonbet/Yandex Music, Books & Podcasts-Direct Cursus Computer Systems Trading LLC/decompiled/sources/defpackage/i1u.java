package defpackage;

import android.graphics.Point;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Future;
import kotlin.collections.CollectionsKt;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.Ott;
import ru.yandex.video.m3.ott.data.dto.Vh;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;

/* loaded from: classes4.dex */
public final class i1u implements v8h {
    public final h1u a;
    public final Regex b = new Regex("(\\d+)x(\\d+)p");
    public final int c;

    public i1u(h1u h1uVar, Point point) {
        this.a = h1uVar;
        this.c = point.x * point.y;
    }

    @Override // defpackage.v8h
    public final Future a(String str) {
        str.getClass();
        return new izc(new xes(9, this, str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r7 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final VhVideoData c(Vh.VhResponse vhResponse, List list, long j) {
        Vh.Stream stream;
        tjr tjrVar;
        DrmServers servers;
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                u75.n();
                throw null;
            }
            Vh.Stream stream2 = (Vh.Stream) obj;
            StreamType streamType = stream2.getStreamType();
            if (streamType != null) {
                int i3 = j1u.a[streamType.ordinal()];
                if (i3 == 1) {
                    tjrVar = tjr.a;
                } else if (i3 == 2) {
                    tjrVar = tjr.b;
                } else {
                    if (i3 != 3) {
                        b6e.s();
                        return null;
                    }
                    tjrVar = null;
                }
            }
            String url = stream2.getUrl();
            url.getClass();
            try {
                URI uri = new URI(url);
                ssg.a(5, null, "Trying parse StreamType from uri!", null);
                String path = uri.getPath();
                if (path != null) {
                    Locale locale = Locale.US;
                    String s = ouj.s(locale, path, locale);
                    tjrVar = c.n(s, ".mpd", false) ? tjr.a : c.n(s, ".m3u8", false) ? tjr.b : c.n(s, ".mp4", false) ? tjr.c : tjr.d;
                } else {
                    tjrVar = tjr.d;
                }
                ssg.a(3, null, "It is " + tjrVar, null);
            } catch (MalformedURLException unused) {
                tjrVar = tjr.d;
            }
            if (stream2.getDrmConfig() != null || (tjrVar != tjr.a && tjrVar != tjr.b && tjrVar != tjr.c)) {
                DrmParams drmConfig = stream2.getDrmConfig();
                String proxyUrl = (drmConfig == null || (servers = drmConfig.getServers()) == null) ? null : servers.getProxyUrl();
                if (proxyUrl == null || StringsKt.U(proxyUrl) || tjrVar != tjr.a) {
                    ssg.a(5, null, "Stream by index " + i + " is not supported! Stream = " + stream2, null);
                    i = i2;
                }
            }
            arrayList.add(obj);
            i = i2;
        }
        List o0 = CollectionsKt.o0(arrayList, new eh(18, this));
        if (o0 == null || (stream = (Vh.Stream) CollectionsKt.firstOrNull(o0)) == null) {
            return null;
        }
        return p1g.u(stream.getUrl(), vhResponse.getContent().getContentId(), new j8a(j, this, stream));
    }

    public final VhVideoData d(Vh.VhResponse vhResponse) {
        long j;
        List<Vh.Stream> streams;
        Long startPosition;
        if (vhResponse != null) {
            Vh.ActualEpisode actualEpisode = vhResponse.getContent().getActualEpisode();
            List<Vh.Stream> streams2 = actualEpisode != null ? actualEpisode.getStreams() : null;
            Vh.ActualEpisode actualEpisode2 = vhResponse.getContent().getActualEpisode();
            if ((actualEpisode2 != null ? actualEpisode2.getStartPosition() : null) != null) {
                Vh.ActualEpisode actualEpisode3 = vhResponse.getContent().getActualEpisode();
                j = ((actualEpisode3 == null || (startPosition = actualEpisode3.getStartPosition()) == null) ? 0L : startPosition.longValue()) * 1000;
            } else {
                j = -9223372036854775807L;
            }
            VhVideoData c = c(vhResponse, streams2, j);
            if (c == null) {
                c = c(vhResponse, vhResponse.getContent().getStreams(), -9223372036854775807L);
            }
            List<Vh.Stream> streams3 = vhResponse.getContent().getStreams();
            int i = 0;
            int size = streams3 != null ? streams3.size() : 0;
            Vh.ActualEpisode actualEpisode4 = vhResponse.getContent().getActualEpisode();
            if (actualEpisode4 != null && (streams = actualEpisode4.getStreams()) != null) {
                i = streams.size();
            }
            if (c == null && size + i > 0) {
                throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
            }
            if (c == null) {
                String contentUrl = vhResponse.getContent().getContentUrl();
                String contentId = vhResponse.getContent().getContentId();
                contentUrl.getClass();
                contentId.getClass();
                e5b e5bVar = e5b.a;
                e5bVar.getClass();
                c = new VhVideoData(contentUrl, contentId, -9223372036854775807L, null, null, null, false, null, false, null, null, null, new Ott.TrackingData(e5bVar, false, null, null, null, Ott.DeviceType.App), !r20.getTrackings().isEmpty(), null);
            }
            if (vhResponse.getContent().getOttParams() != null) {
                c = c.copy(new r3s(this, vhResponse));
            }
            if (c != null) {
                return c;
            }
        }
        throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
    }
}
