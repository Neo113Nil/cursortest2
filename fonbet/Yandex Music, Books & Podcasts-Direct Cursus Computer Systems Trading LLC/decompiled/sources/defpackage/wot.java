package defpackage;

import com.yandex.music.shared.play.audio2.data.PlayAudioApi;
import com.yandex.music.shared.play.audio2.data.dto.BulkPlaybacksRequestDto;
import com.yandex.music.shared.play.audio2.data.dto.PlayAudioBundleRequestDto;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wot {
    public final String a = "PlayAudio2:".concat("Uploader");
    public final jyr b;
    public final jyr c;
    public final jyr d;
    public final jyr e;
    public final oi f;

    public wot(cvk cvkVar) {
        this.b = cvkVar.b(hag.I(zuk.class), true);
        this.c = cvkVar.b(hag.I(ivk.class), true);
        this.d = cvkVar.b(hag.I(pvk.class), true);
        this.e = cvkVar.b(hag.I(uuk.class), true);
        tf6 e = gld.e(dm6.b.plus(a4g.n()));
        pm6 pm6Var = pm6.a;
        this.f = bg3.i(e, null, 0, null, new h0t(this, null, 3), 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Enum a(wot wotVar, List list, cg6 cg6Var) {
        vot votVar;
        int i;
        tc7 sc7Var;
        rj6 rj6Var;
        if (cg6Var instanceof vot) {
            votVar = (vot) cg6Var;
            int i2 = votVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                votVar.l = i2 - Integer.MIN_VALUE;
                Object obj = votVar.j;
                nm6 nm6Var = nm6.a;
                i = votVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    pvk pvkVar = (pvk) wotVar.d.getValue();
                    Date date = new Date(System.currentTimeMillis());
                    votVar.l = 1;
                    PlayAudioApi playAudioApi = pvkVar.a;
                    jyr b = btf.b(new x6s(6));
                    jyr b2 = btf.b(new x6s(7));
                    jyr b3 = btf.b(new x6s(8));
                    lm4 a = ern.a(rc7.class);
                    if (a.equals(ern.a(qc7.class))) {
                        sc7Var = new qc7(date, ((bgs) b.getValue()).a(date));
                    } else if (a.equals(ern.a(rc7.class))) {
                        sc7Var = new rc7(date, ((bgs) b2.getValue()).a(date));
                    } else {
                        if (!a.equals(ern.a(sc7.class))) {
                            xq0.x("Add this type to method");
                            return null;
                        }
                        sc7Var = new sc7(date, ((bgs) b3.getValue()).a(date));
                    }
                    rc7 rc7Var = (rc7) sc7Var;
                    list.getClass();
                    List list2 = list;
                    ArrayList arrayList = new ArrayList(v75.o(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ruk rukVar = (ruk) it.next();
                        rukVar.getClass();
                        String a2 = rukVar.a();
                        String str = rukVar.O;
                        String str2 = !Intrinsics.d(str, CommonUrlParts.Values.FALSE_INTEGER) ? str : null;
                        String str3 = rukVar.a;
                        String str4 = rukVar.b;
                        Boolean bool = rukVar.c;
                        String str5 = rukVar.d;
                        String str6 = rukVar.e;
                        String str7 = rukVar.f;
                        String str8 = rukVar.g;
                        Iterator it2 = it;
                        String str9 = rukVar.h;
                        Float f = rukVar.i;
                        Float f2 = rukVar.j;
                        Float f3 = rukVar.k;
                        Boolean bool2 = rukVar.l;
                        Boolean bool3 = rukVar.m;
                        Float f4 = rukVar.n;
                        String str10 = rukVar.o;
                        String str11 = rukVar.p;
                        String str12 = rukVar.q;
                        String str13 = rukVar.r;
                        Boolean bool4 = rukVar.s;
                        Boolean bool5 = rukVar.t;
                        Boolean bool6 = rukVar.u;
                        String str14 = rukVar.v;
                        String str15 = rukVar.w;
                        String str16 = rukVar.x;
                        String str17 = rukVar.y;
                        String str18 = rukVar.z;
                        String str19 = rukVar.A;
                        String str20 = rukVar.B;
                        String str21 = rukVar.C;
                        Boolean bool7 = rukVar.D;
                        String str22 = rukVar.E;
                        String str23 = rukVar.F;
                        Boolean bool8 = rukVar.G;
                        gxc gxcVar = rukVar.H;
                        String str24 = gxcVar != null ? gxcVar.a : null;
                        String str25 = gxcVar != null ? gxcVar.b : null;
                        gj gjVar = rukVar.I;
                        String str26 = gjVar != null ? gjVar.b : null;
                        String str27 = gjVar != null ? gjVar.c : null;
                        String str28 = gjVar != null ? gjVar.a : null;
                        String str29 = gjVar != null ? gjVar.d : null;
                        String str30 = gjVar != null ? gjVar.e : null;
                        String str31 = rukVar.J;
                        Boolean bool9 = rukVar.K;
                        Float f5 = rukVar.L;
                        e4c e4cVar = rukVar.M;
                        arrayList.add(new PlayAudioBundleRequestDto(a2, str2, str3, str4, bool, str5, str6, str7, str8, str9, f, f2, f3, bool2, bool3, f4, str10, str11, str12, str13, bool4, bool5, bool6, str14, str15, str16, str17, str18, str19, str20, str21, bool7, str22, bool8, str23, str24, str25, str28, str26, str27, str29, str30, str31, bool9, f5, e4cVar != null ? e4cVar.a : null, rukVar.N));
                        it = it2;
                    }
                    obj = uwf.h(playAudioApi.a(rc7Var.a, new BulkPlaybacksRequestDto(arrayList)), votVar);
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
                rj6Var = (rj6) obj;
                if (!(rj6Var instanceof qj6)) {
                    return uot.a;
                }
                if (rj6Var instanceof mj6) {
                    int i3 = ((mj6) rj6Var).a;
                    return (i3 == 401 || i3 == 408 || i3 == 429) ? uot.b : (400 > i3 || i3 >= 500) ? uot.b : uot.a;
                }
                if (rj6Var instanceof oj6) {
                    return uot.b;
                }
                if (rj6Var instanceof nj6) {
                    return uot.a;
                }
                b6e.s();
                return null;
            }
        }
        votVar = new vot(wotVar, cg6Var);
        Object obj2 = votVar.j;
        nm6 nm6Var2 = nm6.a;
        i = votVar.l;
        if (i != 0) {
        }
        rj6Var = (rj6) obj2;
        if (!(rj6Var instanceof qj6)) {
        }
    }
}
