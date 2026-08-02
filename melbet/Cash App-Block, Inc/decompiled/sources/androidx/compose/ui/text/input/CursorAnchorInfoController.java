package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.text.TextLayoutResult;
import com.squareup.cash.payments.presenters.RecipientMapper;
import com.squareup.wire.GrpcMethod;
import kotlin.Lazy;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public Rect decorationBoxBounds;
    public boolean hasPendingImmediateRequest;
    public boolean includeCharacterBounds;
    public boolean includeEditorBounds;
    public boolean includeInsertionMarker;
    public boolean includeLineBounds;
    public Rect innerTextFieldBounds;
    public final GrpcMethod inputMethodManager;
    public boolean monitorEnabled;
    public OffsetMapping offsetMapping;
    public final AndroidComposeView rootPositionCalculator;
    public TextFieldValue textFieldValue;
    public TextLayoutResult textLayoutResult;
    public final Object lock = new Object();
    public Function1 textFieldToRootTransform = TextInputServiceAndroid$onEditCommand$1.INSTANCE$1;
    public final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();
    public final float[] matrix = Matrix.m699constructorimpl$default();
    public final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(AndroidComposeView androidComposeView, GrpcMethod grpcMethod) {
        this.rootPositionCalculator = androidComposeView;
        this.inputMethodManager = grpcMethod;
    }

    public final void updateCursorAnchorInfo() {
        GrpcMethod grpcMethod = this.inputMethodManager;
        Lazy lazy = (Lazy) grpcMethod.requestAdapter;
        InputMethodManager inputMethodManager = (InputMethodManager) lazy.getValue();
        AndroidComposeView androidComposeView = (AndroidComposeView) grpcMethod.path;
        if (inputMethodManager.isActive(androidComposeView)) {
            Function1 function1 = this.textFieldToRootTransform;
            float[] fArr = this.matrix;
            function1.invoke(new Matrix(fArr));
            this.rootPositionCalculator.m915localToScreen58bKbWc(fArr);
            android.graphics.Matrix matrix = this.androidMatrix;
            ColorKt.m691setFromEL8BTi8(matrix, fArr);
            TextFieldValue textFieldValue = this.textFieldValue;
            textFieldValue.getClass();
            OffsetMapping offsetMapping = this.offsetMapping;
            offsetMapping.getClass();
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            textLayoutResult.getClass();
            Rect rect = this.innerTextFieldBounds;
            rect.getClass();
            Rect rect2 = this.decorationBoxBounds;
            rect2.getClass();
            ((InputMethodManager) lazy.getValue()).updateCursorAnchorInfo(androidComposeView, RecipientMapper.build(this.builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }
}
