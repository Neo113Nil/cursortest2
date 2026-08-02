package defpackage;

import com.yandex.music.shared.dto.artist.ArtistTracksPageDto;
import com.yandex.music.shared.dto.track.TrackDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ab1 {
    public final go1 a;
    public final fi1 b;
    public final z66 c;
    public volatile String d;
    public volatile ArrayList e;
    public volatile dnk f;
    public final qqi g = rqi.a();

    public ab1(go1 go1Var, fi1 fi1Var, z66 z66Var) {
        this.a = go1Var;
        this.b = fi1Var;
        this.c = z66Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r10.a(r0) == r1) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x00b2, B:15:0x00b6, B:16:0x00ba), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v4, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z, cg6 cg6Var) {
        xa1 xa1Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Object V;
        String str2;
        try {
            if (cg6Var instanceof xa1) {
                xa1Var = (xa1) cg6Var;
                int i3 = xa1Var.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    xa1Var.p = i3 - Integer.MIN_VALUE;
                    Object obj = xa1Var.n;
                    nm6Var = nm6.a;
                    i = xa1Var.p;
                    Continuation continuation = null;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (!z && Intrinsics.d(this.d, str) && this.f != null) {
                            return this.f;
                        }
                        qqiVar = this.g;
                        xa1Var.j = str;
                        xa1Var.k = qqiVar;
                        xa1Var.l = z;
                        i2 = 0;
                        xa1Var.m = 0;
                        xa1Var.p = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = xa1Var.k;
                            str2 = xa1Var.j;
                            try {
                                qgg.h0(obj);
                                na1 na1Var = (na1) obj;
                                dnk dnkVar = na1Var == null ? na1Var.c : null;
                                this.d = str2;
                                this.f = dnkVar;
                                this.e = null;
                                oqiVar.b(null);
                                return dnkVar;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = xa1Var.m;
                        z = xa1Var.l;
                        ?? r2 = xa1Var.k;
                        String str3 = xa1Var.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        str = str3;
                    }
                    if (!z) {
                        try {
                            if (Intrinsics.d(this.d, str) && this.f != null) {
                                dnk dnkVar2 = this.f;
                                qqiVar.b(null);
                                return dnkVar2;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar = qqiVar;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    fi1 fi1Var = this.b;
                    xa1Var.j = str;
                    xa1Var.k = qqiVar;
                    xa1Var.l = z;
                    xa1Var.m = i2;
                    xa1Var.p = 2;
                    hh1 hh1Var = (hh1) fi1Var.a.getValue();
                    hh1Var.getClass();
                    V = x97.V(dm6.a, new fh1(continuation, hh1Var, str, 0), xa1Var);
                    if (V != nm6Var) {
                        str2 = str;
                        oqiVar = qqiVar;
                        obj = V;
                        na1 na1Var2 = (na1) obj;
                        if (na1Var2 == null) {
                        }
                        this.d = str2;
                        this.f = dnkVar;
                        this.e = null;
                        oqiVar.b(null);
                        return dnkVar;
                    }
                    return nm6Var;
                }
            }
            hh1 hh1Var2 = (hh1) fi1Var.a.getValue();
            hh1Var2.getClass();
            V = x97.V(dm6.a, new fh1(continuation, hh1Var2, str, 0), xa1Var);
            if (V != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            th = th3;
            oqiVar = qqiVar;
            oqiVar.b(null);
            throw th;
        }
        xa1Var = new xa1(this, cg6Var);
        Object obj2 = xa1Var.n;
        nm6Var = nm6.a;
        i = xa1Var.p;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!z) {
        }
        fi1 fi1Var2 = this.b;
        xa1Var.j = str;
        xa1Var.k = qqiVar;
        xa1Var.l = z;
        xa1Var.m = i2;
        xa1Var.p = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0068, code lost:
    
        if (r9.a(r0) == r1) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bb A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x009a, B:15:0x00a4, B:17:0x00aa, B:18:0x00b5, B:20:0x00bb, B:22:0x00c3, B:25:0x00cb, B:31:0x00cf, B:35:0x00d9), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9 A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:12:0x002b, B:13:0x009a, B:15:0x00a4, B:17:0x00aa, B:18:0x00b5, B:20:0x00bb, B:22:0x00c3, B:25:0x00cb, B:31:0x00cf, B:35:0x00d9), top: B:11:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r2v10, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        ya1 ya1Var;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        Object b;
        String str2;
        ArtistTracksPageDto artistTracksPageDto;
        ArrayList arrayList;
        List<TrackDto> tracks;
        try {
            if (cg6Var instanceof ya1) {
                ya1Var = (ya1) cg6Var;
                int i3 = ya1Var.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    ya1Var.o = i3 - Integer.MIN_VALUE;
                    Object obj = ya1Var.m;
                    nm6Var = nm6.a;
                    i = ya1Var.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (Intrinsics.d(this.d, str) && this.e != null) {
                            return this.e;
                        }
                        qqiVar = this.g;
                        ya1Var.j = str;
                        ya1Var.k = qqiVar;
                        i2 = 0;
                        ya1Var.l = 0;
                        ya1Var.o = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = ya1Var.k;
                            str2 = ya1Var.j;
                            try {
                                qgg.h0(obj);
                                artistTracksPageDto = (ArtistTracksPageDto) jf0.F((rj6) obj);
                                if (artistTracksPageDto != null && (tracks = artistTracksPageDto.getTracks()) != null) {
                                    arrayList = new ArrayList();
                                    for (TrackDto trackDto : tracks) {
                                        mqs a = trackDto != null ? wts.a(trackDto) : null;
                                        if (a != null) {
                                            arrayList.add(a);
                                        }
                                    }
                                    if (!arrayList.isEmpty()) {
                                        arrayList = null;
                                    }
                                    if (arrayList != null) {
                                        this.d = str2;
                                        this.e = arrayList;
                                        this.f = null;
                                        oqiVar.b(null);
                                        return arrayList;
                                    }
                                }
                                arrayList = null;
                                oqiVar.b(null);
                                return arrayList;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = ya1Var.l;
                        ?? r2 = ya1Var.k;
                        String str3 = ya1Var.j;
                        qgg.h0(obj);
                        qqiVar = r2;
                        i2 = i4;
                        str = str3;
                    }
                    if (!Intrinsics.d(this.d, str) && this.e != null) {
                        ArrayList arrayList2 = this.e;
                        qqiVar.b(null);
                        return arrayList2;
                    }
                    go1 go1Var = this.a;
                    ya1Var.j = str;
                    ya1Var.k = qqiVar;
                    ya1Var.l = i2;
                    ya1Var.o = 2;
                    b = go1Var.b(str, 50, ya1Var);
                    if (b != nm6Var) {
                        str2 = str;
                        oqiVar = qqiVar;
                        obj = b;
                        artistTracksPageDto = (ArtistTracksPageDto) jf0.F((rj6) obj);
                        if (artistTracksPageDto != null) {
                            arrayList = new ArrayList();
                            while (r9.hasNext()) {
                            }
                            if (!arrayList.isEmpty()) {
                            }
                            if (arrayList != null) {
                            }
                        }
                        arrayList = null;
                        oqiVar.b(null);
                        return arrayList;
                    }
                    return nm6Var;
                }
            }
            if (!Intrinsics.d(this.d, str)) {
            }
            go1 go1Var2 = this.a;
            ya1Var.j = str;
            ya1Var.k = qqiVar;
            ya1Var.l = i2;
            ya1Var.o = 2;
            b = go1Var2.b(str, 50, ya1Var);
            if (b != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar2 = qqiVar;
            th = th3;
            oqiVar = qqiVar2;
            oqiVar.b(null);
            throw th;
        }
        ya1Var = new ya1(this, cg6Var);
        Object obj2 = ya1Var.m;
        nm6Var = nm6.a;
        i = ya1Var.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
    
        if (r7 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, cg6 cg6Var) {
        za1 za1Var;
        int i;
        dnk dnkVar;
        if (cg6Var instanceof za1) {
            za1Var = (za1) cg6Var;
            int i2 = za1Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                za1Var.l = i2 - Integer.MIN_VALUE;
                Object obj = za1Var.j;
                Object obj2 = nm6.a;
                i = za1Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (this.c.g()) {
                        za1Var.l = 2;
                        Object b = b(str, za1Var);
                        if (b != obj2) {
                            return b;
                        }
                    } else {
                        za1Var.l = 1;
                        obj = a(str, false, za1Var);
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i == 2) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                dnkVar = (dnk) obj;
                if (dnkVar != null) {
                    return null;
                }
                ArrayList arrayList = dnkVar.c;
                if (arrayList.isEmpty()) {
                    return null;
                }
                return arrayList;
            }
        }
        za1Var = new za1(this, cg6Var);
        Object obj3 = za1Var.j;
        Object obj22 = nm6.a;
        i = za1Var.l;
        if (i != 0) {
        }
        dnkVar = (dnk) obj3;
        if (dnkVar != null) {
        }
    }
}
