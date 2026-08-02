package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$IntRef;

/* loaded from: classes9.dex */
public abstract class sx31 {
    public static final void a(RecyclerView recyclerView, htk htkVar) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = Integer.MAX_VALUE;
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        ref$IntRef2.element = Integer.MIN_VALUE;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int viewLayoutPosition = ((RecyclerView.LayoutParams) recyclerView.getChildAt(i).getLayoutParams()).getViewLayoutPosition();
            ref$IntRef.element = Math.min(ref$IntRef.element, viewLayoutPosition);
            ref$IntRef2.element = Math.max(ref$IntRef2.element, viewLayoutPosition);
        }
        if (ref$IntRef.element == Integer.MAX_VALUE || ref$IntRef2.element == Integer.MIN_VALUE) {
            return;
        }
        recyclerView.removeCallbacks(rx31.b);
        recyclerView.post(new rx31(new in2(24, htkVar, ref$IntRef, ref$IntRef2)));
    }
}
