package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes10.dex */
public final class six {
    public static final six c = new six("COMPOSITION");
    public final List a;
    public tix b;

    public six(six sixVar) {
        this.a = new ArrayList(sixVar.a);
        this.b = sixVar.b;
    }

    public final six a(String str) {
        six sixVar = new six(this);
        sixVar.a.add(str);
        return sixVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(int i, String str) {
        List list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && ((String) b64.c(1, list)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !((String) list.get(i + 1)).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return ((String) list.get(i2)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) b64.c(1, list)).equals("**"))) {
                }
            }
        }
        return false;
    }

    public final tix c() {
        return this.b;
    }

    public final int d(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean e(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && six.class == obj.getClass()) {
            six sixVar = (six) obj;
            if (!this.a.equals(sixVar.a)) {
                return false;
            }
            tix tixVar = this.b;
            tix tixVar2 = sixVar.b;
            if (tixVar != null) {
                return tixVar.equals(tixVar2);
            }
            if (tixVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final six g(tix tixVar) {
        six sixVar = new six(this);
        sixVar.b = tixVar;
        return sixVar;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        tix tixVar = this.b;
        return hashCode + (tixVar != null ? tixVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return unr0.u(sb, this.b != null, '}');
    }

    public six(String... strArr) {
        this.a = Arrays.asList(strArr);
    }
}
