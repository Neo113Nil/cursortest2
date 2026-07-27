package kotlin.text;

import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishExoPlayerKtor extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishExoPlayerKtor(int i, int i2) {
        super(1);
        this.CatchingFishDaggerWebsocket = i2;
        this.CatchingFishWorkManager = i;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Boolean.valueOf(((CatchingFishAppCompatWidget) obj).CatchingFishFragmentFactory(this.CatchingFishWorkManager));
            default:
                return Boolean.valueOf(((View) obj).getId() == this.CatchingFishWorkManager);
        }
    }
}
