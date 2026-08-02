package defpackage;

import android.os.Parcelable;
import com.yandex.music.remote.proto.a;
import com.yandex.music.remote.proto.b;
import com.yandex.music.remote.proto.c;
import com.yandex.music.remote.proto.e;
import com.yandex.music.remote.proto.f;
import com.yandex.music.remote.proto.g;
import com.yandex.music.shared.playback.api.commands.PauseCommand;
import com.yandex.music.shared.playback.api.commands.PlayCommand;
import com.yandex.music.shared.playback.api.commands.SeekToPositionCommand;
import com.yandex.music.shared.playback.core.api.commands.PlaybackCommand$QueueBound;
import com.yandex.music.shared.playback.utils.api.commands.PrevCommand;
import com.yandex.music.shared.playback.utils.api.commands.PreviousOrReplayCommand;
import com.yandex.music.shared.playback.utils.api.commands.SkipCommand;
import com.yandex.music.shared.relay.common.proto.d;
import com.yandex.music.shared.relay.common.proto.k;
import com.yandex.music.shared.relay.common.proto.l;
import com.yandex.music.shared.relay.common.proto.m;
import com.yandex.music.shared.relay.common.proto.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class mye {
    public final oq7 a;
    public final k1l b;
    public final qec c;
    public final kbn d;
    public final lwr e;

    public mye(oq7 oq7Var, k1l k1lVar, qec qecVar, kbn kbnVar, lwr lwrVar) {
        oq7Var.getClass();
        k1lVar.getClass();
        kbnVar.getClass();
        lwrVar.getClass();
        this.a = oq7Var;
        this.b = k1lVar;
        this.c = qecVar;
        this.d = kbnVar;
        this.e = lwrVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r1v79, types: [k1l] */
    /* JADX WARN: Type inference failed for: r7v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v10, types: [dyk] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(d dVar, cg6 cg6Var) {
        lye lyeVar;
        int i;
        ?? r7;
        int i2;
        fvn fvnVar;
        pkb pkbVar;
        String str;
        String e;
        boolean z;
        f fVar;
        a4g evnVar;
        a4g dvnVar;
        a4g a4gVar;
        int i3;
        PlaybackCommand$QueueBound playbackCommand$QueueBound;
        if (cg6Var instanceof lye) {
            lyeVar = (lye) cg6Var;
            int i4 = lyeVar.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                lyeVar.l = i4 - Integer.MIN_VALUE;
                Object obj = lyeVar.j;
                nm6 nm6Var = nm6.a;
                i = lyeVar.l;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                r7 = 0;
                if (i != 0) {
                    qgg.h0(obj);
                    oq7 oq7Var = this.a;
                    g4l g4lVar = oq7Var.b;
                    f7l f7lVar = oq7Var.a;
                    g4q g4qVar = (g4q) g4lVar.c.getValue();
                    int i5 = 2;
                    switch (dVar.a) {
                        case 0:
                            i2 = 11;
                            break;
                        case 1:
                            i2 = 1;
                            break;
                        case 2:
                            i2 = 2;
                            break;
                        case 3:
                            i2 = 3;
                            break;
                        case 4:
                            i2 = 4;
                            break;
                        case 5:
                            i2 = 5;
                            break;
                        case 6:
                            i2 = 6;
                            break;
                        case 7:
                            i2 = 7;
                            break;
                        case 8:
                            i2 = 8;
                            break;
                        case 9:
                            i2 = 9;
                            break;
                        case 10:
                            i2 = 10;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    switch (i2 == 0 ? -1 : kye.a[ouj.D(i2)]) {
                        case -1:
                            ssg.a(3, "Relay:Service", "command not set", null);
                            throw new tgr(sgr.m.i("Unknown command"), null);
                        case 0:
                        default:
                            b6e.s();
                            return null;
                        case 1:
                            g gVar = dVar.a == 8 ? (g) dVar.b : g.i;
                            gVar.getClass();
                            Boolean valueOf = (gVar.a & 1) != 0 ? Boolean.valueOf(gVar.b) : null;
                            if (valueOf != null) {
                                boolean booleanValue = valueOf.booleanValue();
                                int i6 = gVar.a;
                                String str2 = (i6 & 2) != 0 ? gVar.c : null;
                                if (str2 == null) {
                                    ssg.a(3, "RemotePlaybackRequest", "Missing required field 'from' in protobuf", null);
                                } else {
                                    if ((i6 & 32) != 0) {
                                        fVar = gVar.g;
                                        if (fVar == null) {
                                            fVar = f.c;
                                        }
                                    } else {
                                        fVar = null;
                                    }
                                    if (fVar == null) {
                                        ssg.a(3, "RemotePlaybackRequest", "Missing required field 'content' in protobuf", null);
                                    } else {
                                        int i7 = fVar.a;
                                        int i8 = i7 != 0 ? i7 != 1 ? i7 != 2 ? i7 != 3 ? i7 != 4 ? i7 != 5 ? 0 : 5 : 4 : 3 : 2 : 1 : 6;
                                        switch (i8 != 0 ? gvn.a[ouj.D(i8)] : -1) {
                                            case 1:
                                                e eVar = fVar.a == 1 ? (e) fVar.b : e.b;
                                                eVar.getClass();
                                                rse rseVar = eVar.a;
                                                rseVar.getClass();
                                                evnVar = new evn(o8g.E(rseVar));
                                                a4gVar = evnVar;
                                                Integer valueOf2 = (gVar.a & 4) != 0 ? Integer.valueOf(gVar.d) : null;
                                                Boolean valueOf3 = (gVar.a & 8) != 0 ? Boolean.valueOf(gVar.e) : null;
                                                if ((gVar.a & 16) != 0) {
                                                    int i9 = gVar.f;
                                                    i3 = i9 != 0 ? i9 != 1 ? i9 != 2 ? i9 != 3 ? 0 : 4 : 3 : 2 : 1;
                                                    if (i3 != 0) {
                                                        r15 = i3;
                                                    }
                                                } else {
                                                    r15 = 0;
                                                }
                                                fvnVar = new fvn(booleanValue, str2, valueOf2, valueOf3, r15 != 0 ? ezf.X(r15) : null, a4gVar, (gVar.a & 64) != 0 ? gVar.h : null);
                                                ssg.a(3, "Relay:Service", "handle RemotePlaybackRequest: " + fvnVar, null);
                                                if (fvnVar != null) {
                                                    String str3 = fvnVar.b;
                                                    a4g a4gVar2 = fvnVar.f;
                                                    kxi kxiVar = new kxi(new uqi(gfo.Deeplink), null);
                                                    boolean z2 = a4gVar2 instanceof avn;
                                                    if (z2) {
                                                        pkbVar = pkb.Album;
                                                    } else if (a4gVar2 instanceof bvn) {
                                                        pkbVar = pkb.Artist;
                                                    } else if (a4gVar2 instanceof cvn) {
                                                        pkbVar = pkb.Playlist;
                                                    } else if (a4gVar2 instanceof evn) {
                                                        pkbVar = pkb.Wave;
                                                    } else {
                                                        if (!(a4gVar2 instanceof dvn)) {
                                                            b6e.s();
                                                            return null;
                                                        }
                                                        pkbVar = pkb.Track;
                                                    }
                                                    pkb pkbVar2 = pkbVar;
                                                    if (!z2) {
                                                        if (!(a4gVar2 instanceof bvn)) {
                                                            if (!(a4gVar2 instanceof cvn)) {
                                                                if (!(a4gVar2 instanceof evn)) {
                                                                    if (!(a4gVar2 instanceof dvn)) {
                                                                        b6e.s();
                                                                        return null;
                                                                    }
                                                                    rr5 rr5Var = (rr5) CollectionsKt.firstOrNull(((dvn) a4gVar2).a);
                                                                    if (rr5Var == null || (e = rr5Var.e()) == null) {
                                                                        str = "";
                                                                        w5l w5lVar = new w5l(new cvo(wjb.Link, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.Deeplink, 1, 1, 0), new thj(pkbVar2, str, 1, 1, ""), null);
                                                                        z = a4gVar2 instanceof evn;
                                                                        qec qecVar = this.c;
                                                                        if (z) {
                                                                            if (!(a4gVar2 instanceof dvn)) {
                                                                                if (!z2) {
                                                                                    if (!(a4gVar2 instanceof bvn)) {
                                                                                        if (!(a4gVar2 instanceof cvn)) {
                                                                                            b6e.s();
                                                                                            return null;
                                                                                        }
                                                                                        g0l.m((g0l) qecVar.b, ((cvn) a4gVar2).a.d(), qec.Y(fvnVar), kxiVar, w5lVar, str3, qec.V(fvnVar), fvnVar.e, fvnVar.d, fvnVar.g, 1024);
                                                                                        break;
                                                                                    } else {
                                                                                        g0l.h((g0l) qecVar.b, ((bvn) a4gVar2).a, qec.Y(fvnVar), kxiVar, w5lVar, str3, qec.V(fvnVar), fvnVar.e, fvnVar.d, fvnVar.g, 1024);
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    g0l.g((g0l) qecVar.b, ((avn) a4gVar2).a, qec.Y(fvnVar), kxiVar, w5lVar, str3, qec.V(fvnVar), fvnVar.e, fvnVar.d, fvnVar.g, null, 1024);
                                                                                    break;
                                                                                }
                                                                            } else {
                                                                                ArrayList arrayList = ((dvn) a4gVar2).a;
                                                                                ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                                                                                Iterator it = arrayList.iterator();
                                                                                while (it.hasNext()) {
                                                                                    arrayList2.add(((rr5) it.next()).e());
                                                                                }
                                                                                g0l g0lVar = (g0l) qecVar.b;
                                                                                kcr Y = qec.Y(fvnVar);
                                                                                m3q m3qVar = new m3q(new cd5(arrayList2), ryt.a);
                                                                                Boolean bool = fvnVar.d;
                                                                                nyn nynVar = fvnVar.e;
                                                                                v3g V = qec.V(fvnVar);
                                                                                String str4 = fvnVar.g;
                                                                                e0l e0lVar = new e0l(0);
                                                                                g0lVar.getClass();
                                                                                if (str4 == null) {
                                                                                    str4 = weo.t();
                                                                                }
                                                                                a6l a = kxiVar.a(str4);
                                                                                g0l.j(g0lVar, new f0l(str3, a, Y, bool, m3qVar, arrayList2, null), V, nynVar, bool, a, w5lVar, str3, e0lVar);
                                                                                break;
                                                                            }
                                                                        } else {
                                                                            g0l.s((g0l) qecVar.b, ((evn) a4gVar2).a, kxiVar, w5lVar, new qfn(str3), qec.V(fvnVar), null, fvnVar.g, null, 336);
                                                                            break;
                                                                        }
                                                                    }
                                                                } else {
                                                                    e = o8g.Q(((evn) a4gVar2).a.a());
                                                                }
                                                            } else {
                                                                e = ((cvn) a4gVar2).a.d();
                                                            }
                                                        } else {
                                                            e = ((bvn) a4gVar2).a;
                                                        }
                                                    } else {
                                                        e = ((avn) a4gVar2).a;
                                                    }
                                                    str = e;
                                                    w5l w5lVar2 = new w5l(new cvo(wjb.Link, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.Deeplink, 1, 1, 0), new thj(pkbVar2, str, 1, 1, ""), null);
                                                    z = a4gVar2 instanceof evn;
                                                    qec qecVar2 = this.c;
                                                    if (z) {
                                                    }
                                                }
                                                break;
                                            case 2:
                                                com.yandex.music.remote.proto.d dVar2 = fVar.a == 2 ? (com.yandex.music.remote.proto.d) fVar.b : com.yandex.music.remote.proto.d.b;
                                                dVar2.getClass();
                                                rse<String> rseVar2 = dVar2.a;
                                                rseVar2.getClass();
                                                ArrayList arrayList3 = new ArrayList();
                                                for (String str5 : rseVar2) {
                                                    str5.getClass();
                                                    rr5 t = q6k.t(str5);
                                                    if (t == null) {
                                                        ssg.a(3, "RemotePlaybackRequest", "Skipping invalid track ID: ".concat(str5), null);
                                                    }
                                                    if (t != null) {
                                                        arrayList3.add(t);
                                                    }
                                                }
                                                dvnVar = new dvn(arrayList3);
                                                a4gVar = dvnVar;
                                                if ((gVar.a & 4) != 0) {
                                                }
                                                if ((gVar.a & 8) != 0) {
                                                }
                                                if ((gVar.a & 16) != 0) {
                                                }
                                                fvnVar = new fvn(booleanValue, str2, valueOf2, valueOf3, r15 != 0 ? ezf.X(r15) : null, a4gVar, (gVar.a & 64) != 0 ? gVar.h : null);
                                                ssg.a(3, "Relay:Service", "handle RemotePlaybackRequest: " + fvnVar, null);
                                                if (fvnVar != null) {
                                                }
                                                break;
                                            case 3:
                                                a aVar = fVar.a == 3 ? (a) fVar.b : a.c;
                                                aVar.getClass();
                                                String str6 = (aVar.a & 1) != 0 ? aVar.b : null;
                                                if (str6 == null) {
                                                    ssg.a(3, "RemotePlaybackRequest", "Missing required field 'albumId' in protobuf", null);
                                                    break;
                                                } else {
                                                    evnVar = new avn(str6);
                                                    a4gVar = evnVar;
                                                    if ((gVar.a & 4) != 0) {
                                                    }
                                                    if ((gVar.a & 8) != 0) {
                                                    }
                                                    if ((gVar.a & 16) != 0) {
                                                    }
                                                    fvnVar = new fvn(booleanValue, str2, valueOf2, valueOf3, r15 != 0 ? ezf.X(r15) : null, a4gVar, (gVar.a & 64) != 0 ? gVar.h : null);
                                                    ssg.a(3, "Relay:Service", "handle RemotePlaybackRequest: " + fvnVar, null);
                                                    if (fvnVar != null) {
                                                    }
                                                }
                                                break;
                                            case 4:
                                                b bVar = fVar.a == 4 ? (b) fVar.b : b.c;
                                                bVar.getClass();
                                                String str7 = (bVar.a & 1) != 0 ? bVar.b : null;
                                                if (str7 == null) {
                                                    ssg.a(3, "RemotePlaybackRequest", "Missing required field 'artistId' in protobuf", null);
                                                    break;
                                                } else {
                                                    evnVar = new bvn(str7);
                                                    a4gVar = evnVar;
                                                    if ((gVar.a & 4) != 0) {
                                                    }
                                                    if ((gVar.a & 8) != 0) {
                                                    }
                                                    if ((gVar.a & 16) != 0) {
                                                    }
                                                    fvnVar = new fvn(booleanValue, str2, valueOf2, valueOf3, r15 != 0 ? ezf.X(r15) : null, a4gVar, (gVar.a & 64) != 0 ? gVar.h : null);
                                                    ssg.a(3, "Relay:Service", "handle RemotePlaybackRequest: " + fvnVar, null);
                                                    if (fvnVar != null) {
                                                    }
                                                }
                                                break;
                                            case 5:
                                                c cVar = fVar.a == 5 ? (c) fVar.b : c.c;
                                                cVar.getClass();
                                                String str8 = (cVar.a & 1) != 0 ? cVar.b : null;
                                                if (str8 == null) {
                                                    ssg.a(3, "RemotePlaybackRequest", "Missing required field 'playlistId' in protobuf", null);
                                                    break;
                                                } else {
                                                    Parcelable.Creator<nvl> creator = nvl.CREATOR;
                                                    nvl x = wxf.x(str8);
                                                    if (x == null) {
                                                        ssg.a(3, "RemotePlaybackRequest", "Invalid playlist ID: ".concat(str8), null);
                                                        break;
                                                    } else {
                                                        dvnVar = new cvn(x);
                                                        a4gVar = dvnVar;
                                                        if ((gVar.a & 4) != 0) {
                                                        }
                                                        if ((gVar.a & 8) != 0) {
                                                        }
                                                        if ((gVar.a & 16) != 0) {
                                                        }
                                                        fvnVar = new fvn(booleanValue, str2, valueOf2, valueOf3, r15 != 0 ? ezf.X(r15) : null, a4gVar, (gVar.a & 64) != 0 ? gVar.h : null);
                                                        ssg.a(3, "Relay:Service", "handle RemotePlaybackRequest: " + fvnVar, null);
                                                        if (fvnVar != null) {
                                                        }
                                                    }
                                                }
                                                break;
                                            case 6:
                                                ssg.a(3, "RemotePlaybackRequest", "Unknown content type in protobuf", null);
                                                break;
                                            default:
                                                b6e.s();
                                                return null;
                                        }
                                    }
                                }
                            } else {
                                ssg.a(3, "RemotePlaybackRequest", "Missing required field 'play' in protobuf", null);
                            }
                            fvnVar = null;
                            ssg.a(3, "Relay:Service", "handle RemotePlaybackRequest: " + fvnVar, null);
                            if (fvnVar != null) {
                            }
                            break;
                        case 2:
                            com.yandex.music.shared.relay.common.proto.b bVar2 = dVar.a == 1 ? (com.yandex.music.shared.relay.common.proto.b) dVar.b : com.yandex.music.shared.relay.common.proto.b.b;
                            bVar2.getClass();
                            boolean z3 = bVar2.a;
                            k5r.v("handle playing: ", z3, 3, "Relay:Service", null);
                            if (z3) {
                                playbackCommand$QueueBound = new PlayCommand(false);
                            } else {
                                if (z3) {
                                    b6e.s();
                                    return null;
                                }
                                playbackCommand$QueueBound = PauseCommand.INSTANCE;
                            }
                            r7 = playbackCommand$QueueBound;
                            break;
                        case 3:
                            k kVar = dVar.a == 2 ? (k) dVar.b : k.b;
                            kVar.getClass();
                            long j = kVar.a;
                            ssg.a(3, "Relay:Service", dfi.d(j, "handle seek: "), null);
                            r7 = new SeekToPositionCommand(j);
                            break;
                        case 4:
                            ssg.a(3, "Relay:Service", "handle skip", null);
                            r7 = new SkipCommand();
                            break;
                        case 5:
                            com.yandex.music.shared.relay.common.proto.e eVar2 = dVar.a == 4 ? (com.yandex.music.shared.relay.common.proto.e) dVar.b : com.yandex.music.shared.relay.common.proto.e.b;
                            eVar2.getClass();
                            boolean z4 = eVar2.a;
                            k5r.v("handle prev: force=", z4, 3, "Relay:Service", null);
                            playbackCommand$QueueBound = z4 ? PrevCommand.INSTANCE : PreviousOrReplayCommand.INSTANCE;
                            r7 = playbackCommand$QueueBound;
                            break;
                        case 6:
                            l lVar = dVar.a == 5 ? (l) dVar.b : l.b;
                            lVar.getClass();
                            int i10 = lVar.a;
                            v3w.k("handle position: ", i10, 3, "Relay:Service", null);
                            if (g4qVar != null) {
                                r7 = (dyk) zdg.p(g4qVar, new ynp(i10));
                                break;
                            }
                            break;
                        case 7:
                            m mVar = dVar.a == 6 ? (m) dVar.b : m.b;
                            mVar.getClass();
                            int i11 = mVar.a;
                            i3 = i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? 0 : 4 : 3 : 2 : 1;
                            nyn X = ezf.X(i3 != 0 ? i3 : 5);
                            ssg.a(3, "Relay:Service", "handle repeat: " + X, null);
                            if (g4qVar != null) {
                                r7 = (dyk) zdg.p(g4qVar, new zb4(X));
                                break;
                            }
                            break;
                        case 8:
                            n nVar = dVar.a == 7 ? (n) dVar.b : n.b;
                            nVar.getClass();
                            boolean z5 = nVar.a;
                            k5r.v("handle shuffle: ", z5, 3, "Relay:Service", null);
                            if (g4qVar != null) {
                                r7 = (dyk) zdg.p(g4qVar, new ac4(z5));
                                break;
                            }
                            break;
                        case 9:
                            ssg.a(3, "Relay:Service", "handle performSync", null);
                            this.e.getClass();
                            qxr.a();
                            break;
                        case 10:
                            ssg.a(3, "Relay:Service", "handle awaitQueue", null);
                            if (Intrinsics.d(f7lVar.c.getValue(), b6l.a)) {
                                ssg.a(3, "Relay:Service", "restore queue because idle", null);
                                this.d.d("RelayService.awaitQueue()", true);
                            }
                            xdr xdrVar = f7lVar.c;
                            xc xcVar = new xc(i5, 26, r7);
                            lyeVar.l = 1;
                            if (zsd.h0(xdrVar, xcVar, lyeVar) == nm6Var) {
                                return nm6Var;
                            }
                            break;
                        case 11:
                            ssg.a(3, "Relay:Service", "unknown command", null);
                            throw new tgr(sgr.h.i("Command not set"), null);
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                if (r7 != 0) {
                    this.b.a(r7, a3t.a);
                }
                return Unit.a;
            }
        }
        lyeVar = new lye(this, cg6Var);
        Object obj2 = lyeVar.j;
        nm6 nm6Var2 = nm6.a;
        i = lyeVar.l;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        r7 = 0;
        if (i != 0) {
        }
        if (r7 != 0) {
        }
        return Unit.a;
    }
}
