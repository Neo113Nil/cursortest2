package ru.yandex.video.m3.player.utils;

import defpackage.sls;
import java.util.concurrent.Future;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a)\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0003\u0010\u0007¨\u0006\b"}, d2 = {"T", "value", "Ljava/util/concurrent/Future;", "future", "(Ljava/lang/Object;)Ljava/util/concurrent/Future;", "Lkotlin/Function0;", "function", "(Lsls;)Ljava/util/concurrent/Future;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FutureExtensions {
    public static final <T> Future<T> future(final T t) {
        return new FutureCallable(new sls() { // from class: ru.yandex.video.m3.player.utils.FutureExtensions$future$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.sls
            public final T invoke() {
                return t;
            }
        });
    }

    public static /* synthetic */ Future future$default(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return future(obj);
    }

    public static final <T> Future<T> future() {
        return future$default(null, 1, null);
    }

    public static final <T> Future<T> future(sls slsVar) {
        return new FutureCallable(slsVar);
    }
}
