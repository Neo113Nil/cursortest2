package com.yandex.music.shared.music_starter.executor;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueLaunch;
import defpackage.a6l;
import defpackage.q9u;
import defpackage.t6u;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010%\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001e0#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcom/yandex/music/shared/music_starter/executor/VideoClipQueueStartCommand;", "Lcom/yandex/music/shared/playback/core/api/commands/PlaybackCommand$QueueLaunch$Substituting;", "", "queueId", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lt6u;", "initialClips", "Lt6u;", "b", "()Lt6u;", "Lq9u;", "startFrom", "Lq9u;", "g", "()Lq9u;", "from", "a", "La6l;", "startUiAttributes", "La6l;", "h", "()La6l;", "", "playWhenReady", "Z", "e", "()Z", "Lkotlin/Function0;", "", "onQueueStarted", "Lkotlin/jvm/functions/Function0;", "d", "()Lkotlin/jvm/functions/Function0;", "Lkotlin/Function1;", "", "onError", "Lkotlin/jvm/functions/Function1;", "c", "()Lkotlin/jvm/functions/Function1;", "shared-music-starter"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class VideoClipQueueStartCommand implements PlaybackCommand$QueueLaunch.Substituting {

    @NotNull
    private final String from = "video-wave";

    @NotNull
    private final t6u initialClips;

    @NotNull
    private final Function1<Throwable, Unit> onError;

    @NotNull
    private final Function0<Unit> onQueueStarted;
    private final boolean playWhenReady;

    @NotNull
    private final String queueId;
    private final q9u startFrom;

    @NotNull
    private final a6l startUiAttributes;

    public VideoClipQueueStartCommand(String str, t6u t6uVar, q9u q9uVar, a6l a6lVar, boolean z, Function0 function0, Function1 function1) {
        this.queueId = str;
        this.initialClips = t6uVar;
        this.startFrom = q9uVar;
        this.startUiAttributes = a6lVar;
        this.playWhenReady = z;
        this.onQueueStarted = function0;
        this.onError = function1;
    }

    /* renamed from: a, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* renamed from: b, reason: from getter */
    public final t6u getInitialClips() {
        return this.initialClips;
    }

    /* renamed from: c, reason: from getter */
    public final Function1 getOnError() {
        return this.onError;
    }

    /* renamed from: d, reason: from getter */
    public final Function0 getOnQueueStarted() {
        return this.onQueueStarted;
    }

    /* renamed from: e, reason: from getter */
    public final boolean getPlayWhenReady() {
        return this.playWhenReady;
    }

    /* renamed from: f, reason: from getter */
    public final String getQueueId() {
        return this.queueId;
    }

    /* renamed from: g, reason: from getter */
    public final q9u getStartFrom() {
        return this.startFrom;
    }

    /* renamed from: h, reason: from getter */
    public final a6l getStartUiAttributes() {
        return this.startUiAttributes;
    }
}
