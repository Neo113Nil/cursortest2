package defpackage;

import android.content.Intent;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.rf0;
import yads.sf0;

/* loaded from: classes7.dex */
public final class z181 {
    public final Intent a;
    public final rf0 b;
    public final sf0 c;

    public z181(Intent intent, rf0 rf0Var, sf0 sf0Var) {
        this.a = intent;
        this.b = rf0Var;
        this.c = sf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z181) {
            z181 z181Var = (z181) obj;
            return this.a.equals(z181Var.a) && this.b == z181Var.b && this.c == z181Var.c;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DelegatedActivityLaunchInfo(pendingIntent=" + this.a + ", onLaunchSucceed=" + this.b + ", onLaunchFailed=" + this.c + Extension.C_BRAKE;
    }
}
