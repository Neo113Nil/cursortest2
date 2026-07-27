package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class CatchingFishGsonRoom extends CatchingFishSnackbarRoom {
    public final CatchingFishKtorMockk CatchingFishLayout;
    public final /* synthetic */ int CatchingFishViewModelFAB;

    public /* synthetic */ CatchingFishGsonRoom(CatchingFishKtorMockk catchingFishKtorMockk, int i) {
        this.CatchingFishViewModelFAB = i;
        this.CatchingFishLayout = catchingFishKtorMockk;
    }

    @Override // kotlin.text.CatchingFishSnackbarRoom
    public final boolean CatchingFishCloudMessaging() {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return true;
            default:
                return false;
        }
    }

    @Override // kotlin.text.CatchingFishSnackbarRoom
    public final void CatchingFishEspressoTesting(Throwable th) {
        switch (this.CatchingFishViewModelFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                CatchingFishPicassoView CatchingFishFragmentHandler = CatchingFishFragmentHandler();
                CatchingFishKtorMockk catchingFishKtorMockk = this.CatchingFishLayout;
                Throwable CatchingFishRoomDatabase = catchingFishKtorMockk.CatchingFishRoomDatabase(CatchingFishFragmentHandler);
                if (catchingFishKtorMockk.CatchingFishGsonAppCompat()) {
                    CatchingFishPayPalRoom catchingFishPayPalRoom = (CatchingFishPayPalRoom) catchingFishKtorMockk.CatchingFishViewModelScope;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishPayPalRoom.CatchingFishCloudMessaging;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(catchingFishPayPalRoom);
                        CatchingFishFluxWorkManager catchingFishFluxWorkManager = CatchingFishGsonCardView.CatchingFishCloudMessaging;
                        if (CatchingFishFirebaseDagger.CatchingFishOkHttp(obj, catchingFishFluxWorkManager)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishPayPalRoom, catchingFishFluxWorkManager, CatchingFishRoomDatabase)) {
                                if (atomicReferenceFieldUpdater.get(catchingFishPayPalRoom) != catchingFishFluxWorkManager) {
                                    break;
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (!atomicReferenceFieldUpdater.compareAndSet(catchingFishPayPalRoom, obj, null)) {
                                if (atomicReferenceFieldUpdater.get(catchingFishPayPalRoom) != obj) {
                                    break;
                                }
                            }
                        }
                    }
                }
                catchingFishKtorMockk.CatchingFishUnitTesting(CatchingFishRoomDatabase);
                if (!catchingFishKtorMockk.CatchingFishGsonAppCompat()) {
                    catchingFishKtorMockk.CatchingFishAnimationMockk();
                    break;
                }
                break;
            default:
                this.CatchingFishLayout.CatchingFishViewModelFAB(CatchingFishRealmContext.CatchingFishParcelableFAB);
                break;
        }
    }
}
