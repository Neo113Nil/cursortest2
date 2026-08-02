package com.squareup.cash.profile.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import com.squareup.cash.profile.screens.OpenSourceScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class ProfileUiFactory implements UiFactory {

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public static final MetroFactory INSTANCE$1 = new MetroFactory(1);
        public static final MetroFactory INSTANCE = new MetroFactory(0);
        public static final MetroFactory INSTANCE$2 = new MetroFactory(2);

        public /* synthetic */ MetroFactory(int i) {
            this.$r8$classId = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            switch (this.$r8$classId) {
                case 0:
                    return new ProfileUiFactory();
                case 1:
                    return new ProfilePhotoUrlRegistry();
                default:
                    return new ProfileUnavailableViewFactory();
            }
        }
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (screen instanceof ProfileScreens.EnableAliasSheetScreen) {
            return new UiFactory.ComposeUi(BadgeNameKt.lambda$2072434502);
        }
        if (screen instanceof OpenSourceScreen) {
            return new UiFactory.ComposeUi(BadgeNameKt.lambda$290178986);
        }
        return null;
    }
}
