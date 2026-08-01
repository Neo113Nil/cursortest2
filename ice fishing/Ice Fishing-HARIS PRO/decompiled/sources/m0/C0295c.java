package m0;

import androidx.window.layout.z;
import java.util.Iterator;

/* renamed from: m0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0295c implements O1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ O1.f f4066a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0297e f4067b;

    public C0295c(O1.f fVar, C0297e c0297e) {
        this.f4066a = fVar;
        this.f4067b = c0297e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    @Override // O1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, v1.d dVar) {
        C0294b c0294b;
        int i;
        androidx.window.layout.f fVar;
        if (dVar instanceof C0294b) {
            c0294b = (C0294b) dVar;
            int i2 = c0294b.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0294b.e = i2 - Integer.MIN_VALUE;
                Object obj2 = c0294b.f4064d;
                w1.a aVar = w1.a.f4662a;
                i = c0294b.e;
                if (i != 0) {
                    h0.f.D(obj2);
                    this.f4067b.getClass();
                    Iterator it = ((z) obj).f2262a.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            fVar = 0;
                            break;
                        }
                        fVar = it.next();
                        if (((androidx.window.layout.f) fVar) != null) {
                            break;
                        }
                    }
                    androidx.window.layout.f fVar2 = fVar instanceof androidx.window.layout.f ? fVar : null;
                    if (fVar2 != null) {
                        c0294b.e = 1;
                        if (this.f4066a.a(fVar2, c0294b) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h0.f.D(obj2);
                }
                return t1.i.f4388c;
            }
        }
        c0294b = new C0294b(this, dVar);
        Object obj22 = c0294b.f4064d;
        w1.a aVar2 = w1.a.f4662a;
        i = c0294b.e;
        if (i != 0) {
        }
        return t1.i.f4388c;
    }
}
