package com.google.android.material.datepicker;

import O.B;
import O.K;
import O.k0;
import O.m0;
import O.n0;
import V0.ViewOnClickListenerC0050a;
import a.AbstractC0078a;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class MaterialDatePicker<S> extends DialogFragment {

    /* renamed from: A0, reason: collision with root package name */
    public int f2478A0;

    /* renamed from: B0, reason: collision with root package name */
    public CharSequence f2479B0;

    /* renamed from: C0, reason: collision with root package name */
    public int f2480C0;

    /* renamed from: D0, reason: collision with root package name */
    public CharSequence f2481D0;

    /* renamed from: E0, reason: collision with root package name */
    public TextView f2482E0;

    /* renamed from: F0, reason: collision with root package name */
    public CheckableImageButton f2483F0;

    /* renamed from: G0, reason: collision with root package name */
    public S0.g f2484G0;
    public boolean H0;

    /* renamed from: I0, reason: collision with root package name */
    public CharSequence f2485I0;

    /* renamed from: J0, reason: collision with root package name */
    public CharSequence f2486J0;

    /* renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f2487m0;

    /* renamed from: n0, reason: collision with root package name */
    public final LinkedHashSet f2488n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f2489o0;

    /* renamed from: p0, reason: collision with root package name */
    public PickerFragment f2490p0;

    /* renamed from: q0, reason: collision with root package name */
    public b f2491q0;

    /* renamed from: r0, reason: collision with root package name */
    public MaterialCalendar f2492r0;
    public int s0;

    /* renamed from: t0, reason: collision with root package name */
    public CharSequence f2493t0;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2494u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2495v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2496w0;

    /* renamed from: x0, reason: collision with root package name */
    public CharSequence f2497x0;

    /* renamed from: y0, reason: collision with root package name */
    public int f2498y0;
    public CharSequence z0;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f2487m0 = new LinkedHashSet();
        this.f2488n0 = new LinkedHashSet();
    }

    public static int S(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b2 = r.b();
        b2.set(5, 1);
        Calendar a2 = r.a(b2);
        a2.get(2);
        a2.get(1);
        int maximum = a2.getMaximum(7);
        a2.getActualMaximum(5);
        a2.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean T(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0078a.Y(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void A() {
        super.A();
        Window window = P().getWindow();
        if (this.f2494u0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f2484G0);
            if (!this.H0) {
                View findViewById = I().findViewById(R.id.fullscreen_header);
                ColorStateList C2 = AbstractC0078a.C(findViewById.getBackground());
                Integer valueOf = C2 != null ? Integer.valueOf(C2.getDefaultColor()) : null;
                int i = Build.VERSION.SDK_INT;
                boolean z2 = false;
                boolean z3 = valueOf == null || valueOf.intValue() == 0;
                int x2 = AbstractC0078a.x(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z3) {
                    valueOf = Integer.valueOf(x2);
                }
                AbstractC0078a.b0(window, false);
                window.getContext();
                int d2 = i < 27 ? G.a.d(AbstractC0078a.x(window.getContext(), android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(d2);
                boolean z4 = AbstractC0078a.L(0) || AbstractC0078a.L(valueOf.intValue());
                S0.e eVar = new S0.e(window.getDecorView(), 5);
                (i >= 35 ? new n0(window, eVar) : i >= 30 ? new m0(window, eVar) : new k0(window, eVar)).a0(z4);
                boolean L2 = AbstractC0078a.L(x2);
                if (AbstractC0078a.L(d2) || (d2 == 0 && L2)) {
                    z2 = true;
                }
                S0.e eVar2 = new S0.e(window.getDecorView(), 5);
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new n0(window, eVar2) : i2 >= 30 ? new m0(window, eVar2) : new k0(window, eVar2)).Z(z2);
                j jVar = new j(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = K.f747a;
                B.l(findViewById, jVar);
                this.H0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = H().getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f2484G0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new I0.a(P(), rect));
        }
        H();
        int i3 = this.f2489o0;
        if (i3 == 0) {
            R();
            throw null;
        }
        R();
        b bVar = this.f2491q0;
        MaterialCalendar materialCalendar = new MaterialCalendar();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f2507d);
        materialCalendar.L(bundle);
        this.f2492r0 = materialCalendar;
        PickerFragment pickerFragment = materialCalendar;
        if (this.f2495v0 == 1) {
            R();
            b bVar2 = this.f2491q0;
            PickerFragment materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            materialTextInputPicker.L(bundle2);
            pickerFragment = materialTextInputPicker;
        }
        this.f2490p0 = pickerFragment;
        this.f2482E0.setText((this.f2495v0 == 1 && H().getResources().getConfiguration().orientation == 2) ? this.f2486J0 : this.f2485I0);
        R();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void B() {
        this.f2490p0.f2501W.clear();
        super.B();
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog O() {
        Context H2 = H();
        H();
        int i = this.f2489o0;
        if (i == 0) {
            R();
            throw null;
        }
        Dialog dialog = new Dialog(H2, i);
        Context context = dialog.getContext();
        this.f2494u0 = T(context, android.R.attr.windowFullscreen);
        this.f2484G0 = new S0.g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0358a.f4450o, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f2484G0.j(context);
        this.f2484G0.m(ColorStateList.valueOf(color));
        S0.g gVar = this.f2484G0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = K.f747a;
        gVar.l(B.e(decorView));
        return dialog;
    }

    public final void R() {
        if (this.f1603f.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2487m0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2488n0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1584F;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1603f;
        }
        this.f2489o0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2491q0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.s0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f2493t0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f2495v0 = bundle.getInt("INPUT_MODE_KEY");
        this.f2496w0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2497x0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f2498y0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.z0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f2478A0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f2479B0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f2480C0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f2481D0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f2493t0;
        if (charSequence == null) {
            charSequence = H().getResources().getText(this.s0);
        }
        this.f2485I0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f2486J0 = charSequence;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.f2494u0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f2494u0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(S(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(S(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = K.f747a;
        textView.setAccessibilityLiveRegion(1);
        this.f2483F0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f2482E0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f2483F0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f2483F0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, h0.f.n(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], h0.f.n(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f2483F0.setChecked(this.f2495v0 != 0);
        K.l(this.f2483F0, null);
        CheckableImageButton checkableImageButton2 = this.f2483F0;
        this.f2483F0.setContentDescription(this.f2495v0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f2483F0.setOnClickListener(new ViewOnClickListenerC0050a(4, this));
        R();
        throw null;
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f2489o0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        b bVar = this.f2491q0;
        a aVar = new a();
        int i = a.f2502b;
        int i2 = a.f2502b;
        long j = bVar.f2504a.f2532f;
        long j2 = bVar.f2505b.f2532f;
        aVar.f2503a = Long.valueOf(bVar.f2507d.f2532f);
        MaterialCalendar materialCalendar = this.f2492r0;
        k kVar = materialCalendar == null ? null : materialCalendar.f2468Z;
        if (kVar != null) {
            aVar.f2503a = Long.valueOf(kVar.f2532f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", bVar.f2506c);
        k b2 = k.b(j);
        k b3 = k.b(j2);
        d dVar = (d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = aVar.f2503a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new b(b2, b3, dVar, l2 == null ? null : k.b(l2.longValue()), bVar.e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.s0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f2493t0);
        bundle.putInt("INPUT_MODE_KEY", this.f2495v0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f2496w0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f2497x0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2498y0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.z0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f2478A0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f2479B0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f2480C0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f2481D0);
    }
}
