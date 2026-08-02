package com.squareup.cash.crypto.db;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Crypto_statement {
    public final String category;
    public final long document_date;
    public final String owner_token;
    public final String title;
    public final String token;
    public final String url;

    public Crypto_statement(String str, String str2, String str3, long j, String str4, String str5) {
        BalanceFeedKt$$ExternalSyntheticOutline0.m(str, str2, str3, str4, str5);
        this.token = str;
        this.category = str2;
        this.title = str3;
        this.document_date = j;
        this.url = str4;
        this.owner_token = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Crypto_statement)) {
            return false;
        }
        Crypto_statement crypto_statement = (Crypto_statement) obj;
        return Intrinsics.areEqual(this.token, crypto_statement.token) && Intrinsics.areEqual(this.category, crypto_statement.category) && Intrinsics.areEqual(this.title, crypto_statement.title) && this.document_date == crypto_statement.document_date && Intrinsics.areEqual(this.url, crypto_statement.url) && Intrinsics.areEqual(this.owner_token, crypto_statement.owner_token);
    }

    public final int hashCode() {
        return this.owner_token.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.category), 31, this.title), 31, this.document_date), 31, this.url);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Crypto_statement(token=", this.token, ", category=", this.category, ", title=");
        m.append(this.title);
        m.append(", document_date=");
        m.append(this.document_date);
        Boxes$$ExternalSyntheticOutline1.m(m, ", url=", this.url, ", owner_token=", this.owner_token);
        m.append(")");
        return m.toString();
    }
}
