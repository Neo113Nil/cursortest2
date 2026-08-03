package pc;

import java.io.Serializable;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class c implements vc.a, Serializable {

    /* renamed from: g, reason: collision with root package name */
    public transient vc.a f5664g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f5665h;

    /* renamed from: i, reason: collision with root package name */
    public final Class f5666i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5667j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5668k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f5669l;

    public c(Object obj, Class cls, String str, String str2, boolean z10) {
        this.f5665h = obj;
        this.f5666i = cls;
        this.f5667j = str;
        this.f5668k = str2;
        this.f5669l = z10;
    }

    public abstract vc.a a();

    public final d e() {
        boolean z10 = this.f5669l;
        Class cls = this.f5666i;
        if (!z10) {
            return t.a(cls);
        }
        t.f5684a.getClass();
        return new m(cls);
    }
}
