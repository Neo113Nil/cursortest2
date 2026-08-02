package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.fragment.app.FragmentState;
import defpackage.DropMode;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new FragmentState.AnonymousClass1(10);
    public final long mActions;
    public final long mActiveItemId;
    public final long mBufferedPosition;
    public final ArrayList mCustomActions;
    public final int mErrorCode;
    public final CharSequence mErrorMessage;
    public final Bundle mExtras;
    public final long mPosition;
    public final float mSpeed;
    public final int mState;
    public final long mUpdateTime;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new AnonymousClass1();
        public final String mAction;
        public final Bundle mExtras;
        public final int mIcon;
        public final CharSequence mName;

        /* renamed from: android.support.v4.media.session.PlaybackStateCompat$CustomAction$1, reason: invalid class name */
        public final class AnonymousClass1 implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.mAction = parcel.readString();
            this.mName = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.mIcon = parcel.readInt();
            this.mExtras = parcel.readBundle(DropMode.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.mName) + ", mIcon=" + this.mIcon + ", mExtras=" + this.mExtras;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.mAction);
            TextUtils.writeToParcel(this.mName, parcel, i);
            parcel.writeInt(this.mIcon);
            parcel.writeBundle(this.mExtras);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.mState = parcel.readInt();
        this.mPosition = parcel.readLong();
        this.mSpeed = parcel.readFloat();
        this.mUpdateTime = parcel.readLong();
        this.mBufferedPosition = parcel.readLong();
        this.mActions = parcel.readLong();
        this.mErrorMessage = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mCustomActions = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.mActiveItemId = parcel.readLong();
        this.mExtras = parcel.readBundle(DropMode.class.getClassLoader());
        this.mErrorCode = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackState {state=");
        sb.append(this.mState);
        sb.append(", position=");
        sb.append(this.mPosition);
        sb.append(", buffered position=");
        sb.append(this.mBufferedPosition);
        sb.append(", speed=");
        sb.append(this.mSpeed);
        sb.append(", updated=");
        sb.append(this.mUpdateTime);
        sb.append(", actions=");
        sb.append(this.mActions);
        sb.append(", error code=");
        sb.append(this.mErrorCode);
        sb.append(", error message=");
        sb.append(this.mErrorMessage);
        sb.append(", custom actions=");
        sb.append(this.mCustomActions);
        sb.append(", active item id=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(this.mActiveItemId, "}", sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mState);
        parcel.writeLong(this.mPosition);
        parcel.writeFloat(this.mSpeed);
        parcel.writeLong(this.mUpdateTime);
        parcel.writeLong(this.mBufferedPosition);
        parcel.writeLong(this.mActions);
        TextUtils.writeToParcel(this.mErrorMessage, parcel, i);
        parcel.writeTypedList(this.mCustomActions);
        parcel.writeLong(this.mActiveItemId);
        parcel.writeBundle(this.mExtras);
        parcel.writeInt(this.mErrorCode);
    }
}
