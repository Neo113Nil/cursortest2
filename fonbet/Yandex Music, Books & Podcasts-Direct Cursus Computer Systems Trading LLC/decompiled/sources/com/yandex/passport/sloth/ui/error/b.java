package com.yandex.passport.sloth.ui.error;

import com.yandex.passport.sloth.ui.y0;

/* loaded from: classes4.dex */
public final class b implements c {
    public final y0 a;

    public b(y0 y0Var) {
        this.a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.a.equals(((b) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendUiEvent(event=" + this.a + ')';
    }
}
