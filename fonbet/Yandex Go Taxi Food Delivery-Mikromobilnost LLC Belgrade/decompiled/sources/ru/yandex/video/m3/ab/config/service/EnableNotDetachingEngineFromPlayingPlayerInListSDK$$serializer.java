package ru.yandex.video.m3.ab.config.service;

import defpackage.auu0;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK.$serializer", "Luxs;", "Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lru/yandex/video/m3/ab/config/service/EnableNotDetachingEngineFromPlayingPlayerInListSDK;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@jxi
/* loaded from: classes7.dex */
public final class EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer implements uxs {
    public static final int $stable = 0;
    public static final EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer enableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer = new EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer();
        INSTANCE = enableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.video.m3.ab.config.service.EnableNotDetachingEngineFromPlayingPlayerInListSDK", enableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer, 3);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_SERVICE, true);
        pluginGeneratedSerialDescriptor.j("defaultFlagValue", true);
        pluginGeneratedSerialDescriptor.j("enable", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private EnableNotDetachingEngineFromPlayingPlayerInListSDK$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{qke.n(auu0.a), z96Var, z96Var};
    }

    @Override // defpackage.myi
    public EnableNotDetachingEngineFromPlayingPlayerInListSDK deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        while (z) {
            int v = b.v(descriptor2);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(descriptor2, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                z2 = b.C(descriptor2, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                z3 = b.C(descriptor2, 2);
                i |= 4;
            }
        }
        b.c(descriptor2);
        return new EnableNotDetachingEngineFromPlayingPlayerInListSDK(i, str, z2, z3, null);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, EnableNotDetachingEngineFromPlayingPlayerInListSDK value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        EnableNotDetachingEngineFromPlayingPlayerInListSDK.write$Self$video_player_internalRelease(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
