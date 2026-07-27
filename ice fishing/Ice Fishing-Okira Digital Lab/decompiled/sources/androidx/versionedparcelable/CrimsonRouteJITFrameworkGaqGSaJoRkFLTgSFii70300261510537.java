package androidx.versionedparcelable;

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
import com.icecatchpuzzle.puzzleicecatch.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class CrimsonRouteJITFrameworkGaqGSaJoRkFLTgSFii70300261510537 extends View.AccessibilityDelegate {
    public final AxiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public CrimsonRouteJITFrameworkGaqGSaJoRkFLTgSFii70300261510537(AxiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460 axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        IronMatrixLambdaInterpreterAMM06uChcWEtStW0Ed29200995437406 ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(view);
        if (ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 != null) {
            return (AccessibilityNodeProvider) ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        Object obj;
        Object tag2;
        Object obj2;
        int i;
        BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591 blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591 = new BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591(accessibilityNodeInfo);
        int i2 = ObsidianEngineRequestAggregationCJ9unXvWW6NxCxO6pK68779594472551.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tag = Boolean.valueOf(QuantumStreamReducerEncryptionXGEuHKVlJrwRvMf5WJ41929160409758.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(view));
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
            blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(1, z);
        }
        if (i3 >= 28) {
            obj = Boolean.valueOf(QuantumStreamReducerEncryptionXGEuHKVlJrwRvMf5WJ41929160409758.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(view));
        } else {
            Object tag3 = view.getTag(R.id.tag_accessibility_heading);
            obj = Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        Boolean bool2 = (Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(2, z2);
        }
        if (i3 >= 28) {
            tag2 = QuantumStreamReducerEncryptionXGEuHKVlJrwRvMf5WJ41929160409758.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(view);
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
            obj2 = ZenithPathServiceObserverLgfjw4jF7E2NcUDR4F38841755274352.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(view);
        } else {
            Object tag4 = view.getTag(R.id.tag_state_description);
            obj2 = CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (i3 >= 30) {
            BlazePulseCacheMiddlewareVgFhaSnsR8dKq6iwPH45274380347471.BlueKernelVectorOverridingCkQwH0H0St1c1Z9Vfg22608212869818(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(view, blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591);
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
                            i = BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
                            BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867 = i + 1;
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
                    blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800((DeltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        AxiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460 axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460.getClass();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((DeltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774) list.get(i2)).ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800).getId() != i; i2++) {
        }
        boolean performAccessibilityAction = axiomCoreBuilderNamespaceKyvsok5t34Z6Vt7XY643022687390460.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.performAccessibilityAction(view, i, bundle);
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
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
