package defpackage;

import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$NotStartReason;
import ru.yandex.video.m3.list_player_manager.impl.telemetry.ListViewTelemetryLogger$TerminalReason;
import ru.yandex.video.m3.player.PlaybackException;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class qag implements r9g {
    public final /* synthetic */ mbg a;

    public qag(mbg mbgVar) {
        this.a = mbgVar;
    }

    @Override // defpackage.r9g
    public final void P(PlaybackException playbackException) {
        ListViewTelemetryLogger$TerminalReason listViewTelemetryLogger$TerminalReason = ListViewTelemetryLogger$TerminalReason.NOT_START_PLAYBACK;
        ListViewTelemetryLogger$NotStartReason listViewTelemetryLogger$NotStartReason = ListViewTelemetryLogger$NotStartReason.FATAL;
        mbg mbgVar = this.a;
        mbgVar.F = mbgVar.b(listViewTelemetryLogger$TerminalReason, listViewTelemetryLogger$NotStartReason) ? 3 : 2;
    }

    @Override // defpackage.r9g
    public final void a() {
        mbg mbgVar = this.a;
        mbgVar.m = true;
        if (mbgVar.y.a()) {
            mbgVar.b(ListViewTelemetryLogger$TerminalReason.START_PLAYBACK, null);
        }
    }

    @Override // defpackage.r9g
    public final void j(PreparingParams preparingParams) {
        preparingParams.getClass();
        mbg mbgVar = this.a;
        mbgVar.F = 1;
        szn sznVar = mbgVar.v;
        Integer valueOf = Integer.valueOf(preparingParams.getSourceIndex());
        sznVar.getClass();
        sznVar.d = valueOf;
    }
}
