package android.content.Context;

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
import com.frosthunter.arcticwildlands.frozenexpedition.adventure.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterOnDeviceTranslatorPixelThunderNeo8065 extends View.AccessibilityDelegate {
    public final FrostHunterImageAnalysisThunderSolar6127 FrostHunterAlphaAnimationNeoCosmos5761;

    public FrostHunterOnDeviceTranslatorPixelThunderNeo8065(FrostHunterImageAnalysisThunderSolar6127 frostHunterImageAnalysisThunderSolar6127) {
        this.FrostHunterAlphaAnimationNeoCosmos5761 = frostHunterImageAnalysisThunderSolar6127;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        FrostHunterLayoutInflaterTurboHyperion3832 FrostHunterAlphaAnimationNeoCosmos5761 = this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761(view);
        if (FrostHunterAlphaAnimationNeoCosmos5761 != null) {
            return (AccessibilityNodeProvider) FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterFlowMaxDragonHero5809;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        Object obj2;
        int i;
        FrostHunterMenuUltraHyperion3040 frostHunterMenuUltraHyperion3040 = new FrostHunterMenuUltraHyperion3040(accessibilityNodeInfo);
        int i2 = FrostHunterAnimationSetSparkPhantomCelestial7545.FrostHunterAlphaAnimationNeoCosmos5761;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tag = Boolean.valueOf(FrostHunterAssetManagerAlphaTitan5192.FrostHunterBundlePulseFusionHero2475(view));
        } else {
            tag = view.getTag(R.id.tag_screen_reader_focusable);
            if (!Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        Boolean bool = (Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            frostHunterMenuUltraHyperion3040.FrostHunterLevelListDrawableFusionDragonHero2232(1, z);
        }
        if (i3 >= 28) {
            obj = Boolean.valueOf(FrostHunterAssetManagerAlphaTitan5192.FrostHunterConstraintSetCloneMasterUltraRogue2633(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            frostHunterMenuUltraHyperion3040.FrostHunterLevelListDrawableFusionDragonHero2232(2, z2);
        }
        if (i3 >= 28) {
            tag2 = FrostHunterAssetManagerAlphaTitan5192.FrostHunterAlphaAnimationNeoCosmos5761(view);
        } else {
            tag2 = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag2;
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i3 >= 30) {
            obj2 = FrostHunterObjectDetectionEclipseMasterGamma5595.FrostHunterAlphaAnimationNeoCosmos5761(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj2 = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i3 >= 30) {
            FrostHunterImageCaptureThunderHyperion6964.FrostHunterCameraXPixelTurboCosmos9814(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterConstraintSetCloneMasterUltraRogue2633(view, frostHunterMenuUltraHyperion3040);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                SparseArray sparseArray2 = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i6 = 0; i6 < clickableSpanArr.length; i6++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            i = FrostHunterMenuUltraHyperion3040.FrostHunterServiceEliteCelestialThunder1757;
                            FrostHunterMenuUltraHyperion3040.FrostHunterServiceEliteCelestialThunder1757 = i + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i6]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    Spanned spanned = (Spanned) text;
                    frostHunterMenuUltraHyperion3040.FrostHunterConstraintSetCloneMasterUltraRogue2633("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    frostHunterMenuUltraHyperion3040.FrostHunterConstraintSetCloneMasterUltraRogue2633("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    frostHunterMenuUltraHyperion3040.FrostHunterConstraintSetCloneMasterUltraRogue2633("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    frostHunterMenuUltraHyperion3040.FrostHunterConstraintSetCloneMasterUltraRogue2633("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            frostHunterMenuUltraHyperion3040.FrostHunterAlphaAnimationNeoCosmos5761((FrostHunterAdMobMegaEclipsePrime1080) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        FrostHunterImageAnalysisThunderSolar6127 frostHunterImageAnalysisThunderSolar6127 = this.FrostHunterAlphaAnimationNeoCosmos5761;
        frostHunterImageAnalysisThunderSolar6127.getClass();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((FrostHunterAdMobMegaEclipsePrime1080) list.get(i2)).FrostHunterAlphaAnimationNeoCosmos5761).getId() != i; i2++) {
        }
        boolean performAccessibilityAction = frostHunterImageAnalysisThunderSolar6127.FrostHunterAlphaAnimationNeoCosmos5761.performAccessibilityAction(view, i, bundle);
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
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.FrostHunterAlphaAnimationNeoCosmos5761.FrostHunterAlphaAnimationNeoCosmos5761.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
