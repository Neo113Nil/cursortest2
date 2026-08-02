package ru.yandex.video.m3.player.ui.debug.compose.theme;

import defpackage.g8e;
import defpackage.y7m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\tJ\u0016\u0010\u000e\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\tJ1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\tR\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\tR\u001d\u0010\u0005\u001a\u00020\u00028\u0006ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001f\u0010\t\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lru/yandex/video/m3/player/ui/debug/compose/theme/Spacers;", "", "Ly7m;", "verticalArrangement", "horizontalArrangement", "labelSpace", "<init>", "(FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-D9Ej5fM", "()F", "component1", "component2-D9Ej5fM", "component2", "component3-D9Ej5fM", "component3", "copy-2z7ARbQ", "(FFF)Lru/yandex/video/m3/player/ui/debug/compose/theme/Spacers;", "copy", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getVerticalArrangement-D9Ej5fM", "getHorizontalArrangement-D9Ej5fM", "getLabelSpace-D9Ej5fM", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Spacers {
    public static final int $stable = 0;
    private final float horizontalArrangement;
    private final float labelSpace;
    private final float verticalArrangement;

    private Spacers(float f, float f2, float f3) {
        this.verticalArrangement = f;
        this.horizontalArrangement = f2;
        this.labelSpace = f3;
    }

    /* renamed from: copy-2z7ARbQ$default, reason: not valid java name */
    public static /* synthetic */ Spacers m852copy2z7ARbQ$default(Spacers spacers, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = spacers.verticalArrangement;
        }
        if ((i & 2) != 0) {
            f2 = spacers.horizontalArrangement;
        }
        if ((i & 4) != 0) {
            f3 = spacers.labelSpace;
        }
        return spacers.m856copy2z7ARbQ(f, f2, f3);
    }

    /* renamed from: component1-D9Ej5fM, reason: not valid java name and from getter */
    public final float getVerticalArrangement() {
        return this.verticalArrangement;
    }

    /* renamed from: component2-D9Ej5fM, reason: not valid java name and from getter */
    public final float getHorizontalArrangement() {
        return this.horizontalArrangement;
    }

    /* renamed from: component3-D9Ej5fM, reason: not valid java name and from getter */
    public final float getLabelSpace() {
        return this.labelSpace;
    }

    /* renamed from: copy-2z7ARbQ, reason: not valid java name */
    public final Spacers m856copy2z7ARbQ(float verticalArrangement, float horizontalArrangement, float labelSpace) {
        return new Spacers(verticalArrangement, horizontalArrangement, labelSpace, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Spacers)) {
            return false;
        }
        Spacers spacers = (Spacers) other;
        return y7m.b(this.verticalArrangement, spacers.verticalArrangement) && y7m.b(this.horizontalArrangement, spacers.horizontalArrangement) && y7m.b(this.labelSpace, spacers.labelSpace);
    }

    /* renamed from: getHorizontalArrangement-D9Ej5fM, reason: not valid java name */
    public final float m857getHorizontalArrangementD9Ej5fM() {
        return this.horizontalArrangement;
    }

    /* renamed from: getLabelSpace-D9Ej5fM, reason: not valid java name */
    public final float m858getLabelSpaceD9Ej5fM() {
        return this.labelSpace;
    }

    /* renamed from: getVerticalArrangement-D9Ej5fM, reason: not valid java name */
    public final float m859getVerticalArrangementD9Ej5fM() {
        return this.verticalArrangement;
    }

    public int hashCode() {
        return Float.hashCode(this.labelSpace) + g8e.c(this.horizontalArrangement, Float.hashCode(this.verticalArrangement) * 31, 31);
    }

    public String toString() {
        return "Spacers(verticalArrangement=" + ((Object) y7m.c(this.verticalArrangement)) + ", horizontalArrangement=" + ((Object) y7m.c(this.horizontalArrangement)) + ", labelSpace=" + ((Object) y7m.c(this.labelSpace)) + ')';
    }

    public /* synthetic */ Spacers(float f, float f2, float f3, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3);
    }
}
