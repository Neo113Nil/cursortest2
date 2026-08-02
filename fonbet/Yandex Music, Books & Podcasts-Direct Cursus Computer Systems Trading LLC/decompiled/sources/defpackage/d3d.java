package defpackage;

/* loaded from: classes3.dex */
public final class d3d implements rzh {
    public static final d3d b = new d3d(0);
    public final /* synthetic */ int a;

    public /* synthetic */ d3d(int i) {
        this.a = i;
    }

    @Override // defpackage.rzh
    public final djn a(Class cls) {
        switch (this.a) {
            case 0:
                if (o3d.class.isAssignableFrom(cls)) {
                    try {
                        return (djn) o3d.getDefaultInstance(cls.asSubclass(o3d.class)).buildMessageInfo();
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

    @Override // defpackage.rzh
    public final boolean b(Class cls) {
        switch (this.a) {
            case 0:
                return o3d.class.isAssignableFrom(cls);
            default:
                return false;
        }
    }
}
