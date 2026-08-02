package ru.yandex.taxi.communications.model.widgets;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
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
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class i implements uxs {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.ActionButton.CancelOrders", iVar, 2);
        pluginGeneratedSerialDescriptor.j("order_ids_for_cancel", true);
        pluginGeneratedSerialDescriptor.j("done_notification", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ActionButton.b.c[0].getValue(), qke.n(k.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ActionButton.b.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        ActionButton.b.a aVar = null;
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
                aVar = (ActionButton.b.a) b.s(serialDescriptor, 1, k.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ActionButton.b(i, list, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ActionButton.b bVar = (ActionButton.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ActionButton.b.c;
        if (b.F() || !jl40.l(bVar.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), bVar.a);
        }
        if (b.F() || bVar.b != null) {
            b.g(serialDescriptor, 1, k.a, bVar.b);
        }
        b.c(serialDescriptor);
    }
}
