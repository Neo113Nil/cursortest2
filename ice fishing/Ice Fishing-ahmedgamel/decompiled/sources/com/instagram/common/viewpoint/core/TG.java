package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public class TG<T> extends AsyncTask<Void, Void, T> {
    public static byte[] A04;
    public TJ A00;
    public final C1856ge A01;
    public final TK<T> A02;
    public final UO<T> A03;

    static {
        A02();
    }

    public static String A01(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] - i6) - 72);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{5, 2, 21, 2, 3, 2, 20, 6};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TK != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public TG(C1856ge c1856ge, TK<T> tk, UO<T> uo) {
        this.A02 = tk;
        this.A03 = uo;
        this.A01 = c1856ge;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    private final T A00(Void... voidArr) {
        if (WU.A02(this)) {
            return null;
        }
        T t6 = null;
        try {
            try {
                t6 = this.A02.A03();
                this.A00 = this.A02.A00();
                return t6;
            } catch (Exception e9) {
                this.A01.A08().ABC(A01(0, 8, 89), AbstractC1272Td.A0w, new C1273Te(e9));
                this.A00 = TJ.A08;
                return t6;
            }
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Object doInBackground(Void[] voidArr) {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A00(voidArr);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TG != com.facebook.ads.internal.database.AdDatabaseHelper$DatabaseQueryAsyncTask<T> */
    @Override // android.os.AsyncTask
    public final void onPostExecute(T result) {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A03.A02(result);
            } else {
                this.A03.A01(this.A00.A03(), this.A00.A04());
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
