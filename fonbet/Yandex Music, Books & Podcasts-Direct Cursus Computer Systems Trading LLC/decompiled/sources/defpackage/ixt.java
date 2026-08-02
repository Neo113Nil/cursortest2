package defpackage;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ixt extends kxt {
    public final String b;
    public volatile Uri c;

    public ixt(Uri uri, String str) {
        this.b = str;
        this.c = uri;
    }

    @Override // defpackage.kxt
    public final String c() {
        return this.b;
    }

    public final void j(Uri uri) {
        synchronized (this) {
            if (Intrinsics.d(this.c, uri)) {
                return;
            }
            this.c = uri;
            e(this);
        }
    }
}
