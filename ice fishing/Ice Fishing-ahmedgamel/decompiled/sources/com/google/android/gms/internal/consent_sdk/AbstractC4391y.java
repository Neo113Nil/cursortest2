package com.google.android.gms.internal.consent_sdk;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.consent_sdk.y, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4391y {

    /* renamed from: a, reason: collision with root package name */
    public static String f35794a;

    /* renamed from: b, reason: collision with root package name */
    public static final J1 f35795b = new J1(21);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized String a(Context context) {
        String str;
        int i;
        String str2;
        synchronized (AbstractC4391y.class) {
            try {
                if (f35794a == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    String string = contentResolver == null ? null : Settings.Secure.getString(contentResolver, "android_id");
                    if (string != null) {
                        if (d()) {
                        }
                        for (i = 0; i < 3; i++) {
                            try {
                                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                                messageDigest.update(string.getBytes());
                                str2 = String.format("%032X", new BigInteger(1, messageDigest.digest()));
                                break;
                            } catch (ArithmeticException unused) {
                            } catch (NoSuchAlgorithmException unused2) {
                            }
                        }
                        str2 = "";
                        f35794a = str2;
                    }
                    string = "emulator";
                    while (i < 3) {
                    }
                    str2 = "";
                    f35794a = str2;
                }
                str = f35794a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public static String b(C4327h2 c4327h2) {
        StringBuilder sb = new StringBuilder(c4327h2.d());
        for (int i = 0; i < c4327h2.d(); i++) {
            byte a9 = c4327h2.a(i);
            if (a9 == 34) {
                sb.append("\\\"");
            } else if (a9 == 39) {
                sb.append("\\'");
            } else if (a9 != 92) {
                switch (a9) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a9 < 32 || a9 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a9 >>> 6) & 3) + 48));
                            sb.append((char) (((a9 >>> 3) & 7) + 48));
                            sb.append((char) ((a9 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a9);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static String c(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i6 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i6)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i6, indexOf);
            sb.append(e(objArr[i]));
            i6 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i6, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(e(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 31) {
            return Build.DEVICE.startsWith("generic");
        }
        String str = Build.FINGERPRINT;
        return str.contains("generic") || str.contains("emulator") || Build.HARDWARE.contains("ranchu");
    }

    public static String e(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e9) {
            String g4 = AbstractC4404f.g(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(g4), (Throwable) e9);
            return D.y.p("<", g4, " threw ", e9.getClass().getName(), ">");
        }
    }
}
