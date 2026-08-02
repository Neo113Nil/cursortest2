package defpackage;

import ru.yandex.video.m3.model.config.mediasource.LivePlaybackConfig;

/* loaded from: classes6.dex */
public final class sdg {
    public Boolean a;
    public Long b;
    public Long c;
    public Long d;
    public Float e;
    public Float f;

    public final LivePlaybackConfig a() {
        Boolean bool = this.a;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        Long l = this.b;
        long longValue = l != null ? l.longValue() : booleanValue ? 7000L : 25000L;
        Long l2 = this.c;
        long longValue2 = l2 != null ? l2.longValue() : booleanValue ? 6000L : 20000L;
        Long l3 = this.d;
        long longValue3 = l3 != null ? l3.longValue() : booleanValue ? 8000L : 30000L;
        Float f = this.e;
        float f2 = 1.0f;
        float floatValue = f != null ? f.floatValue() : booleanValue ? 0.97f : 1.0f;
        Float f3 = this.f;
        if (f3 != null) {
            f2 = f3.floatValue();
        } else if (booleanValue) {
            f2 = 1.03f;
        }
        return new LivePlaybackConfig(booleanValue, longValue, longValue2, longValue3, floatValue, f2, null);
    }
}
