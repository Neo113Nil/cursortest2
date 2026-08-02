package com.squareup.cash.moneybot.backend.api.model.chat;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NextBestAction {
    public final String category;
    public final Cta cta;
    public final String nextBestActionId;
    public final String subtitle;
    public final String title;

    public final class Cta {
        public final String clientRoute;
        public final String text;

        public Cta(String str, String str2) {
            str.getClass();
            this.text = str;
            this.clientRoute = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.areEqual(this.text, cta.text) && this.clientRoute.equals(cta.clientRoute);
        }

        public final int hashCode() {
            return this.clientRoute.hashCode() + (this.text.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("Cta(text=", this.text, ", clientRoute=", this.clientRoute, ")");
        }
    }

    public NextBestAction(String str, String str2, String str3, String str4, Cta cta) {
        this.nextBestActionId = str;
        this.title = str2;
        this.subtitle = str3;
        this.category = str4;
        this.cta = cta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NextBestAction)) {
            return false;
        }
        NextBestAction nextBestAction = (NextBestAction) obj;
        return this.nextBestActionId.equals(nextBestAction.nextBestActionId) && this.title.equals(nextBestAction.title) && Intrinsics.areEqual(this.subtitle, nextBestAction.subtitle) && Intrinsics.areEqual(this.category, nextBestAction.category) && this.cta.equals(nextBestAction.cta);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.nextBestActionId.hashCode() * 31, 31, this.title);
        String str = this.subtitle;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.category;
        return this.cta.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NextBestAction(nextBestActionId=", this.nextBestActionId, ", title=", this.title, ", subtitle=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.subtitle, ", category=", this.category, ", cta=");
        m.append(this.cta);
        m.append(")");
        return m.toString();
    }
}
