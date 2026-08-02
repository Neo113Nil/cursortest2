package com.google.android.material.datepicker;

import J3.ViewOnClickListenerC0317a;
import O.B0;
import O.C0;
import O.L;
import O.X;
import a.AbstractC0426a;
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
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n;
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.material.internal.CheckableImageButton;
import i1.C4585b;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m3.AbstractC4742a;
import x3.ViewOnTouchListenerC5191a;

/* loaded from: classes2.dex */
public final class l<S> extends DialogInterfaceOnCancelListenerC0475n {

    /* renamed from: I0, reason: collision with root package name */
    public final LinkedHashSet f36739I0;

    /* renamed from: J0, reason: collision with root package name */
    public final LinkedHashSet f36740J0;

    /* renamed from: K0, reason: collision with root package name */
    public int f36741K0;

    /* renamed from: L0, reason: collision with root package name */
    public s f36742L0;

    /* renamed from: M0, reason: collision with root package name */
    public b f36743M0;

    /* renamed from: N0, reason: collision with root package name */
    public j f36744N0;

    /* renamed from: O0, reason: collision with root package name */
    public int f36745O0;

    /* renamed from: P0, reason: collision with root package name */
    public CharSequence f36746P0;

    /* renamed from: Q0, reason: collision with root package name */
    public boolean f36747Q0;

    /* renamed from: R0, reason: collision with root package name */
    public int f36748R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f36749S0;

    /* renamed from: T0, reason: collision with root package name */
    public CharSequence f36750T0;

    /* renamed from: U0, reason: collision with root package name */
    public int f36751U0;

    /* renamed from: V0, reason: collision with root package name */
    public CharSequence f36752V0;

    /* renamed from: W0, reason: collision with root package name */
    public int f36753W0;

    /* renamed from: X0, reason: collision with root package name */
    public CharSequence f36754X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f36755Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public CharSequence f36756Z0;

    /* renamed from: a1, reason: collision with root package name */
    public TextView f36757a1;

    /* renamed from: b1, reason: collision with root package name */
    public CheckableImageButton f36758b1;

    /* renamed from: c1, reason: collision with root package name */
    public G3.g f36759c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f36760d1;

    /* renamed from: e1, reason: collision with root package name */
    public CharSequence f36761e1;

    /* renamed from: f1, reason: collision with root package name */
    public CharSequence f36762f1;

