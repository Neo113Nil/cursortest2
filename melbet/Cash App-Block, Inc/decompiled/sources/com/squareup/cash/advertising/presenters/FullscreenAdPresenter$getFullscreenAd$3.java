package com.squareup.cash.advertising.presenters;

import com.squareup.cash.advertising.backend.api.FullscreenAd;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import kotlin.Pair;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class FullscreenAdPresenter$getFullscreenAd$3 extends AdaptedFunctionReference implements Function3 {
    public static final FullscreenAdPresenter$getFullscreenAd$3 INSTANCE = new FullscreenAdPresenter$getFullscreenAd$3(3, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new Pair((FullscreenAd) obj, (FullscreenAdViewModel.Content.AudioStatus) obj2);
    }
}
