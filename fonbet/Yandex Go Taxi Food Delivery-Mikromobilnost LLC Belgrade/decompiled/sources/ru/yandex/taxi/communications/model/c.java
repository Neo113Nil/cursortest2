package ru.yandex.taxi.communications.model;

import defpackage.akz0;
import defpackage.bze;
import defpackage.e00;
import defpackage.g00;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.kcm;
import defpackage.lzg;
import defpackage.myi;
import defpackage.ny61;
import defpackage.ocm;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.uzg;
import defpackage.w7s;
import defpackage.xjz0;
import defpackage.yjd;
import defpackage.zye;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.CommunicationItem.Widgets", cVar, 8);
        pluginGeneratedSerialDescriptor.j("deeplink_arrow_button", true);
        pluginGeneratedSerialDescriptor.j("action_button", true);
        pluginGeneratedSerialDescriptor.j("toggle", true);
        pluginGeneratedSerialDescriptor.j("drive_arrow_button", true);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("actions_arrow_button", true);
        pluginGeneratedSerialDescriptor.j("counter_arrow_button", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(lzg.a), qke.n(ru.yandex.taxi.communications.model.widgets.a.a), qke.n(xjz0.a), qke.n(kcm.a), CommunicationItem.a.i[4].getValue(), qke.n(e00.a), qke.n(zye.a), qke.n(w7s.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = CommunicationItem.a.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        FormattedText formattedText = null;
        uzg uzgVar = null;
        ActionButton actionButton = null;
        akz0 akz0Var = null;
        ocm ocmVar = null;
        List list = null;
        g00 g00Var = null;
        bze bzeVar = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    uzgVar = (uzg) b.s(serialDescriptor, 0, lzg.a, uzgVar);
                    i |= 1;
                    break;
                case 1:
                    actionButton = (ActionButton) b.s(serialDescriptor, 1, ru.yandex.taxi.communications.model.widgets.a.a, actionButton);
                    i |= 2;
                    break;
                case 2:
                    akz0Var = (akz0) b.s(serialDescriptor, 2, xjz0.a, akz0Var);
                    i |= 4;
                    break;
                case 3:
                    ocmVar = (ocm) b.s(serialDescriptor, 3, kcm.a, ocmVar);
                    i |= 8;
                    break;
                case 4:
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    g00Var = (g00) b.s(serialDescriptor, 5, e00.a, g00Var);
                    i |= 32;
                    break;
                case 6:
                    bzeVar = (bze) b.s(serialDescriptor, 6, zye.a, bzeVar);
                    i |= 64;
                    break;
                case 7:
                    formattedText = (FormattedText) b.s(serialDescriptor, 7, w7s.a, formattedText);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new CommunicationItem.a(i, uzgVar, actionButton, akz0Var, ocmVar, list, g00Var, bzeVar, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        CommunicationItem.a aVar = (CommunicationItem.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = CommunicationItem.a.i;
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, lzg.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, ru.yandex.taxi.communications.model.widgets.a.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, xjz0.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, kcm.a, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), aVar.e);
        }
        if (b.F() || aVar.f != null) {
            b.g(serialDescriptor, 5, e00.a, aVar.f);
        }
        if (b.F() || aVar.g != null) {
            b.g(serialDescriptor, 6, zye.a, aVar.g);
        }
        if (b.F() || aVar.h != null) {
            b.g(serialDescriptor, 7, w7s.a, aVar.h);
        }
        b.c(serialDescriptor);
    }
}
