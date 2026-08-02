package io.scer.pdfx;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import android.util.SparseArray;
import android.view.Surface;
import defpackage.bvf0;
import defpackage.c2m;
import defpackage.g3r;
import defpackage.gwk0;
import defpackage.jrb0;
import defpackage.lrb0;
import defpackage.mdh;
import defpackage.mrb0;
import defpackage.nrb0;
import defpackage.orb0;
import defpackage.oy80;
import defpackage.prb0;
import defpackage.psr;
import defpackage.qrb0;
import defpackage.r690;
import defpackage.rzo;
import defpackage.s790;
import defpackage.sjh;
import defpackage.ssr;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vx10;
import defpackage.xuy0;
import defpackage.xwl;
import io.flutter.embedding.engine.renderer.f;
import io.flutter.view.TextureRegistry$SurfaceLifecycle;
import io.flutter.view.TextureRegistry$SurfaceProducer;
import io.scer.pdfx.resources.RepositoryItemNotFoundException;
import io.scer.pdfx.utils.CreateRendererException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import kotlin.Pair;
import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes4.dex */
public final class a implements qrb0 {
    public final ssr a;
    public final c2m b;
    public final s790 c;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();

    public a(ssr ssrVar, c2m c2mVar, s790 s790Var) {
        this.a = ssrVar;
        this.b = c2mVar;
        this.c = s790Var;
    }

    public static Pair k(File file) {
        file.getPath();
        ParcelFileDescriptor open = ParcelFileDescriptor.open(file, SelfTester_JCP.IMITA);
        if (open != null) {
            return new Pair(open, new PdfRenderer(open));
        }
        throw new CreateRendererException();
    }

    public final void b(jrb0.c cVar) {
        try {
            this.b.b(cVar.a);
        } catch (RepositoryItemNotFoundException unused) {
            throw new PdfRendererException("Document not exist in documents repository", null);
        } catch (NullPointerException unused2) {
            throw new PdfRendererException("Need call arguments: id!", null);
        } catch (Exception unused3) {
            throw new PdfRendererException("Unknown error", null);
        }
    }

    public final void c(jrb0.c cVar) {
        try {
            this.c.b(cVar.a);
        } catch (RepositoryItemNotFoundException unused) {
            throw new PdfRendererException("Page not exist in pages repository", null);
        } catch (NullPointerException unused2) {
            throw new PdfRendererException("Need call arguments: id!", null);
        } catch (Exception unused3) {
            throw new PdfRendererException("Unknown error", null);
        }
    }

    public final void d(jrb0.a aVar, orb0 orb0Var) {
        jrb0.b bVar = new jrb0.b();
        try {
            String str = aVar.a;
            int longValue = (int) aVar.b.longValue();
            boolean booleanValue = aVar.c.booleanValue();
            c2m c2mVar = this.b;
            if (booleanValue) {
                PdfRenderer.Page openPage = ((xwl) c2mVar.a(str)).b.openPage(longValue - 1);
                try {
                    bVar.b = Double.valueOf(openPage.getWidth());
                    bVar.c = Double.valueOf(openPage.getHeight());
                    gwk0.m(openPage, null);
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        gwk0.m(openPage, th);
                        throw th2;
                    }
                }
            } else {
                r690 c = this.c.c(str, ((xwl) c2mVar.a(str)).b.openPage(longValue - 1));
                PdfRenderer.Page page = c.b;
                bVar.a = c.a;
                bVar.b = Double.valueOf(page.getWidth());
                bVar.c = Double.valueOf(page.getHeight());
            }
            orb0Var.success(bVar);
        } catch (RepositoryItemNotFoundException unused) {
            orb0Var.c(new PdfRendererException("Document not exist in documents", null));
        } catch (NullPointerException unused2) {
            orb0Var.c(new PdfRendererException("Need call arguments: documentId & page!", null));
        } catch (Exception unused3) {
            orb0Var.c(new PdfRendererException("Unknown error", null));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|2|3|(1:5)(1:37)|6|(1:8)(1:36)|9|(13:(1:12)|13|14|15|16|(1:18)|19|20|21|22|(1:24)|25|26)|(12:35|14|15|16|(0)|19|20|21|22|(0)|25|26)|13|14|15|16|(0)|19|20|21|22|(0)|25|26|(2:(0)|(1:42))) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0101, code lost:
    
