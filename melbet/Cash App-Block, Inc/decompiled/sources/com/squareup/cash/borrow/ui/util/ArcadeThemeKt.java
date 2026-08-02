package com.squareup.cash.borrow.ui.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidViewsHandler;
import androidx.compose.ui.platform.ScrollObservationScope;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import coil3.size.DimensionKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.paychecks.backend.api.GeneralPaychecksException;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.protos.cash.ui.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public abstract class ArcadeThemeKt {
    public static final ScrollObservationScope findById(int i, ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((ScrollObservationScope) arrayList.get(i2)).semanticsNodeId == i) {
                return (ScrollObservationScope) arrayList.get(i2);
            }
        }
        return null;
    }

    public static final Float getScrollViewportLength(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object obj = semanticsConfiguration.props.get(SemanticsActions.GetScrollViewportLength);
        if (obj == null) {
            obj = null;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.action) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (Float) arrayList.get(0);
    }

    public static final TextLayoutResult getTextLayoutResult(SemanticsConfiguration semanticsConfiguration) {
        Function1 function1;
        ArrayList arrayList = new ArrayList();
        Object obj = semanticsConfiguration.props.get(SemanticsActions.GetTextLayoutResult);
        if (obj == null) {
            obj = null;
        }
        AccessibilityAction accessibilityAction = (AccessibilityAction) obj;
        if (accessibilityAction == null || (function1 = (Function1) accessibilityAction.action) == null || !((Boolean) function1.invoke(arrayList)).booleanValue()) {
            return null;
        }
        return (TextLayoutResult) arrayList.get(0);
    }

    public static final EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements requireSelectedStateUiElements(EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration) {
        destinationUiConfiguration.getClass();
        EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements selectedStateUiElements = destinationUiConfiguration.selectedStateUiElements;
        if (selectedStateUiElements != null) {
            return selectedStateUiElements;
        }
        throw new GeneralPaychecksException("Attempting to render edit distribution screen for " + destinationUiConfiguration.destination + " without selected state UI elements.");
    }

    public static final AndroidViewHolder semanticsIdToView(AndroidViewsHandler androidViewsHandler, int i) {
        Object obj;
        Iterator it = androidViewsHandler.layoutNodeToHolder.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((LayoutNode) ((Map.Entry) obj).getKey()).semanticsId == i) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return (AndroidViewHolder) entry.getValue();
        }
        return null;
    }

    /* renamed from: toLegacyClassName-V4PA4sw, reason: not valid java name */
    public static final String m3425toLegacyClassNameV4PA4sw(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }

    public static final Colors withTint(Colors colors, Color color, Composer composer) {
        colors.getClass();
        androidx.compose.ui.graphics.Color color2 = null;
        ColorModel.Accented accented = color != null ? new ColorModel.Accented(color) : null;
        GapComposer gapComposer = (GapComposer) composer;
        if (accented == null) {
            gapComposer.startReplaceGroup(-1929550017);
        } else {
            gapComposer.startReplaceGroup(-1170622206);
            color2 = ThemablesKt.forTheme(accented, gapComposer);
        }
        gapComposer.end(false);
        return color2 != null ? DimensionKt.m1468withTint4WTKRHQ(colors, color2.value) : colors;
    }
}
