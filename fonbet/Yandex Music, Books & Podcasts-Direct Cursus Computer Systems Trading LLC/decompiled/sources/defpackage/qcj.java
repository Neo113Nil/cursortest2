package defpackage;

import com.appsflyer.internal.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.audio.Album$AlbumType;

/* loaded from: classes3.dex */
public final class qcj implements rcj {
    public final String a;
    public final long b;
    public final String c;
    public final String d;
    public final Album$AlbumType e;
    public final jzb f;
    public final String g;
    public final List h;
    public final List i;
    public final ubb j;
    public final ArrayList k;
    public final ArrayList l;

    public qcj(String str, long j, String str2, String str3, Album$AlbumType album$AlbumType, jzb jzbVar, String str4, List list, List list2, ubb ubbVar, ArrayList arrayList, ArrayList arrayList2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        album$AlbumType.getClass();
        list2.getClass();
        this.a = str;
        this.b = j;
        this.c = str2;
        this.d = str3;
        this.e = album$AlbumType;
        this.f = jzbVar;
        this.g = str4;
        this.h = list;
        this.i = list2;
        this.j = ubbVar;
        this.k = arrayList;
        this.l = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcj)) {
            return false;
        }
        qcj qcjVar = (qcj) obj;
        return Intrinsics.d(this.a, qcjVar.a) && this.b == qcjVar.b && Intrinsics.d(this.c, qcjVar.c) && Intrinsics.d(this.d, qcjVar.d) && this.e == qcjVar.e && this.f == qcjVar.f && Intrinsics.d(this.g, qcjVar.g) && Intrinsics.d(this.h, qcjVar.h) && Intrinsics.d(this.i, qcjVar.i) && Intrinsics.d(this.j, qcjVar.j) && this.k.equals(qcjVar.k) && this.l.equals(qcjVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + k5r.c(k5r.c(tlm.c(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d)) * 31;
        jzb jzbVar = this.f;
        int hashCode2 = (hashCode + (jzbVar == null ? 0 : jzbVar.hashCode())) * 31;
        String str = this.g;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.h;
        int d = k5r.d((hashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.i);
        ubb ubbVar = this.j;
        return this.l.hashCode() + dfi.b(this.k, (d + (ubbVar != null ? ubbVar.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder q = k.q("Success(trackTitle=", this.b, this.a, ", trackDuration=");
        su4.v(q, ", albumCoverUrl=", this.c, ", albumTitle=", this.d);
        q.append(", albumType=");
        q.append(this.e);
        q.append(", explicitType=");
        q.append(this.f);
        q.append(", description=");
        q.append(this.g);
        q.append(", artists=");
        q.append(this.h);
        q.append(", disclaimers=");
        q.append(this.i);
        q.append(", buttons=");
        q.append(this.j);
        q.append(", primaryActions=");
        q.append(this.k);
        q.append(", secondaryActions=");
        q.append(this.l);
        q.append(")");
        return q.toString();
    }
}
