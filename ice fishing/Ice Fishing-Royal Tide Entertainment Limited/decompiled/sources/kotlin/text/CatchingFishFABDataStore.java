package kotlin.text;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class CatchingFishFABDataStore implements CatchingFishOkHttpFlux {
    public boolean CatchingFishReduxKtor;
    public final /* synthetic */ CatchingFishWidgetXMLLayout CatchingFishViewModelScope;
    public long CatchingFishDaggerWebsocket = 9223372034707292159L;
    public long CatchingFishWorkManager = 0;

    public CatchingFishFABDataStore(CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout) {
        this.CatchingFishViewModelScope = catchingFishWidgetXMLLayout;
    }

    @Override // kotlin.text.CatchingFishOkHttpFlux
    public final float CatchingFishDaggerWebsocket() {
        return this.CatchingFishViewModelScope.CatchingFishDaggerWebsocket();
    }

    @Override // kotlin.text.CatchingFishOkHttpFlux
    public final float CatchingFishFragmentHandler() {
        return this.CatchingFishViewModelScope.CatchingFishFragmentHandler();
    }

    public final void CatchingFishParcelableFAB(CatchingFishFABAndroidX catchingFishFABAndroidX, float f) {
        CatchingFishWidgetXMLLayout catchingFishWidgetXMLLayout = this.CatchingFishViewModelScope;
        CatchingFishPicassoJUnit catchingFishPicassoJUnit = catchingFishWidgetXMLLayout.CatchingFishAnimationMockk;
        if (catchingFishPicassoJUnit == null) {
            catchingFishPicassoJUnit = new CatchingFishPicassoJUnit();
            catchingFishWidgetXMLLayout.CatchingFishAnimationMockk = catchingFishPicassoJUnit;
        }
        int CatchingFishMoshiDaggerHilt = CatchingFishMVVMHilt.CatchingFishMoshiDaggerHilt((CatchingFishFABAndroidX[]) catchingFishPicassoJUnit.CatchingFishSnackbar, catchingFishFABAndroidX);
        if (CatchingFishMoshiDaggerHilt >= 0) {
            float[] fArr = (float[]) catchingFishPicassoJUnit.CatchingFishCoroutine;
            if (fArr[CatchingFishMoshiDaggerHilt] != f) {
                fArr[CatchingFishMoshiDaggerHilt] = f;
                ((byte[]) catchingFishPicassoJUnit.CatchingFishReduxKtor)[CatchingFishMoshiDaggerHilt] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) catchingFishPicassoJUnit.CatchingFishReduxKtor;
                if (bArr[CatchingFishMoshiDaggerHilt] == 2) {
                    bArr[CatchingFishMoshiDaggerHilt] = 0;
                    return;
                }
                return;
            }
        }
        int i = catchingFishPicassoJUnit.CatchingFishParcelableFAB;
        CatchingFishFABAndroidX[] catchingFishFABAndroidXArr = (CatchingFishFABAndroidX[]) catchingFishPicassoJUnit.CatchingFishSnackbar;
        if (i == catchingFishFABAndroidXArr.length) {
            int i2 = i * 2;
            Object[] copyOf = Arrays.copyOf(catchingFishFABAndroidXArr, i2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf, "copyOf(...)");
            catchingFishPicassoJUnit.CatchingFishSnackbar = (CatchingFishFABAndroidX[]) copyOf;
            float[] copyOf2 = Arrays.copyOf((float[]) catchingFishPicassoJUnit.CatchingFishCoroutine, i2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf2, "copyOf(...)");
            catchingFishPicassoJUnit.CatchingFishCoroutine = copyOf2;
            byte[] copyOf3 = Arrays.copyOf((byte[]) catchingFishPicassoJUnit.CatchingFishReduxKtor, i2);
            CatchingFishFirebaseDagger.CatchingFishRoomDatabase(copyOf3, "copyOf(...)");
            catchingFishPicassoJUnit.CatchingFishReduxKtor = copyOf3;
        }
        ((CatchingFishFABAndroidX[]) catchingFishPicassoJUnit.CatchingFishSnackbar)[i] = catchingFishFABAndroidX;
        ((byte[]) catchingFishPicassoJUnit.CatchingFishReduxKtor)[i] = 3;
        ((float[]) catchingFishPicassoJUnit.CatchingFishCoroutine)[i] = f;
        catchingFishPicassoJUnit.CatchingFishParcelableFAB++;
    }
}
