package androidx.versionedparcelable;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public abstract class IronMatrixLambdaSyntaxGQ4Q1JyF5DFc59wANj32409589054291 {
    public static final int[] ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = new int[2];
    public static final Rect AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = new Rect();

    public static final Integer ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
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

    public static final boolean AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(View view, Integer num, Rect rect) {
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
        if (view instanceof HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921) {
            return ((HeliosRuntimeComponentOverloadingQqLSvNMvA6UaCT2Tgj36236082094921) view).requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : viewGroup.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, viewGroup.hasFocus() ? viewGroup.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(View view, View view2) {
        int[] iArr = ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        view2.getLocationInWindow(iArr);
        int i3 = iArr[0];
        float f = i2 - iArr[1];
        view.getFocusedRect(AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365);
        float f2 = (i - i3) + r1.left;
        return new CosmicForgeConnectorRepositoryK3toUz9jyCSxcbNksk23919164703399(f2, r1.top + f, r1.width() + f2, f + r1.top + r1.height());
    }

    public static final ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210 RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i) {
        if (i == 1) {
            return new ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210(2);
        }
        if (i == 2) {
            return new ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210(1);
        }
        if (i == 17) {
            return new ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210(3);
        }
        if (i == 33) {
            return new ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210(5);
        }
        if (i == 66) {
            return new ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210(4);
        }
        if (i != 130) {
            return null;
        }
        return new ObsidianEngineSubroutineTranspilerAPO6Hllx2KOUFRf8XP52472597168210(6);
    }
}
