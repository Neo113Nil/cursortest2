package androidx.compose.ui.focus;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class FocusPropertiesImpl$onExit$1 extends Lambda implements Function1 {
    public static final FocusPropertiesImpl$onExit$1 INSTANCE;
    public static final FocusPropertiesImpl$onExit$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE$1 = new FocusPropertiesImpl$onExit$1(i, 1);
        INSTANCE = new FocusPropertiesImpl$onExit$1(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FocusPropertiesImpl$onExit$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                break;
        }
        return Unit.INSTANCE;
    }
}
