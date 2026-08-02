package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class y121 extends u0x implements s7u {
    public final Integer a;

    public y121(Integer num) {
        this.a = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y121) && jl40.l(this.a, ((y121) obj).a);
    }

    @Override // defpackage.s7u
    public final Object getItemId() {
        return this.a;
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return "UnknownSectionSkeletonItem(itemId=" + this.a + Extension.C_BRAKE;
    }

    public y121() {
        this(null);
    }
}
