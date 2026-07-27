package kotlin.text;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class CatchingFishGradleExoPlayer implements Comparator {
    public final /* synthetic */ int CatchingFishParcelableFAB;
    public final /* synthetic */ Object CatchingFishSnackbar;

    public /* synthetic */ CatchingFishGradleExoPlayer(int i, Object obj) {
        this.CatchingFishParcelableFAB = i;
        this.CatchingFishSnackbar = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.CatchingFishParcelableFAB) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                for (CatchingFishServiceHandler catchingFishServiceHandler : (CatchingFishServiceHandler[]) this.CatchingFishSnackbar) {
                    int CatchingFishRoomDatabase = CatchingFishAdMobFAB.CatchingFishRoomDatabase((Comparable) catchingFishServiceHandler.CatchingFishFragmentHandler(obj), (Comparable) catchingFishServiceHandler.CatchingFishFragmentHandler(obj2));
                    if (CatchingFishRoomDatabase != 0) {
                        return CatchingFishRoomDatabase;
                    }
                }
                return 0;
            case 1:
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.CatchingFishSnackbar;
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.CatchingFishNavigation).compareTo(Boolean.valueOf(materialButton2.CatchingFishNavigation));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                return compareTo2 != 0 ? compareTo2 : Integer.compare(materialButtonToggleGroup.indexOfChild(materialButton), materialButtonToggleGroup.indexOfChild(materialButton2));
            default:
                return ((Number) ((CatchingFishMockkView) this.CatchingFishSnackbar).CatchingFishDaggerWebsocket(obj, obj2)).intValue();
        }
    }
}