    public l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f36739I0 = new LinkedHashSet();
        this.f36740J0 = new LinkedHashSet();
    }

    public static int F(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_content_padding);
        Calendar b9 = v.b();
        b9.set(5, 1);
        Calendar a9 = v.a(b9);
        a9.get(2);
        a9.get(1);
        int maximum = a9.getMaximum(7);
        a9.getActualMaximum(5);
        a9.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(C5248R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean G(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(com.bumptech.glide.e.h(context, j.class.getCanonicalName(), C5248R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z6 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z6;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n
    public final Dialog C() {
        Context y7 = y();
        y();
        int i = this.f36741K0;
        if (i == 0) {
            E();
            throw null;
        }
        Dialog dialog = new Dialog(y7, i);
        Context context = dialog.getContext();
        this.f36747Q0 = G(context, R.attr.windowFullscreen);
        this.f36759c1 = new G3.g(context, null, C5248R.attr.materialCalendarStyle, C5248R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC4742a.f39428l, C5248R.attr.materialCalendarStyle, C5248R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f36759c1.h(context);
        this.f36759c1.j(ColorStateList.valueOf(color));
        G3.g gVar = this.f36759c1;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = X.f2142a;
        gVar.i(L.i(decorView));
        return dialog;
    }

    public final void E() {
        if (this.f5035y.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5035y;
        }
        this.f36741K0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36743M0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36745O0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f36746P0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f36748R0 = bundle.getInt("INPUT_MODE_KEY");
        this.f36749S0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36750T0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f36751U0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36752V0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f36753W0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f36754X0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f36755Y0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f36756Z0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f36746P0;
        if (charSequence == null) {
            charSequence = y().getResources().getText(this.f36745O0);
        }
        this.f36761e1 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f36762f1 = charSequence;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f36739I0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f36740J0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f5018X;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f36747Q0 ? C5248R.layout.mtrl_picker_fullscreen : C5248R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f36747Q0) {
            inflate.findViewById(C5248R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(F(context), -2));
        } else {
            inflate.findViewById(C5248R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(F(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C5248R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = X.f2142a;
        textView.setAccessibilityLiveRegion(1);
        this.f36758b1 = (CheckableImageButton) inflate.findViewById(C5248R.id.mtrl_picker_header_toggle);
        this.f36757a1 = (TextView) inflate.findViewById(C5248R.id.mtrl_picker_title_text);
        this.f36758b1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f36758b1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, com.bumptech.glide.g.h(context, C5248R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], com.bumptech.glide.g.h(context, C5248R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f36758b1.setChecked(this.f36748R0 != 0);
        X.o(this.f36758b1, null);
        CheckableImageButton checkableImageButton2 = this.f36758b1;
        this.f36758b1.setContentDescription(this.f36748R0 == 1 ? checkableImageButton2.getContext().getString(C5248R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(C5248R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f36758b1.setOnClickListener(new ViewOnClickListenerC0317a(3, this));
        E();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void t(Bundle bundle) {
        super.t(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f36741K0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f36743M0;
        a aVar = new a();
        int i = a.f36701b;
        int i4 = a.f36701b;
        long j6 = bVar.f36703n.f36770y;
        long j9 = bVar.f36704u.f36770y;
        aVar.f36702a = Long.valueOf(bVar.f36706w.f36770y);
        j jVar = this.f36744N0;
        n nVar = jVar == null ? null : jVar.f36733x0;
        if (nVar != null) {
            aVar.f36702a = Long.valueOf(nVar.f36770y);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f36705v);
        n b9 = n.b(j6);
        n b10 = n.b(j9);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l9 = aVar.f36702a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b9, b10, dVar, l9 == null ? null : n.b(l9.longValue()), bVar.f36707x));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f36745O0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f36746P0);
        bundle.putInt("INPUT_MODE_KEY", this.f36748R0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f36749S0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f36750T0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36751U0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36752V0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f36753W0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f36754X0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f36755Y0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f36756Z0);
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void u() {
        B0 c02;
        B0 c03;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.u();
        Window window = D().getWindow();
        if (this.f36747Q0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f36759c1);
            if (!this.f36760d1) {
                View findViewById = z().findViewById(C5248R.id.fullscreen_header);
                ColorStateList d9 = com.bumptech.glide.h.d(findViewById.getBackground());
                Integer valueOf = d9 != null ? Integer.valueOf(d9.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z6 = false;
                boolean z9 = valueOf == null || valueOf.intValue() == 0;
                int i4 = Q3.b.i(window.getContext(), R.attr.colorBackground, -16777216);
                if (z9) {
                    valueOf = Integer.valueOf(i4);
                }
                AbstractC0426a.n(window, false);
                window.getContext();
                int d10 = i < 27 ? G.c.d(Q3.b.i(window.getContext(), R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d10);
                boolean z10 = Q3.b.j(0) || Q3.b.j(valueOf.intValue());
                C4585b c4585b = new C4585b(window.getDecorView());
                int i6 = Build.VERSION.SDK_INT;
                if (i6 >= 30) {
                    insetsController2 = window.getInsetsController();
                    c02 = new B0(insetsController2, c4585b);
                    c02.f2119b = window;
                } else {
                    c02 = i6 >= 26 ? new C0(window, c4585b) : new B0(window, c4585b);
                }
                c02.j(z10);
                boolean j6 = Q3.b.j(i4);
                if (Q3.b.j(d10) || (d10 == 0 && j6)) {
                    z6 = true;
                }
                C4585b c4585b2 = new C4585b(window.getDecorView());
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 30) {
                    insetsController = window.getInsetsController();
                    c03 = new B0(insetsController, c4585b2);
                    c03.f2119b = window;
                } else {
                    c03 = i9 >= 26 ? new C0(window, c4585b2) : new B0(window, c4585b2);
                }
                c03.i(z6);
                k kVar = new k(findViewById.getLayoutParams().height, findViewById.getPaddingTop(), findViewById);
                WeakHashMap weakHashMap = X.f2142a;
                L.u(findViewById, kVar);
                this.f36760d1 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = y().getResources().getDimensionPixelOffset(C5248R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f36759c1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new ViewOnTouchListenerC5191a(D(), rect));
        }
        y();
        int i10 = this.f36741K0;
        if (i10 == 0) {
            E();
            throw null;
        }
        E();
        b bVar = this.f36743M0;
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f36706w);
        jVar.B(bundle);
        this.f36744N0 = jVar;
        s sVar = jVar;
        if (this.f36748R0 == 1) {
            E();
            b bVar2 = this.f36743M0;
            s mVar = new m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i10);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            mVar.B(bundle2);
            sVar = mVar;
        }
        this.f36742L0 = sVar;
        this.f36757a1.setText((this.f36748R0 == 1 && y().getResources().getConfiguration().orientation == 2) ? this.f36762f1 : this.f36761e1);
        E();
        throw null;
    }

    @Override // androidx.fragment.app.DialogInterfaceOnCancelListenerC0475n, androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void v() {
        this.f36742L0.f36784u0.clear();
        super.v();
    }
}
