package defpackage;

import android.os.Bundle;
import com.google.android.gms.cast.CastDevice;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class s54 implements eo0 {
    public final CastDevice a;
    public final kox b;
    public final Bundle c;
    public final String d = UUID.randomUUID().toString();

    public /* synthetic */ s54(osh oshVar) {
        this.a = (CastDevice) oshVar.a;
        this.b = (kox) oshVar.b;
        this.c = (Bundle) oshVar.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r3 == r1) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s54)) {
            return false;
        }
        s54 s54Var = (s54) obj;
        if (ldg.s(this.a, s54Var.a)) {
            Bundle bundle = s54Var.c;
            Bundle bundle2 = this.c;
            if (bundle2 != null && bundle != null) {
                if (bundle2.size() == bundle.size()) {
                    Set<String> keySet = bundle2.keySet();
                    if (keySet.containsAll(bundle.keySet())) {
                        for (String str : keySet) {
                            if (!ldg.s(bundle2.get(str), bundle.get(str))) {
                                break;
                            }
                        }
                        if (ldg.s(this.d, s54Var.d)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, 0, this.d});
    }
}
