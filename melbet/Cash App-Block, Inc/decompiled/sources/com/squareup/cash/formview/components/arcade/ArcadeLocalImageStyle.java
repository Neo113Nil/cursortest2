package com.squareup.cash.formview.components.arcade;

/* loaded from: classes6.dex */
public final class ArcadeLocalImageStyle {
    public final ArcadeLocalIconBackground background;
    public final ArcadeLocalIconForeground foreground;

    public /* synthetic */ ArcadeLocalImageStyle(ArcadeLocalIconBackground arcadeLocalIconBackground, int i) {
        this((i & 1) != 0 ? ArcadeLocalIconForeground.INVERSE : ArcadeLocalIconForeground.BACKGROUND_APP, (i & 2) != 0 ? ArcadeLocalIconBackground.BRAND : arcadeLocalIconBackground);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArcadeLocalImageStyle)) {
            return false;
        }
        ArcadeLocalImageStyle arcadeLocalImageStyle = (ArcadeLocalImageStyle) obj;
        return this.foreground == arcadeLocalImageStyle.foreground && this.background == arcadeLocalImageStyle.background;
    }

    public final int hashCode() {
        return this.background.hashCode() + (this.foreground.hashCode() * 31);
    }

    public final String toString() {
        return "ArcadeLocalImageStyle(foreground=" + this.foreground + ", background=" + this.background + ")";
    }

    public ArcadeLocalImageStyle(ArcadeLocalIconForeground arcadeLocalIconForeground, ArcadeLocalIconBackground arcadeLocalIconBackground) {
        arcadeLocalIconForeground.getClass();
        arcadeLocalIconBackground.getClass();
        this.foreground = arcadeLocalIconForeground;
        this.background = arcadeLocalIconBackground;
    }
}
