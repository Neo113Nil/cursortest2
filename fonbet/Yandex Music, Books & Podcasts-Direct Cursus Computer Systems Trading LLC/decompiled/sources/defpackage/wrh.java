package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class wrh {
    public final xth a;
    public final int b;
    public final int c;
    public final vrh d;
    public final Bundle e;

    public wrh(xth xthVar, int i, int i2, boolean z, vrh vrhVar, Bundle bundle) {
        this.a = xthVar;
        this.b = i;
        this.c = i2;
        this.d = vrhVar;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wrh)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        wrh wrhVar = (wrh) obj;
        vrh vrhVar = wrhVar.d;
        vrh vrhVar2 = this.d;
        return (vrhVar2 == null && vrhVar == null) ? this.a.equals(wrhVar.a) : Objects.equals(vrhVar2, vrhVar);
    }

    public final int hashCode() {
        return Objects.hash(this.d, this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ControllerInfo {pkg=");
        xth xthVar = this.a;
        sb.append(xthVar.a.a);
        sb.append(", uid=");
        return f1d.i(sb, xthVar.a.c, "}");
    }
}
