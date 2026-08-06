package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zJPqDeoF0Os1 extends android.view.View.AccessibilityDelegate {
    public final defpackage.Wc0TdmRSwbbi ZpBGe2uQfcn8;

    public zJPqDeoF0Os1(defpackage.Wc0TdmRSwbbi wc0TdmRSwbbi) {
        this.ZpBGe2uQfcn8 = wc0TdmRSwbbi;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.ZpBGe2uQfcn8.WDYagTQQm9ns.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final android.view.accessibility.AccessibilityNodeProvider getAccessibilityNodeProvider(android.view.View view) {
        defpackage.n80 ZpBGe2uQfcn8 = this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(view);
        if (ZpBGe2uQfcn8 != null) {
            return (android.view.accessibility.AccessibilityNodeProvider) ZpBGe2uQfcn8.oh71FJcDz6S2;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.ZpBGe2uQfcn8.WDYagTQQm9ns.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(android.view.View view, android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        java.lang.Object tag;
        java.lang.Object obj;
        java.lang.Object tag2;
        java.lang.Object obj2;
        int i;
        defpackage.I5Vdbaz9SDkL i5Vdbaz9SDkL = new defpackage.I5Vdbaz9SDkL(accessibilityNodeInfo);
        int i2 = defpackage.zt1.ZpBGe2uQfcn8;
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            tag = java.lang.Boolean.valueOf(defpackage.wt1.fWTAfUmVKrZq(view));
        } else {
            tag = view.getTag(com.ice.fishing.wolberta.R.id.tag_screen_reader_focusable);
            if (!java.lang.Boolean.class.isInstance(tag)) {
                tag = null;
            }
        }
        java.lang.Boolean bool = (java.lang.Boolean) tag;
        boolean z = bool != null && bool.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            i5Vdbaz9SDkL.oh71FJcDz6S2(1, z);
        }
        if (i3 >= 28) {
            obj = java.lang.Boolean.valueOf(defpackage.wt1.giKS3J6vZuNy(view));
        } else {
            java.lang.Object tag3 = view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_heading);
            obj = java.lang.Boolean.class.isInstance(tag3) ? tag3 : null;
        }
        java.lang.Boolean bool2 = (java.lang.Boolean) obj;
        boolean z2 = bool2 != null && bool2.booleanValue();
        if (i3 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            i5Vdbaz9SDkL.oh71FJcDz6S2(2, z2);
        }
        if (i3 >= 28) {
            tag2 = defpackage.wt1.ZpBGe2uQfcn8(view);
        } else {
            tag2 = view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_pane_title);
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
            obj2 = defpackage.xt1.ZpBGe2uQfcn8(view);
        } else {
            java.lang.Object tag4 = view.getTag(com.ice.fishing.wolberta.R.id.tag_state_description);
            obj2 = java.lang.CharSequence.class.isInstance(tag4) ? tag4 : null;
        }
        java.lang.CharSequence charSequence2 = (java.lang.CharSequence) obj2;
        if (i3 >= 30) {
            defpackage.omM9cAlgeGXx.P05cfTpS5W5L(accessibilityNodeInfo, charSequence2);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence2);
        }
        this.ZpBGe2uQfcn8.WDYagTQQm9ns.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        java.lang.CharSequence text = accessibilityNodeInfo.getText();
        if (i3 < 26) {
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_clickable_spans);
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
                accessibilityNodeInfo.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", com.ice.fishing.wolberta.R.id.accessibility_action_clickable_span);
                android.util.SparseArray sparseArray2 = (android.util.SparseArray) view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_clickable_spans);
                if (sparseArray2 == null) {
                    sparseArray2 = new android.util.SparseArray();
                    view.setTag(com.ice.fishing.wolberta.R.id.tag_accessibility_clickable_spans, sparseArray2);
                }
                for (int i6 = 0; i6 < clickableSpanArr.length; i6++) {
                    android.text.style.ClickableSpan clickableSpan = clickableSpanArr[i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseArray2.size()) {
                            i = defpackage.I5Vdbaz9SDkL.JhCgjQRTAOCT;
                            defpackage.I5Vdbaz9SDkL.JhCgjQRTAOCT = i + 1;
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
                    i5Vdbaz9SDkL.giKS3J6vZuNy("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(java.lang.Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    i5Vdbaz9SDkL.giKS3J6vZuNy("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(java.lang.Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    i5Vdbaz9SDkL.giKS3J6vZuNy("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(java.lang.Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    i5Vdbaz9SDkL.giKS3J6vZuNy("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(java.lang.Integer.valueOf(i));
                }
            }
        }
        java.util.List list = (java.util.List) view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        for (int i8 = 0; i8 < list.size(); i8++) {
            i5Vdbaz9SDkL.ZpBGe2uQfcn8((defpackage.cCeDCHgnx5OL) list.get(i8));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.ZpBGe2uQfcn8.WDYagTQQm9ns.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(android.view.ViewGroup viewGroup, android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        return this.ZpBGe2uQfcn8.WDYagTQQm9ns.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(android.view.View view, int i, android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        android.text.style.ClickableSpan clickableSpan;
        defpackage.Wc0TdmRSwbbi wc0TdmRSwbbi = this.ZpBGe2uQfcn8;
        wc0TdmRSwbbi.getClass();
        java.util.List list = (java.util.List) view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_actions);
        if (list == null) {
            list = java.util.Collections.EMPTY_LIST;
        }
        for (int i2 = 0; i2 < list.size() && ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) ((defpackage.cCeDCHgnx5OL) list.get(i2)).ZpBGe2uQfcn8).getId() != i; i2++) {
        }
        boolean performAccessibilityAction = wc0TdmRSwbbi.WDYagTQQm9ns.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != com.ice.fishing.wolberta.R.id.accessibility_action_clickable_span || bundle == null) {
            return performAccessibilityAction;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        android.util.SparseArray sparseArray = (android.util.SparseArray) view.getTag(com.ice.fishing.wolberta.R.id.tag_accessibility_clickable_spans);
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
        this.ZpBGe2uQfcn8.WDYagTQQm9ns.sendAccessibilityEvent(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        this.ZpBGe2uQfcn8.WDYagTQQm9ns.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
