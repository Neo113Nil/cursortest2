package com.squareup.cash.profile.presenters;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.moshi.JsonClass;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/squareup/cash/profile/presenters/OpenSourcePresenter$Artifact", "", "Scm", "SpdxLicense", "UnknownLicense", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OpenSourcePresenter$Artifact {
    public final String artifactId;
    public final String groupId;
    public final String name;
    public final Scm scm;
    public final List spdxLicenses;
    public final List unknownLicenses;
    public final String version;

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/profile/presenters/OpenSourcePresenter$Artifact$Scm;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Scm {
        public final String url;

        public Scm(String str) {
            this.url = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Scm) && this.url.equals(((Scm) obj).url);
        }

        public final int hashCode() {
            return this.url.hashCode();
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Scm(url=", this.url, ")");
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/profile/presenters/OpenSourcePresenter$Artifact$SpdxLicense;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class SpdxLicense {
        public final String identifier;
        public final String name;
        public final String url;

        public SpdxLicense(String str, String str2, String str3) {
            this.identifier = str;
            this.name = str2;
            this.url = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpdxLicense)) {
                return false;
            }
            SpdxLicense spdxLicense = (SpdxLicense) obj;
            return this.identifier.equals(spdxLicense.identifier) && this.name.equals(spdxLicense.name) && this.url.equals(spdxLicense.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.identifier.hashCode() * 31, 31, this.name);
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("SpdxLicense(identifier=", this.identifier, ", name=", this.name, ", url="), this.url, ")");
        }
    }

    @JsonClass(generateAdapter = true)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/squareup/cash/profile/presenters/OpenSourcePresenter$Artifact$UnknownLicense;", "", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UnknownLicense {
        public final String name;
        public final String url;

        public UnknownLicense(String str, String str2) {
            this.name = str;
            this.url = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnknownLicense)) {
                return false;
            }
            UnknownLicense unknownLicense = (UnknownLicense) obj;
            return this.name.equals(unknownLicense.name) && this.url.equals(unknownLicense.url);
        }

        public final int hashCode() {
            return this.url.hashCode() + (this.name.hashCode() * 31);
        }

        public final String toString() {
            return Boxes$$ExternalSyntheticOutline1.m("UnknownLicense(name=", this.name, ", url=", this.url, ")");
        }
    }

    public /* synthetic */ OpenSourcePresenter$Artifact(String str, String str2, String str3, String str4, List list, List list2, Scm scm, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : scm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenSourcePresenter$Artifact)) {
            return false;
        }
        OpenSourcePresenter$Artifact openSourcePresenter$Artifact = (OpenSourcePresenter$Artifact) obj;
        return Intrinsics.areEqual(this.groupId, openSourcePresenter$Artifact.groupId) && Intrinsics.areEqual(this.artifactId, openSourcePresenter$Artifact.artifactId) && Intrinsics.areEqual(this.version, openSourcePresenter$Artifact.version) && Intrinsics.areEqual(this.name, openSourcePresenter$Artifact.name) && Intrinsics.areEqual(this.spdxLicenses, openSourcePresenter$Artifact.spdxLicenses) && Intrinsics.areEqual(this.unknownLicenses, openSourcePresenter$Artifact.unknownLicenses) && Intrinsics.areEqual(this.scm, openSourcePresenter$Artifact.scm);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.groupId.hashCode() * 31, 31, this.artifactId), 31, this.version);
        String str = this.name;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.spdxLicenses;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.unknownLicenses;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Scm scm = this.scm;
        return hashCode3 + (scm != null ? scm.url.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Artifact(groupId=", this.groupId, ", artifactId=", this.artifactId, ", version=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.version, ", name=", this.name, ", spdxLicenses=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.spdxLicenses, ", unknownLicenses=", this.unknownLicenses, ", scm=");
        m.append(this.scm);
        m.append(")");
        return m.toString();
    }

    public OpenSourcePresenter$Artifact(String str, String str2, String str3, String str4, List list, List list2, Scm scm) {
        re$$ExternalSyntheticOutline0.m1432m(str, str2, str3);
        this.groupId = str;
        this.artifactId = str2;
        this.version = str3;
        this.name = str4;
        this.spdxLicenses = list;
        this.unknownLicenses = list2;
        this.scm = scm;
    }
}
