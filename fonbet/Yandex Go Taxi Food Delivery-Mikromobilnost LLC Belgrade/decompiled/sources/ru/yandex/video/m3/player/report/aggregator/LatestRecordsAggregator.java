package ru.yandex.video.m3.player.report.aggregator;

import defpackage.x43;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.video.m3.player.report.dto.Record;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/yandex/video/m3/player/report/aggregator/LatestRecordsAggregator;", "Lru/yandex/video/m3/player/report/dto/Record;", "T", "Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;", "", "retainedRecords", "<init>", "(I)V", "record", "Lzy11;", "add", "(Lru/yandex/video/m3/player/report/dto/Record;)V", "", "dump", "()Ljava/util/List;", "flush", "", "isEmpty", "()Z", CA20Status.STATUS_USER_I, "Lx43;", "records", "Lx43;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LatestRecordsAggregator<T extends Record> implements RecordAggregator<T> {
    public static final int $stable = 8;
    private final x43 records;
    private final int retainedRecords;

    public LatestRecordsAggregator(int i) {
        this.retainedRecords = i;
        this.records = new x43(i + 1);
    }

    @Override // ru.yandex.video.m3.player.report.aggregator.RecordAggregator
    public synchronized void add(T record) {
        this.records.addLast(record);
        if (this.records.size() > this.retainedRecords) {
            this.records.removeFirst();
        }
    }

    @Override // ru.yandex.video.m3.player.report.aggregator.RecordAggregator
    public synchronized List<T> dump() {
        return a.J0(this.records);
    }

    @Override // ru.yandex.video.m3.player.report.aggregator.RecordAggregator
    public synchronized List<T> flush() {
        List<T> dump;
        dump = dump();
        this.records.clear();
        return dump;
    }

    @Override // ru.yandex.video.m3.player.report.aggregator.RecordAggregator
    public synchronized boolean isEmpty() {
        return this.records.isEmpty();
    }
}
