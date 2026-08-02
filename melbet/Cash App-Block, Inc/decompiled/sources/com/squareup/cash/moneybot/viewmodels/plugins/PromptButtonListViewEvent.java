package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PromptButtonListViewEvent {

    public final class PromptRendered implements PromptButtonListViewEvent {
        public final String id;
        public final List viewCdfEvents;

        public PromptRendered(String str, List list) {
            list.getClass();
            this.id = str;
            this.viewCdfEvents = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromptRendered)) {
                return false;
            }
            PromptRendered promptRendered = (PromptRendered) obj;
            return this.id.equals(promptRendered.id) && Intrinsics.areEqual(this.viewCdfEvents, promptRendered.viewCdfEvents);
        }

        public final int hashCode() {
            return this.viewCdfEvents.hashCode() + (this.id.hashCode() * 31);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m("PromptRendered(id=", this.id, ", viewCdfEvents=", ")", this.viewCdfEvents);
        }
    }

    public final class PromptTapped implements PromptButtonListViewEvent {
        public final String id;
        public final String prompt;
        public final List tapCdfEvents;

        public PromptTapped(String str, String str2, List list) {
            list.getClass();
            this.id = str;
            this.prompt = str2;
            this.tapCdfEvents = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromptTapped)) {
                return false;
            }
            PromptTapped promptTapped = (PromptTapped) obj;
            return this.id.equals(promptTapped.id) && this.prompt.equals(promptTapped.prompt) && Intrinsics.areEqual(this.tapCdfEvents, promptTapped.tapCdfEvents);
        }

        public final int hashCode() {
            return this.tapCdfEvents.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.id.hashCode() * 31, 31, this.prompt);
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromptTapped(id=", this.id, ", prompt=", this.prompt, ", tapCdfEvents="), this.tapCdfEvents, ")");
        }
    }
}
