package defpackage;

/* loaded from: classes3.dex */
public final class veb {
    public final long a;
    public final String b;
    public final String c;

    public veb(long j, String str, String str2) {
        this.a = j;
        this.b = str;
        this.c = str2;
    }

    public static veb a(long j, String str, String str2) {
        if (str == null || str2 == null) {
            throw null;
        }
        return new veb(j, str, str2);
    }

    public static veb b(Exception exc) {
        exc.getClass();
        return new veb(-1L, "error", exc.getMessage());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof veb)) {
            return false;
        }
        veb vebVar = (veb) obj;
        if (this.a != vebVar.a) {
            return false;
        }
        String str = vebVar.b;
        String str2 = this.b;
        if (str2 != null ? !str2.equals(str) : str != null) {
            return false;
        }
        String str3 = vebVar.c;
        String str4 = this.c;
        return str4 != null ? str4.equals(str3) : str3 == null;
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) ((j >>> 32) ^ j)) + 59) * 59;
        String str = this.b;
        int hashCode = (i + (str == null ? 43 : str.hashCode())) * 59;
        String str2 = this.c;
        return hashCode + (str2 != null ? str2.hashCode() : 43);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(code=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", message=");
        return su4.o(sb, this.c, ")");
    }
}
