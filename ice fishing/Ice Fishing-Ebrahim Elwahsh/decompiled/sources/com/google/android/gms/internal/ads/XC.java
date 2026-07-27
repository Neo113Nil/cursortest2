package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

/* loaded from: classes2.dex */
public abstract class XC {

    /* renamed from: a, reason: collision with root package name */
    public static String f28619a;

    public static byte a(long j9) {
        PA.J((j9 >> 8) == 0, "out of range: %s", j9);
        return (byte) j9;
    }

    public static String c(Context context) {
        String str = f28619a;
        if (str != null) {
            return str;
        }
        PackageManager packageManager = context.getPackageManager();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.example.com"));
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        String str2 = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
        ArrayList arrayList = new ArrayList();
        for (ResolveInfo resolveInfo : queryIntentActivities) {
            Intent intent2 = new Intent();
            intent2.setAction("android.support.customtabs.action.CustomTabsService");
            intent2.setPackage(resolveInfo.activityInfo.packageName);
            if (packageManager.resolveService(intent2, 0) != null) {
                arrayList.add(resolveInfo.activityInfo.packageName);
            }
        }
        if (arrayList.isEmpty()) {
            f28619a = null;
        } else if (arrayList.size() == 1) {
            f28619a = (String) arrayList.get(0);
        } else {
            if (!TextUtils.isEmpty(str2)) {
                try {
                    List<ResolveInfo> queryIntentActivities2 = context.getPackageManager().queryIntentActivities(intent, 64);
                    if (queryIntentActivities2 != null && queryIntentActivities2.size() != 0) {
                        for (ResolveInfo resolveInfo2 : queryIntentActivities2) {
                            IntentFilter intentFilter = resolveInfo2.filter;
                            if (intentFilter != null && intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo2.activityInfo != null) {
                                break;
                            }
                        }
                    }
                } catch (RuntimeException unused) {
                    Log.e("CustomTabsHelper", "Runtime exception while getting specialized handlers");
                }
                if (arrayList.contains(str2)) {
                    f28619a = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f28619a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f28619a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f28619a = "com.chrome.dev";
            }
        }
        return f28619a;
    }

    public static String d(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b9 : bArr) {
            if (b9 == 34) {
                sb.append("\\\"");
            } else if (b9 == 39) {
                sb.append("\\'");
            } else if (b9 != 92) {
                switch (b9) {
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
                        if (b9 < 32 || b9 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b9 >>> 6) & 3) + 48));
                            sb.append((char) (((b9 >>> 3) & 7) + 48));
                            sb.append((char) ((b9 & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b9);
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static boolean e(int i) {
        Boolean bool;
        if (i - 1 != 0) {
            if (!JF.a()) {
                return true;
            }
            try {
                bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
                JF.f25753a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return true;
            }
        } else if (!JF.a()) {
            return true;
        }
        return false;
    }

    public static byte[] f(byte[]... bArr) {
        int i = 0;
        int i4 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i4];
                int i9 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i9, length);
                    i9 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i4 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i4 += length2;
            i++;
        }
    }

    public static final byte[] h(int i, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i4 = 0; i4 < 16; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4]);
        }
        return bArr3;
    }

    public static final void i(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i4 = 0; i4 < i; i4++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public abstract AbstractC4000uE b();

    public abstract Integer g();
}
