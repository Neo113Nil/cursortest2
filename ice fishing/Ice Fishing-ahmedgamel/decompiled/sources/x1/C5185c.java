package x1;

/* renamed from: x1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5185c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41814a;

    public final int a(Object obj) {
        switch (this.f41814a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    public final int b() {
        switch (this.f41814a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    public final String c() {
        switch (this.f41814a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
