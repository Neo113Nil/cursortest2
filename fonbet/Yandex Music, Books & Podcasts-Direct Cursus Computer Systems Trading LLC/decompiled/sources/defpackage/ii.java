package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.PatternSyntaxException;
import kotlin.KotlinVersion;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.exception.network.c;
import ru.yandex.video.m3.player.PlaybackException;

/* loaded from: classes.dex */
public final class ii extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(mm6 mm6Var, Function1 function1, oxn oxnVar, aqi aqiVar, aqi aqiVar2) {
        super(1);
        this.r = 29;
        this.s = mm6Var;
        this.t = function1;
        this.u = oxnVar;
        this.w = aqiVar;
        this.v = aqiVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v0, types: [dp8, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v14, types: [uzb] */
    /* JADX WARN: Type inference failed for: r9v0, types: [dp8, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        szb szbVar;
        List list;
        mrn mrnVar;
        float f;
        gc9 gc9Var;
        hb9 hb9Var;
        cb9 cb9Var;
        gc9 gc9Var2;
        float f2;
        int i;
        cc9 cc9Var;
        boolean z;
        won s5wVar;
        int i2 = this.r;
        int i3 = 4;
        int i4 = 0;
        rtp rtpVar = null;
        r7 = null;
        rc8 rc8Var = null;
        Object obj2 = this.t;
        ?? r9 = this.v;
        ?? r10 = this.w;
        ?? r11 = this.u;
        Object obj3 = this.s;
        switch (i2) {
            case 0:
                ai aiVar = (ai) obj3;
                aiVar.a = ((fi) obj2).c((String) r11, (uh) r9, new gi(i4, (aqi) r10));
                break;
            case 1:
                bxf bxfVar = (bxf) obj;
                nwf nwfVar = ((ch0) obj2).a;
                bxfVar.h = (ybs) obj3;
                bxfVar.i = (ide) r11;
                bxfVar.c = (lma) r9;
                bxfVar.d = (Function1) r10;
                bxfVar.e = nwfVar != null ? nwfVar.p : null;
                bxfVar.f = nwfVar != null ? nwfVar.q : null;
                bxfVar.g = nwfVar != null ? (aeu) men.t(nwfVar, es5.s) : null;
                break;
            case 2:
                jhm jhmVar = (jhm) obj3;
                jhmVar.n.addView(jhmVar, jhmVar.o);
                jhmVar.t((Function0) obj2, (phm) r9, (String) r11, (xof) r10);
                break;
            case 3:
                jos josVar = (jos) obj;
                josVar.getClass();
                ihk ihkVar = (ihk) obj3;
                String str = ihkVar.a;
                kos kosVar = josVar.a;
                j03 j03Var = (j03) obj2;
                break;
            case 4:
                jos josVar2 = (jos) obj;
                josVar2.getClass();
                ihk ihkVar2 = (ihk) obj3;
                String str2 = ihkVar2.a;
                kos kosVar2 = josVar2.a;
                String str3 = kosVar2.b;
                j03 j03Var2 = (j03) obj2;
                z9h z9hVar = j03Var2.q;
                z9hVar.getClass();
                break;
            case 5:
                xzb xzbVar = (xzb) r11;
                View view = (View) obj3;
                szb szbVar2 = (szb) obj2;
                szb szbVar3 = (szb) r9;
                bz2.n(view, szbVar2 != null ? (String) szbVar2.a(xzbVar) : null, szbVar3 != null ? (String) szbVar3.a(xzbVar) : null);
                tc8 q = r10.q();
                if (q != null && (szbVar = q.d) != null) {
                    rc8Var = (rc8) szbVar.a(xzbVar);
                }
                bz2.p(view, r10, rc8Var);
                break;
            case 6:
                ((xzi) obj3).R((View) obj2, (e23) r11, (Drawable) r9, (List) r10);
                break;
            case 7:
                ((gp8) obj3).getClass();
                gp8.a((View) obj2, (gc8) r11, r9, (xzb) r10, false);
                break;
            case 8:
                rt8.I((View) obj3, (jt8) obj2, r11, (xzb) r9, (xzb) r10);
                break;
            case 9:
                ((av8) obj3).c.e((View) obj, (yu8) obj2, (gc8) r11, (xzb) r9, (pm9) r10);
                break;
            case 10:
                ((w09) obj3).G((hh9) obj2, (e23) r11, (s09) r9, (u09) r10);
                break;
            case 11:
                Bitmap currentBitmapWithoutFilters$div_release = ((i39) obj3).getCurrentBitmapWithoutFilters$div_release();
                if (currentBitmapWithoutFilters$div_release != null) {
                    ((v29) obj2).L((i39) obj3, (e23) r11, currentBitmapWithoutFilters$div_release, ((i29) r9).N, (List) r10);
                }
                break;
            case 12:
                ((v29) obj3).J((i39) obj2, (e23) r11, (i29) r9, (dfb) r10);
                break;
            case 13:
                ((Number) obj).intValue();
                ((rt8) obj3).K((j79) obj2, (e23) r11, (l49) r9, (l49) r10);
                break;
            case 14:
                l49 l49Var = (l49) obj3;
                h49 h49Var = (h49) l49Var.l.a((xzb) obj2);
                final j79 j79Var = (j79) r11;
                int imeOptions = j79Var.getImeOptions();
                final rt8 rt8Var = (rt8) r9;
                int ordinal = h49Var.ordinal();
                if (ordinal != 0) {
                    i4 = 2;
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            i3 = 3;
                        } else if (ordinal != 3) {
                            if (ordinal != 4) {
                                b6e.s();
                                break;
                            } else {
                                i3 = 6;
                            }
                        }
                        j79Var.setImeOptions(imeOptions + i3);
                        final List list2 = l49Var.k;
                        list = list2;
                        if (list != null || list.isEmpty()) {
                            j79Var.setOnEditorActionListener(null);
                        } else {
                            final e23 e23Var = (e23) r10;
                            j79Var.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o49
                                @Override // android.widget.TextView.OnEditorActionListener
                                public final boolean onEditorAction(TextView textView, int i5, KeyEvent keyEvent) {
                                    if ((i5 & KotlinVersion.MAX_COMPONENT_VALUE) == 0) {
                                        return false;
                                    }
                                    ((qg8) rt8.this.g).d(e23Var, j79Var, list2, "enter");
                                    return false;
                                }
                            });
                        }
                        break;
                    }
                }
                i3 = i4;
                j79Var.setImeOptions(imeOptions + i3);
                final List list22 = l49Var.k;
                list = list22;
                if (list != null) {
                }
                j79Var.setOnEditorActionListener(null);
            case 15:
                xzb xzbVar2 = (xzb) r11;
                rt8 rt8Var2 = (rt8) r9;
                e23 e23Var2 = (e23) r10;
                ArrayList arrayList = new ArrayList();
                for (x49 x49Var : (List) obj3) {
                    if (x49Var instanceof w49) {
                        try {
                            mrnVar = new mrn((String) ((w49) x49Var).b.a.a(xzbVar2));
                        } catch (PatternSyntaxException e) {
                            rt8Var2.d.a(e23Var2.a.getDivData(), e23Var2.a.getDataTag()).d(new IllegalArgumentException("Invalid regex pattern '" + e.getPattern() + "'.", e));
                            mrnVar = null;
                        }
                    } else if (!(x49Var instanceof v49)) {
                        b6e.s();
                        break;
                    } else {
                        mrnVar = new uzb(((v49) x49Var).b.a, xzbVar2);
                    }
                    if (mrnVar != null) {
                        arrayList.add(mrnVar);
                    }
                }
                ((t49) obj2).invoke(new mne(arrayList));
                break;
            case 16:
                rt8.H((rt8) obj3, (pwt) ((ArrayList) obj2).get(((Number) obj).intValue()), String.valueOf(((j79) r11).getText()), (j79) r11, (gc8) r9, (xzb) r10);
                break;
            case 17:
                oc9 oc9Var = (oc9) obj3;
                eb9 eb9Var = (eb9) obj2;
                xzb xzbVar3 = (xzb) r11;
                SparseArray sparseArray = (SparseArray) r9;
                hb9 hb9Var2 = (hb9) r10;
                RecyclerView recyclerView = oc9Var.getRecyclerView();
                if (recyclerView != null) {
                    int i5 = eb9Var.x.a(xzbVar3) == db9.HORIZONTAL ? 1 : 0;
                    oc9Var.setOrientation(i5 ^ 1);
                    hb9Var2.s = (cb9) eb9Var.i.a(xzbVar3);
                    if (wyf.K(oc9Var)) {
                        DisplayMetrics displayMetrics = oc9Var.getResources().getDisplayMetrics();
                        ViewPager2 viewPager = oc9Var.getViewPager();
                        int width = i5 != 0 ? viewPager.getWidth() : viewPager.getHeight();
                        float j0 = bg3.j0(eb9Var.s, displayMetrics, xzbVar3);
                        boolean booleanValue = ((Boolean) eb9Var.q.a(xzbVar3)).booleanValue();
                        cb9 cb9Var2 = (cb9) eb9Var.D.a(xzbVar3);
                        ?? r13 = i5;
                        cc9 cc9Var2 = new cc9(eb9Var.y, xzbVar3, oc9Var, displayMetrics, r13, cb9Var2);
                        ub9 ub9Var = eb9Var.u;
                        if (ub9Var instanceof tb9) {
                            gc9Var = new rxi(((tb9) ub9Var).b, xzbVar3, width, cc9Var2, cb9Var2);
                            cb9Var2 = cb9Var2;
                            f = j0;
                            width = width;
                        } else if (!(ub9Var instanceof rb9)) {
                            f = j0;
                            if (!(ub9Var instanceof sb9)) {
                                b6e.s();
                                break;
                            } else {
                                gc9 u5wVar = new u5w(recyclerView, r13, width, cc9Var2, cb9Var2);
                                width = width;
                                gc9Var = u5wVar;
                            }
                        } else {
                            f = j0;
                            gc9Var = new rxi(((rb9) ub9Var).b, xzbVar3, displayMetrics, width, j0, cc9Var2, cb9Var2);
                            cb9Var2 = cb9Var2;
                            cc9Var2 = cc9Var2;
                        }
                        if (gc9Var instanceof rxi) {
                            gc9Var2 = gc9Var;
                            rxi rxiVar = (rxi) gc9Var2;
                            cb9 cb9Var3 = cb9Var2;
                            hb9Var = hb9Var2;
                            cb9Var = cb9Var3;
                            int i6 = width;
                            cc9 cc9Var3 = cc9Var2;
                            new yfx(oc9Var, i6, f, rxiVar, cc9Var3, booleanValue, hb9Var);
                            f2 = f;
                            cc9Var = cc9Var3;
                            z = booleanValue;
                            i = i6;
                            s5wVar = new cgc(cc9Var, rxiVar);
                        } else {
                            cb9 cb9Var4 = cb9Var2;
                            hb9Var = hb9Var2;
                            cb9Var = cb9Var4;
                            gc9Var2 = gc9Var;
                            f2 = f;
                            i = width;
                            cc9Var = cc9Var2;
                            z = booleanValue;
                            new t5w(oc9Var, f2, gc9Var2, cc9Var, hb9Var);
                            s5wVar = new s5w(i, cc9Var, cb9Var);
                        }
                        ViewPager2 viewPager2 = oc9Var.getViewPager();
                        int itemDecorationCount = viewPager2.getItemDecorationCount();
                        while (true) {
                            ggu gguVar = viewPager2.j;
                            if (i4 < itemDecorationCount) {
                                gguVar.v0(i4);
                                i4++;
                            } else {
                                gguVar.s(s5wVar);
                                int i7 = i;
                                oc9Var.setPageTransformer$div_release(new hc9(recyclerView, xzbVar3, sparseArray, i7, eb9Var.z, new fc9(i7, f2, gc9Var2, cc9Var, z, hb9Var, cb9Var), r13));
                            }
                        }
                    }
                }
                break;
            case 18:
                ((cp9) obj3).G(((lp9) obj2).getTitleLayout(), (xzb) r11, (so9) r9, (e23) r10);
                break;
            case 19:
                g89 g89Var = (g89) r11;
                xzb xzbVar4 = (xzb) r9;
                long longValue = ((Number) g89Var.a.a(xzbVar4)).longValue();
                la5 V = i4w.V(g89Var, xzbVar4);
                xv.D(V, (gc8) r10);
                ((er9) obj3).J((d89) obj2, longValue, V);
                break;
            case 20:
                xq9 xq9Var = (xq9) obj3;
                String str4 = (String) xq9Var.W.a((xzb) obj2);
                er9 er9Var = (er9) r11;
                d89 d89Var = (d89) r9;
                er9Var.L(d89Var, (e23) r10, xq9Var);
                er9Var.I(d89Var, str4);
                break;
            case 21:
                d89 d89Var2 = (d89) obj3;
                dj9 dj9Var = (dj9) obj2;
                if (dj9Var != null) {
                    xzb xzbVar5 = (xzb) r11;
                    rtpVar = er9.U(dj9Var, xzbVar5, (DisplayMetrics) r9, ((Number) ((xq9) r10).Z.a(xzbVar5)).intValue());
                }
                er9.S(d89Var2, rtpVar);
                break;
            case 22:
                List list3 = (List) obj;
                tz9 tz9Var = (tz9) obj2;
                pz9 pz9Var = (pz9) obj3;
                if (list3.isEmpty() && pz9Var.z == null) {
                    tz9.I(tz9Var, (gc8) r11, pz9Var);
                }
                ((se9) r9).h(list3, tz9.H(tz9Var, pz9Var, (xzb) r10));
                break;
            case 23:
                ueg uegVar = (ueg) obj;
                IOException iOException = (IOException) obj2;
                uegVar.getClass();
                yeg yegVar = ((uue) obj3).c;
                uegVar.h = yegVar != null ? Boolean.valueOf(yeg.a(iOException)) : null;
                uegVar.i = yegVar != null ? yegVar.b : null;
                uegVar.j = iOException;
                uegVar.k = (String) r11;
                uegVar.l = (String) r9;
                uegVar.m = (Integer) r10;
                uegVar.n = yegVar != null ? Boolean.valueOf(yegVar.b(iOException)) : null;
                break;
            case 24:
                float floatValue = ((Number) obj).floatValue();
                uqn uqnVar = (uqn) r11;
                xqn xqnVar = (xqn) obj2;
                d18 d18Var = (d18) obj3;
                efi h = d18.h((zi3) d18Var.f);
                if (h != null) {
                    d18Var.i(h);
                    efi a = ((efi) xqnVar.a).a(h);
                    xqnVar.a = a;
                    iyo iyoVar = (iyo) r9;
                    uqnVar.a = iyoVar.f(iyoVar.d(a.a));
                    ((tqn) r10).a = !cfi.a(r3 - floatValue);
                }
                break;
            case 25:
                p1j p1jVar = (p1j) obj;
                t1f t1fVar = (t1f) obj2;
                p1jVar.getClass();
                if (p1jVar == p1j.a) {
                    p1j p1jVar2 = (p1j) obj3;
                    p1j p1jVar3 = p1j.b;
                    if (p1jVar2 != p1jVar3) {
                        break;
                    }
                }
                break;
            case 26:
                jom jomVar = (jom) obj;
                jomVar.getClass();
                jomVar.e = (String) r11;
                jomVar.f = (String) obj3;
                jomVar.g = null;
                jomVar.h = (Long) obj2;
                Map o = ((avj) r9).h.o();
                jomVar.j = o != null ? uah.o(o) : null;
                PlaybackParameters playbackParameters = (PlaybackParameters) r10;
                jomVar.k = Boolean.valueOf(playbackParameters.getPrepareWithoutInitCodecs());
                jomVar.l = Boolean.valueOf(playbackParameters.getPreferredH264());
                jomVar.m = Boolean.valueOf(playbackParameters.getIsOffline());
                jomVar.n = playbackParameters.getManifestDataSourceParameters();
                jomVar.o = playbackParameters.getChunkDataSourceParameters();
                break;
            case 27:
                ((wle) obj).getClass();
                j03 j03Var3 = ((ogk) obj3).a;
                g3j g3jVar = (g3j) obj2;
                String str5 = (String) r11;
                oxa oxaVar = (oxa) r9;
                jtc jtcVar = (jtc) r10;
                ArrayList arrayList2 = vx3.f;
                String str6 = gos.o(g3jVar.a).a.a;
                boolean A = ixf.A(g3jVar.d);
                g0c g0cVar = j03Var3.g;
                boolean z2 = g3jVar.e;
                boolean z3 = j03Var3.p;
                String r = hrg.r("Оплата новой картой ", str6, StringUtil.SPACE, z3 ? "через PSP" : "через Trust");
                if (z2) {
                    r = r.concat(", с сохранением карты в Яндекс Пэй");
                }
                if (A) {
                    r = r.concat(", с пустым CVV");
                }
                String str7 = z3 ? "new_card_payment_v2" : "new_card_payment";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("bind_card", new mc3(z2));
                linkedHashMap.put("system", new jkr(str6));
                linkedHashMap.put("empty_svv", new mc3(A));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j = su4.j(vtmVar, "event_name", str7, str7, vtmVar);
                yop a2 = mif.a(j03Var3.d(str5), new ak0(j03Var3, g3jVar, oxaVar, jtcVar, 2), null, 5);
                ((x60) g0cVar).b(j, a2);
                break;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                c cVar = (c) obj;
                cVar.getClass();
                cVar.a = (Integer) ((xqn) obj3).a;
                cVar.b = (String) ((xqn) obj2).a;
                cVar.c = (String) ((xqn) r11).a;
                PlaybackException playbackException = (PlaybackException) r9;
                cVar.e = playbackException.getMessage();
                cVar.f = playbackException.getCause();
                cVar.g = ((tqn) r10).a;
                break;
            default:
                long j2 = ((enj) obj).a;
                x97.y((mm6) obj3, null, null, new kun((oxn) r11, (aqi) r10, (aqi) r9, null, 2), 3);
                ((Function1) obj2).invoke(new enj(j2));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(jhm jhmVar, Function0 function0, phm phmVar, String str, xof xofVar) {
        super(1);
        this.r = 2;
        this.s = jhmVar;
        this.t = function0;
        this.v = phmVar;
        this.u = str;
        this.w = xofVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii(Object obj, View view, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.r = i;
        this.s = view;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ii(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(String str, String str2, Long l, avj avjVar, PlaybackParameters playbackParameters) {
        super(1);
        this.r = 26;
        this.u = str;
        this.s = str2;
        this.t = l;
        this.v = avjVar;
        this.w = playbackParameters;
    }
}
