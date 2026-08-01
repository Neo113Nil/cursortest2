package com.instagram.common.viewpoint.core;

import com.anythink.core.common.s.a.c;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: assets/audience_network/classes2.dex */
public final class N8 {
    public static N8 A08;
    public static byte[] A09;
    public static final String A0A;
    public boolean A01;
    public final T8 A03;
    public final String A04;
    public final Executor A07;
    public final CountDownLatch A05 = new CountDownLatch(1);
    public final CountDownLatch A06 = new CountDownLatch(1);
    public final N7 A02 = new N7();
    public String A00 = null;

    public static String A03(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 24);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A09 = new byte[]{65, c.f16317b, 82, 57, 44, 91, 94, 73, 121, 91, 74, 74, 83, 84, 93, 115, 84, 92, 85, 20, 78, 66, 78, 72, 74, 91, 91, 78, 79, 106, 79, 88, 5, 95, 83, 95, 66, 86, 65, 85, 81, 65, 74, 71, 93, 123, 71, 69, 84, 84, 77, 74, 67};
    }

    static {
        A09();
        A0A = N8.class.getSimpleName();
    }

    public N8(T8 t82, boolean z3, Executor executor, String str) {
        this.A03 = t82.A02();
        this.A04 = str;
        this.A07 = executor;
        if (z3) {
            A0A();
        }
    }

    public static synchronized N8 A01(T8 t82) {
        N8 n82;
        synchronized (N8.class) {
            if (A08 == null) {
                A08 = new N8(t82, true, YG.A06, A03(0, 0, 18));
            }
            n82 = A08;
        }
        return n82;
    }

    private String A04(String str) {
        String A03 = A03(0, 0, 18);
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                if (file.exists() && file.length() > 0) {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] data = new byte[(int) file.length()];
                    fileInputStream.read(data);
                    fileInputStream.close();
                    String fileContent = A03(0, 5, 12);
                    A03 = new String(data, fileContent);
                }
            }
        } catch (FileNotFoundException e9) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1252Td.A17, new C1253Te(e9));
        } catch (IOException e10) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1252Td.A19, new C1253Te(e10));
        }
        return A03;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        String A03 = A03(36, 17, 60);
        try {
            this.A02.A08(A04(this.A04 + A03(23, 13, 51)));
            this.A02.A0A(A04(A03(5, 18, 34)));
        } catch (C1253Te e9) {
            A0M();
            this.A03.A08().ABC(A03, AbstractC1252Td.A18, e9);
        } catch (JSONException e10) {
            A0M();
            this.A03.A08().ABC(A03, AbstractC1252Td.A1A, new C1253Te(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A08() {
        String adsFrequencyCappingDataList;
        synchronized (this.A02) {
            adsFrequencyCappingDataList = this.A02.A05().toString();
        }
        A0G(A0K(), adsFrequencyCappingDataList);
    }

    private final void A0A() {
        this.A07.execute(new C2041kD(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A0E(C1103Nf c1103Nf, String str, boolean z3) {
        c1103Nf.A07(z3);
        if (c1103Nf.A08() || c1103Nf.A09()) {
            this.A02.A07(str);
        } else {
            this.A02.A09(str);
        }
    }

    private void A0F(String str) {
        File file = new File(this.A03.getFilesDir(), str);
        if (file.exists()) {
            file.delete();
        }
    }

    private final synchronized void A0G(String str, String str2) {
        A0H(this.A04 + A03(23, 13, 51), str.getBytes());
        A0H(A03(5, 18, 34), str2.getBytes());
    }

    private void A0H(String str, byte[] bArr) {
        try {
            synchronized (this) {
                File file = new File(this.A03.getFilesDir(), str);
                FileOutputStream fout = new FileOutputStream(file);
                fout.write(bArr);
                fout.close();
            }
        } catch (FileNotFoundException e9) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1252Td.A17, new C1253Te(e9));
        } catch (IOException e10) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1252Td.A19, new C1253Te(e10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0J(String str) {
        boolean z3 = false;
        try {
            synchronized (this.A02) {
                z3 = this.A02.A05().get(str) instanceof C1103Nf;
            }
        } catch (JSONException e9) {
            this.A03.A08().ABC(A03(36, 17, 60), AbstractC1252Td.A1A, new C1253Te(e9));
        }
        return z3;
    }

    public final String A0K() {
        return this.A02.A04();
    }

    public final void A0L() {
        if (!this.A01 || this.A00 == null) {
            return;
        }
        this.A07.execute(new C2038kA(this, this.A00));
    }

    public final synchronized void A0M() {
        A0F(this.A04 + A03(5, 18, 34));
        A0F(this.A04 + A03(23, 13, 51));
    }

    public final void A0N(String str) {
        if (!this.A01) {
            return;
        }
        this.A00 = str;
        this.A07.execute(new C2039kB(this, str));
    }

    public final void A0O(JSONObject jSONObject) {
        this.A01 = C1290Up.A1E(this.A03);
        if (!this.A01) {
            return;
        }
        this.A07.execute(new C2040kC(this, jSONObject));
    }
}
