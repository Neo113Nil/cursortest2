package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.semantics.f;
import com.yandex.go.payments.design.composite.CompositePaymentIconsView;
import com.yandex.xplat.common.JSONItemKind;
import com.yandex.xplat.common.YSError;
import com.yandex.xplat.xflags.FlagsConfigurationSource;
import com.ybsdk.core.formatter.FormatTextWatcher;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.search.address.view.FullscreenDestinationSearchModalView;

/* loaded from: classes2.dex */
public final /* synthetic */ class xvq implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ xvq(int i) {
        this.a = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016f A[SYNTHETIC] */
    @Override // defpackage.tls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        wj00 wj00Var;
        y3x d;
        y3x d2;
        qfr qfrVar;
        wj00 wj00Var2;
        y3x d3;
        wj00 wj00Var3;
        String h;
        y3x d4;
        jfr jfrVar;
        zy11 _init_$lambda$0;
        zy11 delayedAnimation$lambda$0;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return ((oo0) obj).f;
            case 1:
                y3x y3xVar = (y3x) obj;
                JSONItemKind jSONItemKind = y3xVar.a;
                JSONItemKind jSONItemKind2 = JSONItemKind.map;
                o8g0 o8g0Var = (jSONItemKind == jSONItemKind2 && (d = (wj00Var = (wj00) y3xVar).d("configurations")) != null && d.a == JSONItemKind.array && ((d2 = wj00Var.d("logs")) == null || d2.a == jSONItemKind2)) ? new o8g0((n53) d, (wj00) d2) : null;
                if (o8g0Var == null) {
                    qfrVar = null;
                } else {
                    n53 n53Var = (n53) o8g0Var.a;
                    ArrayList arrayList = new ArrayList();
                    for (y3x y3xVar2 : n53Var.b) {
                        JSONItemKind jSONItemKind3 = y3xVar2.a;
                        JSONItemKind jSONItemKind4 = JSONItemKind.map;
                        if (jSONItemKind3 == jSONItemKind4 && (d3 = (wj00Var2 = (wj00) y3xVar2).d("CONTEXT")) != null && d3.a == jSONItemKind4) {
                            mfr mfrVar = kd51.a;
                            y3x d5 = ((wj00) d3).d("MOBMAIL");
                            if (d5 != null && d5.a == jSONItemKind4 && (h = (wj00Var3 = (wj00) d5).h("source")) != null) {
                                FlagsConfigurationSource flagsConfigurationSource = h.equals("global") ? FlagsConfigurationSource.global : h.equals("experiment") ? FlagsConfigurationSource.experiment : null;
                                if (flagsConfigurationSource != null && (d4 = wj00Var3.d("flags")) != null && d4.a == jSONItemKind4) {
                                    jfrVar = new jfr(flagsConfigurationSource, wj00Var2.h("CONDITION"), toa1.a(wj00Var3.d("logs")), ((wj00) d4).b);
                                    if (jfrVar == null) {
                                        arrayList.add(jfrVar);
                                    }
                                }
                            }
                        }
                        jfrVar = null;
                        if (jfrVar == null) {
                        }
                    }
                    qfrVar = new qfr(arrayList, toa1.a((wj00) o8g0Var.b));
                }
                return qfrVar == null ? zmx.c(new YSError("Failed to parse FlagsResponse:\n".concat(mbb1.a(y3xVar)), null)) : zmx.d(qfrVar);
            case 2:
                ull0 T0 = ((oll0) obj).T0("DELETE FROM filters");
                try {
                    T0.q();
                    return zy11Var;
                } finally {
                    T0.close();
                }
            case 3:
                f.d((mnq0) obj);
                return zy11Var;
            case 4:
                f.d((mnq0) obj);
                return zy11Var;
            case 5:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.c(listItemComponent, 3);
                return listItemComponent;
            case 6:
                return new nj5((ListItemComponent) obj, 1);
            case 7:
                return new ca1((FrameLayout) obj, 15);
            case 8:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 9:
                f.p((mnq0) obj, 0);
                return zy11Var;
            case 10:
                return ((m5f) obj).a;
            case 11:
                return ((l5f) obj).getId();
            case 12:
                return zy11Var;
            case 13:
                CompositePaymentIconsView compositePaymentIconsView = new CompositePaymentIconsView((Context) obj, null, 0, 6, null);
                compositePaymentIconsView.setTitleVisible(true);
                compositePaymentIconsView.setImportantForAccessibility(2);
                return compositePaymentIconsView;
            case 14:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 15:
                return Integer.valueOf(-((Integer) obj).intValue());
            case 16:
                return zy11Var;
            case 17:
                return kp50.i();
            case 18:
                return kp50.i();
            case 19:
                _init_$lambda$0 = FormatTextWatcher._init_$lambda$0((String) obj);
                return _init_$lambda$0;
            case 20:
                return was.a((was) obj, null, null, null, false, HProv.PP_PASSWD_TERM);
            case 21:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 22:
                return new pbv((String) obj, (ccv) null, rev.k, (dcv) null, (vfv) null, 58);
            case 23:
                return new pbv((String) obj, new ccv(txg0.ybsdk_ic_yandex_logo_sqare_16), rev.n, new ccv(txg0.ybsdk_ic_yandex_logo_sqare_16), (vfv) null, 48);
            case 24:
                ((acx) obj).c = true;
                return zy11Var;
            case 25:
                ((wgs) obj).f1();
                return zy11Var;
            case 26:
                delayedAnimation$lambda$0 = FullscreenDestinationSearchModalView.delayedAnimation$lambda$0(((Boolean) obj).booleanValue());
                return delayedAnimation$lambda$0;
            case 27:
                ((isd) obj).X0(false, null);
                return zy11Var;
            case 28:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            default:
                return zy11Var;
        }
    }
}
