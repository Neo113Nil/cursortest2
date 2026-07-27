package kotlin.text;

import android.os.Process;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishFABXMLLayout implements Runnable {
    public final Runnable CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishFABXMLLayout(Runnable runnable, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                try {
                    this.CatchingFishDaggerWebsocket.run();
                    break;
                } catch (Exception unused) {
                    CatchingFishToastHiltBundle.CatchingFishSpannableWidget("Executor");
                    return;
                }
            case 1:
                this.CatchingFishDaggerWebsocket.run();
                break;
            default:
                Process.setThreadPriority(0);
                this.CatchingFishDaggerWebsocket.run();
                break;
        }
    }

    public String toString() {
        switch (this.CatchingFishReduxKtor) {
            case 1:
                return this.CatchingFishDaggerWebsocket.toString();
            default:
                return super.toString();
        }
    }
}
