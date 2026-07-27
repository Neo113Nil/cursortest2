package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;

/* loaded from: classes.dex */
public final class CatchingFishDataStoreRoom extends CatchingFishViewWebsocket implements CatchingFishServiceHandler {
    public final /* synthetic */ int CatchingFishDaggerWebsocket;
    public final /* synthetic */ CatchingFishRealmGraphQL CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatchingFishDataStoreRoom(CatchingFishRealmGraphQL catchingFishRealmGraphQL, int i) {
        super(1);
        this.CatchingFishDaggerWebsocket = i;
        this.CatchingFishWorkManager = catchingFishRealmGraphQL;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [kotlin.text.CatchingFishJUnitGlide, kotlin.text.CatchingFishViewWebsocket] */
    @Override // kotlin.text.CatchingFishServiceHandler
    public final Object CatchingFishFragmentHandler(Object obj) {
        switch (this.CatchingFishDaggerWebsocket) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishRealmGraphQL catchingFishRealmGraphQL = this.CatchingFishWorkManager;
                catchingFishRealmGraphQL.CatchingFishReduxKtor = true;
                catchingFishRealmGraphQL.CatchingFishWorkManager.CatchingFishParcelableFAB();
                return CatchingFishRealmContext.CatchingFishParcelableFAB;
            default:
                CatchingFishPicassoManifest catchingFishPicassoManifest = (CatchingFishPicassoManifest) obj;
                CatchingFishRealmGraphQL catchingFishRealmGraphQL2 = this.CatchingFishWorkManager;
                CatchingFishGlideRoom catchingFishGlideRoom = catchingFishRealmGraphQL2.CatchingFishSnackbar;
                float f = catchingFishRealmGraphQL2.CatchingFishCloudMessaging;
                float f2 = catchingFishRealmGraphQL2.CatchingFishEspressoTesting;
                CatchingFishAsyncTaskDagger CatchingFishRoomDatabase = catchingFishPicassoManifest.CatchingFishRoomDatabase();
                long CatchingFishDagger = CatchingFishRoomDatabase.CatchingFishDagger();
                CatchingFishRoomDatabase.CatchingFishCardViewView().CatchingFishCloudMessaging();
                try {
                    ((CatchingFishServiceHilt) CatchingFishRoomDatabase.CatchingFishDaggerWebsocket).CatchingFishGsonAppCompat(f, f2, 0L);
                    catchingFishGlideRoom.CatchingFishParcelableFAB(catchingFishPicassoManifest);
                    CatchingFishRoomDatabase.CatchingFishCardViewView().CatchingFishLayout();
                    CatchingFishRoomDatabase.CatchingFishCustomViewJUnit(CatchingFishDagger);
                    return CatchingFishRealmContext.CatchingFishParcelableFAB;
                } catch (Throwable th) {
                    CatchingFishRoomDatabase.CatchingFishCardViewView().CatchingFishLayout();
                    CatchingFishRoomDatabase.CatchingFishCustomViewJUnit(CatchingFishDagger);
                    throw th;
                }
        }
    }
}
