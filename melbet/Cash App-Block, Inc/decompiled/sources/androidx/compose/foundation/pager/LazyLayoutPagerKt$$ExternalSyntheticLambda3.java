package androidx.compose.foundation.pager;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.support.chat.views.transcript.message.compose.ImageState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes3.dex */
public final /* synthetic */ class LazyLayoutPagerKt$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ MutableState f$0;
    public final /* synthetic */ MutableState f$1;
    public final /* synthetic */ Function0 f$2;

    public /* synthetic */ LazyLayoutPagerKt$$ExternalSyntheticLambda3(MutableState mutableState, MutableState mutableState2, Function0 function0) {
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
        this.f$2 = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$1;
        MutableState mutableState2 = this.f$0;
        Function0 function0 = this.f$2;
        switch (i) {
            case 0:
                return new PagerLayoutIntervalContent((Function4) mutableState2.getValue(), (Function1) mutableState.getValue(), ((Number) function0.invoke()).intValue());
            default:
                mutableState2.setValue(Integer.valueOf(((Number) mutableState2.getValue()).intValue() + 1));
                mutableState.setValue(ImageState.LOADING);
                function0.invoke();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LazyLayoutPagerKt$$ExternalSyntheticLambda3(Function0 function0, MutableState mutableState, MutableState mutableState2) {
        this.f$2 = function0;
        this.f$0 = mutableState;
        this.f$1 = mutableState2;
    }
}
