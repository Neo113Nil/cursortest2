package defpackage;

import com.connectsdk.service.webos.lgcast.common.utils.ProgressUtil;
import com.connectsdk.service.webos.lgcast.common.utils.TimerUtil;

/* loaded from: classes.dex */
public final /* synthetic */ class mvm implements TimerUtil.TimerListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProgressUtil b;

    public /* synthetic */ mvm(ProgressUtil progressUtil, int i) {
        this.a = i;
        this.b = progressUtil;
    }

    @Override // com.connectsdk.service.webos.lgcast.common.utils.TimerUtil.TimerListener
    public final void onTime() {
        switch (this.a) {
            case 0:
                this.b.lambda$show$0();
                break;
            default:
                this.b.lambda$show$1();
                break;
        }
    }
}
