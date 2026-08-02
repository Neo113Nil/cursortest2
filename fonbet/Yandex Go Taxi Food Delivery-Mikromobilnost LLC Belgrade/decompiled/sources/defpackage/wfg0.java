package defpackage;

import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class wfg0 {
    public final ArrayList a;
    public final PageHeaderEntity b;
    public final fwn c;

    public wfg0(ArrayList arrayList, PageHeaderEntity pageHeaderEntity, fwn fwnVar) {
        this.a = arrayList;
        this.b = pageHeaderEntity;
        this.c = fwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfg0)) {
            return false;
        }
        wfg0 wfg0Var = (wfg0) obj;
        return this.a.equals(wfg0Var.a) && this.b.equals(wfg0Var.b) && this.c.equals(wfg0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "QrSubscriptionsListEntityV3(agreements=" + this.a + ", header=" + this.b + ", emptyList=" + this.c + Extension.C_BRAKE;
    }
}
