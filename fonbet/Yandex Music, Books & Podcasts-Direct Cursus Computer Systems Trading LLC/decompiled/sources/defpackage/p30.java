package defpackage;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.WeakHashMap;
import kotlin.KotlinVersion;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class p30 extends gr0 implements DialogInterface {
    public final n30 f;

    public p30(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, e(contextThemeWrapper, i));
        this.f = new n30(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & KotlinVersion.MAX_COMPONENT_VALUE) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // defpackage.gr0, defpackage.ln5, android.app.Dialog
    public void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        super.onCreate(bundle);
        n30 n30Var = this.f;
        n30Var.b.setContentView(n30Var.z);
        Context context = n30Var.a;
        Window window = n30Var.c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = n30Var.g;
        if (view == null) {
            view = null;
        }
        boolean z = view != null;
        if (!z || !n30.a(view)) {
            window.setFlags(SQLiteDatabase.OPEN_SHAREDCACHE, SQLiteDatabase.OPEN_SHAREDCACHE);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (n30Var.h) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (n30Var.f != null) {
                ((LinearLayout.LayoutParams) ((d7g) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = n30.b(findViewById6, findViewById3);
        ViewGroup b2 = n30.b(findViewById7, findViewById4);
        ViewGroup b3 = n30.b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        n30Var.r = nestedScrollView;
        nestedScrollView.setFocusable(false);
        n30Var.r.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        n30Var.v = textView;
        if (textView != null) {
            CharSequence charSequence = n30Var.e;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                n30Var.r.removeView(n30Var.v);
                if (n30Var.f != null) {
                    ViewGroup viewGroup2 = (ViewGroup) n30Var.r.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(n30Var.r);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(n30Var.f, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        Button button = (Button) b3.findViewById(android.R.id.button1);
        n30Var.i = button;
        je jeVar = n30Var.F;
        button.setOnClickListener(jeVar);
        boolean isEmpty = TextUtils.isEmpty(n30Var.j);
        Button button2 = n30Var.i;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText(n30Var.j);
            n30Var.i.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) b3.findViewById(android.R.id.button2);
        n30Var.l = button3;
        button3.setOnClickListener(jeVar);
        boolean isEmpty2 = TextUtils.isEmpty(n30Var.m);
        Button button4 = n30Var.l;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText(n30Var.m);
            n30Var.l.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) b3.findViewById(android.R.id.button3);
        n30Var.o = button5;
        button5.setOnClickListener(jeVar);
        boolean isEmpty3 = TextUtils.isEmpty(n30Var.p);
        Button button6 = n30Var.o;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText(n30Var.p);
            n30Var.o.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = n30Var.i;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = n30Var.l;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = n30Var.o;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (n30Var.w != null) {
            b.addView(n30Var.w, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            n30Var.t = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(n30Var.d) || !n30Var.D) {
                window.findViewById(R.id.title_template).setVisibility(8);
                n30Var.t.setVisibility(8);
                b.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                n30Var.u = textView2;
                textView2.setText(n30Var.d);
                Drawable drawable = n30Var.s;
                if (drawable != null) {
                    n30Var.t.setImageDrawable(drawable);
                } else {
                    n30Var.u.setPadding(n30Var.t.getPaddingLeft(), n30Var.t.getPaddingTop(), n30Var.t.getPaddingRight(), n30Var.t.getPaddingBottom());
                    n30Var.t.setVisibility(8);
                }
            }
        }
        boolean z2 = viewGroup.getVisibility() != 8;
        int i2 = (b == null || b.getVisibility() == 8) ? 0 : 1;
        boolean z3 = b3.getVisibility() != 8;
        if (!z3 && (findViewById = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = n30Var.r;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = (n30Var.e == null && n30Var.f == null) ? null : b.findViewById(R.id.titleDividerNoCustom);
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = n30Var.f;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.a, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.b);
        }
        if (!z2) {
            View view2 = n30Var.f;
            if (view2 == null) {
                view2 = n30Var.r;
            }
            if (view2 != null) {
                int i3 = z3 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = wdu.a;
                odu.b(view2, i2 | i3, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = n30Var.f;
        if (alertController$RecycleListView2 == null || (listAdapter = n30Var.x) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = n30Var.y;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f.r;
        if (nestedScrollView == null || !nestedScrollView.e(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.gr0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        n30 n30Var = this.f;
        n30Var.d = charSequence;
        TextView textView = n30Var.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
