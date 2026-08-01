package P6;

import N6.o;
import N6.p;
import c7.InterfaceC0545a;
import d7.InterfaceC4454a;
import g6.InterfaceC4532b;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import u.AbstractC5049e;

/* loaded from: classes2.dex */
public abstract class i implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f2585a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final m[] f2586b = new m[0];

    public static N6.l c(f6.g gVar) {
        String str;
        switch (AbstractC5049e.d(gVar.getType())) {
            case 0:
                return new e(N6.k.f((String) gVar.getValue()), 1);
            case 1:
                return new d(((Boolean) gVar.getValue()).booleanValue());
            case 2:
                return new l(((Long) gVar.getValue()).longValue());
            case 3:
                return new f(((Double) gVar.getValue()).doubleValue());
            case 4:
                return c.d((List) gVar.getValue(), new K6.b(10));
            case 5:
                List list = (List) gVar.getValue();
                int size = list.size();
                m[] mVarArr = new m[list.size()];
                for (int i = 0; i < size; i++) {
                    f6.d dVar = (f6.d) list.get(i);
                    mVarArr[i] = new m(dVar.f37523a.getBytes(StandardCharsets.UTF_8), c(dVar.f37524b));
                }
                return new c(new b(mVarArr), (byte) 0);
            case 6:
                ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                return new e(bArr, 0);
            default:
                switch (gVar.getType()) {
                    case 1:
                        str = "STRING";
                        break;
                    case 2:
                        str = "BOOLEAN";
                        break;
                    case 3:
                        str = "LONG";
                        break;
                    case 4:
                        str = "DOUBLE";
                        break;
                    case 5:
                        str = "ARRAY";
                        break;
                    case 6:
                        str = "KEY_VALUE_LIST";
                        break;
                    case 7:
                        str = "BYTES";
                        break;
                    default:
                        str = "null";
                        break;
                }
                throw new IllegalArgumentException("Unsupported Value type: ".concat(str));
        }
    }

    public static InterfaceC4532b d(InterfaceC0545a interfaceC0545a) {
        if (interfaceC0545a instanceof InterfaceC4454a) {
            return ((InterfaceC4454a) interfaceC0545a).g();
        }
        throw new IllegalArgumentException("logRecordData must be ExtendedLogRecordData");
    }

    public static void e(o oVar, N6.b bVar, InterfaceC4532b interfaceC4532b, N6.j jVar) {
        oVar.V(bVar);
        if (!interfaceC4532b.isEmpty()) {
            try {
                interfaceC4532b.forEach(new g(oVar, bVar, jVar));
            } catch (UncheckedIOException e9) {
                throw e9.getCause();
            }
        }
        oVar.B();
    }

    public static int f(N6.b bVar, InterfaceC4532b interfaceC4532b, N6.j jVar) {
        if (interfaceC4532b.isEmpty()) {
            return 0;
        }
        int[] iArr = {0};
        interfaceC4532b.forEach(new g(jVar, iArr, bVar));
        return iArr[0];
    }
}
