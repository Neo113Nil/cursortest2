package defpackage;

import android.util.Log;
import com.connectsdk.service.NetcastTVService;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.KotlinVersion;

/* loaded from: classes3.dex */
public final class scv {
    public static final List v = Arrays.asList(0, 1, 2, 8, 9, 10);
    public static final List w = Arrays.asList(0, 1, 2);
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final x0 t;
    public final /* synthetic */ rn5 u;
    public boolean a = false;
    public byte[] j = new byte[0];
    public byte[] k = new byte[0];
    public final ByteArrayOutputStream l = new ByteArrayOutputStream();
    public final Inflater m = new Inflater(true);
    public final byte[] n = new byte[4096];
    public final oxa o = new oxa(8, this);
    public final awc p = new awc(this);
    public final n7b q = new n7b(this);
    public final mka r = new mka(this);
    public final h4b s = new h4b(this);

    public scv(rn5 rn5Var, dt1 dt1Var) {
        this.u = rn5Var;
        x0 x0Var = new x0(4, (byte) 0);
        this.t = x0Var;
        dt1Var.c(x0Var);
        h();
    }

    public static void a(scv scvVar, byte b) {
        boolean z = (b & 64) == 64;
        boolean z2 = (b & 32) == 32;
        boolean z3 = (b & 16) == 16;
        if ((!scvVar.a && z) || z2 || z3) {
            throw new e8e("RSV not zero");
        }
        scvVar.c = (b & 128) == 128;
        int i = b & 15;
        scvVar.f = i;
        scvVar.e = z;
        scvVar.j = new byte[0];
        scvVar.k = new byte[0];
        if (!v.contains(Integer.valueOf(i))) {
            throw new e8e("Bad opcode");
        }
        if (!w.contains(Integer.valueOf(scvVar.f)) && !scvVar.c) {
            throw new e8e("Expected non-final packet");
        }
        scvVar.b = 1;
    }

    public static void b(scv scvVar) {
        rn5 rn5Var = scvVar.u;
        ByteArrayOutputStream byteArrayOutputStream = scvVar.l;
        byte[] bArr = scvVar.k;
        e(bArr, scvVar.j, 0);
        if (scvVar.e) {
            try {
                byte[] bArr2 = scvVar.n;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Inflater inflater = scvVar.m;
                inflater.setInput(bArr);
                while (!inflater.needsInput()) {
                    byteArrayOutputStream2.write(bArr2, 0, inflater.inflate(bArr2));
                }
                inflater.setInput(new byte[]{0, 0, -1, -1});
                while (!inflater.needsInput()) {
                    byteArrayOutputStream2.write(bArr2, 0, inflater.inflate(bArr2));
                }
                bArr = byteArrayOutputStream2.toByteArray();
            } catch (DataFormatException unused) {
                kac.f("Invalid deflated data");
                return;
            }
        }
        int i = scvVar.f;
        if (i == 0) {
            if (scvVar.i == 0) {
                throw new e8e("Mode was not set.");
            }
            byteArrayOutputStream.write(bArr);
            if (scvVar.c) {
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (scvVar.i == 1) {
                    scvVar.f(c(byteArray));
                } else {
                    scvVar.g(byteArray);
                }
                scvVar.i = 0;
                byteArrayOutputStream.reset();
                return;
            }
            return;
        }
        if (i == 1) {
            if (scvVar.c) {
                scvVar.f(c(bArr));
                return;
            } else {
                scvVar.i = 1;
                byteArrayOutputStream.write(bArr);
                return;
            }
        }
        if (i == 2) {
            if (scvVar.c) {
                scvVar.g(bArr);
                return;
            } else {
                scvVar.i = 2;
                byteArrayOutputStream.write(bArr);
                return;
            }
        }
        if (i == 8) {
            if (bArr.length >= 2) {
                byte b = bArr[0];
                byte b2 = bArr[1];
            }
            if (bArr.length > 2) {
                byte[] bArr3 = new byte[bArr.length - 2];
                System.arraycopy(bArr, 2, bArr3, 0, bArr.length - 2);
                c(bArr3);
            }
            ((dt1) rn5Var.c).close();
            return;
        }
        if (i != 9) {
            if (i == 10) {
                c(bArr);
            }
        } else {
            if (bArr.length > 125) {
                throw new e8e("Ping payload too large");
            }
            c(bArr);
            ((dj3) rn5Var.d).b(new om3(scvVar.d(10, bArr)), false);
        }
    }

