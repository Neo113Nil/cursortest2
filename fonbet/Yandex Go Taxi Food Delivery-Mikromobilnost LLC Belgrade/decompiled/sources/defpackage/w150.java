package defpackage;

import java.util.ArrayList;
import kotlin.collections.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public abstract class w150 extends n7x0 {
    @Override // defpackage.n7x0
    public final String T(SerialDescriptor serialDescriptor, int i) {
        String W = W(serialDescriptor, i);
        String str = (String) a.b0(this.a);
        if (str == null) {
            str = "";
        }
        return V(str, W);
    }

    public String V(String str, String str2) {
        return str.length() == 0 ? str2 : oyr.f('.', str, str2);
    }

    public String W(SerialDescriptor serialDescriptor, int i) {
        return serialDescriptor.f(i);
    }

    public final String X() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : a.X(arrayList, Extension.DOT_CHAR, "$.", null, null, 60);
    }
}
