package com.squareup.cash.paychecks.viewmodels;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.views.sheet.EducationalSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.viewmodels.MultipleAllocationViewEvent;
import com.squareup.protos.cash.ui.Color;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface MultipleAllocationViewModel {

    public final class Active implements MultipleAllocationViewModel {
        public final Action action;
        public final BottomSheet explanation;
        public final InfoButton infoButton;
        public final ArrayList rows;
        public final String title;
        public final EducationalSheetKt$$ExternalSyntheticLambda8 updateViewModel;
        public final DistributionWheelViewModel wheel;

        public interface Action {

            public final class Prominent implements Action {
                public final MultipleAllocationViewEvent.Submit event;
                public final String text;

                public Prominent(String str, MultipleAllocationViewEvent.Submit submit) {
                    this.text = str;
                    this.event = submit;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Prominent)) {
                        return false;
                    }
                    Prominent prominent = (Prominent) obj;
                    return this.text.equals(prominent.text) && this.event.equals(prominent.event);
                }

                public final int hashCode() {
                    return this.event.hashCode() + (this.text.hashCode() * 31);
                }

                public final String toString() {
                    return "Prominent(text=" + this.text + ", event=" + this.event + ")";
                }
            }

            public final class StandardDisabled implements Action {
                public final String text;

                public StandardDisabled(String str) {
                    this.text = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof StandardDisabled) && this.text.equals(((StandardDisabled) obj).text);
                }

                public final int hashCode() {
                    return this.text.hashCode();
                }

                public final String toString() {
                    return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("StandardDisabled(text=", this.text, ")");
                }
            }
        }

        public final class AllocationRow {
            public final MultipleAllocationViewEvent action;
            public final boolean badged;
            public final String caption;
            public final Color color;
            public final String name;

            public AllocationRow(Color color, String str, String str2, boolean z, MultipleAllocationViewEvent multipleAllocationViewEvent) {
                color.getClass();
                str2.getClass();
                this.color = color;
                this.name = str;
                this.caption = str2;
                this.badged = z;
                this.action = multipleAllocationViewEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AllocationRow)) {
                    return false;
                }
                AllocationRow allocationRow = (AllocationRow) obj;
                return Intrinsics.areEqual(this.color, allocationRow.color) && this.name.equals(allocationRow.name) && Intrinsics.areEqual(this.caption, allocationRow.caption) && this.badged == allocationRow.badged && this.action.equals(allocationRow.action);
            }

            public final int hashCode() {
                return this.action.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.color.hashCode() * 31, 31, this.name), 31, this.caption), 31, this.badged);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AllocationRow(color=");
                sb.append(this.color);
                sb.append(", name=");
                sb.append(this.name);
                sb.append(", caption=");
                NavAction$$ExternalSyntheticOutline0.m(sb, this.caption, ", badged=", this.badged, ", action=");
                sb.append(this.action);
                sb.append(")");
                return sb.toString();
            }
        }

        public final class InfoButton {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InfoButton)) {
                    return false;
                }
                MultipleAllocationViewEvent.TapInfoButton tapInfoButton = MultipleAllocationViewEvent.TapInfoButton.INSTANCE;
                return tapInfoButton.equals(tapInfoButton);
            }

            public final int hashCode() {
                return 1619736040;
            }

            public final String toString() {
                return "InfoButton(event=" + MultipleAllocationViewEvent.TapInfoButton.INSTANCE + ")";
            }
        }

        public Active(String str, Action action, DistributionWheelViewModel distributionWheelViewModel, ArrayList arrayList, InfoButton infoButton, BottomSheet bottomSheet, EducationalSheetKt$$ExternalSyntheticLambda8 educationalSheetKt$$ExternalSyntheticLambda8) {
            this.title = str;
            this.action = action;
            this.wheel = distributionWheelViewModel;
            this.rows = arrayList;
            this.infoButton = infoButton;
            this.explanation = bottomSheet;
            this.updateViewModel = educationalSheetKt$$ExternalSyntheticLambda8;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Active) {
                Active active = (Active) obj;
                return this.title.equals(active.title) && this.action.equals(active.action) && this.wheel.equals(active.wheel) && this.rows.equals(active.rows) && Intrinsics.areEqual(this.infoButton, active.infoButton) && Intrinsics.areEqual(this.explanation, active.explanation) && this.updateViewModel == active.updateViewModel;
            }
            return false;
        }

        public final int hashCode() {
            int m = (CameraState$Type$EnumUnboxingLocalUtility.m(this.rows, (this.wheel.hashCode() + ((this.action.hashCode() + (this.title.hashCode() * 31)) * 31)) * 31, 31) + (this.infoButton == null ? 0 : 1619736040)) * 31;
            BottomSheet bottomSheet = this.explanation;
            return this.updateViewModel.hashCode() + ((m + (bottomSheet != null ? bottomSheet.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Active(title=" + this.title + ", action=" + this.action + ", wheel=" + this.wheel + ", rows=" + this.rows + ", infoButton=" + this.infoButton + ", explanation=" + this.explanation + ", updateViewModel=" + this.updateViewModel + ")";
        }
    }

    public final class Loading implements MultipleAllocationViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1914067216;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
