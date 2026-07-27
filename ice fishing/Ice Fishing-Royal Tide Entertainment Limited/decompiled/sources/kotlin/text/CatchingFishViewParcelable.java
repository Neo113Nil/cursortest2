package kotlin.text;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class CatchingFishViewParcelable extends CatchingFishMVVMCameraX {
    public CatchingFishViewParcelable(CatchingFishMVVMCameraX catchingFishMVVMCameraX) {
        CatchingFishFirebaseDagger.CatchingFishNavigation(catchingFishMVVMCameraX, "initialExtras");
        LinkedHashMap linkedHashMap = catchingFishMVVMCameraX.CatchingFishParcelableFAB;
        CatchingFishFirebaseDagger.CatchingFishNavigation(linkedHashMap, "initialExtras");
        this.CatchingFishParcelableFAB.putAll(linkedHashMap);
    }

    public /* synthetic */ CatchingFishViewParcelable(int i) {
        this(CatchingFishMoshiStateFlow.CatchingFishSnackbar);
    }
}
