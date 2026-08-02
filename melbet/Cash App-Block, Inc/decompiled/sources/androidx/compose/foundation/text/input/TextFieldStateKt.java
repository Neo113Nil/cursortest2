package androidx.compose.foundation.text.input;

import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import bo.app.qc$$ExternalSyntheticLambda4;
import coil3.size.SizeKt;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.cash.threedsdataonly.backend.api.Warning;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSdkWarning;
import com.squareup.protos.cash.security.mri.api.v1.ThreeDsSignals;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.TimeoutCancellationException;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class TextFieldStateKt {
    /* renamed from: access$finalizeComposingAnnotations-itr0ztk, reason: not valid java name */
    public static final List m381access$finalizeComposingAnnotationsitr0ztk(TextRange textRange, MutableVector mutableVector) {
        if (mutableVector != null && mutableVector.size != 0) {
            return CollectionsKt.toList(mutableVector.asMutableList());
        }
        if (textRange != null) {
            long j = textRange.packedValue;
            if (!TextRange.m987getCollapsedimpl(j)) {
                return CollectionsKt__CollectionsJVMKt.listOf(new AnnotatedString.Range(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.Underline, (Shadow) null, 61439), TextRange.m990getMinimpl(j), TextRange.m989getMaximpl(j)));
            }
        }
        return EmptyList.INSTANCE;
    }

    public static final void clearText(TextFieldState textFieldState) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.buffer.length(), "");
            ImageResourcesKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    /* renamed from: rememberTextFieldState-Le-punE, reason: not valid java name */
    public static final TextFieldState m382rememberTextFieldStateLepunE(String str, long j, Composer composer, int i, int i2) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            int length = str.length();
            j = SizeKt.TextRange(length, length);
        }
        Object[] objArr = new Object[0];
        int i3 = 1;
        boolean z = ((((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(str)) || (i & 6) == 4) | ((((i & 112) ^ 48) > 32 && ((GapComposer) composer).changed(j)) || (i & 48) == 32);
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new qc$$ExternalSyntheticLambda4(str, j, i3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (TextFieldState) SaverKt.m581rememberSaveable(objArr, (Saver) TextFieldState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 48);
    }

    public static final void setTextAndPlaceCursorAtEnd(TextFieldState textFieldState, String str) {
        TextFieldBuffer startEdit = textFieldState.startEdit();
        try {
            startEdit.replace(0, startEdit.buffer.length(), str);
            ImageResourcesKt.placeCursorAtEnd(startEdit);
            textFieldState.commitEdit(startEdit);
        } finally {
            textFieldState.finishEditing();
        }
    }

    public static final ThreeDsSignals toThreeDsSignalsProto(Object obj) {
        ThreeDsSdkWarning.Severity severity;
        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
        if (m4120exceptionOrNullimpl != null) {
            return new ThreeDsSignals(m4120exceptionOrNullimpl instanceof TimeoutCancellationException ? ThreeDsSignals.Status.STATUS_INITIALIZATION_TIMEOUT : ThreeDsSignals.Status.STATUS_INITIALIZATION_FAILED, EmptyList.INSTANCE);
        }
        List list = (List) obj;
        ThreeDsSignals.Status status = list.isEmpty() ? ThreeDsSignals.Status.STATUS_SUCCESS : ThreeDsSignals.Status.STATUS_WARNING;
        List<Warning> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Warning warning : list2) {
            String str = warning.id;
            String str2 = warning.message;
            int ordinal = warning.severity.ordinal();
            if (ordinal == 0) {
                severity = ThreeDsSdkWarning.Severity.SEVERITY_HIGH;
            } else if (ordinal == 1) {
                severity = ThreeDsSdkWarning.Severity.SEVERITY_MEDIUM;
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                severity = ThreeDsSdkWarning.Severity.SEVERITY_LOW;
            }
            arrayList.add(new ThreeDsSdkWarning(str, str2, severity, ByteString.EMPTY));
        }
        return new ThreeDsSignals(status, arrayList);
    }
}
