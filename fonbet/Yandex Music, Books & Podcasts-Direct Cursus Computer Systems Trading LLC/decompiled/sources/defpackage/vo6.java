package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class vo6 implements uo6 {
    public final String a;
    public final long b;
    public final Context c;
    public final cce d;
    public final fk0 e;
    public final x6k f;

    public vo6(String str, mm6 mm6Var, long j, Context context, cce cceVar) {
        context.getClass();
        cceVar.getClass();
        this.a = str;
        this.b = j;
        this.c = context;
        this.d = cceVar;
        this.e = bmq.a(j);
        this.f = szf.g0(xr1.a);
        Continuation continuation = null;
        x97.y(mm6Var, null, null, new ja4(this, continuation, 20), 3);
        x97.y(mm6Var, null, null, new rc4(this, continuation, 22), 3);
    }

    public static w4k b(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            bitmap.getClass();
            return new q33(new yg0(bitmap));
        }
        if (drawable instanceof ColorDrawable) {
            return new w85(c3x.f(((ColorDrawable) drawable).getColor()));
        }
        Drawable mutate = drawable.mutate();
        mutate.getClass();
        return new opa(mutate);
    }

    @Override // defpackage.uo6
    public final long a() {
        return ((d85) this.e.e()).a;
    }

    @Override // defpackage.uo6
    public final bs1 d() {
        return (bs1) this.f.getValue();
    }
}
