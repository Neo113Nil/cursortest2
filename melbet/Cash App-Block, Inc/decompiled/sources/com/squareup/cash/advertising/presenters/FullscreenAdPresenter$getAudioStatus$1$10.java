package com.squareup.cash.advertising.presenters;

import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* loaded from: classes5.dex */
public final /* synthetic */ class FullscreenAdPresenter$getAudioStatus$1$10 extends AdaptedFunctionReference implements Function3 {
    public static final FullscreenAdPresenter$getAudioStatus$1$10 INSTANCE = new FullscreenAdPresenter$getAudioStatus$1$10(3, FullscreenAdViewModel.Content.AudioStatus.class, "<init>", "<init>(ZZ)V", 4);

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new FullscreenAdViewModel.Content.AudioStatus(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
    }
}
