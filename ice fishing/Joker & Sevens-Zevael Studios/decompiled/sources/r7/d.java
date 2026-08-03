package r7;

import java.util.Date;
import java.util.HashMap;
import p7.f;
import p7.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements q7.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f6098f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f6099g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6101a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f6102b;

    /* renamed from: c, reason: collision with root package name */
    public final a f6103c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6104d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f6097e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f6100h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [r7.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [r7.b] */
    static {
        final int i10 = 0;
        f6098f = new f() { // from class: r7.b
            @Override // p7.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f6099g = new f() { // from class: r7.b
            @Override // p7.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).b((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public d() {
        HashMap hashMap = new HashMap();
        this.f6101a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f6102b = hashMap2;
        this.f6103c = f6097e;
        this.f6104d = false;
        hashMap2.put(String.class, f6098f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f6099g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f6100h);
        hashMap.remove(Date.class);
    }

    public final q7.a a(Class cls, p7.d dVar) {
        this.f6101a.put(cls, dVar);
        this.f6102b.remove(cls);
        return this;
    }
}
