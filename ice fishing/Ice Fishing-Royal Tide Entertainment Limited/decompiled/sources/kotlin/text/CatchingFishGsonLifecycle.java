package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class CatchingFishGsonLifecycle implements Closeable {
    public final long CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;
    public final CatchingFishLayoutFragment CatchingFishWorkManager;

    public /* synthetic */ CatchingFishGsonLifecycle(long j, CatchingFishLayoutFragment catchingFishLayoutFragment, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = j;
        this.CatchingFishWorkManager = catchingFishLayoutFragment;
    }

    public final CatchingFishLayoutFragment CatchingFishCoroutine() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return (CatchingFishAdMobMVVM) this.CatchingFishWorkManager;
            default:
                return (CatchingFishWidgetGradle) this.CatchingFishWorkManager;
        }
    }

    public final long CatchingFishSnackbar() {
        switch (this.CatchingFishReduxKtor) {
        }
        return this.CatchingFishDaggerWebsocket;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CatchingFishEspressoDagger.CatchingFishSnackbar(CatchingFishCoroutine());
    }
}
