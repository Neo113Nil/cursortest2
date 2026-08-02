package ru.yandex.video.m3.player.report;

import defpackage.i3y;
import defpackage.sls;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import kotlin.collections.EmptyList;
import kotlin.collections.b;
import ru.yandex.video.m3.player.report.DebugReport;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u001b\u0010\u0005\u001a\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\t\u001a\u00020\u0000*\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/yandex/video/m3/player/report/DebugReport;", "DEBUG_REPORT_EMPTY$delegate", "Li3y;", "getDEBUG_REPORT_EMPTY", "()Lru/yandex/video/m3/player/report/DebugReport;", "DEBUG_REPORT_EMPTY", "Lru/yandex/video/m3/player/report/DebugReport$Companion;", "getEMPTY", "(Lru/yandex/video/m3/player/report/DebugReport$Companion;)Lru/yandex/video/m3/player/report/DebugReport;", "EMPTY", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugReportExtKt {
    private static final i3y DEBUG_REPORT_EMPTY$delegate = a.a(new sls() { // from class: ru.yandex.video.m3.player.report.DebugReportExtKt$DEBUG_REPORT_EMPTY$2
        @Override // defpackage.sls
        public final DebugReportImpl invoke() {
            Map f = b.f();
            Map f2 = b.f();
            EmptyList emptyList = EmptyList.a;
            return new DebugReportImpl(emptyList, f, null, emptyList, f2);
        }
    });

    private static final DebugReport getDEBUG_REPORT_EMPTY() {
        return (DebugReport) DEBUG_REPORT_EMPTY$delegate.getValue();
    }

    public static final DebugReport getEMPTY(DebugReport.Companion companion) {
        return getDEBUG_REPORT_EMPTY();
    }
}
