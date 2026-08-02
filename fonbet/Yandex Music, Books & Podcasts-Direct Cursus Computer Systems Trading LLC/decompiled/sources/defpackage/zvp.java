package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zvp implements Parcelable {
    public final Uri a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final cwp f;

    public zvp(Parcel parcel) {
        parcel.getClass();
        this.a = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.b = arrayList.isEmpty() ? null : Collections.unmodifiableList(arrayList);
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        jya jyaVar = new jya(5);
        cwp cwpVar = (cwp) parcel.readParcelable(cwp.class.getClassLoader());
        if (cwpVar != null) {
            jyaVar.b = cwpVar.a;
        }
        this.f = new cwp(jyaVar);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, 0);
        parcel.writeStringList(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeParcelable(this.f, 0);
    }
}
