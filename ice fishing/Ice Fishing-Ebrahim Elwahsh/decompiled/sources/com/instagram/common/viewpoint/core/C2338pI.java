package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.anythink.core.common.s.a.c;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.pI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2338pI extends SQLiteOpenHelper implements C5O {
    public static byte[] A00;
    public static String[] A01 = {"YuTOcDzSk33WzGuHUm34fIUZdR6FzBSo", "XTKHU7ykX6HxNiJgN0rgjCseZECTQtra", "VEZqd6OFp5mQyS5r43nHHulMPiVDQ9eW", "aLYnSlPQY916exG9yEmf5vg4GfwoTrU7", "tF23Z6GUlh0Fjg1gJR8XevpVUkpWaXM2", "mepItLhmIU8NS8JNKSf8apCSosOFfjC4", "Cz0Pux5KFog27POOTk7sr9rS4XUT", "HqOHPFLqaLH3svqHIBOSrAzDJwUDQThi"};

    public static String A00(int i, int i4, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i4);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            byte b9 = (byte) ((copyOfRange[i10] ^ i9) ^ 44);
            String[] strArr = A01;
            if (strArr[0].charAt(22) == strArr[2].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "n1qaiWHrUpNnLAu01u7Aygvt6fyaUUnG";
            strArr2[3] = "NzqeYJq8DJ4S2vkSjhcMbPo6SDo1HpGr";
            copyOfRange[i10] = b9;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{104, 1, 14, 104, 13, 16, 1, 27, 28, 27, 104, 80, 70, 91, 68, 52, 94, 105, 105, 116, 105, 59, 126, 99, 126, 120, 110, 111, 114, 117, 124, 59, 56, 42, 47, 10, 31, 10, 9, 10, 24, 14, 59, 25, 4, 29, 2, 15, 14, 25, 116, 105, 126, 97, 125, 112, 104, 116, 99, 78, 120, Byte.MAX_VALUE, 101, 116, 99, Byte.MAX_VALUE, 112, 125, c.f16476c, 117, 115, c.f16476c, 48, 60, 52, 25, 27, 6, 3, 30, 15, 53, 7, 11, 25, 30, 15, 24, 34, 32, 61, 56, 37, 52, 14, 34, 52, 32, 36, 52, c.f16476c, 50, 52, c.f16475b, 77, 68, 81};
    }

    static {
        A01();
    }

    public C2338pI(Context context) {
        super(context.getApplicationContext(), A00(50, 21, 61), (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void A02(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query(A00(75, 13, 70), new String[]{A00(103, 4, 24), A00(71, 4, 125)}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!A00(88, 15, 125).equals(string2)) {
                    String str = A00(11, 5, 56) + string + A00(0, 11, 100) + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e6) {
                        String type = A00(32, 18, 71);
                        AbstractC06314g.A08(type, A00(16, 16, 55) + str, e6);
                    }
                }
            } catch (Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        A02(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
    }
}
