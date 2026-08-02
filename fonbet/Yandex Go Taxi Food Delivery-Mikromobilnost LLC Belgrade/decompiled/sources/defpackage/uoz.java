package defpackage;

import com.yandex.go.lootbox.api.domain.entities.lootbox.action.LootBoxActionTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class uoz implements toz {
    public final String a;
    public final String b;
    public final String c;
    public final fpz d;

    public uoz(String str, String str2, String str3, fpz fpzVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = fpzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uoz)) {
            return false;
        }
        uoz uozVar = (uoz) obj;
        return jl40.l(this.a, uozVar.a) && jl40.l(this.b, uozVar.b) && jl40.l(this.c, uozVar.c) && jl40.l(this.d, uozVar.d);
    }

    @Override // defpackage.toz
    public final LootBoxActionTypeEntity getType() {
        return LootBoxActionTypeEntity.MODAL_VIEW;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("LootBoxActionModalViewEntity(title=", this.a, ", description=", this.b, ", iconTag=");
        v.append(this.c);
        v.append(", button=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
