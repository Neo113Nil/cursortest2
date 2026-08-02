package defpackage;

import java.util.Date;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class r4f implements n6b {
    public static final p4f f;
    public static final p4f g;
    public final HashMap a;
    public final HashMap b;
    public final o4f c;
    public boolean d;
    public static final o4f e = new o4f(0);
    public static final q4f h = new q4f();

    /* JADX WARN: Type inference failed for: r0v1, types: [p4f] */
    /* JADX WARN: Type inference failed for: r0v2, types: [p4f] */
    static {
        final int i = 0;
        f = new twt() { // from class: p4f
            @Override // defpackage.j6b
            public final void a(Object obj, Object obj2) {
                switch (i) {
                    case 0:
                        ((uwt) obj2).b((String) obj);
                        break;
                    default:
                        ((uwt) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i2 = 1;
        g = new twt() { // from class: p4f
            @Override // defpackage.j6b
            public final void a(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((uwt) obj2).b((String) obj);
                        break;
                    default:
                        ((uwt) obj2).c(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public r4f() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = e;
        this.d = false;
        hashMap2.put(String.class, f);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, g);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, h);
        hashMap.remove(Date.class);
    }

    public final n6b a(Class cls, rhj rhjVar) {
        this.a.put(cls, rhjVar);
        this.b.remove(cls);
        return this;
    }
}
