package com.google.android.datatransport;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.icewinter.flow.winter.icecatch.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-548aee5da8eff46005463ebe9e9e6d0246428ebf3153b8af4dadfbd57572a0a1 */
/* loaded from: classes.dex */
public final class WinterFlowRuntimeFramework extends View.AccessibilityDelegate {
    public final WinterFlowSyntaxCloud WinterFlowRouterStructure;

    public WinterFlowRuntimeFramework(WinterFlowSyntaxCloud winterFlowSyntaxCloud) {
        this.WinterFlowRouterStructure = winterFlowSyntaxCloud;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        WinterFlowConfigurationModule WinterFlowRouterStructure = this.WinterFlowRouterStructure.WinterFlowRouterStructure(view);
        if (WinterFlowRouterStructure != null) {
            return (AccessibilityNodeProvider) WinterFlowRouterStructure.WinterFlowTransactionManagerStrategy;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        WinterFlowFrameworkDataSource winterFlowFrameworkDataSource = new WinterFlowFrameworkDataSource(accessibilityNodeInfo);
        int i = WinterFlowIDEComponent.WinterFlowRouterStructure;
        int i2 = Build.VERSION.SDK_INT;
        Object obj2 = null;
        if (i2 >= 28) {
            tag = Boolean.valueOf(WinterFlowFunctionUtility.WinterFlowCacheManagerAgent(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            winterFlowFrameworkDataSource.WinterFlowTransactionManagerStrategy(1, z);
        }
        if (i2 >= 28) {
            obj = Boolean.valueOf(WinterFlowFunctionUtility.WinterFlowHookDataSource(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            winterFlowFrameworkDataSource.WinterFlowTransactionManagerStrategy(2, z2);
        }
        if (i2 >= 28) {
            tag2 = WinterFlowFunctionUtility.WinterFlowRouterStructure(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i2 >= 30) {
            obj2 = WinterFlowAPI.WinterFlowRouterStructure(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            if (CharSequence.class.isInstance(tag4)) {
                obj2 = tag4;
            }
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i2 >= 30) {
            WinterFlowDebugPlatform.WinterFlowSyntax(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.WinterFlowRouterStructure.WinterFlowHookDataSource(view, winterFlowFrameworkDataSource);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i3 = 0; i3 < list.size(); i3++) {
            winterFlowFrameworkDataSource.WinterFlowRouterStructure((WinterFlowStrategyUserManager) list.get(i3));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((WinterFlowStrategyUserManager) list.get(i2)).WinterFlowRouterStructure).getId() != i; i2++) {
        }
        boolean performAccessibilityAction = this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.WinterFlowRouterStructure.WinterFlowVariableVersionControl.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
