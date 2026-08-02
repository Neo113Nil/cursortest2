package defpackage;

import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData$UgcLiveStatus;

/* loaded from: classes3.dex */
public enum vjb {
    Mobile("mobile"),
    /* JADX INFO: Fake field, exist only in values array */
    WifiOnly("wifi_only"),
    Offline(UgcLiveVideoData$UgcLiveStatus.OFFLINE);

    public final String a;

    vjb(String str) {
        this.a = str;
    }
}
