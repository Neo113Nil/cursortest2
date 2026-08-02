package ru.yandex.video.m3.ab.interactor;

import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/Function1;", "Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractorBuilder;", "Lzy11;", "builderAction", "Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractor;", "DefaultAbConfigInteractor", "(Ltls;)Lru/yandex/video/m3/ab/interactor/DefaultAbConfigInteractor;", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DefaultAbConfigInteractorBuilderKt {
    public static final DefaultAbConfigInteractor DefaultAbConfigInteractor(tls tlsVar) {
        DefaultAbConfigInteractorBuilder defaultAbConfigInteractorBuilder = new DefaultAbConfigInteractorBuilder();
        tlsVar.invoke(defaultAbConfigInteractorBuilder);
        return defaultAbConfigInteractorBuilder.build$video_player_internalRelease();
    }
}
