package com.squareup.cash.db2.profile.documents;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class LegalDocument {
    public final String category;
    public final Long document_date;
    public final String owner_token;
    public final String title;
    public final String token;
    public final String url;

    public LegalDocument(String str, String str2, String str3, Long l, String str4, String str5) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.token = str;
        this.category = str2;
        this.title = str3;
        this.document_date = l;
        this.url = str4;
        this.owner_token = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegalDocument)) {
            return false;
        }
        LegalDocument legalDocument = (LegalDocument) obj;
        return Intrinsics.areEqual(this.token, legalDocument.token) && Intrinsics.areEqual(this.category, legalDocument.category) && Intrinsics.areEqual(this.title, legalDocument.title) && Intrinsics.areEqual(this.document_date, legalDocument.document_date) && Intrinsics.areEqual(this.url, legalDocument.url) && Intrinsics.areEqual(this.owner_token, legalDocument.owner_token);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.category), 31, this.title);
        Long l = this.document_date;
        int m2 = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((m + (l == null ? 0 : l.hashCode())) * 31, 31, this.url);
        String str = this.owner_token;
        return m2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LegalDocument(token=", this.token, ", category=", this.category, ", title=");
        Request$Priority$EnumUnboxingLocalUtility.m(this.document_date, this.title, ", document_date=", ", url=", m);
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.url, ", owner_token=", this.owner_token, ")");
    }
}
