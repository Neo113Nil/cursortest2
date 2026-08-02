package defpackage;

import java.net.MalformedURLException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.text.StringsKt;
import kotlin.text.c;
import ru.yandex.video.m3.data.StreamType;
import ru.yandex.video.m3.data.exception.ManifestLoadingException;
import ru.yandex.video.m3.list_player_manager.model.InternalVideo;
import ru.yandex.video.m3.ott.data.dto.DrmParams;
import ru.yandex.video.m3.ott.data.dto.DrmServers;
import ru.yandex.video.m3.ott.data.dto.VhVideoData;
import timber.log.Timber;

/* loaded from: classes6.dex */
public abstract class wwe {
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        if (r6 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static VhVideoData a(InternalVideo.Content content, List list, long j) {
        InternalVideo.Stream stream;
        DrmServers servers;
        StreamType streamType;
        if (list != null) {
            if (list.isEmpty()) {
                list = null;
            }
            if (list != null) {
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        stream = null;
                        break;
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        u75.n();
                        throw null;
                    }
                    stream = (InternalVideo.Stream) next;
                    StreamType streamType2 = stream.getStreamType();
                    if (streamType2 == null) {
                        String url = stream.getUrl();
                        url.getClass();
                        try {
                            URI uri = new URI(url);
                            Timber.Companion companion = Timber.INSTANCE;
                            companion.w("Trying parse StreamType from uri!", new Object[0]);
                            String path = uri.getPath();
                            if (path != null) {
                                Locale locale = Locale.US;
                                String s = ouj.s(locale, path, locale);
                                streamType = c.n(s, ".mpd", false) ? StreamType.Dash : c.n(s, ".m3u8", false) ? StreamType.Hls : StreamType.Unknown;
                            }
                            streamType = StreamType.Unknown;
                            companion.d("It is " + streamType, new Object[0]);
                            streamType2 = streamType;
                        } catch (MalformedURLException unused) {
                            streamType2 = StreamType.Unknown;
                        }
                    }
                    if (stream.getDrmConfig() != null || (streamType2 != StreamType.Dash && streamType2 != StreamType.Hls)) {
                        DrmParams drmConfig = stream.getDrmConfig();
                        String proxyUrl = (drmConfig == null || (servers = drmConfig.getServers()) == null) ? null : servers.getProxyUrl();
                        if (proxyUrl != null && !StringsKt.U(proxyUrl) && streamType2 == StreamType.Dash) {
                            break;
                        }
                        Timber.INSTANCE.w("Stream by index " + i + " is not supported! Stream = " + stream, new Object[0]);
                        i = i2;
                    } else {
                        break;
                    }
                }
                if (stream != null) {
                    return p1g.u(stream.getUrl(), content.getContentId(), new uwe(j, stream, content));
                }
            }
        }
        return null;
    }

    public static LinkedHashMap b(InternalVideo.ManifestResponse manifestResponse) {
        Object t7oVar;
        manifestResponse.getClass();
        List<InternalVideo.ContentWrapper> contentList = manifestResponse.getContentList();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = contentList.iterator();
        while (it.hasNext()) {
            InternalVideo.Content content = ((InternalVideo.ContentWrapper) it.next()).getContent();
            if (content != null) {
                arrayList.add(content);
            }
        }
        int a = tah.a(v75.o(arrayList, 10));
        if (a < 16) {
            a = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            InternalVideo.Content content2 = (InternalVideo.Content) it2.next();
            String contentId = content2.getContentId();
            try {
                r7o r7oVar = z7o.b;
                t7oVar = c(content2);
            } catch (Throwable th) {
                r7o r7oVar2 = z7o.b;
                t7oVar = new t7o(th);
            }
            linkedHashMap.put(contentId, new z7o(t7oVar));
        }
        return linkedHashMap;
    }

    public static VhVideoData c(InternalVideo.Content content) {
        List<InternalVideo.Stream> streams;
        InternalVideo.ActualEpisode actualEpisode = content.getActualEpisode();
        List<InternalVideo.Stream> streams2 = actualEpisode != null ? actualEpisode.getStreams() : null;
        InternalVideo.ActualEpisode actualEpisode2 = content.getActualEpisode();
        VhVideoData a = a(content, streams2, (actualEpisode2 != null ? actualEpisode2.getStartPosition() : null) != null ? content.getActualEpisode().getStartPosition().longValue() * 1000 : -9223372036854775807L);
        if (a == null) {
            a = a(content, content.getStreams(), -9223372036854775807L);
        }
        List<InternalVideo.Stream> streams3 = content.getStreams();
        int i = 0;
        int size = streams3 != null ? streams3.size() : 0;
        InternalVideo.ActualEpisode actualEpisode3 = content.getActualEpisode();
        if (actualEpisode3 != null && (streams = actualEpisode3.getStreams()) != null) {
            i = streams.size();
        }
        if (a != null || size + i <= 0) {
            return a == null ? p1g.u(content.getContentUrl(), content.getContentId(), new vwe(content)) : a;
        }
        throw new ManifestLoadingException.NotFound(new IllegalStateException("Not supported stream"), null, 2, null);
    }
}
