package com.onesignal.user.internal;

/* loaded from: classes2.dex */
public final class a {
    private final String appId;
    private final boolean failed;
    private final boolean forceCreateUser;

    public a(String str, boolean z3, boolean z6) {
        this.appId = str;
        this.forceCreateUser = z3;
        this.failed = z6;
    }

    public static /* synthetic */ a copy$default(a aVar, String str, boolean z3, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.appId;
        }
        if ((i & 2) != 0) {
            z3 = aVar.forceCreateUser;
        }
        if ((i & 4) != 0) {
            z6 = aVar.failed;
        }
        return aVar.copy(str, z3, z6);
    }

    public final String component1() {
        return this.appId;
    }

    public final boolean component2() {
        return this.forceCreateUser;
    }

    public final boolean component3() {
        return this.failed;
    }

    public final a copy(String str, boolean z3, boolean z6) {
        return new a(str, z3, z6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.h.a(this.appId, aVar.appId) && this.forceCreateUser == aVar.forceCreateUser && this.failed == aVar.failed;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final boolean getFailed() {
        return this.failed;
    }

    public final boolean getForceCreateUser() {
        return this.forceCreateUser;
    }

    public int hashCode() {
        String str = this.appId;
        return Boolean.hashCode(this.failed) + ((Boolean.hashCode(this.forceCreateUser) + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    public String toString() {
        return "AppIdResolution(appId=" + this.appId + ", forceCreateUser=" + this.forceCreateUser + ", failed=" + this.failed + ')';
    }
}
