package com.fidesmo.sec.core.models;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import bo.app.re$$ExternalSyntheticOutline0;
import com.appsflyer.AdRevenueScheme;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/fidesmo/sec/core/models/Card;", "", AdRevenueScheme.COUNTRY, "", "card_name", "issuer_name", "note", "logo", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCard_name", "()Ljava/lang/String;", "getCountry", "getIssuer_name", "getLogo", "setLogo", "(Ljava/lang/String;)V", "getNote", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Card {
    private final String card_name;
    private final String country;
    private final String issuer_name;
    private String logo;
    private final String note;

    public Card(String str, String str2, String str3, String str4, String str5) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.country = str;
        this.card_name = str2;
        this.issuer_name = str3;
        this.note = str4;
        this.logo = str5;
    }

    public static /* synthetic */ Card copy$default(Card card, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = card.country;
        }
        if ((i & 2) != 0) {
            str2 = card.card_name;
        }
        if ((i & 4) != 0) {
            str3 = card.issuer_name;
        }
        if ((i & 8) != 0) {
            str4 = card.note;
        }
        if ((i & 16) != 0) {
            str5 = card.logo;
        }
        String str6 = str5;
        String str7 = str3;
        return card.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* renamed from: component2, reason: from getter */
    public final String getCard_name() {
        return this.card_name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIssuer_name() {
        return this.issuer_name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLogo() {
        return this.logo;
    }

    public final Card copy(String country, String card_name, String issuer_name, String note, String logo) {
        country.getClass();
        card_name.getClass();
        issuer_name.getClass();
        return new Card(country, card_name, issuer_name, note, logo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Card)) {
            return false;
        }
        Card card = (Card) other;
        return Intrinsics.areEqual(this.country, card.country) && Intrinsics.areEqual(this.card_name, card.card_name) && Intrinsics.areEqual(this.issuer_name, card.issuer_name) && Intrinsics.areEqual(this.note, card.note) && Intrinsics.areEqual(this.logo, card.logo);
    }

    public final String getCard_name() {
        return this.card_name;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getIssuer_name() {
        return this.issuer_name;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getNote() {
        return this.note;
    }

    public int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.country.hashCode() * 31, 31, this.card_name), 31, this.issuer_name);
        String str = this.note;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.logo;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Card(country=");
        sb.append(this.country);
        sb.append(", card_name=");
        sb.append(this.card_name);
        sb.append(", issuer_name=");
        sb.append(this.issuer_name);
        sb.append(", note=");
        sb.append(this.note);
        sb.append(", logo=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.logo, ')');
    }
}
