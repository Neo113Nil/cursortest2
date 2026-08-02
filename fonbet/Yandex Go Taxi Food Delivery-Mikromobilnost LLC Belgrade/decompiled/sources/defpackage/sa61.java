package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardSkinView;
import com.ybsdk.widgets.common.shimmer.ShimmerFrameLayout;

/* loaded from: classes3.dex */
public final class sa61 implements zo31 {
    public final CardSkinView a;
    public final AppCompatImageView b;
    public final ShimmerFrameLayout c;
    public final AppCompatImageView d;

    public sa61(CardSkinView cardSkinView, AppCompatImageView appCompatImageView, ShimmerFrameLayout shimmerFrameLayout, AppCompatImageView appCompatImageView2) {
        this.a = cardSkinView;
        this.b = appCompatImageView;
        this.c = shimmerFrameLayout;
        this.d = appCompatImageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
