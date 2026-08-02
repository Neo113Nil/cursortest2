package defpackage;

import android.os.IBinder;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class jhh implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final xth d;
    public final mka e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ nuh g;

    public jhh(nuh nuhVar, String str, int i, int i2, mka mkaVar) {
        this.g = nuhVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new xth(str, i, i2);
        this.e = mkaVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.g.post(new dsd(12, this));
    }
}
