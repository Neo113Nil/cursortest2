package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.wD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4094wD {

    /* renamed from: a, reason: collision with root package name */
    public static String f34814a;

    public static String a(Context context) {
        String str = f34814a;
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
            f34814a = null;
        } else if (arrayList.size() == 1) {
            f34814a = (String) arrayList.get(0);
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
                    f34814a = str2;
                }
            }
            if (arrayList.contains("com.android.chrome")) {
                f34814a = "com.android.chrome";
            } else if (arrayList.contains("com.chrome.beta")) {
                f34814a = "com.chrome.beta";
            } else if (arrayList.contains("com.chrome.dev")) {
                f34814a = "com.chrome.dev";
            }
        }
        return f34814a;
    }

    public static byte[] c(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    public static byte[] d(byte[]... bArr) {
        int i = 0;
        int i6 = 0;
        while (true) {
            if (i >= bArr.length) {
                byte[] bArr2 = new byte[i6];
                int i9 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i9, length);
                    i9 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i].length;
            if (i6 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i6 += length2;
            i++;
        }
    }

    public static AbstractC3825rE f(byte[] bArr) {
        try {
            PK pk = PK.f26757a;
            int i = BK.f23877a;
            C3238gI C8 = C3238gI.C(bArr, PK.f26758b);
            C3290hG c3290hG = C3290hG.f30754b;
            C4151xG b9 = C4151xG.b(C8);
            CG cg = (CG) c3290hG.f30755a.get();
            cg.getClass();
            return !cg.f24087d.containsKey(new AG(C4151xG.class, b9.f34968a)) ? new C2914aG(b9) : c3290hG.g(b9);
        } catch (IOException e9) {
            throw new GeneralSecurityException("Failed to parse proto", e9);
        }
    }

    public static final byte[] g(int i, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i6 = 0; i6 < 16; i6++) {
            bArr3[i6] = (byte) (bArr[i6 + i] ^ bArr2[i6]);
        }
        return bArr3;
    }

    public static byte[] h(BigInteger bigInteger, int i) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i) {
            return byteArray;
        }
        int i6 = i + 1;
        if (length > i6) {
            throw new GeneralSecurityException("integer too large");
        }
        if (length == i6) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i];
        System.arraycopy(byteArray, 0, bArr, i - length, length);
        return bArr;
    }

    public static final void i(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i6 = 0; i6 < i; i6++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static boolean j(byte b9) {
        return b9 > -65;
    }

    public abstract void b(AbstractC4040vD abstractC4040vD, Set set);

    public abstract int e(AbstractC4040vD abstractC4040vD);
}
