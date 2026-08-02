package defpackage;

import android.view.View;

/* loaded from: classes4.dex */
public final class ri {
    public final View a;
    public final int b;

    public ri(View view, int i) {
        this.a = view;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj;
        return this.b == riVar.b && this.a.equals(riVar.a);
    }

    public final int hashCode() {
        return ((this.a.hashCode() + 31) * 31) + this.b;
    }
}
