package ru.yandex.music.glagol.legacy;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import defpackage.k5r;
import defpackage.y3l;
import defpackage.z1q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/yandex/music/glagol/legacy/StartLegacyGlagolQueueBasicCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Basic;", "Lz1q;", "queue", "Lz1q;", "d", "()Lz1q;", "", "playWhenReady", "Z", "c", "()Z", "Ly3l;", "queueStartValidator", "Ly3l;", "e", "()Ly3l;", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "", "onError", "Lkotlin/jvm/functions/Function1;", "a", "()Lkotlin/jvm/functions/Function1;", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class StartLegacyGlagolQueueBasicCommand implements PlaybackCommand$QueueLaunch.Basic {
    private final Function1<Throwable, Unit> onError;
    private final Function0<Unit> onSuccess;
    private final boolean playWhenReady;

    @NotNull
    private final z1q queue;
    private final y3l queueStartValidator;

    public StartLegacyGlagolQueueBasicCommand(z1q z1qVar, boolean z, y3l y3lVar, Function0 function0, Function1 function1) {
        this.queue = z1qVar;
        this.playWhenReady = z;
        this.queueStartValidator = y3lVar;
        this.onSuccess = function0;
        this.onError = function1;
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
    public final z1q getQueue() {
        return this.queue;
    }

    /* renamed from: e, reason: from getter */
    public final y3l getQueueStartValidator() {
        return this.queueStartValidator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartLegacyGlagolQueueBasicCommand)) {
            return false;
        }
        StartLegacyGlagolQueueBasicCommand startLegacyGlagolQueueBasicCommand = (StartLegacyGlagolQueueBasicCommand) obj;
        return Intrinsics.d(this.queue, startLegacyGlagolQueueBasicCommand.queue) && this.playWhenReady == startLegacyGlagolQueueBasicCommand.playWhenReady && Intrinsics.d(this.queueStartValidator, startLegacyGlagolQueueBasicCommand.queueStartValidator) && Intrinsics.d(this.onSuccess, startLegacyGlagolQueueBasicCommand.onSuccess) && Intrinsics.d(this.onError, startLegacyGlagolQueueBasicCommand.onError);
    }

    public final int hashCode() {
        int e = k5r.e(this.queue.hashCode() * 31, 31, this.playWhenReady);
        y3l y3lVar = this.queueStartValidator;
        int hashCode = (e + (y3lVar == null ? 0 : y3lVar.hashCode())) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onError;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return "StartLegacyQueueBasicCommand(queue=" + this.queue + ", playWhenReady=" + this.playWhenReady + ")";
    }
}
