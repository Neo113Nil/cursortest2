package a;

import android.content.SharedPreferences;
import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f14c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f12a = new int[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f13b = new Object[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f15d = new Object[0];

    public static String a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = Uri.parse(url);
            String path = uri.getPath();
            CharSequence charSequenceSubSequence = "";
            if (path == null) {
                path = "";
            }
            char[] chars = {'/'};
            Intrinsics.checkNotNullParameter(path, "<this>");
            Intrinsics.checkNotNullParameter(chars, "chars");
            int length = path.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i2 = length - 1;
                    char cCharAt = path.charAt(length);
                    Intrinsics.checkNotNullParameter(chars, "<this>");
                    Intrinsics.checkNotNullParameter(chars, "<this>");
                    int i3 = 0;
                    while (true) {
                        if (i3 >= 1) {
                            i3 = -1;
                            break;
                        }
                        if (cCharAt == chars[i3]) {
                            break;
                        }
                        i3++;
                    }
                    if (!(i3 >= 0)) {
                        charSequenceSubSequence = path.subSequence(0, length + 1);
                        break;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length = i2;
                }
            }
            return uri.getScheme() + "://" + uri.getHost() + charSequenceSubSequence.toString();
        } catch (Exception unused) {
            return url;
        }
    }

    public static final void b(Closeable closeable, Throwable th) throws IOException {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable exception) {
                Intrinsics.checkNotNullParameter(th, "<this>");
                Intrinsics.checkNotNullParameter(exception, "exception");
                if (th != exception) {
                    h.c.f129a.a(th, exception);
                }
            }
        }
    }

    public static final f.e c(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        return new f.e(exception);
    }

    public static final Class d(o.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Class cls = ((m.c) ((m.a) aVar)).f209a;
        if (!cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? cls : Double.class;
            case 104431:
                return !name.equals("int") ? cls : Integer.class;
            case 3039496:
                return !name.equals("byte") ? cls : Byte.class;
            case 3052374:
                return !name.equals("char") ? cls : Character.class;
            case 3327612:
                return !name.equals("long") ? cls : Long.class;
            case 3625364:
                return !name.equals("void") ? cls : Void.class;
            case 64711720:
                return !name.equals("boolean") ? cls : Boolean.class;
            case 97526364:
                return !name.equals("float") ? cls : Float.class;
            case 109413500:
                return !name.equals("short") ? cls : Short.class;
            default:
                return cls;
        }
    }

    public static final Object[] e(Collection collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        Object[] objArr = f15d;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }

    public static final Object[] f(Collection collection, Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Intrinsics.c(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i3 = i2 + 1;
            objArrCopyOf[i2] = it.next();
            if (i3 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(result, newSize)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i3] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i3);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(result, size)");
                return objArrCopyOf2;
            }
            i2 = i3;
        }
    }
}
