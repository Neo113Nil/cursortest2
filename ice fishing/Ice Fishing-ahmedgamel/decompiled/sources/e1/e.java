package e1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f37236c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f37237a;

    /* renamed from: b, reason: collision with root package name */
    public f f37238b;

    public e(String... strArr) {
        this.f37237a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, String str) {
        List list = this.f37237a;
        if (i < list.size()) {
            boolean z6 = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z9 = str2.equals(str) || str2.equals("*");
                if ((z6 || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z9) {
                    return true;
                }
            } else {
                if (z6 || !((String) list.get(i + 1)).equals(str)) {
                    if (!z6) {
                        int i4 = i + 1;
                        if (i4 >= list.size() - 1) {
                            return ((String) list.get(i4)).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) list.get(list.size() - 1)).equals("**"))) {
                }
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List list = this.f37237a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f37237a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f37237a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f37237a.equals(eVar.f37237a)) {
                return false;
            }
            f fVar = this.f37238b;
            f fVar2 = eVar.f37238b;
            if (fVar != null) {
                return fVar.equals(fVar2);
            }
            if (fVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f37237a.hashCode() * 31;
        f fVar = this.f37238b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f37237a);
        sb.append(",resolved=");
        sb.append(this.f37238b != null);
        sb.append('}');
        return sb.toString();
    }

    public e(e eVar) {
        this.f37237a = new ArrayList(eVar.f37237a);
        this.f37238b = eVar.f37238b;
    }
}
