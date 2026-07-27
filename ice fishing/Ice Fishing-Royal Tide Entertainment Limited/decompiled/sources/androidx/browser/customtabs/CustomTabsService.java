package androidx.browser.customtabs;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import kotlin.text.CatchingFishGraphQLRealmFAB;
import kotlin.text.CatchingFishReduxWebSocket;

/* loaded from: classes.dex */
public abstract class CustomTabsService extends Service {
    public final CatchingFishGraphQLRealmFAB CatchingFishReduxKtor = new CatchingFishGraphQLRealmFAB(0);
    public final CatchingFishReduxWebSocket CatchingFishDaggerWebsocket = new CatchingFishReduxWebSocket(this);

    public abstract boolean CatchingFishCoroutine();

    public abstract boolean CatchingFishDaggerWebsocket();

    public abstract boolean CatchingFishLayout();

    public abstract Bundle CatchingFishParcelableFAB();

    public abstract int CatchingFishReduxKtor();

    public abstract boolean CatchingFishSnackbar();

    public abstract boolean CatchingFishViewModelFAB();

    public abstract boolean CatchingFishViewModelScope();

    public abstract boolean CatchingFishWorkManager();

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.CatchingFishDaggerWebsocket;
    }
}
