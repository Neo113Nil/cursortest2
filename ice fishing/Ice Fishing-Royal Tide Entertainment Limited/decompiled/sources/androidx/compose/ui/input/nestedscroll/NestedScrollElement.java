package androidx.compose.ui.input.nestedscroll;

import kotlin.text.CatchingFishAppCompatMVVM;
import kotlin.text.CatchingFishFABBundleView;
import kotlin.text.CatchingFishFABStripeAPIFAB;
import kotlin.text.CatchingFishLayoutRoomFAB;
import kotlin.text.CatchingFishMoshiDataStore;

/* loaded from: classes.dex */
final class NestedScrollElement extends CatchingFishAppCompatMVVM {
    public final CatchingFishFABBundleView CatchingFishParcelableFAB;

    public NestedScrollElement(CatchingFishFABBundleView catchingFishFABBundleView) {
        this.CatchingFishParcelableFAB = catchingFishFABBundleView;
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final void CatchingFishDaggerWebsocket(CatchingFishFABStripeAPIFAB catchingFishFABStripeAPIFAB) {
        CatchingFishMoshiDataStore catchingFishMoshiDataStore = (CatchingFishMoshiDataStore) catchingFishFABStripeAPIFAB;
        catchingFishMoshiDataStore.getClass();
        CatchingFishFABBundleView catchingFishFABBundleView = catchingFishMoshiDataStore.CatchingFishNavigation;
        if (catchingFishFABBundleView.CatchingFishParcelableFAB == catchingFishMoshiDataStore) {
            catchingFishFABBundleView.CatchingFishParcelableFAB = null;
        }
        CatchingFishFABBundleView catchingFishFABBundleView2 = this.CatchingFishParcelableFAB;
        if (!catchingFishFABBundleView2.equals(catchingFishFABBundleView)) {
            catchingFishMoshiDataStore.CatchingFishNavigation = catchingFishFABBundleView2;
        }
        if (catchingFishMoshiDataStore.CatchingFishRoomDatabase) {
            catchingFishMoshiDataStore.CatchingFishJobScheduler();
        }
    }

    @Override // kotlin.text.CatchingFishAppCompatMVVM
    public final CatchingFishFABStripeAPIFAB CatchingFishReduxKtor() {
        return new CatchingFishMoshiDataStore(this.CatchingFishParcelableFAB);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof NestedScrollElement)) {
            return false;
        }
        NestedScrollElement nestedScrollElement = (NestedScrollElement) obj;
        nestedScrollElement.getClass();
        Object obj2 = CatchingFishLayoutRoomFAB.CatchingFishParcelableFAB;
        return obj2.equals(obj2) && nestedScrollElement.CatchingFishParcelableFAB.equals(this.CatchingFishParcelableFAB);
    }

    public final int hashCode() {
        return this.CatchingFishParcelableFAB.hashCode() + (CatchingFishLayoutRoomFAB.CatchingFishParcelableFAB.hashCode() * 31);
    }
}
