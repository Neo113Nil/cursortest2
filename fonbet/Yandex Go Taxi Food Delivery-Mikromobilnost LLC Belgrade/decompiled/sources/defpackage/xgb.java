package defpackage;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Condition;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Result;

/* loaded from: classes5.dex */
public final /* synthetic */ class xgb implements uxs {
    public static final xgb a;
    private static final SerialDescriptor descriptor;

    static {
        xgb xgbVar = new xgb();
        a = xgbVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.eatskit.dto.CheckPaymentResponse", xgbVar, 2);
        pluginGeneratedSerialDescriptor.j(TarifficatorScenarioActivity.RESULT_KEY, false);
        pluginGeneratedSerialDescriptor.j("condition", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = bhb.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n((KSerializer) i3yVarArr[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bhb.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        CheckPaymentResponse$Result checkPaymentResponse$Result = null;
        CheckPaymentResponse$Condition checkPaymentResponse$Condition = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                checkPaymentResponse$Result = (CheckPaymentResponse$Result) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), checkPaymentResponse$Result);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                checkPaymentResponse$Condition = (CheckPaymentResponse$Condition) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), checkPaymentResponse$Condition);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new bhb(i, checkPaymentResponse$Result, checkPaymentResponse$Condition);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bhb bhbVar = (bhb) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = bhb.c;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), bhbVar.a);
        b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), bhbVar.b);
        b.c(serialDescriptor);
    }
}
