package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class hxt extends kxt {
    public final String b;
    public volatile String c;

    public hxt(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // defpackage.kxt
    public final String c() {
        return this.b;
    }

    public final void j(String str) {
        synchronized (this) {
            if (Intrinsics.d(this.c, str)) {
                return;
            }
            this.c = str;
            e(this);
        }
    }
}
