package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
abstract class w0 {
    public static String a(g gVar) {
        v0 v0Var = new v0(gVar);
        StringBuilder sb = new StringBuilder(gVar.size());
        int i = 0;
        while (true) {
            g gVar2 = v0Var.a;
            if (i >= gVar2.size()) {
                return sb.toString();
            }
            byte a = gVar2.a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
            i++;
        }
    }
}
