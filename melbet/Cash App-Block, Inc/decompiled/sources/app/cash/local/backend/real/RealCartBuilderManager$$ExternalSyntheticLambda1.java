package app.cash.local.backend.real;

import androidx.compose.foundation.lazy.LazyListState$$ExternalSyntheticLambda3;
import androidx.work.Data$$ExternalSyntheticLambda0;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.backend.CartBuilder;
import com.squareup.cash.fidesmo.views.haptic.WaveformHapticPattern;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import kotlin.jvm.functions.Function1;
import okio.ByteString;

/* loaded from: classes3.dex */
public final /* synthetic */ class RealCartBuilderManager$$ExternalSyntheticLambda1 implements Function {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ RealCartBuilderManager$$ExternalSyntheticLambda1(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.$r8$classId;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                return (CartBuilder) ((RealBadger2$$ExternalSyntheticLambda0) function1).invoke(obj);
            case 1:
                return (AtomicLong) ((Data$$ExternalSyntheticLambda0) function1).invoke(obj);
            case 2:
                return (WaveformHapticPattern) ((LazyListState$$ExternalSyntheticLambda3) function1).invoke(obj);
            default:
                return (ByteString) ((TabToolbarsKt$$ExternalSyntheticLambda28) function1).invoke(obj);
        }
    }
}
