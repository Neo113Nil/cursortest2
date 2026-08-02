package com.datadog.android.rum.internal.tracking;

import android.content.res.Resources;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import kotlin.text.CharsKt;

/* loaded from: classes4.dex */
public final class JetpackViewAttributesProvider {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.ViewParent, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public static void extractAttributes(View view, LinkedHashMap linkedHashMap) {
        String concat;
        for (View view2 = view.getParent(); view2 != 0; view2 = view2.getParent()) {
            if ((view2 instanceof RecyclerView) && view != null && (view.getLayoutParams() instanceof RecyclerView.LayoutParams)) {
                RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                linkedHashMap.put("action.target.parent.index", Integer.valueOf(childViewHolderInt != null ? childViewHolderInt.getAbsoluteAdapterPosition() : -1));
                linkedHashMap.put("action.target.parent.classname", view2.getClass().getCanonicalName());
                View view3 = view2;
                try {
                    concat = view3.getResources().getResourceEntryName(view3.getId());
                    if (concat == null) {
                        String num = Integer.toString(view3.getId(), CharsKt.checkRadix(16));
                        num.getClass();
                        concat = "0x".concat(num);
                    }
                } catch (Resources.NotFoundException unused) {
                    String num2 = Integer.toString(view3.getId(), CharsKt.checkRadix(16));
                    num2.getClass();
                    concat = "0x".concat(num2);
                }
                linkedHashMap.put("action.target.parent.resource_id", concat);
                return;
            }
            view = view2 instanceof View ? view2 : null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return JetpackViewAttributesProvider.class.equals(obj != null ? obj.getClass() : null);
    }

    public final int hashCode() {
        return JetpackViewAttributesProvider.class.hashCode();
    }
}
