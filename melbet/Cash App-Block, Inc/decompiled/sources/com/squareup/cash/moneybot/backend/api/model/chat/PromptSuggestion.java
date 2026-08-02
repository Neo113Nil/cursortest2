package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class PromptSuggestion {
    public final String body;
    public final String campaignCategory;
    public final UUID clientId;
    public final Icon icon;
    public final String label;
    public final String prompt;
    public final List tapCdfEvents;
    public final List viewCdfEvents;

    public interface Icon {

        /* loaded from: classes7.dex */
        public final class Avatar implements Icon {
            public final UiAvatar avatar;

            public Avatar(UiAvatar uiAvatar) {
                uiAvatar.getClass();
                this.avatar = uiAvatar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Avatar) && Intrinsics.areEqual(this.avatar, ((Avatar) obj).avatar);
            }

            public final int hashCode() {
                return this.avatar.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.avatar, "Avatar(avatar=", ")");
            }
        }

        /* loaded from: classes7.dex */
        public final class Image implements Icon {
            public final com.squareup.protos.cash.ui.Image image;

            public Image(com.squareup.protos.cash.ui.Image image) {
                image.getClass();
                this.image = image;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Image) && Intrinsics.areEqual(this.image, ((Image) obj).image);
            }

            public final int hashCode() {
                return this.image.hashCode();
            }

            public final String toString() {
                return SVG$Unit$EnumUnboxingLocalUtility.m(this.image, "Image(image=", ")");
            }
        }
    }

    public PromptSuggestion(String str, String str2, Icon icon, String str3, String str4, UUID uuid, List list, List list2) {
        uuid.getClass();
        list.getClass();
        list2.getClass();
        this.label = str;
        this.body = str2;
        this.icon = icon;
        this.prompt = str3;
        this.campaignCategory = str4;
        this.clientId = uuid;
        this.viewCdfEvents = list;
        this.tapCdfEvents = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptSuggestion)) {
            return false;
        }
        PromptSuggestion promptSuggestion = (PromptSuggestion) obj;
        return this.label.equals(promptSuggestion.label) && this.body.equals(promptSuggestion.body) && Intrinsics.areEqual(this.icon, promptSuggestion.icon) && this.prompt.equals(promptSuggestion.prompt) && this.campaignCategory.equals(promptSuggestion.campaignCategory) && Intrinsics.areEqual(this.clientId, promptSuggestion.clientId) && Intrinsics.areEqual(this.viewCdfEvents, promptSuggestion.viewCdfEvents) && Intrinsics.areEqual(this.tapCdfEvents, promptSuggestion.tapCdfEvents);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.label.hashCode() * 31, 31, this.body);
        Icon icon = this.icon;
        return this.tapCdfEvents.hashCode() + Recorder$$ExternalSyntheticOutline2.m((this.clientId.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (icon == null ? 0 : icon.hashCode())) * 31, 31, this.prompt), 31, this.campaignCategory)) * 31, 31, this.viewCdfEvents);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PromptSuggestion(label=", this.label, ", body=", this.body, ", icon=");
        m.append(this.icon);
        m.append(", prompt=");
        m.append(this.prompt);
        m.append(", campaignCategory=");
        m.append(this.campaignCategory);
        m.append(", clientId=");
        m.append(this.clientId);
        m.append(", viewCdfEvents=");
        m.append(this.viewCdfEvents);
        m.append(", tapCdfEvents=");
        m.append(this.tapCdfEvents);
        m.append(")");
        return m.toString();
    }
}