    public static String c(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            b6e.q(e);
            return null;
        }
    }

    public static byte[] e(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length != 0) {
            for (int i2 = 0; i2 < bArr.length - i; i2++) {
                int i3 = i + i2;
                bArr[i3] = (byte) (bArr[i3] ^ bArr2[i2 % 4]);
            }
        }
        return bArr;
    }

    public final byte[] d(int i, byte[] bArr) {
        int length = bArr.length;
        int i2 = length <= 125 ? 2 : length <= 65535 ? 4 : 10;
        int i3 = i2 + 4;
        byte[] bArr2 = new byte[length + i3];
        bArr2[0] = (byte) (((byte) i) | Byte.MIN_VALUE);
        if (length <= 125) {
            bArr2[1] = (byte) (128 | length);
        } else if (length <= 65535) {
            bArr2[1] = (byte) 254;
            bArr2[2] = (byte) (length / 256);
            bArr2[3] = (byte) (length & KotlinVersion.MAX_COMPONENT_VALUE);
        } else {
            bArr2[1] = (byte) KotlinVersion.MAX_COMPONENT_VALUE;
            long j = length;
            bArr2[2] = (byte) ((j / 72057594037927936L) & 255);
            bArr2[3] = (byte) ((j / 281474976710656L) & 255);
            bArr2[4] = (byte) ((j / 1099511627776L) & 255);
            bArr2[5] = (byte) ((j / 4294967296L) & 255);
            bArr2[6] = (byte) ((j / 16777216) & 255);
            bArr2[7] = (byte) ((j / 65536) & 255);
            bArr2[8] = (byte) ((j / 256) & 255);
            bArr2[9] = (byte) (length & KotlinVersion.MAX_COMPONENT_VALUE);
        }
        System.arraycopy(bArr, 0, bArr2, i3, length);
        byte[] bArr3 = {(byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d), (byte) Math.floor(Math.random() * 256.0d)};
        System.arraycopy(bArr3, 0, bArr2, i2, 4);
        e(bArr2, bArr3, i3);
        return bArr2;
    }

    public final void f(String str) {
        ozw ozwVar = (ozw) this.u.g;
        if (ozwVar != null) {
            le3 le3Var = (le3) ozwVar.b;
            gw0 gw0Var = (gw0) le3Var.b;
            String str2 = (String) le3Var.a;
            gw0Var.l.getClass();
            gw0.p = new Date().getTime();
            try {
                Map O = u2x.O(str);
                if ("ms.channel.connect".equals((String) O.get(NetcastTVService.UDAP_API_EVENT))) {
                    gw0.a(gw0Var, O, str2);
                } else {
                    gw0Var.j(str2, O, null);
                }
            } catch (Exception e) {
                Log.e("Channel", "connect error: " + e.getMessage());
            }
        }
    }

    public final void finalize() {
        Inflater inflater = this.m;
        if (inflater != null) {
            try {
                inflater.end();
            } catch (Exception e) {
                Log.e("HybiParser", "inflater.end failed", e);
            }
        }
        super.finalize();
    }

    public final void g(byte[] bArr) {
        LinkedList linkedList;
        om3 om3Var = new om3(bArr);
        rn5 rn5Var = this.u;
        if (((LinkedList) rn5Var.b) == null) {
            v7g.s(rn5Var, om3Var);
            if (om3Var.c > 0) {
                LinkedList linkedList2 = new LinkedList();
                rn5Var.b = linkedList2;
                linkedList2.add(om3Var);
                return;
            }
            return;
        }
        while (true) {
            boolean g = ((dt1) rn5Var.c).g();
            linkedList = (LinkedList) rn5Var.b;
            if (g) {
                break;
            }
            om3 om3Var2 = (om3) linkedList.remove();
            v7g.s(rn5Var, om3Var2);
            if (om3Var2.c > 0) {
                ((LinkedList) rn5Var.b).add(0, om3Var2);
            }
        }
        if (linkedList.size() == 0) {
            rn5Var.b = null;
        }
    }

    public final void h() {
        int i = this.b;
        x0 x0Var = this.t;
        if (i == 0) {
            x0Var.W(1, this.o);
            return;
        }
        if (i == 1) {
            x0Var.W(1, this.p);
            return;
        }
        if (i == 2) {
            x0Var.W(this.g, this.q);
        } else if (i == 3) {
            x0Var.W(4, this.r);
        } else {
            if (i != 4) {
                return;
            }
            x0Var.W(this.h, this.s);
        }
    }
}
