package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import com.yandex.pulse.metrics.o;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.music.R;
import ru.yandex.music.data.wave.recommendations.StationId;
import ru.yandex.music.main.MainScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class ceb extends ezc implements Function0 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ceb(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        oq oqVar;
        double elapsedRealtime;
        cr crVar;
        char c;
        int i = 9;
        int i2 = 1;
        int i3 = 0;
        Continuation continuation = null;
        switch (this.a) {
            case 0:
                heb hebVar = (heb) this.receiver;
                hebVar.a.a(hebVar.j, new o57(1, hebVar.b, leb.class, "onFilterItemClick", "onFilterItemClick(Lcom/yandex/music/design/components/bottomsheet/filterbottomsheet/FilterBottomSheetItem;)V", 0, 12));
                return Unit.a;
            case 1:
                ((p2b) ((kub) this.receiver).b.C.j).a();
                return Unit.a;
            case 2:
                kub kubVar = (kub) this.receiver;
                grl grlVar = kubVar.b;
                xdr xdrVar = grlVar.x;
                Object value = xdrVar.getValue();
                evo evoVar = evo.a;
                if (value == evoVar) {
                    nwh nwhVar = grlVar.C;
                    nwhVar.getClass();
                    nwhVar.r(xkb.TrackListScreen);
                }
                int ordinal = ((evo) xdrVar.getValue()).ordinal();
                if (ordinal == 0) {
                    evoVar = evo.b;
                } else if (ordinal != 1) {
                    b6e.s();
                    return null;
                }
                xdrVar.m(null, evoVar);
                xdr xdrVar2 = kubVar.m;
                Object value2 = xdrVar2.getValue();
                s3h s3hVar = value2 instanceof s3h ? (s3h) value2 : null;
                if (s3hVar != null) {
                    xdrVar2.m(null, s3h.a(s3hVar, a3h.b, false, 1));
                }
                return Unit.a;
            case 3:
                ((kub) this.receiver).e();
                return Unit.a;
            case 4:
                kub kubVar2 = (kub) this.receiver;
                grl grlVar2 = kubVar2.b;
                nwh nwhVar2 = grlVar2.C;
                nwhVar2.getClass();
                nwhVar2.r(xkb.TrackShareScreen);
                mwk G = grlVar2.G();
                if (G != null) {
                    a9l a9lVar = kubVar2.c;
                    a9lVar.getClass();
                    int i4 = 0;
                    wyf.q(G, new ime(new w4i(2, a9lVar, a9l.class, "shareTrack", "shareTrack(Lru/yandex/music/data/audio/Track;Lcom/yandex/music/shared/playback/api/playable/TrackPlayable$Source;)V", i4, 13), new aok(12), new kef(1, a9lVar, a9l.class, "shareVideoClip", "shareVideoClip(Lru/yandex/music/data/audio/VideoClip;)V", i4, 26)));
                }
                kubVar2.g();
                return Unit.a;
            case 5:
                kub kubVar3 = (kub) this.receiver;
                grl grlVar3 = kubVar3.b;
                nwh nwhVar3 = grlVar3.C;
                nwhVar3.getClass();
                nwhVar3.r(xkb.BottomsheetScreen);
                n7q J = grlVar3.J();
                if (J != null) {
                    kubVar3.c.d(J.b(), ((Number) wdg.A(J, imp.i)).intValue());
                }
                kubVar3.g();
                return Unit.a;
            case 6:
                kub kubVar4 = (kub) this.receiver;
                mqs a = kubVar4.a();
                if (a != null && (oqVar = a.t) != null && a.l()) {
                    a9l a9lVar2 = kubVar4.c;
                    a9lVar2.getClass();
                    a9lVar2.a().v(oqVar, a);
                    nwh nwhVar4 = kubVar4.b.C;
                    nwhVar4.getClass();
                    nwhVar4.r(xkb.AlbumScreen);
                }
                return Unit.a;
            case 7:
                kub kubVar5 = (kub) this.receiver;
                mqs a2 = kubVar5.a();
                if (a2 != null) {
                    a9l a9lVar3 = kubVar5.c;
                    String str = a2.c;
                    String string = kubVar5.a.getString(R.string.track_title_label);
                    string.getClass();
                    a9lVar3.c(str, string);
                    nwh nwhVar5 = kubVar5.b.C;
                    nwhVar5.getClass();
                    nwhVar5.c(olb.TitleCopied);
                }
                return Unit.a;
            case 8:
                ((kub) this.receiver).e();
                return Unit.a;
            case 9:
                kub kubVar6 = (kub) this.receiver;
                mqs a3 = kubVar6.a();
                if (a3 != null) {
                    a9l a9lVar4 = kubVar6.c;
                    String obj = fxf.W(a3).toString();
                    String string2 = kubVar6.a.getString(R.string.track_subtitle_label);
                    string2.getClass();
                    a9lVar4.c(obj, string2);
                    nwh nwhVar6 = kubVar6.b.C;
                    nwhVar6.getClass();
                    nwhVar6.c(olb.SubtitleCopied);
                }
                return Unit.a;
            case 10:
                kub kubVar7 = (kub) this.receiver;
                grl grlVar4 = kubVar7.b;
                grlVar4.getClass();
                x97.y(ot0.F(grlVar4), null, null, new frl(i2, grlVar4, continuation), 3);
                kubVar7.g();
                return Unit.a;
            case 11:
                kub kubVar8 = (kub) this.receiver;
                grl grlVar5 = kubVar8.b;
                grlVar5.getClass();
                x97.y(ot0.F(grlVar5), null, null, new frl(i3, grlVar5, continuation), 3);
                kubVar8.g();
                return Unit.a;
            case 12:
                kub kubVar9 = (kub) this.receiver;
                kubVar9.b.N();
                kubVar9.g();
                return Unit.a;
            case 13:
                kub kubVar10 = (kub) this.receiver;
                a9l a9lVar5 = kubVar10.c;
                g3a g3aVar = new g3a(i, kubVar10);
                a9lVar5.getClass();
                t tVar = a9lVar5.a;
                y supportFragmentManager = tVar.getSupportFragmentManager();
                supportFragmentManager.getClass();
                l18 l18Var = l18.b;
                bdt I = hag.I(a6n.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                new x3n(tVar, supportFragmentManager, (a6n) qdcVar.C(I)).M0(new y8l(g3aVar, a9lVar5));
                return Unit.a;
            case 14:
                kub kubVar11 = (kub) this.receiver;
                boolean booleanValue = ((Boolean) kubVar11.f.invoke()).booleanValue();
                a9l a9lVar6 = kubVar11.c;
                if (booleanValue) {
                    v7g.L(a9lVar6.a, new lik(vik.f, null, null));
                } else {
                    a9lVar6.getClass();
                    jyr jyrVar = ohs.a;
                    y supportFragmentManager2 = a9lVar6.a.getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    ohs.a(supportFragmentManager2);
                    kubVar11.g();
                    nwh nwhVar7 = kubVar11.b.C;
                    nwhVar7.getClass();
                    nwhVar7.c(olb.TimerWindow);
                }
                return Unit.a;
            case 15:
                ((kub) this.receiver).b();
                return Unit.a;
            case 16:
                ((kub) this.receiver).d();
                return Unit.a;
            case 17:
                ((kub) this.receiver).c();
                return Unit.a;
            case 18:
                ((kub) this.receiver).d();
                return Unit.a;
            case 19:
                ((kub) this.receiver).c();
                return Unit.a;
            case 20:
                t5c t5cVar = (t5c) this.receiver;
                rmb.j(t5cVar.b, wjb.MainScreen, null, null, 14);
                rdk rdkVar = t5cVar.a;
                lhs lhsVar = MainScreenActivity.Q0;
                Activity activity = (Activity) rdkVar.b;
                rf3 rf3Var = rf3.h;
                List d = StationId.d(StationId.f("user:onyourwave"), null);
                d.getClass();
                activity.startActivity(imp.J(activity, rf3Var, cxb.K(new Pair("landing.type.queue", new hi7(d, false))), null, 8));
                return Unit.a;
            case 21:
                g6c g6cVar = ((t5c) this.receiver).c;
                g6cVar.l = true;
                g6cVar.m();
                return Unit.a;
            case 22:
                g6c g6cVar2 = ((t5c) this.receiver).c;
                g6cVar2.l = false;
                g6cVar2.m();
                return Unit.a;
            case 23:
                v8c v8cVar = (v8c) this.receiver;
                qzc qzcVar = v8c.i;
                if (!qzc.c) {
                    v8cVar.getClass();
                    synchronized (((cuk) qzcVar.b)) {
                        if (v8cVar.d) {
                            if (v8cVar.c == 0 && v8cVar.b == 0.0d) {
                                v8cVar.d = false;
                                v8cVar.e = null;
                                bz2 bz2Var = v8cVar.h;
                                if (bz2Var != null) {
                                    bz2Var.L();
                                }
                            } else {
                                double d2 = v8cVar.b;
                                if (d2 != 0.0d) {
                                    v8cVar.b = 0.0d;
                                    elapsedRealtime = v8cVar.e != null ? SystemClock.elapsedRealtime() - r3.a : 0.0d;
                                    v8cVar.e = new ci0((ujl) v8cVar.a.b);
                                    cib cibVar = v8cVar.f;
                                    vk2 vk2Var = new vk2(elapsedRealtime, d2);
                                    Iterator it = ((LinkedHashSet) cibVar.b).iterator();
                                    while (it.hasNext()) {
                                        ((Function1) it.next()).invoke(vk2Var);
                                    }
                                }
                            }
                        }
                    }
                } else if (v8cVar.d) {
                    if (v8cVar.c == 0 && v8cVar.b == 0.0d) {
                        v8cVar.d = false;
                        v8cVar.e = null;
                        bz2 bz2Var2 = v8cVar.h;
                        if (bz2Var2 != null) {
                            bz2Var2.L();
                        }
                    } else {
                        double d3 = v8cVar.b;
                        if (d3 != 0.0d) {
                            v8cVar.b = 0.0d;
                            elapsedRealtime = v8cVar.e != null ? SystemClock.elapsedRealtime() - r6.a : 0.0d;
                            v8cVar.e = new ci0((ujl) v8cVar.a.b);
                            cib cibVar2 = v8cVar.f;
                            vk2 vk2Var2 = new vk2(elapsedRealtime, d3);
                            Iterator it2 = ((LinkedHashSet) cibVar2.b).iterator();
                            while (it2.hasNext()) {
                                ((Function1) it2.next()).invoke(vk2Var2);
                            }
                        }
                    }
                }
                return Unit.a;
            case 24:
                ((sai) this.receiver).a();
                return Unit.a;
            case 25:
                ((ewq) this.receiver).d();
                return Unit.a;
            case 26:
                roc rocVar = (roc) this.receiver;
                upi upiVar = rocVar.d;
                upi upiVar2 = rocVar.e;
                dpc dpcVar = (dpc) rocVar.c.get();
                if (dpcVar == null) {
                    Object[] objArr = upiVar2.b;
                    long[] jArr = upiVar2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            char c2 = 7;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j & 255) < 128) {
                                        c = c2;
                                        ((moc) objArr[(i5 << 3) + i7]).t(bpc.d);
                                    } else {
                                        c = c2;
                                    }
                                    j >>= 8;
                                    i7++;
                                    c2 = c;
                                }
                                if (i6 != 8) {
                                }
                            }
                            if (i5 != length) {
                                i5++;
                            }
                        }
                    }
                } else if (dpcVar.n) {
                    if (upiVar.d(dpcVar)) {
                        dpcVar.V0();
                    }
                    bpc U0 = dpcVar.U0();
                    if (!dpcVar.a.n) {
                        sme.b("visitAncestors called on an unattached node");
                    }
                    xci xciVar = dpcVar.a;
                    mpf F = bcx.F(dpcVar);
                    int i8 = 0;
                    while (F != null) {
                        if ((((xci) F.F.f).d & 5120) != 0) {
                            while (xciVar != null) {
                                int i9 = xciVar.c;
                                if ((i9 & 5120) != 0) {
                                    if ((i9 & 1024) != 0) {
                                        i8++;
                                    }
                                    if ((xciVar instanceof moc) && upiVar2.d(xciVar)) {
                                        if (i8 <= 1) {
                                            ((moc) xciVar).t(U0);
                                        } else {
                                            ((moc) xciVar).t(bpc.b);
                                        }
                                        upiVar2.m(xciVar);
                                    }
                                }
                                xciVar = xciVar.e;
                            }
                        }
                        F = F.u();
                        xciVar = (F == null || (crVar = F.F) == null) ? null : (i4s) crVar.e;
                    }
                    Object[] objArr2 = upiVar2.b;
                    long[] jArr2 = upiVar2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j2 = jArr2[i10];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((j2 & 255) < 128) {
                                        ((moc) objArr2[(i10 << 3) + i12]).t(bpc.d);
                                    }
                                    j2 >>= 8;
                                }
                                if (i11 != 8) {
                                }
                            }
                            if (i10 != length2) {
                                i10++;
                            }
                        }
                    }
                }
                rocVar.b.invoke();
                upiVar.c();
                upiVar2.c();
                rocVar.f = false;
                return Unit.a;
            case 27:
                uoc uocVar = (uoc) this.receiver;
                if (uocVar.l == null || uocVar.f.U0() == bpc.d) {
                    uocVar.c.invoke();
                }
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                c1d.a(((c1d) this.receiver).p, new cnc(i));
                return Unit.a;
            default:
                q1d.g((q1d) ((r1d) ((g2d) this.receiver).a.k.getValue()).b.getValue(), "gdpr_close");
                return Unit.a;
        }
    }
}
