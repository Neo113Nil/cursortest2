package app.cash.redwood.yoga.internal;

import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.enums.YGJustify;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class Yoga$YGNodeStyleSetJustifyContent$1 extends FunctionReferenceImpl implements Function1 {
    public static final Yoga$YGNodeStyleSetJustifyContent$1 INSTANCE = new Yoga$YGNodeStyleSetJustifyContent$1(1, YGStyle.class, "justifyContentBitfieldRef", "justifyContentBitfieldRef()Lapp/cash/redwood/yoga/internal/YGStyle$BitfieldRef;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        YGStyle yGStyle = (YGStyle) obj;
        yGStyle.getClass();
        return new YGStyle.BitfieldRef(yGStyle, YGStyle.justifyContentOffset, YGJustify.values());
    }
}
