package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class atg implements Parcelable {
    public static final Parcelable.Creator<atg> CREATOR = new pnf(6);
    public final int a;
    public Set b;
    public final int c;
    public final String d;
    public final String e;
    public boolean f;
    public final String g;
    public final String h;
    public final String i;
    public String j;
    public boolean k;
    public final int l;
    public boolean m;
    public boolean n;
    public final String o;

    public atg(Parcel parcel) {
        int i;
        int i2;
        int i3;
        this.f = false;
        this.m = false;
        this.n = false;
        String readString = parcel.readString();
        if (readString != null) {
            if (readString == null) {
                jj4.j("Name is null");
            } else if (readString.equals("NATIVE_WITH_FALLBACK")) {
                i = 1;
            } else if (readString.equals("NATIVE_ONLY")) {
                i = 2;
            } else if (readString.equals("KATANA_ONLY")) {
                i = 3;
            } else if (readString.equals("WEB_ONLY")) {
                i = 4;
            } else if (readString.equals("WEB_VIEW_ONLY")) {
                i = 5;
            } else if (readString.equals("DIALOG_ONLY")) {
                i = 6;
            } else if (readString.equals("DEVICE_AUTH")) {
                i = 7;
            } else {
                xq0.x("No enum constant com.facebook.login.LoginBehavior.".concat(readString));
            }
            i = 0;
        } else {
            i = 0;
        }
        this.a = i;
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.b = new HashSet(arrayList);
        String readString2 = parcel.readString();
        if (readString2 != null) {
            if (readString2 == null) {
                jj4.j("Name is null");
            } else if (readString2.equals("NONE")) {
                i2 = 1;
            } else if (readString2.equals("ONLY_ME")) {
                i2 = 2;
            } else if (readString2.equals("FRIENDS")) {
                i2 = 3;
            } else if (readString2.equals("EVERYONE")) {
                i2 = 4;
            } else {
                xq0.x("No enum constant com.facebook.login.DefaultAudience.".concat(readString2));
            }
            i2 = 0;
        } else {
            i2 = 0;
        }
        this.c = i2;
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readByte() != 0;
        this.g = parcel.readString();
        this.h = parcel.readString();
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readByte() != 0;
        String readString3 = parcel.readString();
        if (readString3 != null) {
            if (readString3 == null) {
                jj4.j("Name is null");
            } else if (readString3.equals("FACEBOOK")) {
                i3 = 1;
            } else if (readString3.equals("INSTAGRAM")) {
                i3 = 2;
            } else {
                xq0.x("No enum constant com.facebook.login.LoginTargetApp.".concat(readString3));
            }
            i3 = 0;
        } else {
            i3 = 0;
        }
        this.l = i3;
        this.m = parcel.readByte() != 0;
        this.n = parcel.readByte() != 0;
        this.o = parcel.readString();
    }

    public final boolean d() {
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            if (xtg.b((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = null;
        int i2 = this.a;
        parcel.writeString(i2 != 0 ? hrg.C(i2) : null);
        parcel.writeStringList(new ArrayList(this.b));
        int i3 = this.c;
        parcel.writeString(i3 != 0 ? su4.y(i3) : null);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        int i4 = this.l;
        if (i4 != 0) {
            if (i4 == 1) {
                str = "FACEBOOK";
            } else {
                if (i4 != 2) {
                    throw null;
                }
                str = "INSTAGRAM";
            }
        }
        parcel.writeString(str);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeString(this.o);
    }

    public atg(Set set, String str, String str2, String str3) {
        this.f = false;
        this.m = false;
        this.n = false;
        this.a = 1;
        this.b = set == null ? new HashSet() : set;
        this.c = 3;
        this.h = "rerequest";
        this.d = str;
        this.e = str2;
        this.l = 1;
        this.o = str3;
    }
}
