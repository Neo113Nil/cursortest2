package kotlin.text;

/* loaded from: classes.dex */
public final class CatchingFishCameraXRoom implements CatchingFishGlideGradle {
    public final CatchingFishAndroidXOkHttp CatchingFishParcelableFAB;
    public final long CatchingFishSnackbar = 1500 * 1000000;
    public final long CatchingFishCoroutine = 0 * 1000000;

    public CatchingFishCameraXRoom(CatchingFishAndroidXOkHttp catchingFishAndroidXOkHttp) {
        this.CatchingFishParcelableFAB = catchingFishAndroidXOkHttp;
    }

    @Override // kotlin.text.CatchingFishGlideGradle
    public CatchingFishSnackbarFAB CatchingFishParcelableFAB() {
        return new CatchingFishAsyncTaskDagger(this);
    }

    public final float CatchingFishSnackbar(long j, float f, float f2, float f3) {
        long j2 = j - this.CatchingFishCoroutine;
        long j3 = this.CatchingFishSnackbar;
        if (0 > j3) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum 0.");
        }
        if (j2 < 0) {
            j2 = 0;
        } else if (j2 > j3) {
            j2 = j3;
        }
        float f4 = j2 / j3;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 1.0f) {
            f4 = 1.0f;
        }
        float CatchingFishParcelableFAB = this.CatchingFishParcelableFAB.CatchingFishParcelableFAB(f4);
        return (f2 * CatchingFishParcelableFAB) + ((1 - CatchingFishParcelableFAB) * f);
    }
}
