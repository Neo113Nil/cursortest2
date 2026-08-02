package com.squareup.cash.earnings.backend.api;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class EarningsStream {
    public final Avatar avatar;
    public final ArrayList monthlyEarnings;
    public final String name;
    public final String token;
    public final Lazy totalAmount$delegate = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 9));

    public final class Avatar {
        public final String accentColor;
        public final String darkAccentColor;
        public final String darkUrl;
        public final String initial;
        public final String lightUrl;

        public Avatar(String str, String str2, String str3, String str4, String str5) {
            this.lightUrl = str;
            this.darkUrl = str2;
            this.initial = str3;
            this.accentColor = str4;
            this.darkAccentColor = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Avatar)) {
                return false;
            }
            Avatar avatar = (Avatar) obj;
            return Intrinsics.areEqual(this.lightUrl, avatar.lightUrl) && Intrinsics.areEqual(this.darkUrl, avatar.darkUrl) && Intrinsics.areEqual(this.initial, avatar.initial) && Intrinsics.areEqual(this.accentColor, avatar.accentColor) && Intrinsics.areEqual(this.darkAccentColor, avatar.darkAccentColor);
        }

        public final int hashCode() {
            String str = this.lightUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.darkUrl;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.initial;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.accentColor;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.darkAccentColor;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Avatar(lightUrl=", this.lightUrl, ", darkUrl=", this.darkUrl, ", initial=");
            Boxes$$ExternalSyntheticOutline1.m(m, this.initial, ", accentColor=", this.accentColor, ", darkAccentColor=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.darkAccentColor, ")");
        }
    }

    public EarningsStream(String str, String str2, Avatar avatar, ArrayList arrayList) {
        this.token = str;
        this.name = str2;
        this.avatar = avatar;
        this.monthlyEarnings = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarningsStream)) {
            return false;
        }
        EarningsStream earningsStream = (EarningsStream) obj;
        return this.token.equals(earningsStream.token) && this.name.equals(earningsStream.name) && Intrinsics.areEqual(this.avatar, earningsStream.avatar) && this.monthlyEarnings.equals(earningsStream.monthlyEarnings);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name);
        Avatar avatar = this.avatar;
        return this.monthlyEarnings.hashCode() + ((m + (avatar == null ? 0 : avatar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("EarningsStream(token=", this.token, ", name=", this.name, ", avatar=");
        m.append(this.avatar);
        m.append(", monthlyEarnings=");
        m.append(this.monthlyEarnings);
        m.append(")");
        return m.toString();
    }
}
