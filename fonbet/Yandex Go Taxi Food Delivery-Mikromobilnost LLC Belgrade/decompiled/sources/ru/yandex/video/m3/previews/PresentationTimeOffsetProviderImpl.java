package ru.yandex.video.m3.previews;

import defpackage.a70;
import defpackage.egg;
import defpackage.s4j0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/yandex/video/m3/previews/PresentationTimeOffsetProviderImpl;", "Lru/yandex/video/m3/previews/PresentationTimeOffsetProvider;", "<init>", "()V", "Legg;", "dashManifest", "", "getPresentationTimeOffset", "(Legg;)Ljava/lang/Long;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PresentationTimeOffsetProviderImpl implements PresentationTimeOffsetProvider {
    public static final int $stable = 0;

    @Override // ru.yandex.video.m3.previews.PresentationTimeOffsetProvider
    public Long getPresentationTimeOffset(egg dashManifest) {
        List list;
        s4j0 s4j0Var;
        if (dashManifest.getPeriodCount() <= 0) {
            return null;
        }
        a70 a70Var = (a70) a.R(dashManifest.getPeriod(0).c);
        if (a70Var == null || (list = a70Var.c) == null || (s4j0Var = (s4j0) a.R(list)) == null) {
            return 0L;
        }
        return Long.valueOf(s4j0Var.c / 1000);
    }
}
