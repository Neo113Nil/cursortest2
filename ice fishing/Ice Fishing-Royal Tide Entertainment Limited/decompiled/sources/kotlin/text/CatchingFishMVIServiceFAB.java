package kotlin.text;

import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class CatchingFishMVIServiceFAB {
    public static final CatchingFishAsyncTaskDagger CatchingFishParcelableFAB;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        CatchingFishCoroutineBundle catchingFishCoroutineBundle = CatchingFishRobolectricHilt.CatchingFishRoomDatabase;
        hashMap.put(CatchingFishMVIServiceFAB.class, CatchingFishHandlerLiveData.CatchingFishParcelableFAB);
        hashMap2.remove(CatchingFishMVIServiceFAB.class);
        hashMap.put(CatchingFishMockkMVI.class, CatchingFishViewModelToast.CatchingFishParcelableFAB);
        hashMap2.remove(CatchingFishMockkMVI.class);
        hashMap.put(CatchingFishAndroidXHandler.class, CatchingFishBundleToast.CatchingFishParcelableFAB);
        hashMap2.remove(CatchingFishAndroidXHandler.class);
        CatchingFishParcelableFAB = new CatchingFishAsyncTaskDagger(new HashMap(hashMap), new HashMap(hashMap2), catchingFishCoroutineBundle, 17);
    }
}
