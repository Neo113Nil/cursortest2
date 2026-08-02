package com.yandex.plus.pay.ui.common.api.log;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.theme.MaterialComponentsViewInflater;
import defpackage.de8;
import defpackage.ouc;

/* loaded from: classes5.dex */
public final class b implements LayoutInflater.Factory2 {
    public final String a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final com.yandex.plus.pay.ui.core.mobile.ui.kit.b c;
    public final MaterialComponentsViewInflater d;

    public b(String str, com.yandex.plus.pay.log.impl.b bVar, com.yandex.plus.pay.ui.core.mobile.ui.kit.b bVar2) {
        bVar.getClass();
        this.a = str;
        this.b = bVar;
        this.c = bVar2;
        this.d = new MaterialComponentsViewInflater();
    }

    public static final String a(b bVar, View view) {
        TextView textView;
        CharSequence text;
        StringBuilder sb = new StringBuilder();
        sb.append(view.getClass().getSimpleName());
        if (view.getId() != -1) {
            try {
                sb.append(" [id: " + view.getResources().getResourceEntryName(view.getId()) + ']');
            } catch (Resources.NotFoundException unused) {
                sb.append(" [id: " + view.getId() + ']');
            }
        }
        if ((view instanceof TextView) && (text = (textView = (TextView) view).getText()) != null && text.length() != 0) {
            sb.append(" \"" + ((Object) textView.getText()) + '\"');
        }
        CharSequence contentDescription = view.getContentDescription();
        if (contentDescription != null && contentDescription.length() != 0) {
            sb.append(" (" + ((Object) view.getContentDescription()) + ')');
        }
        Object tag = view.getTag();
        if (tag != null) {
            sb.append(" {tag: " + tag + '}');
        }
        return sb.toString();
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        final View onCreateView = this.c.onCreateView(view, str, context, attributeSet);
        if (onCreateView == null) {
            onCreateView = this.d.f(view, str, context, attributeSet, false);
        }
        if (onCreateView == null) {
            return null;
        }
        if (onCreateView.isClickable()) {
            onCreateView.setOnTouchListener(new de8(6, this));
        }
        if (onCreateView.isClickable()) {
            onCreateView.setOnKeyListener(new ouc(1, this));
        }
        if (onCreateView.isFocusable()) {
            final View.OnFocusChangeListener onFocusChangeListener = onCreateView.getOnFocusChangeListener();
            onCreateView.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.yandex.plus.pay.ui.common.api.log.a
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z) {
                    b bVar = b.this;
                    String str2 = bVar.a;
                    com.yandex.plus.pay.log.impl.b bVar2 = bVar.b;
                    View view3 = onCreateView;
                    if (z) {
                        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
                        bVar2.getClass();
                        bVar2.c(aVar, str2, "User focused on ".concat(b.a(bVar, view3)));
                    } else {
                        com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                        bVar2.getClass();
                        bVar2.c(aVar2, str2, "User unfocused ".concat(b.a(bVar, view3)));
                    }
                    View.OnFocusChangeListener onFocusChangeListener2 = onFocusChangeListener;
                    if (onFocusChangeListener2 != null) {
                        onFocusChangeListener2.onFocusChange(view3, z);
                    }
                }
            });
        }
        return onCreateView;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        str.getClass();
        context.getClass();
        attributeSet.getClass();
        return onCreateView(null, str, context, attributeSet);
    }
}
