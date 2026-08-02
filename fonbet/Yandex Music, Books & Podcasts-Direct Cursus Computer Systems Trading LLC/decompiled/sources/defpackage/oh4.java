package defpackage;

import android.os.Bundle;
import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class oh4 extends ChatRequest {
    public final String a;

    public oh4(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("chatId", this.a);
        return jSONObject;
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final void b(Bundle bundle) {
        bundle.putString(oh4.class.getSimpleName(), this.a);
    }

    @Override // com.yandex.messenger.websdk.api.ChatRequest
    public final Map c() {
        return dfi.n("chatId", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh4) && Intrinsics.d(this.a, ((oh4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hrg.q("Chat(chatId=", this.a, ")");
    }
}
