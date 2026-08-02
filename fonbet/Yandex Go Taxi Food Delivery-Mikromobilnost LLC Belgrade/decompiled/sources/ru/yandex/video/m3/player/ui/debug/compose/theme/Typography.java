package ru.yandex.video.m3.player.ui.debug.compose.theme;

import defpackage.ety0;
import defpackage.jl40;
import defpackage.n;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/yandex/video/m3/player/ui/debug/compose/theme/Typography;", "", "Lety0;", "textStyle", "", "labelSizeMultiplier", "<init>", "(Lety0;F)V", "component1", "()Lety0;", "component2", "()F", "copy", "(Lety0;F)Lru/yandex/video/m3/player/ui/debug/compose/theme/Typography;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lety0;", "getTextStyle", "F", "getLabelSizeMultiplier", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Typography {
    public static final int $stable = 0;
    private final float labelSizeMultiplier;
    private final ety0 textStyle;

    public Typography(ety0 ety0Var, float f) {
        this.textStyle = ety0Var;
        this.labelSizeMultiplier = f;
    }

    public static /* synthetic */ Typography copy$default(Typography typography, ety0 ety0Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            ety0Var = typography.textStyle;
        }
        if ((i & 2) != 0) {
            f = typography.labelSizeMultiplier;
        }
        return typography.copy(ety0Var, f);
    }

    /* renamed from: component1, reason: from getter */
    public final ety0 getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final float getLabelSizeMultiplier() {
        return this.labelSizeMultiplier;
    }

    public final Typography copy(ety0 textStyle, float labelSizeMultiplier) {
        return new Typography(textStyle, labelSizeMultiplier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return jl40.l(this.textStyle, typography.textStyle) && Float.compare(this.labelSizeMultiplier, typography.labelSizeMultiplier) == 0;
    }

    public final float getLabelSizeMultiplier() {
        return this.labelSizeMultiplier;
    }

    public final ety0 getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return Float.hashCode(this.labelSizeMultiplier) + (this.textStyle.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Typography(textStyle=");
        sb.append(this.textStyle);
        sb.append(", labelSizeMultiplier=");
        return n.n(sb, this.labelSizeMultiplier, ')');
    }
}
