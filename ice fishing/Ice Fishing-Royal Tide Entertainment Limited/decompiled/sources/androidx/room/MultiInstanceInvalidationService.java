package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.LinkedHashMap;
import kotlin.text.CatchingFishFirebaseDagger;
import kotlin.text.CatchingFishViewToolbar;
import kotlin.text.CatchingFishWidgetPayPal;

/* loaded from: classes.dex */
public final class MultiInstanceInvalidationService extends Service {
    public int CatchingFishReduxKtor;
    public final LinkedHashMap CatchingFishDaggerWebsocket = new LinkedHashMap();
    public final CatchingFishViewToolbar CatchingFishWorkManager = new CatchingFishViewToolbar(this);
    public final CatchingFishWidgetPayPal CatchingFishViewModelScope = new CatchingFishWidgetPayPal(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(intent, "intent");
        return this.CatchingFishViewModelScope;
    }
}
