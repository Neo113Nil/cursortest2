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

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001R-\u0010\u0006\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R%\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0007\u001a\u0004\b\u001c\u0010\t¨\u0006\u001d"}, d2 = {"Lru/yandex/music/common/media/control/shared/commands/StartQueueIntoYnisonRemoteCommandOld;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Substituting;", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "Lv8n;", "", "queueDescriptor", "Lkotlin/jvm/functions/Function1;", "d", "()Lkotlin/jvm/functions/Function1;", "", "playWhenReady", "Z", "c", "()Z", "Ly3l;", "queueStartValidator", "Ly3l;", "e", "()Ly3l;", "Lkotlin/Function0;", "", "onSuccess", "Lkotlin/jvm/functions/Function0;", "b", "()Lkotlin/jvm/functions/Function0;", "", "onError", "a", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final /* data */ class StartQueueIntoYnisonRemoteCommandOld implements PlaybackCommand$QueueLaunch.Substituting {
    private final Function1<Throwable, Unit> onError;
    private final Function0<Unit> onSuccess;
    private final boolean playWhenReady;

    @NotNull
    private final Function1<Continuation<? super v8n>, Object> queueDescriptor;

    @NotNull
    private final y3l queueStartValidator;

    public StartQueueIntoYnisonRemoteCommandOld(aa0 aa0Var, boolean z, y3l y3lVar, x2q x2qVar, xum xumVar) {
        y3lVar.getClass();
        this.queueDescriptor = aa0Var;
        this.playWhenReady = z;
        this.queueStartValidator = y3lVar;
        this.onSuccess = x2qVar;
        this.onError = xumVar;
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
        if (!(obj instanceof StartQueueIntoYnisonRemoteCommandOld)) {
            return false;
        }
        StartQueueIntoYnisonRemoteCommandOld startQueueIntoYnisonRemoteCommandOld = (StartQueueIntoYnisonRemoteCommandOld) obj;
        return Intrinsics.d(this.queueDescriptor, startQueueIntoYnisonRemoteCommandOld.queueDescriptor) && this.playWhenReady == startQueueIntoYnisonRemoteCommandOld.playWhenReady && Intrinsics.d(this.queueStartValidator, startQueueIntoYnisonRemoteCommandOld.queueStartValidator) && Intrinsics.d(this.onSuccess, startQueueIntoYnisonRemoteCommandOld.onSuccess) && Intrinsics.d(this.onError, startQueueIntoYnisonRemoteCommandOld.onError);
    }

    public final int hashCode() {
        int hashCode = (this.queueStartValidator.hashCode() + k5r.e(this.queueDescriptor.hashCode() * 31, 31, this.playWhenReady)) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int hashCode2 = (hashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<Throwable, Unit> function1 = this.onError;
        return hashCode2 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        return vz1.q("StartQueueIntoYnisonRemoteCommandOld(playWhenReady=", ")", this.playWhenReady);
    }
}
