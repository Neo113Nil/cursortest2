package defpackage;

import com.yandex.go.lootbox.api.domain.entities.lootbox.action.LootBoxActionTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qoz implements toz {
    public final String a;

    public qoz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qoz) && jl40.l(this.a, ((qoz) obj).a);
    }

    @Override // defpackage.toz
    public final LootBoxActionTypeEntity getType() {
        return LootBoxActionTypeEntity.DEEPLINK;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("LootBoxActionDeeplinkEntity(deepLink=", this.a, Extension.C_BRAKE);
    }
}
