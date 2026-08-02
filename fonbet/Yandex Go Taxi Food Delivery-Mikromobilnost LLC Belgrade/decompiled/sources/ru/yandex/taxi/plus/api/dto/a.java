package ru.yandex.taxi.plus.api.dto;

import com.adjust.sdk.Constants;
import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.Action;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.Action", aVar, 11);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("url", true);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("setting_id", true);
        pluginGeneratedSerialDescriptor.j("hook_id", true);
        pluginGeneratedSerialDescriptor.j("need_authorization", true);
        pluginGeneratedSerialDescriptor.j("typed_screen_id", true);
        pluginGeneratedSerialDescriptor.j("vertical", true);
        pluginGeneratedSerialDescriptor.j(PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, true);
        pluginGeneratedSerialDescriptor.j("templates", true);
        pluginGeneratedSerialDescriptor.j("plus_context", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = Action.l;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), z96.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[9].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = Action.l;
        b.getClass();
        String str = null;
        List list = null;
        String str2 = null;
        boolean z2 = true;
        String str3 = null;
        int i = 0;
        Action.Type type = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        boolean z3 = false;
        String str8 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    type = (Action.Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), type);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str4 = (String) b.s(serialDescriptor, 1, auu0.a, str4);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str5 = (String) b.s(serialDescriptor, 2, auu0.a, str5);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str6 = (String) b.s(serialDescriptor, 3, auu0.a, str6);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str7 = (String) b.s(serialDescriptor, 4, auu0.a, str7);
                    i |= 16;
                    break;
                case 5:
                    z3 = b.C(serialDescriptor, 5);
                    i |= 32;
                    i3yVarArr2 = i3yVarArr2;
                    continue;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str8 = (String) b.s(serialDescriptor, 6, auu0.a, str8);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str3 = (String) b.s(serialDescriptor, 7, auu0.a, str3);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 8, auu0.a, str2);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), list);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 10, auu0.a, str);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new Action(i, type, str4, str5, str6, str7, z3, str8, str3, str2, list, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Action action = (Action) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Action.l;
        if (b.F() || action.a != Action.Type.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), action.a);
        }
        if (b.F() || action.b != null) {
            b.g(serialDescriptor, 1, auu0.a, action.b);
        }
        if (b.F() || action.c != null) {
            b.g(serialDescriptor, 2, auu0.a, action.c);
        }
        if (b.F() || action.d != null) {
            b.g(serialDescriptor, 3, auu0.a, action.d);
        }
        if (b.F() || action.e != null) {
            b.g(serialDescriptor, 4, auu0.a, action.e);
        }
        if (b.F() || action.f) {
            b.n(serialDescriptor, 5, action.f);
        }
        if (b.F() || action.g != null) {
            b.g(serialDescriptor, 6, auu0.a, action.g);
        }
        if (b.F() || action.h != null) {
            b.g(serialDescriptor, 7, auu0.a, action.h);
        }
        if (b.F() || action.i != null) {
            b.g(serialDescriptor, 8, auu0.a, action.i);
        }
        if (b.F() || !jl40.l(action.j, EmptyList.a)) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), action.j);
        }
        if (b.F() || action.k != null) {
            b.g(serialDescriptor, 10, auu0.a, action.k);
        }
        b.c(serialDescriptor);
    }
}
