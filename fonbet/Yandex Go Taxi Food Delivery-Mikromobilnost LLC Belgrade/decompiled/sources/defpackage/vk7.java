package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ChatRequest;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class vk7 extends s120 {
    public final g720 a;
    public final ChatRequest b;
    public final String c;

    public vk7(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        Object u = vng.u(bundle, ChatRequest.class, "Messaging.Arguments.ChatRequest");
        if (u == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        this.a = b;
        this.b = (ChatRequest) u;
        this.c = "Messaging.Arguments.Key.CallUserIntent";
    }

    @Override // defpackage.s120
    public final String a() {
        return this.c;
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk7)) {
            return false;
        }
        vk7 vk7Var = (vk7) obj;
        return jl40.l(this.a, vk7Var.a) && jl40.l(this.b, vk7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CallUserIntentArguments(source=" + this.a + ", chatRequest=" + this.b + Extension.C_BRAKE;
    }
}
