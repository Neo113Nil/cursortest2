package defpackage;

import com.yandex.go.lootbox.api.domain.entities.lootbox.action.LootBoxActionTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class woz implements toz {
    public final String a;
    public final boolean b;

    public woz(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woz)) {
            return false;
        }
        woz wozVar = (woz) obj;
        return jl40.l(this.a, wozVar.a) && this.b == wozVar.b;
    }

    @Override // defpackage.toz
    public final LootBoxActionTypeEntity getType() {
        return LootBoxActionTypeEntity.WEB_VIEW;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("LootBoxActionWebViewEntity(url=", this.a, ", needAuth=", this.b, Extension.C_BRAKE);
    }
}
