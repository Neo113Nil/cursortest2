package androidx.versionedparcelable;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591 {
    public static int RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867;
    public final AccessibilityNodeInfo ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
    public int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = -1;
    public int ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = -1;

    public BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = accessibilityNodeInfo;
    }

    public static String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.PERMISSION_ERROR /* 4 */:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    public final ArrayList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final CharSequence LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        boolean isEmpty = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273653 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273654 = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.size(); i++) {
            spannableString.setSpan(new ArcticByteClassPolymorphismQocXj7oG99KZu2ivoL67055716461648(((Integer) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273654.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365.get(i)).intValue(), ((Integer) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273652.get(i)).intValue(), ((Integer) AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet424254952273653.get(i)).intValue());
        }
        return spannableString;
    }

    public final void ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(DeltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774 deltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.addAction((AccessibilityNodeInfo.AccessibilityAction) deltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800);
    }

    public final boolean RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(int i) {
        Bundle extras = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void TitanCloudBinaryTreePayloadZY1E16F4U4Ga1z3HTz13447927155333(String str) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.setClassName(str);
    }

    public final void YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170(int i, boolean z) {
        Bundle extras = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591)) {
            return false;
        }
        BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591 blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591 = (BlueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 == blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 && this.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == blueKernelForeachFrameworkWe7B1RaROUQUElJez741347820405591.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            TitanCloudPayloadAPIGAMkFH1GovS2uJ3ky154804989142470.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? BlazePulseCacheMiddlewareVgFhaSnsR8dKq6iwPH45274380347471.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? DragonRouteNormalizationVectorH4IGrt8iaN1z7qFqoP46749888302148.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? WhiteFieldMacroNamespaceWUSqo0DNNzmeXxIYAD20406158457028.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = i >= 36 ? DragonRouteNormalizationVectorH4IGrt8iaN1z7qFqoP46749888302148.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == 1 ? "TRUE" : ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? DragonRouteNormalizationVectorH4IGrt8iaN1z7qFqoP46749888302148.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 = i >= 36 ? DragonRouteNormalizationVectorH4IGrt8iaN1z7qFqoP46749888302148.AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == 0) {
            str = "UNDEFINED";
        } else if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 == 1) {
            str = "COLLAPSED";
        } else if (AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != 2) {
            str = AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365 != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? TitanCloudPayloadAPIGAMkFH1GovS2uJ3ky154804989142470.ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? WhiteFieldMacroNamespaceWUSqo0DNNzmeXxIYAD20406158457028.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(accessibilityNodeInfo) : RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? TitanCloudPayloadAPIGAMkFH1GovS2uJ3ky154804989142470.RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(accessibilityNodeInfo) : RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new DeltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774(actionList.get(i2), 0, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            DeltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774 deltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774 = (DeltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774) arrayList.get(i3);
            Object obj = deltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            Object obj2 = deltaSignalControllerMonitorLycXIOJ86Z8RcDEdQ527610490424774.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
            String ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495(((AccessibilityNodeInfo.AccessibilityAction) obj).getId());
            if (ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel() != null) {
                ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495 = ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel().toString();
            }
            sb.append(ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
