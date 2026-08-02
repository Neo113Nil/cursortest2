package defpackage;

import com.yandex.music.shared.backend_utils.MusicBackendInvocationError;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import com.yandex.music.shared.lyrics.FilesApi;
import com.yandex.music.shared.lyrics.LyricsHttpApi;
import com.yandex.music.shared.lyrics.data.dto.LyricsDownloadInfoDto;
import com.yandex.music.shared.lyrics.data.dto.LyricsReportResultDto;
import com.yandex.music.shared.lyrics.data.dto.LyricsViewsBodyRequestDto;
import com.yandex.music.shared.lyrics.data.dto.TrackDescriptionDto;
import com.yandex.music.shared.network.api.converter.ConvertedResultContext$Companion$ConvertedResultContextException;
import com.yandex.music.shared.network.api.retrofit.IllegalRequestOnNetworkModeException;
import com.yandex.music.shared.network.api.retrofit.MusicBackendHttpException;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import retrofit2.Call;

/* loaded from: classes3.dex */
public final class n3h {
    public final e0j a;
    public final zzp b;
    public final jyr c;
    public final jyr d;
    public final jyr e;

    public n3h(e0j e0jVar, zzp zzpVar) {
        this.a = e0jVar;
        this.b = zzpVar;
        final int i = 0;
        this.c = btf.b(new Function0(this) { // from class: j3h
            public final /* synthetic */ n3h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (LyricsHttpApi) this.b.a.a.b(LyricsHttpApi.class);
                    case 1:
                        return (FilesApi) this.b.a.a.b(FilesApi.class);
                    default:
                        return (t1t) ((rci) this.b.a.c.getValue()).a(ern.a(t1t.class), t1t.m);
                }
            }
        });
        final int i2 = 1;
        this.d = btf.b(new Function0(this) { // from class: j3h
            public final /* synthetic */ n3h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (LyricsHttpApi) this.b.a.a.b(LyricsHttpApi.class);
                    case 1:
                        return (FilesApi) this.b.a.a.b(FilesApi.class);
                    default:
                        return (t1t) ((rci) this.b.a.c.getValue()).a(ern.a(t1t.class), t1t.m);
                }
            }
        });
        final int i3 = 2;
        this.e = btf.b(new Function0(this) { // from class: j3h
            public final /* synthetic */ n3h b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (LyricsHttpApi) this.b.a.a.b(LyricsHttpApi.class);
                    case 1:
                        return (FilesApi) this.b.a.a.b(FilesApi.class);
                    default:
                        return (t1t) ((rci) this.b.a.c.getValue()).a(ern.a(t1t.class), t1t.m);
                }
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197 A[Catch: ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, TryCatch #0 {ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, blocks: (B:13:0x003f, B:14:0x0191, B:16:0x0197, B:17:0x01fc, B:20:0x01a1, B:22:0x01a5, B:25:0x01ba, B:28:0x01c8, B:31:0x01da, B:33:0x01de, B:34:0x01f2, B:36:0x01f6, B:37:0x0215, B:38:0x021a, B:42:0x005f, B:44:0x00d2, B:46:0x00d8, B:48:0x00e4, B:49:0x0156, B:53:0x00eb, B:55:0x00f2, B:57:0x00f6, B:60:0x010d, B:63:0x011d, B:66:0x0134, B:68:0x0138, B:69:0x014c, B:71:0x0150, B:72:0x021b, B:73:0x0220, B:75:0x009d), top: B:8:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x01a1 A[Catch: ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, TryCatch #0 {ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, blocks: (B:13:0x003f, B:14:0x0191, B:16:0x0197, B:17:0x01fc, B:20:0x01a1, B:22:0x01a5, B:25:0x01ba, B:28:0x01c8, B:31:0x01da, B:33:0x01de, B:34:0x01f2, B:36:0x01f6, B:37:0x0215, B:38:0x021a, B:42:0x005f, B:44:0x00d2, B:46:0x00d8, B:48:0x00e4, B:49:0x0156, B:53:0x00eb, B:55:0x00f2, B:57:0x00f6, B:60:0x010d, B:63:0x011d, B:66:0x0134, B:68:0x0138, B:69:0x014c, B:71:0x0150, B:72:0x021b, B:73:0x0220, B:75:0x009d), top: B:8:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d8 A[Catch: ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, TryCatch #0 {ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, blocks: (B:13:0x003f, B:14:0x0191, B:16:0x0197, B:17:0x01fc, B:20:0x01a1, B:22:0x01a5, B:25:0x01ba, B:28:0x01c8, B:31:0x01da, B:33:0x01de, B:34:0x01f2, B:36:0x01f6, B:37:0x0215, B:38:0x021a, B:42:0x005f, B:44:0x00d2, B:46:0x00d8, B:48:0x00e4, B:49:0x0156, B:53:0x00eb, B:55:0x00f2, B:57:0x00f6, B:60:0x010d, B:63:0x011d, B:66:0x0134, B:68:0x0138, B:69:0x014c, B:71:0x0150, B:72:0x021b, B:73:0x0220, B:75:0x009d), top: B:8:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f2 A[Catch: ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, TryCatch #0 {ConvertedResultContext$Companion$ConvertedResultContextException -> 0x0044, blocks: (B:13:0x003f, B:14:0x0191, B:16:0x0197, B:17:0x01fc, B:20:0x01a1, B:22:0x01a5, B:25:0x01ba, B:28:0x01c8, B:31:0x01da, B:33:0x01de, B:34:0x01f2, B:36:0x01f6, B:37:0x0215, B:38:0x021a, B:42:0x005f, B:44:0x00d2, B:46:0x00d8, B:48:0x00e4, B:49:0x0156, B:53:0x00eb, B:55:0x00f2, B:57:0x00f6, B:60:0x010d, B:63:0x011d, B:66:0x0134, B:68:0x0138, B:69:0x014c, B:71:0x0150, B:72:0x021b, B:73:0x0220, B:75:0x009d), top: B:8:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, r2h r2hVar, Long l, cg6 cg6Var) {
        k3h k3hVar;
        int i;
        long b;
        sj6 sj6Var;
        int i2;
        String str2;
        int i3;
        tj6 tj6Var;
        bii biiVar;
        rj6 J;
        rj6 lj6Var;
        Object O;
        r2h r2hVar2;
        q2h q2hVar;
        String str3;
        bii biiVar2;
        rj6 J2;
        r2h r2hVar3 = r2hVar;
        try {
            if (cg6Var instanceof k3h) {
                k3hVar = (k3h) cg6Var;
                int i4 = k3hVar.u;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    k3hVar.u = i4 - Integer.MIN_VALUE;
                    k3h k3hVar2 = k3hVar;
                    Object obj = k3hVar2.s;
                    nm6 nm6Var = nm6.a;
                    i = k3hVar2.u;
                    if (i != 0) {
                        qgg.h0(obj);
                        b = this.b.b() / 1000;
                        pn3 pn3Var = pn3.d;
                        String a = ovn.C(str + b).f(ovn.C("p93jhgh689SBReK6ghtw62")).a();
                        tj6.a.getClass();
                        sj6Var = qee.e;
                        Call<MusicBackendResponse<LyricsDownloadInfoDto>> a2 = ((LyricsHttpApi) this.c.getValue()).a(str, r2hVar3.a, l, b, a);
                        k3hVar2.j = str;
                        k3hVar2.k = r2hVar3;
                        k3hVar2.l = sj6Var;
                        k3hVar2.m = null;
                        k3hVar2.n = sj6Var;
                        k3hVar2.p = b;
                        i2 = 0;
                        k3hVar2.q = 0;
                        k3hVar2.r = 0;
                        k3hVar2.u = 1;
                        obj = swf.N(a2, k3hVar2);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        str2 = str;
                        i3 = 0;
                        tj6Var = sj6Var;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            q2hVar = k3hVar2.o;
                            tj6Var = k3hVar2.m;
                            r2hVar2 = k3hVar2.k;
                            str3 = k3hVar2.j;
                            qgg.h0(obj);
                            biiVar2 = (bii) obj;
                            if (biiVar2 instanceof aii) {
                                J2 = new qj6(((aii) biiVar2).a);
                            } else if (biiVar2 instanceof xhi) {
                                int i5 = ((xhi) biiVar2).b;
                                String name = ((xhi) biiVar2).c.getName();
                                String str4 = name == null ? "" : name;
                                String message = ((xhi) biiVar2).c.getMessage();
                                J2 = new kj6(i5, ((xhi) biiVar2).c.getDetails(), str4, message == null ? "" : message, ((xhi) biiVar2).a);
                            } else if (biiVar2 instanceof yhi) {
                                J2 = new lj6(((yhi) biiVar2).b, ((yhi) biiVar2).c, ((yhi) biiVar2).a);
                            } else {
                                if (!(biiVar2 instanceof zhi)) {
                                    throw new x7j();
                                }
                                J2 = uwf.J((zhi) biiVar2);
                            }
                            tj6Var.getClass();
                            return new qj6(v5g.x(new g3h(str3, null, null), q2hVar, r2hVar2, (String) tj6.a(J2)));
                        }
                        int i6 = k3hVar2.r;
                        int i7 = k3hVar2.q;
                        long j = k3hVar2.p;
                        sj6 sj6Var2 = k3hVar2.n;
                        sj6 sj6Var3 = k3hVar2.l;
                        r2h r2hVar4 = k3hVar2.k;
                        str2 = k3hVar2.j;
                        qgg.h0(obj);
                        sj6Var = sj6Var2;
                        i2 = i6;
                        i3 = i7;
                        tj6Var = sj6Var3;
                        r2hVar3 = r2hVar4;
                        b = j;
                    }
                    biiVar = (bii) obj;
                    if (biiVar instanceof aii) {
                        if (biiVar instanceof xhi) {
                            int i8 = ((xhi) biiVar).b;
                            String name2 = ((xhi) biiVar).c.getName();
                            String str5 = name2 == null ? "" : name2;
                            String message2 = ((xhi) biiVar).c.getMessage();
                            J = new kj6(i8, ((xhi) biiVar).c.getDetails(), str5, message2 == null ? "" : message2, ((xhi) biiVar).a);
                        } else if (biiVar instanceof yhi) {
                            lj6Var = new lj6(((yhi) biiVar).b, ((yhi) biiVar).c, ((yhi) biiVar).a);
                            J = lj6Var;
                        } else {
                            if (!(biiVar instanceof zhi)) {
                                throw new x7j();
                            }
                            J = uwf.J((zhi) biiVar);
                        }
                        sj6Var.getClass();
                        q2h q2hVar2 = (q2h) tj6.a(J);
                        Call<String> a3 = ((FilesApi) this.d.getValue()).a(q2hVar2.c);
                        k3hVar2.j = str2;
                        k3hVar2.k = r2hVar3;
                        k3hVar2.l = null;
                        k3hVar2.m = tj6Var;
                        k3hVar2.n = null;
                        k3hVar2.o = q2hVar2;
                        k3hVar2.p = b;
                        k3hVar2.q = i3;
                        k3hVar2.r = i2;
                        k3hVar2.u = 2;
                        O = swf.O(a3, String.class, k3hVar2);
                        if (O != nm6Var) {
                        }
                        return nm6Var;
                    }
                    q2h R = v5g.R((LyricsDownloadInfoDto) ((aii) biiVar).a);
                    if (R != null) {
                        lj6Var = new qj6(R);
                        J = lj6Var;
                        sj6Var.getClass();
                        q2h q2hVar22 = (q2h) tj6.a(J);
                        Call<String> a32 = ((FilesApi) this.d.getValue()).a(q2hVar22.c);
                        k3hVar2.j = str2;
                        k3hVar2.k = r2hVar3;
                        k3hVar2.l = null;
                        k3hVar2.m = tj6Var;
                        k3hVar2.n = null;
                        k3hVar2.o = q2hVar22;
                        k3hVar2.p = b;
                        k3hVar2.q = i3;
                        k3hVar2.r = i2;
                        k3hVar2.u = 2;
                        O = swf.O(a32, String.class, k3hVar2);
                        if (O != nm6Var) {
                        }
                        return nm6Var;
                    }
                    J = new nj6(null);
                    sj6Var.getClass();
                    q2h q2hVar222 = (q2h) tj6.a(J);
                    Call<String> a322 = ((FilesApi) this.d.getValue()).a(q2hVar222.c);
                    k3hVar2.j = str2;
                    k3hVar2.k = r2hVar3;
                    k3hVar2.l = null;
                    k3hVar2.m = tj6Var;
                    k3hVar2.n = null;
                    k3hVar2.o = q2hVar222;
                    k3hVar2.p = b;
                    k3hVar2.q = i3;
                    k3hVar2.r = i2;
                    k3hVar2.u = 2;
                    O = swf.O(a322, String.class, k3hVar2);
                    if (O != nm6Var) {
                        r2hVar2 = r2hVar3;
                        q2hVar = q2hVar222;
                        obj = O;
                        str3 = str2;
                    }
                    return nm6Var;
                    biiVar2 = (bii) obj;
                    if (biiVar2 instanceof aii) {
                    }
                    tj6Var.getClass();
                    return new qj6(v5g.x(new g3h(str3, null, null), q2hVar, r2hVar2, (String) tj6.a(J2)));
                }
            }
            if (i != 0) {
            }
            biiVar = (bii) obj;
            if (biiVar instanceof aii) {
            }
            biiVar2 = (bii) obj;
            if (biiVar2 instanceof aii) {
            }
            tj6Var.getClass();
            return new qj6(v5g.x(new g3h(str3, null, null), q2hVar, r2hVar2, (String) tj6.a(J2)));
        } catch (ConvertedResultContext$Companion$ConvertedResultContextException e) {
            return e.a;
        }
        k3hVar = new k3h(this, cg6Var);
        k3h k3hVar22 = k3hVar;
        Object obj2 = k3hVar22.s;
        nm6 nm6Var2 = nm6.a;
        i = k3hVar22.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, cg6 cg6Var) {
        l3h l3hVar;
        int i;
        try {
            if (cg6Var instanceof l3h) {
                l3hVar = (l3h) cg6Var;
                int i2 = l3hVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l3hVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = l3hVar.j;
                    nm6 nm6Var = nm6.a;
                    i = l3hVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        t1t t1tVar = (t1t) this.e.getValue();
                        LyricsHttpApi lyricsHttpApi = (LyricsHttpApi) this.c.getValue();
                        l3hVar.l = 1;
                        obj = t1tVar.E(str, false, lyricsHttpApi, l3hVar);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            qgg.h0(obj);
                            bii biiVar = (bii) obj;
                            if (biiVar instanceof aii) {
                                TrackDescriptionDto trackDescriptionDto = (TrackDescriptionDto) ((aii) biiVar).a;
                                trackDescriptionDto.getClass();
                                return new qj6(new tus(trackDescriptionDto.getDescription()));
                            }
                            if (biiVar instanceof xhi) {
                                xhi xhiVar = (xhi) biiVar;
                                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                                int i3 = xhiVar.b;
                                String name = musicBackendInvocationError.getName();
                                String str2 = name == null ? "" : name;
                                String message = musicBackendInvocationError.getMessage();
                                return new kj6(i3, musicBackendInvocationError.getDetails(), str2, message == null ? "" : message, xhiVar.a);
                            }
                            if (biiVar instanceof yhi) {
                                yhi yhiVar = (yhi) biiVar;
                                return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                            }
                            if (biiVar instanceof zhi) {
                                return uwf.J((zhi) biiVar);
                            }
                            b6e.s();
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    TrackDescriptionDto trackDescriptionDto2 = (TrackDescriptionDto) obj;
                    trackDescriptionDto2.getClass();
                    return new qj6(new tus(trackDescriptionDto2.getDescription()));
                }
            }
            if (i != 0) {
            }
            TrackDescriptionDto trackDescriptionDto22 = (TrackDescriptionDto) obj;
            trackDescriptionDto22.getClass();
            return new qj6(new tus(trackDescriptionDto22.getDescription()));
        } catch (IllegalRequestOnNetworkModeException e) {
            return new oj6(e.a, e.b);
        } catch (MusicBackendHttpException e2) {
            MusicBackendInvocationError musicBackendInvocationError2 = e2.b;
            String name2 = musicBackendInvocationError2.getName();
            String str3 = name2 == null ? "" : name2;
            String message2 = musicBackendInvocationError2.getMessage();
            return new kj6(e2.a, musicBackendInvocationError2.getDetails(), str3, message2 == null ? "" : message2, e2.c);
        } catch (MusicCommonHttpException e3) {
            return new lj6(e3.a, e3.b, e3.c);
        } catch (IOException e4) {
            return new oj6(btf.b(new ur(13, e4)));
        }
        l3hVar = new l3h(this, cg6Var);
        Object obj2 = l3hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = l3hVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(i3h i3hVar, cg6 cg6Var) {
        m3h m3hVar;
        int i;
        bii biiVar;
        if (cg6Var instanceof m3h) {
            m3hVar = (m3h) cg6Var;
            int i2 = m3hVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3hVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m3hVar.j;
                nm6 nm6Var = nm6.a;
                i = m3hVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    LyricsHttpApi lyricsHttpApi = (LyricsHttpApi) this.c.getValue();
                    i3hVar.getClass();
                    h3h h3hVar = i3hVar.b;
                    g3h g3hVar = h3hVar.a;
                    f3h f3hVar = h3hVar.b;
                    Call<MusicBackendResponse<LyricsReportResultDto>> c = lyricsHttpApi.c(new LyricsViewsBodyRequestDto(t75.c(new LyricsViewsBodyRequestDto.LyricView(i3hVar.a, g3hVar.a, f3hVar.a, f3hVar.b, f3hVar.c, f3hVar.d.a, g3hVar.b, g3hVar.c, 0))));
                    m3hVar.l = 1;
                    obj = swf.N(c, m3hVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                biiVar = (bii) obj;
                if (!(biiVar instanceof aii)) {
                    return new qj6(Unit.a);
                }
                if (!(biiVar instanceof xhi)) {
                    if (biiVar instanceof yhi) {
                        yhi yhiVar = (yhi) biiVar;
                        return new lj6(yhiVar.b, yhiVar.c, yhiVar.a);
                    }
                    if (biiVar instanceof zhi) {
                        return uwf.J((zhi) biiVar);
                    }
                    b6e.s();
                    return null;
                }
                xhi xhiVar = (xhi) biiVar;
                MusicBackendInvocationError musicBackendInvocationError = xhiVar.c;
                int i3 = xhiVar.b;
                String name = musicBackendInvocationError.getName();
                if (name == null) {
                    name = "";
                }
                String message = musicBackendInvocationError.getMessage();
                if (message == null) {
                    message = "";
                }
                return new kj6(i3, musicBackendInvocationError.getDetails(), name, message, xhiVar.a);
            }
        }
        m3hVar = new m3h(this, cg6Var);
        Object obj2 = m3hVar.j;
        nm6 nm6Var2 = nm6.a;
        i = m3hVar.l;
        if (i != 0) {
        }
        biiVar = (bii) obj2;
        if (!(biiVar instanceof aii)) {
        }
    }
}
