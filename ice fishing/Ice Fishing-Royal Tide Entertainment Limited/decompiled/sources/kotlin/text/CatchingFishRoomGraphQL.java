package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishRoomGraphQL extends CatchingFishViewWebsocket implements CatchingFishMockkView {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishFABAndroidX[] CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishRoomGraphQL(CatchingFishFABAndroidX[] catchingFishFABAndroidXArr, int i) {
        super(2);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishFABAndroidXArr;
    }

    @Override // kotlin.text.CatchingFishMockkView
    public final Object CatchingFishDaggerWebsocket(Object obj, Object obj2) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return Float.valueOf(CatchingFishLayoutRoom.CatchingFishReduxKtor((CatchingFishEspressoViewFAB) obj, true, this.CatchingFishWorkManager, ((Number) obj2).floatValue()));
            default:
                return Float.valueOf(CatchingFishLayoutRoom.CatchingFishReduxKtor((CatchingFishEspressoViewFAB) obj, false, this.CatchingFishWorkManager, ((Number) obj2).floatValue()));
        }
    }
}
