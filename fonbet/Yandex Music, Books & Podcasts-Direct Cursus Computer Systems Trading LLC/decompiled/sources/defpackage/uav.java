package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class uav {
    public final Context a;
    public final cce b;
    public final int c;

    public uav(Context context, cce cceVar, int i) {
        cceVar.getClass();
        this.a = context;
        this.b = cceVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, int i, int i2, String str, cg6 cg6Var) {
        tav tavVar;
        int i3;
        BitmapDrawable bitmapDrawable;
        if (cg6Var instanceof tav) {
            tavVar = (tav) cg6Var;
            int i4 = tavVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                tavVar.l = i4 - Integer.MIN_VALUE;
                Object obj = tavVar.j;
                nm6 nm6Var = nm6.a;
                i3 = tavVar.l;
                if (i3 != 0) {
                    qgg.h0(obj);
                    Integer b0 = y2x.b0(str);
                    if (b0 != null) {
                        int intValue = b0.intValue();
                        pce pceVar = new pce(this.a);
                        pceVar.c = uri;
                        pceVar.j = xee.L(xz0.X(new e7t[]{new sav(i, i2, intValue)}));
                        rce a = pceVar.a();
                        tavVar.l = 1;
                        obj = this.b.a(a, tavVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    return null;
                }
                if (i3 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                Drawable a2 = ((sce) obj).a();
                bitmapDrawable = !(a2 instanceof BitmapDrawable) ? (BitmapDrawable) a2 : null;
                if (bitmapDrawable != null) {
                    return bitmapDrawable.getBitmap();
                }
                return null;
            }
        }
        tavVar = new tav(this, cg6Var);
        Object obj2 = tavVar.j;
        nm6 nm6Var2 = nm6.a;
        i3 = tavVar.l;
        if (i3 != 0) {
        }
        Drawable a22 = ((sce) obj2).a();
        if (!(a22 instanceof BitmapDrawable)) {
        }
        if (bitmapDrawable != null) {
        }
        return null;
    }
}
