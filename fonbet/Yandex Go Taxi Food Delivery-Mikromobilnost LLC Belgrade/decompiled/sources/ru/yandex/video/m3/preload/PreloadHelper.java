package ru.yandex.video.m3.preload;

import com.google.common.collect.ImmutableMap;
import defpackage.a70;
import defpackage.b64;
import defpackage.bhe;
import defpackage.d5z0;
import defpackage.egg;
import defpackage.f9h;
import defpackage.h5z0;
import defpackage.ic5;
import defpackage.jd00;
import defpackage.knu;
import defpackage.mpg;
import defpackage.npg;
import defpackage.oyr;
import defpackage.pb7;
import defpackage.ra7;
import defpackage.s4j0;
import defpackage.scc;
import defpackage.unr0;
import defpackage.w6i0;
import defpackage.x4e;
import defpackage.xnu;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.HexString;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lru/yandex/video/m3/preload/PreloadHelper;", "", "()V", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PreloadHelper {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/yandex/video/m3/preload/PreloadHelper$Companion;", "", "<init>", "()V", "Lra7;", "cache", "Lpb7;", "keyFactory", "Legg;", "manifest", "Lru/yandex/video/m3/preload/PreloadedInfo;", "dashFindCachedIndex", "(Lra7;Lpb7;Legg;)Lru/yandex/video/m3/preload/PreloadedInfo;", "Ls4j0;", "", "print", "(Ls4j0;)Ljava/lang/String;", "findPreloadedVideoTrackIndex", "(Lra7;Lpb7;Ljava/lang/Object;)Lru/yandex/video/m3/preload/PreloadedInfo;", "representation", "Lw6i0;", "initializationUri", "indexUri", "Lnpg;", "buildInitDataSpec", "(Ls4j0;Lw6i0;Lw6i0;)Lnpg;", "", "Lxnu;", "mediaPlaylistVariants", "hlsFindCachedIndex", "(Lra7;Lpb7;Ljava/util/List;)Lru/yandex/video/m3/preload/PreloadedInfo;", "dataSpec", "", "isDataSpecPreloaded", "(Lra7;Lpb7;Lnpg;)Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final PreloadedInfo dashFindCachedIndex(ra7 cache, pb7 keyFactory, egg manifest) {
            int i = 0;
            for (Object obj : manifest.getPeriod(0).c) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                a70 a70Var = (a70) obj;
                if (a70Var.b == 2) {
                    int i3 = 0;
                    for (Object obj2 : a70Var.c) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            scc.m();
                            throw null;
                        }
                        s4j0 s4j0Var = (s4j0) obj2;
                        w6i0 w6i0Var = s4j0Var.x;
                        w6i0 c = s4j0Var.c();
                        if (w6i0Var == null && c == null) {
                            d5z0 d5z0Var = h5z0.a;
                            StringBuilder t = b64.t(i3, "[", "] pendingInitializationUri and pendingIndexUri are null ");
                            t.append(PreloadHelper.INSTANCE.print(s4j0Var));
                            d5z0Var.a(t.toString(), new Object[0]);
                        } else {
                            Companion companion = PreloadHelper.INSTANCE;
                            if (companion.isDataSpecPreloaded(cache, keyFactory, companion.buildInitDataSpec(s4j0Var, w6i0Var, c))) {
                                h5z0.a.a("preloaded representation holder founded: " + companion.print(s4j0Var) + ". Index =" + i3, new Object[0]);
                                return PreloadedInfoKt.PreloadedInfo$default(i3, s4j0Var.a, null, 4, null);
                            }
                        }
                        i3 = i4;
                    }
                } else {
                    h5z0.a.a("Not a video adaptation set: " + a70Var.b, new Object[0]);
                }
                i = i2;
            }
            return null;
        }

        private final String print(s4j0 s4j0Var) {
            return "Representation: height=" + s4j0Var.a.v;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final npg buildInitDataSpec(s4j0 representation, w6i0 initializationUri, w6i0 indexUri) {
            if (initializationUri != null) {
                w6i0 a = initializationUri.a(indexUri, ((ic5) a.P(representation.b)).a);
                if (a != null) {
                    initializationUri = a;
                }
            } else {
                initializationUri = indexUri;
            }
            return jd00.c(representation, ((ic5) representation.b.get(0)).a, initializationUri, 0, ImmutableMap.f());
        }

        public final PreloadedInfo findPreloadedVideoTrackIndex(ra7 cache, pb7 keyFactory, Object manifest) {
            if (manifest instanceof egg) {
                return dashFindCachedIndex(cache, keyFactory, (egg) manifest);
            }
            if (manifest instanceof knu) {
                return hlsFindCachedIndex(cache, keyFactory, ((knu) manifest).a.e);
            }
            return null;
        }

        public final PreloadedInfo hlsFindCachedIndex(ra7 cache, pb7 keyFactory, List<xnu> mediaPlaylistVariants) {
            int i = 0;
            for (Object obj : mediaPlaylistVariants) {
                int i2 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                xnu xnuVar = (xnu) obj;
                d5z0 d5z0Var = h5z0.a;
                d5z0Var.a("mediaPlaylistVariant=" + xnuVar, new Object[0]);
                if (i != 0) {
                    Companion companion = PreloadHelper.INSTANCE;
                    mpg mpgVar = new mpg();
                    mpgVar.a = xnuVar.a;
                    mpgVar.c = 1;
                    if (companion.isDataSpecPreloaded(cache, keyFactory, mpgVar.a())) {
                        d5z0Var.a("preloaded playlistUrl founded: " + xnuVar.a, new Object[0]);
                        return PreloadedInfoKt.PreloadedInfo$default(i, xnuVar.b, null, 4, null);
                    }
                }
                i = i2;
            }
            return null;
        }

        public final boolean isDataSpecPreloaded(ra7 cache, pb7 keyFactory, npg dataSpec) {
            String buildCacheKey = keyFactory.buildCacheKey(dataSpec);
            bhe contentMetadata = cache.getContentMetadata(buildCacheKey);
            long d = ((f9h) contentMetadata).d(-1L, "exo_len");
            if (d != -1) {
                long cachedLength = cache.getCachedLength(buildCacheKey, 0L, d);
                long cachedBytes = cache.getCachedBytes(buildCacheKey, 0L, d);
                d5z0 d5z0Var = h5z0.a;
                StringBuilder w = unr0.w(d, "preloadedLength=", " cachedLength=");
                w.append(cachedLength);
                x4e.A(cachedBytes, " cachedBytes=", " dataSpec=", w);
                w.append(dataSpec);
                d5z0Var.a(w.toString(), new Object[0]);
            }
            d5z0 d5z0Var2 = h5z0.a;
            StringBuilder sb = new StringBuilder("isDataSpecPreloaded cacheKey=");
            sb.append(buildCacheKey);
            sb.append(" meta=");
            sb.append(contentMetadata);
            sb.append(HexString.CHAR_SPACE);
            sb.append(d);
            sb.append(" dataSpec=");
            sb.append(dataSpec);
            d5z0Var2.a(oyr.t(sb, " cacheKey=", buildCacheKey), new Object[0]);
            boolean z = d != -1;
            d5z0Var2.a(String.valueOf(z), new Object[0]);
            return z;
        }

        private Companion() {
        }
    }
}
