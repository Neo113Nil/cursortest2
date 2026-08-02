package defpackage;

import android.util.CloseGuard;

/* loaded from: classes10.dex */
public final class y4c implements z4c {
    public final CloseGuard a = new CloseGuard();

    @Override // defpackage.z4c
    public final void c(String str) {
        this.a.open(str);
    }

    @Override // defpackage.z4c
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.z4c
    public final void e() {
        this.a.warnIfOpen();
    }
}
