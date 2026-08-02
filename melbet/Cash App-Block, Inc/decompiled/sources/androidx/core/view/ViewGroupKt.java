package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.EmptyList;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class ViewGroupKt {
    public static final View get(ViewGroup viewGroup, int i) {
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        Path$$ExternalSyntheticBUOutline0.m(viewGroup.getChildCount(), JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index: ", ", Size: "));
        return null;
    }

    public static final ViewGroupKt$children$1 getChildren(ViewGroup viewGroup) {
        return new ViewGroupKt$children$1(viewGroup);
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewSquareOnlineShopping.deepLinkSpecs;
    }
}
