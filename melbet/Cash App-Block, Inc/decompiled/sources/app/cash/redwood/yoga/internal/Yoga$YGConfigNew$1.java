package app.cash.redwood.yoga.internal;

import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class Yoga$YGConfigNew$1 implements FunctionAdapter {
    public final boolean equals(Object obj) {
        if (obj instanceof Yoga$YGConfigNew$1) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(5, 0, Yoga.class, Yoga.INSTANCE, "YGDefaultLog", "YGDefaultLog(Lapp/cash/redwood/yoga/internal/YGConfig;Lapp/cash/redwood/yoga/internal/YGNode;Lapp/cash/redwood/yoga/internal/enums/YGLogLevel;Ljava/lang/String;[Ljava/lang/Object;)I");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
