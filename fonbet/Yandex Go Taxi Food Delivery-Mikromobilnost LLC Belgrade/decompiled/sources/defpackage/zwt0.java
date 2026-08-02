package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class zwt0 {
    public final String a;
    public final List b;

    public zwt0(String str, List list) {
        this.a = str;
        this.b = list == null ? new ArrayList() : list;
    }

    public static Object a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) {
            bArr[i] = (byte) ((Integer) list.get(i)).intValue();
        }
        return bArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zwt0)) {
            return false;
        }
        zwt0 zwt0Var = (zwt0) obj;
        List list = zwt0Var.b;
        String str = zwt0Var.a;
        String str2 = this.a;
        if (str2 != null) {
            if (!str2.equals(str)) {
                return false;
            }
        } else if (str != null) {
            return false;
        }
        List list2 = this.b;
        if (list2.size() != list.size()) {
            return false;
        }
        for (int i = 0; i < list2.size(); i++) {
            if ((list2.get(i) instanceof byte[]) && (list.get(i) instanceof byte[])) {
                if (!Arrays.equals((byte[]) list2.get(i), (byte[]) list.get(i))) {
                    return false;
                }
            } else if (!list2.get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        List list = this.b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + list;
        }
        sb.append(str);
        return sb.toString();
    }
}
