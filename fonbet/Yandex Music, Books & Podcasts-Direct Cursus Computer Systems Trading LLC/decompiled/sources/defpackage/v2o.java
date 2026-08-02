package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class v2o extends e0h {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2o(int i, int i2) {
        super(i);
        this.a = i2;
    }

    @Override // defpackage.e0h
    public int sizeOf(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                Bitmap bitmap = (Bitmap) obj2;
                return bitmap.getHeight() * bitmap.getRowBytes();
            default:
                return super.sizeOf(obj, obj2);
        }
    }
}
