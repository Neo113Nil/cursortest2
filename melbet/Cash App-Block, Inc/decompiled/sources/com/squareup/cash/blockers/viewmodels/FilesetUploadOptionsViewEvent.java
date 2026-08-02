package com.squareup.cash.blockers.viewmodels;

import com.knotapi.knot.utilities.Constants;

/* loaded from: classes4.dex */
public interface FilesetUploadOptionsViewEvent {

    public final class Close implements FilesetUploadOptionsViewEvent {
        public static final Close INSTANCE = new Close();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Close);
        }

        public final int hashCode() {
            return 889839596;
        }

        public final String toString() {
            return Constants.META_CLOSE;
        }
    }

    public final class Complete implements FilesetUploadOptionsViewEvent {
        public final FilesetUploadOptionsSheetResult result;

        public Complete(FilesetUploadOptionsSheetResult filesetUploadOptionsSheetResult) {
            this.result = filesetUploadOptionsSheetResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Complete) && this.result == ((Complete) obj).result;
        }

        public final int hashCode() {
            return this.result.hashCode();
        }

        public final String toString() {
            return "Complete(result=" + this.result + ")";
        }
    }
}
