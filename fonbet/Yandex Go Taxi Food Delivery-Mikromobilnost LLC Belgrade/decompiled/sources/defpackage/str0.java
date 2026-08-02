package defpackage;

import com.yandex.go.flex.main_screen.presentation.controllers.shimmer.ShimmerContentView;

/* loaded from: classes.dex */
public final class str0 implements ptr0 {
    public final /* synthetic */ ShimmerContentView a;

    public str0(ShimmerContentView shimmerContentView) {
        this.a = shimmerContentView;
    }

    @Override // defpackage.eyi0
    public final void render(Object obj) {
        boolean z = ((jvr0) obj).a;
        ShimmerContentView shimmerContentView = this.a;
        ShimmerContentView.applyShimmeringStateRecursive$default(shimmerContentView, shimmerContentView, null, z, 1, null);
    }
}
