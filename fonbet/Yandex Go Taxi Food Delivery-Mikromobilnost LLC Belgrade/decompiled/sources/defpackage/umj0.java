package defpackage;

import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Map;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class umj0 implements uxs {
    public static final umj0 a;
    private static final SerialDescriptor descriptor;

    static {
        umj0 umj0Var = new umj0();
        a = umj0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementsAddressInputExperiment", umj0Var, 5);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("l10n", true);
        pluginGeneratedSerialDescriptor.j("summary", true);
        pluginGeneratedSerialDescriptor.j("contact_picker_screen", true);
        pluginGeneratedSerialDescriptor.j("address_selection_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z96.a, wmj0.g[1].getValue(), dnj0.a, uae.a, fmj0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wmj0.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        Map map = null;
        fnj0 fnj0Var = null;
        wae waeVar = null;
        hmj0 hmj0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                z2 = b.C(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                map = (Map) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                i |= 2;
            } else if (v == 2) {
                fnj0Var = (fnj0) b.A(serialDescriptor, 2, dnj0.a, fnj0Var);
                i |= 4;
            } else if (v == 3) {
                waeVar = (wae) b.A(serialDescriptor, 3, uae.a, waeVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                hmj0Var = (hmj0) b.A(serialDescriptor, 4, fmj0.a, hmj0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new wmj0(i, z2, map, fnj0Var, waeVar, hmj0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.fnj0.c) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006e, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.wae.b) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008c, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.hmj0.h) == false) goto L31;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        wmj0 wmj0Var = (wmj0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wmj0.g;
        if (b.F() || wmj0Var.b) {
            b.n(serialDescriptor, 0, wmj0Var.b);
        }
        if (b.F() || !jl40.l(wmj0Var.c, b.f())) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), wmj0Var.c);
        }
        if (!b.F()) {
            fnj0 fnj0Var = wmj0Var.d;
            fnj0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, dnj0.a, wmj0Var.d);
        if (!b.F()) {
            wae waeVar = wmj0Var.e;
            wae.Companion.getClass();
        }
        b.e(serialDescriptor, 3, uae.a, wmj0Var.e);
        if (!b.F()) {
            hmj0 hmj0Var = wmj0Var.f;
            hmj0.Companion.getClass();
        }
        b.e(serialDescriptor, 4, fmj0.a, wmj0Var.f);
        b.c(serialDescriptor);
    }
}
