package com.squareup.cash.blockers.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.common.scenarios.BankAccountLinkingConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class LinkingFlowsData implements Parcelable {
    public static final Parcelable.Creator<LinkingFlowsData> CREATOR = new Creator();
    public final List flows;
    public final BankAccountLinkingConfig.SupportedLinkingFlow preferred;

    public final class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(BankAccountLinkingConfig.SupportedLinkingFlow.valueOf(parcel.readString()));
                }
            }
            return new LinkingFlowsData(arrayList, parcel.readInt() != 0 ? BankAccountLinkingConfig.SupportedLinkingFlow.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LinkingFlowsData[i];
        }
    }

    public LinkingFlowsData(List list, BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow) {
        this.flows = list;
        this.preferred = supportedLinkingFlow;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkingFlowsData)) {
            return false;
        }
        LinkingFlowsData linkingFlowsData = (LinkingFlowsData) obj;
        return Intrinsics.areEqual(this.flows, linkingFlowsData.flows) && this.preferred == linkingFlowsData.preferred;
    }

    public final int hashCode() {
        List list = this.flows;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow = this.preferred;
        return hashCode + (supportedLinkingFlow != null ? supportedLinkingFlow.hashCode() : 0);
    }

    public final String toString() {
        return "LinkingFlowsData(flows=" + this.flows + ", preferred=" + this.preferred + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        List list = this.flows;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator m = SVG$Unit$EnumUnboxingLocalUtility.m(parcel, 1, list);
            while (m.hasNext()) {
                parcel.writeString(((BankAccountLinkingConfig.SupportedLinkingFlow) m.next()).name());
            }
        }
        BankAccountLinkingConfig.SupportedLinkingFlow supportedLinkingFlow = this.preferred;
        if (supportedLinkingFlow == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(supportedLinkingFlow.name());
        }
    }
}
