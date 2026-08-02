package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* loaded from: classes10.dex */
public class zz5 implements puj0 {
    public final Bitmap.CompressFormat a = Bitmap.CompressFormat.JPEG;
    public final int b = 100;

    @Override // defpackage.puj0
    public final otj0 b(otj0 otj0Var, mg70 mg70Var) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) otj0Var.get()).compress(this.a, this.b, byteArrayOutputStream);
        otj0Var.a();
        return new cf2(byteArrayOutputStream.toByteArray());
    }
}
