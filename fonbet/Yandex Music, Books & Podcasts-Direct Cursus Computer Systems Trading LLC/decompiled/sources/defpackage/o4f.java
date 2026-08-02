package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class o4f implements rhj {
    public final /* synthetic */ int a;

    public /* synthetic */ o4f(int i) {
        this.a = i;
    }

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                throw new r6b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                shj shjVar = (shj) obj2;
                shjVar.a(dzm.g, entry.getKey());
                shjVar.a(dzm.h, entry.getValue());
                return;
            default:
                throw new r6b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
