package kotlin.text;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class CatchingFishGradleWidget implements CatchingFishMVIGlide {
    public final ScrollFeedbackProvider CatchingFishReduxKtor;

    public CatchingFishGradleWidget(NestedScrollView nestedScrollView) {
        this.CatchingFishReduxKtor = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // kotlin.text.CatchingFishMVIGlide
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.CatchingFishReduxKtor.onScrollLimit(i, i2, i3, z);
    }

    @Override // kotlin.text.CatchingFishMVIGlide
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.CatchingFishReduxKtor.onScrollProgress(i, i2, i3, i4);
    }
}
