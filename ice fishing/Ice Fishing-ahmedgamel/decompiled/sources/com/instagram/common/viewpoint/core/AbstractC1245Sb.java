package com.instagram.common.viewpoint.core;

import android.content.ContentResolver;
import android.database.Cursor;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1245Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 15);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{61, 53, 56, 79, c.f17104b, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 38, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, 18, 23, 19, 23, 10, 33, 10, 12, 31, 29, 21, 23, 16, 25};
    }

    public static C1244Sa A00(ContentResolver contentResolver) {
        String A01 = A01(72, 14, 113);
        String A012 = A01(3, 9, 33);
        String A013 = A01(0, 3, 83);
        Cursor c9 = null;
        try {
            c9 = contentResolver.query(XB.A00(A01(12, 60, 19)), new String[]{A013, A012, A01}, null, null, null);
            if (c9 == null || !c9.moveToFirst()) {
                return new C1244Sa(null, null, false);
            }
            String string = c9.getString(c9.getColumnIndex(A013));
            String attributionId = c9.getString(c9.getColumnIndex(A012));
            C1244Sa c1244Sa = new C1244Sa(string, attributionId, Boolean.valueOf(c9.getString(c9.getColumnIndex(A01))).booleanValue());
            if (c9 != null) {
                c9.close();
            }
            return c1244Sa;
        } finally {
            if (c9 != null) {
                c9.close();
            }
        }
    }
}
