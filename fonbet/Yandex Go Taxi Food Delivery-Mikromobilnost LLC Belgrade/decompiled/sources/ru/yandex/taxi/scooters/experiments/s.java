package ru.yandex.taxi.scooters.experiments;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jrl0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.yandex.taxi.scooters.experiments.ScootersCardV2;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/experiments/s;", "Lru/yandex/taxi/scooters/experiments/t;", "Companion", "ru/yandex/taxi/scooters/experiments/q", "ru/yandex/taxi/scooters/experiments/r", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class s extends t {
    public static final r Companion = new r();
    public static final i3y[] e = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jrl0(10)), null, null};
    public final boolean a;
    public final ScootersCardV2.ChargeConfig.ValueOption b;
    public final String c;
    public final String d;

    public s(int i, boolean z, ScootersCardV2.ChargeConfig.ValueOption valueOption, String str, String str2) {
        this.a = (i & 1) == 0 ? true : z;
        if ((i & 2) == 0) {
            this.b = ScootersCardV2.ChargeConfig.ValueOption.PERCENTS;
        } else {
            this.b = valueOption;
        }
        if ((i & 4) == 0) {
            this.c = "textMinor";
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = "textMinor";
        } else {
            this.d = str2;
        }
    }

    @Override // ru.yandex.taxi.scooters.experiments.t
    /* renamed from: a, reason: from getter */
    public final boolean getA() {
        return this.a;
    }

    @Override // ru.yandex.taxi.scooters.experiments.t
    /* renamed from: b, reason: from getter */
    public final ScootersCardV2.ChargeConfig.ValueOption getB() {
        return this.b;
    }

    public s() {
        ScootersCardV2.ChargeConfig.ValueOption valueOption = ScootersCardV2.ChargeConfig.ValueOption.PERCENTS;
        this.a = true;
        this.b = valueOption;
        this.c = "textMinor";
        this.d = "textMinor";
    }
}
