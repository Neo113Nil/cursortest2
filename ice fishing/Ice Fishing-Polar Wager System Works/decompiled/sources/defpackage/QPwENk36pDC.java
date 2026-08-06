package defpackage;

/* loaded from: classes.dex */
public final class QPwENk36pDC extends android.view.View.AccessibilityDelegate {
    public final defpackage.Ye0N2xE9Hc IHQe1A4L2xu;

    public QPwENk36pDC(defpackage.Ye0N2xE9Hc ye0N2xE9Hc) {
        this.IHQe1A4L2xu = ye0N2xE9Hc;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.IHQe1A4L2xu.adDC3e2L.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        defpackage.F7NU4MC0GW IHQe1A4L2xu = this.IHQe1A4L2xu.IHQe1A4L2xu(view);
        if (IHQe1A4L2xu != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) IHQe1A4L2xu.xiZrDbcSW0;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.IHQe1A4L2xu.adDC3e2L.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object obj;
        java.lang.Object tag2;
        java.lang.Object obj2;
        int i;
        defpackage.dOmtpLcqqI1y domtplcqqi1y = new defpackage.dOmtpLcqqI1y(accessibilityNodeInfo);
        int i2 = defpackage.mm1.IHQe1A4L2xu;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tag = java.lang.Boolean.valueOf(defpackage.jm1.r1MBDhnF(view));
        } else {
            tag = view.getTag(com.combinations.spin.balbi.R.id.tag_screen_reader_focusable);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            domtplcqqi1y.xiZrDbcSW0(1, z);
        }
        if (i3 >= 28) {
            obj = java.lang.Boolean.valueOf(defpackage.jm1.oh6vYeIP(view));
        } else {
            java.lang.Object tag3 = view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_heading);
            obj = java.lang.Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            domtplcqqi1y.xiZrDbcSW0(2, z2);
        }
        if (i3 >= 28) {
            tag2 = defpackage.jm1.IHQe1A4L2xu(view);
        } else {
            tag2 = view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_pane_title);
            if (!java.lang.CharSequence.class.isInstance(tag2)) {
                tag2 = null;
            }
        }
        java.lang.CharSequence charSequence = (java.lang.CharSequence) tag2;
        if (i3 >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
        if (i3 >= 30) {
            obj2 = defpackage.km1.IHQe1A4L2xu(view);
        } else {
            java.lang.Object tag4 = view.getTag(com.combinations.spin.balbi.R.id.tag_state_description);
            obj2 = java.lang.CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj2;
        if (i3 >= 30) {
            defpackage.OtkytngK3Mr.AARZUJiTa(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.IHQe1A4L2xu.adDC3e2L.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((java.lang.ref.WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(java.lang.Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((java.lang.Integer) arrayList.get(i5)).intValue());
                }
            }
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.combinations.spin.balbi.R.id.accessibility_action_clickable_span);
                android.util.SparseArray sparseArray2 = (android.util.SparseArray) view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new android.util.SparseArray();
                    view.setTag(com.combinations.spin.balbi.R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i6 = 0; i6 < clickableSpanArr.length; i6++) {
                    android.text.style.ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            i = defpackage.dOmtpLcqqI1y.F7NU4MC0GW;
                            defpackage.dOmtpLcqqI1y.F7NU4MC0GW = i + 1;
                            break;
                        } else {
                            if (clickableSpan.equals((android.text.style.ClickableSpan) ((java.lang.ref.WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            }
                            i7++;
                        }
                    }
                    sparseArray2.put(i, new java.lang.ref.WeakReference(clickableSpanArr[i6]));
                    android.text.style.ClickableSpan clickableSpan2 = clickableSpanArr[i6];
                    android.text.Spanned spanned = (android.text.Spanned) text;
                    domtplcqqi1y.oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    domtplcqqi1y.oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(java.lang.Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    domtplcqqi1y.oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(java.lang.Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    domtplcqqi1y.oh6vYeIP("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(java.lang.Integer.valueOf(i));
                }
            }
        }
        java.util.List list = (java.util.List) view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            domtplcqqi1y.IHQe1A4L2xu((defpackage.d6FAb9xVJ8GU) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.IHQe1A4L2xu.adDC3e2L.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.IHQe1A4L2xu.adDC3e2L.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        defpackage.Ye0N2xE9Hc ye0N2xE9Hc = this.IHQe1A4L2xu;
        ye0N2xE9Hc.getClass();
        java.util.List list = (java.util.List) view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((defpackage.d6FAb9xVJ8GU) list.get(i2)).IHQe1A4L2xu).getId() != i; i2++) {
        }
        boolean performAccessibilityAction = ye0N2xE9Hc.adDC3e2L.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != com.combinations.spin.balbi.R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.combinations.spin.balbi.R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (java.lang.ref.WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (android.text.style.ClickableSpan) weakReference.get()) != null) {
            java.lang.CharSequence text = view.createAccessibilityNodeInfo().getText();
            android.text.style.ClickableSpan[] clickableSpanArr = text instanceof android.text.Spanned ? (android.text.style.ClickableSpan[]) ((android.text.Spanned) text).getSpans(0, text.length(), android.text.style.ClickableSpan.class) : null;
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
    public final void sendAccessibilityEvent(android.view.View view, int i) {
        this.IHQe1A4L2xu.adDC3e2L.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.IHQe1A4L2xu.adDC3e2L.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
