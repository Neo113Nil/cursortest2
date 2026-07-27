package kotlin.text;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class CatchingFishSpannableDagger extends CatchingFishPicassoView {
    public final boolean CatchingFishWorkManager;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatchingFishSpannableDagger(CatchingFishRoomViewGson catchingFishRoomViewGson) {
        super(true);
        boolean z = true;
        CatchingFishHandler(catchingFishRoomViewGson);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = CatchingFishPicassoView.CatchingFishDaggerWebsocket;
        CatchingFishMVVMRobolectric catchingFishMVVMRobolectric = (CatchingFishMVVMRobolectric) atomicReferenceFieldUpdater.get(this);
        CatchingFishKtorCardView catchingFishKtorCardView = catchingFishMVVMRobolectric instanceof CatchingFishKtorCardView ? (CatchingFishKtorCardView) catchingFishMVVMRobolectric : null;
        if (catchingFishKtorCardView != null) {
            CatchingFishPicassoView CatchingFishFragmentHandler = catchingFishKtorCardView.CatchingFishFragmentHandler();
            while (!CatchingFishFragmentHandler.CatchingFishPayPalService()) {
                CatchingFishMVVMRobolectric catchingFishMVVMRobolectric2 = (CatchingFishMVVMRobolectric) atomicReferenceFieldUpdater.get(CatchingFishFragmentHandler);
                CatchingFishKtorCardView catchingFishKtorCardView2 = catchingFishMVVMRobolectric2 instanceof CatchingFishKtorCardView ? (CatchingFishKtorCardView) catchingFishMVVMRobolectric2 : null;
                if (catchingFishKtorCardView2 != null) {
                    CatchingFishFragmentHandler = catchingFishKtorCardView2.CatchingFishFragmentHandler();
                }
            }
            this.CatchingFishWorkManager = z;
        }
        z = false;
        this.CatchingFishWorkManager = z;
    }

    @Override // kotlin.text.CatchingFishPicassoView
    public final boolean CatchingFishPayPalService() {
        return this.CatchingFishWorkManager;
    }

    @Override // kotlin.text.CatchingFishPicassoView
    public final boolean CatchingFishSensorManager() {
        return true;
    }
}
