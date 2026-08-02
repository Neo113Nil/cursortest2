package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class dvm extends fvm {
    public final int a = R.string.paymentsdk_loading_title;
    public final boolean b;

    public dvm(boolean z) {
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dvm)) {
            return false;
        }
        dvm dvmVar = (dvm) obj;
        return this.a == dvmVar.a && this.b == dvmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Loading(text=" + this.a + ", showCancel=" + this.b + ")";
    }
}
