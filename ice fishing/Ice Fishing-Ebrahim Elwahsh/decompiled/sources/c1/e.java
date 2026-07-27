package c1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f5678c = new e("COMPOSITION");

    /* renamed from: a, reason: collision with root package name */
    public final List f5679a;

    /* renamed from: b, reason: collision with root package name */
    public f f5680b;

    public e(String... strArr) {
        this.f5679a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, String str) {
        List list = this.f5679a;
        if (i < list.size()) {
            boolean z8 = i == list.size() - 1;
            String str2 = (String) list.get(i);
            if (!str2.equals("**")) {
                boolean z9 = str2.equals(str) || str2.equals("*");
                if ((z8 || (i == list.size() - 2 && ((String) list.get(list.size() - 1)).equals("**"))) && z9) {
                    return true;
                }
            } else {
                if (z8 || !((String) list.get(i + 1)).equals(str)) {
                    if (!z8) {
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
        List list = this.f5679a;
        if (((String) list.get(i)).equals("**")) {
            return (i != list.size() - 1 && ((String) list.get(i + 1)).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5679a;
        if (i >= list.size()) {
            return false;
        }
        return ((String) list.get(i)).equals(str) || ((String) list.get(i)).equals("**") || ((String) list.get(i)).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List list = this.f5679a;
        return i < list.size() - 1 || ((String) list.get(i)).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (!this.f5679a.equals(eVar.f5679a)) {
                return false;
            }
            f fVar = this.f5680b;
            f fVar2 = eVar.f5680b;
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
        int hashCode = this.f5679a.hashCode() * 31;
        f fVar = this.f5680b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.f5679a);
        sb.append(",resolved=");
        sb.append(this.f5680b != null);
        sb.append('}');
        return sb.toString();
    }

    public e(e eVar) {
        this.f5679a = new ArrayList(eVar.f5679a);
        this.f5680b = eVar.f5680b;
    }
}
