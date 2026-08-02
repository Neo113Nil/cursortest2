package defpackage;

import com.yandex.music.shared.fmradio.api.commands.StartFmRadioQueueCommand;
import com.yandex.music.shared.fmradio.domain.commands.AwaitNetworkConnectedCommand;
import com.yandex.music.shared.generative.domain.commands.c;
import com.yandex.music.shared.glagol.api.queue.SharedGlagolPlaybackCommand$Back;
import com.yandex.music.shared.glagol.api.queue.SharedGlagolPlaybackCommand$Next;
import com.yandex.music.shared.music_starter.executor.FmQueueStartCommand;
import com.yandex.music.shared.music_starter.executor.GenerativeQueueStartCommand;
import com.yandex.music.shared.music_starter.executor.VideoClipQueueStartCommand;
import com.yandex.music.shared.music_starter.executor.WaveQueueStartCommand;
import com.yandex.music.shared.playback.api.commands.AwaitPlayerConvergedCommand;
import com.yandex.music.shared.playback.api.commands.ChangeMediaOutputTargetCommand;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PauseOnQueueEndCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.ReplayCommand;
import com.yandex.music.shared.playback.api.commands.SeekToFractionCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.api.commands.SetPlaybackSpeedCommand;
import com.yandex.music.shared.playback.api.commands.SetVolumeCommand;
import com.yandex.music.shared.playback.api.commands.SuspendCommand;
import com.yandex.music.shared.playback.api.commands.ToggleCommand;
import com.yandex.music.shared.playback.api.commands.UnsuspendCommand;
import com.yandex.music.shared.playback.api.commands.VolumeMuteCommand;
import com.yandex.music.shared.playback.api.commands.VolumeUnmuteCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsLastCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsNextCommand;
import com.yandex.music.shared.playback.utils.api.commands.AttractivenessOperationCommand;
import com.yandex.music.shared.playback.utils.api.commands.AwaitOriginalPositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.AwaitQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.MovePlayableCommand;
import com.yandex.music.shared.playback.utils.api.commands.NoopCallbackCommand;
import com.yandex.music.shared.playback.utils.api.commands.PrevCommand;
import com.yandex.music.shared.playback.utils.api.commands.PreviousOrReplayCommand;
import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableByQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.RemovePlayableCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardByLongTapCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekBackwardNonMusicContentCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardByLongTapCommand;
import com.yandex.music.shared.playback.utils.api.commands.SeekForwardNonMusicContentCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetOriginalPositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionAndPlayCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetQueuePositionCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetRepeatModeCommand;
import com.yandex.music.shared.playback.utils.api.commands.SetShuffleCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import com.yandex.music.shared.player.integration.api.trackrestarter.RestartTrackCommand;
import com.yandex.music.shared.settings.api.explicit.commands.RebuildQueueOnExplicitChangeCommand;
import com.yandex.music.shared.wave.domain.commands.d;
import com.yandex.music.shared.ynison.api.queue.StartYnisonQueueCommand;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$AddLast;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$AddNext;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$Move;
import com.yandex.music.shared.ynison.api.queue.YnisonEditQueueCommand$RemoveAt;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$Back;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$Next;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$OriginalPosition;
import com.yandex.music.shared.ynison.api.queue.YnisonNavigateCommand$QueuePosition;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$RepeatToggle;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ReverseToggle;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleToggle;
import com.yandex.music.shared.ynison.api.queue.YnisonOptionCommand$ShuffleWithIndices;
import com.yandex.music.shared.ynison.center.api.launcher.StartQueueIntoYnisonRemoteCommand;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.e;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.common.media.control.shared.commands.DoNotLaunchCommand;
import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommand;
import ru.yandex.music.common.media.control.shared.commands.LaunchGlagolCommandOld;
import ru.yandex.music.common.media.control.shared.commands.StartQueueCommand;
import ru.yandex.music.common.media.control.shared.commands.StartQueueIntoYnisonRemoteCommandOld;
import ru.yandex.music.glagol.legacy.StartLegacyGlagolQueueBasicCommand;

