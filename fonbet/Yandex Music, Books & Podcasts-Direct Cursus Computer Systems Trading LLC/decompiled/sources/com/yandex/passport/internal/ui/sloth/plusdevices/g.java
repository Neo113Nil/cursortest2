package com.yandex.passport.internal.ui.sloth.plusdevices;

/* loaded from: classes4.dex */
public final class g extends com.yandex.plus.core.locale.b {
    public final com.yandex.passport.internal.properties.o a;

    public g(com.yandex.passport.internal.properties.o oVar) {
        this.a = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && this.a.equals(((g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ShowManagingPlusDevices(properties=" + this.a + ')';
    }
}
