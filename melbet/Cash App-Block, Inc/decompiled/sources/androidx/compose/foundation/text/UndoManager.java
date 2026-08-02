package androidx.compose.foundation.text;

import androidx.camera.video.Recorder;
import androidx.compose.ui.text.input.TextFieldValue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class UndoManager {
    public boolean forceNextSnapshot;
    public Long lastSnapshot;
    public Recorder.AnonymousClass1 redoStack;
    public int storedCharacters;
    public Recorder.AnonymousClass1 undoStack;

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071 A[LOOP:0: B:24:0x0061->B:29:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:31:0x0076 BREAK  A[LOOP:0: B:24:0x0061->B:29:0x0071], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void makeSnapshot(TextFieldValue textFieldValue) {
        Recorder.AnonymousClass1 anonymousClass1;
        TextFieldValue textFieldValue2;
        this.forceNextSnapshot = false;
        Recorder.AnonymousClass1 anonymousClass12 = this.undoStack;
        if (Intrinsics.areEqual(textFieldValue, anonymousClass12 != null ? (TextFieldValue) anonymousClass12.this$0 : null)) {
            return;
        }
        String str = textFieldValue.annotatedString.text;
        Recorder.AnonymousClass1 anonymousClass13 = this.undoStack;
        boolean areEqual = Intrinsics.areEqual(str, (anonymousClass13 == null || (textFieldValue2 = (TextFieldValue) anonymousClass13.this$0) == null) ? null : textFieldValue2.annotatedString.text);
        Recorder.AnonymousClass1 anonymousClass14 = this.undoStack;
        if (areEqual) {
            if (anonymousClass14 != null) {
                anonymousClass14.this$0 = textFieldValue;
                return;
            }
            return;
        }
        this.undoStack = new Recorder.AnonymousClass1(17, anonymousClass14, textFieldValue);
        this.redoStack = null;
        int length = textFieldValue.annotatedString.text.length() + this.storedCharacters;
        this.storedCharacters = length;
        if (length > 100000) {
            Recorder.AnonymousClass1 anonymousClass15 = this.undoStack;
            if ((anonymousClass15 != null ? (Recorder.AnonymousClass1) anonymousClass15.val$videoEncoderSession : null) == null) {
                return;
            }
            while (true) {
                if (anonymousClass15 != null) {
                    Recorder.AnonymousClass1 anonymousClass16 = (Recorder.AnonymousClass1) anonymousClass15.val$videoEncoderSession;
                    if (anonymousClass16 != null) {
                        anonymousClass1 = (Recorder.AnonymousClass1) anonymousClass16.val$videoEncoderSession;
                        if (anonymousClass1 != null) {
                            break;
                        } else {
                            anonymousClass15 = (Recorder.AnonymousClass1) anonymousClass15.val$videoEncoderSession;
                        }
                    }
                }
                anonymousClass1 = null;
                if (anonymousClass1 != null) {
                }
            }
            if (anonymousClass15 != null) {
                anonymousClass15.val$videoEncoderSession = null;
            }
        }
    }
}
