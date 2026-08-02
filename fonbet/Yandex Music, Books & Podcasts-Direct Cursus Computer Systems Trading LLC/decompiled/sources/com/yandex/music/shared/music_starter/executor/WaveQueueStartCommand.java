package com.yandex.music.shared.music_starter.executor;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import defpackage.a6l;
import defpackage.k5r;
import defpackage.kzu;
import defpackage.nyn;
import defpackage.nyu;
import defpackage.oyu;
import defpackage.t0q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0004R-\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010'\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010\u001cR#\u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u0007\u001a\u0004\b,\u0010\t¨\u0006-"}, d2 = {"Lcom/yandex/music/shared/music_starter/executor/WaveQueueStartCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Substituting;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lkzu;", "", "initialPlayablesProvider", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "Loyu;", "waveSessionInfo", "Loyu;", "g", "()Loyu;", "Lnyn;", "repeatModeType", "Lnyn;", "f", "()Lnyn;", "", "isShuffleEnabled", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "playWhenReady", "Z", "e", "()Z", "La6l;", "startUiAttributes", "La6l;", "getStartUiAttributes", "()La6l;", "Lt0q;", "initialFade", "Lt0q;", "b", "()Lt0q;", "inSecondaryQueue", "a", "", "", "onError", "d", "shared-music-starter"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final /* data */ class WaveQueueStartCommand implements PlaybackCommand$QueueLaunch.Substituting {
    private final boolean inSecondaryQueue;

    @NotNull
    private final t0q initialFade;

    @NotNull
    private final Function1<Continuation<? super kzu>, Object> initialPlayablesProvider;
    private final Boolean isShuffleEnabled;

    @NotNull
    private final Function1<Throwable, Unit> onError;
    private final boolean playWhenReady;
    private final nyn repeatModeType;

    @NotNull
    private final a6l startUiAttributes;

    @NotNull
    private final oyu waveSessionInfo;

    public WaveQueueStartCommand(Function1 function1, nyu nyuVar, nyn nynVar, Boolean bool, boolean z, a6l a6lVar, t0q t0qVar, boolean z2, Function1 function12) {
        this.initialPlayablesProvider = function1;
        this.waveSessionInfo = nyuVar;
        this.repeatModeType = nynVar;
        this.isShuffleEnabled = bool;
        this.playWhenReady = z;
        this.startUiAttributes = a6lVar;
        this.initialFade = t0qVar;
        this.inSecondaryQueue = z2;
        this.onError = function12;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getInSecondaryQueue() {
        return this.inSecondaryQueue;
    }

    /* renamed from: b, reason: from getter */
    public final t0q getInitialFade() {
        return this.initialFade;
    }

    /* renamed from: c, reason: from getter */
    public final Function1 getInitialPlayablesProvider() {
        return this.initialPlayablesProvider;
    }

    /* renamed from: d, reason: from getter */
    public final Function1 getOnError() {
        return this.onError;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WaveQueueStartCommand)) {
            return false;
        }
        WaveQueueStartCommand waveQueueStartCommand = (WaveQueueStartCommand) obj;
        return Intrinsics.d(this.initialPlayablesProvider, waveQueueStartCommand.initialPlayablesProvider) && Intrinsics.d(this.waveSessionInfo, waveQueueStartCommand.waveSessionInfo) && this.repeatModeType == waveQueueStartCommand.repeatModeType && Intrinsics.d(this.isShuffleEnabled, waveQueueStartCommand.isShuffleEnabled) && this.playWhenReady == waveQueueStartCommand.playWhenReady && Intrinsics.d(this.startUiAttributes, waveQueueStartCommand.startUiAttributes) && Intrinsics.d(this.initialFade, waveQueueStartCommand.initialFade) && this.inSecondaryQueue == waveQueueStartCommand.inSecondaryQueue && Intrinsics.d(this.onError, waveQueueStartCommand.onError);
    }

    /* renamed from: f, reason: from getter */
    public final nyn getRepeatModeType() {
        return this.repeatModeType;
    }

    /* renamed from: g, reason: from getter */
    public final oyu getWaveSessionInfo() {
        return this.waveSessionInfo;
    }

    /* renamed from: h, reason: from getter */
    public final Boolean getIsShuffleEnabled() {
        return this.isShuffleEnabled;
    }

    public final int hashCode() {
        int hashCode = (this.waveSessionInfo.hashCode() + (this.initialPlayablesProvider.hashCode() * 31)) * 31;
        nyn nynVar = this.repeatModeType;
        int hashCode2 = (hashCode + (nynVar == null ? 0 : nynVar.hashCode())) * 31;
        Boolean bool = this.isShuffleEnabled;
        return this.onError.hashCode() + k5r.e((this.initialFade.hashCode() + ((this.startUiAttributes.hashCode() + k5r.e((hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31, 31, this.playWhenReady)) * 31)) * 31, 31, this.inSecondaryQueue);
    }

    public final String toString() {
        return "WaveQueueStartCommand(initialPlayablesProvider=" + this.initialPlayablesProvider + ", waveSessionInfo=" + this.waveSessionInfo + ", repeatModeType=" + this.repeatModeType + ", isShuffleEnabled=" + this.isShuffleEnabled + ", playWhenReady=" + this.playWhenReady + ", startUiAttributes=" + this.startUiAttributes + ", initialFade=" + this.initialFade + ", inSecondaryQueue=" + this.inSecondaryQueue + ", onError=" + this.onError + ")";
    }
}
