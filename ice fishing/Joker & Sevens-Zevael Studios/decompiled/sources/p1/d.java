package p1;

import android.view.KeyEvent;
import y0.m;
import y1.p;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d extends m implements c {

    /* renamed from: u, reason: collision with root package name */
    public p f5425u;

    @Override // p1.c
    public final boolean F(KeyEvent keyEvent) {
        p pVar = this.f5425u;
        if (pVar != null) {
            return ((Boolean) pVar.invoke(new b(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // p1.c
    public final boolean k(KeyEvent keyEvent) {
        return false;
    }
}
