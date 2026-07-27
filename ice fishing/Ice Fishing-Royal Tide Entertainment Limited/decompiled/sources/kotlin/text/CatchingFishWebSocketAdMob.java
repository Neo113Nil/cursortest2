package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class CatchingFishWebSocketAdMob implements CatchingFishBundleKtor {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ CatchingFishToastSharedFlow CatchingFishSnackbar;

    public /* synthetic */ CatchingFishWebSocketAdMob(CatchingFishToastSharedFlow catchingFishToastSharedFlow, int i) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = catchingFishToastSharedFlow;
    }

    @Override // kotlin.text.CatchingFishBundleKtor
    public final void CatchingFishParcelableFAB(Object obj) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                CatchingFishToastSharedFlow catchingFishToastSharedFlow = this.CatchingFishSnackbar;
                CatchingFishUnitTestingFAB catchingFishUnitTestingFAB = (CatchingFishUnitTestingFAB) catchingFishToastSharedFlow.CatchingFishMVPRobolectric.pollFirst();
                if (catchingFishUnitTestingFAB != null) {
                    catchingFishToastSharedFlow.CatchingFishCoroutine.CatchingFishCloudMessaging(catchingFishUnitTestingFAB.CatchingFishReduxKtor);
                    break;
                }
                break;
            case 1:
                CatchingFishToolbar catchingFishToolbar = (CatchingFishToolbar) obj;
                CatchingFishToastSharedFlow catchingFishToastSharedFlow2 = this.CatchingFishSnackbar;
                CatchingFishUnitTestingFAB catchingFishUnitTestingFAB2 = (CatchingFishUnitTestingFAB) catchingFishToastSharedFlow2.CatchingFishMVPRobolectric.pollFirst();
                if (catchingFishUnitTestingFAB2 != null) {
                    String str = catchingFishUnitTestingFAB2.CatchingFishReduxKtor;
                    int i2 = catchingFishUnitTestingFAB2.CatchingFishDaggerWebsocket;
                    CatchingFishGoogleMapsMoshi CatchingFishCloudMessaging = catchingFishToastSharedFlow2.CatchingFishCoroutine.CatchingFishCloudMessaging(str);
                    if (CatchingFishCloudMessaging != null) {
                        CatchingFishCloudMessaging.CatchingFishStateLiveData(i2, catchingFishToolbar.CatchingFishReduxKtor, catchingFishToolbar.CatchingFishDaggerWebsocket);
                        break;
                    }
                }
                break;
            default:
                CatchingFishToolbar catchingFishToolbar2 = (CatchingFishToolbar) obj;
                CatchingFishToastSharedFlow catchingFishToastSharedFlow3 = this.CatchingFishSnackbar;
                CatchingFishUnitTestingFAB catchingFishUnitTestingFAB3 = (CatchingFishUnitTestingFAB) catchingFishToastSharedFlow3.CatchingFishMVPRobolectric.pollFirst();
                if (catchingFishUnitTestingFAB3 != null) {
                    String str2 = catchingFishUnitTestingFAB3.CatchingFishReduxKtor;
                    int i3 = catchingFishUnitTestingFAB3.CatchingFishDaggerWebsocket;
                    CatchingFishGoogleMapsMoshi CatchingFishCloudMessaging2 = catchingFishToastSharedFlow3.CatchingFishCoroutine.CatchingFishCloudMessaging(str2);
                    if (CatchingFishCloudMessaging2 != null) {
                        CatchingFishCloudMessaging2.CatchingFishStateLiveData(i3, catchingFishToolbar2.CatchingFishReduxKtor, catchingFishToolbar2.CatchingFishDaggerWebsocket);
                        break;
                    }
                }
                break;
        }
    }
}
