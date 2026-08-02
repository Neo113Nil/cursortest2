package com.squareup.cash.education.stories.views;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.education.stories.screens.EducationStoryScreen;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.paymentpad.views.PaymentPadUiFactory$$ExternalSyntheticLambda1;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class EducationStoryViewsFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new EducationStoryViewsFactory();
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof EducationStoryScreen) {
            return new UiFactory.ComposeUi(new ComposableLambdaImpl(new PaymentPadUiFactory$$ExternalSyntheticLambda1(1, screen), true, 907062767));
        }
        if (screen instanceof EducationStoryViewPagerScreen) {
            return new UiFactory.ComposeUi(new ComposableLambdaImpl(new PaymentPadUiFactory$$ExternalSyntheticLambda1(2, screen), true, -1713524424));
        }
        return null;
    }
}
