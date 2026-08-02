package defpackage;

import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.n;
import com.yandex.go.image.api.domain.models.ImageSource;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.go.taxi.order.ActionButtonsClickListener$SourceScreen;
import com.yandex.go.taxi.order.tipssuggest.mvp.TipsSuggestModalView;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.VerticalHubV1ModalView;
import com.yandex.go.vault.router.d;
import com.yandex.mapkit.navigation.transport.Navigation;
import com.ybsdk.feature.rateapp.api.RateAppFeature$Source;
import com.ybsdk.feature.transfer.api.TransfersResultReceiver$Result;
import com.ybsdk.navigation.ScenarioResultReceiver$TransferResult;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.a;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlow;
import ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlowFactory;
import ru.yandex.taxi.order.state.transporting.TransportingStateView;
import ru.yandex.taxi.order.state.waiting.WaitingStateView;
import ru.yandex.taxi.preorder.summary.tariffpage.data.holder.f;
import ru.yandex.taxi.superapp.orders.models.ActionType;

/* loaded from: classes10.dex */
public final class wpy0 implements dzv, v6z0, jkz0, jr2, ca01, fp01, uk2, lir, xt, vg11, f16, u331, IVerificationFlowFactory, kos0, lb6, ca20, qty {
    public final /* synthetic */ int a;
    public final Object b;

    public wpy0(FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView) {
        this.a = 8;
        this.b = fullscreenSuperappSuggestModalView;
        fullscreenSuperappSuggestModalView.setFloatingInputTrailVisibility(0);
    }

