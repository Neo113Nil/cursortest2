package com.gamericefishpro.space.d4;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import com.gamericefishpro.space.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {
    public static Field a = null;
    public static boolean b = false;
    public static final int[] c = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final y d = new y();
    public static final a0 e = new a0();

    public static void a(ViewGroup viewGroup, View view) {
        viewGroup.getOverlay().add(view);
        View view2 = (View) view.getParent();
        Intrinsics.checkNotNullParameter(view2, "<this>");
        view2.setTag(R.id.view_tree_disjoint_parent, viewGroup);
    }

    public static void b(View view, o1 o1Var) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsC = o1Var.c();
        if (windowInsetsC != null) {
            WindowInsets windowInsetsA = i >= 30 ? i0.a(view, windowInsetsC) : b0.a(view, windowInsetsC);
            if (windowInsetsA.equals(windowInsetsC)) {
                return;
            }
            o1.d(view, windowInsetsA);
        }
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h0.a(view);
        }
        if (b) {
            return null;
        }
        if (a == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                b = true;
                return null;
            }
        }
        try {
            Object obj = a.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            b = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = g0.a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static ArrayList e(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] f(com.gamericefishpro.space.n.s sVar) {
        return Build.VERSION.SDK_INT >= 31 ? j0.a(sVar) : (String[]) sVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void g(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = d(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z) {
                    accessibilityEventObtain.getText().add(d(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(d(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f h(View view, f fVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(fVar);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return j0.b(view, fVar);
        }
        com.gamericefishpro.space.h4.j jVar = (com.gamericefishpro.space.h4.j) view.getTag(R.id.tag_on_receive_content_listener);
        q qVar = d;
        if (jVar == null) {
            if (view instanceof q) {
                qVar = (q) view;
            }
            return qVar.a(fVar);
        }
        f fVarA = com.gamericefishpro.space.h4.j.a(view, fVar);
        if (fVarA == null) {
            return null;
        }
        if (view instanceof q) {
            qVar = (q) view;
        }
        return qVar.a(fVarA);
    }

    public static void i(View view, int i) {
        ArrayList arrayListE = e(view);
        for (int i2 = 0; i2 < arrayListE.size(); i2++) {
            if (((com.gamericefishpro.space.e4.d) arrayListE.get(i2)).a() == i) {
                arrayListE.remove(i2);
                return;
            }
        }
    }

    public static void j(View view, com.gamericefishpro.space.e4.d dVar, com.gamericefishpro.space.e4.q qVar) {
        b bVar;
        com.gamericefishpro.space.e4.d dVar2 = new com.gamericefishpro.space.e4.d(null, dVar.b, null, qVar, dVar.c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        if (accessibilityDelegateC == null) {
            bVar = null;
        } else {
            bVar = accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).a : new b(accessibilityDelegateC);
        }
        if (bVar == null) {
            bVar = new b();
        }
        l(view, bVar);
        i(view, dVar2.a());
        e(view).add(dVar2);
        g(view, 0);
    }

    public static void k(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            h0.b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void l(View view, b bVar) {
        if (bVar == null && (c(view) instanceof a)) {
            bVar = new b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.e);
    }

    public static void m(View view, CharSequence charSequence) {
        Object tag;
        b bVar;
        z zVar = new z();
        zVar.a = R.id.tag_accessibility_pane_title;
        zVar.d = CharSequence.class;
        zVar.c = 8;
        zVar.b = 28;
        if (Build.VERSION.SDK_INT >= zVar.b) {
            g0.d(view, charSequence);
        } else {
            if (Build.VERSION.SDK_INT >= zVar.b) {
                tag = g0.a(view);
            } else {
                tag = view.getTag(zVar.a);
                if (!((Class) zVar.d).isInstance(tag)) {
                    tag = null;
                }
            }
            if (!TextUtils.equals((CharSequence) tag, charSequence)) {
                View.AccessibilityDelegate accessibilityDelegateC = c(view);
                if (accessibilityDelegateC == null) {
                    bVar = null;
                } else {
                    bVar = accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).a : new b(accessibilityDelegateC);
                }
                if (bVar == null) {
                    bVar = new b();
                }
                l(view, bVar);
                view.setTag(zVar.a, charSequence);
                g(view, zVar.c);
            }
        }
        a0 a0Var = e;
        if (charSequence == null) {
            a0Var.d.remove(view);
            view.removeOnAttachStateChangeListener(a0Var);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(a0Var);
        } else {
            a0Var.d.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(a0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(a0Var);
            }
        }
    }

    public static void n(View view, o0 o0Var) {
        if (Build.VERSION.SDK_INT >= 30) {
            view.setWindowInsetsAnimationCallback(o0Var != null ? new u0(o0Var) : null);
            return;
        }
        PathInterpolator pathInterpolator = t0.e;
        View.OnApplyWindowInsetsListener s0Var = o0Var != null ? new s0(view, o0Var) : null;
        view.setTag(R.id.tag_window_insets_animation_callback, s0Var);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(s0Var);
        }
    }
}
