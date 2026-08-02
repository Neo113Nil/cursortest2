package defpackage;

/* loaded from: classes5.dex */
public final class tjk {
    public String a;
    public String b;

    public final boolean equals(Object obj) {
        if (obj instanceof tjk) {
            tjk tjkVar = (tjk) obj;
            if (tjkVar != this) {
                String str = this.a;
                String str2 = tjkVar.a;
                if (str == str2 ? true : str.equals(str2)) {
                    String str3 = this.b;
                    String str4 = tjkVar.b;
                    if (str3 == str4 ? true : (str3 == null || str4 == null) ? false : str3.equals(str4)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        String str = this.b;
        return ((str == null ? 1 : str.hashCode()) * 31) + hashCode;
    }
}
