package defpackage;

import com.yandex.messenger.websdk.api.ChatRequest;
import java.util.Map;

/* loaded from: classes12.dex */
public final class w2i extends y2i {
    public final ChatRequest a;

    public w2i(f8b f8bVar) {
        this.a = f8bVar;
    }

    @Override // defpackage.y2i
    public final Map a() {
        return null;
    }

    @Override // defpackage.y2i
    public final ChatRequest b() {
        return this.a;
    }

    @Override // defpackage.y2i
    public final String c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w2i) && jl40.l(this.a, ((w2i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 961;
    }

    public final String toString() {
        return "NeedToLoad(chatRequest=" + this.a + ", supportMetaInfo=null, analyticsAttrs=null)";
    }
}
