package androidx.core.view;

import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;

/* loaded from: classes3.dex */
public final class ViewGroupKt$children$1 implements Sequence {
    final /* synthetic */ ViewGroup $this_children;

    public ViewGroupKt$children$1(ViewGroup viewGroup) {
        this.$this_children = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    public final Iterator iterator() {
        return new ViewGroupKt$iterator$1(this.$this_children);
    }
}
