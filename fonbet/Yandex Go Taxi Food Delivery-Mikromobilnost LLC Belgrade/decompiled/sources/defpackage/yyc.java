package defpackage;

import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class yyc implements uxs {
    public static final yyc a;
    private static final SerialDescriptor descriptor;

    static {
        yyc yycVar = new yyc();
        a = yycVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.pay.api.google.model.CompletePurchaseParams", yycVar, 4);
        pluginGeneratedSerialDescriptor.j("acknowledge", false);
        pluginGeneratedSerialDescriptor.j("products", false);
        pluginGeneratedSerialDescriptor.j(AuthSdkActivity.RESPONSE_TYPE_TOKEN, false);
        pluginGeneratedSerialDescriptor.j("isSubscription", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = azc.e;
        z96 z96Var = z96.a;
        return new KSerializer[]{z96Var, i3yVarArr[1].getValue(), auu0.a, z96Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = azc.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        String str = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                str = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                z3 = b.C(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new azc(i, str, list, z2, z3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        azc azcVar = (azc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = azc.e;
        b.n(serialDescriptor, 0, azcVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), azcVar.b);
        b.o(serialDescriptor, 2, azcVar.c);
        b.n(serialDescriptor, 3, azcVar.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
