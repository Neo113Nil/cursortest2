package h;

import O.InterfaceC0340j;
import O.X;
import android.R;
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
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.WeakHashMap;
import k.AbstractC4625b;
import k.InterfaceC4624a;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC4552h extends androidx.activity.q implements DialogInterface, InterfaceC4556l {

    /* renamed from: w, reason: collision with root package name */
    public LayoutInflaterFactory2C4537A f37921w;

    /* renamed from: x, reason: collision with root package name */
    public final C4538B f37922x;

    /* renamed from: y, reason: collision with root package name */
    public final C4551g f37923y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC4552h(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i4;
        int e9 = e(contextThemeWrapper, i);
        if (e9 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C5248R.attr.dialogTheme, typedValue, true);
            i4 = typedValue.resourceId;
        } else {
            i4 = e9;
        }
        this.f37922x = new InterfaceC0340j() { // from class: h.B
            @Override // O.InterfaceC0340j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC4552h.this.g(keyEvent);
            }
        };
        p c9 = c();
        if (e9 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C5248R.attr.dialogTheme, typedValue2, true);
            e9 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C4537A) c9).f37823u0 = e9;
        c9.d();
        this.f37923y = new C4551g(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & com.anythink.basead.exoplayer.k.p.f9259b) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5248R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) c();
        layoutInflaterFactory2C4537A.x();
        ((ViewGroup) layoutInflaterFactory2C4537A.f37806T.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C4537A.f37790F.a(layoutInflaterFactory2C4537A.f37788E.getCallback());
    }

    public final p c() {
        if (this.f37921w == null) {
            T0.l lVar = p.f37931n;
            this.f37921w = new LayoutInflaterFactory2C4537A(getContext(), getWindow(), this, this);
        }
        return this.f37921w;
    }

    public final void d(Bundle bundle) {
        c().a();
        super.onCreate(bundle);
        c().d();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        c().e();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return X2.a.g(this.f37922x, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().l(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) c();
        layoutInflaterFactory2C4537A.x();
        return layoutInflaterFactory2C4537A.f37788E.findViewById(i);
    }

    public final boolean g(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        c().b();
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        d(bundle);
        C4551g c4551g = this.f37923y;
        c4551g.f37900b.setContentView(c4551g.f37914q);
        Window window = c4551g.f37901c;
        View findViewById2 = window.findViewById(C5248R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(C5248R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(C5248R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(C5248R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C5248R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(C5248R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(C5248R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(C5248R.id.buttonPanel);
        ViewGroup a9 = C4551g.a(findViewById6, findViewById3);
        ViewGroup a10 = C4551g.a(findViewById7, findViewById4);
        ViewGroup a11 = C4551g.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(C5248R.id.scrollView);
        c4551g.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c4551g.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a10.findViewById(R.id.message);
        c4551g.f37910m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c4551g.i.removeView(c4551g.f37910m);
            if (c4551g.f37903e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c4551g.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c4551g.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c4551g.f37903e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a10.setVisibility(8);
            }
        }
        Button button = (Button) a11.findViewById(R.id.button1);
        c4551g.f37904f = button;
        N3.n nVar = c4551g.f37920w;
        button.setOnClickListener(nVar);
        if (TextUtils.isEmpty(null)) {
            c4551g.f37904f.setVisibility(8);
            i = 0;
        } else {
            c4551g.f37904f.setText((CharSequence) null);
            c4551g.f37904f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a11.findViewById(R.id.button2);
        c4551g.f37905g = button2;
        button2.setOnClickListener(nVar);
        if (TextUtils.isEmpty(null)) {
            c4551g.f37905g.setVisibility(8);
        } else {
            c4551g.f37905g.setText((CharSequence) null);
            c4551g.f37905g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a11.findViewById(R.id.button3);
        c4551g.f37906h = button3;
        button3.setOnClickListener(nVar);
        if (TextUtils.isEmpty(null)) {
            c4551g.f37906h.setVisibility(8);
        } else {
            c4551g.f37906h.setText((CharSequence) null);
            c4551g.f37906h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c4551g.f37899a.getTheme().resolveAttribute(C5248R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c4551g.f37904f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c4551g.f37905g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c4551g.f37906h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a11.setVisibility(8);
        }
        if (c4551g.f37911n != null) {
            a9.addView(c4551g.f37911n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(C5248R.id.title_template).setVisibility(8);
        } else {
            c4551g.f37908k = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c4551g.f37902d) || !c4551g.f37918u) {
                window.findViewById(C5248R.id.title_template).setVisibility(8);
                c4551g.f37908k.setVisibility(8);
                a9.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(C5248R.id.alertTitle);
                c4551g.f37909l = textView2;
                textView2.setText(c4551g.f37902d);
                Drawable drawable = c4551g.f37907j;
                if (drawable != null) {
                    c4551g.f37908k.setImageDrawable(drawable);
                } else {
                    c4551g.f37909l.setPadding(c4551g.f37908k.getPaddingLeft(), c4551g.f37908k.getPaddingTop(), c4551g.f37908k.getPaddingRight(), c4551g.f37908k.getPaddingBottom());
                    c4551g.f37908k.setVisibility(8);
                }
            }
        }
        boolean z6 = viewGroup.getVisibility() != 8;
        int i4 = (a9 == null || a9.getVisibility() == 8) ? 0 : 1;
        boolean z9 = a11.getVisibility() != 8;
        if (!z9 && (findViewById = a10.findViewById(C5248R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i4 != 0) {
            NestedScrollView nestedScrollView2 = c4551g.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c4551g.f37903e != null ? a9.findViewById(C5248R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a10.findViewById(C5248R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c4551g.f37903e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z9 || i4 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i4 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f4439n, alertController$RecycleListView.getPaddingRight(), z9 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f4440u);
            }
        }
        if (!z6) {
            View view = c4551g.f37903e;
            if (view == null) {
                view = c4551g.i;
            }
            if (view != null) {
                int i6 = (z9 ? 2 : 0) | i4;
                View findViewById11 = window.findViewById(C5248R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(C5248R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = X.f2142a;
                O.M.d(view, i6, 3);
                if (findViewById11 != null) {
                    a10.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a10.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c4551g.f37903e;
        if (alertController$RecycleListView2 == null || (listAdapter = c4551g.f37912o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i9 = c4551g.f37913p;
        if (i9 > -1) {
            alertController$RecycleListView2.setItemChecked(i9, true);
            alertController$RecycleListView2.setSelection(i9);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f37923y.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f37923y.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) c();
        layoutInflaterFactory2C4537A.C();
        AbstractC4545a abstractC4545a = layoutInflaterFactory2C4537A.f37794H;
        if (abstractC4545a != null) {
            abstractC4545a.q(false);
        }
    }

    @Override // h.InterfaceC4556l
    public final AbstractC4625b onWindowStartingSupportActionMode(InterfaceC4624a interfaceC4624a) {
        return null;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(int i) {
        b();
        c().i(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().l(getContext().getString(i));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().j(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        C4551g c4551g = this.f37923y;
        c4551g.f37902d = charSequence;
        TextView textView = c4551g.f37909l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().k(view, layoutParams);
    }

    @Override // h.InterfaceC4556l
    public final void onSupportActionModeFinished(AbstractC4625b abstractC4625b) {
    }

    @Override // h.InterfaceC4556l
    public final void onSupportActionModeStarted(AbstractC4625b abstractC4625b) {
    }
}
