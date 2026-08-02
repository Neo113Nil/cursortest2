package defpackage;

import android.content.Context;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.yandex.go.places.impl.ui.main.d;
import com.yandex.go.route.interactor.c;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Pair;
import kotlin.collections.b;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.delivery.ui.setuprequierements.DeliverySetupRequirementsAnalytics$CloseReason;
import ru.yandex.taxi.logistics.explicit_comment_courier.analytics.DeliveryExplicitCommentAnalytics$PopupButton;
import ru.yandex.taxi.logistics.explicit_comment_courier.comment.pre_save_popup.ShowAlertInteractor$AnalyticsTrigger;
import ru.yandex.taxi.logistics.sdk.discovery_map.ui.a;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes10.dex */
public final class zch implements adh, jyi0, pi51, wi51, ti51, ca20, ey60, sdj, nlr, vm11, jl11, hdm {
    public final Object a;

    public zch(fyi0[] fyi0VarArr) {
        this.a = (fyi0[]) Arrays.copyOf(fyi0VarArr, fyi0VarArr.length);
        for (int i = 0; i < fyi0VarArr.length; i++) {
            ((fyi0[]) this.a)[i].init(i, vyc0.d, y3c.a);
        }
    }

    public static LinkedHashMap i(akl0 akl0Var, ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger) {
        String str;
        fkl0 fkl0Var = akl0Var.a;
        if (fkl0Var instanceof bkl0) {
            str = "d2d_redirect";
        } else if (fkl0Var instanceof ckl0) {
            str = "d2d";
        } else if (fkl0Var instanceof dkl0) {
            str = "redirect";
        } else {
            if (!fkl0Var.equals(ekl0.a)) {
                w511.b();
                return null;
            }
            str = "unknown";
        }
        LinkedHashMap l = b.l(new Pair("rule", str), new Pair("trigger", showAlertInteractor$AnalyticsTrigger.getValue()));
        if (fkl0Var instanceof dkl0) {
            l.put("tariff_to_redirect", ((dkl0) fkl0Var).a);
        }
        return l;
    }

    @Override // defpackage.sdj
    public qdj I(tdj tdjVar, BaseDialog baseDialog) {
        Runnable dismissListener = baseDialog.getDismissListener();
        apf apfVar = (apf) this.a;
        baseDialog.setDismissListener(new zvg(26, apfVar, dismissListener));
        return ((lit) apfVar.b).I(tdjVar, baseDialog);
    }

    @Override // defpackage.jl11
    public void a(Object obj) {
        Long l = (Long) obj;
        if (l != null) {
            ((r4l) this.a).b(l.longValue());
        }
    }

    @Override // defpackage.adh
    public int b(int i, byte[] bArr) {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        int min = Math.min(i, byteBuffer.remaining());
        if (min == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, min);
        return min;
    }

    @Override // defpackage.adh
    public int c() {
        return d() | (d() << 8);
    }

    @Override // defpackage.adh
    public short d() {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // defpackage.jl11
    public void e(tls tlsVar) {
        ((r4l) this.a).a(new bol(tlsVar));
    }

    public File f() {
        return ((File[]) this.a)[0];
    }

    public void g(DeliverySetupRequirementsAnalytics$CloseReason deliverySetupRequirementsAnalytics$CloseReason) {
        b1 b1Var = (b1) this.a;
        b1Var.a.a("DeliveryDetailsRequirements.Closed", x4e.p("close_reason", deliverySetupRequirementsAnalytics$CloseReason.getReason()), 1, new HashMap());
    }

    @Override // defpackage.sdj
    public qdj h(tdj tdjVar, ModalView modalView) {
        s45 onAppearingListener = modalView.getOnAppearingListener();
        apf apfVar = (apf) this.a;
        modalView.setOnAppearingListener(new ou4(apfVar, onAppearingListener));
        return ((lit) apfVar.b).h(tdjVar, modalView);
    }

    public aoi j(xjg xjgVar) {
        q4g q4gVar = (q4g) this.a;
        qyf qyfVar = new qyf(q4gVar, 3);
        int i = 1;
        qyf qyfVar2 = new qyf(q4gVar, i);
        qyf qyfVar3 = new qyf(q4gVar, 4);
        qyf qyfVar4 = new qyf(q4gVar, 2);
        int i2 = 0;
        ryf ryfVar = new ryf(xjgVar, i2);
        ryf ryfVar2 = new ryf(xjgVar, i);
        koi koiVar = (koi) i5m.b(new bpf(qyfVar, i5m.b(new bpf((xvf0) qyfVar2, (xvf0) qyfVar3, (xvf0) qyfVar4, i5m.b(new bpf((xvf0) ryfVar, (xvf0) ryfVar2, (xvf0) e5u0.a, (xvf0) new gmh(new qyf(q4gVar, i2), 9), 18, (char) 0)), 17, false)), ryfVar, ryfVar2)).get();
        qcp0 qcp0Var = koiVar.a;
        moi moiVar = koiVar.b;
        joi joiVar = koiVar.c;
        coi coiVar = koiVar.d;
        qcp0Var.getClass();
        return new aoi(moiVar, joiVar, coiVar);
    }

    public aoi k(ltj ltjVar) {
        boj0 boj0Var = (boj0) this.a;
        Context context = (Context) boj0Var.b;
        q5z.h(context);
        hwy0 hwy0Var = (hwy0) boj0Var.c;
        nu8 nu8Var = ltjVar.a;
        utj utjVar = ltjVar.b;
        hjz hjzVar = (hjz) boj0Var.w;
        qdc qdcVar = (qdc) boj0Var.y;
        q5z.h(qdcVar);
        q8s q8sVar = (q8s) boj0Var.z;
        q5z.h(q8sVar);
        return new aoi(new apf(context, hwy0Var, new a(nu8Var, utjVar, new ru.yandex.taxi.logistics.sdk.discovery_map.data.a(hjzVar, qdcVar, q8sVar)), (dci) boj0Var.x, 22), utjVar, nu8Var);
    }

    public void l(String str, LinkedHashMap linkedHashMap) {
        boolean isEmpty = linkedHashMap.isEmpty();
        lx4 lx4Var = (lx4) this.a;
        if (isEmpty) {
            ((j) lx4Var).n(str);
            return;
        }
        i d = ((j) lx4Var).d(str);
        d.a.putAll(linkedHashMap);
        d.m();
    }

    public void m(akl0 akl0Var, ShowAlertInteractor$AnalyticsTrigger showAlertInteractor$AnalyticsTrigger) {
        LinkedHashMap i = i(akl0Var, showAlertInteractor$AnalyticsTrigger);
        i.put("button", DeliveryExplicitCommentAnalytics$PopupButton.ACTION.getValue());
        l("PersonalStatePopupSuggest.Tapped", i);
    }

    public void n(String str, gl glVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, (String) glVar.b);
        linkedHashMap.put("button_label", (String) glVar.c);
        linkedHashMap.put("is_with_comment", Boolean.valueOf(glVar.a));
        String str2 = (String) glVar.w;
        if (str2 == null || str2.length() == 0) {
            str2 = null;
        }
        if (str2 != null) {
            linkedHashMap.put("comment", str2);
        }
        linkedHashMap.put("is_with_pictures", false);
        linkedHashMap.put("pictures_amt", 0);
        l(str, linkedHashMap);
    }

