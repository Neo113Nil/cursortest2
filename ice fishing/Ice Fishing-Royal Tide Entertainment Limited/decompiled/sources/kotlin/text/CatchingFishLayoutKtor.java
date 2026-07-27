package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishLayoutKtor extends CatchingFishLayoutRoomFAB {
    @Override // kotlin.text.CatchingFishLayoutRoomFAB
    public final void CatchingFishMVPRobolectric(CatchingFishGradleBiometric catchingFishGradleBiometric, float f, float f2) {
        float f3 = f2 * f;
        catchingFishGradleBiometric.CatchingFishReduxKtor(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        CatchingFishGradleStateFlow catchingFishGradleStateFlow = new CatchingFishGradleStateFlow(0.0f, 0.0f, f4, f4);
        catchingFishGradleStateFlow.CatchingFishWorkManager = 180.0f;
        catchingFishGradleStateFlow.CatchingFishViewModelScope = 90.0f;
        catchingFishGradleBiometric.CatchingFishWorkManager.add(catchingFishGradleStateFlow);
        CatchingFishDaggerHiltKtor catchingFishDaggerHiltKtor = new CatchingFishDaggerHiltKtor(catchingFishGradleStateFlow);
        catchingFishGradleBiometric.CatchingFishParcelableFAB(180.0f);
        catchingFishGradleBiometric.CatchingFishViewModelScope.add(catchingFishDaggerHiltKtor);
        catchingFishGradleBiometric.CatchingFishReduxKtor = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        catchingFishGradleBiometric.CatchingFishSnackbar = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        catchingFishGradleBiometric.CatchingFishCoroutine = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