/* loaded from: classes3.dex */
public final class f3q implements AutoCloseable {
    public final x0q a;
    public final tf6 b;
    public final jyr c;
    public final oq7 d;
    public final k1l e;
    public final k1l f;
    public final s7l g;
    public final q8b h;
    public final uoh i;

    public f3q(yyk yykVar, f4m f4mVar, jyr jyrVar, t5l t5lVar, qqs qqsVar, p9w p9wVar, jyr jyrVar2, j2t j2tVar, luu luuVar, jyr jyrVar3, jyr jyrVar4, jyr jyrVar5, jyr jyrVar6, jyr jyrVar7, jyr jyrVar8, cr crVar, final d0l d0lVar, jyr jyrVar9, x0q x0qVar) {
        this.a = x0qVar;
        tf6 e = gld.e(e.c(a4g.n(), new im6("SharedPlaybackAdapter")).plus(dm6.b));
        this.b = e;
        this.c = jyrVar;
        oq7 oq7Var = yykVar.c;
        this.d = oq7Var;
        f7l f7lVar = oq7Var.a;
        k1l k1lVar = yykVar.a;
        this.e = k1lVar;
        this.f = k1lVar;
        this.g = yykVar.d;
        this.h = yykVar.f;
        final uoh uohVar = yykVar.e;
        this.i = uohVar;
        jyk jykVar = yykVar.b;
        k9w k9wVar = (k9w) jyrVar3.getValue();
        Continuation continuation = null;
        pr3 pr3Var = jyrVar2 != null ? (pr3) jyrVar2.getValue() : null;
        k9wVar.getClass();
        final jtc jtcVar = new jtc(jyrVar9, new kme(oq7Var.a));
        iyk.a(jykVar, ern.a(PlayCommand.class), new c76(jyrVar6, 24));
        iyk.a(jykVar, ern.a(PauseCommand.class), new trn(13));
        iyk.a(jykVar, ern.a(PauseOnQueueEndCommand.class), new trn(14));
        iyk.a(jykVar, ern.a(ToggleCommand.class), new c76(jyrVar6, 25));
        iyk.a(jykVar, ern.a(SuspendCommand.class), new trn(15));
        iyk.a(jykVar, ern.a(UnsuspendCommand.class), new trn(4));
        iyk.a(jykVar, ern.a(ReplayCommand.class), new trn(5));
        iyk.a(jykVar, ern.a(SeekToPositionCommand.class), new trn(6));
        iyk.a(jykVar, ern.a(SeekToFractionCommand.class), new trn(7));
        iyk.a(jykVar, ern.a(SetPlaybackSpeedCommand.class), new trn(8));
        iyk.a(jykVar, ern.a(SetVolumeCommand.class), new trn(9));
        iyk.a(jykVar, ern.a(VolumeMuteCommand.class), new trn(10));
        iyk.a(jykVar, ern.a(VolumeUnmuteCommand.class), new trn(11));
        iyk.a(jykVar, ern.a(AwaitPlayerConvergedCommand.class), new trn(12));
        final int i = 1;
        iyk.a(jykVar, ern.a(ChangeMediaOutputTargetCommand.class), new Function0() { // from class: goc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return new vbr();
                    default:
                        return new xb4(uohVar);
                }
            }
        });
        d.h(jykVar, luuVar.b, uohVar, j2tVar, btf.b(new kuu(luuVar, i)), k1lVar, k1lVar, t5lVar, luuVar.c);
        com.yandex.music.shared.radio.domain.commands.d.b(jykVar, btf.b(new c76(jyrVar4, 23)), jyrVar5, uohVar);
        final int i2 = 0;
        iyk.c(jykVar, ern.a(StartFmRadioQueueCommand.class), new Function0() { // from class: goc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return new vbr();
                    default:
                        return new xb4(uohVar);
                }
            }
        });
        iyk.a(jykVar, ern.a(AwaitNetworkConnectedCommand.class), new c76(jyrVar8, 2));
        y3d y3dVar = (y3d) jyrVar7.getValue();
        y3dVar.getClass();
        c.a(jykVar, uohVar, y3dVar.c, y3dVar.b, y3dVar.d, y3dVar.e, y3dVar.f, y3dVar.g);
        iyk.b(jykVar, ern.a(SeekForwardByLongTapCommand.class), new p1n(14));
        iyk.b(jykVar, ern.a(SeekBackwardByLongTapCommand.class), new p1n(15));
        iyk.b(jykVar, ern.a(SeekBackwardNonMusicContentCommand.class), new p1n(17));
        iyk.b(jykVar, ern.a(SeekForwardNonMusicContentCommand.class), new p1n(18));
        iyk.b(jykVar, ern.a(SkipCommand.class), new p1n(19));
        iyk.b(jykVar, ern.a(PrevCommand.class), new p1n(20));
        iyk.b(jykVar, ern.a(PreviousOrReplayCommand.class), new p1n(21));
        iyk.b(jykVar, ern.a(SetOriginalPositionCommand.class), new p1n(22));
        iyk.a(jykVar, ern.a(AwaitOriginalPositionCommand.class), new p1n(23));
        iyk.b(jykVar, ern.a(SetQueuePositionCommand.class), new p1n(25));
        iyk.a(jykVar, ern.a(AwaitQueuePositionCommand.class), new p1n(24));
        iyk.a(jykVar, ern.a(NoopCallbackCommand.class), new p1n(26));
        iyk.b(jykVar, ern.a(MovePlayableCommand.class), new p1n(27));
        iyk.b(jykVar, ern.a(RemovePlayableByQueuePositionCommand.class), new p1n(28));
        iyk.b(jykVar, ern.a(SetQueuePositionAndPlayCommand.class), new p1n(29));
        iyk.b(jykVar, ern.a(AddPlayablesAsNextCommand.class), new trn(0));
        iyk.b(jykVar, ern.a(AddPlayablesAsLastCommand.class), new trn(1));
        iyk.b(jykVar, ern.a(RemovePlayableCommand.class), new trn(2));
        final int i3 = 1;
        iyk.b(jykVar, ern.a(SetShuffleCommand.class), new Function0() { // from class: srn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return new dop(jtcVar);
                    default:
                        return new jop(jtcVar);
                }
            }
        });
        final int i4 = 0;
        iyk.b(jykVar, ern.a(SetRepeatModeCommand.class), new Function0() { // from class: srn
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i4) {
                    case 0:
                        return new dop(jtcVar);
                    default:
                        return new jop(jtcVar);
                }
            }
        });
        iyk.b(jykVar, ern.a(AttractivenessOperationCommand.class), new p1n(16));
        iyk.b(jykVar, ern.a(RebuildQueueOnExplicitChangeCommand.class), new trn(3));
        jyr jyrVar10 = (jyr) crVar.i;
        final c5b c5bVar = (c5b) crVar.h;
        final y3l y3lVar = (y3l) crVar.g;
        jyr jyrVar11 = (jyr) crVar.b;
        jyr jyrVar12 = (jyr) crVar.c;
        jyr jyrVar13 = (jyr) crVar.d;
        jyrVar10.getClass();
        jyrVar11.getClass();
        jyrVar12.getClass();
        jyrVar13.getClass();
        y3lVar.getClass();
        c5bVar.getClass();
        iyk.d(jykVar, ern.a(WaveQueueStartCommand.class), new hgh(jyrVar10, jyrVar11, jyrVar12, jyrVar13, jyrVar9, y3lVar, c5bVar, d0lVar, pr3Var));
        iyk.d(jykVar, ern.a(GenerativeQueueStartCommand.class), new cte(9, y3lVar, c5bVar, d0lVar));
        final jyr jyrVar14 = (jyr) crVar.e;
        jyrVar14.getClass();
        final int i5 = 1;
        iyk.d(jykVar, ern.a(FmQueueStartCommand.class), new Function0() { // from class: joi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return new v6u(jyrVar14, y3lVar, c5bVar, d0lVar);
                    default:
                        return new aoc(jyrVar14, y3lVar, c5bVar, d0lVar);
                }
            }
        });
        final jyr jyrVar15 = (jyr) crVar.f;
        jyrVar15.getClass();
        final int i6 = 0;
        iyk.d(jykVar, ern.a(VideoClipQueueStartCommand.class), new Function0() { // from class: joi
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return new v6u(jyrVar15, y3lVar, c5bVar, d0lVar);
                    default:
                        return new aoc(jyrVar15, y3lVar, c5bVar, d0lVar);
                }
            }
        });
        iyk.a(jykVar, ern.a(SharedGlagolPlaybackCommand$Next.class), new qkp(28));
        iyk.a(jykVar, ern.a(SharedGlagolPlaybackCommand$Back.class), new qkp(29));
        wlw wlwVar = (wlw) k9wVar.a.getValue();
        wlwVar.getClass();
        diw b = wlwVar.b();
        b.getClass();
        iyk.c(jykVar, ern.a(StartYnisonQueueCommand.class), new oxo(21, b));
        iyk.a(jykVar, ern.a(YnisonNavigateCommand$OriginalPosition.class), new h2q(8));
        iyk.a(jykVar, ern.a(YnisonNavigateCommand$QueuePosition.class), new h2q(9));
        iyk.a(jykVar, ern.a(YnisonNavigateCommand$Next.class), new h2q(10));
        iyk.a(jykVar, ern.a(YnisonNavigateCommand$Back.class), new h2q(11));
        iyk.a(jykVar, ern.a(YnisonOptionCommand$ShuffleToggle.class), new h2q(16));
        iyk.a(jykVar, ern.a(YnisonOptionCommand$ShuffleWithIndices.class), new h2q(5));
        iyk.a(jykVar, ern.a(YnisonOptionCommand$RepeatToggle.class), new h2q(6));
        iyk.a(jykVar, ern.a(YnisonOptionCommand$ReverseToggle.class), new h2q(7));
        iyk.a(jykVar, ern.a(YnisonEditQueueCommand$AddNext.class), new h2q(12));
        iyk.a(jykVar, ern.a(YnisonEditQueueCommand$AddLast.class), new h2q(13));
        iyk.a(jykVar, ern.a(YnisonEditQueueCommand$RemoveAt.class), new h2q(14));
        iyk.a(jykVar, ern.a(YnisonEditQueueCommand$Move.class), new h2q(15));
        iyk.d(jykVar, ern.a(StartQueueCommand.class), new nxv(18));
        iyk.c(jykVar, ern.a(StartLegacyGlagolQueueBasicCommand.class), new nxv(19));
        iyk.d(jykVar, ern.a(StartQueueIntoYnisonRemoteCommandOld.class), new nxv(20));
        iyk.d(jykVar, ern.a(LaunchGlagolCommandOld.class), new nxv(21));
        iyk.c(jykVar, ern.a(LaunchGlagolCommand.class), new nxv(22));
        iyk.c(jykVar, ern.a(StartQueueIntoYnisonRemoteCommand.class), new dxv(13, k9wVar));
        iyk.c(jykVar, ern.a(DoNotLaunchCommand.class), new nxv(23));
        iyk.a(jykVar, ern.a(RestartTrackCommand.class), new gtb(k9wVar.h, k9wVar.i, k9wVar.j, 1));
        ox6.B(new f9l(12, new p6o(f7lVar.c, 13)), e, new y2q(qqsVar, p9wVar, this));
        ox6.B(new f9l(13, new p6o(f7lVar.d, 14)), e, new y2q(this, p9wVar));
        x97.y(e, null, null, new v24(luuVar, f4mVar, this, continuation, 12), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        gld.L(this.b, null);
        x97.D(g.a, new z2q(this, null, 1));
    }
}
