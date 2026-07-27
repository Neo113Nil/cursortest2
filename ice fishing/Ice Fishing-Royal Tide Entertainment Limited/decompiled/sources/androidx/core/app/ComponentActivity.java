package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import kotlin.text.CatchingFishAdMobHandler;
import kotlin.text.CatchingFishBiometricBundle;
import kotlin.text.CatchingFishFABGraphQL;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishHiltContext;
import kotlin.text.CatchingFishToastFlux;
import kotlin.text.CatchingFishToolbarToast;

/* loaded from: classes.dex */
public class ComponentActivity extends Activity implements CatchingFishToastFlux, CatchingFishFABGraphQL {
    public final CatchingFishToolbarToast CatchingFishReduxKtor = new CatchingFishToolbarToast(this);

    public CatchingFishToolbarToast CatchingFishDaggerWebsocket() {
        return this.CatchingFishReduxKtor;
    }

    @Override // kotlin.text.CatchingFishFABGraphQL
    public final boolean CatchingFishSnackbar(KeyEvent keyEvent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        if (CatchingFishBiometricBundle.CatchingFishCloudMessaging(decorView, keyEvent)) {
            return true;
        }
        return CatchingFishBiometricBundle.CatchingFishEspressoTesting(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        CatchingFishFirebaseDagger.CatchingFishRoomDatabase(decorView, "getDecorView(...)");
        if (CatchingFishBiometricBundle.CatchingFishCloudMessaging(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = CatchingFishAdMobHandler.CatchingFishDaggerWebsocket;
        CatchingFishHiltContext.CatchingFishSnackbar(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(bundle, "outState");
        this.CatchingFishReduxKtor.CatchingFishViewModelScope();
        super.onSaveInstanceState(bundle);
    }
}
