package p6;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4840a {

    /* renamed from: b, reason: collision with root package name */
    public static final C4840a f39821b = new C4840a(new Object[0]);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f39822a;

    public C4840a(Object[] objArr) {
        this.f39822a = objArr;
    }

    public static C4840a a() {
        C4840a j6 = AbstractC4844e.f39826b.j();
        return j6 != null ? j6 : f39821b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        while (true) {
            Object[] objArr = this.f39822a;
            if (i >= objArr.length) {
                break;
            }
            sb.append(objArr[i]);
            sb.append('=');
            sb.append(objArr[i + 1]);
            sb.append(", ");
            i += 2;
        }
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append('}');
        return sb.toString();
    }
}
