package Z3;

import a4.f;
import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements X3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4139a;

    @Override // X3.a
    public final void a(Object obj, Object obj2) {
        switch (this.f4139a) {
            case 0:
                throw new X3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                X3.e eVar = (X3.e) obj2;
                eVar.a(f.f4306g, entry.getKey());
                eVar.a(f.f4307h, entry.getValue());
                return;
            default:
                throw new X3.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
