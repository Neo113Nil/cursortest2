package X3;

import V3.f;
import V3.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements W3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f3798f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f3799g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3801a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3802b;

    /* renamed from: c, reason: collision with root package name */
    public final a f3803c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3804d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f3797e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f3800h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [X3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X3.b] */
    static {
        final int i = 0;
        f3798f = new f() { // from class: X3.b
            @Override // V3.a
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i6 = 1;
        f3799g = new f() { // from class: X3.b
            @Override // V3.a
            public final void a(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((g) obj2).d((String) obj);
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
        this.f3801a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f3802b = hashMap2;
        this.f3803c = f3797e;
        this.f3804d = false;
        hashMap2.put(String.class, f3798f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f3799g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f3800h);
        hashMap.remove(Date.class);
    }

    public final W3.a a(Class cls, V3.d dVar) {
        this.f3801a.put(cls, dVar);
        this.f3802b.remove(cls);
        return this;
    }
}
