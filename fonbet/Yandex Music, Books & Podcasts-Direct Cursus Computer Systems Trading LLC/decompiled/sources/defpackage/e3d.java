package defpackage;

import androidx.glance.appwidget.protobuf.b;

/* loaded from: classes.dex */
public final class e3d implements szh {
    public static final e3d b = new e3d(0);
    public final /* synthetic */ int a;

    public /* synthetic */ e3d(int i) {
        this.a = i;
    }

    @Override // defpackage.szh
    public final ejn a(Class cls) {
        switch (this.a) {
            case 0:
                if (b.class.isAssignableFrom(cls)) {
                    try {
                        return (ejn) b.c(cls.asSubclass(b.class)).b(3);
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

    @Override // defpackage.szh
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return b.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
