package app.cash.broadway.presenter;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;

/* loaded from: classes.dex */
public interface PresenterFactory {
    Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator);
}
