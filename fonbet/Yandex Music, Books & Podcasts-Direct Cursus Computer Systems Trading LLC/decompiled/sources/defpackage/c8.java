package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public abstract class c8 implements vzh {
    protected int memoizedHashCode;

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        Charset charset = use.a;
        iterable.getClass();
        if (iterable instanceof zvf) {
            List e = ((zvf) iterable).e();
            zvf zvfVar = (zvf) list;
            int size = list.size();
            for (Object obj : e) {
                if (obj == null) {
                    String str = "Element at index " + (zvfVar.size() - size) + " is null.";
                    for (int size2 = zvfVar.size() - 1; size2 >= size; size2--) {
                        zvfVar.remove(size2);
                    }
                    jj4.j(str);
                    return;
                }
                if (obj instanceof nn3) {
                    zvfVar.i();
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    nn3.n(bArr, 0, bArr.length);
                    zvfVar.i();
                } else {
                    zvfVar.add((String) obj);
                }
            }
            return;
        }
        if (iterable instanceof dsm) {
            list.addAll((Collection) iterable);
            return;
        }
        if (iterable instanceof Collection) {
            int size3 = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size3);
            } else if (list instanceof bzm) {
                bzm bzmVar = (bzm) list;
                int i = bzmVar.c + size3;
                Object[] objArr = bzmVar.b;
                if (i > objArr.length) {
                    if (objArr.length == 0) {
                        bzmVar.b = new Object[Math.max(i, 10)];
                    } else {
                        int length = objArr.length;
                        while (length < i) {
                            length = v3w.c(length, 3, 2, 1, 10);
                        }
                        bzmVar.b = Arrays.copyOf(bzmVar.b, length);
                    }
                }
            }
        }
        int size4 = list.size();
        if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
            for (Object obj2 : iterable) {
                if (obj2 == null) {
                    g3d.g(list, size4);
                    throw null;
                }
                list.add(obj2);
            }
            return;
        }
        List list2 = (List) iterable;
        int size5 = list2.size();
        for (int i2 = 0; i2 < size5; i2++) {
            a05 a05Var = (Object) list2.get(i2);
            if (a05Var == null) {
                g3d.g(list, size4);
                throw null;
            }
            list.add(a05Var);
        }
    }

    public static void checkByteStringIsUtf8(nn3 nn3Var) throws IllegalArgumentException {
        if (nn3Var.s()) {
            return;
        }
        xq0.x("Byte string is not UTF-8.");
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(wto wtoVar);

    public qit newUninitializedMessageException() {
        return new qit();
    }

    @Override // defpackage.vzh
    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = yr4.b;
            sr4 sr4Var = new sr4(bArr, 0, serializedSize);
            writeTo(sr4Var);
            if (sr4Var.D() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            kac.k(a("byte array"), e);
            return null;
        }
    }

    public nn3 toByteString() {
        try {
            int serializedSize = getSerializedSize();
            kn3 kn3Var = nn3.b;
            byte[] bArr = new byte[serializedSize];
            Logger logger = yr4.b;
            sr4 sr4Var = new sr4(bArr, 0, serializedSize);
            writeTo(sr4Var);
            if (sr4Var.D() == 0) {
                return new kn3(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            kac.k(a("ByteString"), e);
            return null;
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int f = yr4.f(serializedSize) + serializedSize;
        if (f > 4096) {
            f = 4096;
        }
        wr4 wr4Var = new wr4(outputStream, f);
        wr4Var.A(serializedSize);
        writeTo(wr4Var);
        if (wr4Var.f > 0) {
            wr4Var.I();
        }
    }

    @Override // defpackage.vzh
    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = yr4.b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        wr4 wr4Var = new wr4(outputStream, serializedSize);
        writeTo(wr4Var);
        if (wr4Var.f > 0) {
            wr4Var.I();
        }
    }
}
