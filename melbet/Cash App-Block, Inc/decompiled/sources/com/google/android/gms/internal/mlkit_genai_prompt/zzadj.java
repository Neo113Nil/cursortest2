package com.google.android.gms.internal.mlkit_genai_prompt;

import android.bluetooth.le.ScanFilter;
import android.net.Uri;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.internal.ChangeTracker$Change;
import androidx.compose.foundation.text.input.internal.undo.TextDeleteType;
import androidx.compose.foundation.text.input.internal.undo.TextEditType;
import androidx.compose.foundation.text.input.internal.undo.TextUndoOperation;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.text.TextRange;
import androidx.work.impl.WorkLauncherImpl;
import coil3.size.SizeKt;
import com.squareup.cash.beacondetection.real.BeaconConstants;
import com.squareup.scannerview.SizeMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes4.dex */
public abstract class zzadj {
    public static final String access$getBitcoinAddress(SizeMap sizeMap) {
        Uri uri = (Uri) sizeMap.mRatios;
        String host = uri != null ? uri.getHost() : null;
        if (host == null || host.length() == 0) {
            return null;
        }
        return host;
    }

    public static final Long access$getBitcoinAmount(SizeMap sizeMap) {
        String uriQueryParam = zzadm.getUriQueryParam(sizeMap, "amount");
        if (uriQueryParam == null) {
            return null;
        }
        try {
            return Long.valueOf((long) (Double.parseDouble(StringsKt__StringsJVMKt.replace$default(uriQueryParam, ",", "")) * 1.0E8d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static ScanFilter buildScanFilter$real() {
        UUID uuid = BeaconConstants.SQUARE_POS_BEACON_UUID;
        byte[] bArr = new byte[23];
        byte[] bArr2 = new byte[23];
        bArr[0] = 2;
        bArr[1] = 21;
        bArr2[0] = -1;
        bArr2[1] = -1;
        long mostSignificantBits = uuid.getMostSignificantBits();
        long leastSignificantBits = uuid.getLeastSignificantBits();
        for (int i = 0; i < 8; i++) {
            int i2 = i + 2;
            int i3 = 56 - (i * 8);
            bArr[i2] = (byte) (mostSignificantBits >>> i3);
            int i4 = i + 10;
            bArr[i4] = (byte) (leastSignificantBits >>> i3);
            bArr2[i2] = -1;
            bArr2[i4] = -1;
        }
        ScanFilter build = new ScanFilter.Builder().setManufacturerData(76, bArr, bArr2).build();
        build.getClass();
        return build;
    }

    public static final TextUndoOperation merge(TextUndoOperation textUndoOperation, TextUndoOperation textUndoOperation2) {
        String str = textUndoOperation2.postText;
        boolean z = textUndoOperation.canMerge;
        String str2 = textUndoOperation.preText;
        String str3 = textUndoOperation.postText;
        int i = textUndoOperation.index;
        TextEditType textEditType = textUndoOperation.textEditType;
        if (z) {
            boolean z2 = textUndoOperation2.canMerge;
            String str4 = textUndoOperation2.preText;
            int i2 = textUndoOperation2.index;
            if (z2) {
                long j = textUndoOperation2.timeInMillis;
                long j2 = textUndoOperation.timeInMillis;
                if (j >= j2 && j - j2 < 5000 && !Intrinsics.areEqual(str3, "\n") && !Intrinsics.areEqual(str3, "\r\n") && !Intrinsics.areEqual(str, "\n") && !Intrinsics.areEqual(str, "\r\n") && textEditType == textUndoOperation2.textEditType) {
                    if (textEditType == TextEditType.Insert && str3.length() + i == i2) {
                        return new TextUndoOperation(textUndoOperation.index, "", Recorder$$ExternalSyntheticOutline2.m$1(str3, str), textUndoOperation.preSelection, textUndoOperation2.postSelection, textUndoOperation.timeInMillis, false, 64);
                    }
                    if (textEditType == TextEditType.Delete && textUndoOperation.getDeletionType() == textUndoOperation2.getDeletionType() && (textUndoOperation.getDeletionType() == TextDeleteType.Start || textUndoOperation.getDeletionType() == TextDeleteType.End)) {
                        if (i == str4.length() + i2) {
                            return new TextUndoOperation(textUndoOperation2.index, Recorder$$ExternalSyntheticOutline2.m$1(str4, str2), "", textUndoOperation.preSelection, textUndoOperation2.postSelection, textUndoOperation.timeInMillis, false, 64);
                        }
                        int i3 = textUndoOperation.index;
                        if (i3 == i2) {
                            return new TextUndoOperation(i3, Recorder$$ExternalSyntheticOutline2.m$1(str2, str4), "", textUndoOperation.preSelection, textUndoOperation2.postSelection, textUndoOperation.timeInMillis, false, 64);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final void recordChanges(WorkLauncherImpl workLauncherImpl, TextFieldCharSequence textFieldCharSequence, TextFieldCharSequence textFieldCharSequence2, WorkLauncherImpl workLauncherImpl2, boolean z) {
        MutableVector mutableVector = (MutableVector) workLauncherImpl2.processor;
        int i = mutableVector.size;
        if (i > 1) {
            workLauncherImpl.record(new TextUndoOperation(0, textFieldCharSequence.text.toString(), textFieldCharSequence2.text.toString(), textFieldCharSequence.selection, textFieldCharSequence2.selection, 0L, false, 32));
            return;
        }
        if (i == 1) {
            ChangeTracker$Change changeTracker$Change = (ChangeTracker$Change) mutableVector.content[0];
            long TextRange = SizeKt.TextRange(changeTracker$Change.originalStart, changeTracker$Change.originalEnd);
            ChangeTracker$Change changeTracker$Change2 = (ChangeTracker$Change) ((MutableVector) workLauncherImpl2.processor).content[0];
            long TextRange2 = SizeKt.TextRange(changeTracker$Change2.preStart, changeTracker$Change2.preEnd);
            if (TextRange.m987getCollapsedimpl(TextRange) && TextRange.m987getCollapsedimpl(TextRange2)) {
                return;
            }
            workLauncherImpl.record(new TextUndoOperation(TextRange.m990getMinimpl(TextRange), SizeKt.m1471substringFDrldGo(TextRange, textFieldCharSequence), SizeKt.m1471substringFDrldGo(TextRange2, textFieldCharSequence2), textFieldCharSequence.selection, textFieldCharSequence2.selection, 0L, z, 32));
        }
    }
}
