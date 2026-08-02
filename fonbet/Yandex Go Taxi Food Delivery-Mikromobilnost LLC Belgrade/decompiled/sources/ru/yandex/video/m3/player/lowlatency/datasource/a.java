package ru.yandex.video.m3.player.lowlatency.datasource;

import defpackage.hie0;
import java.util.Map;
import ru.yandex.video.m3.player.lowlatency.datasource.LowLatencyHttpDataSource;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements hie0 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // defpackage.hie0
    public final boolean apply(Object obj) {
        boolean lambda$keySet$0;
        boolean lambda$entrySet$1;
        switch (this.a) {
            case 0:
                lambda$keySet$0 = LowLatencyHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
                return lambda$keySet$0;
            default:
                lambda$entrySet$1 = LowLatencyHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
                return lambda$entrySet$1;
        }
    }
}
