package defpackage;

import com.yandex.go.navigation.screen.c;
import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes13.dex */
public final class q760 {
    public final c a;
    public final u8w b;
    public final co40 c;
    public int d;

    public q760(c cVar, u8w u8wVar, co40 co40Var) {
        this.a = cVar;
        this.b = u8wVar;
        this.c = co40Var;
    }

    public final void a() {
        int i = this.d + 1;
        this.d = i;
        String b = this.a.b().b();
        u8w u8wVar = this.b;
        u8wVar.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("attempt", Integer.valueOf(i));
        hashMap.put(MetaDataField.SCREEN_FIELD, b);
        u8wVar.a.a("nfcScanSuccess", hashMap, 1, new HashMap());
        this.d = 0;
    }
}
