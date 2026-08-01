package h;

import O.InterfaceC0335j;
import O.M;
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
import com.icefishing.icefishingbigwin.C5275R;
import java.util.WeakHashMap;
import k.AbstractC4615b;
import k.InterfaceC4614a;

/* renamed from: h.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC4548h extends androidx.activity.q implements DialogInterface, InterfaceC4552l {

    /* renamed from: w, reason: collision with root package name */
    public LayoutInflaterFactory2C4533A f37895w;

    /* renamed from: x, reason: collision with root package name */
    public final C4534B f37896x;

    /* renamed from: y, reason: collision with root package name */
    public final C4547g f37897y;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [h.B] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC4548h(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i6;
        int e9 = e(contextThemeWrapper, i);
        if (e9 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C5275R.attr.dialogTheme, typedValue, true);
            i6 = typedValue.resourceId;
        } else {
            i6 = e9;
        }
        this.f37896x = new InterfaceC0335j() { // from class: h.B
            @Override // O.InterfaceC0335j
            public final boolean superDispatchKeyEvent(KeyEvent keyEvent) {
                return DialogInterfaceC4548h.this.g(keyEvent);
            }
        };
        p c9 = c();
        if (e9 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(C5275R.attr.dialogTheme, typedValue2, true);
            e9 = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C4533A) c9).f37803z0 = e9;
        c9.d();
        this.f37897y = new C4547g(getContext(), this, getWindow());
    }

    public static int e(Context context, int i) {
        if (((i >>> 24) & com.anythink.basead.exoplayer.k.p.f8473b) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C5275R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) c();
        layoutInflaterFactory2C4533A.x();
        ((ViewGroup) layoutInflaterFactory2C4533A.f37785T.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C4533A.f37764F.a(layoutInflaterFactory2C4533A.f37762E.getCallback());
    }

    public final p c() {
        if (this.f37895w == null) {
            T0.l lVar = p.f37905n;
            this.f37895w = new LayoutInflaterFactory2C4533A(getContext(), getWindow(), this, this);
        }
        return this.f37895w;
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
        return X2.e.H(this.f37896x, getWindow().getDecorView(), this, keyEvent);
    }

    public final void f(CharSequence charSequence) {
        super.setTitle(charSequence);
        c().l(charSequence);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) c();
        layoutInflaterFactory2C4533A.x();
        return layoutInflaterFactory2C4533A.f37762E.findViewById(i);
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
        C4547g c4547g = this.f37897y;
        c4547g.f37874b.setContentView(c4547g.f37888q);
        Window window = c4547g.f37875c;
        View findViewById2 = window.findViewById(C5275R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(C5275R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(C5275R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(C5275R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(C5275R.id.customPanel);
        window.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById6 = viewGroup.findViewById(C5275R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(C5275R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(C5275R.id.buttonPanel);
        ViewGroup a9 = C4547g.a(findViewById6, findViewById3);
        ViewGroup a10 = C4547g.a(findViewById7, findViewById4);
        ViewGroup a11 = C4547g.a(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(C5275R.id.scrollView);
        c4547g.i = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c4547g.i.setNestedScrollingEnabled(false);
        TextView textView = (TextView) a10.findViewById(R.id.message);
        c4547g.f37884m = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c4547g.i.removeView(c4547g.f37884m);
            if (c4547g.f37877e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c4547g.i.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c4547g.i);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c4547g.f37877e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                a10.setVisibility(8);
            }
        }
        Button button = (Button) a11.findViewById(R.id.button1);
        c4547g.f37878f = button;
        L3.q qVar = c4547g.f37894w;
        button.setOnClickListener(qVar);
        if (TextUtils.isEmpty(null)) {
            c4547g.f37878f.setVisibility(8);
            i = 0;
        } else {
            c4547g.f37878f.setText((CharSequence) null);
            c4547g.f37878f.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) a11.findViewById(R.id.button2);
        c4547g.f37879g = button2;
        button2.setOnClickListener(qVar);
        if (TextUtils.isEmpty(null)) {
            c4547g.f37879g.setVisibility(8);
        } else {
            c4547g.f37879g.setText((CharSequence) null);
            c4547g.f37879g.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) a11.findViewById(R.id.button3);
        c4547g.f37880h = button3;
        button3.setOnClickListener(qVar);
        if (TextUtils.isEmpty(null)) {
            c4547g.f37880h.setVisibility(8);
        } else {
            c4547g.f37880h.setText((CharSequence) null);
            c4547g.f37880h.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c4547g.f37873a.getTheme().resolveAttribute(C5275R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = c4547g.f37878f;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = c4547g.f37879g;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = c4547g.f37880h;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            a11.setVisibility(8);
        }
        if (c4547g.f37885n != null) {
            a9.addView(c4547g.f37885n, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(C5275R.id.title_template).setVisibility(8);
        } else {
            c4547g.f37882k = (ImageView) window.findViewById(R.id.icon);
            if (TextUtils.isEmpty(c4547g.f37876d) || !c4547g.f37892u) {
                window.findViewById(C5275R.id.title_template).setVisibility(8);
                c4547g.f37882k.setVisibility(8);
                a9.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(C5275R.id.alertTitle);
                c4547g.f37883l = textView2;
                textView2.setText(c4547g.f37876d);
                Drawable drawable = c4547g.f37881j;
                if (drawable != null) {
                    c4547g.f37882k.setImageDrawable(drawable);
                } else {
                    c4547g.f37883l.setPadding(c4547g.f37882k.getPaddingLeft(), c4547g.f37882k.getPaddingTop(), c4547g.f37882k.getPaddingRight(), c4547g.f37882k.getPaddingBottom());
                    c4547g.f37882k.setVisibility(8);
                }
            }
        }
        boolean z3 = viewGroup.getVisibility() != 8;
        int i6 = (a9 == null || a9.getVisibility() == 8) ? 0 : 1;
        boolean z6 = a11.getVisibility() != 8;
        if (!z6 && (findViewById = a10.findViewById(C5275R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i6 != 0) {
            NestedScrollView nestedScrollView2 = c4547g.i;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = c4547g.f37877e != null ? a9.findViewById(C5275R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = a10.findViewById(C5275R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = c4547g.f37877e;
        if (alertController$RecycleListView != null) {
            alertController$RecycleListView.getClass();
            if (!z6 || i6 == 0) {
                alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i6 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f4471n, alertController$RecycleListView.getPaddingRight(), z6 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f4472u);
            }
        }
        if (!z3) {
            View view = c4547g.f37877e;
            if (view == null) {
                view = c4547g.i;
            }
            if (view != null) {
                int i9 = (z6 ? 2 : 0) | i6;
                View findViewById11 = window.findViewById(C5275R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(C5275R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = X.f2054a;
                M.d(view, i9, 3);
                if (findViewById11 != null) {
                    a10.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    a10.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = c4547g.f37877e;
        if (alertController$RecycleListView2 == null || (listAdapter = c4547g.f37886o) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i10 = c4547g.f37887p;
        if (i10 > -1) {
            alertController$RecycleListView2.setItemChecked(i10, true);
            alertController$RecycleListView2.setSelection(i10);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f37897y.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f37897y.i;
        if (nestedScrollView == null || !nestedScrollView.i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C4533A layoutInflaterFactory2C4533A = (LayoutInflaterFactory2C4533A) c();
        layoutInflaterFactory2C4533A.C();
        AbstractC4541a abstractC4541a = layoutInflaterFactory2C4533A.f37768H;
        if (abstractC4541a != null) {
            abstractC4541a.q(false);
        }
    }

    @Override // h.InterfaceC4552l
    public final AbstractC4615b onWindowStartingSupportActionMode(InterfaceC4614a interfaceC4614a) {
        return null;
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(int i) {
        b();
        c().h(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        c().l(getContext().getString(i));
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view) {
        b();
        c().i(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        f(charSequence);
        C4547g c4547g = this.f37897y;
        c4547g.f37876d = charSequence;
        TextView textView = c4547g.f37883l;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.activity.q, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        b();
        c().j(view, layoutParams);
    }

    @Override // h.InterfaceC4552l
    public final void onSupportActionModeFinished(AbstractC4615b abstractC4615b) {
    }

    @Override // h.InterfaceC4552l
    public final void onSupportActionModeStarted(AbstractC4615b abstractC4615b) {
    }
}
