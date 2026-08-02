package com.squareup.cash.persona.views;

import android.content.Context;
import android.view.ViewGroup;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.ViewFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import dev.zacsweers.metro.internal.Factory;

/* loaded from: classes.dex */
public final class PersonaDidvViewsFactory implements ViewFactory {

    public final class MetroFactory implements Factory {
        public static final MetroFactory INSTANCE = new MetroFactory();

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return new PersonaDidvViewsFactory();
        }
    }

    @Override // app.cash.broadway.ui.ViewFactory
    public final ViewFactory.ScreenView createView(Screen screen, Context context, ViewGroup viewGroup) {
        context.getClass();
        if (!(screen instanceof BlockersScreens.PersonaDidvScreen)) {
            return null;
        }
        PersonaDidvView personaDidvView = new PersonaDidvView(context);
        return new ViewFactory.ScreenView(personaDidvView, personaDidvView);
    }
}
