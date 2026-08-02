package com.instagram.common.viewpoint.core;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.anythink.core.common.s.a.c;
import com.facebook.ads.internal.util.common.Preconditions;
import java.util.Arrays;
import java.util.UUID;

/* loaded from: assets/audience_network/classes2.dex */
public class US extends AsyncTask<Void, Void, String> {
    public static byte[] A05;
    public C1306Ul A00;
    public final T8 A01;
    public final UO<String> A02;
    public final InterfaceC1297Uc<V7> A03;
    public final V7 A04;

    static {
        A02();
    }

    public static String A00(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i4);
        for (int i9 = 0; i9 < copyOfRange.length; i9++) {
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 12);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A05 = new byte[]{20, 89, 110, 110, 115, 110, 60, 113, 121, 111, 111, 125, 123, 121, 60, Byte.MAX_VALUE, 125, 114, 114, 115, 104, 60, 126, 121, 60, 114, 105, 112, 112, 99, c.f17104b, 72, 72, 70, 65, 72, 15, 74, 89, 74, 65, 91, 21, 15, 102, 113, 119, 123, 102, 112, 75, 112, 117, 96, 117, 118, 117, 103, 113};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Uc != com.facebook.ads.internal.eventstorage.record.RecordDatabase<com.facebook.ads.internal.logging.AdEvent> */
    public US(V7 v72, UO<String> uo, InterfaceC1297Uc<V7> interfaceC1297Uc, T8 t82) {
        this.A04 = v72;
        this.A03 = interfaceC1297Uc;
        this.A02 = uo;
        this.A01 = t82;
    }

    private final String A01(Void... voidArr) {
        byte[] A07;
        if (WU.A02(this)) {
            return null;
        }
        String str = null;
        try {
            try {
                str = UUID.randomUUID().toString();
                this.A01.A08().AA3(this.A04.A06().toString());
            } catch (C1306Ul e9) {
                this.A00 = e9;
                this.A01.A08().ABC(A00(44, 15, 24), AbstractC1272Td.A2N, new C1273Te(e9));
            }
            if (TextUtils.isEmpty(this.A04.A08())) {
                return null;
            }
            if (this.A01.A05().AAO()) {
                String str2 = A00(29, 15, 35) + this.A04.A06().toString() + A00(0, 1, 56) + this.A04.A09().toString();
            }
            InterfaceC1297Uc<V7> interfaceC1297Uc = this.A03;
            A07 = ZD.A07(this.A01, str, this.A04);
            interfaceC1297Uc.AKH(A07);
            return str;
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    private final void A03(String str) {
        if (WU.A02(this)) {
            return;
        }
        try {
            if (this.A00 == null) {
                this.A02.A02(str);
            } else {
                this.A02.A01(0, (String) Preconditions.checkNotNull(this.A00.getMessage(), A00(1, 28, 16)));
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ String doInBackground(Void[] voidArr) {
        if (WU.A02(this)) {
            return null;
        }
        try {
            return A01(voidArr);
        } catch (Throwable th) {
            WU.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(String str) {
        if (WU.A02(this)) {
            return;
        }
        try {
            A03(str);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
