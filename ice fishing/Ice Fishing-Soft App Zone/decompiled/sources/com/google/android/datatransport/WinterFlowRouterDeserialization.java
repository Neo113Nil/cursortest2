package com.google.android.datatransport;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public abstract class WinterFlowRouterDeserialization {
    public static final int[] WinterFlowRouterStructure = new int[2];
    public static final Rect WinterFlowHookDataSource = new Rect();

    public static final WinterFlowDeserializationEventEmitter WinterFlowArrayNetwork(int i) {
        if (i == 1) {
            return new WinterFlowDeserializationEventEmitter(2);
        }
        if (i == 2) {
            return new WinterFlowDeserializationEventEmitter(1);
        }
        if (i == 17) {
            return new WinterFlowDeserializationEventEmitter(3);
        }
        if (i == 33) {
            return new WinterFlowDeserializationEventEmitter(5);
        }
        if (i == 66) {
            return new WinterFlowDeserializationEventEmitter(4);
        }
        if (i != 130) {
            return null;
        }
        return new WinterFlowDeserializationEventEmitter(6);
    }

    public static final Integer WinterFlowCacheManagerAgent(int i) {
        if (i == 5) {
            return 33;
        }
        if (i == 6) {
            return 130;
        }
        if (i == 3) {
            return 17;
        }
        if (i == 4) {
            return 66;
        }
        if (i == 1) {
            return 2;
        }
        return i == 2 ? 1 : null;
    }

    public static final boolean WinterFlowHookDataSource(View view, Integer num, Rect rect) {
        if (num == null) {
            return view.requestFocus();
        }
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !viewGroup.hasFocus()) {
            return viewGroup.requestFocus(num.intValue(), rect);
        }
        if (view instanceof WinterFlowSyntaxTransactionManager) {
            return ((WinterFlowSyntaxTransactionManager) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final WinterFlowVersionParser WinterFlowRouterStructure(View view, View view2) {
        int[] iArr = WinterFlowRouterStructure;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(WinterFlowHookDataSource);
        float f2 = (i - i3) + r1.left;
        return new WinterFlowVersionParser(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }
}
