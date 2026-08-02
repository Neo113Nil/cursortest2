package defpackage;

import java.util.Map;
import ru.yandex.video.m3.data.AdParameters;
import ru.yandex.video.m3.data.DataSourceParameters;
import ru.yandex.video.m3.data.DrmParameters;
import ru.yandex.video.m3.data.PlaybackParameters;
import ru.yandex.video.m3.data.PlayerAnalyticsData;

/* loaded from: classes6.dex */
public final class o0l {
    public final boolean a;
    public Long b;
    public Map c;
    public AdParameters d;
    public PlayerAnalyticsData e;
    public Boolean f;
    public Boolean g;
    public Boolean h;
    public DrmParameters i;
    public Boolean j;
    public DataSourceParameters k;
    public DataSourceParameters l;

    public o0l(boolean z) {
        this.a = z;
    }

    public final PlaybackParameters a() {
        Long l = this.b;
        Map map = this.c;
        AdParameters adParameters = this.d;
        PlayerAnalyticsData playerAnalyticsData = this.e;
        Boolean bool = this.f;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = this.g;
        boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = this.h;
        boolean booleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        DrmParameters drmParameters = this.i;
        Boolean bool4 = this.j;
        return new PlaybackParameters(this.a, l, map, adParameters, null, playerAnalyticsData, booleanValue, booleanValue2, booleanValue3, drmParameters, bool4 != null ? bool4.booleanValue() : false, this.k, this.l, null);
    }
}
