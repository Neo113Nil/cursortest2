package y1;

import java.io.File;

/* renamed from: y1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5208c implements InterfaceC5223r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41788a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f41789b;

    public /* synthetic */ C5208c(int i, Object obj) {
        this.f41788a = i;
        this.f41789b = obj;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        switch (this.f41788a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        switch (this.f41788a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C5222q(new M1.d(bArr), new C5218m(1, bArr, (z) this.f41789b));
            case 1:
                return new C5222q(new M1.d(obj), new t1.c(obj.toString(), (z) this.f41789b, 1));
            default:
                File file = (File) obj;
                return new C5222q(new M1.d(file), new t1.c(file, (z) this.f41789b, 2));
        }
    }
}
