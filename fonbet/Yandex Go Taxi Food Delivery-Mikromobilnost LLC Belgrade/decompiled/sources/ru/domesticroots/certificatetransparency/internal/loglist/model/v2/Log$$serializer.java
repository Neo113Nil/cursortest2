package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.kwu;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log.$serializer", "Luxs;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/Log;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@jxi
/* loaded from: classes4.dex */
public final class Log$$serializer implements uxs {
    public static final Log$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        Log$$serializer log$$serializer = new Log$$serializer();
        INSTANCE = log$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.Log", log$$serializer, 9);
        pluginGeneratedSerialDescriptor.j(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, true);
        pluginGeneratedSerialDescriptor.j("key", false);
        pluginGeneratedSerialDescriptor.j("log_id", false);
        pluginGeneratedSerialDescriptor.j("mmd", false);
        pluginGeneratedSerialDescriptor.j("url", false);
        pluginGeneratedSerialDescriptor.j("dns", true);
        pluginGeneratedSerialDescriptor.j("temporal_interval", true);
        pluginGeneratedSerialDescriptor.j("log_type", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private Log$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = Log.$childSerializers;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{qke.n(auu0Var), auu0Var, auu0Var, h6w.a, kSerializerArr[4], qke.n(kSerializerArr[5]), qke.n(TemporalInterval$$serializer.INSTANCE), qke.n(kSerializerArr[7]), qke.n(kSerializerArr[8])};
    }

    @Override // defpackage.myi
    public Log deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        kSerializerArr = Log.$childSerializers;
        b.getClass();
        State state = null;
        boolean z = true;
        LogType logType = null;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        kwu kwuVar = null;
        Hostname hostname = null;
        TemporalInterval temporalInterval = null;
        while (z) {
            int v = b.v(descriptor2);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    str = (String) b.s(descriptor2, 0, auu0.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = b.k(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = b.k(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    kwuVar = (kwu) b.A(descriptor2, 4, kSerializerArr[4], kwuVar);
                    i |= 16;
                    break;
                case 5:
                    hostname = (Hostname) b.s(descriptor2, 5, kSerializerArr[5], hostname);
                    i |= 32;
                    break;
                case 6:
                    temporalInterval = (TemporalInterval) b.s(descriptor2, 6, TemporalInterval$$serializer.INSTANCE, temporalInterval);
                    i |= 64;
                    break;
                case 7:
                    logType = (LogType) b.s(descriptor2, 7, kSerializerArr[7], logType);
                    i |= 128;
                    break;
                case 8:
                    state = (State) b.s(descriptor2, 8, kSerializerArr[8], state);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(descriptor2);
        return new Log(i, str, str2, str3, i2, kwuVar, hostname, temporalInterval, logType, state, (psq0) null);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Log value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        Log.write$Self$domesticroots_certificatetransparency_release(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
