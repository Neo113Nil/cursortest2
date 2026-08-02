package yads;

import android.widget.Toast;
import com.monetization.ads.utils.logger.collectors.MobileAdsLogsCollector;
import com.yandex.mobile.ads.R$string;
import defpackage.sls;
import defpackage.z481;
import defpackage.zy11;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class p90 extends Lambda implements sls {
    public final /* synthetic */ z481 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p90(z481 z481Var) {
        super(0);
        this.b = z481Var;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        MobileAdsLogsCollector.INSTANCE.setLogsCollectingEnabled(true);
        z481 z481Var = this.b;
        Toast.makeText(z481Var.a, z481Var.a.getString(R$string.debug_panel_logging_is_enabled), 0).show();
        return zy11.a;
    }
}
