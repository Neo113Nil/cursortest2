package h3;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class j implements k {

    /* renamed from: g, reason: collision with root package name */
    public final ScrollFeedbackProvider f2789g;

    public j(NestedScrollView nestedScrollView) {
        this.f2789g = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // h3.k
    public final void onScrollLimit(int i10, int i11, int i12, boolean z10) {
        this.f2789g.onScrollLimit(i10, i11, i12, z10);
    }

    @Override // h3.k
    public final void onScrollProgress(int i10, int i11, int i12, int i13) {
        this.f2789g.onScrollProgress(i10, i11, i12, i13);
    }
}
