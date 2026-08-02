package defpackage;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.SuggestEntity$BehaviourEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class y4v0 {
    public final MoneyEntity a;
    public final String b;
    public final SuggestEntity$BehaviourEntity c;

    public y4v0(MoneyEntity moneyEntity, String str, SuggestEntity$BehaviourEntity suggestEntity$BehaviourEntity) {
        this.a = moneyEntity;
        this.b = str;
        this.c = suggestEntity$BehaviourEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4v0)) {
            return false;
        }
        y4v0 y4v0Var = (y4v0) obj;
        return this.a.equals(y4v0Var.a) && jl40.l(this.b, y4v0Var.b) && this.c == y4v0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "SuggestEntity(money=" + this.a + ", text=" + this.b + ", behaviour=" + this.c + Extension.C_BRAKE;
    }
}
