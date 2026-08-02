package com.fidesmo.sec.core.models;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/fidesmo/sec/core/models/FidesmoPayBank;", "", "appName", "", "appAddress", "contact", "Lcom/fidesmo/sec/core/models/FidesmoPayBankContact;", "(Ljava/lang/String;Ljava/lang/String;Lcom/fidesmo/sec/core/models/FidesmoPayBankContact;)V", "getAppAddress", "()Ljava/lang/String;", "getAppName", "getContact", "()Lcom/fidesmo/sec/core/models/FidesmoPayBankContact;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FidesmoPayBank {
    private final String appAddress;
    private final String appName;
    private final FidesmoPayBankContact contact;

    public /* synthetic */ FidesmoPayBank(String str, String str2, FidesmoPayBankContact fidesmoPayBankContact, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : fidesmoPayBankContact);
    }

    public static /* synthetic */ FidesmoPayBank copy$default(FidesmoPayBank fidesmoPayBank, String str, String str2, FidesmoPayBankContact fidesmoPayBankContact, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fidesmoPayBank.appName;
        }
        if ((i & 2) != 0) {
            str2 = fidesmoPayBank.appAddress;
        }
        if ((i & 4) != 0) {
            fidesmoPayBankContact = fidesmoPayBank.contact;
        }
        return fidesmoPayBank.copy(str, str2, fidesmoPayBankContact);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppAddress() {
        return this.appAddress;
    }

    /* renamed from: component3, reason: from getter */
    public final FidesmoPayBankContact getContact() {
        return this.contact;
    }

    public final FidesmoPayBank copy(String appName, String appAddress, FidesmoPayBankContact contact) {
        return new FidesmoPayBank(appName, appAddress, contact);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FidesmoPayBank)) {
            return false;
        }
        FidesmoPayBank fidesmoPayBank = (FidesmoPayBank) other;
        return Intrinsics.areEqual(this.appName, fidesmoPayBank.appName) && Intrinsics.areEqual(this.appAddress, fidesmoPayBank.appAddress) && Intrinsics.areEqual(this.contact, fidesmoPayBank.contact);
    }

    public final String getAppAddress() {
        return this.appAddress;
    }

    public final String getAppName() {
        return this.appName;
    }

    public final FidesmoPayBankContact getContact() {
        return this.contact;
    }

    public int hashCode() {
        String str = this.appName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.appAddress;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        FidesmoPayBankContact fidesmoPayBankContact = this.contact;
        return hashCode2 + (fidesmoPayBankContact != null ? fidesmoPayBankContact.hashCode() : 0);
    }

    public String toString() {
        return "FidesmoPayBank(appName=" + this.appName + ", appAddress=" + this.appAddress + ", contact=" + this.contact + ')';
    }

    public FidesmoPayBank(String str, String str2, FidesmoPayBankContact fidesmoPayBankContact) {
        this.appName = str;
        this.appAddress = str2;
        this.contact = fidesmoPayBankContact;
    }

    public FidesmoPayBank() {
        this(null, null, null, 7, null);
    }
}
