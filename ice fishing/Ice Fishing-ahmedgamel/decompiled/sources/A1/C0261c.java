package A1;

import java.io.File;

/* renamed from: A1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f48b;

    public /* synthetic */ C0261c(int i, Object obj) {
        this.f47a = i;
        this.f48b = obj;
    }

    @Override // A1.x
    public final boolean a(Object obj) {
        switch (this.f47a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // A1.x
    public final w b(Object obj, int i, int i4, u1.h hVar) {
        switch (this.f47a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new w(new O1.d(bArr), new s(1, bArr, (H) this.f48b));
            case 1:
                return new w(new O1.d(obj), new C0263e(obj.toString(), (H) this.f48b, 0));
            default:
                File file = (File) obj;
                return new w(new O1.d(file), new C0263e(file, (H) this.f48b, 1));
        }
    }
}
