package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.anythink.core.common.s.a.c;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1247Sy {
    public static byte[] A03;
    public static String[] A04 = {"hUOGynEtmSUNsKdJkghkOGNAWtryygzy", "wzPRxUupX2XKUl6NSNI9kT750batbohw", "Jhw1FAiFO5yEDnp58HFyVFkAnHcYvwe5", "TOMeOtqGrF4uQ0cY9hasq1ESWlFY5vR9", "yYpnUvpVzVqKhRvrciBHRtLUwNGFzaUs", "hHaB", "31TBXmQRr4tlfWcucEg5Ko3P35yO7", "Q2"};
    public static final String A05;
    public static volatile C1247Sy A06;
    public final C1836ge A00;
    public final Map<String, C1244Sv> A02 = Collections.synchronizedMap(new HashMap());
    public final Map<String, Float> A01 = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private Bitmap A02(T8 t82, C1244Sv c1244Sv, String str) {
        Bitmap A01;
        String str2 = c1244Sv.A08;
        int i = c1244Sv.A04;
        int i6 = c1244Sv.A05;
        long currentTimeMillis = System.currentTimeMillis();
        IOException e9 = null;
        String A08 = A08(223, 9, 68);
        boolean startsWith = str2.startsWith(A08);
        String A082 = A08(239, 22, 119);
        if (startsWith || str2.startsWith(A082)) {
            String substring = str2.startsWith(A08) ? str2.substring(A08.length()) : str2.substring(A082.length());
            InputStream inputStream = null;
            try {
                try {
                    inputStream = this.A00.getAssets().open(substring);
                    if (A0D(i, i6)) {
                        try {
                            A01 = T2.A01(inputStream, i, i6);
                        } catch (IOException e10) {
                            e = e10;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (OutOfMemoryError e11) {
                            e = e11;
                            A0C(e);
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            return null;
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                A0A(inputStream);
                            }
                            throw th;
                        }
                    } else {
                        A01 = BitmapFactory.decodeStream(inputStream);
                    }
                    if (inputStream != null) {
                        A0A(inputStream);
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e12) {
                e = e12;
            } catch (OutOfMemoryError e13) {
                e = e13;
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (A0D(i, i6)) {
            try {
                A01 = A05(str2, i, i6);
            } catch (IOException e14) {
                e9 = e14;
                A0C(e9);
                A01 = A03(str2);
            }
        } else {
            A01 = A03(str2);
        }
        String th4 = e9 != null ? e9.toString() : null;
        if (A01 == null) {
            T0.A03(t82, c1244Sv, str, T0.A03, th4, null, null);
            return null;
        }
        long A00 = A00(str2, A01);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        if (A00 > 0) {
            T0.A03(t82, c1244Sv, str, T0.A02, th4, Long.valueOf(A00), Long.valueOf(currentTimeMillis2));
            return A01;
        }
        T0.A03(t82, c1244Sv, str, T0.A01, th4, null, null);
        if (C1290Up.A11(t82)) {
            return null;
        }
        return A01;
    }

    public static String A08(int i, int i6, int i9) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i6);
        for (int i10 = 0; i10 < copyOfRange.length; i10++) {
            copyOfRange[i10] = (byte) ((copyOfRange[i10] ^ i9) ^ 67);
        }
        return new String(copyOfRange);
    }

    public static void A09() {
        A03 = new byte[]{3, 4, 119, 41, 55, 62, 58, 25, 28, 88, 23, 13, 12, 8, 13, 12, 88, 28, 29, 11, 12, 17, 22, 25, 12, 17, 23, 22, 88, 80, 30, 17, 20, 29, 69, 122, 81, 76, 85, 89, 72, 24, 75, 81, 66, 93, 24, 93, c.f16317b, 91, 93, 93, 92, 75, 24, 85, 89, c.f16317b, 24, 75, 81, 66, 93, 24, 94, 87, 74, 24, 75, 76, 87, 74, 89, 95, 93, 2, 24, 18, 48, 50, 57, 52, 113, 52, 35, 35, 62, 35, Byte.MAX_VALUE, 113, 19, 56, 37, 60, 48, 33, 113, 56, 34, 113, c.f16318c, 36, 61, 61, Byte.MAX_VALUE, 125, 90, 82, 87, 94, 95, 27, 79, 84, 27, 88, 84, 75, 66, 27, 87, 84, 88, 90, 87, 27, 82, 86, 90, 92, 94, 27, 82, 85, 79, 84, 27, 88, 90, 88, 83, 94, 27, 19, 78, 73, 87, 6, 38, 29, 18, 17, 31, 22, 83, 7, 28, 83, 4, 1, 26, 7, 22, 83, 17, 26, 7, 30, 18, 3, 83, 7, 28, 83, 21, 26, 31, 22, 83, 91, 6, 1, 31, 78, 70, 125, 114, 113, Byte.MAX_VALUE, 118, 51, 103, 124, 51, 100, 97, 122, 103, 118, 51, 113, 122, 103, 126, 114, 99, 51, 103, 124, 51, 124, 102, 103, 99, 102, 103, 51, 96, 103, 97, 118, 114, 126, 102, 116, 116, 98, 115, 61, 40, 40, 40, 85, 90, 95, 86, 9, 28, 28, 82, 93, 88, 81, 14, 27, 27, 27, 85, 90, 80, 70, 91, 93, 80, 107, 85, 71, 71, 81, c.f16317b, 27, 115, 119, 123, 125, Byte.MAX_VALUE, 10, 9, 7, 2, 42, 49, 52, 49, 48, 40, 49};
    }

    static {
        A09();
        A05 = C1247Sy.class.getSimpleName();
    }

    public C1247Sy(C1836ge c1836ge) {
        this.A00 = c1836ge;
    }

    private int A00(String str, Bitmap bitmap) {
        String A08 = A08(0, 2, 105);
        if (bitmap == null) {
            A0C(null);
            return 0;
        }
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        ByteArrayOutputStream bOut = null;
        FileOutputStream fileOutputStream = null;
        try {
            bOut = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bOut);
            int size = bOut.size();
            if (size >= C1290Up.A0H(this.A00)) {
                A0C(new Throwable(A08(35, 42, 123) + size));
                return 0;
            }
            fileOutputStream = new FileOutputStream(file);
            bOut.writeTo(fileOutputStream);
            fileOutputStream.flush();
            return size;
        } catch (OutOfMemoryError e9) {
            A0C(e9);
            Log.e(A05, A08(184, 39, 80), e9);
            return 0;
        } catch (FileNotFoundException e10) {
            Log.e(A05, A08(6, 29, 59) + file.getPath() + A08, e10);
            A0C(e10);
            return 0;
        } catch (IOException e11) {
            A0C(e11);
            Log.e(A05, A08(148, 36, 48) + str + A08, e11);
            return 0;
        } finally {
            A0A(bOut);
            A0A(fileOutputStream);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bitmap A01(T8 t82, C1244Sv c1244Sv, int i, int i6, String str) {
        Bitmap decodeFile;
        Bitmap A02;
        if (T0.A06(t82) && A08(266, 4, 37).equals(str)) {
            this.A02.put(c1244Sv.A08, c1244Sv);
        }
        String str2 = c1244Sv.A08;
        C1248Sz c1248Sz = new C1248Sz(c1244Sv.A06, c1244Sv.A07, A08(261, 5, 89), str, str2);
        File A07 = A07(this.A00);
        StringBuilder append = new StringBuilder().append(str2.hashCode());
        String url = A08(2, 4, 26);
        File file = new File(A07, append.append(url).toString());
        if (!file.exists()) {
            T0.A04(t82, c1248Sz, false);
            String url2 = A08(232, 7, 112);
            if (str2.startsWith(url2)) {
                if (A04[4].charAt(22) == 'U') {
                    throw new RuntimeException();
                }
                A04[4] = "1yvOkimt2rWPU4mmWW1HHQmjZRsiMbmk";
                String url3 = A08(239, 22, 119);
                if (!str2.startsWith(url3)) {
                    A02 = A04(str2, i6, i);
                    String str3 = c1244Sv.A08;
                    if (A04[0].charAt(7) == 'l') {
                        A04[5] = "mvVz";
                        A0B(str3, A02);
                        return A02;
                    }
                    A04[4] = "ZqrwEo7e3gbOTkHDiv52cvZJTxj52IUd";
                    A0B(str3, A02);
                    return A02;
                }
            }
            A02 = A02(t82, c1244Sv, str);
            String str32 = c1244Sv.A08;
            if (A04[0].charAt(7) == 'l') {
            }
        } else {
            T0.A04(t82, c1248Sz, true);
            try {
                if (A0D(i6, i)) {
                    decodeFile = T2.A02(file.getCanonicalPath(), i6, i, this.A00);
                } else {
                    String url4 = file.getCanonicalPath();
                    decodeFile = BitmapFactory.decodeFile(url4);
                }
                String url5 = c1244Sv.A08;
                A0B(url5, decodeFile);
                return decodeFile;
            } catch (IOException e9) {
                A0C(e9);
                return null;
            }
        }
    }

    private Bitmap A03(String str) {
        byte[] A72;
        InterfaceC1790fu AGw = C1809gD.A00(this.A00).AGw(str, new C1805g9());
        if (AGw == null || (A72 = AGw.A72()) == null) {
            return null;
        }
        int length = A72.length;
        if (A04[4].charAt(22) == 'U') {
            throw new RuntimeException();
        }
        A04[2] = "99IwdndnBnCK07hgvsXqxjXsnHcettbD";
        return BitmapFactory.decodeByteArray(A72, 0, length);
    }

    private Bitmap A04(String str, int i, int i6) {
        Bitmap decodeStream;
        int A00;
        try {
            boolean A0D = A0D(i, i6);
            String A08 = A08(232, 7, 112);
            if (A0D) {
                decodeStream = T2.A02(str.substring(A08.length()), i, i6, this.A00);
            } else {
                decodeStream = BitmapFactory.decodeStream(new FileInputStream(str.substring(A08.length())), null, null);
            }
            A00 = A00(str, decodeStream);
        } catch (IOException e9) {
            Log.e(A05, A08(105, 43, 120) + str + A08(0, 2, 105), e9);
        }
        if (C1290Up.A11(this.A00)) {
            if (A00 <= 0) {
                return null;
            }
            return decodeStream;
        }
        return decodeStream;
    }

    private Bitmap A05(String str, int i, int i6) throws IOException {
        URL urlObj = new URL(str);
        HttpURLConnection connection = (HttpURLConnection) urlObj.openConnection();
        connection.setDoInput(true);
        connection.connect();
        InputStream inputStream = connection.getInputStream();
        Bitmap A01 = T2.A01(inputStream, i, i6);
        A0A(inputStream);
        return A01;
    }

    public static C1247Sy A06(C1836ge c1836ge) {
        if (A06 == null) {
            synchronized (C1247Sy.class) {
                if (A06 == null) {
                    A06 = new C1247Sy(c1836ge);
                }
            }
        }
        return A06;
    }

    public static File A07(T8 t82) {
        return t82.getCacheDir();
    }

    public static void A0A(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private void A0B(String str, Bitmap bitmap) {
        if (!this.A01.containsKey(str) && bitmap != null && bitmap.getHeight() > 0) {
            float width = bitmap.getWidth() / bitmap.getHeight();
            if (width > 0.0f) {
                this.A01.put(str, Float.valueOf(width));
            }
        }
    }

    private void A0C(Throwable th) {
        String A08 = A08(261, 5, 89);
        if (th != null) {
            this.A00.A08().ABC(A08, AbstractC1252Td.A1f, new C1253Te(th));
        } else {
            this.A00.A08().ABC(A08, AbstractC1252Td.A1f, new C1253Te(A08(77, 28, 18)));
        }
    }

    private boolean A0D(int i, int i6) {
        return i > 0 && i6 > 0;
    }

    public final float A0E(String str) {
        if (this.A01.containsKey(str) && this.A01.get(str) != null) {
            return this.A01.get(str).floatValue();
        }
        if (A04[6].length() == 28) {
            throw new RuntimeException();
        }
        A04[6] = "EtgkjkQAQYyyMgrrXA05VcKpExUV0Ywa";
        return -1.0f;
    }

    public final Bitmap A0F(C1244Sv c1244Sv) {
        return A01(this.A00, c1244Sv, c1244Sv.A05, c1244Sv.A04, c1244Sv.A02);
    }

    public final Bitmap A0G(T8 t82, String str, int i, int i6, String str2) {
        C1244Sv c1244Sv = this.A02.get(str);
        return (!T0.A06(t82) || c1244Sv == null) ? A01(t82, new C1244Sv(str, i, i6, A08(270, 7, 28), A08(270, 7, 28)), i6, i, str2) : A01(t82, c1244Sv, i6, i, str2);
    }

    public final File A0H(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public final String A0I(String str) {
        File file = new File(A07(this.A00), str.hashCode() + A08(2, 4, 26));
        return file.exists() ? file.getPath() : str;
    }
}
