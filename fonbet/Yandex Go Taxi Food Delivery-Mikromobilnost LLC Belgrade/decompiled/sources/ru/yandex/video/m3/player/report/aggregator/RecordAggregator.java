package ru.yandex.video.m3.player.report.aggregator;

import java.util.List;
import kotlin.Metadata;
import ru.yandex.video.m3.player.report.dto.Record;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b`\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;", "Lru/yandex/video/m3/player/report/dto/Record;", "T", "", "record", "Lzy11;", "add", "(Lru/yandex/video/m3/player/report/dto/Record;)V", "", "dump", "()Ljava/util/List;", "flush", "", "isEmpty", "()Z", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface RecordAggregator<T extends Record> {
    void add(T record);

    List<T> dump();

    List<T> flush();

    boolean isEmpty();
}
