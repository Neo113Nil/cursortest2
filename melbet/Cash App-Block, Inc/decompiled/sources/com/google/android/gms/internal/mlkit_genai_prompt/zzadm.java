package com.google.android.gms.internal.mlkit_genai_prompt;

import android.net.Uri;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.mooncake.resources.ImageResourcesKt;
import com.squareup.scannerview.SizeMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.text.StringsKt;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import squareup.cash.bankingbenefits.ui.CashGreenV1;

/* loaded from: classes4.dex */
public abstract class zzadm {
    public static final GreenStatus access$toGreenStatus(CashGreenV1.Status status) {
        int ordinal = status.ordinal();
        if (ordinal == 0) {
            Path$$ExternalSyntheticBUOutline0.m$3();
            return null;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return GreenStatus.ACTIVE;
            }
            if (ordinal != 3 && ordinal != 4) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return GreenStatus.INACTIVE;
    }

    public static final String getUriQueryParam(SizeMap sizeMap, String str) {
        sizeMap.getClass();
        Uri uri = (Uri) sizeMap.mRatios;
        String queryParameter = uri != null ? uri.getQueryParameter(str) : null;
        if (queryParameter == null || StringsKt.isBlank(queryParameter)) {
            return null;
        }
        return queryParameter;
    }

    public static final void redo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        int i = textUndoOperation.index;
        textFieldBuffer.replace(i, textUndoOperation.preText.length() + i, textUndoOperation.postText);
        long j = textUndoOperation.postSelection;
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, (int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.mainBuffer, 0L, null, 15), true);
    }

    public static final void undo(TextFieldState textFieldState, TextUndoOperation textUndoOperation) {
        textFieldState.mainBuffer.getChangeTracker$foundation().clearChanges();
        TextFieldBuffer textFieldBuffer = textFieldState.mainBuffer;
        int i = textUndoOperation.index;
        textFieldBuffer.replace(i, textUndoOperation.postText.length() + i, textUndoOperation.preText);
        long j = textUndoOperation.preSelection;
        ImageResourcesKt.setSelectionCoerced(textFieldBuffer, (int) (j >> 32), (int) (j & BodyPartID.bodyIdMax));
        textFieldState.updateValueAndNotifyListeners(textFieldState.getValue$foundation(), TextFieldBuffer.m377toTextFieldCharSequencewFTz33Y$foundation$default(textFieldState.mainBuffer, 0L, null, 15), true);
    }
}
