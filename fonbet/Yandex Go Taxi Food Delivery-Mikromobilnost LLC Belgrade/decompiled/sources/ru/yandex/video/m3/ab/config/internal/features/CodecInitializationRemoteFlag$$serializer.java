package ru.yandex.video.m3.ab.config.internal.features;

import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.pnz;
import defpackage.psq0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag.$serializer", "Luxs;", "Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lru/yandex/video/m3/ab/config/internal/features/CodecInitializationRemoteFlag;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@jxi
/* loaded from: classes7.dex */
public final class CodecInitializationRemoteFlag$$serializer implements uxs {
    public static final int $stable = 0;
    public static final CodecInitializationRemoteFlag$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        CodecInitializationRemoteFlag$$serializer codecInitializationRemoteFlag$$serializer = new CodecInitializationRemoteFlag$$serializer();
        INSTANCE = codecInitializationRemoteFlag$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.video.m3.ab.config.internal.features.CodecInitializationRemoteFlag", codecInitializationRemoteFlag$$serializer, 4);
        pluginGeneratedSerialDescriptor.j("shouldTryInitCodecsWithRetries", true);
        pluginGeneratedSerialDescriptor.j("retriesCount", true);
        pluginGeneratedSerialDescriptor.j("timeoutMs", true);
        pluginGeneratedSerialDescriptor.j("useIncrementalCodecInitTimeout", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CodecInitializationRemoteFlag$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, h6w.a, pnz.a, z96Var};
    }

    @Override // defpackage.myi
    public CodecInitializationRemoteFlag deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        b.getClass();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        long j = 0;
        boolean z3 = true;
        while (z3) {
            int v = b.v(descriptor2);
            if (v == -1) {
                z3 = false;
            } else if (v == 0) {
                z = b.C(descriptor2, 0);
                i |= 1;
            } else if (v == 1) {
                i2 = b.h(descriptor2, 1);
                i |= 2;
            } else if (v == 2) {
                j = b.f(descriptor2, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z2 = b.C(descriptor2, 3);
                i |= 8;
            }
        }
        b.c(descriptor2);
        return new CodecInitializationRemoteFlag(i, z, i2, j, z2, (psq0) null);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, CodecInitializationRemoteFlag value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        CodecInitializationRemoteFlag.write$Self$video_player_internalRelease(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
