package g0;

import A.j;
import a.AbstractC0069a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import d0.C0121k;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2044h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(C0121k c0121k, int i2) {
        super(20, c0121k);
        this.f2044h = i2;
    }

    @Override // A.j
    public final Bitmap u(ByteBuffer byteBuffer, d dVar) {
        Bitmap b2;
        switch (this.f2044h) {
            case 0:
                Bitmap u2 = super.u(byteBuffer, dVar);
                if (u2 != null) {
                    return u2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f2048c != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(dVar.f2048c);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    b2 = AbstractC0069a.b(createBitmap, dVar.f2050e);
                } else {
                    b2 = AbstractC0069a.b(decodeByteArray, dVar.f2050e);
                }
                return b2;
            default:
                return AbstractC0069a.b(super.u(byteBuffer, dVar), dVar.f2050e);
        }
    }
}
