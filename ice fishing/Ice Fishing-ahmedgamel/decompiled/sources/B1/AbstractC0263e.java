package B1;

import android.content.Context;
import android.graphics.Bitmap;
import v1.InterfaceC5104a;

/* renamed from: B1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0263e implements s1.l {
    @Override // s1.l
    public final u1.x b(Context context, u1.x xVar, int i, int i6) {
        if (!N1.p.i(i, i6)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i6 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC5104a interfaceC5104a = com.bumptech.glide.c.a(context).f23372n;
        Bitmap bitmap = (Bitmap) xVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i6 == Integer.MIN_VALUE) {
            i6 = bitmap.getHeight();
        }
        Bitmap c9 = c(interfaceC5104a, bitmap, i, i6);
        return bitmap.equals(c9) ? xVar : C0262d.b(c9, interfaceC5104a);
    }

    public abstract Bitmap c(InterfaceC5104a interfaceC5104a, Bitmap bitmap, int i, int i6);
}
