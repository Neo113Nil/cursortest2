package h1;

import E2.M;
import Z0.v;
import Z0.x;
import Z0.z;
import a1.C0428a;
import android.app.Application;
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
import c1.s;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.LP;
import d1.C4458a;
import java.io.IOException;
import java.util.HashMap;
import l1.AbstractC4668c;
import l1.C4666a;

/* renamed from: h1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4565c extends AbstractC4563a {

    /* renamed from: D, reason: collision with root package name */
    public final C0428a f38009D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f38010E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f38011F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f38012G;

    /* renamed from: H, reason: collision with root package name */
    public final x f38013H;

    /* renamed from: I, reason: collision with root package name */
    public s f38014I;
    public s J;

    /* renamed from: K, reason: collision with root package name */
    public final c1.h f38015K;

    /* renamed from: L, reason: collision with root package name */
    public l1.h f38016L;

    /* renamed from: M, reason: collision with root package name */
    public I1.a f38017M;

    public C4565c(v vVar, C4566d c4566d) {
        super(vVar, c4566d);
        x xVar;
        this.f38009D = new C0428a(3, 0);
        this.f38010E = new Rect();
        this.f38011F = new Rect();
        this.f38012G = new RectF();
        Z0.i iVar = vVar.f4046n;
        if (iVar == null) {
            xVar = null;
        } else {
            xVar = (x) ((HashMap) iVar.c()).get(c4566d.f38024g);
        }
        this.f38013H = xVar;
        M m9 = this.f37989p.f38040x;
        if (m9 != null) {
            this.f38015K = new c1.h(this, this, m9);
        }
    }

    @Override // h1.AbstractC4563a, e1.f
    public final void d(ColorFilter colorFilter, LP lp) {
        super.d(colorFilter, lp);
        if (colorFilter == z.f4075I) {
            this.f38014I = new s(lp, null);
            return;
        }
        if (colorFilter == z.f4077L) {
            this.J = new s(lp, null);
            return;
        }
        c1.h hVar = this.f38015K;
        if (colorFilter == 5 && hVar != null) {
            hVar.f5659c.j(lp);
            return;
        }
        if (colorFilter == z.f4071E && hVar != null) {
            hVar.c(lp);
            return;
        }
        if (colorFilter == z.f4072F && hVar != null) {
            hVar.f5661e.j(lp);
            return;
        }
        if (colorFilter == z.f4073G && hVar != null) {
            hVar.f5662f.j(lp);
        } else {
            if (colorFilter != z.f4074H || hVar == null) {
                return;
            }
            hVar.f5663g.j(lp);
        }
    }

    @Override // h1.AbstractC4563a, b1.InterfaceC0521e
    public final void e(RectF rectF, Matrix matrix, boolean z6) {
        super.e(rectF, matrix, z6);
        x xVar = this.f38013H;
        if (xVar != null) {
            float c9 = l1.i.c();
            boolean z9 = this.f37988o.f4023F;
            int i = xVar.f4062b;
            int i4 = xVar.f4061a;
            if (z9) {
                rectF.set(0.0f, 0.0f, i4 * c9, i * c9);
            } else {
                if (s() != null) {
                    rectF.set(0.0f, 0.0f, r0.getWidth() * c9, r0.getHeight() * c9);
                } else {
                    rectF.set(0.0f, 0.0f, i4 * c9, i * c9);
                }
            }
            this.f37987n.mapRect(rectF);
        }
    }

    @Override // h1.AbstractC4563a
    public final void k(Canvas canvas, Matrix matrix, int i, C4666a c4666a) {
        x xVar;
        Bitmap s9 = s();
        if (s9 == null || s9.isRecycled() || (xVar = this.f38013H) == null) {
            return;
        }
        float c9 = l1.i.c();
        C0428a c0428a = this.f38009D;
        c0428a.setAlpha(i);
        s sVar = this.f38014I;
        if (sVar != null) {
            c0428a.setColorFilter((ColorFilter) sVar.e());
        }
        c1.h hVar = this.f38015K;
        if (hVar != null) {
            c4666a = hVar.b(matrix, i);
        }
        int width = s9.getWidth();
        int height = s9.getHeight();
        Rect rect = this.f38010E;
        rect.set(0, 0, width, height);
        boolean z6 = this.f37988o.f4023F;
        Rect rect2 = this.f38011F;
        if (z6) {
            rect2.set(0, 0, (int) (xVar.f4061a * c9), (int) (xVar.f4062b * c9));
        } else {
            rect2.set(0, 0, (int) (s9.getWidth() * c9), (int) (s9.getHeight() * c9));
        }
        boolean z9 = c4666a != null;
        if (z9) {
            if (this.f38016L == null) {
                this.f38016L = new l1.h();
            }
            if (this.f38017M == null) {
                this.f38017M = new I1.a((byte) 0, 16);
            }
            I1.a aVar = this.f38017M;
            aVar.f1303u = p.f9259b;
            aVar.f1304v = null;
            c4666a.getClass();
            C4666a c4666a2 = new C4666a(c4666a);
            aVar.f1304v = c4666a2;
            c4666a2.b(i);
            RectF rectF = this.f38012G;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            matrix.mapRect(rectF);
            canvas = this.f38016L.e(canvas, rectF, this.f38017M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(s9, rect, rect2, c0428a);
        if (z9) {
            this.f38016L.c();
            if (this.f38016L.f38839c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1.f4058z = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if (r4 == r2) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bitmap s() {
        Bitmap bitmap;
        Bitmap bitmap2;
        s sVar = this.J;
        if (sVar != null && (bitmap2 = (Bitmap) sVar.e()) != null) {
            return bitmap2;
        }
        String str = this.f37989p.f38024g;
        v vVar = this.f37988o;
        C4458a c4458a = vVar.f4058z;
        if (c4458a != null) {
            Context h3 = vVar.h();
            Context context = c4458a.f37175a;
            if (h3 != null) {
                if (context instanceof Application) {
                    h3 = h3.getApplicationContext();
                }
            }
        }
        if (vVar.f4058z == null) {
            vVar.f4058z = new C4458a(vVar.getCallback(), vVar.f4018A, vVar.f4046n.c());
        }
        C4458a c4458a2 = vVar.f4058z;
        if (c4458a2 != null) {
            String str2 = c4458a2.f37176b;
            x xVar = (x) c4458a2.f37177c.get(str);
            if (xVar != null) {
                bitmap = xVar.f4066f;
                if (bitmap == null) {
                    Context context2 = c4458a2.f37175a;
                    if (context2 != null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        String str3 = xVar.f4064d;
                        boolean startsWith = str3.startsWith("data:");
                        int i = xVar.f4062b;
                        int i4 = xVar.f4061a;
                        if (!startsWith || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (decodeStream == null) {
                                        AbstractC4668c.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = l1.i.d(decodeStream, i4, i);
                                        synchronized (C4458a.f37174d) {
                                            ((x) c4458a2.f37177c.get(str)).f4066f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e9) {
                                    AbstractC4668c.c("Unable to decode image `" + str + "`.", e9);
                                }
                            } catch (IOException e10) {
                                AbstractC4668c.c("Unable to open asset.", e10);
                            }
                        } else {
                            try {
                                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    if (decodeByteArray == null) {
                                        AbstractC4668c.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = l1.i.d(decodeByteArray, i4, i);
                                        synchronized (C4458a.f37174d) {
                                            ((x) c4458a2.f37177c.get(str)).f4066f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e11) {
                                    AbstractC4668c.c("Unable to decode image `" + str + "`.", e11);
                                }
                            } catch (IllegalArgumentException e12) {
                                AbstractC4668c.c("data URL did not have correct base64 format.", e12);
                            }
                        }
                    }
                }
                if (bitmap == null) {
                    return bitmap;
                }
                x xVar2 = this.f38013H;
                if (xVar2 != null) {
                    return xVar2.f4066f;
                }
                return null;
            }
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }
}
