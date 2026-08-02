package defpackage;

import android.content.Context;
import com.yandex.music.shared.network.api.retrofit.MusicCommonHttpException;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.videoclip.VideoClipActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class de implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ de(int i, int i2, Object obj, String str) {
        this.a = i2;
        this.b = i;
        this.c = str;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        jab jabVar;
        int i = this.a;
        int i2 = 4;
        syt sytVar = syt.a;
        int i3 = 21;
        int i4 = 0;
        int i5 = 1;
        Continuation continuation = null;
        int i6 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                be beVar = (be) obj2;
                ie ieVar = (ie) obj;
                String str = ieVar.d;
                String str2 = ieVar.e;
                int i7 = i6 + 1;
                ge geVar = beVar.a;
                if (str != null && str.length() != 0) {
                    pkb pkbVar = pkb.NonApplicable;
                    String str3 = geVar.c.c.a;
                    str3.getClass();
                    rmb.k(geVar.b, str, new thj(pkbVar, str3, i7, 1, ""), null, 4);
                    beVar.b.u(str, str2);
                }
                return Unit.a;
            case 1:
                rmb rmbVar = ((zr) obj2).c;
                pkb pkbVar2 = pkb.Wave;
                String str4 = ((dou) obj).a;
                str4.getClass();
                return rmbVar.b(new thj(pkbVar2, str4, i6 + 1, 1, ""));
            case 2:
                ml1 ml1Var = (ml1) obj2;
                g0l.o(ml1Var.f, new icr(i6), ml1Var.i, ml1Var.e, new w5l(ml1Var.g, new jab(qkb.Tracks, 1, 1, 0), szf.M((mqs) obj, 0, i6), null), "mobile-artist-artist-default", y5g.p0(ml1Var.h, k3q.a), 1984);
                return Unit.a;
            case 3:
                dz1 dz1Var = (dz1) obj2;
                g0l g0lVar = dz1Var.e;
                icr icrVar = new icr(i6);
                List list = dz1Var.a.p;
                g0l.o(g0lVar, icrVar, list, dz1Var.f, new w5l(dz1Var.g, new jab(qkb.Chapters, 1, 1, 0), szf.M((mqs) obj, 0, i6), null), "mobile-own_tracks-track-default", y5g.A0(list, sytVar), 1984);
                return Unit.a;
            case 4:
                return ((b04) obj2).g.b(gld.I((u51) obj, i6));
            case 5:
                dou douVar = (dou) obj;
                l14 l14Var = ((g14) obj2).a;
                cvo cvoVar = l14Var.f.b.b;
                qkb qkbVar = qkb.Carousel;
                lht lhtVar = (lht) l14Var.j.getValue();
                if (!(lhtVar instanceof lgt)) {
                    if (!(lhtVar instanceof ygt)) {
                        b6e.s();
                        return null;
                    }
                    i4 = ((ygt) lhtVar).b.size();
                }
                jab jabVar2 = new jab(qkbVar, 1, 2, i4);
                pkb pkbVar3 = pkb.Wave;
                String str5 = douVar.a;
                str5.getClass();
                return new u5l(cvoVar, jabVar2, new thj(pkbVar3, str5, i6 + 1, 1, ""), null);
            case 6:
                ip4 ip4Var = (ip4) obj2;
                z9u z9uVar = (z9u) obj;
                ip4Var.getClass();
                z9uVar.getClass();
                String str6 = z9uVar.b;
                jht jhtVar = (jht) ip4Var.d.getValue();
                if (jhtVar instanceof wgt) {
                    ArrayList arrayList = ((wgt) jhtVar).b;
                    ArrayList arrayList2 = new ArrayList(v75.o(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((z9u) it.next()).b);
                    }
                    rmb rmbVar2 = ip4Var.c;
                    wjb wjbVar = wjb.VideoScreen;
                    pkb pkbVar4 = pkb.Video;
                    str6.getClass();
                    rmb.j(rmbVar2, wjbVar, new thj(pkbVar4, str6, i6 + 1, 1, ""), null, 12);
                    kkp kkpVar = ip4Var.a;
                    boolean z = z9uVar.i;
                    ip4Var.b.a(weo.t());
                    Context context = (Context) kkpVar.b;
                    str6.getClass();
                    if (!((ayk) ((jyr) kkpVar.e).getValue()).b(str6, z)) {
                        Iterator it2 = arrayList2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                Object next = it2.next();
                                if (i4 < 0) {
                                    u75.n();
                                    throw null;
                                }
                                if (!Intrinsics.d((String) next, str6)) {
                                    i4++;
                                }
                            } else {
                                i4 = -1;
                            }
                        }
                        Integer valueOf = Integer.valueOf(i4);
                        if (i4 == -1) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            xee a = ((g3u) ((jyr) kkpVar.d).getValue()).a();
                            if (a.equals(f94.j)) {
                                jyr jyrVar = VideoClipActivity.y;
                                context.startActivity(l3l.d(context, arrayList2, intValue, (wmn) kkpVar.c));
                            } else {
                                if (!(a instanceof e94)) {
                                    b6e.s();
                                    return null;
                                }
                                new lum(context).Q(((e94) a).j);
                            }
                        }
                    }
                }
                return Unit.a;
            case 7:
                ((y26) obj2).d(i6, ((c36) ((e36) obj)).a.a);
                return Unit.a;
            case 8:
                return new MusicCommonHttpException(i6, (String) obj2, (String) obj);
            case 9:
                ((ruq) obj2).k(i6, null, (mm6) obj);
                return Unit.a;
            case 10:
                Function1 function1 = (Function1) obj;
                if (((o3k) obj2).j() != i6) {
                    function1.invoke(Integer.valueOf(i6));
                }
                return Unit.a;
            case 11:
                tea teaVar = (tea) obj2;
                teaVar.e.n(new icr(i6), new hv0(teaVar, continuation, i2), teaVar.f, new w5l(teaVar.g, new jab(qkb.Chapters, 1, 1, 0), szf.M((mqs) obj, 0, i6), null), "mobile-downloads_audiobooks-track-default", new c68(23), b0l.b, true, new evk(i3));
                return Unit.a;
            case 12:
                rfa rfaVar = (rfa) obj2;
                rfaVar.e.n(new icr(i6), new hv0(rfaVar, continuation, 5), rfaVar.f, new w5l(rfaVar.g, new jab(qkb.Tracks, 1, 1, 0), szf.M((mqs) obj, 0, i6), null), "mobile-downloads_kids-track-default", new c68(24), b0l.b, true, new evk(i3));
                return Unit.a;
            case 13:
                xha xhaVar = (xha) obj2;
                xhaVar.e.n(new icr(i6), new hv0(xhaVar, continuation, 6), xhaVar.f, new w5l(xhaVar.g, new jab(qkb.Episodes, 1, 1, 0), szf.M((mqs) obj, 0, i6), null), "mobile-downloads_podcasts-track-default", new xga(i5), b0l.b, true, new evk(i3));
                return Unit.a;
            case 14:
                p1b p1bVar = (p1b) obj;
                q43 q43Var = ((s1b) obj2).a.e;
                cvo cvoVar2 = q43Var.b.b;
                b70 b70Var = q43Var.c;
                if (b70Var != null) {
                    dou douVar2 = p1bVar.b;
                    return new v5l(cvoVar2, b70Var, new d70(douVar2.a, c70.e, douVar2.c, this.b, ""));
                }
                xq0.x("Required value was null.");
                return null;
            case 15:
                nav navVar = (nav) obj;
                q43 q43Var2 = ((d2b) obj2).a.e;
                cvo cvoVar3 = q43Var2.b.b;
                b70 b70Var2 = q43Var2.c;
                if (b70Var2 != null) {
                    return new v5l(cvoVar3, b70Var2, zdg.J(navVar, i6, ""));
                }
                xq0.x("Required value was null.");
                return null;
            case 16:
                String str7 = (String) obj2;
                pdb pdbVar = (pdb) obj;
                mhp[] mhpVarArr = new mhp[i6];
                for (int i8 = 0; i8 < i6; i8++) {
                    mhpVarArr[i8] = avf.y(str7 + '.' + pdbVar.e[i8], emr.e, new mhp[0]);
                }
                return mhpVarArr;
            case 17:
                e7c e7cVar = (e7c) obj2;
                y6c y6cVar = (y6c) obj;
                e7cVar.getClass();
                y6cVar.getClass();
                qne qneVar = e7cVar.b;
                String str8 = y6cVar.e;
                w1g.y((Context) qneVar.a, str8, true);
                q43 q43Var3 = e7cVar.a.d;
                String str9 = y6cVar.a;
                c70 c70Var = c70.h;
                String str10 = y6cVar.c;
                q43Var3.e(new d70(str9, c70Var, str10 == null ? "" : str10, this.b, ""), str8);
                return Unit.a;
            case 18:
                ((Function2) obj2).invoke(((zze) obj).a, Integer.valueOf(i6));
                return Unit.a;
            case 19:
                ((Function2) obj2).invoke(((vze) obj).a, Integer.valueOf(i6));
                return Unit.a;
            case 20:
                ((Function2) obj2).invoke(((wze) obj).a, Integer.valueOf(i6));
                return Unit.a;
            case 21:
                ((Function2) obj2).invoke(((a0f) obj).a, Integer.valueOf(i6));
                return Unit.a;
            case 22:
                k0f k0fVar = (k0f) obj2;
                return new v5l(k0fVar.e(), k0fVar.f(), vwb.Z((d0f) obj, i6, ""));
            case 23:
                k0f k0fVar2 = (k0f) obj2;
                return new v5l(k0fVar2.e(), k0fVar2.f(), vwb.Z((e0f) obj, i6, ""));
            case 24:
                k0f k0fVar3 = (k0f) obj2;
                return new v5l(k0fVar3.e(), k0fVar3.f(), vwb.Z((b0f) obj, i6, ""));
            case 25:
                ((Function2) obj2).invoke(Integer.valueOf(i6), (m0s) obj);
                return Unit.a;
            case 26:
                ((Function2) obj2).invoke((wf) obj, Integer.valueOf(i6));
                return Unit.a;
            case 27:
                r5h r5hVar = (r5h) obj2;
                r5hVar.e.n(new icr(i6), new hv0(r5hVar, continuation, 16), r5hVar.f, new w5l(r5hVar.g, new jab(qkb.Tracks, 1, 1, 0), szf.M((mqs) obj, 0, i6), null), "mobile-own_tracks-track-default", new s2h(9), b0l.b, true, new evk(i3));
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                o2j o2jVar = (o2j) obj2;
                t2j t2jVar = (t2j) obj;
                cvo cvoVar4 = o2jVar.d;
                b70 b70Var3 = o2jVar.a.e.c;
                if (b70Var3 != null) {
                    t2jVar.getClass();
                    return new v5l(cvoVar4, b70Var3, new d70(t2jVar.a, c70.l, t2jVar.b, this.b, ""));
                }
                xq0.x("Required value was null.");
                return null;
            default:
                mdj mdjVar = (mdj) obj2;
                mqs mqsVar = (mqs) obj;
                int ordinal = mdjVar.i.ordinal();
                if (ordinal == 0) {
                    jabVar = new jab(qkb.Chapters, 1, 1, 0);
                } else {
                    if (ordinal != 1) {
                        b6e.s();
                        return null;
                    }
                    jabVar = new jab(qkb.Episodes, 1, 1, 0);
                }
                g0l g0lVar2 = mdjVar.f;
                icr icrVar2 = new icr(i6);
                List list2 = mdjVar.b.w;
                g0l.o(g0lVar2, icrVar2, list2, mdjVar.g, new w5l(mdjVar.h, jabVar, szf.M(mqsVar, 0, i6), null), "mobile-own_tracks-track-default", y5g.A0(list2, sytVar), 1984);
                return Unit.a;
        }
    }

    public /* synthetic */ de(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ de(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
