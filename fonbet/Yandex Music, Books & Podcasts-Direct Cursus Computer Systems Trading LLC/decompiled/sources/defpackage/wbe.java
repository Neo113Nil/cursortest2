package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.Base64;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class wbe extends ds2 {
    public final pif D;
    public final Rect E;
    public final Rect F;
    public final RectF G;
    public final hzg H;
    public rwt I;
    public rwt J;
    public final tra K;
    public dnj L;
    public j4x M;

    public wbe(czg czgVar, iof iofVar) {
        super(czgVar, iofVar);
        this.D = new pif(3, 0);
        this.E = new Rect();
        this.F = new Rect();
        this.G = new RectF();
        String str = iofVar.g;
        ayg aygVar = czgVar.a;
        this.H = aygVar == null ? null : (hzg) ((HashMap) aygVar.c()).get(str);
        gs4 gs4Var = this.p.x;
        if (gs4Var != null) {
            this.K = new tra(this, this, gs4Var);
        }
    }

    @Override // defpackage.ds2, defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        hzg hzgVar = this.H;
        if (hzgVar != null) {
            int i = hzgVar.b;
            int i2 = hzgVar.a;
            float c = rvt.c();
            if (this.o.m) {
                rectF.set(0.0f, 0.0f, i2 * c, i * c);
            } else {
                if (r() != null) {
                    rectF.set(0.0f, 0.0f, r1.getWidth() * c, r1.getHeight() * c);
                } else {
                    rectF.set(0.0f, 0.0f, i2 * c, i * c);
                }
            }
            this.n.mapRect(rectF);
        }
    }

    @Override // defpackage.ds2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        if (obj == lzg.I) {
            if (szgVar == null) {
                this.I = null;
                return;
            } else {
                this.I = new rwt(szgVar, null);
                return;
            }
        }
        if (obj == lzg.L) {
            if (szgVar == null) {
                this.J = null;
                return;
            } else {
                this.J = new rwt(szgVar, null);
                return;
            }
        }
        tra traVar = this.K;
        if (obj == 5 && traVar != null) {
            traVar.c.j(szgVar);
            return;
        }
        if (obj == lzg.E && traVar != null) {
            traVar.c(szgVar);
            return;
        }
        if (obj == lzg.F && traVar != null) {
            traVar.e.j(szgVar);
            return;
        }
        if (obj == lzg.G && traVar != null) {
            traVar.f.j(szgVar);
        } else {
            if (obj != lzg.H || traVar == null) {
                return;
            }
            traVar.g.j(szgVar);
        }
    }

    @Override // defpackage.ds2
    public final void j(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        hzg hzgVar;
        Bitmap r = r();
        if (r == null || r.isRecycled() || (hzgVar = this.H) == null) {
            return;
        }
        float c = rvt.c();
        pif pifVar = this.D;
        pifVar.setAlpha(i);
        rwt rwtVar = this.I;
        if (rwtVar != null) {
            pifVar.setColorFilter((ColorFilter) rwtVar.e());
        }
        tra traVar = this.K;
        if (traVar != null) {
            qraVar = traVar.b(matrix, i);
        }
        int width = r.getWidth();
        int height = r.getHeight();
        Rect rect = this.E;
        rect.set(0, 0, width, height);
        boolean z = this.o.m;
        Rect rect2 = this.F;
        if (z) {
            rect2.set(0, 0, (int) (hzgVar.a * c), (int) (hzgVar.b * c));
        } else {
            rect2.set(0, 0, (int) (r.getWidth() * c), (int) (r.getHeight() * c));
        }
        boolean z2 = qraVar != null;
        if (z2) {
            if (this.L == null) {
                this.L = new dnj();
            }
            if (this.M == null) {
                this.M = new j4x(13);
            }
            j4x j4xVar = this.M;
            j4xVar.b = KotlinVersion.MAX_COMPONENT_VALUE;
            j4xVar.c = null;
            qraVar.getClass();
            qra qraVar2 = new qra(qraVar);
            j4xVar.c = qraVar2;
            qraVar2.b(i);
            float f = rect2.left;
            float f2 = rect2.top;
            float f3 = rect2.right;
            float f4 = rect2.bottom;
            RectF rectF = this.G;
            rectF.set(f, f2, f3, f4);
            matrix.mapRect(rectF);
            canvas = this.L.e(canvas, rectF, this.M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(r, rect, rect2, pifVar);
        if (z2) {
            this.L.c();
            if (this.L.c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0117 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap r() {
        Bitmap bitmap;
        Bitmap bitmap2;
        rwt rwtVar = this.J;
        if (rwtVar != null && (bitmap2 = (Bitmap) rwtVar.e()) != null) {
            return bitmap2;
        }
        String str = this.p.g;
        osh j = this.o.j();
        if (j != null) {
            String str2 = (String) j.b;
            hzg hzgVar = (hzg) ((Map) j.c).get(str);
            if (hzgVar != null) {
                int i = hzgVar.b;
                int i2 = hzgVar.a;
                bitmap = hzgVar.f;
                if (bitmap == null) {
                    Context context = (Context) j.a;
                    if (context != null) {
                        String str3 = hzgVar.d;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        if (!str3.startsWith("data:") || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(str2 + str3), null, options);
                                    if (decodeStream == null) {
                                        psg.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = rvt.d(decodeStream, i2, i);
                                        j.O(str, bitmap);
                                    }
                                } catch (IllegalArgumentException e) {
                                    psg.c("Unable to decode image `" + str + "`.", e);
                                }
                            } catch (IOException e2) {
                                psg.c("Unable to open asset.", e2);
                            }
                        } else {
                            try {
                                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    if (decodeByteArray == null) {
                                        psg.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = rvt.d(decodeByteArray, i2, i);
                                        j.O(str, bitmap);
                                    }
                                } catch (IllegalArgumentException e3) {
                                    psg.c("Unable to decode image `" + str + "`.", e3);
                                }
                            } catch (IllegalArgumentException e4) {
                                psg.c("data URL did not have correct base64 format.", e4);
                            }
                        }
                    }
                }
                if (bitmap == null) {
                    return bitmap;
                }
                hzg hzgVar2 = this.H;
                if (hzgVar2 != null) {
                    return hzgVar2.f;
                }
                return null;
            }
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }
}
