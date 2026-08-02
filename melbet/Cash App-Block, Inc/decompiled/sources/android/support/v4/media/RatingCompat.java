package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new FragmentState.AnonymousClass1(5);
    public final int mRatingStyle;
    public final float mRatingValue;

    public RatingCompat(float f, int i) {
        this.mRatingStyle = i;
        this.mRatingValue = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return this.mRatingStyle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.mRatingStyle);
        sb.append(" rating=");
        float f = this.mRatingValue;
        sb.append(f < RecyclerView.DECELERATION_RATE ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mRatingStyle);
        parcel.writeFloat(this.mRatingValue);
    }
}
