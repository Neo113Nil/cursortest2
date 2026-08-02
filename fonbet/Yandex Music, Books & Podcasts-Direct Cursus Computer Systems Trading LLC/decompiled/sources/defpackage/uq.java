package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.data.audio.Album$AlbumType;
import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes4.dex */
public final class uq implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<uq> CREATOR = new l(9);
    private static final long serialVersionUID = 1;
    public final String a;
    public final String b;
    public final tq c;
    public final dud d;
    public final String e;
    public final String f;
    public final mqs g;
    public final boolean h;
    public final sq i;
    public final boolean j;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003f, code lost:
    
        if (r0 == null) goto L14;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uq(lt ltVar, String str) {
        this(r1, r2, r3, r0, str, null, null, false, rq.a, false);
        dud dudVar;
        ltVar.getClass();
        String str2 = ltVar.a;
        String str3 = ltVar.c;
        rre rreVar = tq.a;
        Album$AlbumType album$AlbumType = ltVar.b;
        rreVar.getClass();
        tq Q = rre.Q(album$AlbumType);
        u9b u9bVar = ltVar.e;
        int t = wct.t();
        if (u9bVar != null) {
            Integer d = u9bVar.d();
            if (d != null) {
                dudVar = new bud(d.intValue());
            } else {
                String str4 = (String) avf.R(u9bVar.e(t, WebPath$Storage.AVATARS));
                dudVar = str4 != null ? new aud(str4) : null;
            }
        }
        dudVar = cud.a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return Intrinsics.d(this.a, uqVar.a) && Intrinsics.d(this.b, uqVar.b) && this.c == uqVar.c && Intrinsics.d(this.d, uqVar.d) && Intrinsics.d(this.e, uqVar.e) && Intrinsics.d(this.f, uqVar.f) && Intrinsics.d(this.g, uqVar.g) && this.h == uqVar.h && Intrinsics.d(this.i, uqVar.i) && this.j == uqVar.j;
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        mqs mqsVar = this.g;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + k5r.e((hashCode3 + (mqsVar != null ? mqsVar.a.hashCode() : 0)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder m = f1d.m("AlbumActivityParams(albumId=", this.a, ", albumTitle=", this.b, ", type=");
        m.append(this.c);
        m.append(", headerAverageColorSource=");
        m.append(this.d);
        m.append(", oldFrom=");
        su4.v(m, this.e, ", promoDescription=", this.f, ", track=");
        m.append(this.g);
        m.append(", onlyTrack=");
        m.append(this.h);
        m.append(", screenMode=");
        m.append(this.i);
        m.append(", fromRecent=");
        m.append(this.j);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeParcelable(this.g, i);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeParcelable(this.i, i);
        parcel.writeInt(this.j ? 1 : 0);
    }

    public uq(String str, String str2, tq tqVar, dud dudVar, String str3, String str4, mqs mqsVar, boolean z, sq sqVar, boolean z2) {
        str.getClass();
        str2.getClass();
        tqVar.getClass();
        dudVar.getClass();
        sqVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = tqVar;
        this.d = dudVar;
        this.e = str3;
        this.f = str4;
        this.g = mqsVar;
        this.h = z;
        this.i = sqVar;
        this.j = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uq(oq oqVar, String str, String str2, mqs mqsVar, boolean z, sq sqVar) {
        this(r1, r2, rre.Q(oqVar.d()), new aud(ouj.t(oqVar.o)), str, str2, mqsVar, z, sqVar, false);
        oqVar.getClass();
        sqVar.getClass();
        String str3 = oqVar.a;
        String str4 = oqVar.b;
        tq.a.getClass();
    }

    public /* synthetic */ uq(oq oqVar, String str, mqs mqsVar, sq sqVar, int i) {
        this(oqVar, str, null, (i & 8) != 0 ? null : mqsVar, false, (i & 32) != 0 ? rq.a : sqVar);
    }
}