        if (r21 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0103, code lost:
    
        r21.c(new io.scer.pdfx.PdfRendererException("updateTexture Unknown error", null));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d3 A[Catch: all -> 0x002a, Exception -> 0x0101, TryCatch #3 {Exception -> 0x0101, blocks: (B:16:0x00cb, B:18:0x00d3, B:19:0x00da, B:22:0x00f3, B:24:0x00f8, B:30:0x00fd, B:31:0x0100), top: B:15:0x00cb, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f8 A[Catch: all -> 0x002a, Exception -> 0x0101, TryCatch #3 {Exception -> 0x0101, blocks: (B:16:0x00cb, B:18:0x00d3, B:19:0x00da, B:22:0x00f3, B:24:0x00f8, B:30:0x00fd, B:31:0x0100), top: B:15:0x00cb, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(Surface surface, jrb0.l lVar, oy80 oy80Var) {
        int i;
        String str;
        PdfRenderer.Page openPage = ((xwl) this.b.a(lVar.a)).b.openPage(((int) lVar.b.longValue()) - 1);
        try {
            Double d = lVar.l;
            double doubleValue = d != null ? d.doubleValue() : openPage.getWidth();
            Double d2 = lVar.m;
            double doubleValue2 = d2 != null ? d2.doubleValue() : openPage.getHeight();
            int longValue = (int) lVar.j.longValue();
            int longValue2 = (int) lVar.k.longValue();
            int longValue3 = (int) lVar.e.longValue();
            int longValue4 = (int) lVar.f.longValue();
            int longValue5 = (int) lVar.h.longValue();
            int longValue6 = (int) lVar.i.longValue();
            String str2 = lVar.g;
            try {
                if (longValue3 > 0) {
                    if (longValue4 <= 0) {
                    }
                    str = str2;
                    i = 1;
                    Matrix matrix = new Matrix();
                    float[] fArr = new float[9];
                    fArr[0] = (float) (doubleValue / openPage.getWidth());
                    fArr[i] = 0.0f;
                    fArr[2] = -longValue5;
                    fArr[3] = 0.0f;
                    fArr[4] = (float) (doubleValue2 / openPage.getHeight());
                    fArr[5] = -longValue6;
                    fArr[6] = 0.0f;
                    fArr[7] = 0.0f;
                    fArr[8] = 1.0f;
                    matrix.setValues(fArr);
                    Bitmap createBitmap = Bitmap.createBitmap(longValue3, longValue4, Bitmap.Config.ARGB_8888);
                    if (str != null) {
                        createBitmap.eraseColor(Color.parseColor(str));
                    }
                    openPage.render(createBitmap, null, matrix, i);
                    Canvas lockCanvas = surface.lockCanvas(new Rect(longValue, longValue2, longValue3, longValue4));
                    lockCanvas.drawBitmap(createBitmap, longValue, longValue2, (Paint) null);
                    createBitmap.recycle();
                    surface.unlockCanvasAndPost(lockCanvas);
                    if (oy80Var != null) {
                        oy80Var.success(null);
                    }
                    gwk0.m(openPage, null);
                    return;
                }
                if (oy80Var != null) {
                    i = 1;
                    str = str2;
                    oy80Var.c(new PdfRendererException("updateTexture width/height == 0", null));
                    Matrix matrix2 = new Matrix();
                    float[] fArr2 = new float[9];
                    fArr2[0] = (float) (doubleValue / openPage.getWidth());
                    fArr2[i] = 0.0f;
                    fArr2[2] = -longValue5;
                    fArr2[3] = 0.0f;
                    fArr2[4] = (float) (doubleValue2 / openPage.getHeight());
                    fArr2[5] = -longValue6;
                    fArr2[6] = 0.0f;
                    fArr2[7] = 0.0f;
                    fArr2[8] = 1.0f;
                    matrix2.setValues(fArr2);
                    Bitmap createBitmap2 = Bitmap.createBitmap(longValue3, longValue4, Bitmap.Config.ARGB_8888);
                    if (str != null) {
                    }
                    openPage.render(createBitmap2, null, matrix2, i);
                    Canvas lockCanvas2 = surface.lockCanvas(new Rect(longValue, longValue2, longValue3, longValue4));
                    lockCanvas2.drawBitmap(createBitmap2, longValue, longValue2, (Paint) null);
                    createBitmap2.recycle();
                    surface.unlockCanvasAndPost(lockCanvas2);
                    if (oy80Var != null) {
                    }
                    gwk0.m(openPage, null);
                    return;
                }
                Canvas lockCanvas22 = surface.lockCanvas(new Rect(longValue, longValue2, longValue3, longValue4));
                lockCanvas22.drawBitmap(createBitmap2, longValue, longValue2, (Paint) null);
                createBitmap2.recycle();
                surface.unlockCanvasAndPost(lockCanvas22);
                if (oy80Var != null) {
                }
                gwk0.m(openPage, null);
                return;
            } finally {
                surface.release();
            }
            str = str2;
            i = 1;
            Matrix matrix22 = new Matrix();
            float[] fArr22 = new float[9];
            fArr22[0] = (float) (doubleValue / openPage.getWidth());
            fArr22[i] = 0.0f;
            fArr22[2] = -longValue5;
            fArr22[3] = 0.0f;
            fArr22[4] = (float) (doubleValue2 / openPage.getHeight());
            fArr22[5] = -longValue6;
            fArr22[6] = 0.0f;
            fArr22[7] = 0.0f;
            fArr22[8] = 1.0f;
            matrix22.setValues(fArr22);
            Bitmap createBitmap22 = Bitmap.createBitmap(longValue3, longValue4, Bitmap.Config.ARGB_8888);
            if (str != null) {
            }
            openPage.render(createBitmap22, null, matrix22, i);
        } finally {
        }
    }

    public final Pair f(String str) {
        ssr ssrVar = this.a;
        String c = ((psr) ssrVar.f.a).c(str);
        Context context = ssrVar.a;
        File file = new File(context.getCacheDir(), new Regex("-").j(UUID.randomUUID().toString(), "").concat(".pdf"));
        if (!file.exists()) {
            InputStream open = context.getAssets().open(c);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                rzo.l(open, fileOutputStream);
                fileOutputStream.close();
                open.close();
            } finally {
            }
        }
        file.getPath();
        return k(file);
    }

