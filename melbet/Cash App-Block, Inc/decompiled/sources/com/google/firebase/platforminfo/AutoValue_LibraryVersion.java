package com.google.firebase.platforminfo;

import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class AutoValue_LibraryVersion {
    public final String libraryName;
    public final String version;

    public AutoValue_LibraryVersion(String str, String str2) {
        this.libraryName = str;
        if (str2 != null) {
            this.version = str2;
        } else {
            a$$ExternalSyntheticBUOutline0.m$2("Null version");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AutoValue_LibraryVersion)) {
            return false;
        }
        AutoValue_LibraryVersion autoValue_LibraryVersion = (AutoValue_LibraryVersion) obj;
        return this.libraryName.equals(autoValue_LibraryVersion.libraryName) && this.version.equals(autoValue_LibraryVersion.version);
    }

    public final int hashCode() {
        return this.version.hashCode() ^ ((this.libraryName.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryVersion{libraryName=");
        sb.append(this.libraryName);
        sb.append(", version=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.version, "}");
    }
}
