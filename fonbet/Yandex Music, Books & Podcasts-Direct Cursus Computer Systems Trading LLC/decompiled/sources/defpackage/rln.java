package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.fragment.app.t;
import androidx.fragment.app.y;
import androidx.work.impl.WorkDatabase;
import com.google.gson.JsonParseException;
import com.yandex.music.shared.network.retrypolicy.api.RetryPolicyDto;
import com.yandex.pulse.metrics.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.Regex;
import ru.yandex.music.R;
import ru.yandex.music.search.SearchActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class rln implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rln(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String str;
        RetryPolicyDto retryPolicyDto;
        kd kdVar;
        cvf cvfVar;
        int i = 0;
        switch (this.a) {
            case 0:
                x3n x3nVar = (x3n) this.b;
                q5p q5pVar = (q5p) this.c;
                y yVar = (y) x3nVar.a;
                uln ulnVar = (uln) x3nVar.b;
                pu0 pu0Var = (pu0) x3nVar.c;
                mjm mjmVar = new mjm(q5pVar, x3nVar);
                yVar.getClass();
                ulnVar.getClass();
                sai saiVar = new sai(false);
                cvo cvoVar = cvo.i;
                e3s.X(o6m.b(wjb.BottomsheetScreen, null, 6), yVar, null, saiVar, null, new wn5(new mdn(pu0Var, ulnVar, saiVar, mjmVar, 1), 1984420409, true), 52);
                return Unit.a;
            case 1:
                sai saiVar2 = (sai) this.b;
                wln wlnVar = (wln) this.c;
                saiVar2.a();
                vmn vmnVar = wlnVar.a;
                vmnVar.getClass();
                ssg.a(3, "RecognitionViewModel", "dismissing", null);
                vmnVar.G();
                return Unit.a;
            case 2:
                rar rarVar = (rar) this.b;
                iwe iweVar = (iwe) this.c;
                ssg.a(3, "RecognizeAudioCenter", "flow closed", null);
                rarVar.g(null);
                lni lniVar = (lni) ((jyr) iweVar.b).getValue();
                lniVar.getClass();
                ssg.a(3, "MusicMatchRecognitionService", "stop", null);
                lniVar.b();
                return Unit.a;
            case 3:
                Regex regex = (Regex) this.b;
                CharSequence charSequence = (CharSequence) this.c;
                irn irnVar = Regex.b;
                return regex.b(charSequence);
            case 4:
                Function0 function0 = (Function0) this.b;
                ((aqi) this.c).setValue(Boolean.FALSE);
                function0.invoke();
                return Unit.a;
            case 5:
                Pair pair = (Pair) this.b;
                wbo wboVar = (wbo) this.c;
                if (pair == null || (str = (String) pair.b) == null) {
                    return null;
                }
                try {
                    retryPolicyDto = (RetryPolicyDto) wboVar.b.b.d(str, RetryPolicyDto.class);
                } catch (JsonParseException | IOException | IllegalStateException unused) {
                    retryPolicyDto = null;
                }
                if (retryPolicyDto != null) {
                    return dk6.a(retryPolicyDto);
                }
                return null;
            case 6:
                return new xwd((ywd) this.b, (va7) this.c);
            case 7:
                return avf.x((String) this.b, igm.c, new mhp[0], new syo((tyo) this.c, i));
            case 8:
                c3r c3rVar = (c3r) this.b;
                b6p b6pVar = (b6p) this.c;
                if (c3rVar != null) {
                    ((nw7) c3rVar).a();
                }
                b6pVar.K().p.a.c.setValue(Boolean.FALSE);
                return Unit.a;
            case 9:
                ((Function1) this.b).invoke(((osp) ((qsp) this.c)).a);
                return Unit.a;
            case 10:
                ((Function1) this.b).invoke(((usp) ((wsp) this.c)).a);
                return Unit.a;
            case 11:
                ((Function1) this.b).invoke(Boolean.valueOf(((nsp) this.c) == nsp.c));
                return Unit.a;
            case 12:
                ((Function1) this.b).invoke(Boolean.valueOf(((xsp) ((zsp) this.c)).a));
                return Unit.a;
            case 13:
                return new y3((jrp) this.b, (qrp) ((bm) this.c).d);
            case 14:
                wtp wtpVar = (wtp) this.b;
                SensorManager sensorManager = (SensorManager) this.c;
                wtpVar.getClass();
                sensorManager.getClass();
                wtpVar.b = sensorManager;
                Sensor defaultSensor = sensorManager.getDefaultSensor(1);
                if (defaultSensor != null) {
                    sensorManager.registerListener(wtpVar, defaultSensor, 2);
                }
                return Unit.a;
            case 15:
                z23 z23Var = (z23) this.b;
                jxp jxpVar = (jxp) this.c;
                Resources resources = z23Var.a;
                String string = resources.getString(R.string.share_invite_switcher_title);
                string.getClass();
                int i2 = R.string.share_invite_switcher_subtitle_track;
                if (jxpVar != null) {
                    if (jxpVar instanceof hxp) {
                        int ordinal = ((hxp) jxpVar).c.ordinal();
                        if (ordinal == 1) {
                            i2 = R.string.share_invite_switcher_subtitle_episode;
                        } else if (ordinal == 10) {
                            i2 = R.string.share_invite_switcher_subtitle_chapter;
                        }
                    } else {
                        if (!(jxpVar instanceof gxp)) {
                            if (jxpVar instanceof dxp) {
                                int i3 = kxp.a[((dxp) jxpVar).b.ordinal()];
                                i2 = i3 != 1 ? i3 != 2 ? R.string.share_invite_switcher_subtitle_album : R.string.share_invite_switcher_subtitle_podcast : R.string.share_invite_switcher_subtitle_audiobook;
                            } else if (jxpVar instanceof exp) {
                                i2 = R.string.share_invite_switcher_subtitle_artist;
                            } else if (!(jxpVar instanceof ixp)) {
                                if (!(jxpVar instanceof fxp)) {
                                    b6e.s();
                                    return null;
                                }
                                i2 = R.string.share_invite_switcher_subtitle_concert;
                            }
                        }
                        i2 = R.string.share_invite_switcher_subtitle_playlist;
                    }
                }
                String string2 = resources.getString(i2);
                string2.getClass();
                return new ywp(new xwp(string, string2, false));
            case 16:
                l13 l13Var = (l13) this.b;
                gs4 gs4Var = (gs4) this.c;
                return new xx8(gs4Var);
            case 17:
                wyp wypVar = (wyp) this.b;
                qy2 qy2Var = (qy2) this.c;
                l13 l13Var2 = wypVar.a;
                b39 b39Var = (b39) l13Var2.a.D(hag.I(b39.class), l13Var2, l13Var2.b);
                return new ls4(b39Var.a, btf.b(new yg6(11, b39Var)), btf.b(new yg6(12, qy2Var)));
            case 18:
                avi aviVar = (avi) this.b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.c;
                synchronized (p2q.b) {
                    LinkedHashMap linkedHashMap = p2q.c;
                    linkedHashMap.remove(aviVar);
                    if (linkedHashMap.isEmpty()) {
                        jsg.j().e(r3w.a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(p2q.a);
                        p2q.d = null;
                        p2q.e = false;
                    }
                }
                return Unit.a;
            case 19:
                yk3 yk3Var = (yk3) this.b;
                Throwable th = (Throwable) this.c;
                synchronized (yk3Var.b) {
                    if (yk3Var.a) {
                        throw new IllegalStateException("couldn't fail, since already prepared");
                    }
                    if (((Throwable) yk3Var.c) != null) {
                        throw new IllegalStateException("already failed with " + ((Throwable) yk3Var.c));
                    }
                    yk3Var.c = th;
                    kdVar = (kd) yk3Var.e;
                }
                kdVar.mo33b(th);
                return Unit.a;
            case 20:
                ((Function1) this.b).invoke(((kmu) this.c).c);
                return Unit.a;
            case 21:
                qqq qqqVar = (qqq) this.b;
                c0p c0pVar = (c0p) this.c;
                iqq iqqVar = qqqVar.c;
                iqqVar.getClass();
                c0pVar.getClass();
                t tVar = iqqVar.a;
                int i4 = SearchActivity.Z;
                tVar.startActivity(rvf.E(tVar, c0pVar));
                return Unit.a;
            case 22:
                ((nyf) this.b).d((ru2) this.c);
                return Unit.a;
            case 23:
                uvq uvqVar = (uvq) this.b;
                zvq zvqVar = (zvq) this.c;
                rvq rvqVar = (rvq) uvqVar.l.getValue();
                tmb tmbVar = (tmb) uvqVar.m.getValue();
                cce cceVar = (cce) uvqVar.j.b.getValue();
                rvqVar.getClass();
                tmbVar.getClass();
                cceVar.getClass();
                ju0 ju0Var = rvqVar.a;
                pjc pjcVar = (pjc) ((jyr) ju0Var.g).getValue();
                atn atnVar = new atn((Context) ((jyr) ju0Var.a).getValue(), cceVar);
                cc7 cc7Var = (cc7) ((jyr) ju0Var.d).getValue();
                frt frtVar = (frt) ((jyr) ju0Var.e).getValue();
                i0j i0jVar = (i0j) ((jyr) ju0Var.c).getValue();
                z66 z66Var = (z66) ((jyr) ju0Var.b).getValue();
                nnd nndVar = new nnd(ju0Var);
                l18 l18Var = l18.b;
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new swq(nndVar, tmbVar, pjcVar, zvqVar, atnVar, cc7Var, frtVar, i0jVar, z66Var, ((kt3) ((byb) qdcVar.C(I)).b(kt3.class)).h());
            case 24:
                w4r w4rVar = (w4r) this.b;
                String str2 = (String) this.c;
                w4rVar.getClass();
                str2.getClass();
                x2i.a0(w4rVar.b.b, pd.t(new qzm[0]), new teb(str2));
                return Unit.a;
            case 25:
                tao taoVar = (tao) this.b;
                i0j i0jVar2 = (i0j) this.c;
                mmo mmoVar = new mmo((Context) taoVar.a);
                mmoVar.e = new kme(i0jVar2.b(new evj((rao) null, "Spool", (ozw) null, new kzp(21, taoVar), 23)).a);
                mmoVar.d = btf.b(new r8r(taoVar, r4 ? 1 : 0));
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                arrayList.add(new dy2(r4 ? 1 : 0, taoVar));
                if (Build.VERSION.SDK_INT >= 28) {
                    arrayList5.add(new hbe());
                } else {
                    arrayList5.add(new ncd());
                }
                mmoVar.f = new on5(xee.L(arrayList), xee.L(arrayList2), xee.L(arrayList3), xee.L(arrayList4), xee.L(arrayList5));
                mmoVar.i();
                return mmoVar.k();
            case 26:
                return ((srp) this.b).invoke((WorkDatabase) this.c);
            case 27:
                return new eke(((nke) this.b).a(), new gke(((dpr) this.c).g));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                sdr sdrVar = (sdr) this.b;
                return Boolean.valueOf(((k2s) sdrVar.getValue()).b.a.size() > 1 && (cvfVar = (cvf) CollectionsKt.firstOrNull(((fvf) this.c).j().k)) != null && cvfVar.a > ((k2s) sdrVar.getValue()).a);
            default:
                evj evjVar = (evj) this.b;
                lik likVar = (lik) this.c;
                l18 l18Var2 = l18.b;
                bdt I2 = hag.I(ljk.class);
                qdc qdcVar2 = l18Var2.a;
                qdcVar2.getClass();
                return ((ljk) qdcVar2.C(I2)).a((bve) evjVar.c, likVar, evjVar.a);
        }
    }
}
