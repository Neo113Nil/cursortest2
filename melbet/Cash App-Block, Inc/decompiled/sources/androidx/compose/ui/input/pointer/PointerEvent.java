package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.camera.video.Recorder;
import com.google.android.gms.tasks.zzr;
import java.util.List;

/* loaded from: classes.dex */
public final class PointerEvent {
    public final int buttons;
    public final List changes;
    public final int classification;
    public final zzr internalPointerEvent;
    public final int keyboardModifiers;

    /* renamed from: type, reason: collision with root package name */
    public int f858type;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        r0 = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
    
        if (r4 != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0084, code lost:
    
        if (r4 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PointerEvent(List list, zzr zzrVar) {
        this.changes = list;
        this.internalPointerEvent = zzrVar;
        MotionEvent motionEvent = getMotionEvent();
        int i = 0;
        this.classification = motionEvent != null ? motionEvent.getClassification() : 0;
        MotionEvent motionEvent2 = getMotionEvent();
        this.buttons = motionEvent2 != null ? motionEvent2.getButtonState() : 0;
        MotionEvent motionEvent3 = getMotionEvent();
        this.keyboardModifiers = motionEvent3 != null ? motionEvent3.getMetaState() : 0;
        MotionEvent motionEvent4 = getMotionEvent();
        if (motionEvent4 != null) {
            boolean z = motionEvent4.getClassification() == 3;
            boolean z2 = motionEvent4.getClassification() == 5;
            int actionMasked = motionEvent4.getActionMasked();
            if (actionMasked == 0) {
                if (!z) {
                    if (z2) {
                        i = 7;
                    }
                    i = 1;
                }
                i = 10;
            } else if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            if (!z) {
                            }
                            i = 10;
                            break;
                        case 6:
                            if (!z) {
                            }
                            i = 12;
                            break;
                        case 8:
                            i = 6;
                            break;
                        case 9:
                            i = 4;
                            break;
                        case 10:
                            i = 5;
                            break;
                    }
                }
                if (z) {
                    i = 11;
                }
            } else {
                if (!z) {
                    if (z2) {
                        i = 9;
                    }
                    i = 2;
                }
                i = 12;
            }
        } else {
            int size = list.size();
            while (i < size) {
                PointerInputChange pointerInputChange = (PointerInputChange) list.get(i);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    i = 2;
                } else if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    i = 1;
                } else {
                    i++;
                }
            }
            i = 3;
        }
        this.f858type = i;
    }

    public final MotionEvent getMotionEvent() {
        zzr zzrVar = this.internalPointerEvent;
        if (zzrVar != null) {
            return ((Recorder.AnonymousClass1) zzrVar.zzb).getMotionEvent();
        }
        return null;
    }
}
