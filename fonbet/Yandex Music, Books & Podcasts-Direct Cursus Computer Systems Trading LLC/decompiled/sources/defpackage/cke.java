package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;

/* loaded from: classes6.dex */
public final class cke {
    public final Context a;
    public final hjq b;
    public final Object c;
    public final Object d;

    public cke(Context context) {
        context.getClass();
        hjq hjqVar = new hjq(context);
        context.getClass();
        this.a = context;
        this.b = hjqVar;
        bwf bwfVar = bwf.b;
        this.c = btf.a(bwfVar, new bke(this, 0));
        this.d = btf.a(bwfVar, new bke(this, 1));
    }

    public static final long a(cke ckeVar, PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final wt0 b() {
        return (wt0) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [arf, java.lang.Object] */
    public final String c() {
        return (String) this.d.getValue();
    }
}
