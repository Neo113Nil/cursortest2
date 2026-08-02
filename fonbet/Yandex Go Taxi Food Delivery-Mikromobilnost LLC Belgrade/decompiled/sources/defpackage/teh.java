package defpackage;

import android.content.Context;
import androidx.core.app.q;
import androidx.media3.exoplayer.dash.DashMediaSource$Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory;
import androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory;
import androidx.media3.exoplayer.video.b;
import com.google.common.collect.ImmutableList;
import com.yandex.go.address.models.Address;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.a;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.preorder.tollroad.analytics.RoadSelectionCardAnalytics$RouteTypeV2;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$Button;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$CloseReason;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadDialogAnalytics$RoadType;
import ru.yandex.taxi.preorder.tollroad.data.e;
import ru.yandex.taxi.preorder.tollroad.o;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes10.dex */
public final class teh implements aax0 {
    public Object A;
    public boolean a;
    public final Object b;
    public final Object c;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public teh(e eVar, o oVar, ptx ptxVar, x770 x770Var) {
        this.b = eVar;
        this.c = oVar;
        this.w = ptxVar;
        this.x = x770Var;
        this.z = u4r0.c(TollRoadDialogAnalytics$Button.ANDROID_BACK_BUTTON, TollRoadDialogAnalytics$Button.DONE);
        this.A = TollRoadDialogAnalytics$RoadType.FREE;
    }

    @Override // defpackage.aax0
    public PointType a() {
        sls slsVar = (sls) this.w;
        if (slsVar != null) {
            return (PointType) slsVar.invoke();
        }
        return null;
    }

    @Override // defpackage.aax0
    public boolean b() {
        sls slsVar = (sls) this.x;
        if (slsVar != null) {
            return ((Boolean) slsVar.invoke()).booleanValue();
        }
        return false;
    }

    public txc0 c() {
        d6z.x(!this.a);
        if (((sxc0) this.x) == null) {
            if (((rxc0) this.w) == null) {
                this.w = new rxc0();
            }
            this.x = new sxc0((rxc0) this.w);
        }
        txc0 txc0Var = new txc0(this);
        this.a = true;
        return txc0Var;
    }

    @Override // defpackage.aax0
    public boolean d() {
        sls slsVar = (sls) this.y;
        if (slsVar != null) {
            return ((Boolean) slsVar.invoke()).booleanValue();
        }
        return false;
    }

    public q e() {
        return (q) this.A;
    }

    public List f() {
        return (List) this.y;
    }

    public q g() {
        return (q) this.z;
    }

    public List h() {
        return (List) this.x;
    }

    @Override // defpackage.aax0
    public void i(zzs zzsVar) {
        tls tlsVar = (tls) this.c;
        if (tlsVar != null) {
            tlsVar.invoke(zzsVar);
        }
    }

    public rf10 j(int i) {
        HashMap hashMap = (HashMap) this.w;
        rf10 rf10Var = (rf10) hashMap.get(Integer.valueOf(i));
        if (rf10Var != null) {
            return rf10Var;
        }
        rf10 rf10Var2 = (rf10) r(i).get();
        rmm rmmVar = (rmm) this.z;
        if (rmmVar != null) {
            rf10Var2.setDrmSessionManagerProvider(rmmVar);
        }
        twy twyVar = (twy) this.A;
        if (twyVar != null) {
            rf10Var2.setLoadErrorHandlingPolicy(twyVar);
        }
        rf10Var2.setSubtitleParserFactory((dlh) this.y);
        rf10Var2.experimentalParseSubtitlesDuringExtraction(this.a);
        rf10Var2.experimentalSetCodecsToParseWithinGopSampleDependencies(0);
        hashMap.put(Integer.valueOf(i), rf10Var2);
        return rf10Var2;
    }

    public q k() {
        return (q) this.w;
    }

