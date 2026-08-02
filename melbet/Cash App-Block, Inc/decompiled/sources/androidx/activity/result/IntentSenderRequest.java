package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;

/* loaded from: classes3.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new FragmentState.AnonymousClass1(13);
    public final Intent fillInIntent;
    public final int flagsMask;
    public final int flagsValues;
    public final IntentSender intentSender;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.intentSender = intentSender;
        this.fillInIntent = intent;
        this.flagsMask = i;
        this.flagsValues = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Intent getFillInIntent() {
        return this.fillInIntent;
    }

    public final int getFlagsMask() {
        return this.flagsMask;
    }

    public final int getFlagsValues() {
        return this.flagsValues;
    }

    public final IntentSender getIntentSender() {
        return this.intentSender;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.intentSender, i);
        parcel.writeParcelable(this.fillInIntent, i);
        parcel.writeInt(this.flagsMask);
        parcel.writeInt(this.flagsValues);
    }
}
