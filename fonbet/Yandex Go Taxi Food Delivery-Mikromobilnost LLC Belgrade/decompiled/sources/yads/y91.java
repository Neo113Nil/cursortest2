package yads;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import defpackage.mb81;
import defpackage.ne81;
import defpackage.q971;
import defpackage.sls;
import defpackage.z6c;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class y91 extends Lambda implements sls {
    public final /* synthetic */ IntegrationInspectorActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.b = integrationInspectorActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        q971 b;
        IntegrationInspectorActivity integrationInspectorActivity = this.b;
        b = this.b.b();
        x91 x91Var = new x91(1, b, q971.class, "onAction", "onAction(Lcom/yandex/mobile/ads/features/debugpanel/ui/model/DebugPanelUiAction;)V", 0);
        return new mb81(integrationInspectorActivity, x91Var, new LinearLayoutManager(integrationInspectorActivity, 1, false), new z6c(x91Var, (ne81) IntegrationInspectorActivity.a(this.b).r.getValue()));
    }
}
