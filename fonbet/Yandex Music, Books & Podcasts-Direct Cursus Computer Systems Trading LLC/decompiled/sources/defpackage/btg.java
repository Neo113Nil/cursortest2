package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class btg implements Parcelable {
    public static final Parcelable.Creator<btg> CREATOR = new pnf(7);
    public final int a;
    public final ja b;
    public final j02 c;
    public final String d;
    public final String e;
    public final atg f;
    public HashMap g;
    public HashMap h;

    public btg(Parcel parcel) {
        int i;
        String readString = parcel.readString();
        if (readString != null) {
            if (readString.equals("SUCCESS")) {
                i = 1;
            } else if (readString.equals("CANCEL")) {
                i = 2;
            } else if (readString.equals("ERROR")) {
                i = 3;
            } else {
                xq0.x("No enum constant com.facebook.login.LoginClient.Result.Code.".concat(readString));
            }
            this.a = i;
            this.b = (ja) parcel.readParcelable(ja.class.getClassLoader());
            this.c = (j02) parcel.readParcelable(j02.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = (atg) parcel.readParcelable(atg.class.getClassLoader());
            this.g = gvt.O(parcel);
            this.h = gvt.O(parcel);
        }
        jj4.j("Name is null");
        i = 0;
        this.a = i;
        this.b = (ja) parcel.readParcelable(ja.class.getClassLoader());
        this.c = (j02) parcel.readParcelable(j02.class.getClassLoader());
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (atg) parcel.readParcelable(atg.class.getClassLoader());
        this.g = gvt.O(parcel);
        this.h = gvt.O(parcel);
    }

    public static btg a(atg atgVar, String str) {
        return new btg(atgVar, 2, null, null, str, null);
    }

    public static btg b(atg atgVar, String str, String str2, String str3) {
        String[] strArr = {str, str2};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            String str4 = strArr[i];
            if (str4 != null) {
                arrayList.add(str4);
            }
        }
        return new btg(atgVar, 3, null, null, TextUtils.join(": ", arrayList), str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        int i2 = this.a;
        if (i2 == 1) {
            str = "SUCCESS";
        } else if (i2 == 2) {
            str = "CANCEL";
        } else {
            if (i2 != 3) {
                throw null;
            }
            str = "ERROR";
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.b, i);
        parcel.writeParcelable(this.c, i);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, i);
        gvt.Z(parcel, this.g);
        gvt.Z(parcel, this.h);
    }

    public btg(atg atgVar, int i, ja jaVar, j02 j02Var, String str, String str2) {
        if (i == 0) {
            jj4.j(hrg.q("Argument '", "code", "' cannot be null"));
        }
        this.f = atgVar;
        this.b = jaVar;
        this.c = j02Var;
        this.d = str;
        this.a = i;
        this.e = str2;
    }
}
