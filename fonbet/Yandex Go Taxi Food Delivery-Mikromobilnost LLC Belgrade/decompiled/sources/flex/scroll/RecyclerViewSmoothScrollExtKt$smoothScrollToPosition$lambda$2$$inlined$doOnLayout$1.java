package flex.scroll;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b0t0;
import defpackage.gki0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JW\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "Landroid/view/View;", "view", "", "left", "top", "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "Lzy11;", "onLayoutChange", "(Landroid/view/View;IIIIIIII)V", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1", "core-ktx_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$lambda$2$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ gki0 $layoutHelper$inlined;
    final /* synthetic */ int $position$inlined;
    final /* synthetic */ b0t0 $scrollerProvider$inlined;
    final /* synthetic */ RecyclerView $this_smoothScrollToPosition$inlined;

    public RecyclerViewSmoothScrollExtKt$smoothScrollToPosition$lambda$2$$inlined$doOnLayout$1(gki0 gki0Var, RecyclerView recyclerView, b0t0 b0t0Var, int i) {
        this.$layoutHelper$inlined = gki0Var;
        this.$this_smoothScrollToPosition$inlined = recyclerView;
        this.$scrollerProvider$inlined = b0t0Var;
        this.$position$inlined = i;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
        view.removeOnLayoutChangeListener(this);
        gki0 gki0Var = this.$layoutHelper$inlined;
        Context context = this.$this_smoothScrollToPosition$inlined.getContext();
        b0t0 b0t0Var = this.$scrollerProvider$inlined;
        int i = this.$position$inlined;
        RecyclerView.j jVar = b0t0Var.get(context);
        jVar.a = i;
        gki0Var.v(jVar);
    }
}
