package com.squareup.cash.money.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;
import squareup.cash.savings.SavingsElement;

/* loaded from: classes6.dex */
public final class InstalledBalanceAppletTileContentModel$Metadata$Chart extends SavingsElement.Element {
    public final Arrow arrow;
    public final String percentText;
    public final long percentTint;
    public final String todayText;
    public final long todayTextTint;

    public final class Arrow {
        public final Direction direction;
        public final Icons icon;
        public final long tint;

        public Arrow(Direction direction, Icons icons, long j) {
            this.direction = direction;
            this.icon = icons;
            this.tint = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arrow)) {
                return false;
            }
            Arrow arrow = (Arrow) obj;
            return this.direction == arrow.direction && this.icon == arrow.icon && Color.m676equalsimpl0(this.tint, arrow.tint);
        }

        public final int hashCode() {
            int hashCode = (this.icon.hashCode() + (this.direction.hashCode() * 31)) * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.tint) + hashCode;
        }

        public final String toString() {
            String m682toStringimpl = Color.m682toStringimpl(this.tint);
            StringBuilder sb = new StringBuilder("Arrow(direction=");
            sb.append(this.direction);
            sb.append(", icon=");
            sb.append(this.icon);
            sb.append(", tint=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, m682toStringimpl, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Direction {
        public static final /* synthetic */ Direction[] $VALUES;
        public static final Direction DOWN;
        public static final Direction UP;

        static {
            Direction direction = new Direction("UP", 0);
            UP = direction;
            Direction direction2 = new Direction("DOWN", 1);
            DOWN = direction2;
            $VALUES = new Direction[]{direction, direction2};
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    public InstalledBalanceAppletTileContentModel$Metadata$Chart(Arrow arrow, long j, long j2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.arrow = arrow;
        this.percentTint = j;
        this.todayTextTint = j2;
        this.percentText = str;
        this.todayText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledBalanceAppletTileContentModel$Metadata$Chart)) {
            return false;
        }
        InstalledBalanceAppletTileContentModel$Metadata$Chart installedBalanceAppletTileContentModel$Metadata$Chart = (InstalledBalanceAppletTileContentModel$Metadata$Chart) obj;
        return Intrinsics.areEqual(this.arrow, installedBalanceAppletTileContentModel$Metadata$Chart.arrow) && Color.m676equalsimpl0(this.percentTint, installedBalanceAppletTileContentModel$Metadata$Chart.percentTint) && Color.m676equalsimpl0(this.todayTextTint, installedBalanceAppletTileContentModel$Metadata$Chart.todayTextTint) && Intrinsics.areEqual(this.percentText, installedBalanceAppletTileContentModel$Metadata$Chart.percentText) && Intrinsics.areEqual(this.todayText, installedBalanceAppletTileContentModel$Metadata$Chart.todayText);
    }

    public final int hashCode() {
        Arrow arrow = this.arrow;
        int hashCode = arrow == null ? 0 : arrow.hashCode();
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        return this.todayText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(hashCode * 31, 31, this.percentTint), 31, this.todayTextTint), 31, this.percentText);
    }

    public final String toString() {
        String m682toStringimpl = Color.m682toStringimpl(this.percentTint);
        String m682toStringimpl2 = Color.m682toStringimpl(this.todayTextTint);
        StringBuilder sb = new StringBuilder("Chart(arrow=");
        sb.append(this.arrow);
        sb.append(", percentTint=");
        sb.append(m682toStringimpl);
        sb.append(", todayTextTint=");
        Boxes$$ExternalSyntheticOutline1.m(sb, m682toStringimpl2, ", percentText=", this.percentText, ", todayText=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.todayText, ")");
    }
}
