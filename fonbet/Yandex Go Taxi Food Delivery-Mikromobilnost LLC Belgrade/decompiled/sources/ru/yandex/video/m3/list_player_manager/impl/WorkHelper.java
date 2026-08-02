package ru.yandex.video.m3.list_player_manager.impl;

import defpackage.l8x;
import defpackage.noh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.yko;
import kotlin.Metadata;
import ru.yandex.video.m3.player.utils.coroutine.CoroutineQueue;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\u00020\u000e2\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0015\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00112\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u0015\u0010\u0010J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u00112\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\n¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/yandex/video/m3/list_player_manager/impl/WorkHelper;", "", "Lyko;", "dispatcher", "Lru/yandex/video/m3/player/utils/coroutine/CoroutineQueue;", "queue", "Ltse;", "scope", "<init>", "(Lyko;Lru/yandex/video/m3/player/utils/coroutine/CoroutineQueue;Ltse;)V", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lzy11;", "block", "Ll8x;", "queueLaunchWork", "(Lwls;)Ll8x;", "T", "Lnoh;", "queueAsyncWork", "(Lwls;)Lnoh;", "launch", "async", "Lyko;", "Lru/yandex/video/m3/player/utils/coroutine/CoroutineQueue;", "Ltse;", "getScope", "()Ltse;", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkHelper {
    private final yko dispatcher;
    private final CoroutineQueue queue;
    private final tse scope;
    public static final int $stable = 8;

    public WorkHelper(yko ykoVar, CoroutineQueue coroutineQueue, tse tseVar) {
        this.dispatcher = ykoVar;
        this.queue = coroutineQueue;
        this.scope = tseVar;
    }

    public final <T> noh async(wls block) {
        return tje.h(this.scope, null, null, new WorkHelper$async$1(this, block, null), 3);
    }

    public final tse getScope() {
        return this.scope;
    }

    public final <T> l8x launch(wls block) {
        return tje.N(this.scope, null, null, new WorkHelper$launch$1(this, block, null), 3);
    }

    public final <T> noh queueAsyncWork(wls block) {
        return CoroutineQueue.async$default(this.queue, null, new WorkHelper$queueAsyncWork$1(this, block, null), 1, null);
    }

    public final l8x queueLaunchWork(wls block) {
        return CoroutineQueue.launch$default(this.queue, null, new WorkHelper$queueLaunchWork$1(this, block, null), 1, null);
    }
}
