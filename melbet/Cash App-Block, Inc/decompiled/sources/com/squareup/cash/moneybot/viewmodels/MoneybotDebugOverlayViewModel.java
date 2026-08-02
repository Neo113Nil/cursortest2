package com.squareup.cash.moneybot.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Icons;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MoneybotDebugOverlayViewModel {

    public final class OpenChatSessionDialog implements MoneybotDebugOverlayViewModel {
        public static final OpenChatSessionDialog INSTANCE = new OpenChatSessionDialog();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OpenChatSessionDialog);
        }

        public final int hashCode() {
            return -1742627612;
        }

        public final String toString() {
            return "OpenChatSessionDialog";
        }
    }

    public interface Sheet extends MoneybotDebugOverlayViewModel {

        public final class Main implements Sheet {
            public final List itemRows;

            public final class DebugItemRow {
                public final Icons icon;
                public final String label;
                public final MoneybotDebugOverlayViewEvent rowClickEvent;

                public DebugItemRow(Icons icons, String str, MoneybotDebugOverlayViewEvent moneybotDebugOverlayViewEvent) {
                    str.getClass();
                    this.icon = icons;
                    this.label = str;
                    this.rowClickEvent = moneybotDebugOverlayViewEvent;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof DebugItemRow)) {
                        return false;
                    }
                    DebugItemRow debugItemRow = (DebugItemRow) obj;
                    return this.icon == debugItemRow.icon && Intrinsics.areEqual(this.label, debugItemRow.label) && this.rowClickEvent.equals(debugItemRow.rowClickEvent);
                }

                public final int hashCode() {
                    return this.rowClickEvent.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.icon.hashCode() * 31, 31, this.label);
                }

                public final String toString() {
                    return "DebugItemRow(icon=" + this.icon + ", label=" + this.label + ", rowClickEvent=" + this.rowClickEvent + ")";
                }
            }

            public Main(ListBuilder listBuilder) {
                listBuilder.getClass();
                this.itemRows = listBuilder;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Main) && Intrinsics.areEqual(this.itemRows, ((Main) obj).itemRows);
            }

            public final int hashCode() {
                return this.itemRows.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m("Main(itemRows=", ")", this.itemRows);
            }
        }

        public final class TokenUsage implements Sheet {
            public final TokenUsageViewModel tokenUsageModel;

            public TokenUsage(TokenUsageViewModel tokenUsageViewModel) {
                this.tokenUsageModel = tokenUsageViewModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof TokenUsage) && this.tokenUsageModel.equals(((TokenUsage) obj).tokenUsageModel);
            }

            public final int hashCode() {
                return this.tokenUsageModel.hashCode();
            }

            public final String toString() {
                return "TokenUsage(tokenUsageModel=" + this.tokenUsageModel + ")";
            }
        }
    }
}
