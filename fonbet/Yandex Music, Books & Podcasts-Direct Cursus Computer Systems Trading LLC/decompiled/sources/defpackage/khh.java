package defpackage;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class khh implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final h4b d;
    public final HashMap e = new HashMap();
    public nnd f;
    public final /* synthetic */ bih g;

    public khh(bih bihVar, String str, int i, int i2, h4b h4bVar) {
        this.g = bihVar;
        this.a = str;
        this.b = i;
        this.c = i2;
        if (str == null) {
            jj4.j("package shouldn't be null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            xq0.x("packageName should be nonempty");
            throw null;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            auh.a(i, i2, str);
        }
        this.d = h4bVar;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.e.post(new dsd(13, this));
    }
}
