package P6;

import g6.InterfaceC4532b;
import h6.C4574a;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.function.BiConsumer;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public final class h implements BiConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2582a;

    /* renamed from: b, reason: collision with root package name */
    public int f2583b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m[] f2584c;

    public /* synthetic */ h(m[] mVarArr, int i) {
        this.f2582a = i;
        this.f2584c = mVarArr;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        m mVar;
        m[] mVarArr;
        byte[] bArr;
        m mVar2;
        switch (this.f2582a) {
            case 0:
                C4574a c4574a = (C4574a) obj;
                int i = this.f2583b;
                this.f2583b = i + 1;
                byte[] d2 = c4574a.f38020b.isEmpty() ? i.f2585a : c4574a.d();
                switch (AbstractC5049e.d(c4574a.f38019a)) {
                    case 0:
                        mVar = new m(d2, new e(N6.k.f((String) obj2), 1));
                        break;
                    case 1:
                        mVar = new m(d2, new d(((Boolean) obj2).booleanValue()));
                        break;
                    case 2:
                        mVar = new m(d2, new l(((Long) obj2).longValue()));
                        break;
                    case 3:
                        mVar = new m(d2, new f(((Double) obj2).doubleValue()));
                        break;
                    case 4:
                        mVar = new m(d2, c.d((List) obj2, new K6.b(6)));
                        break;
                    case 5:
                        mVar = new m(d2, c.d((List) obj2, new K6.b(7)));
                        break;
                    case 6:
                        mVar = new m(d2, c.d((List) obj2, new K6.b(8)));
                        break;
                    case 7:
                        mVar = new m(d2, c.d((List) obj2, new K6.b(9)));
                        break;
                    case 8:
                        InterfaceC4532b interfaceC4532b = (InterfaceC4532b) obj2;
                        if (interfaceC4532b.isEmpty()) {
                            mVarArr = i.f2586b;
                        } else {
                            m[] mVarArr2 = new m[interfaceC4532b.size()];
                            interfaceC4532b.forEach(new h(mVarArr2, 0));
                            mVarArr = mVarArr2;
                        }
                        mVar = new m(d2, new c(new b(mVarArr), (byte) 0));
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported attribute type.");
                }
                this.f2584c[i] = mVar;
                return;
            default:
                k6.e eVar = (k6.e) obj;
                int i6 = this.f2583b;
                this.f2583b = i6 + 1;
                if (eVar.f38686b.isEmpty()) {
                    bArr = m.f2595d;
                } else {
                    bArr = eVar.f38688d;
                    if (bArr == null) {
                        bArr = eVar.f38686b.getBytes(StandardCharsets.UTF_8);
                        eVar.f38688d = bArr;
                    }
                }
                switch (eVar.f38685a.ordinal()) {
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
                this.f2584c[i6] = mVar2;
                return;
        }
    }
}
