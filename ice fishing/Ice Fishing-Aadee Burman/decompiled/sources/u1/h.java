package u1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {
    public static int a(int i, int i6, String str) {
        return str.length() + i + i6;
    }

    public static String b(char c9, String str, String str2) {
        return str + str2 + c9;
    }

    public static String c(int i, int i6, String str, String str2) {
        return str + i + str2 + i6;
    }

    public static String d(int i, String str, String str2, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        return sb.toString();
    }

    public static String e(int i, String str, StringBuilder sb) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static void h(StringBuilder sb, String str, int i, String str2, int i6) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i6);
    }

    public static void i(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
    }

    public static void j(v4.c cVar, Class cls, Class cls2, Class cls3, Class cls4) {
        cVar.register(cls).provides(cls2);
        cVar.register(cls3).provides(cls4);
    }

    public static int k(int i, int i6, String str) {
        return (str.hashCode() + i) * i6;
    }

    public static /* synthetic */ String l(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String m(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }
}
