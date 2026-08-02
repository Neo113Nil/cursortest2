package defpackage;

import android.content.Intent;

/* loaded from: classes13.dex */
public final class w7w {
    public final Intent a;
    public final int b;

    public w7w(int i, Intent intent) {
        this.a = intent;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7w)) {
            return false;
        }
        w7w w7wVar = (w7w) obj;
        return this.a.equals(w7wVar.a) && this.b == w7wVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntentData(intent=");
        sb.append(this.a);
        sb.append(", requestCode=");
        return oyr.s(sb, this.b, ')');
    }
}
