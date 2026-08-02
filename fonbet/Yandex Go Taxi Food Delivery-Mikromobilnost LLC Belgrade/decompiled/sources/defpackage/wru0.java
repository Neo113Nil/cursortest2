package defpackage;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public abstract class wru0 {
    public static final Set a = j73.f0(new SerialDescriptor[]{xq11.b, cr11.b, qq11.b, tr11.b});

    public static final boolean a(SerialDescriptor serialDescriptor) {
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
