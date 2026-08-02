package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.service.MirroringService;
import com.connectsdk.service.webos.lgcast.screenmirroring.service.MirroringServiceEvent;

/* loaded from: classes.dex */
public final /* synthetic */ class x5i implements MirroringServiceEvent.ScreenOnOffListener, MirroringServiceEvent.AccessibilitySettingListener {
    public final /* synthetic */ MirroringService a;

    public /* synthetic */ x5i(MirroringService mirroringService) {
        this.a = mirroringService;
    }

    @Override // com.connectsdk.service.webos.lgcast.screenmirroring.service.MirroringServiceEvent.AccessibilitySettingListener
    public void onAccessibilitySettingChanged(boolean z) {
        this.a.lambda$initializeService$2(z);
    }

    @Override // com.connectsdk.service.webos.lgcast.screenmirroring.service.MirroringServiceEvent.ScreenOnOffListener
    public void onScreenOnOffChanged(boolean z) {
        this.a.lambda$initializeService$1(z);
    }
}
