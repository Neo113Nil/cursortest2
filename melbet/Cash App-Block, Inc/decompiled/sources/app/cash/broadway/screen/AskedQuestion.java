package app.cash.broadway.screen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentState;

/* loaded from: classes3.dex */
public final class AskedQuestion implements Parcelable {
    public static final Parcelable.Creator<AskedQuestion> CREATOR = new FragmentState.AnonymousClass1(25);
    public final String id;
    public final Question question;

    public AskedQuestion(String str, Question question) {
        str.getClass();
        question.getClass();
        this.id = str;
        this.question = question;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String getId() {
        return this.id;
    }

    public final Question getQuestion() {
        return this.question;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.id);
        parcel.writeParcelable(this.question, i);
    }
}
