package kotlin.text;

/* loaded from: classes.dex */
public interface CatchingFishPicassoManifest extends CatchingFishOkHttpFlux {
    static void CatchingFish(CatchingFishPicassoManifest catchingFishPicassoManifest, CatchingFishWidgetWebSocket catchingFishWidgetWebSocket, long j, long j2, float f, CatchingFishFluxIntent catchingFishFluxIntent, int i, int i2) {
        catchingFishPicassoManifest.CatchingFishMutableLiveData(catchingFishWidgetWebSocket, 0L, j, (i2 & 16) != 0 ? j : j2, f, catchingFishFluxIntent, (i2 & 512) != 0 ? 1 : i);
    }

    static void CatchingFishViewModelScope(CatchingFishPicassoManifest catchingFishPicassoManifest, long j, long j2, long j3, int i) {
        long j4;
        if ((i & 2) != 0) {
            j2 = 0;
        }
        long j5 = j2;
        if ((i & 4) != 0) {
            float intBitsToFloat = Float.intBitsToFloat((int) (catchingFishPicassoManifest.CatchingFishNavigation() >> 32)) - Float.intBitsToFloat((int) (j5 >> 32));
            j4 = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r12 & 4294967295L)) - Float.intBitsToFloat((int) (j5 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        } else {
            j4 = j3;
        }
        catchingFishPicassoManifest.CatchingFishJobScheduler(j, j5, j4, CatchingFishContextHilt.CatchingFishCoroutineFlow, (i & 64) != 0 ? 3 : 0);
    }

    static /* synthetic */ void CatchingFishWorkManager(CatchingFishPicassoManifest catchingFishPicassoManifest, CatchingFishMoshiRealm catchingFishMoshiRealm, CatchingFishRobolectricHilt catchingFishRobolectricHilt, float f, CatchingFishEspressoBundle catchingFishEspressoBundle, int i) {
        CatchingFishFirebaseDagger catchingFishFirebaseDagger = catchingFishEspressoBundle;
        if ((i & 8) != 0) {
            catchingFishFirebaseDagger = CatchingFishContextHilt.CatchingFishCoroutineFlow;
        }
        catchingFishPicassoManifest.CatchingFishMVPRobolectric(catchingFishMoshiRealm, catchingFishRobolectricHilt, f, catchingFishFirebaseDagger);
    }

    default long CatchingFishCardViewView() {
        return CatchingFishOkHttpFAB.CatchingFishParcelableFlux(CatchingFishRoomDatabase().CatchingFishDagger());
    }

    void CatchingFishGsonAppCompat(long j, long j2, long j3, float f, int i);

    void CatchingFishJobScheduler(long j, long j2, long j3, CatchingFishFirebaseDagger catchingFishFirebaseDagger, int i);

    void CatchingFishMVPRobolectric(CatchingFishMoshiRealm catchingFishMoshiRealm, CatchingFishRobolectricHilt catchingFishRobolectricHilt, float f, CatchingFishFirebaseDagger catchingFishFirebaseDagger);

    void CatchingFishMutableLiveData(CatchingFishWidgetWebSocket catchingFishWidgetWebSocket, long j, long j2, long j3, float f, CatchingFishFluxIntent catchingFishFluxIntent, int i);

    default long CatchingFishNavigation() {
        return CatchingFishRoomDatabase().CatchingFishDagger();
    }

    void CatchingFishReduxKtor(long j, float f, long j2, CatchingFishFirebaseDagger catchingFishFirebaseDagger);

    CatchingFishAsyncTaskDagger CatchingFishRoomDatabase();

    CatchingFishGradleMVPKtor getLayoutDirection();
}
