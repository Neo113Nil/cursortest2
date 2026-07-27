package kotlin.text;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* loaded from: classes.dex */
public final class CatchingFishGsonSnackbar extends CatchingFishMVIViewPager {
    public CatchingFishGsonSnackbar(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, WindowInsets windowInsets) {
        super(catchingFishKtorPicassoMVVM, windowInsets);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public List<Rect> CatchingFishViewModelScope(int i) {
        List<Rect> boundingRectsIgnoringVisibility;
        boundingRectsIgnoringVisibility = this.CatchingFishCoroutine.getBoundingRectsIgnoringVisibility(CatchingFishLiveDataGlide.CatchingFishParcelableFAB(i));
        return boundingRectsIgnoringVisibility;
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public List<Rect> CatchingFishWorkManager(int i) {
        List<Rect> boundingRects;
        boundingRects = this.CatchingFishCoroutine.getBoundingRects(CatchingFishLiveDataGlide.CatchingFishParcelableFAB(i));
        return boundingRects;
    }

    public CatchingFishGsonSnackbar(CatchingFishKtorPicassoMVVM catchingFishKtorPicassoMVVM, CatchingFishGsonSnackbar catchingFishGsonSnackbar) {
        super(catchingFishKtorPicassoMVVM, catchingFishGsonSnackbar);
    }

    @Override // kotlin.text.CatchingFishRealmMoshiFAB, kotlin.text.CatchingFishFragmentHilt
    public void CatchingFishRoomDatabase() {
    }
}
