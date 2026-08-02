package com.squareup.cash.account.backend;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.play.core.review.zzb;
import com.squareup.cash.screens.Redacted;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSwitcher$AccountSwitchingMetadata implements Parcelable {
    public static final Parcelable.Creator<AccountSwitcher$AccountSwitchingMetadata> CREATOR = new zzb(21);
    public final AccountSwitcher$AccountSwitchInitiationSource initiationSource;
    public final String loggedInAccountToken;
    public final String loggedOutAccountToken;
    public final String managedAccountWelcomeMessage;
    public final SwitchSource source;
    public final long startElapsedRealtimeMillis;
    public final AccountSwitcher$AccountSwitchType switchType;
    public final Redacted targetAccountCashtag;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class SwitchSource {
        public static final /* synthetic */ SwitchSource[] $VALUES;
        public static final SwitchSource CREATE;
        public static final SwitchSource SWITCH;

        static {
            SwitchSource switchSource = new SwitchSource("SWITCH", 0);
            SWITCH = switchSource;
            SwitchSource switchSource2 = new SwitchSource("CREATE", 1);
            CREATE = switchSource2;
            $VALUES = new SwitchSource[]{switchSource, switchSource2};
        }

        public static SwitchSource valueOf(String str) {
            return (SwitchSource) Enum.valueOf(SwitchSource.class, str);
        }

        public static SwitchSource[] values() {
            return (SwitchSource[]) $VALUES.clone();
        }
    }

    public AccountSwitcher$AccountSwitchingMetadata(String str, String str2, Redacted redacted, SwitchSource switchSource, long j, AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource, AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType, String str3) {
        str.getClass();
        str2.getClass();
        redacted.getClass();
        this.loggedInAccountToken = str;
        this.loggedOutAccountToken = str2;
        this.targetAccountCashtag = redacted;
        this.source = switchSource;
        this.startElapsedRealtimeMillis = j;
        this.initiationSource = accountSwitcher$AccountSwitchInitiationSource;
        this.switchType = accountSwitcher$AccountSwitchType;
        this.managedAccountWelcomeMessage = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccountSwitcher$AccountSwitchingMetadata)) {
            return false;
        }
        AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = (AccountSwitcher$AccountSwitchingMetadata) obj;
        return Intrinsics.areEqual(this.loggedInAccountToken, accountSwitcher$AccountSwitchingMetadata.loggedInAccountToken) && Intrinsics.areEqual(this.loggedOutAccountToken, accountSwitcher$AccountSwitchingMetadata.loggedOutAccountToken) && Intrinsics.areEqual(this.targetAccountCashtag, accountSwitcher$AccountSwitchingMetadata.targetAccountCashtag) && this.source == accountSwitcher$AccountSwitchingMetadata.source && this.startElapsedRealtimeMillis == accountSwitcher$AccountSwitchingMetadata.startElapsedRealtimeMillis && this.initiationSource == accountSwitcher$AccountSwitchingMetadata.initiationSource && this.switchType == accountSwitcher$AccountSwitchingMetadata.switchType && Intrinsics.areEqual(this.managedAccountWelcomeMessage, accountSwitcher$AccountSwitchingMetadata.managedAccountWelcomeMessage);
    }

    public final int hashCode() {
        int m = re$$ExternalSyntheticOutline0.m(this.targetAccountCashtag, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.loggedInAccountToken.hashCode() * 31, 31, this.loggedOutAccountToken), 31);
        SwitchSource switchSource = this.source;
        int m2 = Recorder$$ExternalSyntheticOutline2.m((m + (switchSource == null ? 0 : switchSource.hashCode())) * 31, 31, this.startElapsedRealtimeMillis);
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = this.initiationSource;
        int hashCode = (m2 + (accountSwitcher$AccountSwitchInitiationSource == null ? 0 : accountSwitcher$AccountSwitchInitiationSource.hashCode())) * 31;
        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType = this.switchType;
        int hashCode2 = (hashCode + (accountSwitcher$AccountSwitchType == null ? 0 : accountSwitcher$AccountSwitchType.hashCode())) * 31;
        String str = this.managedAccountWelcomeMessage;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AccountSwitchingMetadata(loggedInAccountToken=", this.loggedInAccountToken, ", loggedOutAccountToken=", this.loggedOutAccountToken, ", targetAccountCashtag=");
        m.append(this.targetAccountCashtag);
        m.append(", source=");
        m.append(this.source);
        m.append(", startElapsedRealtimeMillis=");
        m.append(this.startElapsedRealtimeMillis);
        m.append(", initiationSource=");
        m.append(this.initiationSource);
        m.append(", switchType=");
        m.append(this.switchType);
        m.append(", managedAccountWelcomeMessage=");
        m.append(this.managedAccountWelcomeMessage);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.loggedInAccountToken);
        parcel.writeString(this.loggedOutAccountToken);
        parcel.writeParcelable(this.targetAccountCashtag, i);
        SwitchSource switchSource = this.source;
        if (switchSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(switchSource.name());
        }
        parcel.writeLong(this.startElapsedRealtimeMillis);
        AccountSwitcher$AccountSwitchInitiationSource accountSwitcher$AccountSwitchInitiationSource = this.initiationSource;
        if (accountSwitcher$AccountSwitchInitiationSource == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(accountSwitcher$AccountSwitchInitiationSource.name());
        }
        AccountSwitcher$AccountSwitchType accountSwitcher$AccountSwitchType = this.switchType;
        if (accountSwitcher$AccountSwitchType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(accountSwitcher$AccountSwitchType.name());
        }
        parcel.writeString(this.managedAccountWelcomeMessage);
    }
}
