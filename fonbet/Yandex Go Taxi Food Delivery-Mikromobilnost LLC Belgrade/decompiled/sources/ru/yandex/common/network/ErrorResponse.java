package ru.yandex.common.network;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.io.ObjectOutput;
import ru.yandex.common.cache.Cacheable;

/* loaded from: classes4.dex */
public class ErrorResponse implements Parcelable, Cacheable {
    public static final int CACHE_VERSION_NUMBER = 1;
    public static final Parcelable.Creator<ErrorResponse> CREATOR = new Parcelable.Creator<ErrorResponse>() { // from class: ru.yandex.common.network.ErrorResponse.1
        @Override // android.os.Parcelable.Creator
        public ErrorResponse createFromParcel(Parcel parcel) {
            parcel.readInt();
            ErrorResponse errorResponse = new ErrorResponse(parcel.readString());
            errorResponse.setText(parcel.readString());
            return errorResponse;
        }

        @Override // android.os.Parcelable.Creator
        public ErrorResponse[] newArray(int i) {
            return new ErrorResponse[i];
        }
    };
    public static final Cacheable.Reader<ErrorResponse> READER = new a();
    String code;
    String text = "";

    public ErrorResponse(String str) {
        this.code = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCode() {
        return this.code;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String str) {
        this.text = str;
    }

    @Override // ru.yandex.common.cache.Cacheable
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeInt(1);
        objectOutput.writeUTF(this.code);
        objectOutput.writeUTF(this.text);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(describeContents());
        parcel.writeString(this.code);
        parcel.writeString(this.text);
    }
}
