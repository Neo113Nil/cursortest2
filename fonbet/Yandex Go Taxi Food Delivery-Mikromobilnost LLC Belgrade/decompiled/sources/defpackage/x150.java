package defpackage;

import kotlin.collections.a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public abstract class x150 extends o7x0 {
    @Override // defpackage.o7x0
    public final String U(SerialDescriptor serialDescriptor, int i) {
        String X = X(serialDescriptor, i);
        String str = (String) a.b0(this.a);
        if (str == null) {
            str = "";
        }
        return W(str, X);
    }

    public String W(String str, String str2) {
        return str.length() == 0 ? str2 : oyr.f('.', str, str2);
    }

    public String X(SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.f(i);
    }
}
