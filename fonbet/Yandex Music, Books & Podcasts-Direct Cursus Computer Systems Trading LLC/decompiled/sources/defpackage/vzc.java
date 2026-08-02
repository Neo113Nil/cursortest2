package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class vzc extends sij {
    public final /* synthetic */ int b;
    public final /* synthetic */ wzc c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vzc(wzc wzcVar, int i) {
        super(r2);
        this.b = i;
        switch (i) {
            case 1:
                Float valueOf = Float.valueOf(0.0f);
                this.c = wzcVar;
                super(valueOf);
                break;
            default:
                Boolean bool = Boolean.FALSE;
                this.c = wzcVar;
                break;
        }
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, Object obj, Object obj2) {
        int i = this.b;
        s9fVar.getClass();
        switch (i) {
            case 0:
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                wzc wzcVar = this.c;
                Iterator it = wzcVar.d.entrySet().iterator();
                while (it.hasNext()) {
                    wzcVar.a((szc) ((Map.Entry) it.next()).getValue());
                }
                break;
            default:
                ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                wzc wzcVar2 = this.c;
                Iterator it2 = wzcVar2.d.entrySet().iterator();
                while (it2.hasNext()) {
                    wzcVar2.a((szc) ((Map.Entry) it2.next()).getValue());
                }
                break;
        }
    }
}
