package defpackage;

import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.CommonFeatureFlag;
import com.ybsdk.rconfig.configs.FpsPayReturnDeeplink;
import com.ybsdk.rconfig.configs.QrScannerGuidelinesConfigSchema;
import com.ybsdk.rconfig.configs.TransfersDashboardFeatureShutterSizesConfig;
import com.ybsdk.rconfig.configs.TransfersDashboardQrButton;
import com.ybsdk.rconfig.configs.TransfersDashboardTopButtonsConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class qu01 implements ro01 {
    public final String a;
    public final /* synthetic */ b b;

    public qu01(b bVar) {
        this.b = bVar;
        this.a = ((FpsPayReturnDeeplink) bVar.d(fbs.a).getData()).getPrefix();
    }

    public final ArrayList a() {
        TransfersDashboardTopButtonsConfig transfersDashboardTopButtonsConfig = (TransfersDashboardTopButtonsConfig) this.b.d(wv01.a).getData();
        List<TransfersDashboardQrButton> buttons = transfersDashboardTopButtonsConfig.getButtons();
        ArrayList arrayList = new ArrayList(tcc.n(buttons, 10));
        Iterator<T> it = buttons.iterator();
        while (it.hasNext()) {
            arrayList.add(((TransfersDashboardQrButton) it.next()).toEntity(transfersDashboardTopButtonsConfig.getTokenizationAction()));
        }
        return arrayList;
    }

    public final mo01 b() {
        return ((QrScannerGuidelinesConfigSchema) this.b.d(gfg0.a).getData()).toEntity();
    }

    public final no01 c() {
        return ((TransfersDashboardFeatureShutterSizesConfig) this.b.d(fv01.a).getData()).toEntity();
    }

    public final boolean d() {
        b bVar = this.b;
        return jl40.l(bVar.r().isEnabledOnTransfersScreen(), Boolean.TRUE) && bVar.r().isEnabled();
    }

    public final boolean e() {
        return ((CommonFeatureFlag) this.b.d(wlp.U0).getData()).isEnabled();
    }

    public final boolean f() {
        return this.b.q().getTsarButton() != null;
    }
}
