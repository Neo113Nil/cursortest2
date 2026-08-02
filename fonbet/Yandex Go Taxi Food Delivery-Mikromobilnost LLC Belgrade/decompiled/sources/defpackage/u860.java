package defpackage;

import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.Command;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.EmvCardScheme;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.enums.SwEnum;
import com.yandex.payment.sdk.nfcscanner.tools.ownimpl.exceptions.TlvException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes2.dex */
public final class u860 {
    public static final byte[] e;
    public static final Pattern f;
    public final h2t a;
    public final x760 b;
    public final kjz0 c = new kjz0();
    public final uxn d = new uxn();

    static {
        Charset charset = uza.a;
        e = "2PAY.SYS.DDF01".getBytes(charset);
        "1PAY.SYS.DDF01".getBytes(charset);
        f = Pattern.compile("([0-9]{1,19})D([0-9]{4})([0-9]{3})?(.*)");
    }

    public u860(h2t h2tVar, x760 x760Var) {
        this.a = h2tVar;
        this.b = x760Var;
    }

    public final pc8 a(byte[] bArr) {
        la60[] la60VarArr = {sxn.d, sxn.s};
        this.c.getClass();
        Matcher matcher = f.matcher(cdb1.c("%02x", kjz0.b(bArr, la60VarArr)));
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
        return new pc8(group, g8e.p(substring, "/", substring2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003b, code lost:
    
        if (defpackage.una1.b(r13, r1) == false) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final pc8 b(byte[] bArr) {
        byte[] b;
        pc8 a;
        byte[] a2 = new hb(Command.SELECT, bArr).a();
        h2t h2tVar = this.a;
        byte[] m = h2tVar.m(a2);
        SwEnum swEnum = SwEnum.SW_9000;
        if (una1.b(m, swEnum)) {
            la60[] la60VarArr = {sxn.p};
            this.c.getClass();
            byte[] d = d(kjz0.b(m, la60VarArr), h2tVar);
            if (!una1.b(d, swEnum)) {
                d = d(null, h2tVar);
            }
            byte[] b2 = kjz0.b(d, sxn.e);
            if (b2 != null) {
                int length = b2.length;
                if (length > b2.length) {
                    length = b2.length;
                }
                int i = length - 2;
                if (i <= 0) {
                    b = i470.a;
                } else {
                    byte[] bArr2 = new byte[i];
                    System.arraycopy(b2, 2, bArr2, 0, i);
                    b = bArr2;
                }
            } else {
                pc8 a3 = a(d);
                if (a3 != null) {
                    return a3;
                }
                b = kjz0.b(d, sxn.g);
            }
            ArrayList arrayList = new ArrayList();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(b);
            while (byteArrayInputStream.available() >= 4) {
                wi1 wi1Var = new wi1();
                wi1Var.a = byteArrayInputStream.read() >> 3;
                wi1Var.b = byteArrayInputStream.read();
                wi1Var.c = byteArrayInputStream.read();
                byteArrayInputStream.read();
                arrayList.add(wi1Var);
            }
            ((y22) this.b.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получены данные карты по NFC", "nfc_data_received"));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                wi1 wi1Var2 = (wi1) it.next();
                int i2 = wi1Var2.b;
                int i3 = wi1Var2.c;
                if (i2 <= i3) {
                    while (true) {
                        Command command = Command.READ_RECORD;
                        byte[] m2 = h2tVar.m(new hb(command, i2, (wi1Var2.a << 3) | 4, 0).a());
                        if (una1.b(m2, SwEnum.SW_6C)) {
                            m2 = h2tVar.m(new hb(command, i2, (wi1Var2.a << 3) | 4, m2[m2.length - 1]).a());
                        }
                        if (una1.b(m2, SwEnum.SW_9000) && (a = a(m2)) != null) {
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
        la60[] la60VarArr = {sxn.b, sxn.t};
        this.c.getClass();
        Iterator it = kjz0.c(bArr, la60VarArr).iterator();
        while (it.hasNext()) {
            p6x0 p6x0Var = (p6x0) it.next();
            la60 la60Var = p6x0Var.a;
            byte[] bArr2 = p6x0Var.d;
            if (!la60Var.equals(sxn.t) || arrayList.size() == 0) {
                arrayList.add(bArr2);
            } else {
                byte[] bArr3 = (byte[]) unr0.k(1, arrayList);
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
                Object[] objArr = (Object[]) Array.newInstance(componentType, copyOf.length + length);
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
                    yci0.p(b64.l("Cannot store ", componentType2.getName(), " in an array of ", componentType.getName()), e2);
                    return null;
                }
            }
        }
        return arrayList;
    }

    public final byte[] d(byte[] bArr, h2t h2tVar) {
        this.c.getClass();
        ArrayList arrayList = new ArrayList();
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            while (byteArrayInputStream.available() > 0) {
                if (byteArrayInputStream.available() < 2) {
                    throw new TlvException(oyr.i(byteArrayInputStream.available(), "Data length < 2 : "));
                }
                arrayList.add(new n6x0(kjz0.f(kjz0.d(byteArrayInputStream)), kjz0.e(byteArrayInputStream)));
            }
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(sxn.f.a);
            Iterator it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += ((n6x0) it.next()).b;
            }
            byteArrayOutputStream.write(i);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                byteArrayOutputStream.write(this.d.a((n6x0) it2.next()));
            }
        } catch (Throwable unused) {
        }
        return h2tVar.m(new hb(Command.GPO, byteArrayOutputStream.toByteArray()).a());
    }

    public final byte[] e(byte[] bArr) {
        la60[] la60VarArr = {sxn.c};
        this.c.getClass();
        byte[] b = kjz0.b(bArr, la60VarArr);
        if (b == null) {
            return bArr;
        }
        int b2 = cdb1.b(b);
        Command command = Command.READ_RECORD;
        int i = (b2 << 3) | 4;
        byte[] a = new hb(command, b2, i, 0).a();
        h2t h2tVar = this.a;
        byte[] m = h2tVar.m(a);
        return una1.b(m, SwEnum.SW_6C) ? h2tVar.m(new hb(command, b2, i, m[m.length - 1]).a()) : m;
    }

    public final pc8 f() {
        pc8 pc8Var;
        pc8 pc8Var2 = null;
        try {
            byte[] g = g();
            SwEnum swEnum = SwEnum.SW_9000;
            if (una1.b(g, swEnum)) {
                byte[] e2 = e(g);
                if (una1.b(e2, swEnum)) {
                    Iterator it = c(e2).iterator();
                    while (it.hasNext()) {
                        try {
                            pc8Var = b((byte[]) it.next());
                        } catch (Throwable unused) {
                        }
                        if (pc8Var != null) {
                            break;
                        }
                    }
                }
            }
        } catch (Throwable unused2) {
        }
        pc8Var = null;
        if (pc8Var != null) {
            return pc8Var;
        }
        EmvCardScheme[] values = EmvCardScheme.values();
        int length = values.length;
        int i = 0;
        loop1: while (true) {
            if (i >= length) {
                break;
            }
            Iterator it2 = ((ArrayList) j73.A(values[i].getAidByte())).iterator();
            while (it2.hasNext()) {
                pc8 b = b((byte[]) it2.next());
                if (b != null) {
                    pc8Var2 = b;
                    break loop1;
                }
            }
            i++;
        }
        return pc8Var2;
    }

    public final byte[] g() {
        ((y22) this.b.getEventReporter()).a(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Обращение к NFC", "nfc_accessed"));
        return this.a.m(new hb(Command.SELECT, e).a());
    }
}
