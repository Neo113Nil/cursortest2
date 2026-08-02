package com.squareup.cash.pdf.view;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes6.dex */
public interface PdfPreviewEvent {

    public final class Close implements PdfPreviewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return -2115689485;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class DismissToast implements PdfPreviewEvent {
        public static final DismissToast INSTANCE = new DismissToast();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DismissToast);
        }

        public final int hashCode() {
            return -1293151390;
        }

        public final String toString() {
            return "DismissToast";
        }
    }

    public final class Download implements PdfPreviewEvent {
        public static final Download INSTANCE = new Download();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Download);
        }

        public final int hashCode() {
            return 474709165;
        }

        public final String toString() {
            return "Download";
        }
    }

    public final class Share implements PdfPreviewEvent {
        public static final Share INSTANCE = new Share();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Share);
        }

        public final int hashCode() {
            return -2101045798;
        }

        public final String toString() {
            return "Share";
        }
    }
}
