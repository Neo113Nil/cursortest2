package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class m<S> extends s {

    /* renamed from: A0, reason: collision with root package name */
    public int f35995A0;

    /* renamed from: B0, reason: collision with root package name */
    public b f35996B0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5068y;
        }
        this.f35995A0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f35996B0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(d(), this.f35995A0));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0475s
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f35995A0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f35996B0);
    }
}
