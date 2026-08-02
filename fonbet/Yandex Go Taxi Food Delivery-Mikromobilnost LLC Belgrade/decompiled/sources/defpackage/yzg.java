package defpackage;

import com.yandex.go.flex.common.api.actions.DeeplinkNavigationAction;
import com.yandex.go.flex.common.descriptors.action.SendRythmAnalyticsAction;
import com.yandex.go.flex.common.descriptors.action.g;
import defpackage.csf0;
import defpackage.mu;
import defpackage.qoi0;
import defpackage.yzg;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

/* loaded from: classes.dex */
public final class yzg implements nu {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public yzg(y50 y50Var) {
        this.a = 0;
        this.b = y50Var;
        this.c = new mu("DeeplinkNavigationAction", qoi0.a(DeeplinkNavigationAction.class), new cue(27), a.b(LazyThreadSafetyMode.NONE, new sbc(6, this)), EmptyList.a, false);
    }

    @Override // defpackage.nu
    public final mu create() {
        switch (this.a) {
            case 0:
                return (mu) this.c;
            default:
                return (mu) ((i3y) this.c).getValue();
        }
    }

    public yzg(h3y h3yVar) {
        this.a = 1;
        this.b = h3yVar;
        this.c = a.a(new sls() { // from class: com.yandex.go.flex.common.descriptors.analytics.a
            @Override // defpackage.sls
            public final Object invoke() {
                return new mu("SendRythmAnalyticsAction", qoi0.a(SendRythmAnalyticsAction.class), new RythmAnalyticsDescriptorFactory$rythmAnalyticsDescriptor$2$1(0, SendRythmAnalyticsAction.Companion, g.class, "serializer", "serializer()Lkotlinx/serialization/KSerializer;", 0), kotlin.a.b(LazyThreadSafetyMode.NONE, new csf0(17, yzg.this)), EmptyList.a, false);
            }
        });
    }
}
