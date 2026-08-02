package ru.yandex.taxi.notifications;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "ru.yandex.taxi.notifications.ExtendedNotificationImageRefreshInteractor", f = "ExtendedNotificationImageRefreshInteractor.kt", l = {53, 56}, m = "awaitCarImageAndRefresh", v = 2)
/* loaded from: classes6.dex */
final class ExtendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExtendedNotificationImageRefreshInteractor$awaitCarImageAndRefresh$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.d(this.this$0, null, this);
    }
}
