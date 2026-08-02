package ru.yandex.video.m3.player.impl.utils.manifest_parsers;

import defpackage.i3y;
import defpackage.knu;
import defpackage.sls;
import java.util.List;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/manifest_parsers/HlsSessionDataParser;", "", "Lknu;", "manifest", "<init>", "(Lknu;)V", "", "", "tags$delegate", "Li3y;", "getTags", "()Ljava/util/List;", "tags", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HlsSessionDataParser {
    public static final int $stable = 8;

    /* renamed from: tags$delegate, reason: from kotlin metadata */
    private final i3y tags = a.a(new sls() { // from class: ru.yandex.video.m3.player.impl.utils.manifest_parsers.HlsSessionDataParser$tags$2
        @Override // defpackage.sls
        public final List<String> invoke() {
            return EmptyList.a;
        }
    });

    public HlsSessionDataParser(knu knuVar) {
    }

    public final List<String> getTags() {
        return (List) this.tags.getValue();
    }
}
