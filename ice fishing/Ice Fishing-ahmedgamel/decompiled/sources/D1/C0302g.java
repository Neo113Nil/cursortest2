package D1;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: D1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0302g implements u1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f543a;

    /* renamed from: b, reason: collision with root package name */
    public final C0298c f544b;

    public C0302g(int i) {
        this.f543a = i;
        switch (i) {
            case 1:
                this.f544b = new C0298c();
                break;
            default:
                this.f544b = new C0298c();
                break;
        }
    }

    @Override // u1.j
    public final w1.w a(Object obj, int i, int i4, u1.h hVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.f543a) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.f544b.c(createSource, i, i4, hVar);
            default:
                createSource2 = ImageDecoder.createSource(P1.b.b((InputStream) obj));
                return this.f544b.c(createSource2, i, i4, hVar);
        }
    }

    @Override // u1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, u1.h hVar) {
        switch (this.f543a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }
}
