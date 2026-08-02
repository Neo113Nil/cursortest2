package com.yandex.plus.plaquesdk.widget.accessibility;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.ListView;
import defpackage.vb;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class a extends androidx.core.view.a {
    public static final a d = new a();

    @Override // androidx.core.view.a
    public final void d(View view, vb vbVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = vbVar.a;
        this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        if (view.isClickable() || (view.getParent() instanceof ListView)) {
            vbVar.n(Button.class.getName());
        }
        if ((view.getParent() instanceof ListView) && view.isActivated()) {
            accessibilityNodeInfo.setSelected(true);
        }
        if ((view instanceof ViewGroup) && TextUtils.isEmpty(view.getContentDescription())) {
            ArrayList arrayList = new ArrayList();
            com.yandex.plus.bdui.flex.ui.a.m((ViewGroup) view, arrayList);
            if (arrayList.size() > 0) {
                vbVar.r(TextUtils.join(", ", arrayList));
            }
        }
    }
}
