package com.anythink.basead.ui.thirdparty;

import android.view.View;
import android.view.ViewGroup;
import com.anythink.core.common.d.t;
import com.anythink.core.common.v.k;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f11371a = "Y29tLmh1YXdlaS5vcGVuYWxsaWFuY2UuYWQudmlld3MuVmlkZW9WaWV3";

    public static void a(View view) {
        a(view, k.b(f11371a));
    }

    public static void b(View view) {
        d(view);
    }

    public static void c(final View view) {
        if (view != null) {
            t.b().b(new Runnable() { // from class: com.anythink.basead.ui.thirdparty.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    View view2 = view;
                    if (view2 != null) {
                        view2.setClickable(false);
                        view.setEnabled(false);
                    }
                }
            });
        }
    }

    private static void d(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                c(childAt);
                d(childAt);
            }
        }
    }

    private static void a(View view, String str) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null && childAt.getClass().getName().equals(str)) {
                    c(childAt);
                    return;
                }
                a(childAt, str);
            }
        }
    }
}
