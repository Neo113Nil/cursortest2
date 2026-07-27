package v2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f41407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f41408b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f41409c;

    public g(int i, int i6, boolean z3) {
        this.f41407a = i;
        this.f41408b = i6;
        this.f41409c = z3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (this.f41407a == gVar.f41407a && this.f41408b == gVar.f41408b && this.f41409c == gVar.f41409c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.f41409c ? 1237 : 1231) ^ ((((this.f41407a ^ 1000003) * 1000003) ^ this.f41408b) * 1000003);
    }

    public final String toString() {
        int i = this.f41407a;
        int length = String.valueOf(i).length();
        int i6 = this.f41408b;
        int length2 = String.valueOf(i6).length();
        boolean z3 = this.f41409c;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z3).length() + 1);
        u1.h.h(sb, "OfflineAdConfig{impressionPrerequisite=", i, ", clickPrerequisite=", i6);
        sb.append(", notificationFlowEnabled=");
        sb.append(z3);
        sb.append("}");
        return sb.toString();
    }
}
