package defpackage;

import android.os.SystemClock;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.video.m3.data.dto.VideoData;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$NotStartReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$StartReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$TerminalReason;
import ru.yandex.video.m3.ui.ListYandexPlayerView;

/* loaded from: classes6.dex */
public final class pag implements p9g {
    public final /* synthetic */ mbg a;

    public pag(mbg mbgVar) {
        this.a = mbgVar;
    }

    @Override // defpackage.p9g
    public final void b(acg acgVar, boolean z) {
        if (z) {
            this.a.b(ListViewTelemetryLogger$TerminalReason.NOT_START_PLAYBACK, ListViewTelemetryLogger$NotStartReason.PAUSE_BEFORE_PLAYBACK);
        }
    }

    @Override // defpackage.p9g
    public final void c(acg acgVar, imh imhVar, imh imhVar2, kyk kykVar) {
        if (imhVar == null || !Intrinsics.d(imhVar.d, imhVar2.d)) {
            mbg mbgVar = this.a;
            if (imhVar != null) {
                mbgVar.b(ListViewTelemetryLogger$TerminalReason.NOT_START_PLAYBACK, ListViewTelemetryLogger$NotStartReason.DROP_SOURCE);
                mbgVar.i.g0(1);
                mbgVar.k = null;
                mbgVar.l = null;
            }
            tzn tznVar = mbgVar.p;
            Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
            tznVar.getClass();
            tznVar.d = valueOf;
            mbgVar.k = imhVar2;
            mbgVar.l = kykVar;
        }
    }

    @Override // defpackage.p9g
    public final void d() {
        this.a.i.g0(4);
    }

    @Override // defpackage.p9g
    public final void e(paw pawVar) {
        mbg.a(this.a, pawVar);
    }

    @Override // defpackage.p9g
    public final void f(acg acgVar, boolean z) {
        if (z) {
            return;
        }
        ListViewTelemetryLogger$StartReason listViewTelemetryLogger$StartReason = ListViewTelemetryLogger$StartReason.PLAYING_RESUMED;
        mbg mbgVar = this.a;
        if (mbgVar.j == null && mbgVar.F != 3) {
            long uptimeMillis = SystemClock.uptimeMillis();
            mbgVar.j = Long.valueOf(uptimeMillis);
            mbgVar.n.b(listViewTelemetryLogger$StartReason.getIo.appmetrica.analytics.rtm.internal.Constants.KEY_VALUE java.lang.String());
            if (mbgVar.a.j) {
                tzn tznVar = mbgVar.y;
                if (tznVar.d == null && tznVar.e == null) {
                    tznVar.d = Long.valueOf(uptimeMillis);
                }
            }
            if (mbgVar.F == 2 && mbgVar.b(ListViewTelemetryLogger$TerminalReason.NOT_START_PLAYBACK, ListViewTelemetryLogger$NotStartReason.FATAL)) {
                mbgVar.F = 3;
            }
        }
        tzn tznVar2 = mbgVar.o;
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        tznVar2.getClass();
        tznVar2.d = valueOf;
    }

    @Override // defpackage.p9g
    public final void g(rue rueVar, ListYandexPlayerView listYandexPlayerView, VideoData videoData, boolean z) {
        mbg mbgVar = this.a;
        tzn tznVar = mbgVar.q;
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        tznVar.getClass();
        tznVar.d = valueOf;
        szn sznVar = mbgVar.r;
        Boolean valueOf2 = Boolean.valueOf(z);
        sznVar.getClass();
        sznVar.d = valueOf2;
    }
}
