package A1;

import java.io.File;

/* loaded from: classes.dex */
public final class I implements x {

    /* renamed from: b, reason: collision with root package name */
    public static final I f35b = new I(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f36a;

    public /* synthetic */ I(int i) {
        this.f36a = i;
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        switch (this.f36a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        switch (this.f36a) {
            case 0:
                return new w(new O1.d(obj), new C0262d(1, obj));
            case 1:
                File file = (File) obj;
                return new w(new O1.d(file), new C0262d(0, file));
            default:
                return null;
        }
    }
}
