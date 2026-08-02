package defpackage;

import java.security.MessageDigest;
import java.util.Arrays;
import java.util.function.Supplier;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class ctd {
    public static final ctd b = new ctd();
    public final btd a;

    public ctd() {
        final int i = 0;
        new btd(new Supplier() { // from class: atd
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i) {
                    case 0:
                        return MessageDigest.getInstance("MD5");
                    case 1:
                        return MessageDigest.getInstance("SHA-1");
                    case 2:
                        return MessageDigest.getInstance("SHA-256");
                    default:
                        return MessageDigest.getInstance("SHA-512");
                }
            }
        }, 0);
        final int i2 = 1;
        new btd(new Supplier() { // from class: atd
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i2) {
                    case 0:
                        return MessageDigest.getInstance("MD5");
                    case 1:
                        return MessageDigest.getInstance("SHA-1");
                    case 2:
                        return MessageDigest.getInstance("SHA-256");
                    default:
                        return MessageDigest.getInstance("SHA-512");
                }
            }
        }, 1);
        final int i3 = 2;
        this.a = new btd(new Supplier() { // from class: atd
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i3) {
                    case 0:
                        return MessageDigest.getInstance("MD5");
                    case 1:
                        return MessageDigest.getInstance("SHA-1");
                    case 2:
                        return MessageDigest.getInstance("SHA-256");
                    default:
                        return MessageDigest.getInstance("SHA-512");
                }
            }
        }, 2);
        final int i4 = 3;
        new btd(new Supplier() { // from class: atd
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i4) {
                    case 0:
                        return MessageDigest.getInstance("MD5");
                    case 1:
                        return MessageDigest.getInstance("SHA-1");
                    case 2:
                        return MessageDigest.getInstance("SHA-256");
                    default:
                        return MessageDigest.getInstance("SHA-512");
                }
            }
        }, 3);
    }

    public final String a(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        StringBuilder sb = new StringBuilder(copyOf.length * 5);
        int length = copyOf.length;
        for (int i = 0; i < length; i++) {
            Object obj = copyOf[i];
            String obj2 = obj != null ? obj.toString() : null;
            if (obj2 != null) {
                sb.append(obj2);
            } else {
                sb.append('_');
            }
            sb.append('-');
        }
        String sb2 = sb.toString();
        Object obj3 = this.a.get();
        obj3.getClass();
        byte[] bytes = sb2.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] digest = ((MessageDigest) obj3).digest(bytes);
        digest.getClass();
        int[] iArr = jxd.a;
        return jxd.g(digest, mxd.d);
    }
}
