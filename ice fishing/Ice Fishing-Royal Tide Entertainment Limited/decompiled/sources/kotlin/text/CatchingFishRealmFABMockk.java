package kotlin.text;

import java.util.concurrent.CountDownLatch;

/* loaded from: classes.dex */
public final class CatchingFishRealmFABMockk implements CatchingFishMoshiJUnitRoom, CatchingFishRoomToolbar, CatchingFishSpannableFAB, CatchingFishFragmentFAB {
    public final CountDownLatch CatchingFishReduxKtor;

    @Override // kotlin.text.CatchingFishRoomToolbar
    public void CatchingFishCoroutine(Exception exc) {
        this.CatchingFishReduxKtor.countDown();
    }

    @Override // kotlin.text.CatchingFishSpannableFAB
    public void CatchingFishParcelableFAB() {
        this.CatchingFishReduxKtor.countDown();
    }

    @Override // kotlin.text.CatchingFishFragmentFAB
    public void CatchingFishRoomDatabase(CatchingFishWorkManagerMVP catchingFishWorkManagerMVP) {
        this.CatchingFishReduxKtor.countDown();
    }

    @Override // kotlin.text.CatchingFishMoshiJUnitRoom
    public void CatchingFishSnackbar(Object obj) {
        this.CatchingFishReduxKtor.countDown();
    }

    public /* synthetic */ CatchingFishRealmFABMockk() {
        this.CatchingFishReduxKtor = new CountDownLatch(1);
    }
}
