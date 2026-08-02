package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.jvm.internal.markers.KMappedMarker;

/* loaded from: classes3.dex */
public final class ViewGroupKt$iterator$1 implements Iterator, KMappedMarker {
    final /* synthetic */ ViewGroup $this_iterator;
    public int index;

    public ViewGroupKt$iterator$1(ViewGroup viewGroup) {
        this.$this_iterator = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.index < this.$this_iterator.getChildCount();
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup = this.$this_iterator;
        int i = this.index;
        this.index = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        JWK$$ExternalSyntheticBUOutline0.m2173m();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        ViewGroup viewGroup = this.$this_iterator;
        int i = this.index - 1;
        this.index = i;
        viewGroup.removeViewAt(i);
    }
}
