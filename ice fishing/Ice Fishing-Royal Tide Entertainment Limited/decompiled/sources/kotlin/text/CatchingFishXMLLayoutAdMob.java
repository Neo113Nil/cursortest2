package kotlin.text;

import android.content.Context;
import android.os.UserManager;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class CatchingFishXMLLayoutAdMob implements CatchingFishStateFlowGlide, CatchingFishGlideGsonWidget {
    public final CatchingFishLiveDataHandler CatchingFishCoroutine;
    public final Executor CatchingFishDaggerWebsocket;
    public final CatchingFishWebsocketOkHttp CatchingFishParcelableFAB;
    public final Set CatchingFishReduxKtor;
    public final Context CatchingFishSnackbar;

    public CatchingFishXMLLayoutAdMob(Context context, String str, Set set, CatchingFishLiveDataHandler catchingFishLiveDataHandler, Executor executor) {
        this.CatchingFishParcelableFAB = new CatchingFishWebsocketOkHttp(new CatchingFishXMLLayoutIntent(1, context, str));
        this.CatchingFishReduxKtor = set;
        this.CatchingFishDaggerWebsocket = executor;
        this.CatchingFishCoroutine = catchingFishLiveDataHandler;
        this.CatchingFishSnackbar = context;
    }

    public final CatchingFishWorkManagerMVP CatchingFishParcelableFAB() {
        if (!((UserManager) this.CatchingFishSnackbar.getSystemService(UserManager.class)).isUserUnlocked()) {
            return CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket("");
        }
        return CatchingFishViewMVIMVVM.CatchingFishReduxKtor(this.CatchingFishDaggerWebsocket, new CatchingFishGradleWebsocket(this, 0));
    }

    public final void CatchingFishSnackbar() {
        if (this.CatchingFishReduxKtor.size() <= 0) {
            CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(null);
        } else if (!((UserManager) this.CatchingFishSnackbar.getSystemService(UserManager.class)).isUserUnlocked()) {
            CatchingFishViewMVIMVVM.CatchingFishDaggerWebsocket(null);
        } else {
            CatchingFishViewMVIMVVM.CatchingFishReduxKtor(this.CatchingFishDaggerWebsocket, new CatchingFishGradleWebsocket(this, 1));
        }
    }
}
