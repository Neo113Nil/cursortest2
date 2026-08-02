package com.squareup.cash.family.familyhub.viewmodels;

import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface SponsorLedInviteViewModel {

    public final class Loaded implements SponsorLedInviteViewModel {
        public final StackedAvatarViewModel.Single avatarViewModel;
        public final String body;
        public final String buttonText;
        public final String title;

        public Loaded(StackedAvatarViewModel.Single single, String str, String str2, String str3) {
            str.getClass();
            this.avatarViewModel = single;
            this.title = str;
            this.body = str2;
            this.buttonText = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return this.avatarViewModel.equals(loaded.avatarViewModel) && Intrinsics.areEqual(this.title, loaded.title) && this.body.equals(loaded.body) && this.buttonText.equals(loaded.buttonText);
        }

        public final int hashCode() {
            return this.buttonText.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatarViewModel.avatar.hashCode() * 31, 31, this.title), 31, this.body);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(avatarViewModel=");
            sb.append(this.avatarViewModel);
            sb.append(", title=");
            sb.append(this.title);
            sb.append(", body=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.body, ", buttonText=", this.buttonText, ")");
        }
    }

    public final class Loading implements SponsorLedInviteViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -1805765586;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
