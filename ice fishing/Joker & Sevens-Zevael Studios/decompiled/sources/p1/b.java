package p1;

import android.view.KeyEvent;
import pc.j;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final KeyEvent f5424a;

    public final boolean equals(Object obj) {
        if (obj instanceof b) {
            return j.a(this.f5424a, ((b) obj).f5424a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5424a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.f5424a + ')';
    }
}
