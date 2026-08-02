package defpackage;

import android.location.GnssClock;
import android.location.GnssMeasurement;
import android.location.GnssStatus;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.node.j;
import androidx.compose.ui.node.l;
import com.ybsdk.feature.deeplink.api.Deeplink;
import com.ybsdk.feature.deeplink.api.DeeplinkSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes5.dex */
public abstract class w691 {
    public static final void a(int i, fid fidVar, f530 f530Var, List list) {
        int i2;
        aii0 v;
        lga lgaVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1683481546);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(list) ? 4 : 2) | i;
        int i4 = 0;
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            i2 = 1;
            btsVar.Y();
        } else {
            if (list.size() == 1) {
                btsVar.e0(-265489153);
                rib1.b((lla) list.get(0), f530Var, btsVar, 48);
                btsVar.t(false);
                v = btsVar.v();
                if (v != null) {
                    lgaVar = new lga(list, f530Var, i, i4);
                    v.d = lgaVar;
                }
                return;
            }
            btsVar.e0(-265384404);
            btsVar.t(false);
            k3r k3rVar = ljs0.b;
            f530 k = f530Var.k(k3rVar);
            lhl0 a = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            lla llaVar = (lla) list.get(0);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            rib1.b(llaVar, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).k(k3rVar), btsVar, 0);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            sic a2 = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, x2yVar);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            btsVar.e0(223045400);
            i2 = 1;
            Iterator it = a.J(list, 1).iterator();
            while (it.hasNext()) {
                rib1.b((lla) it.next(), ljs0.c(c530.a, 1.0f).k(new x2y(1.0f, true)), btsVar, 0);
            }
            tse0.t(btsVar, false, true, true);
        }
        v = btsVar.v();
        if (v != null) {
            lgaVar = new lga(list, f530Var, i, i2);
            v.d = lgaVar;
        }
    }

    public static final void b(List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(407203429);
        int i2 = (btsVar.k(list) ? 4 : 2) | i;
        int i3 = 3;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2);
            sic a = qic.a(new i43(8.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            btsVar.e0(-778643441);
            Iterator it = a.F(list, 3).iterator();
            while (it.hasNext()) {
                a(48, btsVar, on70.a(ljs0.c(c530Var, 1.0f), 1.29f), (List) it.next());
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sn1(i, i3, list);
        }
    }

    public static final ArrayList c(Collection collection, Set set, int i) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            GnssMeasurement gnssMeasurement = (GnssMeasurement) obj;
            if (set.contains(Long.valueOf(f(gnssMeasurement.getSvid(), gnssMeasurement.getConstellationType())))) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            GnssMeasurement gnssMeasurement2 = (GnssMeasurement) next;
            Long valueOf = Long.valueOf(f(gnssMeasurement2.getSvid(), gnssMeasurement2.getConstellationType()));
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(next);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ycc.r(a.A0(a.x0((List) ((Map.Entry) it2.next()).getValue(), new rm21()), i), arrayList2);
        }
        return arrayList2;
    }

    public static final void d(ae90 ae90Var) {
        j jVar = qje.P(ae90Var).b0;
        jVar.p.K = true;
        l lVar = jVar.q;
        if (lVar != null) {
            lVar.Q = true;
        }
    }

    public static /* synthetic */ Deeplink e(a3h a3hVar, Uri uri, boolean z, DeeplinkSource deeplinkSource, boolean z2, int i) {
        if ((i & 4) != 0) {
            deeplinkSource = null;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        return ((com.ybsdk.screens.initial.deeplink.a) a3hVar).a(uri, z, deeplinkSource, z2);
    }

    public static final long f(int i, int i2) {
        return (i2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (i << 32);
    }

    public static final blt g(GnssClock gnssClock, elt eltVar) {
        Double d = null;
        Long valueOf = eltVar.a ? Long.valueOf(gnssClock.getTimeNanos()) : null;
        Integer valueOf2 = eltVar.b ? Integer.valueOf(gnssClock.getHardwareClockDiscontinuityCount()) : null;
        Long valueOf3 = (eltVar.c && gnssClock.hasFullBiasNanos()) ? Long.valueOf(gnssClock.getFullBiasNanos()) : null;
        Double valueOf4 = (eltVar.d && gnssClock.hasBiasNanos()) ? Double.valueOf(gnssClock.getBiasNanos()) : null;
        Double valueOf5 = (eltVar.e && gnssClock.hasBiasUncertaintyNanos()) ? Double.valueOf(gnssClock.getBiasUncertaintyNanos()) : null;
        Double valueOf6 = (eltVar.f && gnssClock.hasDriftNanosPerSecond()) ? Double.valueOf(gnssClock.getDriftNanosPerSecond()) : null;
        Double valueOf7 = (eltVar.g && gnssClock.hasDriftUncertaintyNanosPerSecond()) ? Double.valueOf(gnssClock.getDriftUncertaintyNanosPerSecond()) : null;
        Integer valueOf8 = (eltVar.h && gnssClock.hasLeapSecond()) ? Integer.valueOf(gnssClock.getLeapSecond()) : null;
        if (eltVar.i && gnssClock.hasTimeUncertaintyNanos()) {
            d = Double.valueOf(gnssClock.getTimeUncertaintyNanos());
        }
        return new blt(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, d);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hlt h(GnssMeasurement gnssMeasurement, klt kltVar) {
        hlt hltVar;
        Double d;
        Integer num;
        Double d2;
        Double d3;
        Double d4;
        Double d5;
        int i;
        Double d6;
        Double d7;
        double satelliteInterSignalBiasUncertaintyNanos;
        double satelliteInterSignalBiasNanos;
        double fullInterSignalBiasUncertaintyNanos;
        double fullInterSignalBiasNanos;
        double basebandCn0DbHz;
        Integer valueOf = kltVar.a ? Integer.valueOf(gnssMeasurement.getSvid()) : null;
        Integer valueOf2 = kltVar.b ? Integer.valueOf(gnssMeasurement.getConstellationType()) : null;
        Integer valueOf3 = kltVar.c ? Integer.valueOf(gnssMeasurement.getState()) : null;
        Long valueOf4 = kltVar.d ? Long.valueOf(gnssMeasurement.getReceivedSvTimeNanos()) : null;
        Long valueOf5 = kltVar.e ? Long.valueOf(gnssMeasurement.getReceivedSvTimeUncertaintyNanos()) : null;
        Double valueOf6 = kltVar.f ? Double.valueOf(gnssMeasurement.getTimeOffsetNanos()) : null;
        Double valueOf7 = kltVar.g ? Double.valueOf(gnssMeasurement.getCn0DbHz()) : null;
        Double valueOf8 = (kltVar.h && gnssMeasurement.hasSnrInDb()) ? Double.valueOf(gnssMeasurement.getSnrInDb()) : null;
        Double valueOf9 = (kltVar.i && gnssMeasurement.hasAutomaticGainControlLevelDb()) ? Double.valueOf(gnssMeasurement.getAutomaticGainControlLevelDb()) : null;
        if (!kltVar.j || Build.VERSION.SDK_INT < 30) {
            d = null;
        } else {
            basebandCn0DbHz = gnssMeasurement.getBasebandCn0DbHz();
            d = Double.valueOf(basebandCn0DbHz);
        }
        Float valueOf10 = (kltVar.k && gnssMeasurement.hasCarrierFrequencyHz()) ? Float.valueOf(gnssMeasurement.getCarrierFrequencyHz()) : null;
        Double valueOf11 = kltVar.l ? Double.valueOf(gnssMeasurement.getPseudorangeRateMetersPerSecond()) : null;
        Double valueOf12 = kltVar.m ? Double.valueOf(gnssMeasurement.getPseudorangeRateUncertaintyMetersPerSecond()) : null;
        Integer valueOf13 = kltVar.n ? Integer.valueOf(gnssMeasurement.getAccumulatedDeltaRangeState()) : null;
        Double valueOf14 = kltVar.o ? Double.valueOf(gnssMeasurement.getAccumulatedDeltaRangeMeters()) : null;
        Double valueOf15 = kltVar.p ? Double.valueOf(gnssMeasurement.getAccumulatedDeltaRangeUncertaintyMeters()) : null;
        Integer valueOf16 = kltVar.q ? Integer.valueOf(gnssMeasurement.getMultipathIndicator()) : null;
        if (kltVar.r) {
            num = valueOf;
            if (Build.VERSION.SDK_INT >= 34) {
                fullInterSignalBiasNanos = gnssMeasurement.getFullInterSignalBiasNanos();
                d2 = Double.valueOf(fullInterSignalBiasNanos);
                if (kltVar.s) {
                    d3 = d2;
                } else {
                    d3 = d2;
                    if (Build.VERSION.SDK_INT >= 34) {
                        fullInterSignalBiasUncertaintyNanos = gnssMeasurement.getFullInterSignalBiasUncertaintyNanos();
                        d4 = Double.valueOf(fullInterSignalBiasUncertaintyNanos);
                        if (kltVar.t) {
                            d5 = d4;
                            i = 34;
                            if (Build.VERSION.SDK_INT >= 34) {
                                satelliteInterSignalBiasNanos = gnssMeasurement.getSatelliteInterSignalBiasNanos();
                                d6 = Double.valueOf(satelliteInterSignalBiasNanos);
                                if (kltVar.u || Build.VERSION.SDK_INT < i) {
                                    d7 = null;
                                } else {
                                    satelliteInterSignalBiasUncertaintyNanos = gnssMeasurement.getSatelliteInterSignalBiasUncertaintyNanos();
                                    d7 = Double.valueOf(satelliteInterSignalBiasUncertaintyNanos);
                                }
                                hltVar = new hlt(num, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, d, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, d3, d5, d6, d7);
                                if (hltVar.equals(new hlt(0))) {
                                    return hltVar;
                                }
                                return null;
                            }
                        } else {
                            d5 = d4;
                            i = 34;
                        }
                        d6 = null;
                        if (kltVar.u) {
                        }
                        d7 = null;
                        hltVar = new hlt(num, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, d, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, d3, d5, d6, d7);
                        if (hltVar.equals(new hlt(0))) {
                        }
                    }
                }
                d4 = null;
                if (kltVar.t) {
                }
                d6 = null;
                if (kltVar.u) {
                }
                d7 = null;
                hltVar = new hlt(num, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, d, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, d3, d5, d6, d7);
                if (hltVar.equals(new hlt(0))) {
                }
            }
        } else {
            num = valueOf;
        }
        d2 = null;
        if (kltVar.s) {
        }
        d4 = null;
        if (kltVar.t) {
        }
        d6 = null;
        if (kltVar.u) {
        }
        d7 = null;
        hltVar = new hlt(num, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, d, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, d3, d5, d6, d7);
        if (hltVar.equals(new hlt(0))) {
        }
    }

    public static final ArrayList i(GnssStatus gnssStatus, ult ultVar, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int intValue = ((Number) it.next()).intValue();
            rlt rltVar = new rlt(ultVar.a ? Integer.valueOf(gnssStatus.getSvid(intValue)) : null, ultVar.b ? Integer.valueOf(gnssStatus.getConstellationType(intValue)) : null, ultVar.c ? Float.valueOf(gnssStatus.getCn0DbHz(intValue)) : null, ultVar.d ? Float.valueOf(gnssStatus.getElevationDegrees(intValue)) : null, ultVar.e ? Float.valueOf(gnssStatus.getAzimuthDegrees(intValue)) : null, (ultVar.f && gnssStatus.hasCarrierFrequencyHz(intValue)) ? Float.valueOf(gnssStatus.getCarrierFrequencyHz(intValue)) : null, ultVar.g ? Boolean.valueOf(gnssStatus.usedInFix(intValue)) : null, ultVar.h ? Boolean.valueOf(gnssStatus.hasAlmanacData(intValue)) : null, ultVar.i ? Boolean.valueOf(gnssStatus.hasEphemerisData(intValue)) : null);
            if (rltVar.equals(new rlt(0))) {
                rltVar = null;
            }
            if (rltVar != null) {
                arrayList.add(rltVar);
            }
        }
        return arrayList;
    }
}
