package com.google.android.material.timepicker;

import O.B;
import O.K;
import a.AbstractC0078a;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.button.MaterialButton;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public final class MaterialTimePicker extends DialogFragment {

    /* renamed from: A0, reason: collision with root package name */
    public CharSequence f2700A0;

    /* renamed from: C0, reason: collision with root package name */
    public CharSequence f2702C0;

    /* renamed from: D0, reason: collision with root package name */
    public MaterialButton f2703D0;

    /* renamed from: E0, reason: collision with root package name */
    public Button f2704E0;

    /* renamed from: G0, reason: collision with root package name */
    public k f2706G0;

    /* renamed from: q0, reason: collision with root package name */
    public TimePickerView f2711q0;

    /* renamed from: r0, reason: collision with root package name */
    public ViewStub f2712r0;
    public m s0;

    /* renamed from: t0, reason: collision with root package name */
    public r f2713t0;

    /* renamed from: u0, reason: collision with root package name */
    public Object f2714u0;

    /* renamed from: v0, reason: collision with root package name */
    public int f2715v0;

    /* renamed from: w0, reason: collision with root package name */
    public int f2716w0;

    /* renamed from: y0, reason: collision with root package name */
    public CharSequence f2718y0;

    /* renamed from: m0, reason: collision with root package name */
    public final LinkedHashSet f2707m0 = new LinkedHashSet();

    /* renamed from: n0, reason: collision with root package name */
    public final LinkedHashSet f2708n0 = new LinkedHashSet();

    /* renamed from: o0, reason: collision with root package name */
    public final LinkedHashSet f2709o0 = new LinkedHashSet();

    /* renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f2710p0 = new LinkedHashSet();

    /* renamed from: x0, reason: collision with root package name */
    public int f2717x0 = 0;
    public int z0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    public int f2701B0 = 0;

    /* renamed from: F0, reason: collision with root package name */
    public int f2705F0 = 0;
    public int H0 = 0;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        if (this.f2714u0 instanceof r) {
            view.postDelayed(new g(0, this), 100L);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog O() {
        Context H2 = H();
        int i = this.H0;
        if (i == 0) {
            TypedValue U2 = AbstractC0078a.U(H(), R.attr.materialTimePickerTheme);
            i = U2 == null ? 0 : U2.data;
        }
        Dialog dialog = new Dialog(H2, i);
        Context context = dialog.getContext();
        S0.g gVar = new S0.g(context, null, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0358a.f4458w, R.attr.materialTimePickerStyle, R.style.Widget_MaterialComponents_TimePicker);
        this.f2716w0 = obtainStyledAttributes.getResourceId(1, 0);
        this.f2715v0 = obtainStyledAttributes.getResourceId(2, 0);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        gVar.j(context);
        gVar.m(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(gVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        View decorView = window.getDecorView();
        WeakHashMap weakHashMap = K.f747a;
        gVar.l(B.e(decorView));
        return dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.google.android.material.timepicker.n, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.timepicker.n, java.lang.Object] */
    public final void R(MaterialButton materialButton) {
        r rVar;
        Pair pair;
        if (materialButton == null || this.f2711q0 == null || this.f2712r0 == null) {
            return;
        }
        ?? r02 = this.f2714u0;
        if (r02 != 0) {
            r02.e();
        }
        int i = this.f2705F0;
        TimePickerView timePickerView = this.f2711q0;
        ViewStub viewStub = this.f2712r0;
        if (i == 0) {
            m mVar = this.s0;
            m mVar2 = mVar;
            if (mVar == null) {
                mVar2 = new m(timePickerView, this.f2706G0);
            }
            this.s0 = mVar2;
            rVar = mVar2;
        } else {
            if (this.f2713t0 == null) {
                this.f2713t0 = new r((LinearLayout) viewStub.inflate(), this.f2706G0);
            }
            r rVar2 = this.f2713t0;
            rVar2.e.setChecked(false);
            rVar2.f2765f.setChecked(false);
            rVar = this.f2713t0;
        }
        this.f2714u0 = rVar;
        rVar.c();
        this.f2714u0.f();
        int i2 = this.f2705F0;
        if (i2 == 0) {
            pair = new Pair(Integer.valueOf(this.f2715v0), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i2 != 1) {
                throw new IllegalArgumentException(D1.h.e("no icon for mode: ", i2));
            }
            pair = new Pair(Integer.valueOf(this.f2716w0), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(H().getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f2709o0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f2710p0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1603f;
        }
        if (bundle == null) {
            return;
        }
        k kVar = (k) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.f2706G0 = kVar;
        if (kVar == null) {
            this.f2706G0 = new k(0, 0, 10, 0);
        }
        this.f2705F0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.f2706G0.f2742c != 1 ? 0 : 1);
        this.f2717x0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.f2718y0 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.z0 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.f2700A0 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.f2701B0 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.f2702C0 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.H0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f2711q0 = timePickerView;
        timePickerView.f2727x = this;
        this.f2712r0 = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f2703D0 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.f2717x0;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f2718y0)) {
            textView.setText(this.f2718y0);
        }
        R(this.f2703D0);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new h(this, 0));
        int i2 = this.z0;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f2700A0)) {
            button.setText(this.f2700A0);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f2704E0 = button2;
        button2.setOnClickListener(new h(this, 1));
        int i3 = this.f2701B0;
        if (i3 != 0) {
            this.f2704E0.setText(i3);
        } else if (!TextUtils.isEmpty(this.f2702C0)) {
            this.f2704E0.setText(this.f2702C0);
        }
        Button button3 = this.f2704E0;
        if (button3 != null) {
            button3.setVisibility(this.f1969c0 ? 0 : 8);
        }
        this.f2703D0.setOnClickListener(new h(this, 2));
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void v() {
        super.v();
        this.f2714u0 = null;
        this.s0 = null;
        this.f2713t0 = null;
        TimePickerView timePickerView = this.f2711q0;
        if (timePickerView != null) {
            timePickerView.f2727x = null;
            this.f2711q0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, Z.AbstractComponentCallbacksC0070s
    public final void z(Bundle bundle) {
        super.z(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f2706G0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f2705F0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f2717x0);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f2718y0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.z0);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f2700A0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f2701B0);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f2702C0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.H0);
    }
}
