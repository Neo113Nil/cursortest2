package kotlin.text;

/* loaded from: classes.dex */
public class CatchingFishServiceFAB {
    public final CatchingFishEspressoHilt CatchingFishCoroutine;
    public final CatchingFishEspressoHilt CatchingFishParcelableFAB;
    public final float[] CatchingFishReduxKtor;
    public final CatchingFishEspressoHilt CatchingFishSnackbar;

    public CatchingFishServiceFAB(CatchingFishEspressoHilt catchingFishEspressoHilt, CatchingFishEspressoHilt catchingFishEspressoHilt2, CatchingFishEspressoHilt catchingFishEspressoHilt3, float[] fArr) {
        this.CatchingFishParcelableFAB = catchingFishEspressoHilt;
        this.CatchingFishSnackbar = catchingFishEspressoHilt2;
        this.CatchingFishCoroutine = catchingFishEspressoHilt3;
        this.CatchingFishReduxKtor = fArr;
    }

    public long CatchingFishParcelableFAB(long j) {
        float CatchingFishViewModelScope = CatchingFishToastFragment.CatchingFishViewModelScope(j);
        float CatchingFishWorkManager = CatchingFishToastFragment.CatchingFishWorkManager(j);
        float CatchingFishDaggerWebsocket = CatchingFishToastFragment.CatchingFishDaggerWebsocket(j);
        float CatchingFishReduxKtor = CatchingFishToastFragment.CatchingFishReduxKtor(j);
        CatchingFishEspressoHilt catchingFishEspressoHilt = this.CatchingFishSnackbar;
        long CatchingFishReduxKtor2 = catchingFishEspressoHilt.CatchingFishReduxKtor(CatchingFishViewModelScope, CatchingFishWorkManager, CatchingFishDaggerWebsocket);
        float intBitsToFloat = Float.intBitsToFloat((int) (CatchingFishReduxKtor2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (CatchingFishReduxKtor2 & 4294967295L));
        float CatchingFishDaggerWebsocket2 = catchingFishEspressoHilt.CatchingFishDaggerWebsocket(CatchingFishViewModelScope, CatchingFishWorkManager, CatchingFishDaggerWebsocket);
        float[] fArr = this.CatchingFishReduxKtor;
        if (fArr != null) {
            intBitsToFloat *= fArr[0];
            intBitsToFloat2 *= fArr[1];
            CatchingFishDaggerWebsocket2 *= fArr[2];
        }
        float f = intBitsToFloat;
        float f2 = intBitsToFloat2;
        return this.CatchingFishCoroutine.CatchingFishWorkManager(f, f2, CatchingFishDaggerWebsocket2, CatchingFishReduxKtor, this.CatchingFishParcelableFAB);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CatchingFishServiceFAB(CatchingFishEspressoHilt catchingFishEspressoHilt, CatchingFishEspressoHilt catchingFishEspressoHilt2, int i) {
        this(catchingFishEspressoHilt2, r0, r1, r4);
        float[] fArr;
        long j = catchingFishEspressoHilt.CatchingFishSnackbar;
        long j2 = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB;
        CatchingFishEspressoHilt CatchingFishViewModelScope = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(j, j2) ? CatchingFishLayoutRoomFAB.CatchingFishViewModelScope(catchingFishEspressoHilt) : catchingFishEspressoHilt;
        CatchingFishEspressoHilt CatchingFishViewModelScope2 = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(catchingFishEspressoHilt2.CatchingFishSnackbar, j2) ? CatchingFishLayoutRoomFAB.CatchingFishViewModelScope(catchingFishEspressoHilt2) : catchingFishEspressoHilt2;
        float[] fArr2 = CatchingFishRobolectricHilt.CatchingFishAnimationMockk;
        if (i == 3) {
            boolean CatchingFishParcelableFAB = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(catchingFishEspressoHilt.CatchingFishSnackbar, j2);
            boolean CatchingFishParcelableFAB2 = CatchingFishMockkSharedFlow.CatchingFishParcelableFAB(catchingFishEspressoHilt2.CatchingFishSnackbar, j2);
            if ((!CatchingFishParcelableFAB || !CatchingFishParcelableFAB2) && (CatchingFishParcelableFAB || CatchingFishParcelableFAB2)) {
                CatchingFishRealmMVPKtor catchingFishRealmMVPKtor = ((CatchingFishMVIFragment) (CatchingFishParcelableFAB ? catchingFishEspressoHilt : catchingFishEspressoHilt2)).CatchingFishReduxKtor;
                float[] CatchingFishParcelableFAB3 = CatchingFishParcelableFAB ? catchingFishRealmMVPKtor.CatchingFishParcelableFAB() : fArr2;
                fArr2 = CatchingFishParcelableFAB2 ? catchingFishRealmMVPKtor.CatchingFishParcelableFAB() : fArr2;
                fArr = new float[]{CatchingFishParcelableFAB3[0] / fArr2[0], CatchingFishParcelableFAB3[1] / fArr2[1], CatchingFishParcelableFAB3[2] / fArr2[2]};
            }
        }
        fArr = null;
    }
}
