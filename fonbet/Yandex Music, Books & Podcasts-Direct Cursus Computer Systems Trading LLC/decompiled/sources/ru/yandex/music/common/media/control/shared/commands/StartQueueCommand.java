package ru.yandex.music.common.media.control.shared.commands;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import defpackage.aa0;
import defpackage.k5r;
import defpackage.v8n;
import defpackage.vz1;
import defpackage.x2q;
import defpackage.xum;
import defpackage.y3l;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001R-\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR%\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\t¨\u0006\u001f"}, d2 = {"Lru/yandex/music/common/media/control/shared/commands/StartQueueCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Substituting;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lv8n;", "", "queueDescriptor", "Lkotlin/jvm/functions/Function1;", "e", "()Lkotlin/jvm/functions/Function1;", "", "playWhenReady", "Z", "d", "()Z", "continuation", "a", "Ly3l;", "queueStartValidator", "Ly3l;", "f", "()Ly3l;", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/jvm/functions/Function0;", "c", "()Lkotlin/jvm/functions/Function0;", "", "onError", "b", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class StartQueueCommand implements PlaybackCommand$QueueLaunch.Substituting {
    private final boolean continuation;
    private final Function1<Throwable, Unit> onError;
    private final Function0<Unit> onSuccess;
    private final boolean playWhenReady;

    @NotNull
    private final Function1<Continuation<? super v8n>, Object> queueDescriptor;

    @NotNull
    private final y3l queueStartValidator;

    public StartQueueCommand(aa0 aa0Var, boolean z, boolean z2, y3l y3lVar, x2q x2qVar, xum xumVar) {
        y3lVar.getClass();
        this.queueDescriptor = aa0Var;
        this.playWhenReady = z;
        this.continuation = z2;
        this.queueStartValidator = y3lVar;
        this.onSuccess = x2qVar;
        this.onError = xumVar;
    }

    /* renamed from: a, reason: from getter */
    public final boolean getContinuation() {
        return this.continuation;
    }

    /* renamed from: b, reason: from getter */
    public final Function1 getOnError() {
        return this.onError;
    }

    /* renamed from: c, reason: from getter */
    public final Function0 getOnSuccess() {
        return this.onSuccess;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* renamed from: e, reason: from getter */
    public final Function1 getQueueDescriptor() {
        return this.queueDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartQueueCommand)) {
            return false;
        }
        StartQueueCommand startQueueCommand = (StartQueueCommand) obj;
        return Intrinsics.d(this.queueDescriptor, startQueueCommand.queueDescriptor) && this.playWhenReady == startQueueCommand.playWhenReady && this.continuation == startQueueCommand.continuation && Intrinsics.d(this.queueStartValidator, startQueueCommand.queueStartValidator) && Intrinsics.d(this.onSuccess, startQueueCommand.onSuccess) && Intrinsics.d(this.onError, startQueueCommand.onError);
    }

    /* renamed from: f, reason: from getter */
    public final y3l getQueueStartValidator() {
        return this.queueStartValidator;
    }

    public final int hashCode() {
        int hashCode = (this.queueStartValidator.hashCode() + k5r.e(k5r.e(this.queueDescriptor.hashCode() * 31, 31, this.playWhenReady), 31, this.continuation)) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onError;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return vz1.q("StartQueueCommand(playWhenReady=", ")", this.playWhenReady);
    }
}
