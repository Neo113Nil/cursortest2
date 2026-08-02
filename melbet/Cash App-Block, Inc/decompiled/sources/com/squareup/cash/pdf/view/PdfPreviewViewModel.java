package com.squareup.cash.pdf.view;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.pdf.backend.real.PdfBitmapRender;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PdfPreviewViewModel {

    public final class Loading implements PdfPreviewViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 1208506337;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public final class Ready implements PdfPreviewViewModel {
        public final PdfBitmapRender pdfRender;
        public final String title;
        public final String toast;

        public Ready(String str, PdfBitmapRender pdfBitmapRender, String str2) {
            this.title = str;
            this.pdfRender = pdfBitmapRender;
            this.toast = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) obj;
            return this.title.equals(ready.title) && this.pdfRender.equals(ready.pdfRender) && Intrinsics.areEqual(this.toast, ready.toast);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.pdfRender.pdfBitmaps, this.title.hashCode() * 31, 31);
            String str = this.toast;
            return m + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Ready(title=");
            sb.append(this.title);
            sb.append(", pdfRender=");
            sb.append(this.pdfRender);
            sb.append(", toast=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.toast, ")");
        }
    }
}