    @Override // defpackage.aax0
    public void l() {
        sls slsVar = (sls) this.z;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public String m() {
        return (String) this.c;
    }

    public String n() {
        return (String) this.b;
    }

    @Override // defpackage.aax0
    public boolean o() {
        return this.a;
    }

    public boolean p() {
        return this.a;
    }

    @Override // defpackage.aax0
    public void q(zzs zzsVar) {
        tls tlsVar = (tls) this.b;
        if (tlsVar != null) {
            tlsVar.invoke(zzsVar);
        }
    }

    public rhw0 r(int i) {
        rhw0 rhw0Var;
        HashMap hashMap = (HashMap) this.c;
        rhw0 rhw0Var2 = (rhw0) hashMap.get(Integer.valueOf(i));
        if (rhw0Var2 != null) {
            return rhw0Var2;
        }
        final ipg ipgVar = (ipg) this.x;
        ipgVar.getClass();
        final int i2 = 0;
        if (i != 0) {
            final int i3 = 1;
            if (i != 1) {
                final int i4 = 2;
                if (i != 2) {
                    final int i5 = 3;
                    if (i == 3) {
                        rhw0Var = new seh(i2, RtspMediaSource$Factory.class.asSubclass(rf10.class));
                    } else {
                        if (i != 4) {
                            ny61.g(oyr.i(i, "Unrecognized contentType: "));
                            return null;
                        }
                        rhw0Var = new rhw0() { // from class: reh
                            @Override // defpackage.rhw0
                            public final Object get() {
                                int i6 = i5;
                                ipg ipgVar2 = ipgVar;
                                Object obj = this;
                                switch (i6) {
                                    case 0:
                                        return ueh.a((Class) obj, ipgVar2);
                                    case 1:
                                        return ueh.a((Class) obj, ipgVar2);
                                    case 2:
                                        return ueh.a((Class) obj, ipgVar2);
                                    default:
                                        return new skf0(ipgVar2, (e5p) ((teh) obj).b);
                                }
                            }
                        };
                    }
                } else {
                    final Class asSubclass = HlsMediaSource$Factory.class.asSubclass(rf10.class);
                    rhw0Var = new rhw0() { // from class: reh
                        @Override // defpackage.rhw0
                        public final Object get() {
                            int i6 = i4;
                            ipg ipgVar2 = ipgVar;
                            Object obj = asSubclass;
                            switch (i6) {
                                case 0:
                                    return ueh.a((Class) obj, ipgVar2);
                                case 1:
                                    return ueh.a((Class) obj, ipgVar2);
                                case 2:
                                    return ueh.a((Class) obj, ipgVar2);
                                default:
                                    return new skf0(ipgVar2, (e5p) ((teh) obj).b);
                            }
                        }
                    };
                }
            } else {
                final Class asSubclass2 = SsMediaSource$Factory.class.asSubclass(rf10.class);
                rhw0Var = new rhw0() { // from class: reh
                    @Override // defpackage.rhw0
                    public final Object get() {
                        int i6 = i3;
                        ipg ipgVar2 = ipgVar;
                        Object obj = asSubclass2;
                        switch (i6) {
                            case 0:
                                return ueh.a((Class) obj, ipgVar2);
                            case 1:
                                return ueh.a((Class) obj, ipgVar2);
                            case 2:
                                return ueh.a((Class) obj, ipgVar2);
                            default:
                                return new skf0(ipgVar2, (e5p) ((teh) obj).b);
                        }
                    }
                };
            }
        } else {
            final Class asSubclass3 = DashMediaSource$Factory.class.asSubclass(rf10.class);
            rhw0Var = new rhw0() { // from class: reh
                @Override // defpackage.rhw0
                public final Object get() {
                    int i6 = i2;
                    ipg ipgVar2 = ipgVar;
                    Object obj = asSubclass3;
                    switch (i6) {
                        case 0:
                            return ueh.a((Class) obj, ipgVar2);
                        case 1:
                            return ueh.a((Class) obj, ipgVar2);
                        case 2:
                            return ueh.a((Class) obj, ipgVar2);
                        default:
                            return new skf0(ipgVar2, (e5p) ((teh) obj).b);
                    }
                }
            };
        }
        hashMap.put(Integer.valueOf(i), rhw0Var);
        return rhw0Var;
    }

    public void s(TollRoadDialogAnalytics$CloseReason tollRoadDialogAnalytics$CloseReason) {
        x770 x770Var = (x770) this.x;
        String value = tollRoadDialogAnalytics$CloseReason.getValue();
        ArrayList b = vqb1.b((HashSet) this.z);
        String value2 = ((TollRoadDialogAnalytics$RoadType) this.A).getValue();
        HashMap hashMap = new HashMap();
        hashMap.put("close_reason", value);
        hashMap.put("button_list", b);
        x770Var.a.a("RoadSelectionCard.Closed", hashMap, 1, tse0.r("road_type", hashMap, value2));
    }

    public void t() {
        if (this.a) {
            return;
        }
        x770 x770Var = (x770) this.x;
        ArrayList b = vqb1.b((HashSet) this.z);
        String value = ((TollRoadDialogAnalytics$RoadType) this.A).getValue();
        ListBuilder w = w(false);
        HashMap hashMap = new HashMap();
        hashMap.put("button_list", b);
        hashMap.put("road_type", value);
        ArrayList arrayList = new ArrayList(tcc.n(w, 10));
        ListIterator listIterator = w.listIterator(0);
        while (true) {
            qqy qqyVar = (qqy) listIterator;
            if (!qqyVar.hasNext()) {
                hashMap.put("route_list", arrayList);
                x770Var.a.a("RoadSelectionCard.Shown", hashMap, 2, new HashMap());
                this.a = true;
                return;
            }
            arrayList.add(((ptk0) qqyVar.next()).d);
        }
    }

    public void u(TollRoadDialogAnalytics$Button tollRoadDialogAnalytics$Button) {
        x770 x770Var = (x770) this.x;
        String value = tollRoadDialogAnalytics$Button.getValue();
        String value2 = ((TollRoadDialogAnalytics$RoadType) this.A).getValue();
        String X = a.X(vqb1.b((HashSet) this.z), ",", null, null, null, 62);
        ListBuilder w = w(true);
        HashMap u = g8e.u("button_list", X, "button_name", value);
        u.put("road_type", value2);
        if (w != null) {
            ArrayList arrayList = new ArrayList(tcc.n(w, 10));
            ListIterator listIterator = w.listIterator(0);
            while (true) {
                qqy qqyVar = (qqy) listIterator;
                if (!qqyVar.hasNext()) {
                    break;
                } else {
                    arrayList.add(((ptk0) qqyVar.next()).d);
                }
            }
            u.put("route_list", arrayList);
        }
        x770Var.a.a("RoadSelectionCard.Tapped", u, 2, new HashMap());
    }

    public ptk0 v(boolean z, boolean z2) {
        e eVar = (e) this.b;
        int intValue = z ? ((Number) eVar.c.getValue()).intValue() : ((Number) eVar.d.getValue()).intValue();
        RoadSelectionCardAnalytics$RouteTypeV2 roadSelectionCardAnalytics$RouteTypeV2 = z ? RoadSelectionCardAnalytics$RouteTypeV2.Toll : RoadSelectionCardAnalytics$RouteTypeV2.Free;
        String str = null;
        if (z2) {
            ptx ptxVar = (ptx) this.w;
            is60 is60Var = z ? ptxVar.a : ptxVar.b;
            if (is60Var != null) {
                str = is60Var.a();
            }
        }
        return new ptk0(roadSelectionCardAnalytics$RouteTypeV2, intValue, str);
    }

    public ListBuilder w(boolean z) {
        ListBuilder a = rcc.a();
        if (!((o) this.c).a.a.c()) {
            a.add(v(false, z));
        }
        a.add(v(true, z));
        return a.j();
    }

    public void x(boolean z) {
        HashSet hashSet = (HashSet) this.z;
        if (z) {
            hashSet.add(TollRoadDialogAnalytics$Button.SELECT_ROUTE);
        } else {
            hashSet.remove(TollRoadDialogAnalytics$Button.SELECT_ROUTE);
        }
    }

    @Override // defpackage.aax0
    public void y() {
        sls slsVar = (sls) this.A;
        if (slsVar != null) {
            slsVar.invoke();
        }
    }

    public void z(boolean z) {
        this.A = z ? TollRoadDialogAnalytics$RoadType.TOLL : TollRoadDialogAnalytics$RoadType.FREE;
    }

    public teh(String str, String str2, boolean z, q qVar, ArrayList arrayList, ArrayList arrayList2, q qVar2, q qVar3) {
        this.b = str;
        this.c = str2;
        this.a = z;
        this.w = qVar;
        this.x = arrayList;
        this.y = arrayList2;
        this.z = qVar2;
        this.A = qVar3;
    }

    public teh(boolean z, tls tlsVar, tls tlsVar2, sls slsVar, sls slsVar2, sls slsVar3, sls slsVar4, sls slsVar5) {
        this.a = z;
        this.b = tlsVar;
        this.c = tlsVar2;
        this.w = slsVar;
        this.x = slsVar2;
        this.y = slsVar3;
        this.z = slsVar4;
        this.A = slsVar5;
    }

    public teh(Context context, b bVar) {
        this.b = context.getApplicationContext();
        this.c = bVar;
        this.y = ImmutableList.p();
        this.z = gly0.c;
        this.A = y3c.a;
    }

    public teh(hif hifVar, boolean z, pex0 pex0Var, zzs zzsVar, zzs zzsVar2, Address address, Address address2, String str) {
        this.b = hifVar;
        this.a = z;
        this.c = pex0Var;
        this.w = zzsVar;
        this.x = zzsVar2;
        this.y = address;
        this.z = address2;
        this.A = str;
    }

    public teh(e5p e5pVar, dlh dlhVar) {
        this.b = e5pVar;
        this.y = dlhVar;
        this.c = new HashMap();
        this.w = new HashMap();
        this.a = true;
    }
}
