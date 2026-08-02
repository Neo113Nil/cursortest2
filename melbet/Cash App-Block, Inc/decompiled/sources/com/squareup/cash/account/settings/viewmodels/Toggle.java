package com.squareup.cash.account.settings.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class Toggle implements Control {
    public final boolean checked;
    public final boolean enabled;
    public final String text;

    public Toggle(String str, boolean z, boolean z2) {
        str.getClass();
        this.text = str;
        this.enabled = z;
        this.checked = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Toggle)) {
            return false;
        }
        Toggle toggle = (Toggle) obj;
        return Intrinsics.areEqual(this.text, toggle.text) && this.enabled == toggle.enabled && this.checked == toggle.checked;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.checked) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.text.hashCode() * 31, 31, this.enabled);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Request$Priority$EnumUnboxingLocalUtility.m1540m("Toggle(text=", this.text, ", enabled=", ", checked=", this.enabled), this.checked, ")");
    }

    public /* synthetic */ Toggle(String str, boolean z, int i) {
        this((i & 1) != 0 ? "" : str, true, z);
    }
}
