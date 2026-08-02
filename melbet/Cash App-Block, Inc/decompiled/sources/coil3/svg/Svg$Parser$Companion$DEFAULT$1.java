package coil3.svg;

import coil3.svg.internal.ParseSvg_androidKt;
import kotlin.Function;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class Svg$Parser$Companion$DEFAULT$1 implements FunctionAdapter {
    public static final Svg$Parser$Companion$DEFAULT$1 INSTANCE = new Svg$Parser$Companion$DEFAULT$1();

    public final boolean equals(Object obj) {
        if ((obj instanceof Svg$Parser$Companion$DEFAULT$1) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function getFunctionDelegate() {
        return new FunctionReferenceImpl(1, ParseSvg_androidKt.class, "parseSvg", "parseSvg(Lokio/BufferedSource;)Lcoil3/svg/Svg;", 1);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
