package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.pdf.PdfRenderer;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.pdfview.PDFView;
import java.io.File;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes11.dex */
public final class u390 implements sdv {
    public ParcelFileDescriptor a;
    public PdfRenderer b;
    public int c;
    public int d;
    public final PDFView e;
    public final File f;
    public final float g;

    public u390(PDFView pDFView, File file, float f) {
        this.e = pDFView;
        this.f = file;
        this.g = f;
    }

    @Override // defpackage.sdv
    public final void a() {
        this.b.close();
        this.a.close();
        this.c = 0;
        this.d = 0;
    }

    @Override // defpackage.sdv
    public final Point b(Context context, Uri uri) {
        this.a = ParcelFileDescriptor.open(this.f, SelfTester_JCP.IMITA);
        PdfRenderer pdfRenderer = new PdfRenderer(this.a);
        this.b = pdfRenderer;
        PdfRenderer.Page openPage = pdfRenderer.openPage(0);
        float width = openPage.getWidth();
        float f = this.g;
        this.c = (int) (width * f);
        this.d = (int) (openPage.getHeight() * f);
        int pageCount = this.b.getPageCount();
        PDFView pDFView = this.e;
        if (pageCount > 15) {
            pDFView.setHasBaseLayerTiles(false);
        } else if (this.b.getPageCount() == 1) {
            pDFView.setMinimumScaleType(1);
        }
        openPage.close();
        return new Point(this.c, this.b.getPageCount() * this.d);
    }

    @Override // defpackage.sdv
    public final Bitmap c(int i, Rect rect) {
        int floor = (int) Math.floor(rect.top / this.d);
        int ceil = ((int) Math.ceil(rect.bottom / this.d)) - 1;
        Bitmap createBitmap = Bitmap.createBitmap(rect.width() / i, rect.height() / i, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(-1);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        c6w it = new d6w(floor, ceil, 1).iterator();
        int i2 = 0;
        while (it.c) {
            int nextInt = it.nextInt();
            synchronized (this.b) {
                PdfRenderer.Page openPage = this.b.openPage(nextInt);
                Matrix matrix = new Matrix();
                float f = i;
                float f2 = this.g / f;
                matrix.setScale(f2, f2);
                float f3 = (-rect.left) / i;
                int i3 = rect.top;
                matrix.postTranslate(f3, ((this.d / f) * i2) + (-((i3 - (r15 * floor)) / i)));
                openPage.render(createBitmap, null, matrix, 1);
                openPage.close();
            }
            i2++;
        }
        return createBitmap;
    }

    @Override // defpackage.sdv
    public final boolean isReady() {
        return this.c > 0 && this.d > 0;
    }
}
