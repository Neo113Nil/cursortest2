package defpackage;

import android.net.Uri;

/* loaded from: classes8.dex */
public abstract class rz4 implements a1h, dwa0 {
    public final String a;

    public /* synthetic */ rz4(String str) {
        this.a = str;
    }

    @Override // defpackage.a1h
    public boolean a(Uri uri) {
        return jl40.l(uri.getScheme(), this.a);
    }

    @Override // defpackage.a1h
    public syj0 b(Uri uri) {
        return !a(uri) ? new jyj0(d1h.a) : c(uri);
    }

    public abstract syj0 c(Uri uri);

    @Override // defpackage.dwa0
    public String f() {
        return this.a;
    }
}
