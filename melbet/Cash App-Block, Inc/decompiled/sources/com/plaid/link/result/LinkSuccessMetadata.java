package com.plaid.link.result;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.plaid.internal.C0322x;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J9\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006$"}, d2 = {"Lcom/plaid/link/result/LinkSuccessMetadata;", "Landroid/os/Parcelable;", "institution", "Lcom/plaid/link/result/LinkInstitution;", "accounts", "", "Lcom/plaid/link/result/LinkAccount;", "linkSessionId", "", "metadataJson", "(Lcom/plaid/link/result/LinkInstitution;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getAccounts", "()Ljava/util/List;", "getInstitution", "()Lcom/plaid/link/result/LinkInstitution;", "getLinkSessionId", "()Ljava/lang/String;", "getMetadataJson", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkSuccessMetadata implements Parcelable {
    public static final Parcelable.Creator<LinkSuccessMetadata> CREATOR = new Creator();
    private final List<LinkAccount> accounts;
    private final LinkInstitution institution;
    private final String linkSessionId;
    private final String metadataJson;

    public LinkSuccessMetadata(LinkInstitution linkInstitution, List<LinkAccount> list, String str, String str2) {
        list.getClass();
        str.getClass();
        str2.getClass();
        this.institution = linkInstitution;
        this.accounts = list;
        this.linkSessionId = str;
        this.metadataJson = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinkSuccessMetadata copy$default(LinkSuccessMetadata linkSuccessMetadata, LinkInstitution linkInstitution, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            linkInstitution = linkSuccessMetadata.institution;
        }
        if ((i & 2) != 0) {
            list = linkSuccessMetadata.accounts;
        }
        if ((i & 4) != 0) {
            str = linkSuccessMetadata.linkSessionId;
        }
        if ((i & 8) != 0) {
            str2 = linkSuccessMetadata.metadataJson;
        }
        return linkSuccessMetadata.copy(linkInstitution, list, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    public final List<LinkAccount> component2() {
        return this.accounts;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final LinkSuccessMetadata copy(LinkInstitution institution, List<LinkAccount> accounts, String linkSessionId, String metadataJson) {
        accounts.getClass();
        linkSessionId.getClass();
        metadataJson.getClass();
        return new LinkSuccessMetadata(institution, accounts, linkSessionId, metadataJson);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkSuccessMetadata)) {
            return false;
        }
        LinkSuccessMetadata linkSuccessMetadata = (LinkSuccessMetadata) other;
        return Intrinsics.areEqual(this.institution, linkSuccessMetadata.institution) && Intrinsics.areEqual(this.accounts, linkSuccessMetadata.accounts) && Intrinsics.areEqual(this.linkSessionId, linkSuccessMetadata.linkSessionId) && Intrinsics.areEqual(this.metadataJson, linkSuccessMetadata.metadataJson);
    }

    public final List<LinkAccount> getAccounts() {
        return this.accounts;
    }

    public final LinkInstitution getInstitution() {
        return this.institution;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public int hashCode() {
        LinkInstitution linkInstitution = this.institution;
        return this.metadataJson.hashCode() + C0322x.a(this.linkSessionId, Recorder$$ExternalSyntheticOutline2.m((linkInstitution == null ? 0 : linkInstitution.hashCode()) * 31, 31, this.accounts), 31);
    }

    public String toString() {
        LinkInstitution linkInstitution = this.institution;
        List<LinkAccount> list = this.accounts;
        String str = this.linkSessionId;
        String str2 = this.metadataJson;
        StringBuilder sb = new StringBuilder("LinkSuccessMetadata(institution=");
        sb.append(linkInstitution);
        sb.append(", accounts=");
        sb.append(list);
        sb.append(", linkSessionId=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, str, ", metadataJson=", str2, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        LinkInstitution linkInstitution = this.institution;
        if (linkInstitution == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkInstitution.writeToParcel(parcel, flags);
        }
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.accounts, parcel);
        while (m.hasNext()) {
            ((LinkAccount) m.next()).writeToParcel(parcel, flags);
        }
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.metadataJson);
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkSuccessMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccessMetadata createFromParcel(Parcel parcel) {
            parcel.getClass();
            LinkInstitution createFromParcel = parcel.readInt() == 0 ? null : LinkInstitution.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = CameraState$Type$EnumUnboxingLocalUtility.m(LinkAccount.CREATOR, parcel, arrayList, i, 1);
            }
            return new LinkSuccessMetadata(createFromParcel, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkSuccessMetadata[] newArray(int i) {
            return new LinkSuccessMetadata[i];
        }
    }
}
