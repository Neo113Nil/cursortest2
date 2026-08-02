package ru.yandex.taxi.requirements.models.net;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.CompoundSelectDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.CompoundSelectDto", aVar, 2);
        pluginGeneratedSerialDescriptor.j("items", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = CompoundSelectDto.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CompoundSelectDto.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        CompoundSelectDto.CompoundSelectItemTypeDto compoundSelectItemTypeDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                compoundSelectItemTypeDto = (CompoundSelectDto.CompoundSelectItemTypeDto) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), compoundSelectItemTypeDto);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new CompoundSelectDto(i, list, compoundSelectItemTypeDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CompoundSelectDto compoundSelectDto = (CompoundSelectDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CompoundSelectDto.c;
        if (b.F() || !jl40.l(compoundSelectDto.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), compoundSelectDto.a);
        }
        if (b.F() || compoundSelectDto.b != CompoundSelectDto.CompoundSelectItemTypeDto.DEFAULT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), compoundSelectDto.b);
        }
        b.c(serialDescriptor);
    }
}
