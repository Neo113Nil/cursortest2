package X3;

import Y3.f;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements V3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3794a;

    @Override // V3.a
    public final void a(Object obj, Object obj2) {
        switch (this.f3794a) {
            case 0:
                throw new V3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                V3.e eVar = (V3.e) obj2;
                eVar.c(f.f3953g, entry.getKey());
                eVar.c(f.f3954h, entry.getValue());
                return;
            default:
                throw new V3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
