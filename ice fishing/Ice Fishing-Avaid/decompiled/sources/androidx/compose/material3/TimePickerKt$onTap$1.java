package androidx.compose.material3;

import androidx.compose.ui.tooling.preview.AndroidUiModes;
import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: TimePicker.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = AndroidUiModes.UI_MODE_NIGHT_MASK)
@DebugMetadata(c = "androidx.compose.material3.TimePickerKt", f = "TimePicker.kt", i = {0, 0, 1, 1}, l = {PointerIconCompat.TYPE_VERTICAL_TEXT, PointerIconCompat.TYPE_NO_DROP}, m = "onTap-uYHVD98", n = {"$this$onTap_u2duYHVD98", "autoSwitchToMinute", "$this$onTap_u2duYHVD98", "autoSwitchToMinute"}, s = {"L$0", "Z$0", "L$0", "Z$0"}, v = 1)
/* loaded from: classes.dex */
final class TimePickerKt$onTap$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;

    TimePickerKt$onTap$1(Continuation<? super TimePickerKt$onTap$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m4366onTapuYHVD98;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m4366onTapuYHVD98 = TimePickerKt.m4366onTapuYHVD98(null, 0.0f, 0.0f, 0.0f, false, 0L, null, this);
        return m4366onTapuYHVD98;
    }
}
