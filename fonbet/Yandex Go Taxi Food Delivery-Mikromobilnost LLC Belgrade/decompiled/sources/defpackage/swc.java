package defpackage;

import com.pdfview.PDFView;
import java.io.File;

/* loaded from: classes11.dex */
public final class swc implements myg {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ swc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.myg
    public final Object a() {
        File file;
        float f;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Class) obj).newInstance();
            default:
                PDFView pDFView = (PDFView) obj;
                file = pDFView.mfile;
                f = pDFView.mScale;
                return new u390(pDFView, file, f);
        }
    }
}
