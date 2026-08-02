package app.cash.redwood.yoga.internal;

import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.enums.YGFlexDirection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class Yoga$YGNodeStyleSetFlexDirection$1 extends FunctionReferenceImpl implements Function1 {
    public static final Yoga$YGNodeStyleSetFlexDirection$1 INSTANCE = new Yoga$YGNodeStyleSetFlexDirection$1(1, YGStyle.class, "flexDirectionBitfieldRef", "flexDirectionBitfieldRef()Lapp/cash/redwood/yoga/internal/YGStyle$BitfieldRef;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        YGStyle yGStyle = (YGStyle) obj;
        yGStyle.getClass();
        return new YGStyle.BitfieldRef(yGStyle, YGStyle.flexdirectionOffset, YGFlexDirection.values());
    }
}
