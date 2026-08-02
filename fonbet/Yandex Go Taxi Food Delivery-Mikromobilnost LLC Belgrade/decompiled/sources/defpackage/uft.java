package defpackage;

import com.yandex.messaging.domain.GetUserSuggestUseCase$Source;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class uft {
    public final long a;
    public final GetUserSuggestUseCase$Source b;

    public uft(long j, GetUserSuggestUseCase$Source getUserSuggestUseCase$Source) {
        this.a = j;
        this.b = getUserSuggestUseCase$Source;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uft)) {
            return false;
        }
        uft uftVar = (uft) obj;
        return this.a == uftVar.a && this.b == uftVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CacheKey(orgId=" + this.a + ", source=" + this.b + Extension.C_BRAKE;
    }
}
