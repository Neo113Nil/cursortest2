package defpackage;

import com.connectsdk.service.DeviceService;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Charsets;

/* loaded from: classes4.dex */
public final class d6j {
    public static final byte[] d;
    public static final Pattern e;
    public final awc a;
    public final x5j b;
    public final ix6 c;

    static {
        Charset charset = Charsets.UTF_8;
        byte[] bytes = "2PAY.SYS.DDF01".getBytes(charset);
        bytes.getClass();
        d = bytes;
        "1PAY.SYS.DDF01".getBytes(charset).getClass();
        e = Pattern.compile("([0-9]{1,19})D([0-9]{4})([0-9]{3})?(.*)");
    }

    public d6j(awc awcVar, x5j x5jVar) {
        x5jVar.getClass();
        this.a = awcVar;
        this.b = x5jVar;
        this.c = new ix6();
    }

    public final bw3 a(byte[] bArr) {
        Matcher matcher = e.matcher(quj.L("%02x", dxl.c(bArr, t5b.d, t5b.s)));
        if (!matcher.find()) {
            return null;
        }
        String group = matcher.group(1);
        String group2 = matcher.group(2);
        String substring = group2 != null ? group2.substring(2, 4) : null;
        String group3 = matcher.group(2);
        String substring2 = group3 != null ? group3.substring(0, 2) : null;
        if (group == null || substring == null || substring2 == null) {
            return null;
        }
        return new bw3(group, ouj.o(substring, "/", substring2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (defpackage.wdg.S(r13, r1) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final bw3 b(byte[] bArr) {
        byte[] c;
        bw3 a;
        byte[] a2 = new x9(pb5.d, bArr).a();
        awc awcVar = this.a;
        byte[] H = awcVar.H(a2);
        lur lurVar = lur.SW_9000;
        if (wdg.S(H, lurVar)) {
            byte[] d2 = d(dxl.c(H, t5b.p), awcVar);
            if (!wdg.S(d2, lurVar)) {
                d2 = d(null, awcVar);
            }
            byte[] c2 = dxl.c(d2, t5b.e);
            if (c2 != null) {
                int length = c2.length;
                if (length > c2.length) {
                    length = c2.length;
                }
                int i = length - 2;
                if (i <= 0) {
                    c = sk3.a;
                } else {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(c2, 2, bArr2, 0, i);
                    c = bArr2;
                }
            } else {
                bw3 a3 = a(d2);
                if (a3 != null) {
                    return a3;
                }
                c = dxl.c(d2, t5b.g);
            }
            ArrayList arrayList = new ArrayList();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c);
            while (byteArrayInputStream.available() >= 4) {
                mp mpVar = new mp();
                mpVar.a = byteArrayInputStream.read() >> 3;
                mpVar.b = byteArrayInputStream.read();
                mpVar.c = byteArrayInputStream.read();
                byteArrayInputStream.read();
                arrayList.add(mpVar);
            }
            g0c eventReporter = this.b.getEventReporter();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            r1f r1fVar = r1f.a;
            vtm k = su4.k("Получены данные карты по NFC", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
            ci0 ci0Var = qjb.a;
            ci0Var.a = su4.g(1, ci0Var.a);
            k.u(qee.n() + ci0Var.a, "eventus_id");
            qne j = su4.j(k, "event_name", "nfc_data_received", "nfc_data_received", k);
            x60 x60Var = (x60) eventReporter;
            x60Var.getClass();
            x60Var.a(j);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mp mpVar2 = (mp) it.next();
                int i2 = mpVar2.b;
                int i3 = mpVar2.c;
                if (i2 <= i3) {
                    while (true) {
                        pb5 pb5Var = pb5.d;
                        byte[] H2 = awcVar.H(new x9(i2, (mpVar2.a << 3) | 4, 0).a());
                        if (wdg.S(H2, lur.SW_6C)) {
                            H2 = awcVar.H(new x9(i2, (mpVar2.a << 3) | 4, H2[H2.length - 1]).a());
                        }
                        if (wdg.S(H2, lur.SW_9000) && (a = a(H2)) != null) {
                            return a;
                        }
                        if (i2 != i3) {
                            i2++;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final ArrayList c(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        Iterator it = dxl.e(bArr, t5b.b, t5b.t).iterator();
        while (it.hasNext()) {
            g3s g3sVar = (g3s) it.next();
            k6j k6jVar = g3sVar.a;
            byte[] bArr2 = g3sVar.d;
            if (!k6jVar.equals(t5b.t) || arrayList.size() == 0) {
                arrayList.add(bArr2);
            } else {
                byte[] bArr3 = (byte[]) vz1.m(arrayList, 1);
                bArr3.getClass();
                int length = bArr3.length;
                Byte[] bArr4 = new Byte[length];
                int length2 = bArr3.length;
                for (int i = 0; i < length2; i++) {
                    bArr4[i] = Byte.valueOf(bArr3[i]);
                }
                int length3 = bArr2.length;
                Byte[] bArr5 = new Byte[length3];
                int length4 = bArr2.length;
                for (int i2 = 0; i2 < length4; i2++) {
                    bArr5[i2] = Byte.valueOf(bArr2[i2]);
                }
                Object[] copyOf = Arrays.copyOf(bArr5, length3);
                Class<?> componentType = bArr4.getClass().getComponentType();
                Object newInstance = Array.newInstance(componentType, copyOf.length + length);
                newInstance.getClass();
                Object[] objArr = (Object[]) newInstance;
                System.arraycopy(bArr4, 0, objArr, 0, length);
                try {
                    System.arraycopy(copyOf, 0, objArr, length, copyOf.length);
                    Byte[] bArr6 = (Byte[]) objArr;
                    int length5 = bArr6.length;
                    byte[] bArr7 = new byte[length5];
                    for (int i3 = 0; i3 < length5; i3++) {
                        bArr7[i3] = bArr6[i3].byteValue();
                    }
                    arrayList.add(bArr7);
                } catch (ArrayStoreException e2) {
                    Class<?> componentType2 = copyOf.getClass().getComponentType();
                    if (componentType.isAssignableFrom(componentType2)) {
                        throw e2;
                    }
                    throw new IllegalArgumentException(hrg.r("Cannot store ", componentType2.getName(), " in an array of ", componentType.getName()), e2);
                }
            }
        }
        return arrayList;
    }

    public final byte[] d(byte[] bArr, awc awcVar) {
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                if (byteArrayInputStream.available() < 2) {
                    throw new my1(k5r.i(byteArrayInputStream.available(), "Data length < 2 : "));
                }
                arrayList.add(new f3s(dxl.m(dxl.k(byteArrayInputStream)), dxl.l(byteArrayInputStream)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            r7o r7oVar = z7o.b;
            byteArrayOutputStream.write(t5b.f.a);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((f3s) it.next()).b;
            }
            byteArrayOutputStream.write(i);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(this.c.c((f3s) it2.next()));
            }
            r7o r7oVar2 = z7o.b;
        } catch (Throwable unused) {
            r7o r7oVar3 = z7o.b;
        }
        pb5 pb5Var = pb5.e;
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return awcVar.H(new x9(pb5Var, byteArray).a());
    }

    public final byte[] e(byte[] bArr) {
        byte[] c = dxl.c(bArr, t5b.c);
        if (c == null) {
            return bArr;
        }
        int D = quj.D(c);
        pb5 pb5Var = pb5.d;
        int i = (D << 3) | 4;
        byte[] a = new x9(D, i, 0).a();
        awc awcVar = this.a;
        byte[] H = awcVar.H(a);
        return wdg.S(H, lur.SW_6C) ? awcVar.H(new x9(D, i, H[H.length - 1]).a()) : H;
    }

    public final bw3 f() {
        bw3 bw3Var;
        bw3 bw3Var2 = null;
        try {
            r7o r7oVar = z7o.b;
            byte[] g = g();
            lur lurVar = lur.SW_9000;
            if (wdg.S(g, lurVar)) {
                byte[] e2 = e(g);
                if (wdg.S(e2, lurVar)) {
                    Iterator it = c(e2).iterator();
                    while (it.hasNext()) {
                        byte[] bArr = (byte[]) it.next();
                        try {
                            r7o r7oVar2 = z7o.b;
                            bw3Var = b(bArr);
                        } catch (Throwable unused) {
                            r7o r7oVar3 = z7o.b;
                        }
                        if (bw3Var != null) {
                            break;
                        }
                    }
                }
            }
            r7o r7oVar4 = z7o.b;
        } catch (Throwable unused2) {
            r7o r7oVar5 = z7o.b;
        }
        bw3Var = null;
        if (bw3Var != null) {
            return bw3Var;
        }
        s5b[] values = s5b.values();
        int length = values.length;
        int i = 0;
        loop1: while (true) {
            if (i >= length) {
                break;
            }
            Iterator it2 = ((ArrayList) xz0.w(values[i].a)).iterator();
            while (it2.hasNext()) {
                bw3 b = b((byte[]) it2.next());
                if (b != null) {
                    bw3Var2 = b;
                    break loop1;
                }
            }
            i++;
        }
        return bw3Var2;
    }

    public final byte[] g() {
        g0c eventReporter = this.b.getEventReporter();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        r1f r1fVar = r1f.a;
        vtm k = su4.k("Обращение к NFC", linkedHashMap, DeviceService.KEY_DESC, linkedHashMap);
        ci0 ci0Var = qjb.a;
        ci0Var.a = su4.g(1, ci0Var.a);
        k.u(qee.n() + ci0Var.a, "eventus_id");
        qne j = su4.j(k, "event_name", "nfc_accessed", "nfc_accessed", k);
        x60 x60Var = (x60) eventReporter;
        x60Var.getClass();
        x60Var.a(j);
        return this.a.H(new x9(pb5.d, d).a());
    }
}
