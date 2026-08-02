package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import coil.graphics.DataSource;
import coil.graphics.c;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* loaded from: classes10.dex */
public final class r06 implements rwq {
    public final /* synthetic */ int a;
    public final qg70 b;
    public final Object c;

    public /* synthetic */ r06(Object obj, qg70 qg70Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = qg70Var;
    }

    @Override // defpackage.rwq
    public final Object a(Continuation continuation) {
        int i = this.a;
        Object obj = this.c;
        qg70 qg70Var = this.b;
        switch (i) {
            case 0:
                return new mbm(new BitmapDrawable(qg70Var.a.getResources(), (Bitmap) obj), false, DataSource.MEMORY);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    yp6 yp6Var = new yp6();
                    yp6Var.write(byteBuffer);
                    byteBuffer.position(0);
                    return new pjt0(c.a(yp6Var, qg70Var.a), null, DataSource.MEMORY);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = m.a;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof VectorDrawableCompat);
                if (z) {
                    drawable = new BitmapDrawable(qg70Var.a.getResources(), nm91.a(drawable, qg70Var.b, qg70Var.d, qg70Var.e, qg70Var.f));
                }
                return new mbm(drawable, z, DataSource.MEMORY);
        }
    }
}
