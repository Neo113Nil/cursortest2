package com.squareup.cash.profile.viewmodels;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public interface OpenSourceViewModel {

    public final class ArtifactViewModel {
        public final String artifactId;
        public final String groupId;
        public final String name;
        public final String scmUrl;
        public final ArrayList spdxLicenses;
        public final ArrayList unknownLicenses;

        public ArtifactViewModel(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2) {
            str.getClass();
            str2.getClass();
            this.groupId = str;
            this.artifactId = str2;
            this.name = str3;
            this.spdxLicenses = arrayList;
            this.unknownLicenses = arrayList2;
            this.scmUrl = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ArtifactViewModel)) {
                return false;
            }
            ArtifactViewModel artifactViewModel = (ArtifactViewModel) obj;
            return Intrinsics.areEqual(this.groupId, artifactViewModel.groupId) && Intrinsics.areEqual(this.artifactId, artifactViewModel.artifactId) && Intrinsics.areEqual(this.name, artifactViewModel.name) && Intrinsics.areEqual(this.spdxLicenses, artifactViewModel.spdxLicenses) && Intrinsics.areEqual(this.unknownLicenses, artifactViewModel.unknownLicenses) && Intrinsics.areEqual(this.scmUrl, artifactViewModel.scmUrl);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.groupId.hashCode() * 31, 31, this.artifactId);
            String str = this.name;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            ArrayList arrayList = this.spdxLicenses;
            int hashCode2 = (hashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
            ArrayList arrayList2 = this.unknownLicenses;
            int hashCode3 = (hashCode2 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
            String str2 = this.scmUrl;
            return (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 961;
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ArtifactViewModel(groupId=", this.groupId, ", artifactId=", this.artifactId, ", name=");
            m.append(this.name);
            m.append(", spdxLicenses=");
            m.append(this.spdxLicenses);
            m.append(", unknownLicenses=");
            m.append(this.unknownLicenses);
            m.append(", scmUrl=");
            m.append(this.scmUrl);
            m.append(", spdxLicenseIdentifier=null, unknownLicenseName=null)");
            return m.toString();
        }
    }

    public final class Error implements OpenSourceViewModel {
        public static final Error INSTANCE = new Error();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Error);
        }

        public final int hashCode() {
            return -1794867759;
        }

        public final String toString() {
            return "Error";
        }
    }

    public final class Loading implements OpenSourceViewModel {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return -770392379;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* loaded from: classes6.dex */
    public final class Ready implements OpenSourceViewModel {
        public final LinkedHashMap artifacts;

        public Ready(LinkedHashMap linkedHashMap) {
            this.artifacts = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Ready) && this.artifacts.equals(((Ready) obj).artifacts);
        }

        public final int hashCode() {
            return this.artifacts.hashCode();
        }

        public final String toString() {
            return "Ready(artifacts=" + this.artifacts + ")";
        }
    }
}
