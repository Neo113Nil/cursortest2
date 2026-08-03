package e2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final String f2054a;

    /* renamed from: b, reason: collision with root package name */
    public final oc.e f2055b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2056c;

    public v(String str, oc.e eVar) {
        this.f2054a = str;
        this.f2055b = eVar;
    }

    public final void a(j jVar, Object obj) {
        jVar.d(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f2054a;
    }

    public /* synthetic */ v(String str) {
        this(str, r.f2022w);
    }

    public v(String str, int i10) {
        this(str);
        this.f2056c = true;
    }

    public v(String str, boolean z10, oc.e eVar) {
        this(str, eVar);
        this.f2056c = z10;
    }
}
