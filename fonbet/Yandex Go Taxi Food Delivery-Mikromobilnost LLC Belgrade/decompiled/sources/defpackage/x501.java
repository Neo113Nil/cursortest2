package defpackage;

import com.yandex.messenger.websdk.api.WebMessenger;

/* loaded from: classes12.dex */
public final class x501 {
    public final WebMessenger a;

    public x501(WebMessenger webMessenger, int i) {
        this.a = (i & 1) != 0 ? null : webMessenger;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x501) && jl40.l(this.a, ((x501) obj).a);
    }

    public final int hashCode() {
        WebMessenger webMessenger = this.a;
        return Boolean.hashCode(false) + ((webMessenger == null ? 0 : webMessenger.hashCode()) * 961);
    }

    public final String toString() {
        return "MessengerDependency(webMessenger=" + this.a + ", openChatAction=null, forceShowChat=false)";
    }

    public x501() {
        this(null, 7);
    }
}
