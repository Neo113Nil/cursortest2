package ru.yandex.video.m3.player.utils.coroutine;

import defpackage.fse;
import defpackage.g050;
import defpackage.g221;
import defpackage.gtq0;
import defpackage.jse;
import defpackage.l8x;
import defpackage.mdh;
import defpackage.noh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\r\u0010\u000eJG\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\"\u0004\b\u0000\u0010\u000f2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/yandex/video/m3/player/utils/coroutine/CoroutineQueue;", "", "Ltse;", "scope", "<init>", "(Ltse;)V", "Lfse;", "context", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lzy11;", "block", "Ll8x;", "launch", "(Lfse;Lwls;)Ll8x;", "T", "Lnoh;", "async", "(Lfse;Lwls;)Lnoh;", "Ltse;", "Ljse;", "limitedIoDispatcher", "Ljse;", "Lg050;", "mutex", "Lg050;", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CoroutineQueue {
    public static final int $stable = 8;
    private final jse limitedIoDispatcher;
    private final g050 mutex;
    private final tse scope;

    public CoroutineQueue(tse tseVar) {
        this.scope = tseVar;
        sjh sjhVar = uyj.a;
        mdh.b.getClass();
        this.limitedIoDispatcher = g221.b.P(1);
        this.mutex = gtq0.a();
    }

    public static /* synthetic */ noh async$default(CoroutineQueue coroutineQueue, fse fseVar, wls wlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        return coroutineQueue.async(fseVar, wlsVar);
    }

    public static /* synthetic */ l8x launch$default(CoroutineQueue coroutineQueue, fse fseVar, wls wlsVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fseVar = EmptyCoroutineContext.a;
        }
        return coroutineQueue.launch(fseVar, wlsVar);
    }

    public final <T> noh async(fse context, wls block) {
        return tje.h(this.scope, context.plus(this.limitedIoDispatcher), null, new CoroutineQueue$async$1(this, block, null), 2);
    }

    public final l8x launch(fse context, wls block) {
        return tje.N(this.scope, context.plus(this.limitedIoDispatcher), null, new CoroutineQueue$launch$1(this, block, null), 2);
    }
}
