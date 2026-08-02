package defpackage;

import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public final class m19 extends h29 {
    public final /* synthetic */ int j = 2;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m19(gc8 gc8Var, o19 o19Var, v19 v19Var) {
        super(gc8Var);
        this.k = gc8Var;
        this.l = v19Var;
    }

    @Override // defpackage.h29, defpackage.n7w
    public void U(Throwable th) {
        switch (this.j) {
            case 0:
                super.U(th);
                ((v19) this.l).setGifUrl$div_release(null);
                break;
            case 1:
                super.U(th);
                ((v19) this.l).setPreviewUrl$div_release(null);
                break;
            default:
                super.U(th);
                break;
        }
    }

    @Override // defpackage.er2, defpackage.n7w
    public void X(qq3 qq3Var) {
        switch (this.j) {
            case 0:
                if (Build.VERSION.SDK_INT < 28) {
                    i0(qq3Var.a, qq3Var.c);
                    break;
                } else {
                    new l19(new WeakReference((v19) this.l), qq3Var).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
                    break;
                }
            default:
                super.X(qq3Var);
                break;
        }
    }

    @Override // defpackage.er2
    public final void i0(Bitmap bitmap, t33 t33Var) {
        NinePatch ninePatch;
        switch (this.j) {
            case 0:
                v19 v19Var = (v19) this.l;
                gc8 gc8Var = (gc8) this.k;
                d51 d51Var = d51.l;
                synchronized (d51Var) {
                }
                if (qht.a.a()) {
                    v19Var.setImage(bitmap);
                } else {
                    g23 d = gc8Var.getViewComponent$div_release().d();
                    try {
                        d51Var.p(new j19(d, d.a(), v19Var, bitmap, 0));
                    } finally {
                    }
                }
                ((v19) this.l).n();
                return;
            case 1:
                if (((v19) this.l).o()) {
                    return;
                }
                v19 v19Var2 = (v19) this.l;
                gc8 gc8Var2 = (gc8) this.k;
                d51 d51Var2 = d51.l;
                synchronized (d51Var2) {
                }
                if (qht.a.a()) {
                    v19Var2.setPreview(bitmap);
                } else {
                    g23 d2 = gc8Var2.getViewComponent$div_release().d();
                    try {
                        d51Var2.p(new j19(d2, d2.a(), v19Var2, bitmap, 1));
                    } finally {
                    }
                }
                v19Var2.p();
                return;
            default:
                l6j l6jVar = (l6j) this.k;
                Rect rect = ((to8) this.l).b;
                l6jVar.a = rect.bottom;
                l6jVar.invalidateSelf();
                l6jVar.b = rect.left;
                l6jVar.invalidateSelf();
                l6jVar.c = rect.right;
                l6jVar.invalidateSelf();
                l6jVar.d = rect.top;
                l6jVar.invalidateSelf();
                if (bitmap != null) {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i = l6jVar.a;
                    int i2 = l6jVar.b;
                    int i3 = l6jVar.c;
                    int i4 = l6jVar.d;
                    int i5 = height - i;
                    ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                    order.put((byte) 1);
                    order.put((byte) 2);
                    order.put((byte) 2);
                    order.put((byte) 9);
                    order.putInt(0);
                    order.putInt(0);
                    order.putInt(0);
                    order.putInt(0);
                    order.putInt(0);
                    order.putInt(0);
                    order.putInt(0);
                    order.putInt(i2);
                    order.putInt(width - i3);
                    order.putInt(i4);
                    order.putInt(i5);
                    for (int i6 = 0; i6 < 9; i6++) {
                        order.putInt(1);
                    }
                    ninePatch = new NinePatch(bitmap, order.array());
                } else {
                    ninePatch = null;
                }
                l6jVar.e = ninePatch;
                l6jVar.invalidateSelf();
                return;
        }
    }

    @Override // defpackage.er2
    public final void j0(Drawable drawable, t33 t33Var) {
        switch (this.j) {
            case 0:
                v19 v19Var = (v19) this.l;
                gc8 gc8Var = (gc8) this.k;
                d51 d51Var = d51.l;
                synchronized (d51Var) {
                }
                if (qht.a.a()) {
                    v19Var.setImage(drawable);
                } else {
                    g23 d = gc8Var.getViewComponent$div_release().d();
                    try {
                        d51Var.p(new k19(d, d.a(), v19Var, drawable, 0));
                    } finally {
                    }
                }
                ((v19) this.l).n();
                return;
            case 1:
                if (((v19) this.l).o()) {
                    return;
                }
                v19 v19Var2 = (v19) this.l;
                gc8 gc8Var2 = (gc8) this.k;
                d51 d51Var2 = d51.l;
                synchronized (d51Var2) {
                }
                if (qht.a.a()) {
                    v19Var2.setPreview(drawable);
                } else {
                    g23 d2 = gc8Var2.getViewComponent$div_release().d();
                    try {
                        d51Var2.p(new k19(d2, d2.a(), v19Var2, drawable, 2));
                    } finally {
                    }
                }
                v19Var2.p();
                return;
            default:
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m19(gc8 gc8Var, l6j l6jVar, to8 to8Var) {
        super(gc8Var);
        this.k = l6jVar;
        this.l = to8Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m19(gc8 gc8Var, v19 v19Var) {
        super(gc8Var);
        this.k = gc8Var;
        this.l = v19Var;
    }

    private final void l0(Drawable drawable, t33 t33Var) {
    }
}
