package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import app.cash.broadway.screen.OnlyOneOverlayTreatment;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.protos.common.Money;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class StartPoolScreen implements Screen, OnlyOneOverlayTreatment {
    public static final Parcelable.Creator<StartPoolScreen> CREATOR = new PdfScreen.Creator(13);
    public final Money amount;
    public final EntryPoint entryPoint;
    public final UUID externalId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class EntryPoint {
        public static final /* synthetic */ EntryPoint[] $VALUES;
        public static final EntryPoint P2P_KEYPAD;
        public static final EntryPoint POOLS_APPLET;

        static {
            EntryPoint entryPoint = new EntryPoint("POOLS_APPLET", 0);
            POOLS_APPLET = entryPoint;
            EntryPoint entryPoint2 = new EntryPoint("P2P_KEYPAD", 1);
            P2P_KEYPAD = entryPoint2;
            $VALUES = new EntryPoint[]{entryPoint, entryPoint2};
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    public StartPoolScreen(Money money, UUID uuid, EntryPoint entryPoint) {
        uuid.getClass();
        entryPoint.getClass();
        this.amount = money;
        this.externalId = uuid;
        this.entryPoint = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StartPoolScreen)) {
            return false;
        }
        StartPoolScreen startPoolScreen = (StartPoolScreen) obj;
        return Intrinsics.areEqual(this.amount, startPoolScreen.amount) && Intrinsics.areEqual(this.externalId, startPoolScreen.externalId) && this.entryPoint == startPoolScreen.entryPoint;
    }

    public final int hashCode() {
        Money money = this.amount;
        int hashCode = money == null ? 0 : money.hashCode();
        return this.entryPoint.hashCode() + ((this.externalId.hashCode() + (hashCode * 31)) * 31);
    }

    public final String toString() {
        return "StartPoolScreen(amount=" + this.amount + ", externalId=" + this.externalId + ", entryPoint=" + this.entryPoint + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.amount, i);
        parcel.writeSerializable(this.externalId);
        parcel.writeString(this.entryPoint.name());
    }
}
