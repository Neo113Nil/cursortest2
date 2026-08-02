package com.squareup.cash.pdf.backend.real;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public final class PdfBitmapRender {
    public final ArrayList pdfBitmaps;

    public PdfBitmapRender(ArrayList arrayList) {
        this.pdfBitmaps = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PdfBitmapRender) && this.pdfBitmaps.equals(((PdfBitmapRender) obj).pdfBitmaps);
    }

    public final int hashCode() {
        return this.pdfBitmaps.hashCode();
    }

    public final String toString() {
        return Request$Priority$EnumUnboxingLocalUtility.m("PdfBitmapRender(pdfBitmaps=", ")", this.pdfBitmaps);
    }
}
