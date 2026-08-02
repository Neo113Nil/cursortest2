package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class j33 implements s8c {
    public final /* synthetic */ int a;
    public final rwj b;
    public final Object c;

    public /* synthetic */ j33(Object obj, rwj rwjVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = rwjVar;
    }

    @Override // defpackage.s8c
    public final Object a(Continuation continuation) {
        int i = this.a;
        Object obj = this.c;
        rwj rwjVar = this.b;
        switch (i) {
            case 0:
                return new qpa(new BitmapDrawable(rwjVar.a.getResources(), (Bitmap) obj), false, bb7.b);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    hi3 hi3Var = new hi3();
                    hi3Var.write(byteBuffer);
                    byteBuffer.position(0);
                    return new r3r(new p3r(hi3Var, new ji7(rwjVar.a, 3), null), null, bb7.b);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable drawable = (Drawable) obj;
                Bitmap.Config[] configArr = k.a;
                boolean z = (drawable instanceof VectorDrawable) || (drawable instanceof kzt);
                if (z) {
                    drawable = new BitmapDrawable(rwjVar.a.getResources(), lg3.M(drawable, rwjVar.b, rwjVar.d, rwjVar.e, rwjVar.f));
                }
                return new qpa(drawable, z, bb7.b);
        }
    }
}
