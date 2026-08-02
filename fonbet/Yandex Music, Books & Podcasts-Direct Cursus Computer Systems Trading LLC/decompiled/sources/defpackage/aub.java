package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import androidx.fragment.app.t;
import androidx.media3.exoplayer.ExoPlayer;
import com.connectsdk.service.config.ServiceDescription;
import com.google.gson.JsonObject;
import com.yandex.pulse.metrics.o;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import ru.yandex.music.catalog.album.screen.AlbumScreenActivity;
import ru.yandex.music.catalog.artist.screen.ArtistScreenActivity;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;
import ru.yandex.music.utils.Preconditions;

/* loaded from: classes3.dex */
public final /* synthetic */ class aub extends ezc implements Function1 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aub(v8c v8cVar) {
        super(1, 0, v8c.class, v8cVar, "handleProgress", "handleProgress(Lru/yandex/videoplayer/multiplatform/fetcher/BandwidthInfo;)V");
        this.a = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fcc fccVar;
        Object obj2;
        int i = 24;
        int i2 = 2;
        int i3 = 3;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.a) {
            case 0:
                yur yurVar = (yur) obj;
                yurVar.getClass();
                ((kub) this.receiver).f(yurVar);
                return Unit.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                t5c t5cVar = (t5c) this.receiver;
                t5cVar.getClass();
                rmb rmbVar = t5cVar.b;
                sjb sjbVar = sjb.SelectFilter;
                mdc a = t5cVar.a();
                if (a != null) {
                    Iterator it = CollectionsKt.B0(a.a).iterator();
                    while (true) {
                        ora oraVar = (ora) it;
                        if (oraVar.b.hasNext()) {
                            obj2 = oraVar.next();
                            if (((hcc) ((IndexedValue) obj2).b).a.equals(str)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    IndexedValue indexedValue = (IndexedValue) obj2;
                    if (indexedValue != null) {
                        int i4 = indexedValue.a;
                        hcc hccVar = (hcc) indexedValue.b;
                        hccVar.getClass();
                        fccVar = new fcc(ServiceDescription.KEY_FILTER, hccVar.a, i4 + 1);
                        rmb.a(rmbVar, sjbVar, null, fccVar, 6);
                        xdr xdrVar = (xdr) ((bqi) t5cVar.c.g.getValue());
                        xdrVar.getClass();
                        xdrVar.m(null, str);
                        return Unit.a;
                    }
                }
                fccVar = null;
                rmb.a(rmbVar, sjbVar, null, fccVar, 6);
                xdr xdrVar2 = (xdr) ((bqi) t5cVar.c.g.getValue());
                xdrVar2.getClass();
                xdrVar2.m(null, str);
                return Unit.a;
            case 2:
                vk2 vk2Var = (vk2) obj;
                vk2Var.getClass();
                v8c v8cVar = (v8c) this.receiver;
                v8cVar.getClass();
                qzc qzcVar = v8c.i;
                if (qzc.c) {
                    double d = vk2Var.b;
                    if (!Double.isInfinite(d) && !Double.isNaN(d)) {
                        v8cVar.b += d;
                    }
                } else {
                    synchronized (((cuk) qzcVar.b)) {
                        double d2 = vk2Var.b;
                        if (!Double.isInfinite(d2) && !Double.isNaN(d2)) {
                            v8cVar.b += d2;
                        }
                    }
                }
                return Unit.a;
            case 3:
                IntRange intRange = (IntRange) obj;
                intRange.getClass();
                ((q0d) this.receiver).e(intRange);
                return Unit.a;
            case 4:
                pbu pbuVar = (pbu) obj;
                pbuVar.getClass();
                ((q0d) this.receiver).c(pbuVar);
                return Unit.a;
            case 5:
                f8l f8lVar = (f8l) obj;
                f8lVar.getClass();
                ((ExoPlayer) this.receiver).x0(f8lVar);
                return Unit.a;
            case 6:
                String str2 = (String) obj;
                str2.getClass();
                g2d g2dVar = (g2d) this.receiver;
                g2dVar.getClass();
                q1d.g((q1d) ((r1d) g2dVar.a.k.getValue()).b.getValue(), "gdpr_help");
                w1g.z((t) g2dVar.b.a, str2);
                return Unit.a;
            case 7:
                t9l t9lVar = (t9l) obj;
                t9lVar.getClass();
                j1o j1oVar = (j1o) this.receiver;
                j1oVar.getClass();
                JsonObject jsonObject = new JsonObject();
                jsonObject.u("urlType", t9lVar.b);
                jsonObject.u("url", t9lVar.a);
                jsonObject.s(Long.valueOf(t9lVar.c), "time");
                jsonObject.s(Long.valueOf(t9lVar.d), "connectingTime");
                jsonObject.s(Long.valueOf(t9lVar.e), "requestResponseTime");
                mib mibVar = j1oVar.a;
                i1o[] i1oVarArr = i1o.a;
                String jsonElement = jsonObject.toString();
                jsonElement.getClass();
                mibVar.a("REQUEST_TIME", jsonElement);
                return Unit.a;
            case 8:
                String str3 = (String) obj;
                str3.getClass();
                ((ost) this.receiver).getClass();
                return btf.b(new w8a(str3, i2));
            case 9:
                u3q u3qVar = (u3q) obj;
                u3qVar.getClass();
                qqs qqsVar = (qqs) this.receiver;
                qqsVar.getClass();
                Boolean bool = (Boolean) ocg.k(u3qVar, new qec(i3, qqsVar.a()));
                bool.booleanValue();
                return bool;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eqp eqpVar = (eqp) this.receiver;
                hsp hspVar = eqpVar.c;
                jyr jyrVar = eqpVar.s;
                hspVar.b().a(xjb.NotifyAboutNewReleases, booleanValue);
                if (!booleanValue) {
                    ((r2q) jyrVar.getValue()).a(false);
                } else if (Build.VERSION.SDK_INT >= 33) {
                    dn9 dn9Var = eqpVar.f;
                    mjm mjmVar = new mjm(i, eqpVar);
                    dn9Var.getClass();
                    AtomicBoolean atomicBoolean = (AtomicBoolean) dn9Var.e;
                    if (atomicBoolean.compareAndSet(false, true)) {
                        Context requireContext = ((ypp) dn9Var.b).requireContext();
                        requireContext.getClass();
                        if (etn.z(requireContext, "android.permission.POST_NOTIFICATIONS") == 0) {
                            atomicBoolean.set(false);
                            mjmVar.invoke(dlk.a);
                        } else {
                            dn9Var.c = "android.permission.POST_NOTIFICATIONS";
                            dn9Var.d = mjmVar;
                            ((zh) dn9Var.f).a("android.permission.POST_NOTIFICATIONS");
                        }
                    }
                } else {
                    ((r2q) jyrVar.getValue()).a(true);
                }
                return Unit.a;
            case 11:
                s9p s9pVar = (s9p) obj;
                s9pVar.getClass();
                ((u1e) this.receiver).getClass();
                return new w5l(new cvo(wjb.MainScreen, hlb.Fullscreen, (glb) null, (dvo) null, (avo) null, 60), new jab(qkb.MyWave, 1, 2, 0), new thj(pkb.Wave, s9pVar.toString(), 1, 1, ""), null);
            case 12:
                s9p s9pVar2 = (s9p) obj;
                s9pVar2.getClass();
                return ((a2e) this.receiver).a.x().a(new jab(qkb.MyWave, 1, 2, 0), null).b(new thj(pkb.Wave, s9pVar2.toString(), 1, 1, ""));
            case 13:
                ((j2e) this.receiver).a(((Number) obj).intValue());
                return Unit.a;
            case 14:
                mqs mqsVar = (mqs) obj;
                mqsVar.getClass();
                ((osj) this.receiver).b(mqsVar);
                return Unit.a;
            case 15:
                ahe aheVar = (ahe) obj;
                aheVar.getClass();
                ((khe) this.receiver).d(aheVar);
                return Unit.a;
            case 16:
                ahe aheVar2 = (ahe) obj;
                aheVar2.getClass();
                ((khe) this.receiver).e(aheVar2);
                return Unit.a;
            case 17:
                ((Set) obj).getClass();
                iye iyeVar = (iye) this.receiver;
                ReentrantLock reentrantLock = iyeVar.d;
                reentrantLock.lock();
                try {
                    List w0 = CollectionsKt.w0(iyeVar.c.values());
                    reentrantLock.unlock();
                    Iterator it2 = w0.iterator();
                    if (!it2.hasNext()) {
                        return Unit.a;
                    }
                    ((gkj) it2.next()).getClass();
                    throw null;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 18:
                mqs mqsVar2 = (mqs) obj;
                mqsVar2.getClass();
                ((k0f) this.receiver).n(mqsVar2);
                return Unit.a;
            case 19:
                x1u x1uVar = (x1u) obj;
                x1uVar.getClass();
                ((k0f) this.receiver).k(x1uVar);
                return Unit.a;
            case 20:
                zji zjiVar = (zji) obj;
                zjiVar.getClass();
                xli xliVar = (xli) this.receiver;
                xliVar.getClass();
                xliVar.a.s.G(zjiVar);
                hgp hgpVar = xliVar.b;
                lt ltVar = zjiVar.b;
                int i5 = AlbumScreenActivity.v0;
                t tVar = (t) hgpVar.b;
                tVar.startActivity(leu.T(tVar, ltVar, null));
                return Unit.a;
            case 21:
                cki ckiVar = (cki) obj;
                ckiVar.getClass();
                xli xliVar2 = (xli) this.receiver;
                xliVar2.getClass();
                xliVar2.a.s.G(ckiVar);
                hgp hgpVar2 = xliVar2.b;
                eul eulVar = ckiVar.b;
                int i6 = PlaylistScreenActivity.B0;
                t tVar2 = (t) hgpVar2.b;
                tVar2.startActivity(dxl.j(tVar2, new jxl(eulVar.a, eulVar.b), hdg.k0(eulVar.d), null, null, 112));
                return Unit.a;
            case 22:
                aki akiVar = (aki) obj;
                akiVar.getClass();
                xli xliVar3 = (xli) this.receiver;
                xliVar3.getClass();
                xliVar3.a.s.G(akiVar);
                hgp hgpVar3 = xliVar3.b;
                u51 u51Var = akiVar.b;
                int i7 = ArtistScreenActivity.w0;
                t tVar3 = (t) hgpVar3.b;
                tVar3.startActivity(l48.p(tVar3, u51Var, null, null, 24));
                return Unit.a;
            case 23:
                ((y2f) this.receiver).l((Throwable) obj);
                return Unit.a;
            case 24:
                vbc vbcVar = (vbc) obj;
                vbcVar.getClass();
                fdf fdfVar = (fdf) this.receiver;
                fdfVar.getClass();
                x97.y(ot0.F(fdfVar), null, null, new ptd(fdfVar, vbcVar, objArr == true ? 1 : 0, 7), 3);
                return Unit.a;
            case 25:
                vbc vbcVar2 = (vbc) obj;
                vbcVar2.getClass();
                gdf gdfVar = (gdf) this.receiver;
                gdfVar.getClass();
                x97.y(ot0.F(gdfVar), null, null, new ptd(gdfVar, vbcVar2, objArr2 == true ? 1 : 0, 8), 3);
                return Unit.a;
            case 26:
                Boolean bool2 = (Boolean) obj;
                boolean booleanValue2 = bool2.booleanValue();
                eqp eqpVar2 = (eqp) this.receiver;
                eqpVar2.c.b().a(xjb.KidsTab, booleanValue2);
                ((wst) eqpVar2.p.getValue()).a(((frt) eqpVar2.q.getValue()).c()).h(pff.e, false, bool2);
                t tVar4 = eqpVar2.b.a;
                np2 np2Var = tVar4 instanceof np2 ? (np2) tVar4 : null;
                if (np2Var != null) {
                    le3 le3Var = np2Var.d;
                    le3Var.getClass();
                    ((kii) Preconditions.nonNull((kii) le3Var.a)).u();
                }
                return Unit.a;
            case 27:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                eqp eqpVar3 = (eqp) this.receiver;
                eqpVar3.getClass();
                yyb yybVar = booleanValue3 ? yyb.d : yyb.c;
                eqpVar3.c.b().a(xjb.Explicit, booleanValue3);
                ezb ezbVar = (ezb) eqpVar3.o.getValue();
                ezbVar.getClass();
                x97.y(ezbVar.b, null, null, new f98((Object) ezbVar, (Object) yybVar, (Continuation) (objArr3 == true ? 1 : 0), 29), 3);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                ((thj) obj).getClass();
                ydf ydfVar = (ydf) this.receiver;
                ydfVar.getClass();
                t36 t36Var = ydfVar.b;
                v35 v35Var = v35.c;
                int i8 = CollectionMainActivity.v0;
                Activity activity = t36Var.a;
                activity.startActivity(men.B(activity, v35Var));
                rmb.j(ydfVar.a.b, wjb.KidsAlbumAndPodcastListScreen, null, null, 14);
                return Unit.a;
            default:
                ((thj) obj).getClass();
                ydf ydfVar2 = (ydf) this.receiver;
                ydfVar2.getClass();
                t36 t36Var2 = ydfVar2.b;
                v35 v35Var2 = v35.b;
                int i9 = CollectionMainActivity.v0;
                Activity activity2 = t36Var2.a;
                activity2.startActivity(men.B(activity2, v35Var2));
                rmb.j(ydfVar2.a.b, wjb.KidsPlaylistListScreen, null, null, 14);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aub(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }
}
