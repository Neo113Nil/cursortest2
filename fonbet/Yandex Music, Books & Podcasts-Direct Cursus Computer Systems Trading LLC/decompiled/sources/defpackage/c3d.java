package defpackage;

import com.google.crypto.tink.shaded.protobuf.c;

/* loaded from: classes3.dex */
public final class c3d implements qzh {
    public static final c3d b = new c3d(0);
    public final /* synthetic */ int a;

    public /* synthetic */ c3d(int i) {
        this.a = i;
    }

    @Override // defpackage.qzh
    public final cjn a(Class cls) {
        switch (this.a) {
            case 0:
                if (c.class.isAssignableFrom(cls)) {
                    try {
                        return (cjn) c.g(cls.asSubclass(c.class)).f(3);
                    } catch (Exception e) {
                        kac.k("Unable to get message info for ".concat(cls.getName()), e);
                    }
                } else {
                    xq0.x("Unsupported message type: ".concat(cls.getName()));
                }
                return null;
            default:
                throw new IllegalStateException("This should never be called.");
        }
    }

    @Override // defpackage.qzh
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return c.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
