package defpackage;

import com.yandex.plus.core.data.common.PlusColor;
import com.yandex.plus.core.data.common.PlusThemedColor;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final class wpd0 {
    public final <T> KSerializer serializer(final KSerializer kSerializer) {
        return new uxs() { // from class: vpd0
            private final SerialDescriptor descriptor;

            {
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.core.data.common.PlusThemedColor", this, 2);
                pluginGeneratedSerialDescriptor.j("light", false);
                pluginGeneratedSerialDescriptor.j("dark", false);
                this.descriptor = pluginGeneratedSerialDescriptor;
            }

            @Override // defpackage.uxs
            public final KSerializer[] childSerializers() {
                KSerializer kSerializer2 = kSerializer;
                return new KSerializer[]{qke.n(kSerializer2), qke.n(kSerializer2)};
            }

            @Override // defpackage.myi
            public final Object deserialize(Decoder decoder) {
                SerialDescriptor serialDescriptor = this.descriptor;
                sjd b = decoder.b(serialDescriptor);
                b.getClass();
                psq0 psq0Var = null;
                boolean z = true;
                int i = 0;
                PlusColor plusColor = null;
                PlusColor plusColor2 = null;
                while (z) {
                    int v = b.v(serialDescriptor);
                    if (v != -1) {
                        KSerializer kSerializer2 = kSerializer;
                        if (v == 0) {
                            plusColor = (PlusColor) b.s(serialDescriptor, 0, kSerializer2, plusColor);
                            i |= 1;
                        } else {
                            if (v != 1) {
                                ny61.c(v);
                                return null;
                            }
                            plusColor2 = (PlusColor) b.s(serialDescriptor, 1, kSerializer2, plusColor2);
                            i |= 2;
                        }
                    } else {
                        z = false;
                    }
                }
                b.c(serialDescriptor);
                return new PlusThemedColor(i, plusColor, plusColor2, psq0Var);
            }

            @Override // defpackage.myi
            public final SerialDescriptor getDescriptor() {
                return this.descriptor;
            }

            @Override // kotlinx.serialization.KSerializer
            public final void serialize(Encoder encoder, Object obj) {
                SerialDescriptor serialDescriptor = this.descriptor;
                yjd b = encoder.b(serialDescriptor);
                PlusThemedColor.write$Self$plus_core_common_release((PlusThemedColor) obj, b, serialDescriptor, kSerializer);
                b.c(serialDescriptor);
            }

            @Override // defpackage.uxs
            public final KSerializer[] typeParametersSerializers() {
                return new KSerializer[]{kSerializer};
            }
        };
    }
}
