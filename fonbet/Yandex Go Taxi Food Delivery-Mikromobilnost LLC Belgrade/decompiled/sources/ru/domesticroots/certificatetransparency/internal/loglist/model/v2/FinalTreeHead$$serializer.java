package ru.domesticroots.certificatetransparency.internal.loglist.model.v2;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.psq0;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"ru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead.$serializer", "Luxs;", "Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lzy11;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lru/domesticroots/certificatetransparency/internal/loglist/model/v2/FinalTreeHead;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "domesticroots-certificatetransparency_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@jxi
/* loaded from: classes4.dex */
public final class FinalTreeHead$$serializer implements uxs {
    public static final FinalTreeHead$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        FinalTreeHead$$serializer finalTreeHead$$serializer = new FinalTreeHead$$serializer();
        INSTANCE = finalTreeHead$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.domesticroots.certificatetransparency.internal.loglist.model.v2.FinalTreeHead", finalTreeHead$$serializer, 2);
        pluginGeneratedSerialDescriptor.j("tree_size", false);
        pluginGeneratedSerialDescriptor.j("sha256_root_hash", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private FinalTreeHead$$serializer() {
    }

    @Override // defpackage.uxs
    public KSerializer[] childSerializers() {
        return new KSerializer[]{h6w.a, auu0.a};
    }

    @Override // defpackage.myi
    public FinalTreeHead deserialize(Decoder decoder) {
        SerialDescriptor descriptor2 = getDescriptor();
        sjd b = decoder.b(descriptor2);
        b.getClass();
        psq0 psq0Var = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        while (z) {
            int v = b.v(descriptor2);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(descriptor2, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(descriptor2, 1);
                i |= 2;
            }
        }
        b.c(descriptor2);
        return new FinalTreeHead(i, i2, str, psq0Var);
    }

    @Override // defpackage.myi
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, FinalTreeHead value) {
        SerialDescriptor descriptor2 = getDescriptor();
        yjd b = encoder.b(descriptor2);
        FinalTreeHead.write$Self$domesticroots_certificatetransparency_release(value, b, descriptor2);
        b.c(descriptor2);
    }

    @Override // defpackage.uxs
    public KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
