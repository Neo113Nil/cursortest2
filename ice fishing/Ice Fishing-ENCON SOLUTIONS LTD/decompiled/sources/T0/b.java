package T0;

import C.j;
import a.AbstractC0083a;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends j {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Q0.j jVar, int i2) {
        super(21, jVar);
        this.f1793c = i2;
    }

    @Override // C.j
    public final Bitmap k(ByteBuffer byteBuffer, d dVar) {
        Bitmap b2;
        switch (this.f1793c) {
            case 0:
                Bitmap k2 = super.k(byteBuffer, dVar);
                if (k2 != null) {
                    return k2;
                }
                int remaining = byteBuffer.remaining();
                byte[] bArr = new byte[remaining];
                byteBuffer.get(bArr);
                byteBuffer.rewind();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, remaining, options);
                if (dVar.f1797c != 0) {
                    Matrix matrix = new Matrix();
                    matrix.postRotate(dVar.f1797c);
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
                    decodeByteArray.recycle();
                    b2 = AbstractC0083a.b(createBitmap, dVar.f1799e);
                } else {
                    b2 = AbstractC0083a.b(decodeByteArray, dVar.f1799e);
                }
                return b2;
            default:
                return AbstractC0083a.b(super.k(byteBuffer, dVar), dVar.f1799e);
        }
    }
}
