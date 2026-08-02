package com.squareup.cash.checks;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.document.MiSnapDocumentAnalyzer$Result$Failure;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public interface CaptureCheckFaceViewEvent {

    public final class GoBack implements CaptureCheckFaceViewEvent {
        public static final GoBack INSTANCE = new GoBack();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoBack);
        }

        public final int hashCode() {
            return 329465528;
        }

        public final String toString() {
            return "GoBack";
        }
    }

    public final class GoToSettings implements CaptureCheckFaceViewEvent {
        public static final GoToSettings INSTANCE = new GoToSettings();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof GoToSettings);
        }

        public final int hashCode() {
            return -1355981617;
        }

        public final String toString() {
            return "GoToSettings";
        }
    }

    /* loaded from: classes4.dex */
    public final class MiSnapError implements CaptureCheckFaceViewEvent {
        public final MiSnapDocumentAnalyzer$Result$Failure error;

        public MiSnapError(MiSnapDocumentAnalyzer$Result$Failure miSnapDocumentAnalyzer$Result$Failure) {
            this.error = miSnapDocumentAnalyzer$Result$Failure;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiSnapError) && this.error.equals(((MiSnapError) obj).error);
        }

        public final int hashCode() {
            return this.error.hashCode();
        }

        public final String toString() {
            return "MiSnapError(error=" + this.error + ")";
        }
    }

    /* loaded from: classes4.dex */
    public final class MiSnapFeedback implements CaptureCheckFaceViewEvent {
        public final UserAction feedback;

        public MiSnapFeedback(UserAction userAction) {
            userAction.getClass();
            this.feedback = userAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MiSnapFeedback) && Intrinsics.areEqual(this.feedback, ((MiSnapFeedback) obj).feedback);
        }

        public final int hashCode() {
            return this.feedback.hashCode();
        }

        public final String toString() {
            return "MiSnapFeedback(feedback=" + this.feedback + ")";
        }
    }

    public final class RawFinalFrame implements CaptureCheckFaceViewEvent {
        public final List captureWarnings;
        public final List fourCorners;
        public final ByteString frame;
        public final int misnapViewHeight;
        public final int misnapViewWidth;
        public final String orientation;

        public RawFinalFrame(ByteString byteString, List list, List list2, String str, int i, int i2) {
            this.frame = byteString;
            this.fourCorners = list;
            this.captureWarnings = list2;
            this.orientation = str;
            this.misnapViewWidth = i;
            this.misnapViewHeight = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RawFinalFrame)) {
                return false;
            }
            RawFinalFrame rawFinalFrame = (RawFinalFrame) obj;
            return this.frame.equals(rawFinalFrame.frame) && Intrinsics.areEqual(this.fourCorners, rawFinalFrame.fourCorners) && Intrinsics.areEqual(this.captureWarnings, rawFinalFrame.captureWarnings) && Intrinsics.areEqual(this.orientation, rawFinalFrame.orientation) && this.misnapViewWidth == rawFinalFrame.misnapViewWidth && this.misnapViewHeight == rawFinalFrame.misnapViewHeight;
        }

        public final int hashCode() {
            int hashCode = this.frame.hashCode() * 31;
            List list = this.fourCorners;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List list2 = this.captureWarnings;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str = this.orientation;
            return Integer.hashCode(this.misnapViewHeight) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.misnapViewWidth, (hashCode3 + (str != null ? str.hashCode() : 0)) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RawFinalFrame(frame=");
            sb.append(this.frame);
            sb.append(", fourCorners=");
            sb.append(this.fourCorners);
            sb.append(", captureWarnings=");
            Recorder$$ExternalSyntheticOutline2.m(", orientation=", this.orientation, ", misnapViewWidth=", sb, this.captureWarnings);
            return Recorder$$ExternalSyntheticOutline1.m(this.misnapViewWidth, this.misnapViewHeight, ", misnapViewHeight=", ")", sb);
        }
    }
}
