package ru.yandex.video.m3.player.impl.source.dash;

import androidx.media3.common.a;
import defpackage.c8q0;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/impl/source/dash/ParsedSegmentBaseHolder;", "", "Landroidx/media3/common/a;", "format", "Lc8q0;", "segmentBase", "Lzy11;", "onNewSegmentBaseParsed", "(Landroidx/media3/common/a;Lc8q0;)V", "", "", "getSegmentBaseByFormatId", "()Ljava/util/Map;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ParsedSegmentBaseHolder {
    Map<String, c8q0> getSegmentBaseByFormatId();

    void onNewSegmentBaseParsed(a format, c8q0 segmentBase);
}
