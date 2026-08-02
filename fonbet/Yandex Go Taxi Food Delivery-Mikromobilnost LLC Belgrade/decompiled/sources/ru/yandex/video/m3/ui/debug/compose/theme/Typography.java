package ru.yandex.video.m3.ui.debug.compose.theme;

import defpackage.ety0;
import defpackage.jl40;
import defpackage.n;
import defpackage.qv10;
import defpackage.sty0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u0010\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lru/yandex/video/m3/ui/debug/compose/theme/Typography;", "", "Lety0;", "textStyle", "Lsty0;", "fontSize", "", "labelSizeMultiplier", "<init>", "(Lety0;JFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Lety0;", "component2-XSAIIZE", "()J", "component2", "component3", "()F", "copy-Rk4xWKU", "(Lety0;JF)Lru/yandex/video/m3/ui/debug/compose/theme/Typography;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lety0;", "getTextStyle", "J", "getFontSize-XSAIIZE", "F", "getLabelSizeMultiplier", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Typography {
    public static final int $stable = 0;
    private final long fontSize;
    private final float labelSizeMultiplier;
    private final ety0 textStyle;

    private Typography(ety0 ety0Var, long j, float f) {
        this.textStyle = ety0Var;
        this.fontSize = j;
        this.labelSizeMultiplier = f;
    }

    /* renamed from: copy-Rk4xWKU$default, reason: not valid java name */
    public static /* synthetic */ Typography m963copyRk4xWKU$default(Typography typography, ety0 ety0Var, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            ety0Var = typography.textStyle;
        }
        if ((i & 2) != 0) {
            j = typography.fontSize;
        }
        if ((i & 4) != 0) {
            f = typography.labelSizeMultiplier;
        }
        return typography.m965copyRk4xWKU(ety0Var, j, f);
    }

    /* renamed from: component1, reason: from getter */
    public final ety0 getTextStyle() {
        return this.textStyle;
    }

    /* renamed from: component2-XSAIIZE, reason: not valid java name and from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* renamed from: component3, reason: from getter */
    public final float getLabelSizeMultiplier() {
        return this.labelSizeMultiplier;
    }

    /* renamed from: copy-Rk4xWKU, reason: not valid java name */
    public final Typography m965copyRk4xWKU(ety0 textStyle, long fontSize, float labelSizeMultiplier) {
        return new Typography(textStyle, fontSize, labelSizeMultiplier, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return jl40.l(this.textStyle, typography.textStyle) && sty0.a(this.fontSize, typography.fontSize) && Float.compare(this.labelSizeMultiplier, typography.labelSizeMultiplier) == 0;
    }

    /* renamed from: getFontSize-XSAIIZE, reason: not valid java name */
    public final long m966getFontSizeXSAIIZE() {
        return this.fontSize;
    }

    public final float getLabelSizeMultiplier() {
        return this.labelSizeMultiplier;
    }

    public final ety0 getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        return Float.hashCode(this.labelSizeMultiplier) + qv10.c(this.textStyle.hashCode() * 31, 31, this.fontSize);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Typography(textStyle=");
        sb.append(this.textStyle);
        sb.append(", fontSize=");
        sb.append((Object) sty0.e(this.fontSize));
        sb.append(", labelSizeMultiplier=");
        return n.n(sb, this.labelSizeMultiplier, ')');
    }

    public /* synthetic */ Typography(ety0 ety0Var, long j, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(ety0Var, j, f);
    }
}
