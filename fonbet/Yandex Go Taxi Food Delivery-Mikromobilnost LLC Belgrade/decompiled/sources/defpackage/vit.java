package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.google.android.gms.tasks.Task;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.firebase.crashlytics.internal.settings.a;
import com.yandex.go.network_metrics.Status;
import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.plus.pay.common.api.model.PlusPayPlatform;
import io.appmetrica.analytics.impl.C0553n3;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeoutException;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes.dex */
public final class vit implements jk7, s16, a18, jhe, sxy, p0m, ghr0 {
    public static volatile vit c;
    public static final vit w = new vit(1, new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f});
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002c, code lost:
    
        if (r8 == 1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0049 A[LOOP:1: B:13:0x0047->B:14:0x0049, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vit(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int length;
        int i2;
        int i3 = 5;
        this.a = 5;
        int length2 = fArr.length - 1;
        a43[][] a43VarArr = new a43[length2][];
        int i4 = 1;
        int i5 = 1;
        int i6 = 0;
        while (i6 < length2) {
            int i7 = iArr[i6];
            int i8 = 3;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            i8 = 4;
                            if (i7 != 4) {
                                i = i7 != i3 ? i5 : i3;
                                float[] fArr3 = fArr2[i6];
                                int i9 = i6 + 1;
                                float[] fArr4 = fArr2[i9];
                                float f = fArr[i6];
                                float f2 = fArr[i9];
                                length = (fArr3.length % 2) + (fArr3.length / 2);
                                a43[] a43VarArr2 = new a43[length];
                                i2 = 0;
                                while (i2 < length) {
                                    int i10 = i2 * 2;
                                    int i11 = i2;
                                    int i12 = i10 + 1;
                                    a43VarArr2[i11] = new a43(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                                    i2 = i11 + 1;
                                }
                                a43VarArr[i6] = a43VarArr2;
                                i6 = i9;
                                i5 = i;
                                i3 = 5;
                            }
                        }
                    }
                    i4 = 2;
                    i = i4;
                    float[] fArr32 = fArr2[i6];
                    int i92 = i6 + 1;
                    float[] fArr42 = fArr2[i92];
                    float f3 = fArr[i6];
                    float f22 = fArr[i92];
                    length = (fArr32.length % 2) + (fArr32.length / 2);
                    a43[] a43VarArr22 = new a43[length];
                    i2 = 0;
                    while (i2 < length) {
                    }
                    a43VarArr[i6] = a43VarArr22;
                    i6 = i92;
                    i5 = i;
                    i3 = 5;
                }
                i4 = 1;
                i = i4;
                float[] fArr322 = fArr2[i6];
                int i922 = i6 + 1;
                float[] fArr422 = fArr2[i922];
                float f32 = fArr[i6];
                float f222 = fArr[i922];
                length = (fArr322.length % 2) + (fArr322.length / 2);
                a43[] a43VarArr222 = new a43[length];
                i2 = 0;
                while (i2 < length) {
                }
                a43VarArr[i6] = a43VarArr222;
                i6 = i922;
                i5 = i;
                i3 = 5;
            }
            i = i8;
            float[] fArr3222 = fArr2[i6];
            int i9222 = i6 + 1;
            float[] fArr4222 = fArr2[i9222];
            float f322 = fArr[i6];
            float f2222 = fArr[i9222];
            length = (fArr3222.length % 2) + (fArr3222.length / 2);
            a43[] a43VarArr2222 = new a43[length];
            i2 = 0;
            while (i2 < length) {
            }
            a43VarArr[i6] = a43VarArr2222;
            i6 = i9222;
            i5 = i;
            i3 = 5;
        }
        this.b = a43VarArr;
    }

    public static c d(String str, String str2, String str3, String str4, long j, String str5, String str6) {
        kdx kdxVar = new kdx();
        kdxVar.b("url", qcx.c(str));
        kdxVar.b("source", qcx.c(str2));
        kdxVar.b("load_time_ms", qcx.b(Long.valueOf(j)));
        if (str3 != null) {
            kdxVar.b("image_source", qcx.c(str3));
        }
        if (str4 != null) {
            kdxVar.b("error_group", qcx.c(str4));
        }
        kdxVar.b("size_segment", qcx.c(str5));
        if (str6 != null) {
            kdxVar.b("snippet_source", qcx.c(str6));
        }
        return kdxVar.a();
    }

    public static int n(InputStream inputStream, Socket socket, byte[] bArr, int i, long j) {
        r(j);
        socket.setSoTimeout(s(j));
        return inputStream.read(bArr, 0, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0174, code lost:
    
        defpackage.ny61.v("Malformed chunk terminator");
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0179, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x017a, code lost:
    
        defpackage.ny61.v("Truncated chunk data");
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x017f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0195, code lost:
    
        r0 = r1.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01cf, code lost:
    
        return new defpackage.suu(r6, r9, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0180, code lost:
    
        defpackage.ny61.v(defpackage.oyr.i(r2, "Negative chunk size: "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0189, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x018a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x018b, code lost:
    
        defpackage.dac.g("Malformed chunk size: ".concat(r2), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0194, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0125, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0127, code lost:
    
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x019a, code lost:
    
        if (r13 < 0) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x019c, code lost:
    
        r7 = new java.io.ByteArrayOutputStream(r13);
        r3 = java.lang.Math.min(r2.length, r13);
        r7.write(r2, 0, r3);
        r13 = r13 - r3;
        r2 = new byte[4096];
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01af, code lost:
    
        if (r13 <= 0) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01b1, code lost:
    
        r3 = n(r0, r1, r2, java.lang.Math.min(4096, r13), r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01b9, code lost:
    
        if (r3 >= 0) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01bc, code lost:
    
        r7.write(r2, 0, r3);
        r13 = r13 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01c1, code lost:
    
        r0 = r7.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01c6, code lost:
    
        r0 = p(r0, r2, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01d0, code lost:
    
        defpackage.ny61.v(defpackage.oyr.j(r13, "Content-Length ", " exceeds 524288 bytes"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01db, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01dc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01dd, code lost:
    
        defpackage.dac.g("Malformed HTTP status line: ".concat(r6), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01e6, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01e7, code lost:
    
        defpackage.ny61.v("Malformed HTTP status line: ".concat(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01f0, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01f1, code lost:
    
        defpackage.ny61.v("Malformed HTTP response (no header terminator)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01f8, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0065, code lost:
    
        if (r8 < 0) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0067, code lost:
    
        r2 = java.util.Arrays.copyOf(r6.a(), r6.size());
        r3 = new java.lang.String(r2, 0, r8, java.nio.charset.StandardCharsets.ISO_8859_1).split(ru.cprocsp.NGate.tools.Constants.LINE_SEPARATOR);
        r6 = r3[0];
        r13 = r6.split(" ");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x008c, code lost:
    
        if (r13.length < 2) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
    
        r6 = java.lang.Integer.parseInt(r13[1]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        r15 = false;
        r7 = 1;
        r13 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009b, code lost:
    
        if (r7 >= r3.length) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        r11 = r3[r7].indexOf(58);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a5, code lost:
    
        if (r11 >= 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a8, code lost:
    
        r14 = r3[r7].substring(r12, r11).trim();
        r12 = java.util.Locale.US;
        r14 = r14.toLowerCase(r12);
        r10 = r3[r7].substring(r11 + 1).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ca, code lost:
    
        if (r14.equals("location") == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d4, code lost:
    
        if (r14.equals("content-length") == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e1, code lost:
    
        if (r14.equals("transfer-encoding") == false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ed, code lost:
    
        if (r10.toLowerCase(r12).contains("chunked") == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00d6, code lost:
    
        r13 = java.lang.Integer.parseInt(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00fa, code lost:
    
        if (r13 > 524288) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fc, code lost:
    
        r2 = java.util.Arrays.copyOfRange(r2, r8 + 4, r2.length);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0103, code lost:
    
        if (r15 == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        r0 = p(r0, r2, r1, r4);
        r1 = new java.io.ByteArrayOutputStream();
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0110, code lost:
    
        if (r2 >= r0.length) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0112, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0113, code lost:
    
        r4 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0116, code lost:
    
        if (r4 >= r0.length) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011c, code lost:
    
        if (r0[r3] != 13) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0122, code lost:
    
        if (r0[r4] != 10) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0128, code lost:
    
        if (r3 >= 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x012b, code lost:
    
        r2 = new java.lang.String(r0, r2, r3 - r2, java.nio.charset.StandardCharsets.US_ASCII).trim();
        r4 = r2.indexOf(59);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        if (r4 < 0) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0140, code lost:
    
        r2 = r2.substring(0, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0145, code lost:
    
        r2 = java.lang.Integer.parseInt(r2.trim(), 16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014f, code lost:
    
        if (r2 < 0) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0151, code lost:
    
        r3 = r3 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0153, code lost:
    
        if (r2 != 0) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0158, code lost:
    
        if (r2 > (r0.length - r3)) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015a, code lost:
    
        r4 = r3 + r2;
        r5 = r4 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015f, code lost:
    
        if (r5 > r0.length) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0165, code lost:
    
        if (r0[r4] != 13) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x016d, code lost:
    
        if (r0[r4 + 1] != 10) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x016f, code lost:
    
        r1.write(r0, r3, r2);
        r2 = r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static suu o(Socket socket, long j) {
        int i;
        Socket socket2;
        long j2;
        int max;
        InputStream inputStream = socket.getInputStream();
        ruu ruuVar = new ruu();
        byte[] bArr = new byte[4096];
        loop0: while (true) {
            int i2 = -1;
            while (true) {
                String str = null;
                i = 0;
                if (i2 >= 0) {
                    socket2 = socket;
                    j2 = j;
                    break loop0;
                }
                int size = ruuVar.size();
                socket2 = socket;
                j2 = j;
                int n = n(inputStream, socket2, bArr, 4096, j2);
                if (n < 0) {
                    break loop0;
                }
                ruuVar.write(bArr, 0, n);
                if (ruuVar.size() > 16384) {
                    ny61.v("HTTP response headers exceed 16384 bytes");
                    return null;
                }
                byte[] a = ruuVar.a();
                max = Math.max(0, size - 3);
                int size2 = ruuVar.size();
                while (true) {
                    int i3 = max + 3;
                    if (i3 < size2) {
                        if (a[max] != 13 || a[max + 1] != 10 || a[max + 2] != 13 || a[i3] != 10) {
                            max++;
                        }
                    }
                }
                i2 = max;
            }
        }
        int i4 = i4 + 1;
        i = 0;
    }

    public static byte[] p(InputStream inputStream, byte[] bArr, Socket socket, long j) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[4096];
        do {
            int n = n(inputStream, socket, bArr2, 4096, j);
            if (n < 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr2, 0, n);
        } while (byteArrayOutputStream.size() <= 524288);
        ny61.v("AIA response body exceeds 524288 bytes");
        return null;
    }

    public static void r(long j) {
        if (System.nanoTime() < j) {
            return;
        }
        ny61.v("AIA fetch deadline exceeded");
    }

    public static int s(long j) {
        long nanoTime = j - System.nanoTime();
        if (nanoTime <= 0) {
            ny61.v("AIA fetch deadline exceeded");
            return 0;
        }
        long j2 = nanoTime / 1000000;
        if (j2 == 0) {
            j2 = 1;
        }
        return (int) Math.min(5000L, Math.min(2147483647L, j2));
    }

    @Override // defpackage.sxy
    public Drawable a(Drawable drawable) {
        return (Drawable) this.b;
    }

    @Override // defpackage.ghr0
    public xre b(xre xreVar) {
        float strokeInsetLength;
        if (xreVar instanceof osi0) {
            return xreVar;
        }
        strokeInsetLength = ((MaterialShapeDrawable) this.b).getStrokeInsetLength();
        return new rb1(-strokeInsetLength, xreVar);
    }

    @Override // defpackage.p0m
    public o0m c() {
        return (w800) this.b;
    }

    @Override // defpackage.jk7
    public void e(yf7 yf7Var) {
        w2j0 w2j0Var = (w2j0) ((on2) this.b).d.get();
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.Enqueue, new qda0(25));
    }

    @Override // defpackage.a18
    public void f(Typeface typeface) {
        hbc hbcVar = (hbc) this.b;
        if (hbcVar.z(typeface)) {
            hbcVar.l(false);
        }
    }

    @Override // defpackage.jk7
    public void g(yf7 yf7Var, kvj0 kvj0Var, long j) {
        w2j0 w2j0Var = (w2j0) ((on2) this.b).d.get();
        w2j0Var.getClass();
        w2j0Var.a(yf7Var, Status.ParsingEnd, new er20(kvj0Var, j));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x02e3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x02ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Integer h(String str) {
        Integer num;
        ab90 ab90Var = (ab90) ((va90) this.b).a;
        int i = ab90Var.c;
        int i2 = ab90Var.j;
        int i3 = ab90Var.o;
        int i4 = ab90Var.w;
        if (str != null) {
            switch (str.hashCode()) {
                case -2051498519:
                    if (str.equals("cardDivider")) {
                        kgx kgxVar = ab90.x[20];
                        num = Integer.valueOf(ab90Var.a(i4));
                        break;
                    }
                    break;
                case -1884548997:
                    if (str.equals("bgInvert")) {
                        int i5 = ab90Var.f;
                        kgx kgxVar2 = ab90.x[3];
                        num = Integer.valueOf(ab90Var.a(i5));
                        break;
                    }
                    break;
                case -1732262959:
                    if (str.equals("textOnControl")) {
                        int i6 = ab90Var.m;
                        kgx kgxVar3 = ab90.x[10];
                        num = Integer.valueOf(ab90Var.a(i6));
                        break;
                    }
                    break;
                case -1715476298:
                    if (str.equals("controlMain")) {
                        kgx kgxVar4 = ab90.x[12];
                        num = Integer.valueOf(ab90Var.a(i3));
                        break;
                    }
                    break;
                case -1639914408:
                    if (str.equals("controlMinor")) {
                        int i7 = ab90Var.p;
                        kgx kgxVar5 = ab90.x[13];
                        num = Integer.valueOf(ab90Var.a(i7));
                        break;
                    }
                    break;
                case -1631672619:
                    if (str.equals("bgRipple")) {
                        int i8 = ab90Var.h;
                        kgx kgxVar6 = ab90.x[5];
                        num = Integer.valueOf(ab90Var.a(i8));
                        break;
                    }
                    break;
                case -1487903893:
                    if (str.equals("bgFloating")) {
                        int i9 = ab90Var.e;
                        kgx kgxVar7 = ab90.x[2];
                        num = Integer.valueOf(ab90Var.a(i9));
                        break;
                    }
                    break;
                case -1391797346:
                    if (str.equals("bgMain")) {
                        kgx kgxVar8 = ab90.x[0];
                        num = Integer.valueOf(ab90Var.a(i));
                        break;
                    }
                    break;
                case -1332194002:
                    if (str.equals(C0553n3.g)) {
                        kgx kgxVar9 = ab90.x[0];
                        num = Integer.valueOf(ab90Var.a(i));
                        break;
                    }
                    break;
                case -1087730683:
                    if (str.equals("controlPressed")) {
                        int i10 = ab90Var.q;
                        kgx kgxVar10 = ab90.x[14];
                        num = Integer.valueOf(ab90Var.a(i10));
                        break;
                    }
                    break;
                case -1054513528:
                    if (str.equals("textMinor")) {
                        int i11 = ab90Var.k;
                        kgx kgxVar11 = ab90.x[8];
                        num = Integer.valueOf(ab90Var.a(i11));
                        break;
                    }
                    break;
                case -1003855738:
                    if (str.equals("textMain")) {
                        kgx kgxVar12 = ab90.x[7];
                        num = Integer.valueOf(ab90Var.a(i2));
                        break;
                    }
                    break;
                case -688823980:
                    if (str.equals("fogDark")) {
                        int i12 = ab90Var.t;
                        kgx kgxVar13 = ab90.x[17];
                        num = Integer.valueOf(ab90Var.a(i12));
                        break;
                    }
                    break;
                case -638421183:
                    if (str.equals("shimmering")) {
                        int i13 = ab90Var.i;
                        kgx kgxVar14 = ab90.x[6];
                        num = Integer.valueOf(ab90Var.a(i13));
                        break;
                    }
                    break;
                case -195801488:
                    if (str.equals("bgMinor")) {
                        int i14 = ab90Var.d;
                        kgx kgxVar15 = ab90.x[1];
                        num = Integer.valueOf(ab90Var.a(i14));
                        break;
                    }
                    break;
                case 110997:
                    if (str.equals("pin")) {
                        int i15 = ab90Var.s;
                        kgx kgxVar16 = ab90.x[16];
                        num = Integer.valueOf(ab90Var.a(i15));
                        break;
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        int i16 = ab90Var.r;
                        kgx kgxVar17 = ab90.x[15];
                        num = Integer.valueOf(ab90Var.a(i16));
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        kgx kgxVar18 = ab90.x[7];
                        num = Integer.valueOf(ab90Var.a(i2));
                        break;
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        int i17 = ab90Var.u;
                        kgx kgxVar19 = ab90.x[18];
                        num = Integer.valueOf(ab90Var.a(i17));
                        break;
                    }
                    break;
                case 104349611:
                    if (str.equals("everFront")) {
                        kgx kgxVar20 = ab90.x[21];
                        num = Integer.valueOf(ab90Var.a(i4));
                        break;
                    }
                    break;
                case 280324901:
                    if (str.equals("everBack")) {
                        kgx kgxVar21 = ab90.x[22];
                        num = Integer.valueOf(ab90Var.a(i4));
                        break;
                    }
                    break;
                case 817196644:
                    if (str.equals("textOnControlMinor")) {
                        int i18 = ab90Var.n;
                        kgx kgxVar22 = ab90.x[11];
                        num = Integer.valueOf(ab90Var.a(i18));
                        break;
                    }
                    break;
                case 951543133:
                    if (str.equals("control")) {
                        kgx kgxVar23 = ab90.x[12];
                        num = Integer.valueOf(ab90Var.a(i3));
                        break;
                    }
                    break;
                case 1560148835:
                    if (str.equals("textInvert")) {
                        int i19 = ab90Var.l;
                        kgx kgxVar24 = ab90.x[9];
                        num = Integer.valueOf(ab90Var.a(i19));
                        break;
                    }
                    break;
                case 1663568845:
                    if (str.equals("bgTransparent")) {
                        int i20 = ab90Var.g;
                        kgx kgxVar25 = ab90.x[4];
                        num = Integer.valueOf(ab90Var.a(i20));
                        break;
                    }
                    break;
                case 2105163132:
                    if (str.equals("textOnError")) {
                        int i21 = ab90Var.v;
                        kgx kgxVar26 = ab90.x[19];
                        num = Integer.valueOf(ab90Var.a(i21));
                        break;
                    }
                    break;
            }
            if (num == null) {
                num = khc.a(str);
            }
            if (num == null) {
                return num;
            }
            Integer a = khc.a(str);
            if (a != null && a.intValue() == 0) {
                return null;
            }
            return a;
        }
        num = null;
        if (num == null) {
        }
        if (num == null) {
        }
    }

    @Override // defpackage.jhe
    public void i(pge pgeVar) {
        qeu qeuVar = (qeu) this.b;
        if (pgeVar instanceof oge) {
            oge ogeVar = (oge) pgeVar;
            qeuVar.g(ogeVar.b(), ogeVar.a());
        } else if (!(pgeVar instanceof nge)) {
            w511.b();
        } else {
            nge ngeVar = (nge) pgeVar;
            qeuVar.v(ngeVar.b(), ngeVar.a(), ngeVar.c());
        }
    }

    @Override // defpackage.s16
    public boolean isEnabled() {
        return ((BluetoothAdapter) this.b).isEnabled();
    }

    public t0a0 j(xxc xxcVar) {
        if (xxcVar != null) {
            wxc wxcVar = xxcVar.a;
            String str = wxcVar.e;
            if (!evu0.J(str)) {
                return new s0a0(((m7x0) ((k7x0) this.b)).a(str), new dyc(0));
            }
            if (wxcVar.b == PaymentMethod$Type.PERSONAL_WALLET) {
                return new n0a0(null, new yu0(5, new k0a0(IconType.PERSONAL_WALLET)));
            }
        }
        return o0a0.c;
    }

    public String k(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            mcx mcxVar = (mcx) this.b;
            zex zexVar = new zex(stringWriter, mcxVar.a, mcxVar.b, mcxVar.c, mcxVar.d);
            zexVar.g(obj);
            zexVar.i();
            zexVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x016b, code lost:
    
        if (r11 == 2) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0175, code lost:
    
        if (r9 == 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0181, code lost:
    
        if (r9 == 184) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0129, code lost:
    
        if (r9 != 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012f, code lost:
    
        if (r9 != 2) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013b, code lost:
    
        if (r11 != 19) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0145, code lost:
    
        if (r9 != 100) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x014f, code lost:
    
        if (r9 != 113) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0153, code lost:
    
        if (r10 < 240) goto L107;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] l(long j, int i, String str) {
        byte[] bArr;
        int i2;
        tgz tgzVar = (tgz) this.b;
        r(j);
        URL url = new URL(str);
        String protocol = url.getProtocol();
        byte[] bArr2 = null;
        if (!"http".equalsIgnoreCase(protocol) && !Constants.SCHEME.equalsIgnoreCase(protocol)) {
            new StringBuilder("Refusing AIA fetch over non-HTTP scheme from ").append(str);
            tgzVar.getClass();
            return null;
        }
        r(j);
        boolean equalsIgnoreCase = Constants.SCHEME.equalsIgnoreCase(url.getProtocol());
        int port = url.getPort() != -1 ? url.getPort() : equalsIgnoreCase ? 443 : 80;
        String file = url.getFile();
        if (file.isEmpty()) {
            file = "/";
        }
        String host = url.getHost();
        int i3 = 0;
        while (true) {
            bArr = bArr2;
            if (i3 >= host.length()) {
                for (int i4 = 0; i4 < file.length(); i4++) {
                    char charAt = file.charAt(i4);
                    if (charAt > ' ' && charAt != 127) {
                    }
                }
                r(j);
                InetAddress byName = InetAddress.getByName(url.getHost());
                if (port == 80 || port == 443) {
                    byte[] address = byName.getAddress();
                    if (address.length != 4 || (address[0] & 255) != 100 || (i2 = address[1] & 255) < 64 || i2 > 127) {
                        byte[] address2 = byName.getAddress();
                        if (address2.length != 16 || (address2[0] & 254) != 252) {
                            byte[] address3 = byName.getAddress();
                            if (address3.length == 16) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < 10) {
                                        if (address3[i5] != 0) {
                                            break;
                                        }
                                        i5++;
                                    } else if ((address3[10] & 255) == 255 && (address3[11] & 255) == 255) {
                                        address3 = new byte[]{address3[12], address3[13], address3[14], address3[15]};
                                    }
                                }
                            }
                            if (address3.length == 4) {
                                int i6 = address3[0] & 255;
                                int i7 = address3[1] & 255;
                                int i8 = address3[2] & 255;
                                if (i6 != 0) {
                                    if (i6 == 192) {
                                        if (i7 == 0) {
                                        }
                                    }
                                    if (i6 == 192) {
                                        if (i7 == 0) {
                                        }
                                    }
                                    if (i6 == 198) {
                                        if (i7 != 18) {
                                        }
                                    }
                                    if (i6 == 198) {
                                        if (i7 == 51) {
                                        }
                                    }
                                    if (i6 == 203) {
                                        if (i7 == 0) {
                                        }
                                    }
                                }
                            } else {
                                if (address3.length == 16) {
                                    int i9 = address3[0] & 255;
                                    int i10 = address3[1] & 255;
                                    int i11 = address3[2] & 255;
                                    int i12 = address3[3] & 255;
                                    if (i9 == 32) {
                                    }
                                    if (i9 == 32) {
                                        if (i10 == 1) {
                                            if (i11 == 0) {
                                            }
                                        }
                                    }
                                    if (i9 == 32) {
                                        if (i10 == 1) {
                                            if (i11 == 13) {
                                            }
                                        }
                                    }
                                }
                                if (!byName.isLoopbackAddress() && !byName.isAnyLocalAddress() && !byName.isLinkLocalAddress() && !byName.isSiteLocalAddress() && !byName.isMulticastAddress()) {
                                    Socket socket = new Socket();
                                    try {
                                        socket.connect(new InetSocketAddress(byName, port), s(j));
                                        socket.setSoTimeout(s(j));
                                        Socket createSocket = equalsIgnoreCase ? kp50.y().createSocket(socket, url.getHost(), port, true) : socket;
                                        OutputStream outputStream = createSocket.getOutputStream();
                                        outputStream.write(("GET " + file + " HTTP/1.1\r\nHost: " + url.getHost() + "\r\nConnection: close\r\nAccept: */*\r\n\r\n").getBytes(StandardCharsets.US_ASCII));
                                        outputStream.flush();
                                        suu o = o(createSocket, j);
                                        String str2 = (String) o.c;
                                        int i13 = o.b;
                                        socket.close();
                                        if (i13 >= 300 && i13 < 400 && str2 != null) {
                                            if (i > 0) {
                                                return l(j, i - 1, new URL(url, str2).toString());
                                            }
                                            new StringBuilder("Too many redirects fetching AIA cert from ").append(str);
                                            tgzVar.getClass();
                                            return bArr;
                                        }
                                        if (i13 == 200) {
                                            return (byte[]) o.d;
                                        }
                                        StringBuilder sb = new StringBuilder("AIA fetch returned HTTP ");
                                        sb.append(i13);
                                        sb.append(" from ");
                                        sb.append(str);
                                        tgzVar.getClass();
                                        return bArr;
                                    } finally {
                                    }
                                }
                            }
                        }
                    }
                }
                StringBuilder sb2 = new StringBuilder("Refusing AIA fetch to disallowed destination ");
                sb2.append(url.getHost());
                sb2.append(":");
                sb2.append(port);
                tgzVar.getClass();
                ny61.v("AIA destination not allowed");
                return bArr;
            }
            char charAt2 = host.charAt(i3);
            if (charAt2 <= ' ' || charAt2 == 127) {
                break;
            }
            i3++;
            bArr2 = bArr;
        }
        ny61.v("Illegal characters in AIA URL");
        return bArr;
    }

    public void m(a aVar, Thread thread, Throwable th) {
        Task i;
        com.google.firebase.crashlytics.internal.common.a aVar2 = (com.google.firebase.crashlytics.internal.common.a) this.b;
        synchronized (aVar2) {
            thread.getName();
            Log.isLoggable("FirebaseCrashlytics", 3);
            ctb1.c();
            long currentTimeMillis = System.currentTimeMillis();
            k3f k3fVar = aVar2.e.a;
            q2f q2fVar = new q2f(aVar2, currentTimeMillis, th, thread, aVar);
            synchronized (k3fVar.c) {
                i = ((Task) k3fVar.w).i((ExecutorService) k3fVar.b, new v8e(4, q2fVar));
                k3fVar.w = i;
            }
            try {
                try {
                    ax21.a(i);
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public void q(boolean z) {
        t61 t61Var = (t61) this.b;
        t61Var.getClass();
        HashMap hashMap = new HashMap();
        t61Var.a.a("WebViewChat.CameraPermission", hashMap, 1, x4e.r(z, hashMap, "granted"));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public vit(rqo rqoVar) {
        this.a = 27;
        this.b = ((jbh) rqoVar).e(uk00.e);
    }

    public vit(gqq gqqVar, k6x k6xVar) {
        this.a = 16;
        this.b = k6xVar;
    }

    public vit(dne0 dne0Var) {
        this.a = 7;
        this.b = dne0Var.a("prefs_mobile_ads_bidder_token");
    }

    public vit(hxk hxkVar) {
        this.a = 17;
        this.b = hxkVar.a.b();
    }

    public vit(qh41 qh41Var) {
        this.a = 6;
        Collections.synchronizedList(new ArrayList());
    }

    public vit(hzk hzkVar) {
        PayEvgenDiagnosticPlatform payEvgenDiagnosticPlatform;
        this.a = 18;
        int i = who.a[((PlusPayPlatform) hzkVar.a).ordinal()];
        if (i == 1) {
            payEvgenDiagnosticPlatform = PayEvgenDiagnosticPlatform.Android;
        } else if (i == 2) {
            payEvgenDiagnosticPlatform = PayEvgenDiagnosticPlatform.AndroidTv;
        } else {
            w511.b();
            throw null;
        }
        this.b = new gko(payEvgenDiagnosticPlatform);
    }

    public vit() {
        this.a = 0;
        this.b = new HashSet();
    }

    public /* synthetic */ vit(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
