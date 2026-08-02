package D1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;

/* loaded from: classes.dex */
public final class D implements u1.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f521a;

    public /* synthetic */ D(int i) {
        this.f521a = i;
    }

    @Override // u1.j
    public final w1.w a(Object obj, int i, int i4, u1.h hVar) {
        switch (this.f521a) {
            case 0:
                return new C(0, (Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new F1.b(drawable, 0);
                }
                return null;
            default:
                return new C((File) obj);
        }
    }

    @Override // u1.j
    public final /* bridge */ /* synthetic */ boolean b(Object obj, u1.h hVar) {
        switch (this.f521a) {
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
