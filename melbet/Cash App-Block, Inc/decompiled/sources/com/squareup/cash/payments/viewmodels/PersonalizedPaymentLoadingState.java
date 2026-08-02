package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.reactions.api.ReactionsData;
import com.squareup.protos.common.Money;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public interface PersonalizedPaymentLoadingState {

    public final class Error implements PersonalizedPaymentLoadingState {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1484991723;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loaded implements PersonalizedPaymentLoadingState {
        public final Money amount;
        public final Background background;
        public final List elements;
        public final boolean isCurrentCustomerSender;
        public final Music music;
        public final String note;
        public final ReactionsData reactions;
        public final Recipient sender;

        public Loaded(Money money, Recipient recipient, Background background, List list, String str, boolean z, ReactionsData reactionsData, Music music) {
            list.getClass();
            this.amount = money;
            this.sender = recipient;
            this.background = background;
            this.elements = list;
            this.note = str;
            this.isCurrentCustomerSender = z;
            this.reactions = reactionsData;
            this.music = music;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) obj;
            return Intrinsics.areEqual(this.amount, loaded.amount) && Intrinsics.areEqual(this.sender, loaded.sender) && Intrinsics.areEqual(this.background, loaded.background) && Intrinsics.areEqual(this.elements, loaded.elements) && Intrinsics.areEqual(this.note, loaded.note) && this.isCurrentCustomerSender == loaded.isCurrentCustomerSender && this.reactions.equals(loaded.reactions) && Intrinsics.areEqual(this.music, loaded.music);
        }

        public final int hashCode() {
            Money money = this.amount;
            int hashCode = (money == null ? 0 : money.hashCode()) * 31;
            Recipient recipient = this.sender;
            int hashCode2 = (hashCode + (recipient == null ? 0 : recipient.hashCode())) * 31;
            Background background = this.background;
            int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (background == null ? 0 : background.hashCode())) * 31, 31, this.elements);
            String str = this.note;
            int hashCode3 = (this.reactions.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (str == null ? 0 : str.hashCode())) * 31, 31, this.isCurrentCustomerSender)) * 31;
            Music music = this.music;
            return hashCode3 + (music != null ? music.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Loaded(amount=");
            sb.append(this.amount);
            sb.append(", sender=");
            sb.append(this.sender);
            sb.append(", background=");
            sb.append(this.background);
            sb.append(", elements=");
            sb.append(this.elements);
            sb.append(", note=");
            NavAction$$ExternalSyntheticOutline0.m(sb, this.note, ", isCurrentCustomerSender=", this.isCurrentCustomerSender, ", reactions=");
            sb.append(this.reactions);
            sb.append(", music=");
            sb.append(this.music);
            sb.append(")");
            return sb.toString();
        }
    }

    public final class Loading implements PersonalizedPaymentLoadingState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 667734793;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
