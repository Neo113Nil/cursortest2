package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishMVPPicasso implements CatchingFishServiceHandler {
    public final /* synthetic */ Collection CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishMVPPicasso(int i, Collection collection) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = collection;
    }

    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        boolean contains;
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                contains = this.CatchingFishDaggerWebsocket.contains(obj);
                break;
            case 1:
                contains = this.CatchingFishDaggerWebsocket.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.CatchingFishDaggerWebsocket);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
