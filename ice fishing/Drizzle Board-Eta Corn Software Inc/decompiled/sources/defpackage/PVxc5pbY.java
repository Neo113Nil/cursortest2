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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.kolosta.rejin.jilosa.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class PVxc5pbY extends o7 implements DialogInterface, fBtTvv4Q {
    public final lFnz7u6F P7K7Inc8;
    public SJ7tYVsF VgvYg0wo;
    public final dHPzAh2D b2ZJblxo;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [lFnz7u6F] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PVxc5pbY(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int P7K7Inc8 = P7K7Inc8(contextThemeWrapper, i);
        if (P7K7Inc8 == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = P7K7Inc8;
        }
        this.P7K7Inc8 = new bo() { // from class: lFnz7u6F
            @Override // defpackage.bo
            public final boolean MdtA4re8(KeyEvent keyEvent) {
                return PVxc5pbY.this.jb9XjC4I(keyEvent);
            }
        };
        DQL61DDk wxUZMvaN = wxUZMvaN();
        if (P7K7Inc8 == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            P7K7Inc8 = typedValue2.resourceId;
        }
        ((SJ7tYVsF) wxUZMvaN).bvfAo0eO = P7K7Inc8;
        wxUZMvaN.MdtA4re8();
        this.b2ZJblxo = new dHPzAh2D(getContext(), this, getWindow());
    }

    public static int P7K7Inc8(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final void Qr9iLBAD(CharSequence charSequence) {
        super.setTitle(charSequence);
        wxUZMvaN().k3x7lurq(charSequence);
    }

    public final void VgvYg0wo(Bundle bundle) {
        wxUZMvaN().qoPGr6Ce();
        super.onCreate(bundle);
        wxUZMvaN().MdtA4re8();
    }

    @Override // defpackage.o7, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        NCTxEWno();
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) wxUZMvaN();
        sJ7tYVsF.RXQxj5Oe();
        ((ViewGroup) sJ7tYVsF.U0LaHZX7.findViewById(android.R.id.content)).addView(view, layoutParams);
        sJ7tYVsF.ygLcUYwZ.qoPGr6Ce(sJ7tYVsF.OnDfzHZD.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        wxUZMvaN().wxUZMvaN();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return fn.b2ZJblxo(this.P7K7Inc8, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) wxUZMvaN();
        sJ7tYVsF.RXQxj5Oe();
        return sJ7tYVsF.OnDfzHZD.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) wxUZMvaN();
        if (sJ7tYVsF.lDXGDhIF != null) {
            sJ7tYVsF.DK9slbsy();
            sJ7tYVsF.lDXGDhIF.getClass();
            sJ7tYVsF.lwWCatUu(0);
        }
    }

    public final boolean jb9XjC4I(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.o7, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        ListAdapter listAdapter;
        View findViewById;
        VgvYg0wo(bundle);
        dHPzAh2D dhpzah2d = this.b2ZJblxo;
        dhpzah2d.NCTxEWno.setContentView(dhpzah2d.OxcuoDLp);
        Context context = dhpzah2d.qoPGr6Ce;
        Window window = dhpzah2d.MdtA4re8;
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
        ViewGroup qoPGr6Ce = dHPzAh2D.qoPGr6Ce(findViewById6, findViewById3);
        ViewGroup qoPGr6Ce2 = dHPzAh2D.qoPGr6Ce(findViewById7, findViewById4);
        ViewGroup qoPGr6Ce3 = dHPzAh2D.qoPGr6Ce(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        dhpzah2d.jb9XjC4I = nestedScrollView;
        nestedScrollView.setFocusable(false);
        dhpzah2d.jb9XjC4I.setNestedScrollingEnabled(false);
        TextView textView = (TextView) qoPGr6Ce2.findViewById(android.R.id.message);
        dhpzah2d.OnDfzHZD = textView;
        if (textView != null) {
            textView.setVisibility(8);
            dhpzah2d.jb9XjC4I.removeView(dhpzah2d.OnDfzHZD);
            if (dhpzah2d.VgvYg0wo != null) {
                ViewGroup viewGroup2 = (ViewGroup) dhpzah2d.jb9XjC4I.getParent();
                int indexOfChild = viewGroup2.indexOfChild(dhpzah2d.jb9XjC4I);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(dhpzah2d.VgvYg0wo, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                qoPGr6Ce2.setVisibility(8);
            }
        }
        Button button = (Button) qoPGr6Ce3.findViewById(android.R.id.button1);
        dhpzah2d.P7K7Inc8 = button;
        pP9Y2m6O pp9y2m6o = dhpzah2d.FySoLYna;
        button.setOnClickListener(pp9y2m6o);
        boolean isEmpty = TextUtils.isEmpty(null);
        Button button2 = dhpzah2d.P7K7Inc8;
        if (isEmpty) {
            button2.setVisibility(8);
            i = 0;
        } else {
            button2.setText((CharSequence) null);
            dhpzah2d.P7K7Inc8.setVisibility(0);
            i = 1;
        }
        Button button3 = (Button) qoPGr6Ce3.findViewById(android.R.id.button2);
        dhpzah2d.b2ZJblxo = button3;
        button3.setOnClickListener(pp9y2m6o);
        boolean isEmpty2 = TextUtils.isEmpty(null);
        Button button4 = dhpzah2d.b2ZJblxo;
        if (isEmpty2) {
            button4.setVisibility(8);
        } else {
            button4.setText((CharSequence) null);
            dhpzah2d.b2ZJblxo.setVisibility(0);
            i |= 2;
        }
        Button button5 = (Button) qoPGr6Ce3.findViewById(android.R.id.button3);
        dhpzah2d.Qr9iLBAD = button5;
        button5.setOnClickListener(pp9y2m6o);
        boolean isEmpty3 = TextUtils.isEmpty(null);
        Button button6 = dhpzah2d.Qr9iLBAD;
        if (isEmpty3) {
            button6.setVisibility(8);
        } else {
            button6.setText((CharSequence) null);
            dhpzah2d.Qr9iLBAD.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button7 = dhpzah2d.P7K7Inc8;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button7.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button7.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button8 = dhpzah2d.b2ZJblxo;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button8.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button8.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button9 = dhpzah2d.Qr9iLBAD;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button9.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button9.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            qoPGr6Ce3.setVisibility(8);
        }
        if (dhpzah2d.ygLcUYwZ != null) {
            qoPGr6Ce.addView(dhpzah2d.ygLcUYwZ, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            dhpzah2d.k3x7lurq = (ImageView) window.findViewById(android.R.id.icon);
            if (TextUtils.isEmpty(dhpzah2d.wxUZMvaN) || !dhpzah2d.I5GHvsYW) {
                window.findViewById(R.id.title_template).setVisibility(8);
                dhpzah2d.k3x7lurq.setVisibility(8);
                qoPGr6Ce.setVisibility(8);
            } else {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                dhpzah2d.ow5vqvCr = textView2;
                textView2.setText(dhpzah2d.wxUZMvaN);
                Drawable drawable = dhpzah2d.eVhOlqcC;
                if (drawable != null) {
                    dhpzah2d.k3x7lurq.setImageDrawable(drawable);
                } else {
                    dhpzah2d.ow5vqvCr.setPadding(dhpzah2d.k3x7lurq.getPaddingLeft(), dhpzah2d.k3x7lurq.getPaddingTop(), dhpzah2d.k3x7lurq.getPaddingRight(), dhpzah2d.k3x7lurq.getPaddingBottom());
                    dhpzah2d.k3x7lurq.setVisibility(8);
                }
            }
        }
        boolean z = viewGroup.getVisibility() != 8;
        int i2 = (qoPGr6Ce == null || qoPGr6Ce.getVisibility() == 8) ? 0 : 1;
        boolean z2 = qoPGr6Ce3.getVisibility() != 8;
        if (!z2 && (findViewById = qoPGr6Ce2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = dhpzah2d.jb9XjC4I;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            View findViewById9 = dhpzah2d.VgvYg0wo != null ? qoPGr6Ce.findViewById(R.id.titleDividerNoCustom) : null;
            if (findViewById9 != null) {
                findViewById9.setVisibility(0);
            }
        } else {
            View findViewById10 = qoPGr6Ce2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = dhpzah2d.VgvYg0wo;
        if (alertController$RecycleListView != null && (!z2 || i2 == 0)) {
            alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i2 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.NCTxEWno, alertController$RecycleListView.getPaddingRight(), z2 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.MdtA4re8);
        }
        if (!z) {
            View view = dhpzah2d.VgvYg0wo;
            if (view == null) {
                view = dhpzah2d.jb9XjC4I;
            }
            if (view != null) {
                int i3 = z2 ? 2 : 0;
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = hg0.qoPGr6Ce;
                view.setScrollIndicators(i2 | i3, 3);
                if (findViewById11 != null) {
                    qoPGr6Ce2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    qoPGr6Ce2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = dhpzah2d.VgvYg0wo;
        if (alertController$RecycleListView2 == null || (listAdapter = dhpzah2d.lDXGDhIF) == null) {
            return;
        }
        alertController$RecycleListView2.setAdapter(listAdapter);
        int i4 = dhpzah2d.sjUBp5pO;
        if (i4 > -1) {
            alertController$RecycleListView2.setItemChecked(i4, true);
            alertController$RecycleListView2.setSelection(i4);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.b2ZJblxo.jb9XjC4I;
        if (nestedScrollView == null || !nestedScrollView.jb9XjC4I(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.b2ZJblxo.jb9XjC4I;
        if (nestedScrollView == null || !nestedScrollView.jb9XjC4I(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // defpackage.o7, android.app.Dialog
    public final void onStop() {
        super.onStop();
        SJ7tYVsF sJ7tYVsF = (SJ7tYVsF) wxUZMvaN();
        sJ7tYVsF.DK9slbsy();
        zh0 zh0Var = sJ7tYVsF.lDXGDhIF;
        if (zh0Var != null) {
            zh0Var.Ey6iv0m0 = false;
            yg0 yg0Var = zh0Var.KlHjfFWx;
            if (yg0Var != null) {
                yg0Var.qoPGr6Ce();
            }
        }
    }

    @Override // defpackage.o7, android.app.Dialog
    public final void setContentView(int i) {
        NCTxEWno();
        wxUZMvaN().Qr9iLBAD(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        wxUZMvaN().k3x7lurq(getContext().getString(i));
    }

    public final DQL61DDk wxUZMvaN() {
        SJ7tYVsF sJ7tYVsF = this.VgvYg0wo;
        if (sJ7tYVsF != null) {
            return sJ7tYVsF;
        }
        HzhOLUMW hzhOLUMW = DQL61DDk.NCTxEWno;
        SJ7tYVsF sJ7tYVsF2 = new SJ7tYVsF(getContext(), getWindow(), this, this);
        this.VgvYg0wo = sJ7tYVsF2;
        return sJ7tYVsF2;
    }

    @Override // defpackage.o7, android.app.Dialog
    public final void setContentView(View view) {
        NCTxEWno();
        wxUZMvaN().jb9XjC4I(view);
    }

    @Override // defpackage.o7, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        NCTxEWno();
        wxUZMvaN().eVhOlqcC(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        Qr9iLBAD(charSequence);
        dHPzAh2D dhpzah2d = this.b2ZJblxo;
        dhpzah2d.wxUZMvaN = charSequence;
        TextView textView = dhpzah2d.ow5vqvCr;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
