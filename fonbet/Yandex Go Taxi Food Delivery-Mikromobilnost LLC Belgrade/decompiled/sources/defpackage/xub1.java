package defpackage;

import android.graphics.Typeface;
import com.squareup.wire.internal.MathMethodsKt;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public abstract class xub1 {
    public static Typeface a;
    public static Typeface b;

    public static ArrayList a(byte[] bArr) {
        long d = (d(bArr) * MathMethodsKt.NANOS_PER_SECOND) / 48000;
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(d).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static j0g b(i6r i6rVar, xnr0 xnr0Var) {
        i6rVar.getClass();
        xnr0Var.getClass();
        return new j0g(i6rVar, xnr0Var);
    }

    public static long c(byte b2, byte b3) {
        int i;
        int i2 = b2 & 255;
        int i3 = b2 & 3;
        if (i3 != 0) {
            i = 2;
            if (i3 != 1 && i3 != 2) {
                i = b3 & 63;
            }
        } else {
            i = 1;
        }
        int i4 = i2 >> 3;
        return i * (i4 >= 16 ? 2500 << r6 : i4 >= 12 ? 10000 << (i4 & 1) : (i4 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static int d(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean e(long j, long j2) {
        return j - j2 <= 80000;
    }
}
