package defpackage;

import android.content.ComponentName;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hrh {
    public final arh a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final qec d;
    public bz2 e;

    public hrh(arh arhVar, boolean z) {
        this.a = arhVar;
        this.d = arhVar.b;
        this.c = z;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
