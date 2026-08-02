package com.squareup.cash.paychecks.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class HelpSheetViewModel {
    public final Button additionalHelpButton;
    public final Button dismissButton;
    public final ArrayList rows;
    public final String title;

    /* loaded from: classes7.dex */
    public final class Button {
        public final HelpSheetViewEvent action;
        public final String text;

        public Button(String str, HelpSheetViewEvent helpSheetViewEvent) {
            this.text = str;
            this.action = helpSheetViewEvent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return this.text.equals(button.text) && this.action.equals(button.action);
        }

        public final int hashCode() {
            return this.action.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return "Button(text=" + this.text + ", action=" + this.action + ")";
        }
    }

    public final class Row {
        public final String subtext;
        public final String text;

        public Row(String str, String str2) {
            str.getClass();
            this.text = str;
            this.subtext = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.areEqual(this.text, row.text) && Intrinsics.areEqual(this.subtext, row.subtext);
        }

        public final int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            String str = this.subtext;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Row(text=", this.text, ", subtext=", this.subtext, ")");
        }
    }

    public HelpSheetViewModel(String str, ArrayList arrayList, Button button, Button button2) {
        this.title = str;
        this.rows = arrayList;
        this.additionalHelpButton = button;
        this.dismissButton = button2;
    }
}
