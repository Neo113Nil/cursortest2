package defpackage;

import android.text.Editable;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import ru.yandex.music.R;
import ru.yandex.video.m3.player.tracks.TrackType;

/* loaded from: classes3.dex */
public final class sv4 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sv4(gc8 gc8Var, Function1 function1) {
        super(1);
        this.r = 18;
        this.t = gc8Var;
        this.s = (uif) function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [a17, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [kotlin.jvm.functions.Function1, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        kxt c;
        String obj2;
        ImageView.ScaleType scaleType;
        String str2 = null;
        str2 = null;
        switch (this.r) {
            case 0:
                int intValue = ((Number) obj).intValue();
                return ((t83) this.t).invoke(Integer.valueOf(intValue), ((List) this.s).get(intValue));
            case 1:
                int intValue2 = ((Number) obj).intValue();
                return ((t83) this.t).invoke(Integer.valueOf(intValue2), ((List) this.s).get(intValue2));
            case 2:
                int intValue3 = ((Number) obj).intValue();
                return ((t83) this.t).invoke(Integer.valueOf(intValue3), ((List) this.s).get(intValue3));
            case 3:
                int intValue4 = ((Number) obj).intValue();
                return ((t83) this.t).invoke(Integer.valueOf(intValue4), ((List) this.s).get(intValue4));
            case 4:
                long j = ((enj) obj).a;
                ((Function0) this.t).invoke();
                ((nf6) this.s).a.setValue(new lf6(j));
                return Unit.a;
            case 5:
                KeyEvent keyEvent = ((qaf) obj).a;
                if (((axf) this.t).a() == zrd.b && keyEvent.getKeyCode() == 4 && saf.U(keyEvent) == 1) {
                    ((qbs) this.s).e(null);
                    r2 = true;
                }
                return Boolean.valueOf(r2);
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cz6 y = ((ty6) this.t).y();
                f2a f2aVar = (f2a) this.s;
                f2aVar.getClass();
                y.x = f2aVar;
                voi voiVar = y.q;
                if (booleanValue) {
                    voiVar.l(new ml3(false));
                    gut.k0().y();
                } else {
                    voiVar.l(new ll3(null));
                    gut.j0().y();
                }
                return Unit.a;
            case 7:
                int intValue5 = ((Number) obj).intValue();
                ?? r2 = this.t;
                String string = ((u07) this.s).getString(R.string.paymentsdk_divkit_cvv_help_text, String.valueOf(intValue5));
                string.getClass();
                r2.q(new vds(string));
                return Unit.a;
            case 8:
                a27 a27Var = (a27) obj;
                o17 o17Var = (o17) this.t;
                if (a27Var instanceof y17) {
                    sbp sbpVar = o17Var.g;
                    if (sbpVar == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    j8o j8oVar = sbpVar.b.a().e;
                    uds udsVar = new uds(R.string.paymentsdk_challenger_payment_error_title);
                    uds udsVar2 = new uds(R.string.paymentsdk_login_done);
                    uds udsVar3 = new uds(R.string.paymentsdk_challenger_no_attempts_error_desc);
                    long j2 = j8oVar.b;
                    a9o a9oVar = new a9o(null);
                    l37 l37Var = new l37();
                    l37Var.setArguments(cxb.K(new Pair("ARG_RESULT_TYPE", new r9o("failure", false, false, udsVar, udsVar3, udsVar2, null, null, j2, null, a9oVar))));
                    op2.t(sbpVar.a, l37Var, false, 0, 6);
                } else if (a27Var instanceof z17) {
                    t17 t17Var = (t17) ((xqn) this.s).a;
                    if (t17Var != null) {
                        t17Var.h();
                    }
                    sbp sbpVar2 = o17Var.g;
                    if (sbpVar2 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    ddu dduVar = sbpVar2.a;
                    lum lumVar = new lum(sbpVar2, (w7o) new u7o(Integer.valueOf(R.string.paymentsdk_success_title)), (jg3) null);
                    dduVar.getClass();
                    u7o u7oVar = new u7o(Unit.a);
                    cfk cfkVar = cfk.f;
                    if (cfkVar.a.e()) {
                        dduVar.f = lumVar;
                        cfkVar.a(u7oVar);
                    } else {
                        lumVar.Y(null);
                    }
                } else if (a27Var instanceof x17) {
                    sbp sbpVar3 = o17Var.g;
                    if (sbpVar3 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    bfk bfkVar = ((x17) a27Var).a;
                    bfkVar.getClass();
                    ddu dduVar2 = sbpVar3.a;
                    lum lumVar2 = new lum(sbpVar3, (w7o) new s7o(bfkVar), (jg3) null);
                    dduVar2.getClass();
                    s7o s7oVar = new s7o(bfkVar);
                    cfk cfkVar2 = cfk.f;
                    if (cfkVar2.a.e()) {
                        dduVar2.f = lumVar2;
                        cfkVar2.a(s7oVar);
                    } else {
                        lumVar2.Y(null);
                    }
                } else if (a27Var instanceof w17) {
                    sbp sbpVar4 = o17Var.g;
                    if (sbpVar4 == null) {
                        Intrinsics.j("callbacks");
                        throw null;
                    }
                    sbpVar4.q(new uds(((w17) a27Var).a));
                }
                return Unit.a;
            case 9:
                ((r7w) obj).getClass();
                e57 e57Var = (e57) this.t;
                g0c g0cVar = e57Var.l;
                qne m = qne.m(gut.S0(), null, 3);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(m);
                xdr xdrVar = e57Var.F;
                tcp tcpVar = new tcp((bfk) this.s);
                xdrVar.getClass();
                xdrVar.m(null, tcpVar);
                return Unit.a;
            case 10:
                ((paw) this.t).q(((ue7) this.s).g);
                return Unit.a;
            case 11:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                pdr pdrVar = (pdr) this.t;
                if (pdrVar.b != booleanValue2) {
                    ((sf7) this.s).c(pdr.a(pdrVar, false, booleanValue2, null, null, null, 29));
                }
                return Unit.a;
            case 12:
                uvs uvsVar = (uvs) obj;
                uvsVar.getClass();
                isb isbVar = (isb) ((tvs) this.t);
                List h = u75.h(Integer.valueOf(isbVar.f), Integer.valueOf(isbVar.g));
                TrackType trackType = (TrackType) this.s;
                TrackType trackType2 = TrackType.Video;
                if (trackType != trackType2) {
                    h = null;
                }
                uvsVar.c = h;
                Boolean valueOf = Boolean.valueOf(isbVar.g > isbVar.f);
                if (trackType != trackType2) {
                    valueOf = null;
                }
                uvsVar.a = valueOf;
                String str3 = isbVar.d;
                if (str3 != null && trackType == TrackType.Audio) {
                    str2 = str3;
                }
                uvsVar.b = str2;
                return Unit.a;
            case 13:
                ((IOException) obj).getClass();
                k78 k78Var = (k78) this.t;
                z0j z0jVar = (z0j) this.s;
                synchronized (k78Var) {
                    z0jVar.L();
                }
                return Unit.a;
            case 14:
                int intValue6 = ((Number) obj).intValue();
                return ((fp5) this.t).invoke(Integer.valueOf(intValue6), ((List) this.s).get(intValue6));
            case 15:
                int intValue7 = ((Number) obj).intValue();
                return ((fp5) this.t).invoke(Integer.valueOf(intValue7), ((List) this.s).get(intValue7));
            case 16:
                jc8 jc8Var = (jc8) obj;
                if (jc8Var instanceof ob8) {
                    ((zx0) this.t).addLast(((ob8) jc8Var).c.M.a((xzb) this.s));
                }
                return Boolean.TRUE;
            case 17:
                ((List) obj).add(((Integer) this.t).intValue(), this.s);
                return Unit.a;
            case 18:
                kxt kxtVar = (kxt) obj;
                gc8 gc8Var = (gc8) this.t;
                if (kxtVar instanceof zwt) {
                    Object d = kxtVar.d();
                    JSONArray jSONArray = d instanceof JSONArray ? (JSONArray) d : null;
                    if (jSONArray == null) {
                        gc8Var.getView().I(new IllegalArgumentException("Invalid variable value"));
                    } else {
                        ((zwt) kxtVar).j((JSONArray) ((uif) this.s).invoke(jSONArray));
                    }
                } else {
                    gc8Var.getView().I(new IllegalArgumentException("Action requires array variable"));
                }
                return kxtVar;
            case 19:
                kxt kxtVar2 = (kxt) obj;
                try {
                    tyf.m(kxtVar2, this.t);
                } catch (wxt e) {
                    ((gc8) this.s).I(e);
                }
                return kxtVar2;
            case 20:
                double doubleValue = ((Number) obj).doubleValue();
                gp8 gp8Var = (gp8) this.t;
                View view = (View) this.s;
                gp8Var.getClass();
                view.setAlpha((float) doubleValue);
                yp8 yp8Var = view instanceof yp8 ? (yp8) view : null;
                if (yp8Var != null) {
                    yp8Var.k();
                }
                return Unit.a;
            case 21:
                ((c2a) this.t).setLineSpacing(bg3.w(Long.valueOf(((Number) obj).longValue()), (DisplayMetrics) this.s));
                return Unit.a;
            case 22:
                Editable editable = (Editable) obj;
                dn9 dn9Var = (dn9) this.t;
                qas qasVar = (qas) this.s;
                j79 j79Var = (j79) dn9Var.d;
                String str4 = "";
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                xr2 xr2Var = (xr2) dn9Var.b;
                if (xr2Var != null) {
                    if (!xr2Var.i().equals(str)) {
                        Editable text = j79Var.getText();
                        if (text != null && (obj2 = text.toString()) != null) {
                            str4 = obj2;
                        }
                        xr2Var.a(str4, Integer.valueOf(j79Var.getSelectionStart()));
                        j79Var.setText(xr2Var.i());
                        j79Var.setSelection(xr2Var.d);
                        String i = xr2Var.i();
                        String str5 = (String) dn9Var.e;
                        if (str5 != null && (c = ((e23) dn9Var.f).b.c(str5)) != null) {
                            c.g(i);
                        }
                    }
                    String replace = xr2Var.h().replace(',', '.');
                    replace.getClass();
                    qasVar.invoke(replace);
                } else {
                    mne mneVar = (mne) dn9Var.c;
                    if (mneVar != null) {
                        if (!mneVar.b.equals(str)) {
                            if (mneVar.a(str)) {
                                mneVar.b = str;
                                mneVar.c = j79Var.getSelectionStart();
                            } else {
                                j79Var.setText(mneVar.b);
                                j79Var.setSelection(mneVar.c);
                            }
                        }
                    }
                    qasVar.invoke(str);
                }
                return Unit.a;
            case 23:
                ((pe9) this.t).invoke((oce) obj);
                ((bgg) ((zfg) this.s)).setTag(R.id.bitmap_load_references_tag, null);
                return Unit.a;
            case 24:
                return Boolean.valueOf(Intrinsics.d(((di9) obj).b.a((xzb) this.t), (String) this.s));
            case 25:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                xo9 divTabsAdapter = ((lp9) this.t).getDivTabsAdapter();
                if (divTabsAdapter != null) {
                    divTabsAdapter.d.setDisabledScrollPages(booleanValue3 ? new LinkedHashSet() : CollectionsKt.z0(new IntRange(0, ((vo9) this.s).q.size() - 1, 1)));
                }
                return Unit.a;
            case 26:
                long longValue = ((Number) obj).longValue();
                ((cp9) this.t).o = Long.valueOf(longValue);
                xo9 divTabsAdapter2 = ((lp9) this.s).getDivTabsAdapter();
                if (divTabsAdapter2 != null) {
                    long j3 = longValue >> 31;
                    int i2 = (j3 == 0 || j3 == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    if (divTabsAdapter2.A != i2) {
                        divTabsAdapter2.d.x(i2, true);
                    }
                }
                return Unit.a;
            case 27:
                a0a a0aVar = (a0a) obj;
                ((af9) this.t).setScale(a0aVar);
                grm grmVar = (grm) this.s;
                int ordinal = a0aVar.ordinal();
                if (ordinal == 0) {
                    scaleType = grm.c;
                } else if (ordinal == 1) {
                    scaleType = grm.a;
                } else {
                    if (ordinal != 2) {
                        b6e.s();
                        return null;
                    }
                    scaleType = grm.b;
                }
                grmVar.setScaleType(scaleType);
                return Unit.a;
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                int intValue8 = ((Number) obj).intValue();
                return ((fp5) this.t).invoke(Integer.valueOf(intValue8), ((ArrayList) this.s).get(intValue8));
            default:
                int intValue9 = ((Number) obj).intValue();
                return ((fp5) this.t).invoke(Integer.valueOf(intValue9), ((ArrayList) this.s).get(intValue9));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sv4(int i, Object obj, Object obj2) {
        super(1);
        this.r = i;
        this.t = obj;
        this.s = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv4(lp9 lp9Var, cp9 cp9Var, vo9 vo9Var) {
        super(1);
        this.r = 25;
        this.t = lp9Var;
        this.s = vo9Var;
    }
}
