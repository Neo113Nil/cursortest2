package yads;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a291;
import defpackage.nba1;
import defpackage.qd81;
import defpackage.rf71;
import defpackage.w511;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public final class a11 implements bs1 {
    public static final Parcelable.Creator<a11> CREATOR = new z01();
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final int g;

    public a11(Parcel parcel) {
        this.b = parcel.readInt();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        int i = rf71.a;
        this.f = parcel.readInt() != 0;
        this.g = parcel.readInt();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a11 a(Map map) {
        boolean z;
        int i;
        List list;
        a11 a11Var;
        List list2;
        String str;
        List list3;
        String str2;
        List list4;
        boolean z2;
        List list5;
        int i2;
        int parseInt;
        int i3;
        List list6 = (List) map.get("icy-br");
        boolean z3 = true;
        int i4 = -1;
        if (list6 != null) {
            try {
                i3 = Integer.parseInt((String) list6.get(0)) * 1000;
            } catch (NumberFormatException unused) {
                i3 = -1;
            }
            if (i3 > 0) {
                i = i3;
                z = true;
                list = (List) map.get("icy-genre");
                String str3 = null;
                if (list != null) {
                    String str4 = (String) list.get(0);
                    a11Var = null;
                    str3 = str4;
                    z = true;
                } else {
                    a11Var = null;
                }
                list2 = (List) map.get("icy-name");
                if (list2 != null) {
                    str = (String) list2.get(0);
                    z = true;
                } else {
                    str = a11Var;
                }
                list3 = (List) map.get("icy-url");
                if (list3 != null) {
                    str2 = (String) list3.get(0);
                    z = true;
                } else {
                    str2 = a11Var;
                }
                list4 = (List) map.get("icy-pub");
                if (list4 != null) {
                    z2 = ((String) list4.get(0)).equals("1");
                    z = true;
                } else {
                    z2 = false;
                }
                list5 = (List) map.get("icy-metaint");
                if (list5 != null) {
                    try {
                        parseInt = Integer.parseInt((String) list5.get(0));
                    } catch (NumberFormatException unused2) {
                    }
                    if (parseInt > 0) {
                        i2 = parseInt;
                        if (z3) {
                            a11Var = new a11(i, str3, str, str2, z2, i2);
                        }
                        return a11Var;
                    }
                    try {
                        nba1.e();
                    } catch (NumberFormatException unused3) {
                        i4 = parseInt;
                        nba1.e();
                        z3 = z;
                        i2 = i4;
                        if (z3) {
                        }
                        return a11Var;
                    }
                }
                z3 = z;
                i2 = i4;
                if (z3) {
                }
                return a11Var;
            }
            try {
                nba1.e();
            } catch (NumberFormatException unused4) {
                nba1.e();
                i = i3;
                z = false;
                list = (List) map.get("icy-genre");
                String str32 = null;
                if (list != null) {
                }
                list2 = (List) map.get("icy-name");
                if (list2 != null) {
                }
                list3 = (List) map.get("icy-url");
                if (list3 != null) {
                }
                list4 = (List) map.get("icy-pub");
                if (list4 != null) {
                }
                list5 = (List) map.get("icy-metaint");
                if (list5 != null) {
                }
                z3 = z;
                i2 = i4;
                if (z3) {
                }
                return a11Var;
            }
        }
        z = false;
        i = -1;
        list = (List) map.get("icy-genre");
        String str322 = null;
        if (list != null) {
        }
        list2 = (List) map.get("icy-name");
        if (list2 != null) {
        }
        list3 = (List) map.get("icy-url");
        if (list3 != null) {
        }
        list4 = (List) map.get("icy-pub");
        if (list4 != null) {
        }
        list5 = (List) map.get("icy-metaint");
        if (list5 != null) {
        }
        z3 = z;
        i2 = i4;
        if (z3) {
        }
        return a11Var;
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ byte[] b() {
        return super.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a11.class == obj.getClass()) {
            a11 a11Var = (a11) obj;
            if (this.b == a11Var.b && rf71.o(this.c, a11Var.c) && rf71.o(this.d, a11Var.d) && rf71.o(this.e, a11Var.e) && this.f == a11Var.f && this.g == a11Var.g) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.b + 527) * 31;
        String str = this.c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f ? 1 : 0)) * 31) + this.g;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.d + "\", genre=\"" + this.c + "\", bitrate=" + this.b + ", metadataInterval=" + this.g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        boolean z = this.f;
        int i2 = rf71.a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.g);
    }

    public a11(int i, String str, String str2, String str3, boolean z, int i2) {
        if (i2 != -1 && i2 <= 0) {
            w511.q();
            throw null;
        }
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = i2;
    }

    @Override // yads.bs1
    public /* bridge */ /* synthetic */ qd81 a() {
        return super.a();
    }

    @Override // yads.bs1
    public final void a(a291 a291Var) {
        String str = this.d;
        if (str != null) {
            a291Var.D = str;
        }
        String str2 = this.c;
        if (str2 != null) {
            a291Var.B = str2;
        }
    }
}
