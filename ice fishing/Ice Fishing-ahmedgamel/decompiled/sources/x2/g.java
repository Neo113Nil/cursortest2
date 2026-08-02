package x2;

import w.AbstractC5128c;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f41864a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41865b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41866c;

    public g(int i, int i4, boolean z6) {
        this.f41864a = i;
        this.f41865b = i4;
        this.f41866c = z6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f41864a == gVar.f41864a && this.f41865b == gVar.f41865b && this.f41866c == gVar.f41866c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f41866c ? 1237 : 1231) ^ ((((this.f41864a ^ 1000003) * 1000003) ^ this.f41865b) * 1000003);
    }

    public final String toString() {
        int i = this.f41864a;
        int length = String.valueOf(i).length();
        int i4 = this.f41865b;
        int length2 = String.valueOf(i4).length();
        boolean z6 = this.f41866c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z6).length() + 1);
        AbstractC5128c.g(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i4);
        sb.append(", notificationFlowEnabled=");
        sb.append(z6);
        sb.append("}");
        return sb.toString();
    }
}
