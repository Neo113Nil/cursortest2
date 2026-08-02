package com.squareup.cash.data.profile.documents;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.fillr.browsersdk.model.FillrWidgetFactory;
import com.squareup.protos.franklin.investing.resources.StatementType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ProfileDocumentModel {
    public final StatementType category;
    public final long documentDate;
    public final boolean emailForwardable;
    public final String name;
    public final FillrWidgetFactory titleNamingConvention;
    public final String token;
    public final String url;

    public ProfileDocumentModel(String str, String str2, long j, StatementType statementType, String str3, boolean z, FillrWidgetFactory fillrWidgetFactory) {
        str.getClass();
        str2.getClass();
        statementType.getClass();
        str3.getClass();
        fillrWidgetFactory.getClass();
        this.token = str;
        this.name = str2;
        this.documentDate = j;
        this.category = statementType;
        this.url = str3;
        this.emailForwardable = z;
        this.titleNamingConvention = fillrWidgetFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileDocumentModel)) {
            return false;
        }
        ProfileDocumentModel profileDocumentModel = (ProfileDocumentModel) obj;
        return Intrinsics.areEqual(this.token, profileDocumentModel.token) && Intrinsics.areEqual(this.name, profileDocumentModel.name) && this.documentDate == profileDocumentModel.documentDate && this.category == profileDocumentModel.category && Intrinsics.areEqual(this.url, profileDocumentModel.url) && this.emailForwardable == profileDocumentModel.emailForwardable && Intrinsics.areEqual(this.titleNamingConvention, profileDocumentModel.titleNamingConvention);
    }

    public final int hashCode() {
        return this.titleNamingConvention.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.category.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name), 31, this.documentDate)) * 31, 31, this.url), 31, this.emailForwardable);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ProfileDocumentModel(token=", this.token, ", name=", this.name, ", documentDate=");
        m.append(this.documentDate);
        m.append(", category=");
        m.append(this.category);
        m.append(", url=");
        m.append(this.url);
        m.append(", emailForwardable=");
        m.append(this.emailForwardable);
        m.append(", titleNamingConvention=");
        m.append(this.titleNamingConvention);
        m.append(")");
        return m.toString();
    }
}
