package defpackage;

import android.view.View;
import androidx.cardview.widget.CardView;
import com.ybsdk.core.stories.StoriesComponentView;
import com.ybsdk.feature.stories.internal.screens.verticalstories.view.StoriesPageView;

/* loaded from: classes3.dex */
public final class wa61 implements zo31 {
    public final StoriesPageView a;
    public final CardView b;
    public final View c;
    public final StoriesComponentView d;

    public wa61(StoriesPageView storiesPageView, CardView cardView, View view, StoriesComponentView storiesComponentView) {
        this.a = storiesPageView;
        this.b = cardView;
        this.c = view;
        this.d = storiesComponentView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
