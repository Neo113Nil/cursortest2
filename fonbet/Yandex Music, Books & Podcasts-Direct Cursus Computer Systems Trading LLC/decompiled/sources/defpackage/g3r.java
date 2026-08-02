package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes4.dex */
public final class g3r implements e7t {
    public final boolean a;
    public final String b = "SolidColorTransformation";

    public g3r(boolean z) {
        this.a = z;
    }

    @Override // defpackage.e7t
    public final String a() {
        return this.b;
    }

    @Override // defpackage.e7t
    public final Bitmap b(Bitmap bitmap) {
        int n = kg5.n(bitmap);
        if (this.a) {
            float[] fArr = new float[3];
            aa5.h(n, fArr);
            float f = fArr[1];
            if (f > 0.3f) {
                f = 0.3f;
            }
            fArr[1] = f;
            fArr[2] = 0.5f;
            n = aa5.a(fArr);
        }
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, config);
        createBitmap.getClass();
        createBitmap.eraseColor(n);
        return createBitmap;
    }
}
