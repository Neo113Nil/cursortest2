package defpackage;

import android.view.KeyEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class qaf {
    public final KeyEvent a;

    public final boolean equals(Object obj) {
        if (obj instanceof qaf) {
            return Intrinsics.d(this.a, ((qaf) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "KeyEvent(nativeKeyEvent=" + this.a + ')';
    }
}
