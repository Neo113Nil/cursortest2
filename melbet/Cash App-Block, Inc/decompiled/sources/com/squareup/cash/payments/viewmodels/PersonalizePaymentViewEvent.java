package com.squareup.cash.payments.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import app.cash.broadway.screen.Screen;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.knotapi.knot.utilities.Constants;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizePaymentViewEvent {

    public final class AddTextTapped implements PersonalizePaymentViewEvent {
        public static final AddTextTapped INSTANCE = new AddTextTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddTextTapped);
        }

        public final int hashCode() {
            return 27223679;
        }

        public final String toString() {
            return "AddTextTapped";
        }
    }

    public final class Back implements PersonalizePaymentViewEvent {
        public static final Back INSTANCE = new Back();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Back);
        }

        public final int hashCode() {
            return -360227230;
        }

        public final String toString() {
            return Constants.META_BACK_BUTTON;
        }
    }

    public final class DeleteElement implements PersonalizePaymentViewEvent {
        public final int elementId;
        public final boolean shouldDelete;

        public DeleteElement(int i, boolean z) {
            this.elementId = i;
            this.shouldDelete = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteElement)) {
                return false;
            }
            DeleteElement deleteElement = (DeleteElement) obj;
            return this.elementId == deleteElement.elementId && this.shouldDelete == deleteElement.shouldDelete;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.shouldDelete) + (Integer.hashCode(this.elementId) * 31);
        }

        public final String toString() {
            return "DeleteElement(elementId=" + this.elementId + ", shouldDelete=" + this.shouldDelete + ")";
        }
    }

    public final class MusicButtonTapped implements PersonalizePaymentViewEvent {
        public static final MusicButtonTapped INSTANCE = new MusicButtonTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MusicButtonTapped);
        }

        public final int hashCode() {
            return 3107208;
        }

        public final String toString() {
            return "MusicButtonTapped";
        }
    }

    public final class OnAmountDrawn implements PersonalizePaymentViewEvent {
        public final CanvasDetails amountCanvasDetails;

        public OnAmountDrawn(CanvasDetails canvasDetails) {
            this.amountCanvasDetails = canvasDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAmountDrawn) && this.amountCanvasDetails.equals(((OnAmountDrawn) obj).amountCanvasDetails);
        }

        public final int hashCode() {
            return this.amountCanvasDetails.hashCode();
        }

        public final String toString() {
            return "OnAmountDrawn(amountCanvasDetails=" + this.amountCanvasDetails + ")";
        }
    }

    public final class OnCanvasDrawn implements PersonalizePaymentViewEvent {
        public final CanvasDetails canvasDetails;

        public OnCanvasDrawn(CanvasDetails canvasDetails) {
            this.canvasDetails = canvasDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCanvasDrawn) && this.canvasDetails.equals(((OnCanvasDrawn) obj).canvasDetails);
        }

        public final int hashCode() {
            return this.canvasDetails.hashCode();
        }

        public final String toString() {
            return "OnCanvasDrawn(canvasDetails=" + this.canvasDetails + ")";
        }
    }

    public final class OnDeleteDrawn implements PersonalizePaymentViewEvent {
        public final CanvasDetails deleteCanvasDetails;

        public OnDeleteDrawn(CanvasDetails canvasDetails) {
            this.deleteCanvasDetails = canvasDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDeleteDrawn) && this.deleteCanvasDetails.equals(((OnDeleteDrawn) obj).deleteCanvasDetails);
        }

        public final int hashCode() {
            return this.deleteCanvasDetails.hashCode();
        }

        public final String toString() {
            return "OnDeleteDrawn(deleteCanvasDetails=" + this.deleteCanvasDetails + ")";
        }
    }

    public final class OnDialogEvent implements PersonalizePaymentViewEvent {
        public final Object result;
        public final Screen screenArgs;

        public OnDialogEvent(Screen screen, Object obj) {
            this.screenArgs = screen;
            this.result = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnDialogEvent)) {
                return false;
            }
            OnDialogEvent onDialogEvent = (OnDialogEvent) obj;
            return Intrinsics.areEqual(this.screenArgs, onDialogEvent.screenArgs) && Intrinsics.areEqual(this.result, onDialogEvent.result);
        }

        public final int hashCode() {
            Screen screen = this.screenArgs;
            int hashCode = (screen == null ? 0 : screen.hashCode()) * 31;
            Object obj = this.result;
            return hashCode + (obj != null ? obj.hashCode() : 0);
        }

        public final String toString() {
            return "OnDialogEvent(screenArgs=" + this.screenArgs + ", result=" + this.result + ")";
        }
    }

    public final class RequestFocus implements PersonalizePaymentViewEvent {
        public final Element element;
        public final boolean hasFocus;

        public RequestFocus(Element element, boolean z) {
            element.getClass();
            this.element = element;
            this.hasFocus = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestFocus)) {
                return false;
            }
            RequestFocus requestFocus = (RequestFocus) obj;
            return Intrinsics.areEqual(this.element, requestFocus.element) && this.hasFocus == requestFocus.hasFocus;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.hasFocus) + (this.element.hashCode() * 31);
        }

        public final String toString() {
            return "RequestFocus(element=" + this.element + ", hasFocus=" + this.hasFocus + ")";
        }
    }

    public final class ResetShakeOnInvalidEntry implements PersonalizePaymentViewEvent {
        public static final ResetShakeOnInvalidEntry INSTANCE = new ResetShakeOnInvalidEntry();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ResetShakeOnInvalidEntry);
        }

        public final int hashCode() {
            return -2053034740;
        }

        public final String toString() {
            return "ResetShakeOnInvalidEntry";
        }
    }

    /* loaded from: classes5.dex */
    public final class SelectBackground implements PersonalizePaymentViewEvent {
        public final int backgroundIndex;

        public SelectBackground(int i) {
            this.backgroundIndex = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SelectBackground) && this.backgroundIndex == ((SelectBackground) obj).backgroundIndex;
        }

        public final int hashCode() {
            return Integer.hashCode(this.backgroundIndex);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.backgroundIndex, "SelectBackground(backgroundIndex=", ")");
        }
    }

    public final class Send implements PersonalizePaymentViewEvent {
        public final List lastGesturesSignal;

        public Send(List list) {
            list.getClass();
            this.lastGesturesSignal = list;
        }
    }

    public final class StickerMenuTapped implements PersonalizePaymentViewEvent {
        public static final StickerMenuTapped INSTANCE = new StickerMenuTapped();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof StickerMenuTapped);
        }

        public final int hashCode() {
            return 448744525;
        }

        public final String toString() {
            return "StickerMenuTapped";
        }
    }

    public final class TextChanged implements PersonalizePaymentViewEvent {
        public final Element element;
        public final String text;

        public TextChanged(Element element, String str) {
            element.getClass();
            str.getClass();
            this.element = element;
            this.text = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextChanged)) {
                return false;
            }
            TextChanged textChanged = (TextChanged) obj;
            return Intrinsics.areEqual(this.element, textChanged.element) && Intrinsics.areEqual(this.text, textChanged.text);
        }

        public final int hashCode() {
            return this.text.hashCode() + (this.element.hashCode() * 31);
        }

        public final String toString() {
            return "TextChanged(element=" + this.element + ", text=" + this.text + ")";
        }
    }

    public final class TransformationEnded implements PersonalizePaymentViewEvent {
        public final int elementId;
        public final float offsetX;
        public final float offsetY;
        public final float rotation;
        public final float zoom;

        public TransformationEnded(float f, float f2, float f3, float f4, int i) {
            this.elementId = i;
            this.offsetX = f;
            this.offsetY = f2;
            this.rotation = f3;
            this.zoom = f4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransformationEnded)) {
                return false;
            }
            TransformationEnded transformationEnded = (TransformationEnded) obj;
            return this.elementId == transformationEnded.elementId && Float.compare(this.offsetX, transformationEnded.offsetX) == 0 && Float.compare(this.offsetY, transformationEnded.offsetY) == 0 && Float.compare(this.rotation, transformationEnded.rotation) == 0 && Float.compare(this.zoom, transformationEnded.zoom) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.zoom) + CameraState$Type$EnumUnboxingLocalUtility.m(this.rotation, CameraState$Type$EnumUnboxingLocalUtility.m(this.offsetY, CameraState$Type$EnumUnboxingLocalUtility.m(this.offsetX, Integer.hashCode(this.elementId) * 31, 31), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransformationEnded(elementId=");
            sb.append(this.elementId);
            sb.append(", offsetX=");
            sb.append(this.offsetX);
            sb.append(", offsetY=");
            Request$Priority$EnumUnboxingLocalUtility.m(sb, this.offsetY, ", rotation=", this.rotation, ", zoom=");
            return Recorder$$ExternalSyntheticOutline1.m(this.zoom, ")", sb);
        }
    }

    public final class TransformationStarted implements PersonalizePaymentViewEvent {
        public final int elementId;

        public TransformationStarted(int i) {
            this.elementId = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TransformationStarted) && this.elementId == ((TransformationStarted) obj).elementId;
        }

        public final int hashCode() {
            return Integer.hashCode(this.elementId);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.elementId, "TransformationStarted(elementId=", ")");
        }
    }
}
