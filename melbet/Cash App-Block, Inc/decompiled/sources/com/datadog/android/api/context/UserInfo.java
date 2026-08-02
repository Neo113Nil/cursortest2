package com.datadog.android.api.context;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class UserInfo {
    public final Map additionalProperties;
    public final String anonymousId;
    public final String email;
    public final String id;
    public final String name;

    public UserInfo(String str, String str2, String str3, String str4, Map map) {
        map.getClass();
        this.anonymousId = str;
        this.id = str2;
        this.name = str3;
        this.email = str4;
        this.additionalProperties = map;
    }

    public static UserInfo copy$default(UserInfo userInfo, String str, String str2, Map map, int i) {
        if ((i & 1) != 0) {
            str = userInfo.anonymousId;
        }
        String str3 = str;
        if ((i & 2) != 0) {
            str2 = userInfo.id;
        }
        String str4 = str2;
        String str5 = (i & 4) != 0 ? userInfo.name : null;
        String str6 = (i & 8) != 0 ? userInfo.email : null;
        if ((i & 16) != 0) {
            map = userInfo.additionalProperties;
        }
        Map map2 = map;
        userInfo.getClass();
        map2.getClass();
        return new UserInfo(str3, str4, str5, str6, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserInfo)) {
            return false;
        }
        UserInfo userInfo = (UserInfo) obj;
        return Intrinsics.areEqual(this.anonymousId, userInfo.anonymousId) && Intrinsics.areEqual(this.id, userInfo.id) && Intrinsics.areEqual(this.name, userInfo.name) && Intrinsics.areEqual(this.email, userInfo.email) && Intrinsics.areEqual(this.additionalProperties, userInfo.additionalProperties);
    }

    public final int hashCode() {
        String str = this.anonymousId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.name;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        return this.additionalProperties.hashCode() + ((hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("UserInfo(anonymousId=", this.anonymousId, ", id=", this.id, ", name=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.name, ", email=", this.email, ", additionalProperties=");
        return re$$ExternalSyntheticOutline0.m(")", m, this.additionalProperties);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public UserInfo() {
        this(null, null, null, null, r5);
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
    }
}
