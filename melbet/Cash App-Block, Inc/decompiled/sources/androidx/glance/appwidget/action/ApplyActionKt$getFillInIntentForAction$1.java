package androidx.glance.appwidget.action;

import androidx.glance.action.MutableActionParameters;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ApplyActionKt$getFillInIntentForAction$1 extends Lambda implements Function1 {
    public static final ApplyActionKt$getFillInIntentForAction$1 INSTANCE;
    public static final ApplyActionKt$getFillInIntentForAction$1 INSTANCE$1;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 1;
        INSTANCE = new ApplyActionKt$getFillInIntentForAction$1(i, 0);
        INSTANCE$1 = new ApplyActionKt$getFillInIntentForAction$1(i, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApplyActionKt$getFillInIntentForAction$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$r8$classId) {
        }
        return (MutableActionParameters) obj;
    }
}
