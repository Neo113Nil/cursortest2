package com.fidesmo.sec.local;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u000eJ.\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/fidesmo/sec/local/DeviceDescriptionResponse;", "", "cin", "", "description", "Lcom/fidesmo/sec/local/DeviceDescriptionFromServer;", "ownedByAccount", "", "(Ljava/lang/String;Lcom/fidesmo/sec/local/DeviceDescriptionFromServer;Ljava/lang/Boolean;)V", "getCin", "()Ljava/lang/String;", "getDescription", "()Lcom/fidesmo/sec/local/DeviceDescriptionFromServer;", "getOwnedByAccount", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Lcom/fidesmo/sec/local/DeviceDescriptionFromServer;Ljava/lang/Boolean;)Lcom/fidesmo/sec/local/DeviceDescriptionResponse;", "equals", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DeviceDescriptionResponse {
    private final String cin;
    private final DeviceDescriptionFromServer description;
    private final Boolean ownedByAccount;

    public DeviceDescriptionResponse(String str, DeviceDescriptionFromServer deviceDescriptionFromServer, Boolean bool) {
        str.getClass();
        deviceDescriptionFromServer.getClass();
        this.cin = str;
        this.description = deviceDescriptionFromServer;
        this.ownedByAccount = bool;
    }

    public static /* synthetic */ DeviceDescriptionResponse copy$default(DeviceDescriptionResponse deviceDescriptionResponse, String str, DeviceDescriptionFromServer deviceDescriptionFromServer, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceDescriptionResponse.cin;
        }
        if ((i & 2) != 0) {
            deviceDescriptionFromServer = deviceDescriptionResponse.description;
        }
        if ((i & 4) != 0) {
            bool = deviceDescriptionResponse.ownedByAccount;
        }
        return deviceDescriptionResponse.copy(str, deviceDescriptionFromServer, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCin() {
        return this.cin;
    }

    /* renamed from: component2, reason: from getter */
    public final DeviceDescriptionFromServer getDescription() {
        return this.description;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getOwnedByAccount() {
        return this.ownedByAccount;
    }

    public final DeviceDescriptionResponse copy(String cin, DeviceDescriptionFromServer description, Boolean ownedByAccount) {
        cin.getClass();
        description.getClass();
        return new DeviceDescriptionResponse(cin, description, ownedByAccount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceDescriptionResponse)) {
            return false;
        }
        DeviceDescriptionResponse deviceDescriptionResponse = (DeviceDescriptionResponse) other;
        return Intrinsics.areEqual(this.cin, deviceDescriptionResponse.cin) && Intrinsics.areEqual(this.description, deviceDescriptionResponse.description) && Intrinsics.areEqual(this.ownedByAccount, deviceDescriptionResponse.ownedByAccount);
    }

    public final String getCin() {
        return this.cin;
    }

    public final DeviceDescriptionFromServer getDescription() {
        return this.description;
    }

    public final Boolean getOwnedByAccount() {
        return this.ownedByAccount;
    }

    public int hashCode() {
        int hashCode = (this.description.hashCode() + (this.cin.hashCode() * 31)) * 31;
        Boolean bool = this.ownedByAccount;
        return hashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        return "DeviceDescriptionResponse(cin=" + this.cin + ", description=" + this.description + ", ownedByAccount=" + this.ownedByAccount + ')';
    }

    public /* synthetic */ DeviceDescriptionResponse(String str, DeviceDescriptionFromServer deviceDescriptionFromServer, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, deviceDescriptionFromServer, (i & 4) != 0 ? null : bool);
    }
}
