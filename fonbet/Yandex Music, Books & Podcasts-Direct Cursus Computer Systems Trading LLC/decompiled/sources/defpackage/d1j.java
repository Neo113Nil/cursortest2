package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.fragment.app.t;
import com.yandex.music.shared.play.audio2.db.PlayAudioDatabase_Impl;
import com.yandex.music.shared.player.informer.data.network.PlayerInformersApi;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import com.yandex.passport.internal.impl.x;
import com.yandex.passport.internal.n;
import com.yandex.passport.internal.provider.communication.d;
import com.yandex.passport.internal.report.te;
import com.yandex.passport.internal.report.ye;
import com.yandex.passport.internal.v;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.IReporterYandex;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.YMApplication;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.e;

/* loaded from: classes5.dex */
public final /* synthetic */ class d1j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d1j(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v10, types: [cma] */
    /* JADX WARN: Type inference failed for: r5v11 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        List B;
        int i6 = 6;
        int i7 = 0;
        int i8 = 1;
        cma cmaVar = 0;
        cmaVar = 0;
        switch (this.a) {
            case 0:
                mka mkaVar = (mka) ((qdc) this.b).b;
                x2i x2iVar = mka.b;
                if (x2iVar != null) {
                    return x2iVar;
                }
                x2i x2iVar2 = new x2i((efo) mkaVar.a);
                mka.b = x2iVar2;
                return x2iVar2;
            case 1:
                ConnectivityManager connectivityManager = (ConnectivityManager) this.b;
                try {
                    return Build.VERSION.SDK_INT >= 26 ? new t1j(connectivityManager) : new s1j(connectivityManager);
                } catch (SecurityException e) {
                    if (Build.VERSION.SDK_INT != 31) {
                        Assertions.throwOrSkip("NetworkStateAdapter", new FailedAssertionException("Unexpected security exception in ConnectivityManager.registerNetworkCallback", e));
                    }
                    ssg.a(6, "NetworkStateAdapter", "Security exception in ConnectivityManager.registerNetworkCallback, trying legacy way", null);
                    return new u1j(connectivityManager);
                }
            case 2:
                q3j q3jVar = (q3j) this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(iaj.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                t requireActivity = q3jVar.requireActivity();
                requireActivity.getClass();
                return iaj.a(requireActivity, q3jVar.d());
            case 3:
                ((bc5) this.b).a();
                return Boolean.TRUE;
            case 4:
                ((w6j) this.b).a.getClass();
                jyr jyrVar = dvu.e;
                return kwl.c();
            case 5:
                bz4 bz4Var = (bz4) this.b;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(aaj.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return new ce((aaj) qdcVar2.C(I2), (jnq) bz4Var.d);
            case 6:
                e00 e00Var = ((vbj) this.b).a;
                bdt I3 = hag.I(tmb.class);
                qdc qdcVar3 = e00Var.a;
                qdcVar3.getClass();
                return (tmb) qdcVar3.C(I3);
            case 7:
                e eVar = (e) ((gpj) this.b).a.getValue();
                a aVar = PlaybackScope.a;
                aVar.getClass();
                eVar.getClass();
                return aVar.h();
            case 8:
                YMApplication yMApplication = ((c9k) this.b).a;
                IReporterYandex b = ye.b(yMApplication);
                Thread.setDefaultUncaughtExceptionHandler(new n(new te(yMApplication, b)));
                v.c(yMApplication, b);
                if (d.d == null) {
                    d.d = d.a();
                }
                Context applicationContext = yMApplication.getApplicationContext();
                applicationContext.getClass();
                return new x(applicationContext, b);
            case 9:
                y9k y9kVar = (y9k) this.b;
                return y9kVar.a.e(y9kVar.b);
            case 10:
                int ordinal = ((bik) this.b).ordinal();
                if (ordinal == 0) {
                    return rjb.Support;
                }
                if (ordinal == 1) {
                    return rjb.Restore;
                }
                if (ordinal == 2) {
                    return rjb.Logout;
                }
                if (ordinal == 3) {
                    return rjb.Promocode;
                }
                b6e.s();
                return null;
            case 11:
                return Integer.valueOf((int) ((hpk) this.b).b.a);
            case 12:
                cr crVar = (cr) this.b;
                crVar.getClass();
                Collection<m9b> values = ((LinkedHashMap) crVar.b).values();
                if ((values instanceof Collection) && values.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (m9b m9bVar : values) {
                        if ((m9bVar instanceof i9b) || (m9bVar instanceof h9b)) {
                            i++;
                            if (i < 0) {
                                u75.m();
                                throw null;
                            }
                        }
                    }
                }
                Collection<m9b> values2 = ((LinkedHashMap) crVar.c).values();
                if ((values2 instanceof Collection) && values2.isEmpty()) {
                    i2 = 0;
                } else {
                    i2 = 0;
                    for (m9b m9bVar2 : values2) {
                        if ((m9bVar2 instanceof i9b) || (m9bVar2 instanceof h9b)) {
                            i2++;
                            if (i2 < 0) {
                                u75.m();
                                throw null;
                            }
                        }
                    }
                }
                Collection<m9b> values3 = ((LinkedHashMap) crVar.d).values();
                if ((values3 instanceof Collection) && values3.isEmpty()) {
                    i3 = 0;
                } else {
                    i3 = 0;
                    for (m9b m9bVar3 : values3) {
                        if ((m9bVar3 instanceof i9b) || (m9bVar3 instanceof h9b)) {
                            i3++;
                            if (i3 < 0) {
                                u75.m();
                                throw null;
                            }
                        }
                    }
                }
                Collection<m9b> values4 = ((LinkedHashMap) crVar.e).values();
                if ((values4 instanceof Collection) && values4.isEmpty()) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    for (m9b m9bVar4 : values4) {
                        if ((m9bVar4 instanceof i9b) || (m9bVar4 instanceof h9b)) {
                            i4++;
                            if (i4 < 0) {
                                u75.m();
                                throw null;
                            }
                        }
                    }
                }
                Collection<m9b> values5 = ((LinkedHashMap) crVar.f).values();
                if ((values5 instanceof Collection) && values5.isEmpty()) {
                    i5 = 0;
                } else {
                    i5 = 0;
                    for (m9b m9bVar5 : values5) {
                        if ((m9bVar5 instanceof i9b) || (m9bVar5 instanceof h9b)) {
                            i5++;
                            if (i5 < 0) {
                                u75.m();
                                throw null;
                            }
                        }
                    }
                }
                Collection<m9b> values6 = ((LinkedHashMap) crVar.g).values();
                if (!(values6 instanceof Collection) || !values6.isEmpty()) {
                    for (m9b m9bVar6 : values6) {
                        if ((m9bVar6 instanceof i9b) || (m9bVar6 instanceof h9b)) {
                            i7++;
                            if (i7 < 0) {
                                u75.m();
                                throw null;
                            }
                        }
                    }
                }
                StringBuilder l = dfi.l("tracks: ", i, i2, ", albums: ", ", artists: ");
                hrg.w(i3, i4, ", playlists: ", ", preSaves: ", l);
                l.append(i5);
                l.append(", videoClips: ");
                l.append(i7);
                return "downloaded entities\n".concat(l.toString());
            case 13:
                yuk yukVar = (yuk) this.b;
                if (((tuk) yukVar.c.getValue()).a()) {
                    return new vvk(yukVar.a);
                }
                return null;
            case 14:
                return new bvk((PlayAudioDatabase_Impl) this.b);
            case 15:
                tvk tvkVar = (tvk) this.b;
                if (((Boolean) tvkVar.c().a.c.invoke()).booleanValue()) {
                    return new ewk(tvkVar.a);
                }
                return null;
            case 16:
                String Q = ((iwk) this.b).Q("screen");
                return Intrinsics.d(Q, "landing") ? new aqt(wjb.MainScreen) : Intrinsics.d(Q, "wave") ? new aqt(wjb.MainScreen) : zpt.a;
            case 17:
                return (t) sj2.G(((ayk) this.b).a);
            case 18:
                return new j0l((x0q) this.b);
            case 19:
                return ((faw) ((gni) this.b)).K;
            case 20:
                Boolean bool = (Boolean) ((d0q) ((v9w) this.b).a.getValue()).e.getValue();
                bool.booleanValue();
                return bool;
            case 21:
                oq7 oq7Var = ((yyk) this.b).c;
                return new w3q(i8, oq7Var.c, oq7Var.a);
            case 22:
                rjp rjpVar = (rjp) this.b;
                if (rjpVar != null) {
                    return ((lk4) ((jyr) rjpVar.a).getValue()).a;
                }
                return null;
            case 23:
                z4l z4lVar = (z4l) this.b;
                qk3 qk3Var = new qk3(ox6.S(((z66) z4lVar.c.getValue()).c()), i6);
                tf6 tf6Var = z4lVar.a;
                ox6.B(qk3Var, tf6Var, new u4l(z4lVar, i7));
                qfj qfjVar = new qfj(1, z4lVar);
                grc grcVar = frc.a;
                grcVar.getClass();
                grcVar.b.add(qfjVar);
                saf.Q(tf6Var.a).R(new s8i(16, qfjVar));
                x97.y(tf6Var, null, null, new w4l(z4lVar, cmaVar, i7), 3);
                x97.y(tf6Var, null, null, new w4l(z4lVar, cmaVar, i8), 3);
                return Unit.a;
            case 24:
                n7q n7qVar = (n7q) this.b;
                if (n7qVar == null || (B = y7g.B(n7qVar)) == null) {
                    return c5b.a;
                }
                List list = B;
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    mqs a = ((mwk) it.next()).a();
                    if (a == null) {
                        return c5b.a;
                    }
                    arrayList.add(a);
                }
                return arrayList;
            case 25:
                return Integer.valueOf(((ual) this.b).a.getResources().getDimensionPixelSize(R.dimen.bottom_tabs_height));
            case 26:
                return asq.K(((mfl) this.b).b, new hcl(8));
            case 27:
                return (efl) ((qfl) ((ofl) this.b).a.getValue()).b.getValue();
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                bgl bglVar = (bgl) this.b;
                return new uel(bglVar.a, (PlayerInformersApi) bglVar.d.getValue(), bglVar.c);
            default:
                fle m = ((yke) this.b).m();
                m.getClass();
                lke lkeVar = (lke) m.b.getValue();
                if (lkeVar != null) {
                    if (!lkeVar.d().contains(m.a)) {
                        lkeVar = null;
                    }
                    if (lkeVar != null) {
                        cmaVar = new cma(((Number) m.d.e()).floatValue() * lkeVar.f());
                    }
                }
                return new cma(cmaVar != 0 ? cmaVar.a : 0.0f);
        }
    }
}
