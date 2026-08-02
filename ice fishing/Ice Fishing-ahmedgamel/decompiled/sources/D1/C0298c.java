package D1;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import x1.C5184b;
import x1.InterfaceC5183a;

/* renamed from: D1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0298c implements u1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f536a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC5183a f537b;

    public C0298c() {
        this.f536a = 0;
        this.f537b = new C5184b();
    }

    @Override // u1.j
    public final w1.w a(Object obj, int i, int i4, u1.h hVar) {
        switch (this.f536a) {
            case 0:
                return c(C1.a.f(obj), i, i4, hVar);
            default:
                return C0299d.d(((t1.d) obj).b(), this.f537b);
        }
    }

    @Override // u1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, u1.h hVar) {
        switch (this.f536a) {
            case 0:
                C1.a.w(obj);
                break;
            default:
                break;
        }
        return true;
    }

    public C0299d c(ImageDecoder.Source source, int i, int i4, u1.h hVar) {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new C1.d(i, i4, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + decodeBitmap.getWidth() + "x" + decodeBitmap.getHeight() + "] for [" + i + "x" + i4 + "]");
        }
        return new C0299d(decodeBitmap, (C5184b) this.f537b);
    }

    public C0298c(InterfaceC5183a interfaceC5183a) {
        this.f536a = 1;
        this.f537b = interfaceC5183a;
    }
}
