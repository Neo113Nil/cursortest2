package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class wx0 {
    public int a;
    public long b;
    public Object c;

    public wx0(int i) {
        int i2 = 1;
        switch (i) {
            case 4:
                this.c = new ArrayList();
                this.a = 1;
                break;
            case 5:
            default:
                if (ybl.a == null) {
                    Pattern pattern = ovt.b;
                    ybl.a = new ybl();
                }
                ybl yblVar = ybl.a;
                if (ovt.c == null) {
                    ovt.c = new ovt(yblVar);
                }
                this.c = ovt.c;
                break;
            case 6:
                ikc ikcVar = new ikc(i2, 10, null);
                this.b = 10000L;
                this.c = ikcVar;
                this.a = 1;
                break;
        }
    }

    public static byte[] c(byte b, DataInputStream dataInputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = {b, dataInputStream.readByte()};
        byteArrayOutputStream.write(bArr);
        while (true) {
            if (bArr[0] == 13 && bArr[1] == 10) {
                return byteArrayOutputStream.toByteArray();
            }
            bArr[0] = bArr[1];
            byte readByte = dataInputStream.readByte();
            bArr[1] = readByte;
            byteArrayOutputStream.write(readByte);
        }
    }

    public yde a(byte[] bArr) {
        long j;
        ArrayList arrayList = (ArrayList) this.c;
        vq1.v(bArr.length >= 2 && bArr[bArr.length - 2] == 13 && bArr[bArr.length - 1] == 10);
        String str = new String(bArr, 0, bArr.length - 2, bjo.g);
        arrayList.add(str);
        int i = this.a;
        if (i == 1) {
            if (!cjo.a.matcher(str).matches() && !cjo.b.matcher(str).matches()) {
                return null;
            }
            this.a = 2;
            return null;
        }
        if (i != 2) {
            e7o.n();
            return null;
        }
        try {
            Matcher matcher = cjo.c.matcher(str);
            if (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                j = Long.parseLong(group);
            } else {
                j = -1;
            }
            if (j != -1) {
                this.b = j;
            }
            if (!str.isEmpty()) {
                return null;
            }
            if (this.b > 0) {
                this.a = 3;
                return null;
            }
            yde v = yde.v(arrayList);
            arrayList.clear();
            this.a = 1;
            this.b = 0L;
            return v;
        } catch (NumberFormatException e) {
            throw r7k.b(str, e);
        }
    }

    public synchronized boolean b() {
        boolean z;
        if (this.a != 0) {
            ((ovt) this.c).a.getClass();
            z = System.currentTimeMillis() > this.b;
        }
        return z;
    }

    public synchronized void d(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.a = 0;
            }
            return;
        }
        this.a++;
        synchronized (this) {
            if (i != 429 && (i < 500 || i >= 600)) {
                min = 86400000;
                ((ovt) this.c).a.getClass();
                this.b = System.currentTimeMillis() + min;
            }
            double pow = Math.pow(2.0d, this.a);
            ((ovt) this.c).getClass();
            min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), 1800000L);
            ((ovt) this.c).a.getClass();
            this.b = System.currentTimeMillis() + min;
        }
        return;
    }

    public wx0(int i, URL url, long j) {
        this.a = i;
        this.c = url;
        this.b = j;
    }
}
