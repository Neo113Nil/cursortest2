package defpackage;

import android.graphics.ImageDecoder;
import java.io.InputStream;

/* loaded from: classes10.dex */
public final class t0w implements rtj0 {
    public final x06 a = new x06();

    @Override // defpackage.rtj0
    public final otj0 a(Object obj, int i, int i2, mg70 mg70Var) {
        return this.a.a(ImageDecoder.createSource(g77.b((InputStream) obj)), i, i2, mg70Var);
    }

    @Override // defpackage.rtj0
    public final /* bridge */ /* synthetic */ boolean b(Object obj, mg70 mg70Var) {
        return true;
    }
}
