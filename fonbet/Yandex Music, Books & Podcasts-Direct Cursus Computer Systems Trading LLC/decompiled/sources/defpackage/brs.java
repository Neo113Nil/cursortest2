package defpackage;

import android.content.Context;
import android.os.Parcelable;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsLastCommand;
import com.yandex.music.shared.playback.utils.api.commands.AddPlayablesAsNextCommand;
import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.f;

/* loaded from: classes4.dex */
public class brs implements tbb {
    public final mqs a;
    public final gj b;
    public final zus c;
    public final m d;
    public final Context e;
    public final nnk f;
    public final muo g;
    public final ovs h;
    public final e6v i;
    public final String j;
    public final kxi k;
    public final jtc l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final jyr w;
    public final jyr x;
    public final dn9 y;
    public final jyr z;

    public brs(mqs mqsVar, gj gjVar, zus zusVar, m mVar, Context context, cus cusVar, nnk nnkVar, muo muoVar, ovs ovsVar, e6v e6vVar, String str, kxi kxiVar, jtc jtcVar) {
        mqsVar.getClass();
        zusVar.getClass();
        context.getClass();
        kxiVar.getClass();
        this.a = mqsVar;
        this.b = gjVar;
        this.c = zusVar;
        this.d = mVar;
        this.e = context;
        this.f = nnkVar;
        this.g = muoVar;
        this.h = ovsVar;
        this.i = e6vVar;
        this.j = str;
        this.k = kxiVar;
        this.l = jtcVar;
        bdt I = hag.I(frt.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        l18Var.b(hag.I(vyk.class), true);
        this.n = l18Var.b(hag.I(k1l.class), true);
        this.o = l18Var.b(hag.I(t3g.class), true);
        this.p = l18Var.b(hag.I(gx.class), true);
        this.q = l18Var.b(hag.I(raa.class), true);
        this.r = l18Var.b(hag.I(kij.class), true);
        this.s = l18Var.b(hag.I(z66.class), true);
        this.t = l18Var.b(hag.I(r1l.class), true);
        this.u = l18Var.b(hag.I(k8w.class), true);
        this.v = l18Var.b(hag.I(oq7.class), true);
        this.w = l18Var.b(hag.I(ass.class), true);
        this.x = l18Var.b(hag.I(lwc.class), true);
        ((f) l18Var.b(hag.I(f.class), true).getValue()).getClass();
        this.y = new dn9(context, f.d(), mVar, str, kxiVar);
        this.z = btf.b(new rqs(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0501  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x05bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(final brs brsVar, final mqs mqsVar, zus zusVar, boolean z, boolean z2, boolean z3, s1t s1tVar, j1g j1gVar, cg6 cg6Var) {
        wqs wqsVar;
        int i;
        ArrayList q;
        wqs wqsVar2;
        ovs ovsVar;
        boolean z4;
        pq pqVar;
        muo muoVar;
        ArrayList arrayList;
        nm6 nm6Var;
        ovs ovsVar2;
        wqs wqsVar3;
        int i2;
        muo muoVar2;
        final int i3;
        pq pqVar2;
        j1g j1gVar2;
        mqs mqsVar2;
        boolean z5;
        brs brsVar2;
        ArrayList arrayList2;
        Object zeVar;
        mqs mqsVar3;
        brs brsVar3;
        ArrayList arrayList3;
        ArrayList arrayList4;
        boolean containsKey;
        int i4;
        Object kl5Var;
        Object obj;
        boolean containsKey2;
        zus zusVar2 = zusVar;
        boolean z6 = z2;
        boolean z7 = z3;
        s1t s1tVar2 = s1tVar;
        final jtc jtcVar = brsVar.l;
        ovs ovsVar3 = brsVar.h;
        muo muoVar3 = brsVar.g;
        if (cg6Var instanceof wqs) {
            wqsVar = (wqs) cg6Var;
            int i5 = wqsVar.v;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                wqsVar.v = i5 - Integer.MIN_VALUE;
                wqs wqsVar4 = wqsVar;
                Object obj2 = wqsVar4.t;
                nm6 nm6Var2 = nm6.a;
                i = wqsVar4.v;
                if (i != 0) {
                    q = su4.q(obj2);
                    boolean K = u2x.K(mqsVar.d);
                    if (mqsVar.k == dg2.b) {
                        if (mqsVar.p() && !mqsVar.C()) {
                            q.add(new lvp(new xb5(new tqs(brsVar, mqsVar, 8), Integer.valueOf(R.drawable.ic_share_new_24), R.string.menu_element_share, null, null, false, Integer.valueOf(R.string.dialog_action_description_share), null, false, false, null, 1880), dh.a));
                        }
                        if (z) {
                            ArrayList arrayList5 = new ArrayList();
                            final wes wesVar = new wes(2, brsVar, mqsVar);
                            final m mVar = brsVar.d;
                            final k1l k1lVar = (k1l) brsVar.n.getValue();
                            k1lVar.getClass();
                            wqsVar2 = wqsVar4;
                            final int i6 = 1;
                            ovsVar = ovsVar3;
                            z4 = K;
                            pqVar = null;
                            arrayList5.add(new awk(new xb5(new Function0() { // from class: sl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            String t = weo.t();
                                            mVar.e();
                                            xlb xlbVar = xlb.End;
                                            t.getClass();
                                            jtcVar.y().c(xlbVar, t);
                                            k1lVar.a(new AddPlayablesAsLastCommand((List) wesVar.invoke(t)), new b3t("queue_add"));
                                            break;
                                        default:
                                            String t2 = weo.t();
                                            mVar.e();
                                            xlb xlbVar2 = xlb.Next;
                                            t2.getClass();
                                            jtcVar.y().c(xlbVar2, t2);
                                            k1lVar.a(new AddPlayablesAsNextCommand((List) wesVar.invoke(t2)), new b3t("queue_add"));
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, Integer.valueOf(R.drawable.ic_play_next_24), R.string.menu_element_play_next, null, null, false, Integer.valueOf(R.string.dialog_action_description_play_next), null, false, false, null, 1368), dh.h));
                            final k1l k1lVar2 = (k1l) brsVar.n.getValue();
                            k1lVar2.getClass();
                            final int i7 = 0;
                            arrayList5.add(new tl(new xb5(new Function0() { // from class: sl
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            String t = weo.t();
                                            mVar.e();
                                            xlb xlbVar = xlb.End;
                                            t.getClass();
                                            jtcVar.y().c(xlbVar, t);
                                            k1lVar2.a(new AddPlayablesAsLastCommand((List) wesVar.invoke(t)), new b3t("queue_add"));
                                            break;
                                        default:
                                            String t2 = weo.t();
                                            mVar.e();
                                            xlb xlbVar2 = xlb.Next;
                                            t2.getClass();
                                            jtcVar.y().c(xlbVar2, t2);
                                            k1lVar2.a(new AddPlayablesAsNextCommand((List) wesVar.invoke(t2)), new b3t("queue_add"));
                                            break;
                                    }
                                    return Unit.a;
                                }
                            }, Integer.valueOf(R.drawable.ic_add_to_queue_24), R.string.menu_element_add_to_queue, null, null, false, Integer.valueOf(R.string.dialog_action_description_add_to_queue), null, false, false, null, 1368), dh.i));
                            z75.t(q, arrayList5);
                        } else {
                            wqsVar2 = wqsVar4;
                            ovsVar = ovsVar3;
                            z4 = K;
                            pqVar = null;
                        }
                        if (muoVar3 != muo.TRAILER) {
                            dn9 dn9Var = brsVar.y;
                            List c = t75.c(mqsVar);
                            dn9Var.getClass();
                            c.getClass();
                            l18 l18Var = l18.b;
                            bdt I = hag.I(lwc.class);
                            qdc qdcVar = l18Var.a;
                            qdcVar.getClass();
                            if (((lwc) qdcVar.C(I)).a()) {
                                muoVar = muoVar3;
                                arrayList = q;
                                nm6Var = nm6Var2;
                                zeVar = pqVar;
                                ovsVar2 = ovsVar;
                                wqsVar3 = wqsVar2;
                            } else {
                                muoVar = muoVar3;
                                arrayList = q;
                                nm6Var = nm6Var2;
                                ovsVar2 = ovsVar;
                                wqsVar3 = wqsVar2;
                                zeVar = new ze(new xb5(new ye(jtcVar, dn9Var, mqsVar, c, 0), Integer.valueOf(R.drawable.ic_cast_24), R.string.play_on_device, null, null, false, Integer.valueOf(R.string.dialog_action_description_picker), null, false, false, null, 1880), dh.b);
                            }
                            if (zeVar != null) {
                                arrayList.add(zeVar);
                            }
                        } else {
                            muoVar = muoVar3;
                            arrayList = q;
                            nm6Var = nm6Var2;
                            ovsVar2 = ovsVar;
                            wqsVar3 = wqsVar2;
                        }
                        arrayList.add(vqs.a[j1gVar.ordinal()] == 1 ? brsVar.p(mqsVar) : brsVar.m(mqsVar));
                        arrayList.add(new wk(new xb5(new tqs(brsVar, mqsVar, 2), Integer.valueOf(R.drawable.ic_add_24), R.string.dialog_action_add_to_playlist, null, null, false, Integer.valueOf(R.string.dialog_action_description_add), null, false, false, null, 1880), dh.j));
                        if (mqsVar.l) {
                            Integer valueOf = Integer.valueOf(R.drawable.ic_check_24);
                            r1l r1lVar = (r1l) brsVar.t.getValue();
                            r1lVar.getClass();
                            Boolean d = r1lVar.d(mqsVar.a);
                            arrayList.add(d != null ? d.booleanValue() : false ? new abh(new xb5(new tqs(brsVar, mqsVar, 5), valueOf, R.string.menu_element_mark_as_unread, Integer.valueOf(R.attr.iconSuccess), null, false, Integer.valueOf(R.string.dialog_action_description_mark_unread), null, false, false, null, 1872), dh.g) : new xah(new xb5(new tqs(brsVar, mqsVar, 6), valueOf, R.string.menu_element_mark_as_read, null, null, false, Integer.valueOf(R.string.dialog_action_description_mark_read), null, false, false, null, 1880), dh.g));
                        }
                        boolean g = ((z66) brsVar.s.getValue()).g();
                        boolean n = mqsVar.n();
                        List list = mqsVar.f;
                        if (n) {
                            final List g2 = g(mqsVar);
                            boolean z8 = g(mqsVar).size() > 1;
                            int ordinal = hld.M(mqsVar.I()).ordinal();
                            if (ordinal == 0) {
                                i2 = z8 ? R.string.dialog_action_move_to_artists : R.string.dialog_action_move_to_artist;
                            } else {
                                if (ordinal != 1) {
                                    b6e.s();
                                    return pqVar;
                                }
                                i2 = z8 ? R.string.dialog_action_move_to_narrators : R.string.dialog_action_move_to_narrator;
                            }
                            if (g2.size() != list.size()) {
                                muoVar2 = muoVar;
                                dfi.r("fullArtists count not equals to baseArtists count, fullArtists: " + g2 + "baseArtists: " + list, "TrackActionEntityManager");
                            } else {
                                muoVar2 = muoVar;
                            }
                            if (g) {
                                i3 = 0;
                                pqVar2 = new pq(i2, new Function0(brsVar) { // from class: uqs
                                    public final /* synthetic */ brs b;

                                    {
                                        this.b = brsVar;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i8 = i3;
                                        ?? r1 = g2;
                                        mqs mqsVar4 = mqsVar;
                                        brs brsVar4 = this.b;
                                        switch (i8) {
                                            case 0:
                                                ef3 ef3Var = ef3.b;
                                                muo muoVar4 = brsVar4.g;
                                                m mVar2 = brsVar4.d;
                                                if (muoVar4 == null) {
                                                    muoVar4 = muo.UNKNOWN;
                                                }
                                                ef3.g(ef3Var, muoVar4, brs.j(mqsVar4), pe3.GO_TO_ARTIST);
                                                mVar2.e();
                                                Collection collection = (Collection) r1;
                                                if (collection.isEmpty()) {
                                                    Parcelable.Creator<c01> creator = c01.CREATOR;
                                                    collection = t75.c(ghh.P(ff7.v(mqsVar4)));
                                                }
                                                mVar2.z((List) collection, hld.M(mqsVar4.I()));
                                                break;
                                            default:
                                                ef3 ef3Var2 = ef3.b;
                                                muo muoVar5 = brsVar4.g;
                                                m mVar3 = brsVar4.d;
                                                if (muoVar5 == null) {
                                                    muoVar5 = muo.UNKNOWN;
                                                }
                                                ef3.g(ef3Var2, muoVar5, brs.j(mqsVar4), pe3.GO_TO_ARTIST);
                                                mVar3.e();
                                                if (mqsVar4.k == dg2.c) {
                                                    Context context = (Context) mVar3.d;
                                                    context.getClass();
                                                    hag.x(context, R.string.track_no_rights_title, 0);
                                                }
                                                if (r1.size() > 1) {
                                                    mVar3.z(r1, hld.M(mqsVar4.I()));
                                                } else {
                                                    Parcelable.Creator<c01> creator2 = c01.CREATOR;
                                                    mVar3.w(ff7.v(mqsVar4));
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            } else {
                                i3 = 0;
                                final int i8 = 1;
                                pqVar2 = new pq(i2, new Function0(brsVar) { // from class: uqs
                                    public final /* synthetic */ brs b;

                                    {
                                        this.b = brsVar;
                                    }

                                    /* JADX WARN: Multi-variable type inference failed */
                                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i82 = i8;
                                        ?? r1 = g2;
                                        mqs mqsVar4 = mqsVar;
                                        brs brsVar4 = this.b;
                                        switch (i82) {
                                            case 0:
                                                ef3 ef3Var = ef3.b;
                                                muo muoVar4 = brsVar4.g;
                                                m mVar2 = brsVar4.d;
                                                if (muoVar4 == null) {
                                                    muoVar4 = muo.UNKNOWN;
                                                }
                                                ef3.g(ef3Var, muoVar4, brs.j(mqsVar4), pe3.GO_TO_ARTIST);
                                                mVar2.e();
                                                Collection collection = (Collection) r1;
                                                if (collection.isEmpty()) {
                                                    Parcelable.Creator<c01> creator = c01.CREATOR;
                                                    collection = t75.c(ghh.P(ff7.v(mqsVar4)));
                                                }
                                                mVar2.z((List) collection, hld.M(mqsVar4.I()));
                                                break;
                                            default:
                                                ef3 ef3Var2 = ef3.b;
                                                muo muoVar5 = brsVar4.g;
                                                m mVar3 = brsVar4.d;
                                                if (muoVar5 == null) {
                                                    muoVar5 = muo.UNKNOWN;
                                                }
                                                ef3.g(ef3Var2, muoVar5, brs.j(mqsVar4), pe3.GO_TO_ARTIST);
                                                mVar3.e();
                                                if (mqsVar4.k == dg2.c) {
                                                    Context context = (Context) mVar3.d;
                                                    context.getClass();
                                                    hag.x(context, R.string.track_no_rights_title, 0);
                                                }
                                                if (r1.size() > 1) {
                                                    mVar3.z(r1, hld.M(mqsVar4.I()));
                                                } else {
                                                    Parcelable.Creator<c01> creator2 = c01.CREATOR;
                                                    mVar3.w(ff7.v(mqsVar4));
                                                }
                                                break;
                                        }
                                        return Unit.a;
                                    }
                                });
                            }
                        } else {
                            muoVar2 = muoVar;
                            pqVar2 = pqVar;
                            i3 = 0;
                        }
                        if (pqVar2 != null) {
                            arrayList.add(pqVar2);
                        }
                        pq h = brsVar.h(mqsVar);
                        if (h != null) {
                            arrayList.add(h);
                        }
                        wqsVar3.j = mqsVar;
                        wqsVar3.k = zusVar2;
                        wqsVar3.l = s1tVar2;
                        wqsVar3.m = j1gVar;
                        wqsVar3.n = arrayList;
                        wqsVar3.o = brsVar;
                        wqsVar3.p = arrayList;
                        wqsVar3.q = z6;
                        wqsVar3.r = z7;
                        boolean z9 = z4;
                        wqsVar3.s = z9;
                        wqsVar3.v = 2;
                        obj2 = brsVar.i(mqsVar, wqsVar3);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        j1gVar2 = j1gVar;
                        mqsVar2 = mqsVar;
                        z5 = z9;
                        brsVar2 = brsVar;
                        arrayList2 = arrayList;
                        brsVar2.getClass();
                        tbb.b(arrayList, obj2);
                        if (!mqsVar2.C()) {
                        }
                        i4 = 1;
                        if (s1tVar2 != null) {
                        }
                        if (z6) {
                        }
                        if (z7) {
                        }
                        arrayList2.add(new fws(new tqs(brsVar, mqsVar2, i3)));
                        if (muoVar2 != muo.TRAILER) {
                        }
                        if (!z5) {
                        }
                        if (a4g.D(gys.AudioBookHolder, mqsVar2)) {
                        }
                        tbb.b(arrayList2, kl5Var);
                        return arrayList2;
                    }
                    if (((m8w) ((k8w) brsVar.u.getValue())).b(mqsVar)) {
                        q.add(vqs.a[j1gVar.ordinal()] == 1 ? brsVar.p(mqsVar) : brsVar.m(mqsVar));
                        pq h2 = brsVar.h(mqsVar);
                        if (h2 != null) {
                            q.add(h2);
                        }
                        wqsVar4.j = mqsVar;
                        wqsVar4.k = zusVar2;
                        wqsVar4.l = s1tVar2;
                        wqsVar4.m = null;
                        wqsVar4.n = q;
                        wqsVar4.o = brsVar;
                        wqsVar4.p = q;
                        wqsVar4.q = z6;
                        wqsVar4.r = z7;
                        wqsVar4.s = K;
                        wqsVar4.v = 1;
                        Object i9 = brsVar.i(mqsVar, wqsVar4);
                        if (i9 == nm6Var2) {
                            return nm6Var2;
                        }
                        brsVar3 = brsVar;
                        arrayList3 = q;
                        obj2 = i9;
                        mqsVar3 = mqsVar;
                        arrayList4 = arrayList3;
                        brsVar3.getClass();
                        tbb.b(arrayList4, obj2);
                        q = arrayList3;
                    } else {
                        mqsVar3 = mqsVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z5 = wqsVar4.s;
                        boolean z10 = wqsVar4.r;
                        boolean z11 = wqsVar4.q;
                        ArrayList arrayList6 = wqsVar4.p;
                        brs brsVar4 = wqsVar4.o;
                        ArrayList arrayList7 = wqsVar4.n;
                        j1g j1gVar3 = wqsVar4.m;
                        s1t s1tVar3 = wqsVar4.l;
                        zus zusVar3 = wqsVar4.k;
                        mqsVar2 = wqsVar4.j;
                        qgg.h0(obj2);
                        ovsVar2 = ovsVar3;
                        j1gVar2 = j1gVar3;
                        arrayList2 = arrayList7;
                        s1tVar2 = s1tVar3;
                        muoVar2 = muoVar3;
                        brsVar2 = brsVar4;
                        pqVar = null;
                        z7 = z10;
                        arrayList = arrayList6;
                        i3 = 0;
                        z6 = z11;
                        zusVar2 = zusVar3;
                        brsVar2.getClass();
                        tbb.b(arrayList, obj2);
                        if (!mqsVar2.C()) {
                            hqs hqsVar = mqsVar2.o;
                            if (((hqsVar == null || !hqsVar.a) ? i3 : 1) != 0 && ((z66) brsVar.s.getValue()).a().b != u0j.a) {
                                i4 = 1;
                                arrayList2.add(new h1h(new xb5(new tqs(brsVar, mqsVar2, i4), Integer.valueOf(R.drawable.ic_tracklyrics_24), u2x.K(mqsVar2.d) ? R.string.dialog_action_show_podcast_info : R.string.dialog_action_show_lyrics, null, null, false, Integer.valueOf(R.string.dialog_action_description_lyrics), null, false, false, null, 1880), dh.m));
                                if (s1tVar2 != null) {
                                    kij kijVar = (kij) brsVar.r.getValue();
                                    String str = mqsVar2.a;
                                    synchronized (kijVar) {
                                        str.getClass();
                                        containsKey2 = kijVar.a.containsKey(str);
                                    }
                                    if (!containsKey2) {
                                        z75.t(arrayList2, brsVar.k(s1tVar2, mqsVar2, ovsVar2));
                                    }
                                }
                                if (z6) {
                                    arrayList2.add(brsVar.l(mqsVar2));
                                }
                                if (z7) {
                                    tbb.b(arrayList2, brsVar.o(mqsVar2, zusVar2));
                                }
                                arrayList2.add(new fws(new tqs(brsVar, mqsVar2, i3)));
                                if (muoVar2 != muo.TRAILER) {
                                    if (mqsVar2.v0) {
                                        i5l i5lVar = l5t.a;
                                        obj = new q4t(new xb5(new tqs(brsVar, mqsVar2, 7), Integer.valueOf(R.drawable.ic_trailer_24), R.string.dialog_action_trailer_track, null, null, false, Integer.valueOf(R.string.dialog_action_trailer_track), null, false, false, null, 1880), dh.D);
                                    } else {
                                        obj = pqVar;
                                    }
                                    tbb.b(arrayList2, obj);
                                }
                                if (!z5) {
                                    if (j1gVar2 != j1g.c) {
                                        i4 = i3;
                                    }
                                    cf cfVar = cf.Negative;
                                    arrayList2.add(i4 != 0 ? new iit(new tqs(brsVar, mqsVar2, 3), cfVar) : new j88(new tqs(brsVar, mqsVar2, 4), cfVar));
                                }
                                if (a4g.D(gys.AudioBookHolder, mqsVar2)) {
                                    kl5Var = pqVar;
                                } else {
                                    kl5Var = new kl5(new tqs(brsVar, mqsVar2, 9), a4g.D(gys.PodcastHolder, mqsVar2) ? R.string.menu_element_complaint_episode : R.string.menu_element_complaint_track);
                                }
                                tbb.b(arrayList2, kl5Var);
                                return arrayList2;
                            }
                        }
                        i4 = 1;
                        if (s1tVar2 != null) {
                        }
                        if (z6) {
                        }
                        if (z7) {
                        }
                        arrayList2.add(new fws(new tqs(brsVar, mqsVar2, i3)));
                        if (muoVar2 != muo.TRAILER) {
                        }
                        if (!z5) {
                        }
                        if (a4g.D(gys.AudioBookHolder, mqsVar2)) {
                        }
                        tbb.b(arrayList2, kl5Var);
                        return arrayList2;
                    }
                    boolean z12 = wqsVar4.r;
                    boolean z13 = wqsVar4.q;
                    ArrayList arrayList8 = wqsVar4.p;
                    brs brsVar5 = wqsVar4.o;
                    ArrayList arrayList9 = wqsVar4.n;
                    s1tVar2 = wqsVar4.l;
                    zus zusVar4 = wqsVar4.k;
                    mqsVar3 = wqsVar4.j;
                    qgg.h0(obj2);
                    z7 = z12;
                    arrayList4 = arrayList8;
                    zusVar2 = zusVar4;
                    arrayList3 = arrayList9;
                    z6 = z13;
                    brsVar3 = brsVar5;
                    brsVar3.getClass();
                    tbb.b(arrayList4, obj2);
                    q = arrayList3;
                }
                if (s1tVar2 != null) {
                    kij kijVar2 = (kij) brsVar.r.getValue();
                    String str2 = mqsVar3.a;
                    synchronized (kijVar2) {
                        str2.getClass();
                        containsKey = kijVar2.a.containsKey(str2);
                    }
                    if (!containsKey && !s1tVar2.equals(q1t.a)) {
                        z75.t(q, brsVar.k(s1tVar2, mqsVar3, ovsVar3));
                    }
                }
                if (!z6 || muoVar3 == muo.DISLIKES) {
                    q.add(new ww7(new tqs(brsVar, mqsVar3, 12)));
                }
                if (z7) {
                    tbb.b(q, brsVar.o(mqsVar3, zusVar2));
                }
                q.add(new fws(new tqs(brsVar, mqsVar3, 0)));
                return q;
            }
        }
        wqsVar = new wqs(brsVar, cg6Var);
        wqs wqsVar42 = wqsVar;
        Object obj22 = wqsVar42.t;
        nm6 nm6Var22 = nm6.a;
        i = wqsVar42.v;
        if (i != 0) {
        }
        if (s1tVar2 != null) {
        }
        if (!z6) {
        }
        q.add(new ww7(new tqs(brsVar, mqsVar3, 12)));
        if (z7) {
        }
        q.add(new fws(new tqs(brsVar, mqsVar3, 0)));
        return q;
    }

    public static List g(mqs mqsVar) {
        n8g I;
        List list = mqsVar.u;
        if (list == null || (I = xp3.I(list)) == null) {
            return c5b.a;
        }
        ArrayList arrayList = new ArrayList(v75.o(I, 10));
        ListIterator listIterator = I.listIterator(0);
        while (true) {
            ezd ezdVar = (ezd) listIterator;
            if (!ezdVar.hasNext()) {
                return arrayList;
            }
            arrayList.add(ghh.P((c01) ezdVar.next()));
        }
    }

    public static df3 j(mqs mqsVar) {
        mqsVar.getClass();
        return a4g.D(gys.NonMusicHolder, mqsVar) ? df3.EPISODE_BOTTOMSHEET : df3.TRACK_BOTTOMSHEET;
    }

    public static fvs r(ovs ovsVar) {
        if (ovsVar instanceof mvs) {
            mvs mvsVar = (mvs) ovsVar;
            return new dvs(mvsVar.a, mvsVar.b);
        }
        if (ovsVar instanceof nvs) {
            nvs nvsVar = (nvs) ovsVar;
            return new evs(nvsVar.a, nvsVar.b);
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.tbb
    public final pjc a() {
        mqs mqsVar = this.a;
        return lg3.K(e(mqsVar), d(mqsVar), f(mqsVar, this.c), (pjc) this.z.getValue(), n().w(mqsVar), new yqs(this, null));
    }

    public pjc d(mqs mqsVar) {
        mqsVar.getClass();
        return new fs(15, Boolean.FALSE);
    }

    public pjc e(mqs mqsVar) {
        mqsVar.getClass();
        return new eno(new af(new rqs(this, 1), null, 0));
    }

    public pjc f(mqs mqsVar, zus zusVar) {
        mqsVar.getClass();
        zusVar.getClass();
        return new fs(15, Boolean.FALSE);
    }

    public final pq h(mqs mqsVar) {
        boolean l = mqsVar.l();
        k10 k10Var = mqsVar.d;
        if (!l || mqsVar.C()) {
            return null;
        }
        boolean K = u2x.K(k10Var);
        boolean z = u2x.z(m20.AudioBook, k10Var.b);
        return new pq(new xb5(new axb(this, mqsVar, K, 3), Integer.valueOf((K || z) ? R.drawable.ic_podcast_and_book_24 : R.drawable.ic_album_24), K ? R.string.dialog_action_move_to_podcast : z ? R.string.dialog_action_move_to_book : R.string.dialog_action_move_to_album, null, null, false, Integer.valueOf(R.string.dialog_action_description_album), null, false, false, null, 1880), dh.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(final mqs mqsVar, cg6 cg6Var) {
        zqs zqsVar;
        int i;
        final oq oqVar;
        Object h;
        Integer valueOf = Integer.valueOf(R.attr.iconLike);
        if (cg6Var instanceof zqs) {
            zqsVar = (zqs) cg6Var;
            int i2 = zqsVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zqsVar.n = i2 - Integer.MIN_VALUE;
                Object obj = zqsVar.l;
                nm6 nm6Var = nm6.a;
                i = zqsVar.n;
                final int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!mqsVar.l() || !u2x.K(mqsVar.d)) {
                        return null;
                    }
                    oqVar = mqsVar.t;
                    if (oqVar == null) {
                        Parcelable.Creator<oq> creator = oq.CREATOR;
                        oqVar = cxb.O(mqsVar);
                    }
                    t3g n = n();
                    zqsVar.j = mqsVar;
                    zqsVar.k = oqVar;
                    zqsVar.n = 1;
                    h = n.h(oqVar, zqsVar);
                    if (h == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    oq oqVar2 = zqsVar.k;
                    mqs mqsVar2 = zqsVar.j;
                    qgg.h0(obj);
                    oqVar = oqVar2;
                    mqsVar = mqsVar2;
                    h = obj;
                }
                if (((Boolean) h).booleanValue()) {
                    Function0 function0 = new Function0(this) { // from class: sqs
                        public final /* synthetic */ brs b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i3) {
                                case 0:
                                    ef3 ef3Var = ef3.b;
                                    brs brsVar = this.b;
                                    muo muoVar = brsVar.g;
                                    if (muoVar == null) {
                                        muoVar = muo.UNKNOWN;
                                    }
                                    ef3.g(ef3Var, muoVar, brs.j(mqsVar), pe3.UNSUBSCRIBE);
                                    brsVar.l.C(sjb.UnsubscribeFromPodcast);
                                    t3g n2 = brsVar.n();
                                    n2.getClass();
                                    oq oqVar3 = oqVar;
                                    oqVar3.getClass();
                                    x97.y(n2.a, null, null, new s3g(n2, oqVar3, null, 1), 3);
                                    lg3.d0("Tracks_TrackMenu_Dislike_Album_From_Episode");
                                    brsVar.d.f();
                                    break;
                                default:
                                    ef3 ef3Var2 = ef3.b;
                                    brs brsVar2 = this.b;
                                    muo muoVar2 = brsVar2.g;
                                    if (muoVar2 == null) {
                                        muoVar2 = muo.UNKNOWN;
                                    }
                                    ef3.g(ef3Var2, muoVar2, brs.j(mqsVar), pe3.SUBSCRIBE);
                                    brsVar2.l.C(sjb.SubscribeToPodcast);
                                    brsVar2.n().q(oqVar);
                                    lg3.d0("Tracks_TrackMenu_Like_Album_From_episode");
                                    brsVar2.d.f();
                                    break;
                            }
                            return Unit.a;
                        }
                    };
                    jsg jsgVar = new jsg(R.string.menu_element_like_podcast_from_episode, 15);
                    return new qzf(new xb5(function0, new jsg(R.drawable.ic_like_unactive_24, 5), jsgVar, new jsg(R.drawable.ic_like_active_24, 5), Integer.valueOf(R.string.dialog_action_description_like_album), null, null, valueOf, new jsg(R.string.accessibility_check_action, 15), 3776), dh.k);
                }
                final int i4 = 0;
                Function0 function02 = new Function0(this) { // from class: sqs
                    public final /* synthetic */ brs b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                ef3 ef3Var = ef3.b;
                                brs brsVar = this.b;
                                muo muoVar = brsVar.g;
                                if (muoVar == null) {
                                    muoVar = muo.UNKNOWN;
                                }
                                ef3.g(ef3Var, muoVar, brs.j(mqsVar), pe3.UNSUBSCRIBE);
                                brsVar.l.C(sjb.UnsubscribeFromPodcast);
                                t3g n2 = brsVar.n();
                                n2.getClass();
                                oq oqVar3 = oqVar;
                                oqVar3.getClass();
                                x97.y(n2.a, null, null, new s3g(n2, oqVar3, null, 1), 3);
                                lg3.d0("Tracks_TrackMenu_Dislike_Album_From_Episode");
                                brsVar.d.f();
                                break;
                            default:
                                ef3 ef3Var2 = ef3.b;
                                brs brsVar2 = this.b;
                                muo muoVar2 = brsVar2.g;
                                if (muoVar2 == null) {
                                    muoVar2 = muo.UNKNOWN;
                                }
                                ef3.g(ef3Var2, muoVar2, brs.j(mqsVar), pe3.SUBSCRIBE);
                                brsVar2.l.C(sjb.SubscribeToPodcast);
                                brsVar2.n().q(oqVar);
                                lg3.d0("Tracks_TrackMenu_Like_Album_From_episode");
                                brsVar2.d.f();
                                break;
                        }
                        return Unit.a;
                    }
                };
                jsg jsgVar2 = new jsg(R.string.menu_element_dislike_podcast, 15);
                return new ukt(new xb5(function02, new jsg(R.drawable.ic_like_active_24, 5), jsgVar2, new jsg(R.drawable.ic_like_unactive_24, 5), Integer.valueOf(R.string.dialog_action_description_unlike_album), null, null, valueOf, new jsg(R.string.accessibility_uncheck_action, 15), 3776), dh.k);
            }
        }
        zqsVar = new zqs(this, cg6Var);
        Object obj2 = zqsVar.l;
        nm6 nm6Var2 = nm6.a;
        i = zqsVar.n;
        final int i32 = 1;
        if (i != 0) {
        }
        if (((Boolean) h).booleanValue()) {
        }
    }

    public final List k(s1t s1tVar, mqs mqsVar, ovs ovsVar) {
        boolean equals = s1tVar.equals(r1t.a);
        jyr jyrVar = this.q;
        m mVar = this.d;
        jtc jtcVar = this.l;
        if (equals) {
            qe3 y = jtcVar.y();
            raa raaVar = (raa) jyrVar.getValue();
            eca ecaVar = eca.d;
            eca i = d51.i(mqsVar, ovsVar != null ? r(ovsVar) : null);
            y.getClass();
            raaVar.getClass();
            return t75.c(new eit(new xb5(new lt3(y, mVar, raaVar, i, 1), Integer.valueOf(R.drawable.ic_trash_24), R.string.dialog_action_delete_from_phone_memory, null, null, false, Integer.valueOf(R.string.dialog_action_description_uncache), null, false, false, null, 1880), dh.d));
        }
        if (!s1tVar.equals(q1t.a)) {
            b6e.s();
            return null;
        }
        qe3 y2 = jtcVar.y();
        eca ecaVar2 = eca.d;
        eca i2 = d51.i(mqsVar, ovsVar != null ? r(ovsVar) : null);
        raa raaVar2 = (raa) jyrVar.getValue();
        z66 z66Var = (z66) this.s.getValue();
        boolean a = ((lwc) this.x.getValue()).a();
        Context context = this.e;
        context.getClass();
        y2.getClass();
        raaVar2.getClass();
        z66Var.getClass();
        return t75.c(new vo3(new xb5(new uo3(a, mVar, y2, z66Var, raaVar2, i2, context), Integer.valueOf(R.drawable.ic_download_24), R.string.dialog_action_download, null, null, false, Integer.valueOf(R.string.dialog_action_description_cache), null, false, false, null, 1368), dh.d));
    }

    public xe l(mqs mqsVar) {
        return new ww7(new tqs(this, mqsVar, 12));
    }

    public final pzf m(mqs mqsVar) {
        mqsVar.getClass();
        int i = a4g.D(gys.MyMusic, mqsVar) ? R.string.my_shelf_menu_like : R.string.menu_element_like;
        tqs tqsVar = new tqs(this, mqsVar, 11);
        Integer valueOf = Integer.valueOf(R.attr.iconLike);
        return new pzf(new xb5(tqsVar, new jsg(R.drawable.ic_like_unactive_24, 5), new jsg(i, 15), new jsg(R.drawable.ic_like_active_24, 5), Integer.valueOf(R.string.dialog_action_description_like), null, null, valueOf, new jsg(R.string.accessibility_check_action, 15), 3776), dh.c);
    }

    public final t3g n() {
        return (t3g) this.o.getValue();
    }

    public xe o(mqs mqsVar, zus zusVar) {
        mqsVar.getClass();
        zusVar.getClass();
        return null;
    }

    public final tkt p(mqs mqsVar) {
        mqsVar.getClass();
        int i = a4g.D(gys.MyMusic, mqsVar) ? R.string.my_shelf_menu_unlike : R.string.dialog_action_neutral_state;
        tqs tqsVar = new tqs(this, mqsVar, 10);
        return new tkt(new xb5(tqsVar, new jsg(R.drawable.ic_like_active_24, 5), new jsg(i, 15), new jsg(R.drawable.ic_like_unactive_24, 5), Integer.valueOf(R.string.dialog_action_description_unlike), null, Integer.valueOf(R.attr.iconLike), null, new jsg(R.string.accessibility_uncheck_action, 15), 3648), dh.c);
    }

    public void q(mqs mqsVar) {
        mqsVar.getClass();
        v5g.O(this.e, ((frt) this.m.getValue()).c(), a4g.D(gys.PodcastHolder, mqsVar) ? R.string.podcast_added_to_favorites : a4g.D(gys.AudioBookHolder, mqsVar) ? R.string.bookmate_audiobook_added_to_favorites : R.string.track_added_to_favorites);
        this.l.C(sjb.Like);
        n().t(mqsVar);
        fx fxVar = fx.a;
        gj gjVar = this.b;
        if (gjVar != null) {
            ((gx) this.p.getValue()).a(fxVar, mqsVar.a, gjVar);
        }
        this.d.f();
    }
}
