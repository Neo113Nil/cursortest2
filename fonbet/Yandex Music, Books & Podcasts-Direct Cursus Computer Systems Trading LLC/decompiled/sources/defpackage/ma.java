package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.util.Log;
import android.util.SparseArray;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.connectsdk.device.ConnectableDevice;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.nio.ByteBuffer;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

/* loaded from: classes.dex */
public final class ma {
    public int a;
    public int b;
    public Object c;
    public Object d;
    public Object e;

    public static String d(aec aecVar) {
        aecVar.a();
        nec necVar = aecVar.c;
        String str = necVar.e;
        if (str != null) {
            return str;
        }
        aecVar.a();
        String str2 = necVar.b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public static byte[] e(long j, long j2) {
        return ByteBuffer.allocate(16).putLong(j).putLong(j2).array();
    }

    public int a(long j) {
        int i = this.a + 1;
        long[] jArr = (long[]) this.c;
        int length = jArr.length;
        if (i > length) {
            int i2 = length * 2;
            long[] jArr2 = new long[i2];
            int[] iArr = new int[i2];
            uz0.g(jArr, jArr2, 0, 0, jArr.length);
            uz0.h(0, 0, 14, (int[]) this.d, iArr);
            this.c = jArr2;
            this.d = iArr;
        }
        int i3 = this.a;
        this.a = i3 + 1;
        int length2 = ((int[]) this.e).length;
        if (this.b >= length2) {
            int i4 = length2 * 2;
            int[] iArr2 = new int[i4];
            int i5 = 0;
            while (i5 < i4) {
                int i6 = i5 + 1;
                iArr2[i5] = i6;
                i5 = i6;
            }
            uz0.h(0, 0, 14, (int[]) this.e, iArr2);
            this.e = iArr2;
        }
        int i7 = this.b;
        int[] iArr3 = (int[]) this.e;
        this.b = iArr3[i7];
        long[] jArr3 = (long[]) this.c;
        jArr3[i3] = j;
        ((int[]) this.d)[i3] = i7;
        iArr3[i7] = i3;
        while (i3 > 0) {
            int i8 = ((i3 + 1) >> 1) - 1;
            if (jArr3[i8] <= j) {
                break;
            }
            j(i8, i3);
            i3 = i8;
        }
        return i7;
    }

    public ImageView b() {
        ImageView imageView = new ImageView((Context) this.c);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.b, this.a);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap((Bitmap) this.e);
        return imageView;
    }

    public synchronized String c() {
        try {
            if (((String) this.c) == null) {
                i();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.c;
    }

    public PackageInfo f(String str) {
        try {
            return ((Context) this.e).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    public boolean g() {
        int i;
        synchronized (this) {
            i = this.b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.e).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else {
                    if (!fxf.F()) {
                        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                        intent.setPackage("com.google.android.gms");
                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                        if (queryIntentServices != null && queryIntentServices.size() > 0) {
                            this.b = 1;
                            i = 1;
                        }
                    }
                    Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
                    if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (fxf.F()) {
                            this.b = 2;
                        } else {
                            this.b = 1;
                        }
                        i = this.b;
                    } else {
                        this.b = 2;
                        i = 2;
                    }
                }
            }
        }
        return i != 0;
    }

    public void h(Context context, XmlResourceParser xmlResourceParser) {
        f96 f96Var = new f96();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && ConnectableDevice.KEY_ID.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), ConnectableDevice.KEY_ID, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                f96Var.n(context, xmlResourceParser);
                ((SparseArray) this.e).put(identifier, f96Var);
                return;
            }
        }
    }

    public synchronized void i() {
        PackageInfo f = f(((Context) this.e).getPackageName());
        if (f != null) {
            this.c = Integer.toString(f.versionCode);
            this.d = f.versionName;
        }
    }

    public void j(int i, int i2) {
        long[] jArr = (long[]) this.c;
        int[] iArr = (int[]) this.d;
        int[] iArr2 = (int[]) this.e;
        long j = jArr[i];
        jArr[i] = jArr[i2];
        jArr[i2] = j;
        int i3 = iArr[i];
        int i4 = iArr[i2];
        iArr[i] = i4;
        iArr[i2] = i3;
        iArr2[i4] = i;
        iArr2[i3] = i2;
    }

    public void k(byte[] bArr, int i, int i2) {
        byte[] bArr2 = (byte[]) this.e;
        int i3 = this.a;
        int i4 = i;
        int i5 = i4;
        int i6 = i2;
        do {
            int i7 = this.b;
            if (i7 <= 0) {
                try {
                    int update = ((Cipher) this.c).update(bArr, i4, i6, bArr, i5);
                    if (i6 == update) {
                        return;
                    }
                    int i8 = i6 - update;
                    int i9 = 0;
                    vq1.A(i8 < i3);
                    int i10 = i5 + update;
                    int i11 = i3 - i8;
                    this.b = i11;
                    try {
                        vq1.A(((Cipher) this.c).update((byte[]) this.d, 0, i11, (byte[]) this.e, 0) == i3);
                        while (i9 < i8) {
                            bArr[i10] = bArr2[i9];
                            i9++;
                            i10++;
                        }
                        return;
                    } catch (ShortBufferException e) {
                        b6e.q(e);
                        return;
                    }
                } catch (ShortBufferException e2) {
                    b6e.q(e2);
                    return;
                }
            }
            bArr[i5] = (byte) (bArr[i4] ^ bArr2[i3 - i7]);
            i5++;
            i4++;
            this.b = i7 - 1;
            i6--;
        } while (i6 != 0);
    }
}
