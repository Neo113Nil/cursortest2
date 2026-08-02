package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.D1;
import com.plaid.internal.F1;
import com.plaid.link.result.LinkAccountSubtype;
import com.plaid.link.result.LinkAccountType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0001+BC\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JM\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u001fHÖ\u0001J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0019\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006,"}, d2 = {"Lcom/plaid/link/result/LinkAccount;", "Landroid/os/Parcelable;", "id", "", "name", "mask", "subtype", "Lcom/plaid/link/result/LinkAccountSubtype;", "verificationStatus", "Lcom/plaid/link/result/LinkAccountVerificationStatus;", "balance", "Lcom/plaid/link/result/LinkAccountBalance;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/result/LinkAccountSubtype;Lcom/plaid/link/result/LinkAccountVerificationStatus;Lcom/plaid/link/result/LinkAccountBalance;)V", "getBalance", "()Lcom/plaid/link/result/LinkAccountBalance;", "getId", "()Ljava/lang/String;", "getMask", "getName", "getSubtype", "()Lcom/plaid/link/result/LinkAccountSubtype;", "getVerificationStatus", "()Lcom/plaid/link/result/LinkAccountVerificationStatus;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkAccount implements Parcelable {
    public static final String NO_VALUE = "no_value";
    private final LinkAccountBalance balance;
    private final String id;
    private final String mask;
    private final String name;
    private final LinkAccountSubtype subtype;
    private final LinkAccountVerificationStatus verificationStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkAccount> CREATOR = new Creator();

    public /* synthetic */ LinkAccount(String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? new LinkAccountSubtype.UNKNOWN("", new LinkAccountType.UNKNOWN("")) : linkAccountSubtype, linkAccountVerificationStatus, (i & 32) != 0 ? null : linkAccountBalance);
    }

    public static /* synthetic */ LinkAccount copy$default(LinkAccount linkAccount, String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkAccount.id;
        }
        if ((i & 2) != 0) {
            str2 = linkAccount.name;
        }
        if ((i & 4) != 0) {
            str3 = linkAccount.mask;
        }
        if ((i & 8) != 0) {
            linkAccountSubtype = linkAccount.subtype;
        }
        if ((i & 16) != 0) {
            linkAccountVerificationStatus = linkAccount.verificationStatus;
        }
        if ((i & 32) != 0) {
            linkAccountBalance = linkAccount.balance;
        }
        LinkAccountVerificationStatus linkAccountVerificationStatus2 = linkAccountVerificationStatus;
        LinkAccountBalance linkAccountBalance2 = linkAccountBalance;
        return linkAccount.copy(str, str2, str3, linkAccountSubtype, linkAccountVerificationStatus2, linkAccountBalance2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMask() {
        return this.mask;
    }

    /* renamed from: component4, reason: from getter */
    public final LinkAccountSubtype getSubtype() {
        return this.subtype;
    }

    /* renamed from: component5, reason: from getter */
    public final LinkAccountVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final LinkAccountBalance getBalance() {
        return this.balance;
    }

    public final LinkAccount copy(String id, String name, String mask, LinkAccountSubtype subtype, LinkAccountVerificationStatus verificationStatus, LinkAccountBalance balance) {
        id.getClass();
        subtype.getClass();
        return new LinkAccount(id, name, mask, subtype, verificationStatus, balance);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkAccount)) {
            return false;
        }
        LinkAccount linkAccount = (LinkAccount) other;
        return Intrinsics.areEqual(this.id, linkAccount.id) && Intrinsics.areEqual(this.name, linkAccount.name) && Intrinsics.areEqual(this.mask, linkAccount.mask) && Intrinsics.areEqual(this.subtype, linkAccount.subtype) && Intrinsics.areEqual(this.verificationStatus, linkAccount.verificationStatus) && Intrinsics.areEqual(this.balance, linkAccount.balance);
    }

    public final LinkAccountBalance getBalance() {
        return this.balance;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMask() {
        return this.mask;
    }

    public final String getName() {
        return this.name;
    }

    public final LinkAccountSubtype getSubtype() {
        return this.subtype;
    }

    public final LinkAccountVerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.mask;
        int hashCode3 = (this.subtype.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        LinkAccountVerificationStatus linkAccountVerificationStatus = this.verificationStatus;
        int hashCode4 = (hashCode3 + (linkAccountVerificationStatus == null ? 0 : linkAccountVerificationStatus.hashCode())) * 31;
        LinkAccountBalance linkAccountBalance = this.balance;
        return hashCode4 + (linkAccountBalance != null ? linkAccountBalance.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.mask;
        LinkAccountSubtype linkAccountSubtype = this.subtype;
        LinkAccountVerificationStatus linkAccountVerificationStatus = this.verificationStatus;
        LinkAccountBalance linkAccountBalance = this.balance;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkAccount(id=", str, ", name=", str2, ", mask=");
        m.append(str3);
        m.append(", subtype=");
        m.append(linkAccountSubtype);
        m.append(", verificationStatus=");
        m.append(linkAccountVerificationStatus);
        m.append(", balance=");
        m.append(linkAccountBalance);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.mask);
        parcel.writeParcelable(this.subtype, flags);
        parcel.writeParcelable(this.verificationStatus, flags);
        LinkAccountBalance linkAccountBalance = this.balance;
        if (linkAccountBalance == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkAccountBalance.writeToParcel(parcel, flags);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/plaid/link/result/LinkAccount$Companion;", "", "<init>", "()V", "Lcom/plaid/internal/D1;", "account", "Lcom/plaid/link/result/LinkAccount;", "fromResponse$link_sdk_release", "(Lcom/plaid/internal/D1;)Lcom/plaid/link/result/LinkAccount;", "fromResponse", "", "NO_VALUE", "Ljava/lang/String;", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkAccount fromResponse$link_sdk_release(D1 account) {
            account.getClass();
            String f = account.f();
            F1 b = account.b();
            String a = b != null ? b.a() : null;
            F1 b2 = account.b();
            return new LinkAccount(f, a, b2 != null ? b2.b() : null, LinkAccountSubtype.INSTANCE.convert(account.c(), account.d()), LinkAccountVerificationStatus.INSTANCE.convert(account.e()), LinkAccountBalance.INSTANCE.convert$link_sdk_release(account.a()));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkAccount> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LinkAccount(parcel.readString(), parcel.readString(), parcel.readString(), (LinkAccountSubtype) parcel.readParcelable(LinkAccount.class.getClassLoader()), (LinkAccountVerificationStatus) parcel.readParcelable(LinkAccount.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkAccountBalance.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkAccount[] newArray(int i) {
            return new LinkAccount[i];
        }
    }

    public LinkAccount(String str, String str2, String str3, LinkAccountSubtype linkAccountSubtype, LinkAccountVerificationStatus linkAccountVerificationStatus, LinkAccountBalance linkAccountBalance) {
        str.getClass();
        linkAccountSubtype.getClass();
        this.id = str;
        this.name = str2;
        this.mask = str3;
        this.subtype = linkAccountSubtype;
        this.verificationStatus = linkAccountVerificationStatus;
        this.balance = linkAccountBalance;
    }
}
