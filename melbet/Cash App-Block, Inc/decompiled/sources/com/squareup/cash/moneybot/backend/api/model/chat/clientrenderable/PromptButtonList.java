package com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromptButtonList {
    public final ArrayList buttons;
    public final String requestId;

    public final class PromptButton {
        public final String id;
        public final String prompt;
        public final List tapCdfEvents;
        public final String text;
        public final List viewCdfEvents;

        public PromptButton(String str, String str2, String str3, List list, List list2) {
            list.getClass();
            list2.getClass();
            this.id = str;
            this.text = str2;
            this.prompt = str3;
            this.viewCdfEvents = list;
            this.tapCdfEvents = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromptButton)) {
                return false;
            }
            PromptButton promptButton = (PromptButton) obj;
            return Intrinsics.areEqual(this.id, promptButton.id) && this.text.equals(promptButton.text) && this.prompt.equals(promptButton.prompt) && Intrinsics.areEqual(this.viewCdfEvents, promptButton.viewCdfEvents) && Intrinsics.areEqual(this.tapCdfEvents, promptButton.tapCdfEvents);
        }

        public final int hashCode() {
            String str = this.id;
            return this.tapCdfEvents.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.text), 31, this.prompt), 31, this.viewCdfEvents);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromptButton(id=", this.id, ", text=", this.text, ", prompt=");
            NavAction$$ExternalSyntheticOutline0.m(this.prompt, ", viewCdfEvents=", ", tapCdfEvents=", m, this.viewCdfEvents);
            return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.tapCdfEvents, ")");
        }
    }

    public PromptButtonList(String str, ArrayList arrayList) {
        this.requestId = str;
        this.buttons = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptButtonList)) {
            return false;
        }
        PromptButtonList promptButtonList = (PromptButtonList) obj;
        return Intrinsics.areEqual(this.requestId, promptButtonList.requestId) && this.buttons.equals(promptButtonList.buttons);
    }

    public final List getButtons() {
        return this.buttons;
    }

    public final int hashCode() {
        String str = this.requestId;
        return this.buttons.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(0, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m(this.buttons, "PromptButtonList(requestId=", this.requestId, ", version=0, buttons=", ")");
    }
}
