package B1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import v1.InterfaceC5104a;

/* renamed from: B1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0261c implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f122a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5104a f123b;

    public C0261c() {
        this.f122a = 0;
        this.f123b = new E3.e();
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i6, s1.h hVar) {
        switch (this.f122a) {
            case 0:
                return c(A1.a.f(obj), i, i6, hVar);
            default:
                return C0262d.b(((r1.d) obj).b(), this.f123b);
        }
    }

    @Override // s1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s1.h hVar) {
        switch (this.f122a) {
            case 0:
                A1.a.w(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C0262d c(ImageDecoder.Source source, int i, int i6, s1.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new A1.d(i, i6, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i6 + "]");
        }
        return new C0262d(decodeBitmap, (E3.e) this.f123b);
    }

    public C0261c(InterfaceC5104a interfaceC5104a) {
        this.f122a = 1;
        this.f123b = interfaceC5104a;
    }
}
