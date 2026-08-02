package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class m<S> extends s {

    /* renamed from: v0, reason: collision with root package name */
    public int f36763v0;

    /* renamed from: w0, reason: collision with root package name */
    public b f36764w0;

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void o(Bundle bundle) {
        super.o(bundle);
        if (bundle == null) {
            bundle = this.f5035y;
        }
        this.f36763v0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f36764w0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final View p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(d(), this.f36763v0));
        throw null;
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC0479s
    public final void t(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f36763v0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f36764w0);
    }
}
