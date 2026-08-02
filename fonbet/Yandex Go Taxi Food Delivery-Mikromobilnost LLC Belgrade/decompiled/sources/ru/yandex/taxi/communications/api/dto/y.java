package ru.yandex.taxi.communications.api.dto;

import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.vmt;
import defpackage.yjd;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes14.dex */
public final /* synthetic */ class y implements uxs {
    public static final y a;
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.Story.Options", yVar, 4);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("zones", true);
        pluginGeneratedSerialDescriptor.j("start_date", true);
        pluginGeneratedSerialDescriptor.j("end_date", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = Story.a.e;
        vmt vmtVar = vmt.a;
        return new KSerializer[]{h6w.a, i3yVarArr[1].getValue(), qke.n(vmtVar), qke.n(vmtVar)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.a.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        List list = null;
        Calendar calendar = null;
        Calendar calendar2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                calendar = (Calendar) b.s(serialDescriptor, 2, vmt.a, calendar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                calendar2 = (Calendar) b.s(serialDescriptor, 3, vmt.a, calendar2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new Story.a(i, i2, list, calendar, calendar2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Story.a aVar = (Story.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.a.e;
        if (b.F() || aVar.a != 0) {
            b.A(0, aVar.a, serialDescriptor);
        }
        if (b.F() || !jl40.l(aVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, vmt.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, vmt.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
