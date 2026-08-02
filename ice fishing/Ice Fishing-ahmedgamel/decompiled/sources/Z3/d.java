package Z3;

import X3.f;
import X3.g;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class d implements Y3.a {

    /* renamed from: f, reason: collision with root package name */
    public static final b f4143f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f4144g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f4146a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f4147b;

    /* renamed from: c, reason: collision with root package name */
    public final a f4148c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4149d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f4142e = new a(0);

    /* renamed from: h, reason: collision with root package name */
    public static final c f4145h = new c();

    /* JADX WARN: Type inference failed for: r0v1, types: [Z3.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [Z3.b] */
    static {
        final int i = 0;
        f4143f = new f() { // from class: Z3.b
            @Override // X3.a
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
        final int i4 = 1;
        f4144g = new f() { // from class: Z3.b
            @Override // X3.a
            public final void a(Object obj, Object obj2) {
                switch (i4) {
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
        this.f4146a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.f4147b = hashMap2;
        this.f4148c = f4142e;
        this.f4149d = false;
        hashMap2.put(String.class, f4143f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, f4144g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, f4145h);
        hashMap.remove(Date.class);
    }

    public final Y3.a a(Class cls, X3.d dVar) {
        this.f4146a.put(cls, dVar);
        this.f4147b.remove(cls);
        return this;
    }
}
