package ru.CryptoPro.ssl.util;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes4.dex */
public class ThreadLocalCoders {
    public static final AnonymousClass1 a = new AnonymousClass1();
    public static final AnonymousClass2 b = new AnonymousClass2();

    /* renamed from: ru.CryptoPro.ssl.util.ThreadLocalCoders$1, reason: invalid class name */
    class AnonymousClass1 extends Cache {
        @Override // ru.CryptoPro.ssl.util.ThreadLocalCoders.Cache
        public final Object a(Object obj) {
            if (obj instanceof String) {
                return Charset.forName((String) obj).newDecoder();
            }
            if (obj instanceof Charset) {
                return ((Charset) obj).newDecoder();
            }
            return null;
        }

        @Override // ru.CryptoPro.ssl.util.ThreadLocalCoders.Cache
        public final boolean b(Object obj, Object obj2) {
            if (obj2 instanceof String) {
                return ((CharsetDecoder) obj).charset().name().equals(obj2);
            }
            if (obj2 instanceof Charset) {
                return ((CharsetDecoder) obj).charset().equals(obj2);
            }
            return false;
        }
    }

    /* renamed from: ru.CryptoPro.ssl.util.ThreadLocalCoders$2, reason: invalid class name */
    class AnonymousClass2 extends Cache {
        @Override // ru.CryptoPro.ssl.util.ThreadLocalCoders.Cache
        public final Object a(Object obj) {
            if (obj instanceof String) {
                return Charset.forName((String) obj).newEncoder();
            }
            if (obj instanceof Charset) {
                return ((Charset) obj).newEncoder();
            }
            return null;
        }

        @Override // ru.CryptoPro.ssl.util.ThreadLocalCoders.Cache
        public final boolean b(Object obj, Object obj2) {
            if (obj2 instanceof String) {
                return ((CharsetEncoder) obj).charset().name().equals(obj2);
            }
            if (obj2 instanceof Charset) {
                return ((CharsetEncoder) obj).charset().equals(obj2);
            }
            return false;
        }
    }

    public static abstract class Cache {
        public final ThreadLocal a = new ThreadLocal();
        public final int b = 3;

        public abstract Object a(Object obj);

        public abstract boolean b(Object obj, Object obj2);

        public final Object c(Object obj) {
            ThreadLocal threadLocal = this.a;
            Object[] objArr = (Object[]) threadLocal.get();
            if (objArr == null) {
                objArr = new Object[this.b];
                threadLocal.set(objArr);
            } else {
                int i = 0;
                while (i < objArr.length) {
                    Object obj2 = objArr[i];
                    if (obj2 != null && b(obj2, obj)) {
                        if (i > 0) {
                            Object obj3 = objArr[i];
                            while (i > 0) {
                                objArr[i] = objArr[i - 1];
                                i--;
                            }
                            objArr[0] = obj3;
                        }
                        return obj2;
                    }
                    i++;
                }
            }
            Object a = a(obj);
            objArr[objArr.length - 1] = a;
            int length = objArr.length - 1;
            Object obj4 = objArr[length];
            while (length > 0) {
                objArr[length] = objArr[length - 1];
                length--;
            }
            objArr[0] = obj4;
            return a;
        }
    }

    public static CharsetDecoder decoderFor(Object obj) {
        CharsetDecoder charsetDecoder = (CharsetDecoder) a.c(obj);
        charsetDecoder.reset();
        return charsetDecoder;
    }

    public static CharsetEncoder encoderFor(Object obj) {
        CharsetEncoder charsetEncoder = (CharsetEncoder) b.c(obj);
        charsetEncoder.reset();
        return charsetEncoder;
    }
}
