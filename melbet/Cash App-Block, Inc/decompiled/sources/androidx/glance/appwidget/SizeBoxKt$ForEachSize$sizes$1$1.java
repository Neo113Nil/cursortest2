package androidx.glance.appwidget;

import androidx.compose.ui.unit.DpSize;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class SizeBoxKt$ForEachSize$sizes$1$1 extends Lambda implements Function0 {
    public final /* synthetic */ long $minSize;
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SizeBoxKt$ForEachSize$sizes$1$1(long j, int i) {
        super(0);
        this.$r8$classId = i;
        this.$minSize = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        long j = this.$minSize;
        switch (i) {
            case 0:
                return new DpSize(j);
            case 1:
                return String.format(Locale.US, "[Mobile Metric] Gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
            default:
                return String.format(Locale.US, "[Mobile Metric] Negative gap between views", Arrays.copyOf(new Object[]{Long.valueOf(j)}, 1));
        }
    }
}
