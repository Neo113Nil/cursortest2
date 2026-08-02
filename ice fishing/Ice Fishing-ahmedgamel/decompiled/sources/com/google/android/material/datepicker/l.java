package com.google.android.material.datepicker;

import H3.ViewOnClickListenerC0308a;
import L3.F;
import O.B0;
import O.C0;
import O.L;
import O.X;
import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n;
import com.google.android.material.internal.CheckableImageButton;
import com.icefishingapp.icefishing.C5275R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import v3.ViewOnTouchListenerC5113a;

/* loaded from: classes2.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC0471n {

    /* renamed from: N0, reason: collision with root package name */
    public final LinkedHashSet f35971N0;

    /* renamed from: O0, reason: collision with root package name */
    public final LinkedHashSet f35972O0;

    /* renamed from: P0, reason: collision with root package name */
    public int f35973P0;

    /* renamed from: Q0, reason: collision with root package name */
    public s f35974Q0;

    /* renamed from: R0, reason: collision with root package name */
    public b f35975R0;

    /* renamed from: S0, reason: collision with root package name */
    public j f35976S0;

    /* renamed from: T0, reason: collision with root package name */
    public int f35977T0;

    /* renamed from: U0, reason: collision with root package name */
    public CharSequence f35978U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f35979V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f35980W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f35981X0;

    /* renamed from: Y0, reason: collision with root package name */
    public CharSequence f35982Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f35983Z0;

    /* renamed from: a1, reason: collision with root package name */
    public CharSequence f35984a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f35985b1;

    /* renamed from: c1, reason: collision with root package name */
    public CharSequence f35986c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f35987d1;

    /* renamed from: e1, reason: collision with root package name */
    public CharSequence f35988e1;

    /* renamed from: f1, reason: collision with root package name */
    public TextView f35989f1;

    /* renamed from: g1, reason: collision with root package name */
    public CheckableImageButton f35990g1;

    /* renamed from: h1, reason: collision with root package name */
    public E3.g f35991h1;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f35992i1;

    /* renamed from: j1, reason: collision with root package name */
    public CharSequence f35993j1;

    /* renamed from: k1, reason: collision with root package name */
    public CharSequence f35994k1;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f35971N0 = new LinkedHashSet();
        this.f35972O0 = new LinkedHashSet();
    }

    public static int F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_content_padding);
        Calendar b9 = v.b();
        b9.set(5, 1);
        Calendar a9 = v.a(b9);
        a9.get(2);
        a9.get(1);
        int maximum = a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(C5275R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean G(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(F.r(context, j.class.getCanonicalName(), C5275R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z3 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z3;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n
    public final Dialog C() {
        Context y7 = y();
        y();
        int i = this.f35973P0;
        if (i == 0) {
            E();
            throw null;
        }
        Dialog dialog = new Dialog(y7, i);
        Context context = dialog.getContext();
        this.f35979V0 = G(context, R.attr.windowFullscreen);
        this.f35991h1 = new E3.g(context, null, C5275R.attr.materialCalendarStyle, C5275R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4632a.f38639l, C5275R.attr.materialCalendarStyle, C5275R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f35991h1.h(context);
        this.f35991h1.j(ColorStateList.valueOf(color));
        E3.g gVar = this.f35991h1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = X.f2054a;
        gVar.i(L.i(decorView));
        return dialog;
    }

    public final void E() {
        if (this.f5068y.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5068y;
        }
        this.f35973P0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f35975R0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f35977T0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f35978U0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f35980W0 = bundle.getInt("INPUT_MODE_KEY");
        this.f35981X0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35982Y0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f35983Z0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35984a1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f35985b1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35986c1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f35987d1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35988e1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f35978U0;
        if (charSequence == null) {
            charSequence = y().getResources().getText(this.f35977T0);
        }
        this.f35993j1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f35994k1 = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f35971N0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f35972O0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f5050X;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f35979V0 ? C5275R.layout.mtrl_picker_fullscreen : C5275R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f35979V0) {
            inflate.findViewById(C5275R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(F(context), -2));
        } else {
            inflate.findViewById(C5275R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(F(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C5275R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = X.f2054a;
        textView.setAccessibilityLiveRegion(1);
        this.f35990g1 = (CheckableImageButton) inflate.findViewById(C5275R.id.mtrl_picker_header_toggle);
        this.f35989f1 = (TextView) inflate.findViewById(C5275R.id.mtrl_picker_title_text);
        this.f35990g1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f35990g1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, com.bumptech.glide.g.e(context, C5275R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], com.bumptech.glide.g.e(context, C5275R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f35990g1.setChecked(this.f35980W0 != 0);
        X.o(this.f35990g1, null);
        CheckableImageButton checkableImageButton2 = this.f35990g1;
        this.f35990g1.setContentDescription(this.f35980W0 == 1 ? checkableImageButton2.getContext().getString(C5275R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(C5275R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f35990g1.setOnClickListener(new ViewOnClickListenerC0308a(3, this));
        E();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f35973P0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f35975R0;
        a aVar = new a();
        int i = a.f35933b;
        int i6 = a.f35933b;
        long j6 = bVar.f35935n.f36002y;
        long j9 = bVar.f35936u.f36002y;
        aVar.f35934a = Long.valueOf(bVar.f35938w.f36002y);
        j jVar = this.f35976S0;
        n nVar = jVar == null ? null : jVar.C0;
        if (nVar != null) {
            aVar.f35934a = Long.valueOf(nVar.f36002y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f35937v);
        n b9 = n.b(j6);
        n b10 = n.b(j9);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = aVar.f35934a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b9, b10, dVar, l9 == null ? null : n.b(l9.longValue()), bVar.f35939x));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f35977T0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f35978U0);
        bundle.putInt("INPUT_MODE_KEY", this.f35980W0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f35981X0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f35982Y0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35983Z0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35984a1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f35985b1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f35986c1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35987d1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35988e1);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void u() {
        B0 c02;
        B0 c03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.u();
        Window window = D().getWindow();
        if (this.f35979V0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f35991h1);
            if (!this.f35992i1) {
                View findViewById = z().findViewById(C5275R.id.fullscreen_header);
                ColorStateList n9 = V2.a.n(findViewById.getBackground());
                Integer valueOf = n9 != null ? Integer.valueOf(n9.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z3 = false;
                boolean z6 = valueOf == null || valueOf.intValue() == 0;
                int m4 = V2.a.m(window.getContext(), R.attr.colorBackground, -16777216);
                if (z6) {
                    valueOf = Integer.valueOf(m4);
                }
                com.bumptech.glide.d.j(window, false);
                window.getContext();
                int d2 = i < 27 ? G.c.d(V2.a.m(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d2);
                boolean z9 = V2.a.p(0) || V2.a.p(valueOf.intValue());
                I0.j jVar = new I0.j(window.getDecorView());
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    insetsController2 = window.getInsetsController();
                    c02 = new B0(insetsController2, jVar);
                    c02.f2031b = window;
                } else {
                    c02 = i6 >= 26 ? new C0(window, jVar) : new B0(window, jVar);
                }
                c02.x(z9);
                boolean p9 = V2.a.p(m4);
                if (V2.a.p(d2) || (d2 == 0 && p9)) {
                    z3 = true;
                }
                I0.j jVar2 = new I0.j(window.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    insetsController = window.getInsetsController();
                    c03 = new B0(insetsController, jVar2);
                    c03.f2031b = window;
                } else {
                    c03 = i9 >= 26 ? new C0(window, jVar2) : new B0(window, jVar2);
                }
                c03.w(z3);
                k kVar = new k(findViewById.getLayoutParams().height, findViewById.getPaddingTop(), findViewById);
                WeakHashMap weakHashMap = X.f2054a;
                L.u(findViewById, kVar);
                this.f35992i1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = y().getResources().getDimensionPixelOffset(C5275R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f35991h1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC5113a(D(), rect));
        }
        y();
        int i10 = this.f35973P0;
        if (i10 == 0) {
            E();
            throw null;
        }
        E();
        b bVar = this.f35975R0;
        j jVar3 = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f35938w);
        jVar3.B(bundle);
        this.f35976S0 = jVar3;
        s sVar = jVar3;
        if (this.f35980W0 == 1) {
            E();
            b bVar2 = this.f35975R0;
            s mVar = new m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            mVar.B(bundle2);
            sVar = mVar;
        }
        this.f35974Q0 = sVar;
        this.f35989f1.setText((this.f35980W0 == 1 && y().getResources().getConfiguration().orientation == 2) ? this.f35994k1 : this.f35993j1);
        E();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0471n, androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void v() {
        this.f35974Q0.f36016z0.clear();
        super.v();
    }
}
