package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g3c implements Parcelable {
    public final String a;
    public final c3c b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final Object i;
    public static final i9w j = new i9w();

    @NotNull
    public static final Parcelable.Creator<g3c> CREATOR = new vn7(28);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r2.contains(java.lang.Integer.valueOf(r3)) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g3c(int i, int i2, int i3, String str, String str2, String str3, String str4, Object obj, c3c c3cVar, boolean z) {
        Set set;
        Set set2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str3;
        this.h = str4;
        this.i = obj;
        this.a = str2;
        i9w i9wVar = j;
        int i4 = 2;
        if (c3cVar != null) {
            this.b = c3cVar;
        } else {
            this.b = new l3c(this, d());
            nsh F = i9wVar.F();
            Map map = (Map) F.c;
            Map map2 = (Map) F.d;
            Map map3 = (Map) F.b;
            if (!z) {
                if (map3 == null || !map3.containsKey(Integer.valueOf(i2)) || ((set2 = (Set) map3.get(Integer.valueOf(i2))) != null && !set2.contains(Integer.valueOf(i3)))) {
                    if (map2 != null && map2.containsKey(Integer.valueOf(i2)) && ((set = (Set) map2.get(Integer.valueOf(i2))) == null || set.contains(Integer.valueOf(i3)))) {
                        i4 = 1;
                    } else if (map != null) {
                        if (map.containsKey(Integer.valueOf(i2))) {
                            Set set3 = (Set) map.get(Integer.valueOf(i2));
                            if (set3 != null) {
                            }
                        }
                    }
                }
            }
            i4 = 3;
        }
        i9wVar.F();
        ouj.D(i4);
    }

    public final String d() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        c3c c3cVar = this.b;
        if (c3cVar != null) {
            return c3cVar.getLocalizedMessage();
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "{HttpStatus: " + this.c + ", errorCode: " + this.d + ", subErrorCode: " + this.e + ", errorType: " + this.f + ", errorMessage: " + d() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeString(d());
        parcel.writeString(this.g);
        parcel.writeString(this.h);
    }

    public g3c(Exception exc) {
        this(-1, -1, -1, null, null, null, null, null, exc instanceof c3c ? (c3c) exc : new c3c(exc), false);
    }

    public g3c(int i, String str, String str2) {
        this(-1, i, -1, str, str2, null, null, null, null, false);
    }
}
