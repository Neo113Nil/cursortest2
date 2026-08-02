package defpackage;

import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes4.dex */
public final /* synthetic */ class qiu implements uxs {
    public static final qiu a;
    private static final SerialDescriptor descriptor;

    static {
        qiu qiuVar = new qiu();
        a = qiuVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("flex.feature.sections.action.HideSnippetsAction", qiuVar, 3);
        pluginGeneratedSerialDescriptor.j("sectionId", false);
        pluginGeneratedSerialDescriptor.j("hideSnippetIds", true);
        pluginGeneratedSerialDescriptor.j("hideSnippetTags", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = siu.d;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = siu.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        Set set = null;
        Set set2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                set2 = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new siu(i, str, set, set2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        siu siuVar = (siu) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = siu.d;
        String str = siuVar.a;
        Set set = siuVar.c;
        Set set2 = siuVar.b;
        b.o(serialDescriptor, 0, str);
        boolean F = b.F();
        EmptySet emptySet = EmptySet.a;
        if (F || !jl40.l(set2, emptySet)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), set2);
        }
        if (b.F() || !jl40.l(set, emptySet)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), set);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
