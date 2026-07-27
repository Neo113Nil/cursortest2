package kotlin.text;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishGsonParcelable implements CatchingFishMVIGoogleMaps {
    public final CatchingFishHandlerMVP CatchingFishDaggerWebsocket;
    public final /* synthetic */ int CatchingFishReduxKtor;

    public /* synthetic */ CatchingFishGsonParcelable(CatchingFishHandlerMVP catchingFishHandlerMVP, int i) {
        this.CatchingFishReduxKtor = i;
        this.CatchingFishDaggerWebsocket = catchingFishHandlerMVP;
    }

    @Override // kotlin.text.CatchingFishHandlerMVP
    public final Object get() {
        switch (this.CatchingFishReduxKtor) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                String packageName = ((Context) this.CatchingFishDaggerWebsocket.get()).getPackageName();
                if (packageName != null) {
                    return packageName;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            default:
                return new CatchingFishWebsocketHilt(Integer.valueOf(CatchingFishWebsocketHilt.CatchingFishViewModelScope).intValue(), (Context) this.CatchingFishDaggerWebsocket.get(), "com.google.android.datatransport.events");
        }
    }
}