    @Override // defpackage.lir
    public void a(kir kirVar) {
        rwo rwoVar = ((u111) this.b).w;
        String str = kirVar.a;
        Map map = kirVar.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ktu0((String) entry.getValue()));
        }
        ((y22) rwoVar).a(new iho(str, new lhn((Map) new LinkedHashMap(linkedHashMap))));
    }

    @Override // defpackage.f16
    public void b(Bitmap bitmap, ebv ebvVar, ImageSource imageSource) {
        b2f b2fVar = ((zg21) this.b).e;
        if (b2fVar != null) {
            b2fVar.run();
            ((zg21) this.b).e = null;
        }
    }

    @Override // defpackage.uk2
    public void c(wnt0 wnt0Var) {
        ((Navigation) ((f311) this.b).a).getGuidance().getAnnotator().setSpeaker(wnt0Var);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlowFactory
    public IVerificationFlow createFZ115() {
        return new a7p((eg01) this.b, 0);
    }

    @Override // ru.rt.ebs.cryptosdk.core.verificationFlow.entities.models.IVerificationFlowFactory
    public IVerificationFlow createFlowWithoutEsia() {
        return new a7p((eg01) this.b, 1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008a, code lost:
    
        if (r5.equals("ControlMain") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:
    
        r2 = "controlMain";
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        if (r5.equals("ButtonMinor") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d0, code lost:
    
        if (r5.equals("ControlMinor") == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00e5, code lost:
    
        if (r5.equals("ButtonMain") == false) goto L75;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0113 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ldc d(String str) {
        ldc ldcVar;
        Integer b;
        qdc qdcVar = (qdc) this.b;
        if (str != null) {
            String str2 = "controlMinor";
            switch (str.hashCode()) {
                case -1943170005:
                    break;
                case -1703647752:
                    if (str.equals("ButtonTextMain")) {
                        str2 = "textOnControl";
                        b = qdcVar.b(str2);
                        if (b != null) {
                            ldcVar = new ldc(rzo.d(b.intValue()));
                            break;
                        }
                    }
                    break;
                case -1475594120:
                    break;
                case -1273229482:
                    if (str.equals("ButtonTextMinor")) {
                        str2 = "textOnControlMinor";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case -939211610:
                    if (str.equals("TextMain")) {
                        str2 = "textMain";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case -741353597:
                    if (str.equals("TextInvert")) {
                        str2 = "textInvert";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case -673499662:
                    if (str.equals("IconMain")) {
                        str2 = "iconMain";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case -108484733:
                    break;
                case -47607658:
                    break;
                case 80245:
                    if (str.equals("Pin")) {
                        str2 = "pin";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 2368532:
                    if (str.equals("Line")) {
                        str2 = "line";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 596590236:
                    if (str.equals("IconMinor")) {
                        str2 = "iconMinor";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 949454440:
                    if (str.equals("TextMinor")) {
                        str2 = "textMinor";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 976782612:
                    if (str.equals("Fogdark")) {
                        str2 = "fogDark";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 1346388994:
                    if (str.equals("Pressed")) {
                        str2 = "pressed";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 1468851792:
                    if (str.equals("BgMinor")) {
                        str2 = "bgMinor";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
                case 1987037118:
                    if (str.equals("BgMain")) {
                        str2 = "bgMain";
                        b = qdcVar.b(str2);
                        if (b != null) {
                        }
                    }
                    break;
            }
            if (ldcVar == null) {
                return ldcVar;
            }
            Integer b2 = qdcVar.b(str);
            if (b2 != null) {
                return new ldc(rzo.d(b2.intValue()));
            }
            return null;
        }
        ldcVar = null;
        if (ldcVar == null) {
        }
    }

    @Override // defpackage.lb6
    public void e(int i) {
        f fVar = (f) this.b;
        ikx0 ikx0Var = fVar.N1;
        if (ikx0Var != null) {
            fVar.c0(ikx0Var, i);
        }
    }

    @Override // defpackage.xt
    public void f(ActionType actionType) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                hc11 presenter = ((TransportingStateView) obj).getPresenter();
                presenter.getClass();
                if (actionType == ActionType.DRIVER) {
                    presenter.U.b(presenter.A);
                    break;
                }
                break;
            default:
                p041 waitingStateViewPresenter = ((WaitingStateView) obj).getWaitingStateViewPresenter();
                waitingStateViewPresenter.getClass();
                if (actionType == ActionType.DRIVER) {
                    waitingStateViewPresenter.U.b(waitingStateViewPresenter.A);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List g(ArrayList arrayList, List list) {
        Object sw11Var;
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(list);
        ArrayList arrayList4 = new ArrayList(arrayList2);
        int size = arrayList3.size();
        int i = 0;
        while (i < size) {
            int size2 = arrayList4.size();
            int i2 = 0;
            while (true) {
                if (i2 < size2) {
                    sx8 sx8Var = (sx8) list.get(i);
                    ux8 ux8Var = (ux8) arrayList2.get(i2);
                    boolean z = ux8Var instanceof ox8;
                    rw11 rw11Var = rw11.a;
                    if (z) {
                        ox8 ox8Var = (ox8) ux8Var;
                        if (jl40.l(sx8Var.a, ox8Var.e)) {
                            ((sk7) this.b).getClass();
                            sw11Var = new sw11(new tx8(sx8Var.a, ox8Var.a, ox8Var.c, ox8Var.f, ox8Var.b, ox8Var.d, sx8Var.d), null);
                            if (!(sw11Var instanceof sw11)) {
                                sw11 sw11Var2 = (sw11) sw11Var;
                                arrayList3.set(i, sw11Var2.a);
                                arrayList4.set(i2, sw11Var2.b);
                                break;
                            }
                            if (!sw11Var.equals(rw11Var)) {
                                w511.b();
                                return null;
                            }
                            i2++;
                            arrayList2 = arrayList;
                        } else {
                            sw11Var = rw11Var;
                            if (!(sw11Var instanceof sw11)) {
                            }
                        }
                    } else {
                        if (ux8Var instanceof px8) {
                            px8 px8Var = (px8) ux8Var;
                            List list2 = sx8Var.d;
                            if ((list2 != null ? (String) a.u0(list2) : null) != null && jl40.l(sx8Var.a, px8Var.a) && !px8Var.d) {
                                sw11Var = new sw11(null, sx8Var);
                                if (!(sw11Var instanceof sw11)) {
                                }
                            }
                        } else if (!(ux8Var instanceof sx8) && !(ux8Var instanceof qx8) && !(ux8Var instanceof tx8)) {
                            w511.b();
                            return null;
                        }
                        sw11Var = rw11Var;
                        if (!(sw11Var instanceof sw11)) {
                        }
                    }
                }
            }
            i++;
            arrayList2 = arrayList;
        }
        return a.M(a.m0(arrayList4, arrayList3));
    }

    @Override // defpackage.ca01
    public void h(String str) {
        boolean J = evu0.J(str);
        FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = (FullscreenSuperappSuggestModalView) this.b;
        if (J) {
            fullscreenSuperappSuggestModalView.setFloatingInputTrailEnabled(false);
        } else {
            fullscreenSuperappSuggestModalView.setFloatingInputTrailEnabled(true);
        }
    }

    public View i(int i) {
        if (i == 0) {
            return new View(((n) this.b).a.a.getContext());
        }
        return null;
    }

    @Override // defpackage.xt
    public void j(String str, ActionType actionType) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 16:
                hc11 presenter = ((TransportingStateView) obj).getPresenter();
                presenter.T.a(str, actionType, ActionButtonsClickListener$SourceScreen.ORDER_DETAILS);
                p4j p4jVar = presenter.B;
                p4jVar.getClass();
                p4jVar.c(p4j.a(actionType));
                break;
            default:
                p041 waitingStateViewPresenter = ((WaitingStateView) obj).getWaitingStateViewPresenter();
                waitingStateViewPresenter.T.a(str, actionType, ActionButtonsClickListener$SourceScreen.ORDER_DETAILS);
                p4j p4jVar2 = waitingStateViewPresenter.B;
                p4jVar2.getClass();
                p4jVar2.c(p4j.a(actionType));
                break;
        }
    }

    public void k(int i) {
        if (i == 0) {
            n nVar = (n) this.b;
            if (nVar.d) {
                return;
            }
            nVar.a.l = true;
            nVar.d = true;
        }
    }

    public void l(TransfersResultReceiver$Result transfersResultReceiver$Result) {
        ScenarioResultReceiver$TransferResult scenarioResultReceiver$TransferResult;
        nvd nvdVar = (nvd) this.b;
        int i = li01.a[transfersResultReceiver$Result.ordinal()];
        if (i == 1) {
            RateAppFeature$Source rateAppFeature$Source = RateAppFeature$Source.None;
            scenarioResultReceiver$TransferResult = ScenarioResultReceiver$TransferResult.SUCCESS;
        } else if (i == 2) {
            scenarioResultReceiver$TransferResult = ScenarioResultReceiver$TransferResult.FAIL;
        } else {
            if (i != 3) {
                w511.b();
                return;
            }
            scenarioResultReceiver$TransferResult = ScenarioResultReceiver$TransferResult.PENDING;
        }
        nvdVar.l(scenarioResultReceiver$TransferResult);
    }

    @Override // defpackage.jkz0
    public void m(pkz0 pkz0Var) {
        vhz0 vhz0Var;
        vhz0Var = ((TipsSuggestModalView) this.b).presenter;
        int parseInt = Integer.parseInt(((jfz0) pkz0Var).f);
        vhz0Var.D = parseInt;
        ((uhz0) vhz0Var.Dg()).updateSelectedTips(vhz0Var.z.d(parseInt));
    }

    public void n(k52 k52Var) {
        z231 z231Var = ((d) this.b).N;
        z231Var.getClass();
        b bVar = k52Var.b;
        String str = k52Var.a;
        boolean z = bVar instanceof c;
        pho phoVar = z231Var.b;
        if (!z) {
            phoVar.a(str, kotlin.collections.b.h(new Pair(Constants.KEY_DATA, String.valueOf(bVar))), 1, kotlin.collections.b.f());
            return;
        }
        Set<Map.Entry> entrySet = ((c) bVar).a.entrySet();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : entrySet) {
            hashMap.put((String) entry.getKey(), (b) entry.getValue());
        }
        phoVar.a(str, hashMap, 1, kotlin.collections.b.f());
    }

    @Override // defpackage.qty
    public void onChanged(int i, int i2, Object obj) {
        int i3 = i2 + i;
        while (i < i3) {
            View childAt = ((dfs0) this.b).a.getChildAt(i);
            if (childAt == null) {
                unr0.z(jst.e, "no view at position");
            } else {
                Object tag = childAt.getTag(agh0.view_holder_tag);
                if (!(tag instanceof kr31)) {
                    unr0.z(jst.e, "viewHolder expected but not found");
                }
                ((kr31) tag).b = true;
            }
            i++;
        }
    }

    @Override // defpackage.f16
    public void onError(Throwable th) {
        ((zg21) this.b).d = true;
        ((zg21) this.b).e = null;
    }

    @Override // defpackage.qty
    public void onInserted(int i, int i2) {
        dfs0 dfs0Var = (dfs0) this.b;
        ViewGroup viewGroup = dfs0Var.a;
        int i3 = i2 + i;
        while (i < i3) {
            kr31 a = dfs0Var.a(viewGroup, dfs0Var.e.get(i));
            View view = a.a;
            view.setTag(agh0.view_holder_tag, a);
            dfs0Var.c.add(i, a);
            a.b = true;
            viewGroup.addView(view, i);
            i++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        char c;
        Vibrator vibrator = (Vibrator) ((eg01) this.b).a;
        String str = x920Var.a;
        str.getClass();
        int i = 0;
        switch (str.hashCode()) {
            case -1367724422:
                if (str.equals("cancel")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 86129172:
                if (str.equals("hasAmplitudeControl")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 451310959:
                if (str.equals("vibrate")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 890723587:
                if (str.equals("hasCustomVibrationsSupport")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                vibrator.cancel();
                ((ba20) da20Var).success(null);
                break;
            case 1:
                ((ba20) da20Var).success(Boolean.valueOf(vibrator.hasAmplitudeControl()));
                break;
            case 2:
                Integer num = (Integer) x920Var.a("duration");
                List list = (List) x920Var.a("pattern");
                Integer num2 = (Integer) x920Var.a("repeat");
                List list2 = (List) x920Var.a("intensities");
                Integer num3 = (Integer) x920Var.a("amplitude");
                if (!list.isEmpty() && !list2.isEmpty()) {
                    int intValue = num2.intValue();
                    int size = list.size();
                    long[] jArr = new long[size];
                    int size2 = list2.size();
                    int[] iArr = new int[size2];
                    for (int i2 = 0; i2 < size; i2++) {
                        jArr[i2] = ((Integer) list.get(i2)).intValue();
                    }
                    while (i < size2) {
                        iArr[i] = ((Integer) list2.get(i)).intValue();
                        i++;
                    }
                    if (vibrator.hasVibrator()) {
                        if (vibrator.hasAmplitudeControl()) {
                            vibrator.vibrate(VibrationEffect.createWaveform(jArr, iArr, intValue), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                        } else {
                            vibrator.vibrate(VibrationEffect.createWaveform(jArr, intValue), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                        }
                    }
                } else if (list.size() > 0) {
                    int intValue2 = num2.intValue();
                    int size3 = list.size();
                    long[] jArr2 = new long[size3];
                    while (i < size3) {
                        jArr2[i] = ((Integer) list.get(i)).intValue();
                        i++;
                    }
                    if (vibrator.hasVibrator()) {
                        vibrator.vibrate(VibrationEffect.createWaveform(jArr2, intValue2), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                    }
                } else {
                    long intValue3 = num.intValue();
                    int intValue4 = num3.intValue();
                    if (vibrator.hasVibrator()) {
                        if (vibrator.hasAmplitudeControl()) {
                            vibrator.vibrate(VibrationEffect.createOneShot(intValue3, intValue4), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                        } else {
                            vibrator.vibrate(VibrationEffect.createOneShot(intValue3, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
                        }
                    }
                }
                ((ba20) da20Var).success(null);
                break;
            case 3:
                ((ba20) da20Var).success(Boolean.TRUE);
                break;
            default:
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    @Override // defpackage.qty
    public void onMoved(int i, int i2) {
        dfs0 dfs0Var = (dfs0) this.b;
        ViewGroup viewGroup = dfs0Var.a;
        View childAt = viewGroup.getChildAt(i);
        Object tag = childAt.getTag(agh0.view_holder_tag);
        if (!(tag instanceof kr31)) {
            unr0.z(jst.e, "viewHolder expected but not found");
        }
        ((kr31) tag).b = true;
        viewGroup.removeViewAt(i);
        viewGroup.addView(childAt, i2);
        ArrayList arrayList = dfs0Var.c;
        arrayList.add(i2, arrayList.remove(i));
    }

    @Override // defpackage.qty
    public void onRemoved(int i, int i2) {
        dfs0 dfs0Var = (dfs0) this.b;
        int i3 = i2 + i;
        for (int i4 = i; i4 < i3; i4++) {
            dfs0Var.a.removeViewAt(i);
            dfs0Var.c.remove(i);
        }
    }

    @Override // defpackage.kos0
    public void r(int i) {
        com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.c cVar;
        cVar = ((VerticalHubV1ModalView) this.b).presenter;
        avj0 avj0Var = (avj0) cVar.A;
        int u = tje.u(24, avj0Var.a) + i;
        ContextThemeWrapper contextThemeWrapper = avj0Var.a;
        int u2 = tje.u(24, contextThemeWrapper);
        cVar.C.q3(cVar, u2, tje.u(80, contextThemeWrapper), u2, u);
    }

    public /* synthetic */ wpy0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public wpy0(nvd nvdVar, a7i0 a7i0Var) {
        this.a = 10;
        this.b = nvdVar;
    }
}
