package com.squareup.cash.deposits.physical.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.db.contacts.Recipient;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class AtmPmdExplainerScreen implements AtmExplainerScreen, Screen {
    public static final Parcelable.Creator<AtmPmdExplainerScreen> CREATOR = new Recipient.Creator(14);
    public final BlockersData blockersData;
    public final List elements;
    public final List footerElements;
    public final AtmPmdExplainerOrigin origin;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class AtmPmdExplainerOrigin {
        public static final /* synthetic */ AtmPmdExplainerOrigin[] $VALUES;
        public static final AtmPmdExplainerOrigin ATM;
        public static final AtmPmdExplainerOrigin PMD;

        static {
            AtmPmdExplainerOrigin atmPmdExplainerOrigin = new AtmPmdExplainerOrigin("ATM", 0);
            ATM = atmPmdExplainerOrigin;
            AtmPmdExplainerOrigin atmPmdExplainerOrigin2 = new AtmPmdExplainerOrigin("PMD", 1);
            PMD = atmPmdExplainerOrigin2;
            $VALUES = new AtmPmdExplainerOrigin[]{atmPmdExplainerOrigin, atmPmdExplainerOrigin2};
        }

        public static AtmPmdExplainerOrigin valueOf(String str) {
            return (AtmPmdExplainerOrigin) Enum.valueOf(AtmPmdExplainerOrigin.class, str);
        }

        public static AtmPmdExplainerOrigin[] values() {
            return (AtmPmdExplainerOrigin[]) $VALUES.clone();
        }
    }

    public AtmPmdExplainerScreen(AtmPmdExplainerOrigin atmPmdExplainerOrigin, List list, List list2, BlockersData blockersData) {
        atmPmdExplainerOrigin.getClass();
        list.getClass();
        list2.getClass();
        blockersData.getClass();
        this.origin = atmPmdExplainerOrigin;
        this.elements = list;
        this.footerElements = list2;
        this.blockersData = blockersData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.squareup.cash.blockers.screens.BlockersScreens
    public final BlockersData getBlockersData() {
        return this.blockersData;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.origin.name());
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.elements, parcel);
        while (m.hasNext()) {
            parcel.writeParcelable((Parcelable) m.next(), i);
        }
        Iterator m2 = CameraState$Type$EnumUnboxingLocalUtility.m(this.footerElements, parcel);
        while (m2.hasNext()) {
            parcel.writeParcelable((Parcelable) m2.next(), i);
        }
        parcel.writeParcelable(this.blockersData, i);
    }
}
