package P6;

import g6.InterfaceC4536b;
import h6.C4579a;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;
import u.AbstractC5050e;

/* loaded from: classes2.dex */
public final class h implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2417a;

    /* renamed from: b, reason: collision with root package name */
    public int f2418b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m[] f2419c;

    public /* synthetic */ h(m[] mVarArr, int i) {
        this.f2417a = i;
        this.f2419c = mVarArr;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        m mVar;
        m[] mVarArr;
        byte[] bArr;
        m mVar2;
        switch (this.f2417a) {
            case 0:
                C4579a c4579a = (C4579a) obj;
                int i = this.f2418b;
                this.f2418b = i + 1;
                byte[] d9 = c4579a.f38137b.isEmpty() ? i.f2420a : c4579a.d();
                switch (AbstractC5050e.d(c4579a.f38136a)) {
                    case 0:
                        mVar = new m(d9, new e(N6.k.f((String) obj2), 1));
                        break;
                    case 1:
                        mVar = new m(d9, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        mVar = new m(d9, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar = new m(d9, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar = new m(d9, c.d((List) obj2, new K6.b(6)));
                        break;
                    case 5:
                        mVar = new m(d9, c.d((List) obj2, new K6.b(7)));
                        break;
                    case 6:
                        mVar = new m(d9, c.d((List) obj2, new K6.b(8)));
                        break;
                    case 7:
                        mVar = new m(d9, c.d((List) obj2, new K6.b(9)));
                        break;
                    case 8:
                        InterfaceC4536b interfaceC4536b = (InterfaceC4536b) obj2;
                        if (interfaceC4536b.isEmpty()) {
                            mVarArr = i.f2421b;
                        } else {
                            m[] mVarArr2 = new m[interfaceC4536b.size()];
                            interfaceC4536b.forEach(new h(mVarArr2, 0));
                            mVarArr = mVarArr2;
                        }
                        mVar = new m(d9, new c(new b(mVarArr), (byte) 0));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f2419c[i] = mVar;
                return;
            default:
                k6.e eVar = (k6.e) obj;
                int i4 = this.f2418b;
                this.f2418b = i4 + 1;
                if (eVar.f38613b.isEmpty()) {
                    bArr = m.f2430d;
                } else {
                    bArr = eVar.f38615d;
                    if (bArr == null) {
                        bArr = eVar.f38613b.getBytes(StandardCharsets.UTF_8);
                        eVar.f38615d = bArr;
                    }
                }
                switch (eVar.f38612a.ordinal()) {
                    case 0:
                        mVar2 = new m(bArr, new e(N6.k.f((String) obj2), 1));
                        break;
                    case 1:
                        mVar2 = new m(bArr, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        mVar2 = new m(bArr, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar2 = new m(bArr, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar2 = new m(bArr, c.d((List) obj2, new K6.b(6)));
                        break;
                    case 5:
                        mVar2 = new m(bArr, c.d((List) obj2, new K6.b(7)));
                        break;
                    case 6:
                        mVar2 = new m(bArr, c.d((List) obj2, new K6.b(8)));
                        break;
                    case 7:
                        mVar2 = new m(bArr, c.d((List) obj2, new K6.b(9)));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f2419c[i4] = mVar2;
                return;
        }
    }
}
