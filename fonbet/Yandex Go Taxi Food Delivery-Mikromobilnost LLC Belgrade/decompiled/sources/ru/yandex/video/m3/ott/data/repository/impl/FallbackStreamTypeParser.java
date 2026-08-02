package ru.yandex.video.m3.ott.data.repository.impl;

import defpackage.cvu0;
import defpackage.d5z0;
import defpackage.h5z0;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.video.m3.data.StreamType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/FallbackStreamTypeParser;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FallbackStreamTypeParser {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/video/m3/ott/data/repository/impl/FallbackStreamTypeParser$Companion;", "", "()V", "parse", "Lru/yandex/video/m3/data/StreamType;", "streamUrl", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
        
            if (r3 == null) goto L13;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final StreamType parse(String streamUrl) {
            StreamType streamType;
            try {
                URI uri = new URI(streamUrl);
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.o("Trying parse StreamType from uri!", new Object[0]);
                String path = uri.getPath();
                if (path != null) {
                    String lowerCase = path.toLowerCase(Locale.US);
                    streamType = cvu0.s(lowerCase, ".mpd", false) ? StreamType.Dash : cvu0.s(lowerCase, ".m3u8", false) ? StreamType.Hls : StreamType.Unknown;
                }
                streamType = StreamType.Unknown;
                d5z0Var.a("It is " + streamType, new Object[0]);
                return streamType;
            } catch (MalformedURLException unused) {
                return StreamType.Unknown;
            }
        }

        private Companion() {
        }
    }
}
