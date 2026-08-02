package defpackage;

import android.os.Bundle;
import com.yandex.messaging.ui.chatthreadscontainer.ChatThreadsContainerTabs;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class x9b extends s120 {
    public final g720 a;
    public final ChatThreadsContainerTabs b;

    public x9b(Bundle bundle) {
        String string = bundle.getString("Messaging.Arguments.Source");
        if (string == null) {
            vg10.d("missing required key ".concat("Messaging.Arguments.Source"));
            throw null;
        }
        int i = g720.c;
        g720 b = glb1.b(string);
        ChatThreadsContainerTabs chatThreadsContainerTabs = (ChatThreadsContainerTabs) vng.u(bundle, ChatThreadsContainerTabs.class, "target_tab");
        chatThreadsContainerTabs = chatThreadsContainerTabs == null ? ChatThreadsContainerTabs.CHATS : chatThreadsContainerTabs;
        this.a = b;
        this.b = chatThreadsContainerTabs;
    }

    @Override // defpackage.s120
    public final String a() {
        return "Messaging.Arguments.Key.ChatThreadsContainer";
    }

    @Override // defpackage.s120
    public final g720 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9b)) {
            return false;
        }
        x9b x9bVar = (x9b) obj;
        return jl40.l(this.a, x9bVar.a) && this.b == x9bVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChatThreadsContainerArguments(source=" + this.a + ", targetTab=" + this.b + Extension.C_BRAKE;
    }
}
