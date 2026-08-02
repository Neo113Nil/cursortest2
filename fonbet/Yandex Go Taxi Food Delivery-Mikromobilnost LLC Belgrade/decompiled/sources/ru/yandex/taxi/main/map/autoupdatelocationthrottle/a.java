package ru.yandex.taxi.main.map.autoupdatelocationthrottle;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.e6m;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.main.map.autoupdatelocationthrottle.AutoUpdateUserLocationStrategyExperiment", aVar, 19);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("location_update_debounce_millis", true);
        pluginGeneratedSerialDescriptor.j("low_speed_time_threshold_millis", true);
        pluginGeneratedSerialDescriptor.j("high_speed_time_threshold_millis", true);
        pluginGeneratedSerialDescriptor.j("low_speed_count_threshold", true);
        pluginGeneratedSerialDescriptor.j("high_speed_count_threshold", true);
        pluginGeneratedSerialDescriptor.j("enable_update_when_suggest_open", true);
        pluginGeneratedSerialDescriptor.j("high_speed_limit_meters_per_second", true);
        pluginGeneratedSerialDescriptor.j("time_delay_for_taxi_main_sec", true);
        pluginGeneratedSerialDescriptor.j("min_distance_update_for_taxi_main_meters", true);
        pluginGeneratedSerialDescriptor.j("max_distance_threshold_meters", true);
        pluginGeneratedSerialDescriptor.j("is_common_strategy", true);
        pluginGeneratedSerialDescriptor.j("main_screen_strategy", true);
        pluginGeneratedSerialDescriptor.j("taxi_main_strategy", true);
        pluginGeneratedSerialDescriptor.j("warmup_window_ms", true);
        pluginGeneratedSerialDescriptor.j("silent_reset_ms", true);
        pluginGeneratedSerialDescriptor.j("disco_jump_threshold_meters", true);
        pluginGeneratedSerialDescriptor.j("disco_jump_count_threshold", true);
        pluginGeneratedSerialDescriptor.j("disco_window_ms", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = AutoUpdateUserLocationStrategyExperiment.u;
        z96 z96Var = z96.a;
        pnz pnzVar = pnz.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{z96Var, pnzVar, pnzVar, pnzVar, pnzVar, pnzVar, z96Var, e6m.a, pnzVar, pnzVar, qke.n(h6wVar), z96Var, i3yVarArr[12].getValue(), i3yVarArr[13].getValue(), qke.n(pnzVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar), qke.n(h6wVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AutoUpdateUserLocationStrategyExperiment.u;
        b.getClass();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        double d = 0.0d;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        boolean z4 = true;
        Integer num4 = null;
        Integer num5 = null;
        AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType = null;
        Long l = null;
        AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType autoUpdateUserLocationStrategyType2 = null;
        int i2 = 0;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        while (z4) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = z5;
                    z4 = false;
                    z5 = z;
                case 0:
                    z3 = z4;
                    i2 |= 1;
                    z5 = b.C(serialDescriptor, 0);
                    z4 = z3;
                case 1:
                    z3 = z4;
                    j = b.f(serialDescriptor, 1);
                    i2 |= 2;
                    z4 = z3;
                case 2:
                    z3 = z4;
                    j2 = b.f(serialDescriptor, 2);
                    i2 |= 4;
                    z4 = z3;
                case 3:
                    z3 = z4;
                    j3 = b.f(serialDescriptor, 3);
                    i2 |= 8;
                    z4 = z3;
                case 4:
                    z3 = z4;
                    j4 = b.f(serialDescriptor, 4);
                    i2 |= 16;
                    z4 = z3;
                case 5:
                    z3 = z4;
                    j5 = b.f(serialDescriptor, 5);
                    i2 |= 32;
                    z4 = z3;
                case 6:
                    z3 = z4;
                    z6 = b.C(serialDescriptor, 6);
                    i2 |= 64;
                    z4 = z3;
                case 7:
                    z3 = z4;
                    d = b.E(serialDescriptor, 7);
                    i2 |= 128;
                    z4 = z3;
                case 8:
                    z3 = z4;
                    j6 = b.f(serialDescriptor, 8);
                    i2 |= 256;
                    z4 = z3;
                case 9:
                    z3 = z4;
                    j7 = b.f(serialDescriptor, 9);
                    i2 |= 512;
                    z4 = z3;
                case 10:
                    z2 = z4;
                    z = z5;
                    num5 = (Integer) b.s(serialDescriptor, 10, h6w.a, num5);
                    i2 |= 1024;
                    z4 = z2;
                    z5 = z;
                case 11:
                    z3 = z4;
                    z7 = b.C(serialDescriptor, 11);
                    i2 |= 2048;
                    z4 = z3;
                case 12:
                    z2 = z4;
                    z = z5;
                    autoUpdateUserLocationStrategyType = (AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType) b.A(serialDescriptor, 12, (myi) i3yVarArr[12].getValue(), autoUpdateUserLocationStrategyType);
                    i2 |= 4096;
                    z4 = z2;
                    z5 = z;
                case 13:
                    z2 = z4;
                    z = z5;
                    autoUpdateUserLocationStrategyType2 = (AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType) b.A(serialDescriptor, 13, (myi) i3yVarArr[13].getValue(), autoUpdateUserLocationStrategyType2);
                    i2 |= 8192;
                    z4 = z2;
                    z5 = z;
                case 14:
                    z2 = z4;
                    z = z5;
                    l = (Long) b.s(serialDescriptor, 14, pnz.a, l);
                    i2 |= 16384;
                    z4 = z2;
                    z5 = z;
                case 15:
                    z2 = z4;
                    z = z5;
                    num3 = (Integer) b.s(serialDescriptor, 15, h6w.a, num3);
                    i = 32768;
                    i2 |= i;
                    z4 = z2;
                    z5 = z;
                case 16:
                    z2 = z4;
                    z = z5;
                    num2 = (Integer) b.s(serialDescriptor, 16, h6w.a, num2);
                    i = 65536;
                    i2 |= i;
                    z4 = z2;
                    z5 = z;
                case 17:
                    z2 = z4;
                    z = z5;
                    num = (Integer) b.s(serialDescriptor, 17, h6w.a, num);
                    i = 131072;
                    i2 |= i;
                    z4 = z2;
                    z5 = z;
                case 18:
                    z2 = z4;
                    z = z5;
                    num4 = (Integer) b.s(serialDescriptor, 18, h6w.a, num4);
                    i = 262144;
                    i2 |= i;
                    z4 = z2;
                    z5 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new AutoUpdateUserLocationStrategyExperiment(i2, z5, j, j2, j3, j4, j5, z6, d, j6, j7, num5, z7, autoUpdateUserLocationStrategyType, autoUpdateUserLocationStrategyType2, l, num3, num2, num, num4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AutoUpdateUserLocationStrategyExperiment autoUpdateUserLocationStrategyExperiment = (AutoUpdateUserLocationStrategyExperiment) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AutoUpdateUserLocationStrategyExperiment.u;
        if (b.F() || autoUpdateUserLocationStrategyExperiment.b) {
            b.n(serialDescriptor, 0, autoUpdateUserLocationStrategyExperiment.b);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.c != 0) {
            b.s(serialDescriptor, 1, autoUpdateUserLocationStrategyExperiment.c);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.d != 0) {
            b.s(serialDescriptor, 2, autoUpdateUserLocationStrategyExperiment.d);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.e != 0) {
            b.s(serialDescriptor, 3, autoUpdateUserLocationStrategyExperiment.e);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.f != 0) {
            b.s(serialDescriptor, 4, autoUpdateUserLocationStrategyExperiment.f);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.g != 0) {
            b.s(serialDescriptor, 5, autoUpdateUserLocationStrategyExperiment.g);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.h) {
            b.n(serialDescriptor, 6, autoUpdateUserLocationStrategyExperiment.h);
        }
        if (b.F() || Double.compare(autoUpdateUserLocationStrategyExperiment.i, 0.0d) != 0) {
            b.E(serialDescriptor, 7, autoUpdateUserLocationStrategyExperiment.i);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.j != 0) {
            b.s(serialDescriptor, 8, autoUpdateUserLocationStrategyExperiment.j);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.k != 0) {
            b.s(serialDescriptor, 9, autoUpdateUserLocationStrategyExperiment.k);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.l != null) {
            b.g(serialDescriptor, 10, h6w.a, autoUpdateUserLocationStrategyExperiment.l);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.m) {
            b.n(serialDescriptor, 11, autoUpdateUserLocationStrategyExperiment.m);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.n != AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.THROTTLE_STRATEGY) {
            b.e(serialDescriptor, 12, (KSerializer) i3yVarArr[12].getValue(), autoUpdateUserLocationStrategyExperiment.n);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.o != AutoUpdateUserLocationStrategyExperiment.AutoUpdateUserLocationStrategyType.TIME_INTERVAL_STRATEGY) {
            b.e(serialDescriptor, 13, (KSerializer) i3yVarArr[13].getValue(), autoUpdateUserLocationStrategyExperiment.o);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.p != null) {
            b.g(serialDescriptor, 14, pnz.a, autoUpdateUserLocationStrategyExperiment.p);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.q != null) {
            b.g(serialDescriptor, 15, h6w.a, autoUpdateUserLocationStrategyExperiment.q);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.r != null) {
            b.g(serialDescriptor, 16, h6w.a, autoUpdateUserLocationStrategyExperiment.r);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.s != null) {
            b.g(serialDescriptor, 17, h6w.a, autoUpdateUserLocationStrategyExperiment.s);
        }
        if (b.F() || autoUpdateUserLocationStrategyExperiment.t != null) {
            b.g(serialDescriptor, 18, h6w.a, autoUpdateUserLocationStrategyExperiment.t);
        }
        b.c(serialDescriptor);
    }
}
