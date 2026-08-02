package yads;

import com.yandex.mobile.ads.features.debugpanel.ui.IntegrationInspectorActivity;
import defpackage.sls;
import defpackage.z481;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class w91 extends Lambda implements sls {
    public final /* synthetic */ IntegrationInspectorActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w91(IntegrationInspectorActivity integrationInspectorActivity) {
        super(0);
        this.b = integrationInspectorActivity;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        return new z481(this.b);
    }
}
