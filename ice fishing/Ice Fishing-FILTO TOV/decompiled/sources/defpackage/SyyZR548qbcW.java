package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class SyyZR548qbcW {
    public static int xqGvceK5x;
    public final AccessibilityNodeInfo GWasM1elztuh;
    public int Yi7zF1RB1 = -1;
    public int X1lG3V04pd = -1;

    public SyyZR548qbcW(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.GWasM1elztuh = accessibilityNodeInfo;
    }

    public static String X1lG3V04pd(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
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
                                        switch (i) {
                                            case R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void AvO7iQsrTN(String str) {
        this.GWasM1elztuh.setClassName(str);
    }

    public final void EljAMC1QTz(int i, boolean z) {
        Bundle extras = this.GWasM1elztuh.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void GWasM1elztuh(EDwNPVYuViP0 eDwNPVYuViP0) {
        this.GWasM1elztuh.addAction((AccessibilityNodeInfo.AccessibilityAction) eDwNPVYuViP0.GWasM1elztuh);
    }

    public final CharSequence OOA6hdeuvCS() {
        boolean isEmpty = Yi7zF1RB1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.GWasM1elztuh;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList Yi7zF1RB1 = Yi7zF1RB1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList Yi7zF1RB12 = Yi7zF1RB1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList Yi7zF1RB13 = Yi7zF1RB1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList Yi7zF1RB14 = Yi7zF1RB1("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < Yi7zF1RB1.size(); i++) {
            spannableString.setSpan(new z19UFEN2I(((Integer) Yi7zF1RB14.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) Yi7zF1RB1.get(i)).intValue(), ((Integer) Yi7zF1RB12.get(i)).intValue(), ((Integer) Yi7zF1RB13.get(i)).intValue());
        }
        return spannableString;
    }

    public final ArrayList Yi7zF1RB1(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.GWasM1elztuh;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SyyZR548qbcW)) {
            return false;
        }
        SyyZR548qbcW syyZR548qbcW = (SyyZR548qbcW) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = syyZR548qbcW.GWasM1elztuh;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.GWasM1elztuh;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.X1lG3V04pd == syyZR548qbcW.X1lG3V04pd && this.Yi7zF1RB1 == syyZR548qbcW.Yi7zF1RB1;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.GWasM1elztuh;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        AccessibilityNodeInfo accessibilityNodeInfo = this.GWasM1elztuh;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            qugwajBSa59j.Yi7zF1RB1(accessibilityNodeInfo, rect);
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
        sb.append(OOA6hdeuvCS());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? dcDmLGVhzWm.Yi7zF1RB1(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? nXl1EmE5.X1lG3V04pd(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? Qd9Q8OZgvOo4.X1lG3V04pd(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int GWasM1elztuh = i >= 36 ? nXl1EmE5.GWasM1elztuh(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(GWasM1elztuh == 1 ? "TRUE" : GWasM1elztuh == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? nXl1EmE5.xqGvceK5x(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
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
        int Yi7zF1RB1 = i >= 36 ? nXl1EmE5.Yi7zF1RB1(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (Yi7zF1RB1 == 0) {
            str = "UNDEFINED";
        } else if (Yi7zF1RB1 == 1) {
            str = "COLLAPSED";
        } else if (Yi7zF1RB1 != 2) {
            str = Yi7zF1RB1 != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? qugwajBSa59j.X1lG3V04pd(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(xqGvceK5x(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? Qd9Q8OZgvOo4.xqGvceK5x(accessibilityNodeInfo) : xqGvceK5x(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? qugwajBSa59j.xqGvceK5x(accessibilityNodeInfo) : xqGvceK5x(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new EDwNPVYuViP0(actionList.get(i2), 0, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            EDwNPVYuViP0 eDwNPVYuViP0 = (EDwNPVYuViP0) arrayList.get(i3);
            Object obj = eDwNPVYuViP0.GWasM1elztuh;
            Object obj2 = eDwNPVYuViP0.GWasM1elztuh;
            String X1lG3V04pd = X1lG3V04pd(((AccessibilityNodeInfo.AccessibilityAction) obj).getId());
            if (X1lG3V04pd.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel() != null) {
                X1lG3V04pd = ((AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel().toString();
            }
            sb.append(X1lG3V04pd);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean xqGvceK5x(int i) {
        Bundle extras = this.GWasM1elztuh.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }
}
