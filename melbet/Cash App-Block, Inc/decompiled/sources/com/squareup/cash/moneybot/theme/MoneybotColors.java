package com.squareup.cash.moneybot.theme;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotColors {
    public final Canvas canvas;
    public final Card card;
    public final Composer composer;
    public final Pill pill;
    public final Suggestion suggestion;

    public final class Canvas {
        public final long background;
        public final Glyph glyph;
        public final Brush gradient;

        public final class Glyph {

            /* renamed from: default, reason: not valid java name */
            public final long f477default;

            public Glyph(long j) {
                this.f477default = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Glyph) && Color.m676equalsimpl0(this.f477default, ((Glyph) obj).f477default);
            }

            public final int hashCode() {
                int i = Color.$r8$clinit;
                ULong.Companion companion = ULong.Companion;
                return Long.hashCode(this.f477default);
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Glyph(default=", Color.m682toStringimpl(this.f477default), ")");
            }
        }

        public Canvas(long j, LinearGradient linearGradient, Glyph glyph) {
            this.background = j;
            this.gradient = linearGradient;
            this.glyph = glyph;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Canvas)) {
                return false;
            }
            Canvas canvas = (Canvas) obj;
            return Color.m676equalsimpl0(this.background, canvas.background) && Intrinsics.areEqual(this.gradient, canvas.gradient) && this.glyph.equals(canvas.glyph);
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            int hashCode = Long.hashCode(this.background) * 31;
            Brush brush = this.gradient;
            return this.glyph.hashCode() + ((hashCode + (brush == null ? 0 : brush.hashCode())) * 31);
        }

        public final String toString() {
            return "Canvas(background=" + Color.m682toStringimpl(this.background) + ", gradient=" + this.gradient + ", glyph=" + this.glyph + ")";
        }
    }

    public final class Card {
        public final long background;

        public Card(long j) {
            this.background = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Card) && Color.m676equalsimpl0(this.background, ((Card) obj).background);
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.background);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Card(background=", Color.m682toStringimpl(this.background), ")");
        }
    }

    public final class Composer {
        public final long background;

        public Composer(long j) {
            this.background = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Composer) && Color.m676equalsimpl0(this.background, ((Composer) obj).background);
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.background);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Composer(background=", Color.m682toStringimpl(this.background), ")");
        }
    }

    public final class Pill {
        public final long background;

        public Pill(long j) {
            this.background = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Pill) && Color.m676equalsimpl0(this.background, ((Pill) obj).background);
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.background);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Pill(background=", Color.m682toStringimpl(this.background), ")");
        }
    }

    public final class Suggestion {
        public final long cardBackground;
        public final long pillGradientBase;

        public Suggestion(long j, long j2) {
            this.cardBackground = j;
            this.pillGradientBase = j2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) obj;
            return Color.m676equalsimpl0(this.cardBackground, suggestion.cardBackground) && Color.m676equalsimpl0(this.pillGradientBase, suggestion.pillGradientBase);
        }

        public final int hashCode() {
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            return Long.hashCode(this.pillGradientBase) + (Long.hashCode(this.cardBackground) * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Suggestion(cardBackground=", Color.m682toStringimpl(this.cardBackground), ", pillGradientBase=", Color.m682toStringimpl(this.pillGradientBase), ")");
        }
    }

    public MoneybotColors(Card card, Composer composer, Pill pill, Suggestion suggestion, Canvas canvas) {
        this.card = card;
        this.composer = composer;
        this.pill = pill;
        this.suggestion = suggestion;
        this.canvas = canvas;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotColors)) {
            return false;
        }
        MoneybotColors moneybotColors = (MoneybotColors) obj;
        return this.card.equals(moneybotColors.card) && this.composer.equals(moneybotColors.composer) && this.pill.equals(moneybotColors.pill) && this.suggestion.equals(moneybotColors.suggestion) && this.canvas.equals(moneybotColors.canvas);
    }

    public final int hashCode() {
        return this.canvas.hashCode() + ((this.suggestion.hashCode() + ((this.pill.hashCode() + ((this.composer.hashCode() + (this.card.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MoneybotColors(card=" + this.card + ", composer=" + this.composer + ", pill=" + this.pill + ", suggestion=" + this.suggestion + ", canvas=" + this.canvas + ")";
    }
}
