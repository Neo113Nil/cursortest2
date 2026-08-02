package com.plaid.internal.core.crashreporting.internal.models;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.gson.annotations.SerializedName;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JQ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\tHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R$\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/plaid/internal/core/crashreporting/internal/models/User;", "Ljava/io/Serializable;", "id", "", "username", "ipAddress", "email", "data", "", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getData", "()Ljava/util/Map;", "getEmail", "()Ljava/lang/String;", "getId", "getIpAddress", "getUsername", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "crash-reporting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class User implements Serializable {

    @SerializedName("data")
    private final Map<String, Object> data;

    @SerializedName("email")
    private final String email;

    @SerializedName("id")
    private final String id;

    @SerializedName("ipAddress")
    private final String ipAddress;

    @SerializedName("username")
    private final String username;

    public /* synthetic */ User(String str, String str2, String str3, String str4, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : map);
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.id;
        }
        if ((i & 2) != 0) {
            str2 = user.username;
        }
        if ((i & 4) != 0) {
            str3 = user.ipAddress;
        }
        if ((i & 8) != 0) {
            str4 = user.email;
        }
        if ((i & 16) != 0) {
            map = user.data;
        }
        Map map2 = map;
        String str5 = str3;
        return user.copy(str, str2, str5, str4, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getUsername() {
        return this.username;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIpAddress() {
        return this.ipAddress;
    }

    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    public final Map<String, Object> component5() {
        return this.data;
    }

    public final User copy(String id, String username, String ipAddress, String email, Map<String, ? extends Object> data) {
        return new User(id, username, ipAddress, email, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(this.id, user.id) && Intrinsics.areEqual(this.username, user.username) && Intrinsics.areEqual(this.ipAddress, user.ipAddress) && Intrinsics.areEqual(this.email, user.email) && Intrinsics.areEqual(this.data, user.data);
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getId() {
        return this.id;
    }

    public final String getIpAddress() {
        return this.ipAddress;
    }

    public final String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.username;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ipAddress;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.email;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, Object> map = this.data;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.username;
        String str3 = this.ipAddress;
        String str4 = this.email;
        Map<String, Object> map = this.data;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("User(id=", str, ", username=", str2, ", ipAddress=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", email=", str4, ", data=");
        return re$$ExternalSyntheticOutline0.m(")", m, map);
    }

    public User(String str, String str2, String str3, String str4, Map<String, ? extends Object> map) {
        this.id = str;
        this.username = str2;
        this.ipAddress = str3;
        this.email = str4;
        this.data = map;
    }

    public User() {
        this(null, null, null, null, null, 31, null);
    }
}
