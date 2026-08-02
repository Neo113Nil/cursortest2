package ru.yandex.video.m3.ui.debug.compose.theme;

import defpackage.g8e;
import defpackage.n;
import defpackage.oyr;
import defpackage.y7m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\r\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0011J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\fR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u001e\u001a\u0004\b \u0010\fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b#\u0010\f\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Lru/yandex/video/m3/ui/debug/compose/theme/Spacers;", "", "Ly7m;", "verticalArrangement", "horizontalArrangement", "", "labelSpace", "", "tableCharWidthMultiplier", "<init>", "(FFIFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3", "()I", "component4", "copy-i1RSzL4", "(FFIF)Lru/yandex/video/m3/ui/debug/compose/theme/Spacers;", "copy", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getVerticalArrangement-D9Ej5fM", "getHorizontalArrangement-D9Ej5fM", CA20Status.STATUS_USER_I, "getLabelSpace", "getTableCharWidthMultiplier", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Spacers {
    public static final int $stable = 0;
    private final float horizontalArrangement;
    private final int labelSpace;
    private final float tableCharWidthMultiplier;
    private final float verticalArrangement;

    private Spacers(float f, float f2, int i, float f3) {
        this.verticalArrangement = f;
        this.horizontalArrangement = f2;
        this.labelSpace = i;
        this.tableCharWidthMultiplier = f3;
    }

    /* renamed from: copy-i1RSzL4$default, reason: not valid java name */
    public static /* synthetic */ Spacers m957copyi1RSzL4$default(Spacers spacers, float f, float f2, int i, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f = spacers.verticalArrangement;
        }
        if ((i2 & 2) != 0) {
            f2 = spacers.horizontalArrangement;
        }
        if ((i2 & 4) != 0) {
            i = spacers.labelSpace;
        }
        if ((i2 & 8) != 0) {
            f3 = spacers.tableCharWidthMultiplier;
        }
        return spacers.m960copyi1RSzL4(f, f2, i, f3);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLabelSpace() {
        return this.labelSpace;
    }

    /* renamed from: component4, reason: from getter */
    public final float getTableCharWidthMultiplier() {
        return this.tableCharWidthMultiplier;
    }

    /* renamed from: copy-i1RSzL4, reason: not valid java name */
    public final Spacers m960copyi1RSzL4(float verticalArrangement, float horizontalArrangement, int labelSpace, float tableCharWidthMultiplier) {
        return new Spacers(verticalArrangement, horizontalArrangement, labelSpace, tableCharWidthMultiplier, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spacers)) {
            return false;
        }
        Spacers spacers = (Spacers) other;
        return y7m.b(this.verticalArrangement, spacers.verticalArrangement) && y7m.b(this.horizontalArrangement, spacers.horizontalArrangement) && this.labelSpace == spacers.labelSpace && Float.compare(this.tableCharWidthMultiplier, spacers.tableCharWidthMultiplier) == 0;
    }

    /* renamed from: getHorizontalArrangement-D9Ej5fM, reason: not valid java name */
    public final float m961getHorizontalArrangementD9Ej5fM() {
        return this.horizontalArrangement;
    }

    public final int getLabelSpace() {
        return this.labelSpace;
    }

    public final float getTableCharWidthMultiplier() {
        return this.tableCharWidthMultiplier;
    }

    /* renamed from: getVerticalArrangement-D9Ej5fM, reason: not valid java name */
    public final float m962getVerticalArrangementD9Ej5fM() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return Float.hashCode(this.tableCharWidthMultiplier) + oyr.b(this.labelSpace, g8e.c(this.horizontalArrangement, Float.hashCode(this.verticalArrangement) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Spacers(verticalArrangement=");
        sb.append((Object) y7m.c(this.verticalArrangement));
        sb.append(", horizontalArrangement=");
        sb.append((Object) y7m.c(this.horizontalArrangement));
        sb.append(", labelSpace=");
        sb.append(this.labelSpace);
        sb.append(", tableCharWidthMultiplier=");
        return n.n(sb, this.tableCharWidthMultiplier, ')');
    }

    public /* synthetic */ Spacers(float f, float f2, int i, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, i, f3);
    }
}
