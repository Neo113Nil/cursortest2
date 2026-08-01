package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {

    /* renamed from: X, reason: collision with root package name */
    public int f2499X;

    /* renamed from: Y, reason: collision with root package name */
    public b f2500Y;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void t(Bundle bundle) {
        super.t(bundle);
        if (bundle == null) {
            bundle = this.f1603f;
        }
        this.f2499X = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2500Y = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(h(), this.f2499X));
        throw null;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void z(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2499X);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2500Y);
    }
}
