package defpackage;

import android.view.View;
import coil.view.InterfaceC0134a;

/* loaded from: classes10.dex */
public final class qdi0 implements InterfaceC0134a {
    public final View a;

    public qdi0(View view) {
        this.a = view;
    }

    public final View b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qdi0) {
            return jl40.l(this.a, ((qdi0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }
}
