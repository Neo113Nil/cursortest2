package defpackage;

/* loaded from: classes5.dex */
public final class lxd {
    public static final lxd c = new lxd();
    public final boolean a = true;
    public final boolean b = true;

    public lxd() {
        if (i4w.o("")) {
            return;
        }
        i4w.o("");
    }

    public final void a(String str, StringBuilder sb) {
        su4.v(sb, str, "prefix = \"", "", "\",");
        sb.append('\n');
        sb.append(str);
        sb.append("suffix = \"");
        sb.append("");
        sb.append("\",");
        sb.append('\n');
        sb.append(str);
        sb.append("removeLeadingZeros = ");
        sb.append(false);
        sb.append(',');
        sb.append('\n');
        sb.append(str);
        sb.append("minLength = ");
        sb.append(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NumberHexFormat(\n");
        a("    ", sb);
        sb.append('\n');
        sb.append(")");
        return sb.toString();
    }
}