    @Override // defpackage.nlr
    public void onClose() {
        d.Lg((d) this.a);
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        int intValue;
        String str;
        xjg xjgVar = (xjg) this.a;
        HashMap hashMap = (HashMap) xjgVar.c;
        if (((poh) xjgVar.b) == null) {
        }
        String str2 = x920Var.a;
        Map map = (Map) x920Var.b;
        intValue = ((Integer) map.get("loadingUnitId")).intValue();
        str = (String) map.get("componentName");
        str2.getClass();
        switch (str2) {
            case "uninstallDeferredComponent":
                ((ixc0) ((poh) xjgVar.b)).e(intValue, str);
                ((ba20) da20Var).success(null);
                break;
            case "getDeferredComponentInstallState":
                ixc0 ixc0Var = (ixc0) ((poh) xjgVar.b);
                HashMap hashMap2 = ixc0Var.i;
                if (str == null) {
                    str = (String) ixc0Var.j.get(intValue);
                }
                String str3 = "unknown";
                if (str == null) {
                    Log.e("PlayStoreDeferredComponentManager", "Deferred component name was null and could not be resolved from loading unit id.");
                } else if (hashMap2.containsKey(str)) {
                    str3 = (String) ixc0Var.h.get(((Integer) hashMap2.get(str)).intValue());
                } else if (ixc0Var.a.g().contains(str)) {
                    str3 = "installedPendingLoad";
                }
                ((ba20) da20Var).success(str3);
                break;
            case "installDeferredComponent":
                ((ixc0) ((poh) xjgVar.b)).b(intValue, str);
                if (!hashMap.containsKey(str)) {
                    hashMap.put(str, new ArrayList());
                }
                ((List) hashMap.get(str)).add(da20Var);
                break;
            default:
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    @Override // defpackage.vm11
    public Object q() {
        return (com.yandex.div.evaluable.types.a) this.a;
    }

    @Override // defpackage.jyi0
    public void release() {
        for (fyi0 fyi0Var : (fyi0[]) this.a) {
            fyi0Var.release();
        }
    }

    @Override // defpackage.jyi0
    public iyi0[] s() {
        fyi0[] fyi0VarArr = (fyi0[]) this.a;
        iyi0[] iyi0VarArr = new iyi0[fyi0VarArr.length];
        for (int i = 0; i < fyi0VarArr.length; i++) {
            iyi0VarArr[i] = fyi0VarArr[i].getCapabilities();
        }
        return iyi0VarArr;
    }

    @Override // defpackage.jyi0
    public int size() {
        return ((fyi0[]) this.a).length;
    }

    @Override // defpackage.adh
    public long skip(long j) {
        ByteBuffer byteBuffer = (ByteBuffer) this.a;
        int min = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    @Override // defpackage.vm11
    public boolean t(Object obj) {
        return obj instanceof com.yandex.div.evaluable.types.a;
    }

    public zch(c cVar) {
        this.a = new ru.yandex.taxi.delivery.d(cVar.f());
    }

    public /* synthetic */ zch(Object obj) {
        this.a = obj;
    }

    public zch() {
        this.a = new com.yandex.div.evaluable.types.a(0L, TimeZone.getDefault());
    }

    public zch(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
