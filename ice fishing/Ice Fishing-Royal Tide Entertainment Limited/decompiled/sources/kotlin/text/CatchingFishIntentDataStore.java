package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class CatchingFishIntentDataStore extends CatchingFishMVIBundle implements CatchingFishServiceHandler {
    public Object CatchingFishCloudMessaging;
    public final /* synthetic */ Object CatchingFishEspressoTesting;
    public final /* synthetic */ CatchingFishKtorView CatchingFishFragmentHandler;
    public int CatchingFishLayout;
    public final /* synthetic */ Serializable CatchingFishOkHttp;
    public final /* synthetic */ int CatchingFishViewModelFAB = 1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CatchingFishIntentDataStore(CatchingFishKtorView catchingFishKtorView, CatchingFishManifestMockk catchingFishManifestMockk, CatchingFishMockkView catchingFishMockkView, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(1, catchingFishWebsocketGradle);
        this.CatchingFishFragmentHandler = catchingFishKtorView;
        this.CatchingFishEspressoTesting = catchingFishManifestMockk;
        this.CatchingFishOkHttp = (CatchingFishMVIBundle) catchingFishMockkView;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        CatchingFishWebsocketGradle catchingFishWebsocketGradle = (CatchingFishWebsocketGradle) obj;
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return new CatchingFishIntentDataStore((CatchingFishRoomGoogleMaps) this.CatchingFishEspressoTesting, this.CatchingFishFragmentHandler, (CatchingFishAdMobRoom) this.CatchingFishOkHttp, catchingFishWebsocketGradle).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
            default:
                return new CatchingFishIntentDataStore(this.CatchingFishFragmentHandler, (CatchingFishManifestMockk) this.CatchingFishEspressoTesting, (CatchingFishMockkView) this.CatchingFishOkHttp, catchingFishWebsocketGradle).CatchingFishOkHttp(CatchingFishRealmContext.CatchingFishParcelableFAB);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.text.CatchingFishMVIBundle, kotlin.text.CatchingFishMockkView] */
    @Override // kotlin.text.CatchingFishMoshiCameraX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishOkHttp(Object obj) {
        CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps;
        CatchingFishAdMobRoom catchingFishAdMobRoom;
        CatchingFishMockkStripeAPI catchingFishMockkStripeAPI;
        Object obj2;
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishAdMobRoom catchingFishAdMobRoom2 = (CatchingFishAdMobRoom) this.CatchingFishOkHttp;
                CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps2 = (CatchingFishRoomGoogleMaps) this.CatchingFishEspressoTesting;
                int i = this.CatchingFishLayout;
                CatchingFishKtorView catchingFishKtorView = this.CatchingFishFragmentHandler;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                try {
                } catch (CatchingFishPayPalExoPlayer unused) {
                    Object obj3 = catchingFishRoomGoogleMaps2.CatchingFishReduxKtor;
                    this.CatchingFishCloudMessaging = catchingFishAdMobRoom2;
                    this.CatchingFishLayout = 3;
                    obj = catchingFishKtorView.CatchingFishCloudMessaging(obj3, true, this);
                    if (obj == catchingFishXMLLayoutMockk) {
                        return catchingFishXMLLayoutMockk;
                    }
                }
                if (i == 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    this.CatchingFishCloudMessaging = catchingFishRoomGoogleMaps2;
                    this.CatchingFishLayout = 1;
                    obj = catchingFishKtorView.CatchingFishFragmentHandler(this);
                    if (obj == catchingFishXMLLayoutMockk) {
                        return catchingFishXMLLayoutMockk;
                    }
                    catchingFishRoomGoogleMaps = catchingFishRoomGoogleMaps2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            catchingFishAdMobRoom = (CatchingFishAdMobRoom) ((Serializable) this.CatchingFishCloudMessaging);
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                            catchingFishAdMobRoom.CatchingFishReduxKtor = ((Number) obj).intValue();
                            return CatchingFishRealmContext.CatchingFishParcelableFAB;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        catchingFishAdMobRoom2 = (CatchingFishAdMobRoom) ((Serializable) this.CatchingFishCloudMessaging);
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        catchingFishAdMobRoom2.CatchingFishReduxKtor = ((Number) obj).intValue();
                        return CatchingFishRealmContext.CatchingFishParcelableFAB;
                    }
                    catchingFishRoomGoogleMaps = (CatchingFishRoomGoogleMaps) ((Serializable) this.CatchingFishCloudMessaging);
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                }
                catchingFishRoomGoogleMaps.CatchingFishReduxKtor = obj;
                CatchingFishServiceJUnit CatchingFishViewModelFAB = catchingFishKtorView.CatchingFishViewModelFAB();
                this.CatchingFishCloudMessaging = catchingFishAdMobRoom2;
                this.CatchingFishLayout = 2;
                obj = CatchingFishViewModelFAB.CatchingFishParcelableFAB();
                if (obj == catchingFishXMLLayoutMockk) {
                    return catchingFishXMLLayoutMockk;
                }
                catchingFishAdMobRoom = catchingFishAdMobRoom2;
                catchingFishAdMobRoom.CatchingFishReduxKtor = ((Number) obj).intValue();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                int i2 = this.CatchingFishLayout;
                CatchingFishKtorView catchingFishKtorView2 = this.CatchingFishFragmentHandler;
                CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk2 = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                if (i2 == 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                    this.CatchingFishLayout = 1;
                    obj = CatchingFishKtorView.CatchingFishViewModelScope(catchingFishKtorView2, true, this);
                    if (obj == catchingFishXMLLayoutMockk2) {
                        return catchingFishXMLLayoutMockk2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.CatchingFishCloudMessaging;
                            CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                            return obj4;
                        }
                        catchingFishMockkStripeAPI = (CatchingFishMockkStripeAPI) this.CatchingFishCloudMessaging;
                        CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                        obj2 = catchingFishMockkStripeAPI.CatchingFishSnackbar;
                        if ((obj2 == null ? obj2.hashCode() : 0) == catchingFishMockkStripeAPI.CatchingFishCoroutine) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishMockkStripeAPI.CatchingFishSnackbar, obj)) {
                            this.CatchingFishCloudMessaging = obj;
                            this.CatchingFishLayout = 3;
                            if (catchingFishKtorView2.CatchingFishCloudMessaging(obj, true, this) == catchingFishXMLLayoutMockk2) {
                                return catchingFishXMLLayoutMockk2;
                            }
                        }
                        return obj;
                    }
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj);
                }
                catchingFishMockkStripeAPI = (CatchingFishMockkStripeAPI) obj;
                CatchingFishManifestMockk catchingFishManifestMockk = (CatchingFishManifestMockk) this.CatchingFishEspressoTesting;
                CatchingFishLiveDataJUnit catchingFishLiveDataJUnit = new CatchingFishLiveDataJUnit((CatchingFishMVIBundle) this.CatchingFishOkHttp, catchingFishMockkStripeAPI, null);
                this.CatchingFishCloudMessaging = catchingFishMockkStripeAPI;
                this.CatchingFishLayout = 2;
                obj = CatchingFishXMLLayoutGlide.CatchingFishGradleManifest(catchingFishManifestMockk, catchingFishLiveDataJUnit, this);
                if (obj == catchingFishXMLLayoutMockk2) {
                    return catchingFishXMLLayoutMockk2;
                }
                obj2 = catchingFishMockkStripeAPI.CatchingFishSnackbar;
                if ((obj2 == null ? obj2.hashCode() : 0) == catchingFishMockkStripeAPI.CatchingFishCoroutine) {
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishIntentDataStore(CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps, CatchingFishKtorView catchingFishKtorView, CatchingFishAdMobRoom catchingFishAdMobRoom, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        super(1, catchingFishWebsocketGradle);
        this.CatchingFishEspressoTesting = catchingFishRoomGoogleMaps;
        this.CatchingFishFragmentHandler = catchingFishKtorView;
        this.CatchingFishOkHttp = catchingFishAdMobRoom;
    }
}
