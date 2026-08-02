package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.k;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.Serializable;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class cvl implements Parcelable, Serializable, nu1 {

    @NotNull
    public static final Parcelable.Creator<cvl> CREATOR = new tgk(18);
    private static final long serialVersionUID = 1;
    public Date A;
    public final int B;
    public final String a;
    public final String b;
    public final drt c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final byr l;
    public final long m;
    public final Date n;
    public final Date o;
    public final tn6 p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public final u4h u;
    public final boolean v;
    public final String w;
    public final boolean x;
    public final lf1 y;
    public final Integer z;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ cvl(java.lang.String r35, java.lang.String r36, defpackage.drt r37, int r38, int r39, boolean r40, int r41, int r42, int r43, long r44, long r46, defpackage.byr r48, long r49, java.util.Date r51, java.util.Date r52, defpackage.tn6 r53, java.lang.String r54, java.lang.String r55, int r56, java.lang.String r57, java.lang.String r58, defpackage.u4h r59, boolean r60, java.lang.String r61, boolean r62, defpackage.lf1 r63, java.lang.Integer r64, int r65) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvl.<init>(java.lang.String, java.lang.String, drt, int, int, boolean, int, int, int, long, long, byr, long, java.util.Date, java.util.Date, tn6, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, u4h, boolean, java.lang.String, boolean, lf1, java.lang.Integer, int):void");
    }

    public static cvl a(cvl cvlVar, String str, drt drtVar, int i, int i2, long j, byr byrVar, Date date, Date date2, tn6 tn6Var, String str2, String str3, String str4, String str5, String str6, Integer num, int i3) {
        String str7 = cvlVar.a;
        String str8 = (i3 & 2) != 0 ? cvlVar.b : str;
        drt drtVar2 = (i3 & 4) != 0 ? cvlVar.c : drtVar;
        int i4 = cvlVar.d;
        int i5 = (i3 & 16) != 0 ? cvlVar.e : i;
        boolean z = cvlVar.f;
        int i6 = (i3 & 64) != 0 ? cvlVar.g : i2;
        int i7 = cvlVar.h;
        String str9 = str8;
        drt drtVar3 = drtVar2;
        int i8 = i5;
        int i9 = i6;
        int i10 = cvlVar.i;
        long j2 = cvlVar.j;
        long j3 = (i3 & 1024) != 0 ? cvlVar.k : j;
        byr byrVar2 = (i3 & 2048) != 0 ? cvlVar.l : byrVar;
        long j4 = cvlVar.m;
        Date date3 = (i3 & RemoteCameraConfig.Notification.ID) != 0 ? cvlVar.n : date;
        Date date4 = (i3 & 16384) != 0 ? cvlVar.o : date2;
        tn6 tn6Var2 = (32768 & i3) != 0 ? cvlVar.p : tn6Var;
        String str10 = (65536 & i3) != 0 ? cvlVar.q : str2;
        String str11 = (131072 & i3) != 0 ? cvlVar.r : str3;
        int i11 = cvlVar.B;
        String str12 = (i3 & 524288) != 0 ? cvlVar.s : str4;
        String str13 = (i3 & 1048576) != 0 ? cvlVar.t : str5;
        u4h u4hVar = cvlVar.u;
        boolean z2 = cvlVar.v;
        String str14 = (i3 & 8388608) != 0 ? cvlVar.w : str6;
        boolean z3 = cvlVar.x;
        lf1 lf1Var = cvlVar.y;
        Integer num2 = (i3 & 67108864) != 0 ? cvlVar.z : num;
        cvlVar.getClass();
        str7.getClass();
        str9.getClass();
        drtVar3.getClass();
        byrVar2.getClass();
        str11.getClass();
        return new cvl(str7, str9, drtVar3, i4, i8, z, i9, i7, i10, j2, j3, byrVar2, j4, date3, date4, tn6Var2, str10, str11, i11, str12, str13, u4hVar, z2, str14, z3, lf1Var, num2);
    }

    @Override // defpackage.nu1
    public final ou1 W() {
        return ou1.c;
    }

    public final boolean d() {
        return "3".equals(this.a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return ouj.o(this.c.a, StringUtils.PROCESS_POSTFIX_DELIMITER, this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cvl.class.equals(obj.getClass())) {
            cvl cvlVar = (cvl) obj;
            if (Intrinsics.d(this.a, cvlVar.a) && Intrinsics.d(this.c, cvlVar.c) && Intrinsics.d(this.b, cvlVar.b) && Intrinsics.d(this.p, cvlVar.p)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        long j = this.k;
        return j == -1 ? e() : String.valueOf(j);
    }

    public final nvl g() {
        return new nvl(this.c.a, this.a);
    }

    public final boolean h() {
        String str = this.a;
        return str.length() > 0 && !c.v(str, "FAKE_ID_", false);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.c.a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder m = f1d.m("PlaylistHeader(kind=", this.a, ", title=", this.b, ", user=");
        m.append(this.c);
        m.append(", snapshot=");
        m.append(this.d);
        m.append(", revision=");
        m.append(this.e);
        m.append(", available=");
        m.append(this.f);
        m.append(", tracksCount=");
        hrg.w(this.g, this.h, ", likesCount=", ", cachedTracksCount=", m);
        m.append(this.i);
        m.append(", tracksDuration=");
        m.append(this.j);
        ouj.C(m, ", nativeId=", this.k, ", syncState=");
        m.append(this.l);
        m.append(", position=");
        m.append(this.m);
        m.append(", created=");
        m.append(this.n);
        m.append(", modified=");
        m.append(this.o);
        m.append(", coverInfo=");
        m.append(this.p);
        m.append(", description=");
        m.append(this.q);
        m.append(", visibility=");
        m.append(this.r);
        m.append(", autoPlaylistType=");
        switch (this.B) {
            case 1:
                str = "PLAYLIST_OF_THE_DAY";
                break;
            case 2:
                str = "DEJAVU";
                break;
            case 3:
                str = "PREMIERE";
                break;
            case 4:
                str = "MISSED_LIKES";
                break;
            case 5:
                str = "EDITORIAL";
                break;
            case 6:
                str = "UNKNOWN_TYPE";
                break;
            case 7:
                str = "REWIND_2024";
                break;
            default:
                str = "null";
                break;
        }
        m.append(str);
        su4.v(m, ", bgImageUrl=", this.s, ", bgVideoUrl=", this.t);
        m.append(", madeFor=");
        m.append(this.u);
        m.append(", childContent=");
        m.append(this.v);
        m.append(", uuid=");
        m.append(this.w);
        m.append(", hasTrailer=");
        m.append(this.x);
        m.append(", artistPlaylistType=");
        m.append(this.y);
        m.append(", personalColor=");
        m.append(this.z);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        this.c.writeToParcel(parcel, i);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeLong(this.j);
        parcel.writeLong(this.k);
        parcel.writeParcelable(this.l, i);
        parcel.writeLong(this.m);
        parcel.writeSerializable(this.n);
        parcel.writeSerializable(this.o);
        parcel.writeSerializable(this.p);
        parcel.writeString(this.q);
        parcel.writeString(this.r);
        int i2 = this.B;
        if (i2 == 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            switch (i2) {
                case 1:
                    str = "PLAYLIST_OF_THE_DAY";
                    break;
                case 2:
                    str = "DEJAVU";
                    break;
                case 3:
                    str = "PREMIERE";
                    break;
                case 4:
                    str = "MISSED_LIKES";
                    break;
                case 5:
                    str = "EDITORIAL";
                    break;
                case 6:
                    str = "UNKNOWN_TYPE";
                    break;
                case 7:
                    str = "REWIND_2024";
                    break;
                default:
                    throw null;
            }
            parcel.writeString(str);
        }
        parcel.writeString(this.s);
        parcel.writeString(this.t);
        u4h u4hVar = this.u;
        if (u4hVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            u4hVar.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeString(this.w);
        parcel.writeInt(this.x ? 1 : 0);
        lf1 lf1Var = this.y;
        if (lf1Var == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lf1Var.name());
        }
        Integer num = this.z;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            k.v(parcel, 1, num);
        }
    }

    public cvl(String str, String str2, drt drtVar, int i, int i2, boolean z, int i3, int i4, int i5, long j, long j2, byr byrVar, long j3, Date date, Date date2, tn6 tn6Var, String str3, String str4, int i6, String str5, String str6, u4h u4hVar, boolean z2, String str7, boolean z3, lf1 lf1Var, Integer num) {
        str.getClass();
        str2.getClass();
        drtVar.getClass();
        byrVar.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = drtVar;
        this.d = i;
        this.e = i2;
        this.f = z;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = j;
        this.k = j2;
        this.l = byrVar;
        this.m = j3;
        this.n = date;
        this.o = date2;
        this.p = tn6Var;
        this.q = str3;
        this.r = str4;
        this.B = i6;
        this.s = str5;
        this.t = str6;
        this.u = u4hVar;
        this.v = z2;
        this.w = str7;
        this.x = z3;
        this.y = lf1Var;
        this.z = num;
        this.A = new Date(0L);
    }
}
