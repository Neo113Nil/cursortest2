package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.s;
import defpackage.kac;
import defpackage.xq0;

/* loaded from: classes.dex */
class r implements f0 {
    public static final r a = new r();

    @Override // androidx.datastore.preferences.protobuf.f0
    public final e0 a(Class cls) {
        if (!s.class.isAssignableFrom(cls)) {
            xq0.x("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (e0) s.f(cls.asSubclass(s.class)).d(s.c.c);
        } catch (Exception e) {
            kac.k("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public final boolean b(Class cls) {
        return s.class.isAssignableFrom(cls);
    }
}
