package L6;

import J6.o;
import J6.p;
import c6.InterfaceC0543b;
import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import u.AbstractC5088e;

/* loaded from: classes2.dex */
public abstract class i implements p {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f1773a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final m[] f1774b = new m[0];

    public static J6.l b(b6.g gVar) {
        String str;
        switch (AbstractC5088e.d(gVar.getType())) {
            case 0:
                return new e(J6.k.f((String) gVar.getValue()), 1);
            case 1:
                return new d(((Boolean) gVar.getValue()).booleanValue());
            case 2:
                return new l(((Long) gVar.getValue()).longValue());
            case 3:
                return new f(((Double) gVar.getValue()).doubleValue());
            case 4:
                return c.d((List) gVar.getValue(), new G6.b(10));
            case 5:
                List list = (List) gVar.getValue();
                int size = list.size();
                m[] mVarArr = new m[list.size()];
                for (int i = 0; i < size; i++) {
                    b6.d dVar = (b6.d) list.get(i);
                    mVarArr[i] = new m(dVar.f5567a.getBytes(StandardCharsets.UTF_8), b(dVar.f5568b));
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

    public static InterfaceC0543b c(Y6.a aVar) {
        if (aVar instanceof Z6.a) {
            return ((Z6.a) aVar).g();
        }
        throw new IllegalArgumentException("logRecordData must be ExtendedLogRecordData");
    }

    public static void e(o oVar, J6.b bVar, InterfaceC0543b interfaceC0543b, J6.j jVar) {
        oVar.V(bVar);
        if (!interfaceC0543b.isEmpty()) {
            try {
                interfaceC0543b.forEach(new g(oVar, bVar, jVar));
            } catch (UncheckedIOException e6) {
                throw e6.getCause();
            }
        }
        oVar.B();
    }

    public static int f(J6.b bVar, InterfaceC0543b interfaceC0543b, J6.j jVar) {
        if (interfaceC0543b.isEmpty()) {
            return 0;
        }
        int[] iArr = {0};
        interfaceC0543b.forEach(new g(jVar, iArr, bVar));
        return iArr[0];
    }
}
