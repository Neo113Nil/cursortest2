package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class c39 extends n7w {
    public final n7w i;
    public final Context j;
    public final /* synthetic */ d39 k;

    public c39(d39 d39Var, n7w n7wVar, Context context) {
        this.k = d39Var;
        this.i = n7wVar;
        this.j = context;
    }

    @Override // defpackage.n7w
    public final void U(Throwable th) {
        this.i.U(th);
    }

    @Override // defpackage.n7w
    public final void V() {
        this.i.V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r2.getIntrinsicHeight() > r4) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r2.getHeight() > r1) goto L8;
     */
    @Override // defpackage.n7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void W(p9 p9Var) {
        p9 p9Var2;
        boolean z = p9Var instanceof bq8;
        d39 d39Var = this.k;
        if (z) {
            bq8 bq8Var = (bq8) p9Var;
            Bitmap bitmap = bq8Var.b;
            int width = bitmap.getWidth();
            int i = d39Var.e;
            if (width <= i) {
                p9Var2 = bq8Var;
            }
            p9Var2 = new bq8(h0(bitmap), (t33) p9Var.a);
        } else {
            if (!(p9Var instanceof cq8)) {
                b6e.s();
                return;
            }
            cq8 cq8Var = (cq8) p9Var;
            Drawable drawable = cq8Var.b;
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int i2 = d39Var.e;
            if (intrinsicWidth <= i2) {
                p9Var2 = cq8Var;
            }
            int intrinsicWidth2 = drawable.getIntrinsicWidth();
            int i3 = d39Var.e;
            if (intrinsicWidth2 > i3 || drawable.getIntrinsicHeight() > i3) {
                int intrinsicWidth3 = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                float max = d39Var.e / Math.max(intrinsicWidth3, intrinsicHeight);
                Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth3, intrinsicHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                drawable.setBounds(0, 0, intrinsicWidth3, intrinsicHeight);
                drawable.draw(canvas);
                drawable = new BitmapDrawable(this.j.getResources(), Bitmap.createScaledBitmap(createBitmap, (int) (intrinsicWidth3 * max), (int) (intrinsicHeight * max), true));
            }
            p9Var2 = new cq8(drawable, (t33) p9Var.a);
        }
        this.i.W(p9Var2);
    }

    @Override // defpackage.n7w
    public final void X(qq3 qq3Var) {
        Bitmap bitmap = qq3Var.a;
        int width = bitmap.getWidth();
        int i = this.k.e;
        if (width > i || bitmap.getHeight() > i) {
            qq3Var = new qq3(h0(qq3Var.a), qq3Var.b, qq3Var.c, 0);
        }
        this.i.X(qq3Var);
    }

    public final Bitmap h0(Bitmap bitmap) {
        float max = this.k.e / Math.max(bitmap.getWidth(), bitmap.getHeight());
        return Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * max), (int) (bitmap.getHeight() * max), true);
    }
}
