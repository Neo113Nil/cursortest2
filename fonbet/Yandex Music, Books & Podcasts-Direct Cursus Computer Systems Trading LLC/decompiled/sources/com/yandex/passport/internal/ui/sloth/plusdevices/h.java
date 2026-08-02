package com.yandex.passport.internal.ui.sloth.plusdevices;

/* loaded from: classes4.dex */
public final class h extends com.yandex.plus.core.locale.b {
    public final boolean a;
    public final com.yandex.passport.internal.properties.o b;

    public h(boolean z, com.yandex.passport.internal.properties.o oVar) {
        this.a = z;
        this.b = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.a == hVar.a && this.b.equals(hVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "TryAddPlusDevice(isFirstRequest=" + this.a + ", properties=" + this.b + ')';
    }
}
