package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* loaded from: classes.dex */
public final class g5n implements kci {
    public final Context a;
    public final kci b;
    public final kci c;
    public final Class d;

    public g5n(Context context, kci kciVar, kci kciVar2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = kciVar;
        this.c = kciVar2;
        this.d = cls;
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        Uri uri = (Uri) obj;
        return new jci(new vhj(uri), new f5n(this.a, this.b, this.c, uri, i, i2, pwjVar, this.d));
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && o5g.J((Uri) obj);
    }
}
