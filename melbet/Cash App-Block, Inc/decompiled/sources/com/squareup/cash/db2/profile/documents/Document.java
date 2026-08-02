package com.squareup.cash.db2.profile.documents;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.squareup.protos.document.VersionData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Document {
    public final String category;
    public final String client_route;
    public final Long display_date;
    public final String entity_id;
    public final String owner_token;
    public final String title;
    public final String token;
    public final String url;
    public final VersionData version_data;

    public Document(String str, String str2, String str3, String str4, Long l, String str5, String str6, VersionData versionData, String str7) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, str3, str4);
        this.entity_id = str;
        this.token = str2;
        this.category = str3;
        this.title = str4;
        this.display_date = l;
        this.client_route = str5;
        this.url = str6;
        this.version_data = versionData;
        this.owner_token = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Document)) {
            return false;
        }
        Document document = (Document) obj;
        return Intrinsics.areEqual(this.entity_id, document.entity_id) && Intrinsics.areEqual(this.token, document.token) && Intrinsics.areEqual(this.category, document.category) && Intrinsics.areEqual(this.title, document.title) && Intrinsics.areEqual(this.display_date, document.display_date) && Intrinsics.areEqual(this.client_route, document.client_route) && Intrinsics.areEqual(this.url, document.url) && Intrinsics.areEqual(this.version_data, document.version_data) && Intrinsics.areEqual(this.owner_token, document.owner_token);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.entity_id.hashCode() * 31, 31, this.token), 31, this.category), 31, this.title);
        Long l = this.display_date;
        int hashCode = (m + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.client_route;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        VersionData versionData = this.version_data;
        int hashCode4 = (hashCode3 + (versionData == null ? 0 : versionData.hashCode())) * 31;
        String str3 = this.owner_token;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Document(entity_id=", this.entity_id, ", token=", this.token, ", category=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.category, ", title=", this.title, ", display_date=");
        ViewEvent$State$EnumUnboxingLocalUtility.m(this.display_date, ", client_route=", this.client_route, ", url=", m);
        m.append(this.url);
        m.append(", version_data=");
        m.append(this.version_data);
        m.append(", owner_token=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, this.owner_token, ")");
    }
}
