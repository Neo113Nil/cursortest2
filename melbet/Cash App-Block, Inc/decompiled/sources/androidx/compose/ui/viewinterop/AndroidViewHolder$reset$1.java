package androidx.compose.ui.viewinterop;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class AndroidViewHolder$reset$1 extends Lambda implements Function0 {
    public static final AndroidViewHolder$reset$1 INSTANCE;
    public static final AndroidViewHolder$reset$1 INSTANCE$1;
    public static final AndroidViewHolder$reset$1 INSTANCE$2;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new AndroidViewHolder$reset$1(i, 1);
        INSTANCE = new AndroidViewHolder$reset$1(i, 0);
        INSTANCE$2 = new AndroidViewHolder$reset$1(i, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AndroidViewHolder$reset$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.$r8$classId) {
        }
        return Unit.INSTANCE;
    }
}
