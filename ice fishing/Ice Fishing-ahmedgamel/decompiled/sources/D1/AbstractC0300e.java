package D1;

import android.content.Context;
import android.graphics.Bitmap;
import x1.InterfaceC5183a;

/* renamed from: D1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0300e implements u1.l {
    @Override // u1.l
    public final w1.w a(Context context, w1.w wVar, int i, int i4) {
        if (!P1.p.i(i, i4)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i4 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC5183a interfaceC5183a = com.bumptech.glide.c.a(context).f24159n;
        Bitmap bitmap = (Bitmap) wVar.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = bitmap.getHeight();
        }
        Bitmap c9 = c(interfaceC5183a, bitmap, i, i4);
        return bitmap.equals(c9) ? wVar : C0299d.d(c9, interfaceC5183a);
    }

    public abstract Bitmap c(InterfaceC5183a interfaceC5183a, Bitmap bitmap, int i, int i4);
}
