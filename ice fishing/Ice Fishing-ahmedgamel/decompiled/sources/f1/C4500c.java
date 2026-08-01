package f1;

import C2.N;
import X0.v;
import X0.x;
import X0.z;
import a1.s;
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
import b1.C0513a;
import com.anythink.basead.exoplayer.k.p;
import com.google.android.gms.internal.ads.C2991bm;
import j1.AbstractC4599c;
import j1.C4597a;
import j1.j;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: f1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4500c extends AbstractC4498a {

    /* renamed from: D, reason: collision with root package name */
    public final Y0.a f37385D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f37386E;

    /* renamed from: F, reason: collision with root package name */
    public final Rect f37387F;

    /* renamed from: G, reason: collision with root package name */
    public final RectF f37388G;

    /* renamed from: H, reason: collision with root package name */
    public final x f37389H;

    /* renamed from: I, reason: collision with root package name */
    public s f37390I;
    public s J;

    /* renamed from: K, reason: collision with root package name */
    public final a1.h f37391K;

    /* renamed from: L, reason: collision with root package name */
    public j1.i f37392L;

    /* renamed from: M, reason: collision with root package name */
    public G1.a f37393M;

    public C4500c(v vVar, C4501d c4501d) {
        super(vVar, c4501d);
        x xVar;
        this.f37385D = new Y0.a(3, 0);
        this.f37386E = new Rect();
        this.f37387F = new Rect();
        this.f37388G = new RectF();
        X0.i iVar = vVar.f3690n;
        if (iVar == null) {
            xVar = null;
        } else {
            xVar = (x) ((HashMap) iVar.c()).get(c4501d.f37400g);
        }
        this.f37389H = xVar;
        N n9 = this.f37365p.f37416x;
        if (n9 != null) {
            this.f37391K = new a1.h(this, this, n9);
        }
    }

    @Override // f1.AbstractC4498a, Z0.e
    public final void c(RectF rectF, Matrix matrix, boolean z3) {
        super.c(rectF, matrix, z3);
        x xVar = this.f37389H;
        if (xVar != null) {
            float c9 = j.c();
            boolean z6 = this.f37364o.f3671F;
            int i = xVar.f3711b;
            int i6 = xVar.f3710a;
            if (z6) {
                rectF.set(0.0f, 0.0f, i6 * c9, i * c9);
            } else {
                if (s() != null) {
                    rectF.set(0.0f, 0.0f, r0.getWidth() * c9, r0.getHeight() * c9);
                } else {
                    rectF.set(0.0f, 0.0f, i6 * c9, i * c9);
                }
            }
            this.f37363n.mapRect(rectF);
        }
    }

    @Override // f1.AbstractC4498a, c1.f
    public final void h(ColorFilter colorFilter, C2991bm c2991bm) {
        super.h(colorFilter, c2991bm);
        if (colorFilter == z.f3724I) {
            this.f37390I = new s(c2991bm, null);
            return;
        }
        if (colorFilter == z.f3726L) {
            this.J = new s(c2991bm, null);
            return;
        }
        a1.h hVar = this.f37391K;
        if (colorFilter == 5 && hVar != null) {
            hVar.f4264c.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3720E && hVar != null) {
            hVar.c(c2991bm);
            return;
        }
        if (colorFilter == z.f3721F && hVar != null) {
            hVar.f4266e.j(c2991bm);
            return;
        }
        if (colorFilter == z.f3722G && hVar != null) {
            hVar.f4267f.j(c2991bm);
        } else {
            if (colorFilter != z.f3723H || hVar == null) {
                return;
            }
            hVar.f4268g.j(c2991bm);
        }
    }

    @Override // f1.AbstractC4498a
    public final void k(Canvas canvas, Matrix matrix, int i, C4597a c4597a) {
        x xVar;
        Bitmap s9 = s();
        if (s9 == null || s9.isRecycled() || (xVar = this.f37389H) == null) {
            return;
        }
        float c9 = j.c();
        Y0.a aVar = this.f37385D;
        aVar.setAlpha(i);
        s sVar = this.f37390I;
        if (sVar != null) {
            aVar.setColorFilter((ColorFilter) sVar.e());
        }
        a1.h hVar = this.f37391K;
        if (hVar != null) {
            c4597a = hVar.b(matrix, i);
        }
        int width = s9.getWidth();
        int height = s9.getHeight();
        Rect rect = this.f37386E;
        rect.set(0, 0, width, height);
        boolean z3 = this.f37364o.f3671F;
        Rect rect2 = this.f37387F;
        if (z3) {
            rect2.set(0, 0, (int) (xVar.f3710a * c9), (int) (xVar.f3711b * c9));
        } else {
            rect2.set(0, 0, (int) (s9.getWidth() * c9), (int) (s9.getHeight() * c9));
        }
        boolean z6 = c4597a != null;
        if (z6) {
            if (this.f37392L == null) {
                this.f37392L = new j1.i();
            }
            if (this.f37393M == null) {
                this.f37393M = new G1.a((byte) 0, 16);
            }
            G1.a aVar2 = this.f37393M;
            aVar2.f1050u = p.f8473b;
            aVar2.f1051v = null;
            c4597a.getClass();
            C4597a c4597a2 = new C4597a(c4597a);
            aVar2.f1051v = c4597a2;
            c4597a2.b(i);
            RectF rectF = this.f37388G;
            rectF.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            matrix.mapRect(rectF);
            canvas = this.f37392L.e(canvas, rectF, this.f37393M);
        }
        canvas.save();
        canvas.concat(matrix);
        canvas.drawBitmap(s9, rect, rect2, aVar);
        if (z6) {
            this.f37392L.c();
            if (this.f37392L.f38327c == 4) {
                return;
            }
        }
        canvas.restore();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r2 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1.f3707z = null;
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
        String str = this.f37365p.f37400g;
        v vVar = this.f37364o;
        C0513a c0513a = vVar.f3707z;
        if (c0513a != null) {
            Context h9 = vVar.h();
            Context context = c0513a.f5408a;
            if (h9 != null) {
                if (context instanceof Application) {
                    h9 = h9.getApplicationContext();
                }
            }
        }
        if (vVar.f3707z == null) {
            vVar.f3707z = new C0513a(vVar.getCallback(), vVar.f3666A, vVar.f3690n.c());
        }
        C0513a c0513a2 = vVar.f3707z;
        if (c0513a2 != null) {
            String str2 = c0513a2.f5409b;
            x xVar = (x) c0513a2.f5410c.get(str);
            if (xVar != null) {
                bitmap = xVar.f3715f;
                if (bitmap == null) {
                    Context context2 = c0513a2.f5408a;
                    if (context2 != null) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        String str3 = xVar.f3713d;
                        boolean startsWith = str3.startsWith("data:");
                        int i = xVar.f3711b;
                        int i6 = xVar.f3710a;
                        if (!startsWith || str3.indexOf("base64,") <= 0) {
                            try {
                                if (TextUtils.isEmpty(str2)) {
                                    throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
                                }
                                try {
                                    Bitmap decodeStream = BitmapFactory.decodeStream(context2.getAssets().open(str2 + str3), null, options);
                                    if (decodeStream == null) {
                                        AbstractC4599c.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = j.d(decodeStream, i6, i);
                                        synchronized (C0513a.f5407d) {
                                            ((x) c0513a2.f5410c.get(str)).f3715f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e9) {
                                    AbstractC4599c.c("Unable to decode image `" + str + "`.", e9);
                                }
                            } catch (IOException e10) {
                                AbstractC4599c.c("Unable to open asset.", e10);
                            }
                        } else {
                            try {
                                byte[] decode = Base64.decode(str3.substring(str3.indexOf(44) + 1), 0);
                                try {
                                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length, options);
                                    if (decodeByteArray == null) {
                                        AbstractC4599c.b("Decoded image `" + str + "` is null.");
                                    } else {
                                        bitmap = j.d(decodeByteArray, i6, i);
                                        synchronized (C0513a.f5407d) {
                                            ((x) c0513a2.f5410c.get(str)).f3715f = bitmap;
                                        }
                                    }
                                } catch (IllegalArgumentException e11) {
                                    AbstractC4599c.c("Unable to decode image `" + str + "`.", e11);
                                }
                            } catch (IllegalArgumentException e12) {
                                AbstractC4599c.c("data URL did not have correct base64 format.", e12);
                            }
                        }
                    }
                }
                if (bitmap == null) {
                    return bitmap;
                }
                x xVar2 = this.f37389H;
                if (xVar2 != null) {
                    return xVar2.f3715f;
                }
                return null;
            }
        }
        bitmap = null;
        if (bitmap == null) {
        }
    }
}
