package ru.yandex.taxi.stories.domain.notifications;

import defpackage.jl40;
import defpackage.zy11;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;

/* loaded from: classes10.dex */
public final class a {
    public final ru.yandex.taxi.stories.domain.provider.a a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public a(ru.yandex.taxi.stories.domain.provider.a aVar) {
        this.a = aVar;
    }

    public final Object a(ContinuationImpl continuationImpl) {
        Object O = jl40.O(new StoriesNotificationsInteractorImpl$notifyStoriesChanged$2(this, null), continuationImpl);
        return O == CoroutineSingletons.COROUTINE_SUSPENDED ? O : zy11.a;
    }

    public final n b(String str) {
        return new n(e.g(new StoriesNotificationsInteractorImpl$storiesChangeFlow$1(this, str, null)), new StoriesNotificationsInteractorImpl$storiesChangeFlow$2(this, str, null));
    }
}
