package com.squareup.cash.money.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstalledServiceAppletTileContentModel {
    public final String brief;
    public final BriefState briefState;
    public final Emphasis emphasis;
    public final Function3 visual;

    public interface BriefState {

        public final class Loaded implements BriefState {
            public final String brief;

            public Loaded(String str) {
                this.brief = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Loaded) && Intrinsics.areEqual(this.brief, ((Loaded) obj).brief);
            }

            public final int hashCode() {
                String str = this.brief;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Loaded(brief=", this.brief, ")");
            }
        }

        public final class Loading implements BriefState {
            public static final Loading INSTANCE = new Loading();
        }
    }

    public final class Emphasis {
        public final long color;
        public final TextStyle style;
        public final String text;

        public Emphasis(String str, long j, TextStyle textStyle) {
            str.getClass();
            this.text = str;
            this.color = j;
            this.style = textStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Emphasis)) {
                return false;
            }
            Emphasis emphasis = (Emphasis) obj;
            return Intrinsics.areEqual(this.text, emphasis.text) && Color.m676equalsimpl0(this.color, emphasis.color) && Intrinsics.areEqual(this.style, emphasis.style);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            int i = Color.$r8$clinit;
            ULong.Companion companion = ULong.Companion;
            int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.color);
            TextStyle textStyle = this.style;
            return m + (textStyle == null ? 0 : textStyle.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Emphasis(text=", this.text, ", color=", Color.m682toStringimpl(this.color), ", style=");
            m.append(this.style);
            m.append(")");
            return m.toString();
        }
    }

    public InstalledServiceAppletTileContentModel(Emphasis emphasis, String str, BriefState briefState, ComposableLambdaImpl composableLambdaImpl, int i) {
        emphasis = (i & 1) != 0 ? null : emphasis;
        str = (i & 2) != 0 ? null : str;
        briefState = (i & 4) != 0 ? null : briefState;
        composableLambdaImpl = (i & 8) != 0 ? null : composableLambdaImpl;
        this.emphasis = emphasis;
        this.brief = str;
        this.briefState = briefState;
        this.visual = composableLambdaImpl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstalledServiceAppletTileContentModel)) {
            return false;
        }
        InstalledServiceAppletTileContentModel installedServiceAppletTileContentModel = (InstalledServiceAppletTileContentModel) obj;
        return Intrinsics.areEqual(this.emphasis, installedServiceAppletTileContentModel.emphasis) && Intrinsics.areEqual(this.brief, installedServiceAppletTileContentModel.brief) && Intrinsics.areEqual(this.briefState, installedServiceAppletTileContentModel.briefState) && Intrinsics.areEqual(this.visual, installedServiceAppletTileContentModel.visual);
    }

    public final int hashCode() {
        Emphasis emphasis = this.emphasis;
        int hashCode = (emphasis == null ? 0 : emphasis.hashCode()) * 31;
        String str = this.brief;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        BriefState briefState = this.briefState;
        int hashCode3 = (hashCode2 + (briefState == null ? 0 : briefState.hashCode())) * 31;
        Function3 function3 = this.visual;
        return hashCode3 + (function3 != null ? function3.hashCode() : 0);
    }

    public final String toString() {
        return "InstalledServiceAppletTileContentModel(emphasis=" + this.emphasis + ", brief=" + this.brief + ", briefState=" + this.briefState + ", visual=" + this.visual + ")";
    }
}
