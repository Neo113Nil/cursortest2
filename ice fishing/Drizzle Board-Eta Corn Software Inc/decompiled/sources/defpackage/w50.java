package defpackage;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class w50 implements x50 {
    public final ScrollFeedbackProvider NCTxEWno;

    public w50(NestedScrollView nestedScrollView) {
        this.NCTxEWno = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // defpackage.x50
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.NCTxEWno.onScrollLimit(i, i2, i3, z);
    }

    @Override // defpackage.x50
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
        this.NCTxEWno.onScrollProgress(i, i2, i3, i4);
    }
}
