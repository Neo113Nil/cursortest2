package androidx.datastore.preferences.protobuf;

import java.util.Collections;

/* renamed from: androidx.datastore.preferences.protobuf.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0115o {

    /* renamed from: a, reason: collision with root package name */
    public static volatile C0115o f2430a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0115o f2431b;

    static {
        C0115o c0115o = new C0115o();
        Collections.emptyMap();
        f2431b = c0115o;
    }

    public static C0115o a() {
        T t = T.f2345c;
        C0115o c0115o = f2430a;
        if (c0115o == null) {
            synchronized (C0115o.class) {
                try {
                    c0115o = f2430a;
                    if (c0115o == null) {
                        Class cls = AbstractC0114n.f2429a;
                        C0115o c0115o2 = null;
                        if (cls != null) {
                            try {
                                c0115o2 = (C0115o) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                            } catch (Exception unused) {
                            }
                        }
                        if (c0115o2 == null) {
                            c0115o2 = f2431b;
                        }
                        f2430a = c0115o2;
                        c0115o = c0115o2;
                    }
                } finally {
                }
            }
        }
        return c0115o;
    }
}
