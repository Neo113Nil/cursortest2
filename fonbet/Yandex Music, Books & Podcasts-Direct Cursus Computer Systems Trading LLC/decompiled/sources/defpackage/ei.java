package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ei extends zh {
    public final /* synthetic */ int a;
    public final /* synthetic */ fi b;
    public final /* synthetic */ String c;
    public final /* synthetic */ uh d;

    public /* synthetic */ ei(fi fiVar, String str, uh uhVar, int i) {
        this.a = i;
        this.b = fiVar;
        this.c = str;
        this.d = uhVar;
    }

    @Override // defpackage.zh
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                fi fiVar = this.b;
                ArrayList arrayList = fiVar.d;
                LinkedHashMap linkedHashMap = fiVar.b;
                String str = this.c;
                Object obj2 = linkedHashMap.get(str);
                uh uhVar = this.d;
                if (obj2 == null) {
                    tuh.c("Attempting to launch an unregistered ActivityResultLauncher with contract ", uhVar, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    fiVar.b(intValue, uhVar, obj);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                fi fiVar2 = this.b;
                ArrayList arrayList2 = fiVar2.d;
                LinkedHashMap linkedHashMap2 = fiVar2.b;
                String str2 = this.c;
                Object obj3 = linkedHashMap2.get(str2);
                uh uhVar2 = this.d;
                if (obj3 == null) {
                    tuh.c("Attempting to launch an unregistered ActivityResultLauncher with contract ", uhVar2, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int intValue2 = ((Number) obj3).intValue();
                arrayList2.add(str2);
                try {
                    fiVar2.b(intValue2, uhVar2, obj);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str2);
                    throw e2;
                }
        }
    }

    @Override // defpackage.zh
    public final void b() {
        switch (this.a) {
            case 0:
                this.b.f(this.c);
                break;
            default:
                this.b.f(this.c);
                break;
        }
    }
}
