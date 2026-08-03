package s3;

import java.util.ArrayList;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6405a;

    /* renamed from: b, reason: collision with root package name */
    public final j f6406b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f6407c;

    /* renamed from: d, reason: collision with root package name */
    public int f6408d;

    public a(j jVar) {
        jVar.getClass();
        this.f6405a = new ArrayList();
        this.f6408d = -1;
        this.f6406b = jVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f6408d >= 0) {
            sb.append(" #");
            sb.append(this.f6408d);
        }
        sb.append("}");
        return sb.toString();
    }
}
