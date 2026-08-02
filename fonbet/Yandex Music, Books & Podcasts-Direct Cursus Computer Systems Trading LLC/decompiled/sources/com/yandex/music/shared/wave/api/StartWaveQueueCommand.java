package com.yandex.music.shared.wave.api;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import defpackage.k5r;
import defpackage.k7q;
import defpackage.mzu;
import defpackage.y3l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001R-\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR%\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/yandex/music/shared/wave/api/StartWaveQueueCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Basic;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lk7q;", "", "queueDescriptor", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "Lmzu;", "startRequest", "Lmzu;", "f", "()Lmzu;", "", "playWhenReady", "Z", "c", "()Z", "Ly3l;", "queueStartValidator", "Ly3l;", "e", "()Ly3l;", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "", "onError", "a", "shared-wave"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class StartWaveQueueCommand implements PlaybackCommand$QueueLaunch.Basic {
    private final Function1<Throwable, Unit> onError;
    private final Function0<Unit> onSuccess;
    private final boolean playWhenReady;

    @NotNull
    private final Function1<Continuation<? super k7q>, Object> queueDescriptor;

    @NotNull
    private final y3l queueStartValidator;

    @NotNull
    private final mzu startRequest;

    public StartWaveQueueCommand(Function1 function1, mzu mzuVar, boolean z, y3l y3lVar, Function0 function0, Function1 function12) {
        y3lVar.getClass();
        this.queueDescriptor = function1;
        this.startRequest = mzuVar;
        this.playWhenReady = z;
        this.queueStartValidator = y3lVar;
        this.onSuccess = function0;
        this.onError = function12;
    }

    /* renamed from: a, reason: from getter */
    public final Function1 getOnError() {
        return this.onError;
    }

    /* renamed from: b, reason: from getter */
    public final Function0 getOnSuccess() {
        return this.onSuccess;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* renamed from: d, reason: from getter */
    public final Function1 getQueueDescriptor() {
        return this.queueDescriptor;
    }

    /* renamed from: e, reason: from getter */
    public final y3l getQueueStartValidator() {
        return this.queueStartValidator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartWaveQueueCommand)) {
            return false;
        }
        StartWaveQueueCommand startWaveQueueCommand = (StartWaveQueueCommand) obj;
        return Intrinsics.d(this.queueDescriptor, startWaveQueueCommand.queueDescriptor) && Intrinsics.d(this.startRequest, startWaveQueueCommand.startRequest) && this.playWhenReady == startWaveQueueCommand.playWhenReady && Intrinsics.d(this.queueStartValidator, startWaveQueueCommand.queueStartValidator) && Intrinsics.d(this.onSuccess, startWaveQueueCommand.onSuccess) && Intrinsics.d(this.onError, startWaveQueueCommand.onError);
    }

    /* renamed from: f, reason: from getter */
    public final mzu getStartRequest() {
        return this.startRequest;
    }

    public final int hashCode() {
        int hashCode = (this.queueStartValidator.hashCode() + k5r.e((this.startRequest.hashCode() + (this.queueDescriptor.hashCode() * 31)) * 31, 31, this.playWhenReady)) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onError;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "StartWaveQueueCommand(startRequest=" + this.startRequest + ", playWhenReady=" + this.playWhenReady + ")";
    }
}
