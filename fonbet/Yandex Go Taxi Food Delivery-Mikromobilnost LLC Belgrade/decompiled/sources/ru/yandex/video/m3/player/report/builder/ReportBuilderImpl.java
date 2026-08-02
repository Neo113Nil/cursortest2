package ru.yandex.video.m3.player.report.builder;

import defpackage.tcc;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.collections.builders.MapBuilder;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.report.DebugReport;
import ru.yandex.video.m3.player.report.DebugReportImpl;
import ru.yandex.video.m3.player.report.DebugReportReason;
import ru.yandex.video.m3.player.report.aggregator.LatestRecordsAggregator;
import ru.yandex.video.m3.player.report.aggregator.RecordAggregator;
import ru.yandex.video.m3.player.report.dto.Record;
import ru.yandex.video.m3.player.report.format.RecordFormatterImpl;
import ru.yandex.video.m3.player.report.logger.RecordLogger;
import ru.yandex.video.m3.player.report.logger.RecordLoggerImpl;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0006*\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J3\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010 \u001a\u00020\u000f2\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001aj\u0002`\u001cH\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010,\u001a\u0004\u0018\u00010%2\u0006\u0010)\u001a\u00020(H\u0010¢\u0006\u0004\b*\u0010+J%\u00102\u001a\u00020/2\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0\u0004H\u0010¢\u0006\u0004\b0\u00101R&\u00104\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u0004038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u00108\u001a\b\u0012\u0004\u0012\u000207068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020:068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00105R,\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u001aj\u0004\u0018\u0001`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006@"}, d2 = {"Lru/yandex/video/m3/player/report/builder/ReportBuilderImpl;", "Lru/yandex/video/m3/player/report/builder/BaseReportBuilder;", "<init>", "()V", "Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;", "Lru/yandex/video/m3/player/report/dto/Record;", "", "", "Lru/yandex/video/m3/player/report/format/FormattedRecord;", "dumpAndFormatRecords", "(Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;)Ljava/util/List;", "tag", Constants.KEY_MESSAGE, "", ClidProvider.TIMESTAMP, "Lzy11;", "addAssert$video_player_internalRelease", "(Ljava/lang/String;Ljava/lang/String;J)V", "addAssert", "region", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "addError$video_player_internalRelease", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;J)V", "addError", "", "", "Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoDto;", "deviceInfo", "setDeviceInfo$video_player_internalRelease", "(Ljava/util/Map;)V", "setDeviceInfo", "key", "value", "addExperimentalFlag", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lru/yandex/video/m3/player/report/DebugReport;", "getDebugReport", "()Lru/yandex/video/m3/player/report/DebugReport;", "Lru/yandex/video/m3/player/report/DebugReportReason;", "trigger", "getDebugReportIfNecessary$video_player_internalRelease", "(Lru/yandex/video/m3/player/report/DebugReportReason;)Lru/yandex/video/m3/player/report/DebugReport;", "getDebugReportIfNecessary", "Lru/yandex/video/m3/player/report/dto/Record$Log;", "aggregator", "Lru/yandex/video/m3/player/report/logger/RecordLogger;", "registerLogger$video_player_internalRelease", "(Ljava/lang/String;Lru/yandex/video/m3/player/report/aggregator/RecordAggregator;)Lru/yandex/video/m3/player/report/logger/RecordLogger;", "registerLogger", "", "aggregators", "Ljava/util/Map;", "Lru/yandex/video/m3/player/report/aggregator/LatestRecordsAggregator;", "Lru/yandex/video/m3/player/report/dto/Record$Assert;", "asserts", "Lru/yandex/video/m3/player/report/aggregator/LatestRecordsAggregator;", "Lru/yandex/video/m3/player/report/dto/Record$Error;", "errors", "flags", "Lru/yandex/video/m3/player/report/format/RecordFormatterImpl;", "recordFormatter", "Lru/yandex/video/m3/player/report/format/RecordFormatterImpl;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReportBuilderImpl extends BaseReportBuilder {
    public static final int $stable = 8;
    private Map<String, ? extends Object> deviceInfo;
    private final Map<String, RecordAggregator<Record.Log>> aggregators = new LinkedHashMap();
    private final LatestRecordsAggregator<Record.Assert> asserts = new LatestRecordsAggregator<>(50);
    private final LatestRecordsAggregator<Record.Error> errors = new LatestRecordsAggregator<>(10);
    private final Map<String, Object> flags = new LinkedHashMap();
    private final RecordFormatterImpl recordFormatter = new RecordFormatterImpl();

    private final List<String> dumpAndFormatRecords(RecordAggregator<? extends Record> recordAggregator) {
        List x0 = a.x0(recordAggregator.dump(), new Comparator() { // from class: ru.yandex.video.m3.player.report.builder.ReportBuilderImpl$dumpAndFormatRecords$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Long.valueOf(((Record) t).getTimestampMs()).compareTo(Long.valueOf(((Record) t2).getTimestampMs()));
            }
        });
        ArrayList arrayList = new ArrayList(tcc.n(x0, 10));
        Iterator it = x0.iterator();
        while (it.hasNext()) {
            arrayList.add(this.recordFormatter.format((Record) it.next()));
        }
        return arrayList;
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder
    public void addAssert$video_player_internalRelease(String tag, String message, long timestamp) {
        this.asserts.add(new Record.Assert(tag, message, timestamp));
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder
    public void addError$video_player_internalRelease(String tag, String region, Exception e, long timestamp) {
        this.errors.add(new Record.Error(tag, region, e, timestamp));
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder, ru.yandex.video.m3.player.report.builder.ReportBuilder
    public void addExperimentalFlag(String key, Object value) {
        this.flags.put(key, value);
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder, ru.yandex.video.m3.player.report.builder.ReportBuilder
    public DebugReport getDebugReport() {
        List<String> dumpAndFormatRecords = dumpAndFormatRecords(this.asserts);
        Map<String, ? extends Object> map = this.deviceInfo;
        List<String> dumpAndFormatRecords2 = dumpAndFormatRecords(this.errors);
        Map t = b.t(this.flags);
        MapBuilder mapBuilder = new MapBuilder();
        Map<String, RecordAggregator<Record.Log>> map2 = this.aggregators;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, RecordAggregator<Record.Log>> entry : map2.entrySet()) {
            if (!entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            mapBuilder.put((String) entry2.getKey(), dumpAndFormatRecords((RecordAggregator) entry2.getValue()));
        }
        return new DebugReportImpl(dumpAndFormatRecords, mapBuilder.j(), map, dumpAndFormatRecords2, t);
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder
    public DebugReport getDebugReportIfNecessary$video_player_internalRelease(DebugReportReason trigger) {
        return null;
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder
    public RecordLogger registerLogger$video_player_internalRelease(String tag, RecordAggregator<Record.Log> aggregator) {
        this.aggregators.put(tag, aggregator);
        return new RecordLoggerImpl(tag, aggregator, this);
    }

    @Override // ru.yandex.video.m3.player.report.builder.BaseReportBuilder
    public void setDeviceInfo$video_player_internalRelease(Map<String, ? extends Object> deviceInfo) {
        this.deviceInfo = deviceInfo;
    }
}
