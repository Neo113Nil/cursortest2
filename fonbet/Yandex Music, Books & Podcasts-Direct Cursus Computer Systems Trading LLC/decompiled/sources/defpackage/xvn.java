package defpackage;

import android.widget.RemoteViews;

/* loaded from: classes.dex */
public final class xvn {
    public final RemoteViews a;
    public final xne b;

    public xvn(RemoteViews remoteViews, xne xneVar) {
        this.a = remoteViews;
        this.b = xneVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvn)) {
            return false;
        }
        xvn xvnVar = (xvn) obj;
        return this.a.equals(xvnVar.a) && this.b.equals(xvnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RemoteViewsInfo(remoteViews=" + this.a + ", view=" + this.b + ')';
    }
}
