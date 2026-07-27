package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishMVIHandler implements CatchingFishIntentManifest {
    public final /* synthetic */ CatchingFishToastLayout CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishRoomGoogleMaps CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishIntentManifest CatchingFishViewModelScope;
    public final /* synthetic */ CatchingFishGlideMoshi CatchingFishWorkManager;

    public CatchingFishMVIHandler(CatchingFishRoomGoogleMaps catchingFishRoomGoogleMaps, CatchingFishToastLayout catchingFishToastLayout, CatchingFishGlideMoshi catchingFishGlideMoshi, CatchingFishIntentManifest catchingFishIntentManifest) {
        this.CatchingFishReduxKtor = catchingFishRoomGoogleMaps;
        this.CatchingFishDaggerWebsocket = catchingFishToastLayout;
        this.CatchingFishWorkManager = catchingFishGlideMoshi;
        this.CatchingFishViewModelScope = catchingFishIntentManifest;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // kotlin.text.CatchingFishIntentManifest
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object CatchingFishLayout(Object obj, CatchingFishWebsocketGradle catchingFishWebsocketGradle) {
        CatchingFishSnackbarBundle catchingFishSnackbarBundle;
        int i;
        CatchingFishMVIHandler catchingFishMVIHandler;
        if (catchingFishWebsocketGradle instanceof CatchingFishSnackbarBundle) {
            catchingFishSnackbarBundle = (CatchingFishSnackbarBundle) catchingFishWebsocketGradle;
            int i2 = catchingFishSnackbarBundle.CatchingFishCloudMessaging;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                catchingFishSnackbarBundle.CatchingFishCloudMessaging = i2 - Integer.MIN_VALUE;
                Object obj2 = catchingFishSnackbarBundle.CatchingFishLayout;
                i = catchingFishSnackbarBundle.CatchingFishCloudMessaging;
                if (i != 0) {
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                    CatchingFishRoomViewGson catchingFishRoomViewGson = (CatchingFishRoomViewGson) this.CatchingFishReduxKtor.CatchingFishReduxKtor;
                    if (catchingFishRoomViewGson != null) {
                        catchingFishRoomViewGson.CatchingFishCoroutine(new CatchingFishIntentGlide("Child of the scoped flow was cancelled", 0));
                        catchingFishSnackbarBundle.CatchingFishViewModelScope = this;
                        catchingFishSnackbarBundle.CatchingFishViewModelFAB = obj;
                        catchingFishSnackbarBundle.CatchingFishCloudMessaging = 1;
                        Object CatchingFishRoomDatabase = catchingFishRoomViewGson.CatchingFishRoomDatabase(catchingFishSnackbarBundle);
                        CatchingFishXMLLayoutMockk catchingFishXMLLayoutMockk = CatchingFishXMLLayoutMockk.CatchingFishReduxKtor;
                        if (CatchingFishRoomDatabase == catchingFishXMLLayoutMockk) {
                            return catchingFishXMLLayoutMockk;
                        }
                    }
                    catchingFishMVIHandler = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = catchingFishSnackbarBundle.CatchingFishViewModelFAB;
                    catchingFishMVIHandler = catchingFishSnackbarBundle.CatchingFishViewModelScope;
                    CatchingFishDaggerBiometric.CatchingFishLayoutInflater(obj2);
                }
                catchingFishMVIHandler.CatchingFishReduxKtor.CatchingFishReduxKtor = CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishMVIHandler.CatchingFishDaggerWebsocket, null, new CatchingFishGsonViewModel(catchingFishMVIHandler.CatchingFishWorkManager, catchingFishMVIHandler.CatchingFishViewModelScope, obj, null), 1);
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            }
        }
        catchingFishSnackbarBundle = new CatchingFishSnackbarBundle(this, catchingFishWebsocketGradle);
        Object obj22 = catchingFishSnackbarBundle.CatchingFishLayout;
        i = catchingFishSnackbarBundle.CatchingFishCloudMessaging;
        if (i != 0) {
        }
        catchingFishMVIHandler.CatchingFishReduxKtor.CatchingFishReduxKtor = CatchingFishXMLLayoutGlide.CatchingFishGsonAppCompat(catchingFishMVIHandler.CatchingFishDaggerWebsocket, null, new CatchingFishGsonViewModel(catchingFishMVIHandler.CatchingFishWorkManager, catchingFishMVIHandler.CatchingFishViewModelScope, obj, null), 1);
        return CatchingFishRealmContext.CatchingFishParcelableFAB;
    }
}
