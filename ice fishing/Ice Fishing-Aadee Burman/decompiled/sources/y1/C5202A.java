package y1;

import java.io.File;

/* renamed from: y1.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5202A implements InterfaceC5223r {

    /* renamed from: b, reason: collision with root package name */
    public static final C5202A f41776b = new C5202A(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41777a;

    public /* synthetic */ C5202A(int i) {
        this.f41777a = i;
    }

    @Override // y1.InterfaceC5223r
    public final boolean a(Object obj) {
        switch (this.f41777a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // y1.InterfaceC5223r
    public final C5222q b(Object obj, int i, int i6, s1.h hVar) {
        switch (this.f41777a) {
            case 0:
                return new C5222q(new M1.d(obj), new C5209d(1, obj));
            case 1:
                File file = (File) obj;
                return new C5222q(new M1.d(file), new C5209d(0, file));
            default:
                return null;
        }
    }
}
