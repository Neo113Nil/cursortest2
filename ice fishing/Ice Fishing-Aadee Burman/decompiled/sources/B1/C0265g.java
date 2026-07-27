package B1;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: B1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0265g implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129a;

    /* renamed from: b, reason: collision with root package name */
    public final C0261c f130b;

    public C0265g(int i) {
        this.f129a = i;
        switch (i) {
            case 1:
                this.f130b = new C0261c();
                break;
            default:
                this.f130b = new C0261c();
                break;
        }
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i6, s1.h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f129a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.f130b.c(createSource, i, i6, hVar);
            default:
                createSource2 = ImageDecoder.createSource(N1.b.b((InputStream) obj));
                return this.f130b.c(createSource2, i, i6, hVar);
        }
    }

    @Override // s1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s1.h hVar) {
        switch (this.f129a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
