package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class PointerInteropFilter$pointerInputFilter$1$onCancel$1 extends Lambda implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ PointerInteropFilter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PointerInteropFilter$pointerInputFilter$1$onCancel$1(PointerInteropFilter pointerInteropFilter, int i) {
        super(1);
        this.$r8$classId = i;
        this.this$0 = pointerInteropFilter;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        PointerInteropFilter pointerInteropFilter = this.this$0;
        switch (i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                Function1 function1 = pointerInteropFilter.onTouchEvent;
                if (function1 != null) {
                    function1.invoke(motionEvent);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                Function1 function12 = pointerInteropFilter.onTouchEvent;
                if (function12 != null) {
                    function12.invoke(motionEvent2);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("onTouchEvent");
                throw null;
        }
    }
}
