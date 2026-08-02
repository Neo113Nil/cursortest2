package defpackage;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class dnp implements anp {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final int b;
    public final ComponentName c;
    public final String d;
    public final Bundle e;

    static {
        int i2 = dvt.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = Integer.toString(4, 36);
        k = Integer.toString(5, 36);
    }

    public dnp(ComponentName componentName, int i2) {
        String packageName = componentName.getPackageName();
        Bundle bundle = Bundle.EMPTY;
        this.a = i2;
        this.b = 101;
        this.c = componentName;
        this.d = packageName;
        this.e = bundle;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dnp)) {
            return false;
        }
        dnp dnpVar = (dnp) obj;
        int i2 = dnpVar.b;
        int i3 = this.b;
        if (i3 != i2) {
            return false;
        }
        if (i3 == 100) {
            return true;
        }
        if (i3 != 101) {
            return false;
        }
        return Objects.equals(this.c, dnpVar.c);
    }

    @Override // defpackage.anp
    public final Bundle getExtras() {
        return new Bundle(this.e);
    }

    @Override // defpackage.anp
    public final String getServiceName() {
        ComponentName componentName = this.c;
        return componentName == null ? "" : componentName.getClassName();
    }

    @Override // defpackage.anp
    public final int getType() {
        return this.b != 101 ? 0 : 2;
    }

    @Override // defpackage.anp
    public final int getUid() {
        return this.a;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.b), this.c, null);
    }

    @Override // defpackage.anp
    public final Bundle t() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, null);
        bundle.putInt(g, this.a);
        bundle.putInt(h, this.b);
        bundle.putParcelable(i, this.c);
        bundle.putString(j, this.d);
        bundle.putBundle(k, this.e);
        return bundle;
    }

    public final String toString() {
        return f1d.i(new StringBuilder("SessionToken {legacy, uid="), this.a, "}");
    }

    @Override // defpackage.anp
    public final Object u() {
        return null;
    }

    @Override // defpackage.anp
    public final int v() {
        return 0;
    }

    @Override // defpackage.anp
    public final String w() {
        return this.d;
    }

    @Override // defpackage.anp
    public final ComponentName x() {
        return this.c;
    }

    @Override // defpackage.anp
    public final boolean y() {
        return true;
    }

    @Override // defpackage.anp
    public final MediaSession.Token z() {
        return null;
    }
}
