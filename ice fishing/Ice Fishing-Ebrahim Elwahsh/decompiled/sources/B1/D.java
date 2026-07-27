package B1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class D implements s1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73a;

    public /* synthetic */ D(int i) {
        this.f73a = i;
    }

    @Override // s1.j
    public final u1.x a(Object obj, int i, int i4, s1.h hVar) {
        switch (this.f73a) {
            case 0:
                return new C(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new D1.b(drawable, 0);
                }
                return null;
            default:
                return new C((File) obj);
        }
    }

    @Override // s1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, s1.h hVar) {
        switch (this.f73a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }
}
