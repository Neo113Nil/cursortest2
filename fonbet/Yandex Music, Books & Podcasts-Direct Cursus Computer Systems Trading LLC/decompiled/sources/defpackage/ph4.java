package defpackage;

import android.os.Bundle;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ph4 extends ChatRequest {
    public final String a;

    public ph4(String str) {
        this.a = str;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("inviteHash", this.a);
        return jSONObject;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final void b(Bundle bundle) {
        bundle.putString(ph4.class.getSimpleName(), this.a);
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final Map c() {
        return dfi.n("inviteHash", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph4) && this.a.equals(((ph4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Invite(inviteHash=", this.a, ")");
    }
}