    public final Pair g(byte[] bArr) {
        File file = new File(this.a.a.getCacheDir(), new Regex("-").j(UUID.randomUUID().toString(), "").concat(".pdf"));
        if (!file.exists()) {
            g3r.f(file, bArr);
        }
        file.getPath();
        return k(file);
    }

    public final void h(jrb0.e eVar, nrb0 nrb0Var) {
        jrb0.f fVar = new jrb0.f();
        try {
            fVar.a = this.b.c(f(eVar.a)).a;
            fVar.b = Long.valueOf(r2.b.getPageCount());
            nrb0Var.success(fVar);
        } catch (CreateRendererException unused) {
            nrb0Var.c(new PdfRendererException("Can't create PDF renderer", null));
        } catch (FileNotFoundException unused2) {
            nrb0Var.c(new PdfRendererException("File not found", null));
        } catch (IOException unused3) {
            nrb0Var.c(new PdfRendererException("Can't open file", null));
        } catch (NullPointerException unused4) {
            nrb0Var.c(new PdfRendererException("Need call arguments: path", null));
        } catch (Exception unused5) {
            nrb0Var.c(new PdfRendererException("Unknown error", null));
        }
    }

    public final void i(jrb0.d dVar, lrb0 lrb0Var) {
        jrb0.f fVar = new jrb0.f();
        try {
            fVar.a = this.b.c(g(dVar.a)).a;
            fVar.b = Long.valueOf(r2.b.getPageCount());
            lrb0Var.success(fVar);
        } catch (CreateRendererException unused) {
            lrb0Var.c(new PdfRendererException("Can't create PDF renderer", null));
        } catch (IOException unused2) {
            lrb0Var.c(new PdfRendererException("Can't open file", null));
        } catch (Exception unused3) {
            lrb0Var.c(new PdfRendererException("Unknown error", null));
        }
    }

    public final void j(jrb0.e eVar, mrb0 mrb0Var) {
        jrb0.f fVar = new jrb0.f();
        try {
            fVar.a = this.b.c(k(new File(eVar.a))).a;
            fVar.b = Long.valueOf(r3.b.getPageCount());
            mrb0Var.success(fVar);
        } catch (CreateRendererException unused) {
            mrb0Var.c(new PdfRendererException("Can't create PDF renderer", null));
        } catch (FileNotFoundException unused2) {
            mrb0Var.c(new PdfRendererException("File not found", null));
        } catch (IOException unused3) {
            mrb0Var.c(new PdfRendererException("Can't open file", null));
        } catch (NullPointerException unused4) {
            mrb0Var.c(new PdfRendererException("Need call arguments: path", null));
        } catch (Exception unused5) {
            mrb0Var.c(new PdfRendererException("Unknown error", null));
        }
    }

    public final jrb0.g l() {
        xuy0 xuy0Var = this.a.d;
        xuy0Var.getClass();
        TextureRegistry$SurfaceProducer b = ((f) xuy0Var).b(TextureRegistry$SurfaceLifecycle.manual);
        int id = (int) b.id();
        this.d.put(id, b);
        b.setCallback(new vx10(this, id, b));
        jrb0.g gVar = new jrb0.g();
        gVar.a = Long.valueOf(id);
        return gVar;
    }

    public final void m(jrb0.h hVar, prb0 prb0Var) {
        jrb0.i iVar = new jrb0.i();
        sjh sjhVar = uyj.a;
        tje.N(bvf0.a(mdh.b), null, null, new Messages$renderPage$1(hVar, this, prb0Var, iVar, null), 3);
    }

    public final void n(jrb0.k kVar) {
        int longValue = (int) kVar.a.longValue();
        SparseArray sparseArray = this.d;
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) sparseArray.get(longValue);
        if (textureRegistry$SurfaceProducer != null) {
            textureRegistry$SurfaceProducer.setCallback(null);
        }
        if (textureRegistry$SurfaceProducer != null) {
            textureRegistry$SurfaceProducer.release();
        }
        sparseArray.remove(longValue);
    }

    public final void o(jrb0.l lVar, oy80 oy80Var) {
        int longValue = (int) lVar.d.longValue();
        TextureRegistry$SurfaceProducer textureRegistry$SurfaceProducer = (TextureRegistry$SurfaceProducer) this.d.get(longValue);
        int longValue2 = (int) lVar.n.longValue();
        int longValue3 = (int) lVar.o.longValue();
        if (longValue2 != 0 && longValue3 != 0) {
            textureRegistry$SurfaceProducer.setSize(longValue2, longValue3);
        }
        this.e.put(longValue, lVar);
        e(textureRegistry$SurfaceProducer.getSurface(), lVar, oy80Var);
    }
}
