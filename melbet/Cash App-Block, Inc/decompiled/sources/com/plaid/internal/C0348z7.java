package com.plaid.internal;

import android.view.View;
import com.plaid.link.R;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.plaid.internal.z7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0348z7 {
    public static final CoroutineScope a(View view) {
        view.getClass();
        Object tag = view.getTag(R.string.plaid_view_coroutine_scope);
        CoroutineScope coroutineScope = tag instanceof CoroutineScope ? (CoroutineScope) tag : null;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        ViewOnAttachStateChangeListenerC0339y7 viewOnAttachStateChangeListenerC0339y7 = new ViewOnAttachStateChangeListenerC0339y7();
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0339y7);
        return viewOnAttachStateChangeListenerC0339y7;
    }
}
