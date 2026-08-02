package splitties.views;

import android.view.View;
import defpackage.sls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class ClickKt$onLongClick$1 implements View.OnLongClickListener {
    final /* synthetic */ sls $block;
    final /* synthetic */ boolean $consume;

    public ClickKt$onLongClick$1(sls slsVar, boolean z) {
        this.$block = slsVar;
        this.$consume = z;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        this.$block.invoke();
        return this.$consume;
    }
}
