package h;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.WeakHashMap;

/* renamed from: h.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0165f extends D implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    public final C0164e f3207f;

    public DialogInterfaceC0165f(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, i(contextThemeWrapper, i));
        this.f3207f = new C0164e(getContext(), this, getWindow());
    }

    public static int i(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // h.D, b.DialogC0114j, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        C0164e c0164e = this.f3207f;
        c0164e.f3188b.setContentView(c0164e.f3200q);
        Window window = c0164e.f3189c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup a2 = C0164e.a(findViewById6, findViewById3);
        ViewGroup a3 = C0164e.a(findViewById7, findViewById4);
        ViewGroup a4 = C0164e.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0164e.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0164e.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a3.findViewById(android.R.id.message);
        c0164e.f3196m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0164e.i.removeView(c0164e.f3196m);
            if (c0164e.e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0164e.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0164e.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0164e.e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a3.setVisibility(8);
            }
        }
        Button button = (Button) a4.findViewById(android.R.id.button1);
        c0164e.f3191f = button;
        B0.l lVar = c0164e.f3206w;
        button.setOnClickListener(lVar);
        if (TextUtils.isEmpty(null)) {
            c0164e.f3191f.setVisibility(8);
            i = 0;
        } else {
            c0164e.f3191f.setText((CharSequence) null);
            c0164e.f3191f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a4.findViewById(android.R.id.button2);
        c0164e.f3192g = button2;
        button2.setOnClickListener(lVar);
        if (TextUtils.isEmpty(null)) {
            c0164e.f3192g.setVisibility(8);
        } else {
            c0164e.f3192g.setText((CharSequence) null);
            c0164e.f3192g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a4.findViewById(android.R.id.button3);
        c0164e.f3193h = button3;
        button3.setOnClickListener(lVar);
        if (TextUtils.isEmpty(null)) {
            c0164e.f3193h.setVisibility(8);
        } else {
            c0164e.f3193h.setText((CharSequence) null);
            c0164e.f3193h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0164e.f3187a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c0164e.f3191f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c0164e.f3192g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c0164e.f3193h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a4.setVisibility(8);
        }
        if (c0164e.f3197n != null) {
            a2.addView(c0164e.f3197n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            c0164e.f3194k = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(c0164e.f3190d) || !c0164e.f3204u) {
                window.findViewById(R.id.title_template).setVisibility(8);
                c0164e.f3194k.setVisibility(8);
                a2.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                c0164e.f3195l = textView2;
                textView2.setText(c0164e.f3190d);
                Drawable drawable = c0164e.j;
                if (drawable != null) {
                    c0164e.f3194k.setImageDrawable(drawable);
                } else {
                    c0164e.f3195l.setPadding(c0164e.f3194k.getPaddingLeft(), c0164e.f3194k.getPaddingTop(), c0164e.f3194k.getPaddingRight(), c0164e.f3194k.getPaddingBottom());
                    c0164e.f3194k.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (a2 == null || a2.getVisibility() == 8) ? 0 : 1;
        boolean z3 = a4.getVisibility() != 8;
        if (!z3 && (findViewById = a3.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = c0164e.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c0164e.e != null ? a2.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a3.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c0164e.e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z3 || i2 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1743a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1744b);
            }
        }
        if (!z2) {
            View view = c0164e.e;
            if (view == null) {
                view = c0164e.i;
            }
            if (view != null) {
                int i3 = (z3 ? 2 : 0) | i2;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = O.K.f747a;
                O.C.b(view, i3, 3);
                if (findViewById11 != null) {
                    a3.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a3.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c0164e.e;
        if (alertController$RecycleListView2 == null || (listAdapter = c0164e.f3198o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = c0164e.f3199p;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3207f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f3207f.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // h.D, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        C0164e c0164e = this.f3207f;
        c0164e.f3190d = charSequence;
        TextView textView = c0164e.f3195l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
