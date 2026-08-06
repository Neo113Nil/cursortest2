package defpackage;

/* loaded from: classes.dex */
public final class dOmtpLcqqI1y {
    public static int F7NU4MC0GW;
    public final android.view.accessibility.AccessibilityNodeInfo IHQe1A4L2xu;
    public int oh6vYeIP = -1;
    public int r1MBDhnF = -1;

    public dOmtpLcqqI1y(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.IHQe1A4L2xu = accessibilityNodeInfo;
    }

    public static java.lang.String r1MBDhnF(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                return "ACTION_SELECT";
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
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
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case android.R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case android.R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void AARZUJiTa(java.lang.String str) {
        this.IHQe1A4L2xu.setClassName(str);
    }

    public final boolean F7NU4MC0GW(int i) {
        android.os.Bundle extras = this.IHQe1A4L2xu.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final void IHQe1A4L2xu(defpackage.d6FAb9xVJ8GU d6fab9xvj8gu) {
        this.IHQe1A4L2xu.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) d6fab9xvj8gu.IHQe1A4L2xu);
    }

    public final java.lang.CharSequence adDC3e2L() {
        boolean isEmpty = oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.IHQe1A4L2xu;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        java.util.ArrayList oh6vYeIP = oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        java.util.ArrayList oh6vYeIP2 = oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        java.util.ArrayList oh6vYeIP3 = oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        java.util.ArrayList oh6vYeIP4 = oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < oh6vYeIP.size(); i++) {
            spannableString.setSpan(new defpackage.WLpAkxCo(((java.lang.Integer) oh6vYeIP4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((java.lang.Integer) oh6vYeIP.get(i)).intValue(), ((java.lang.Integer) oh6vYeIP2.get(i)).intValue(), ((java.lang.Integer) oh6vYeIP3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.dOmtpLcqqI1y)) {
            return false;
        }
        defpackage.dOmtpLcqqI1y domtplcqqi1y = (defpackage.dOmtpLcqqI1y) obj;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = domtplcqqi1y.IHQe1A4L2xu;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 = this.IHQe1A4L2xu;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.r1MBDhnF == domtplcqqi1y.r1MBDhnF && this.oh6vYeIP == domtplcqqi1y.oh6vYeIP;
    }

    public final int hashCode() {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.IHQe1A4L2xu;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final java.util.ArrayList oh6vYeIP(java.lang.String str) {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.IHQe1A4L2xu;
        java.util.ArrayList<java.lang.Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.IHQe1A4L2xu;
        accessibilityNodeInfo.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 34) {
            defpackage.EoOhNTTfIN7K.oh6vYeIP(accessibilityNodeInfo, rect);
        } else {
            android.graphics.Rect rect2 = (android.graphics.Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
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
        sb.append(adDC3e2L());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? defpackage.OtkytngK3Mr.oh6vYeIP(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? defpackage.cSNyPqwud.r1MBDhnF(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? defpackage.qvFH3dnF.r1MBDhnF(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int IHQe1A4L2xu = i >= 36 ? defpackage.cSNyPqwud.IHQe1A4L2xu(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        java.lang.String str = "PARTIAL";
        sb.append(IHQe1A4L2xu == 1 ? "TRUE" : IHQe1A4L2xu == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? defpackage.cSNyPqwud.F7NU4MC0GW(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
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
        int oh6vYeIP = i >= 36 ? defpackage.cSNyPqwud.oh6vYeIP(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (oh6vYeIP == 0) {
            str = "UNDEFINED";
        } else if (oh6vYeIP == 1) {
            str = "COLLAPSED";
        } else if (oh6vYeIP != 2) {
            str = oh6vYeIP != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? defpackage.EoOhNTTfIN7K.r1MBDhnF(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(F7NU4MC0GW(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(accessibilityNodeInfo.isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? defpackage.qvFH3dnF.F7NU4MC0GW(accessibilityNodeInfo) : F7NU4MC0GW(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? defpackage.EoOhNTTfIN7K.F7NU4MC0GW(accessibilityNodeInfo) : F7NU4MC0GW(64));
        sb.append("; [");
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new defpackage.d6FAb9xVJ8GU(actionList.get(i2), 0, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            defpackage.d6FAb9xVJ8GU d6fab9xvj8gu = (defpackage.d6FAb9xVJ8GU) arrayList.get(i3);
            java.lang.Object obj = d6fab9xvj8gu.IHQe1A4L2xu;
            java.lang.Object obj2 = d6fab9xvj8gu.IHQe1A4L2xu;
            java.lang.String r1MBDhnF = r1MBDhnF(((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj).getId());
            if (r1MBDhnF.equals("ACTION_UNKNOWN") && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel() != null) {
                r1MBDhnF = ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) obj2).getLabel().toString();
            }
            sb.append(r1MBDhnF);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void xiZrDbcSW0(int i, boolean z) {
        android.os.Bundle extras = this.IHQe1A4L2xu.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }
}
