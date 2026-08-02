package ru.yandex.video.m3.player.report.format;

import kotlin.Metadata;
import ru.yandex.video.m3.player.report.dto.Record;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/report/format/RecordFormatter;", "", "format", "", "Lru/yandex/video/m3/player/report/format/FormattedRecord;", "record", "Lru/yandex/video/m3/player/report/dto/Record;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RecordFormatter {
    String format(Record record);
}
