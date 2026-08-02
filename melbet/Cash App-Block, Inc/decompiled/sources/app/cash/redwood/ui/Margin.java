package app.cash.redwood.ui;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes3.dex */
public final class Margin {
    public static final Companion Companion = new Companion();
    public static final Margin Zero;
    public final double bottom;
    public final double end;
    public final double start;
    public final double top;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"app/cash/redwood/ui/Margin$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lapp/cash/redwood/ui/Margin;", "serializer", "()Lkotlinx/serialization/KSerializer;", "redwood-runtime_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return Margin$$serializer.INSTANCE;
        }
    }

    static {
        Dp.m1405constructorimpl(0.0d);
        Zero = new Margin(0.0d, 0.0d, 0.0d, 0.0d);
    }

    public /* synthetic */ Margin(int i, Dp dp, Dp dp2, Dp dp3, Dp dp4) {
        if ((i & 1) == 0) {
            Dp.m1405constructorimpl(0.0d);
            this.start = 0.0d;
        } else {
            this.start = dp.value;
        }
        if ((i & 2) == 0) {
            Dp.m1405constructorimpl(0.0d);
            this.end = 0.0d;
        } else {
            this.end = dp2.value;
        }
        if ((i & 4) == 0) {
            Dp.m1405constructorimpl(0.0d);
            this.top = 0.0d;
        } else {
            this.top = dp3.value;
        }
        if ((i & 8) != 0) {
            this.bottom = dp4.value;
        } else {
            Dp.m1405constructorimpl(0.0d);
            this.bottom = 0.0d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Margin)) {
            return false;
        }
        Margin margin = (Margin) obj;
        return Dp.m1406equalsimpl0(this.start, margin.start) && Dp.m1406equalsimpl0(this.end, margin.end) && Dp.m1406equalsimpl0(this.top, margin.top) && Dp.m1406equalsimpl0(this.bottom, margin.bottom);
    }

    public final int hashCode() {
        return Double.hashCode(this.bottom) + Fragment$5$$ExternalSyntheticOutline0.m(this.top, Fragment$5$$ExternalSyntheticOutline0.m(this.end, Double.hashCode(this.start) * 31, 31), 31);
    }

    public final String toString() {
        double d = this.start;
        double d2 = this.end;
        boolean m1406equalsimpl0 = Dp.m1406equalsimpl0(d, d2);
        double d3 = this.bottom;
        double d4 = this.top;
        if (m1406equalsimpl0 && Dp.m1406equalsimpl0(d4, d3)) {
            return !Dp.m1406equalsimpl0(d, d4) ? Boxes$$ExternalSyntheticOutline1.m("Margin(horizontal=", Dp.m1407toStringimpl(d), ", vertical=", Dp.m1407toStringimpl(d4), ")") : JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Margin(all=", Dp.m1407toStringimpl(d), ")");
        }
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Margin(start=", Dp.m1407toStringimpl(d), ", end=", Dp.m1407toStringimpl(d2), ", top="), Dp.m1407toStringimpl(d4), ", bottom=", Dp.m1407toStringimpl(d3), ")");
    }

    public Margin(double d, double d2, double d3, double d4) {
        this.start = d;
        this.end = d2;
        this.top = d3;
        this.bottom = d4;
    }
}
