package com.yandex.music.shared.wave.domain.commands;

import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.wave.api.StartWaveQueueCommand;
import defpackage.ern;
import defpackage.fyu;
import defpackage.gxj;
import defpackage.iyk;
import defpackage.j2t;
import defpackage.jvu;
import defpackage.jyk;
import defpackage.jyr;
import defpackage.k1l;
import defpackage.nyn;
import defpackage.s9p;
import defpackage.t4d;
import defpackage.t5l;
import defpackage.uoh;
import defpackage.wuu;
import defpackage.z4c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class d {
    public static final d a = new d();

    public static void h(jyk jykVar, jyr jyrVar, uoh uohVar, j2t j2tVar, jyr jyrVar2, k1l k1lVar, k1l k1lVar2, t5l t5lVar, z4c z4cVar) {
        jyrVar.getClass();
        z4cVar.getClass();
        iyk.c(jykVar, ern.a(StartWaveQueueCommand.class), new t4d(jyrVar, uohVar, j2tVar, jyrVar2, k1lVar, k1lVar2, t5lVar));
        iyk.b(jykVar, ern.a(WaveQueueCommandsFactory$Next.class), new wuu(5));
        iyk.b(jykVar, ern.a(WaveQueueCommandsFactory$Prev.class), new wuu(6));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$SetQueuePosition.class), new wuu(7));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$SetOriginalPosition.class), new wuu(8));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$AddPlayablesAsNext.class), new wuu(9));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$AddPlayablesAsLast.class), new wuu(10));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$RemovePlayable.class), new wuu(11));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$MovePlayable.class), new wuu(12));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$SetShuffle.class), new wuu(13));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$SetQueue.class), new wuu(14));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync.class), new wuu(15));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$SetReverse.class), new wuu(16));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$SetRepeatMode.class), new wuu(17));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$Like.class), new wuu(18));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$UndoLike.class), new wuu(19));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$UndoDislike.class), new wuu(20));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$RebuildOnExplicitChange.class), new wuu(21));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$BroadcastQueueFallbackToBeginning.class), new jvu(2, z4cVar));
        iyk.a(jykVar, ern.a(WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline.class), new wuu(4));
    }

    public final PlaybackCommand$QueueBound.Basic a(List list) {
        list.getClass();
        return new WaveQueueCommandsFactory$AddPlayablesAsLast(list);
    }

    public final PlaybackCommand$QueueBound.Basic b(List list) {
        list.getClass();
        return new WaveQueueCommandsFactory$AddPlayablesAsNext(list);
    }

    public final PlaybackCommand$QueueBound.Basic c(s9p s9pVar) {
        return new WaveQueueCommandsFactory$EnqueueRebuildWithSeedsIfActiveAndHasSessionButNotOffline(s9pVar);
    }

    public final PlaybackCommand$QueueBound.Basic d() {
        return WaveQueueCommandsFactory$LaunchProlongationIfNeededAsync.INSTANCE;
    }

    public final PlaybackCommand$QueueBound.Basic e() {
        return WaveQueueCommandsFactory$Like.INSTANCE;
    }

    public final PlaybackCommand$QueueBound.Basic f(int i, int i2) {
        return new WaveQueueCommandsFactory$MovePlayable(i, i2);
    }

    public final PlaybackCommand$QueueBound.Basic g() {
        return WaveQueueCommandsFactory$RebuildOnExplicitChange.INSTANCE;
    }

    public final PlaybackCommand$QueueBound.Basic i(int i) {
        return new WaveQueueCommandsFactory$RemovePlayable(i);
    }

    public final PlaybackCommand$QueueBound.Basic j(ArrayList arrayList, fyu fyuVar, ArrayList arrayList2, int i, int i2) {
        return new WaveQueueCommandsFactory$SetQueue(arrayList, fyuVar, arrayList2, i, i2);
    }

    public final PlaybackCommand$QueueBound.Basic k(nyn nynVar) {
        nynVar.getClass();
        return new WaveQueueCommandsFactory$SetRepeatMode(nynVar);
    }

    public final PlaybackCommand$QueueBound.Basic l(boolean z) {
        return new WaveQueueCommandsFactory$SetReverse(z);
    }

    public final PlaybackCommand$QueueBound.Basic m(boolean z, gxj gxjVar, List list) {
        return new WaveQueueCommandsFactory$SetShuffle(z, gxjVar, list);
    }

    public final PlaybackCommand$QueueBound.Basic n() {
        return WaveQueueCommandsFactory$UndoDislike.INSTANCE;
    }

    public final PlaybackCommand$QueueBound.Basic o() {
        return WaveQueueCommandsFactory$UndoLike.INSTANCE;
    }
}
