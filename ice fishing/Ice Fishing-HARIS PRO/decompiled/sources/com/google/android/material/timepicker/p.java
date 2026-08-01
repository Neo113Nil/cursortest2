package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class p extends L0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2758a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2759b;

    public /* synthetic */ p(int i, Object obj) {
        this.f2758a = i;
        this.f2759b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        Object obj = this.f2759b;
        switch (this.f2758a) {
            case 0:
                try {
                    r rVar = (r) obj;
                    if (TextUtils.isEmpty(editable)) {
                        rVar.f2762b.e = 0;
                    } else {
                        rVar.f2762b.e = Integer.parseInt(editable.toString()) % 60;
                    }
                    break;
                } catch (NumberFormatException unused) {
                    return;
                }
            case 1:
                try {
                    r rVar2 = (r) obj;
                    if (TextUtils.isEmpty(editable)) {
                        rVar2.f2762b.c(0);
                    } else {
                        rVar2.f2762b.c(Integer.parseInt(editable.toString()));
                    }
                    break;
                } catch (NumberFormatException unused2) {
                    return;
                }
            default:
                ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) obj;
                if (!TextUtils.isEmpty(editable)) {
                    int i = ChipTextInputComboView.e;
                    String a2 = k.a(chipTextInputComboView.getResources(), editable, "%02d");
                    if (TextUtils.isEmpty(a2)) {
                        a2 = k.a(chipTextInputComboView.getResources(), "00", "%02d");
                    }
                    chipTextInputComboView.f2662a.setText(a2);
                    break;
                } else {
                    chipTextInputComboView.f2662a.setText(k.a(chipTextInputComboView.getResources(), "00", "%02d"));
                    break;
                }
        }
    }
}
