package ru.yandex.video.m3.player.netperf;

import defpackage.cvu0;
import defpackage.h5z0;
import defpackage.kwu;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/netperf/DefaultIsNeedAddTInUrlChecker;", "Lru/yandex/video/m3/player/netperf/IsAppropriateUrlChecker;", "", "", "needInterceptPaths", "<init>", "(Ljava/util/Set;)V", "Lkwu;", "url", "", "isAppropriateUrl", "(Lkwu;)Z", "Ljava/util/Set;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultIsNeedAddTInUrlChecker implements IsAppropriateUrlChecker {
    public static final int $stable = 8;
    private final Set<String> needInterceptPaths;

    public /* synthetic */ DefaultIsNeedAddTInUrlChecker(Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? IsNeedAddTInUrlProvidersKt.getDEFAULT_VIDEO_CHUNKS_PATH_EXTENSION() : set);
    }

    @Override // ru.yandex.video.m3.player.netperf.IsAppropriateUrlChecker
    public boolean isAppropriateUrl(kwu url) {
        boolean z;
        String lowerCase = url.b().toLowerCase(Locale.ENGLISH);
        Set<String> set = this.needInterceptPaths;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (cvu0.s(lowerCase, (String) it.next(), false)) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        h5z0.a.a(z + " -> " + url, new Object[0]);
        return z;
    }

    public DefaultIsNeedAddTInUrlChecker(Set<String> set) {
        this.needInterceptPaths = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultIsNeedAddTInUrlChecker() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
