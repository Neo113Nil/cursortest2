package androidx.glance;

import androidx.glance.color.DynamicThemeColorProviders;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class CompositionLocalsKt$LocalSize$1 extends Lambda implements Function0 {
    public static final CompositionLocalsKt$LocalSize$1 INSTANCE;
    public static final CompositionLocalsKt$LocalSize$1 INSTANCE$1;
    public static final CompositionLocalsKt$LocalSize$1 INSTANCE$2;
    public static final CompositionLocalsKt$LocalSize$1 INSTANCE$3;
    public static final CompositionLocalsKt$LocalSize$1 INSTANCE$4;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new CompositionLocalsKt$LocalSize$1(i, 1);
        INSTANCE$2 = new CompositionLocalsKt$LocalSize$1(i, 2);
        INSTANCE$3 = new CompositionLocalsKt$LocalSize$1(i, 3);
        INSTANCE = new CompositionLocalsKt$LocalSize$1(i, 0);
        INSTANCE$4 = new CompositionLocalsKt$LocalSize$1(i, 4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CompositionLocalsKt$LocalSize$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                throw new IllegalStateException("No default size");
            case 1:
                return DynamicThemeColorProviders.INSTANCE;
            case 2:
                throw new IllegalStateException("No default context");
            case 3:
                throw new IllegalStateException("No default glance id");
            default:
                return null;
        }
    }
}
