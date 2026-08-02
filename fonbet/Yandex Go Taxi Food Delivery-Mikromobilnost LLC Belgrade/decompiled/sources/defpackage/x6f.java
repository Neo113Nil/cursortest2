package defpackage;

import com.ybsdk.feature.pin.internal.screens.createpin.CreatePinState$PinStatusType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class x6f {
    public static final Throwable c = new Throwable("This is correct behavior");
    public final CreatePinState$PinStatusType a;
    public final Throwable b;

    public x6f(CreatePinState$PinStatusType createPinState$PinStatusType, Throwable th) {
        this.a = createPinState$PinStatusType;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6f)) {
            return false;
        }
        x6f x6fVar = (x6f) obj;
        return this.a == x6fVar.a && jl40.l(this.b, x6fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PinStatus(statusType=" + this.a + ", throwable=" + this.b + Extension.C_BRAKE;
    }
}
