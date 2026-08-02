package defpackage;

import android.os.Handler;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ajo implements jgg {
    public final DataInputStream a;
    public final wx0 b = new wx0(4);
    public volatile boolean c;
    public final /* synthetic */ bjo d;

    public ajo(bjo bjoVar, InputStream inputStream) {
        this.d = bjoVar;
        this.a = new DataInputStream(inputStream);
    }

    @Override // defpackage.jgg
    public final void a() {
        String str;
        while (!this.c) {
            byte readByte = this.a.readByte();
            if (readByte == 36) {
                int readUnsignedByte = this.a.readUnsignedByte();
                int readUnsignedShort = this.a.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort];
                this.a.readFully(bArr, 0, readUnsignedShort);
                v6t v6tVar = (v6t) this.d.c.get(Integer.valueOf(readUnsignedByte));
                if (v6tVar != null && !this.d.f) {
                    v6tVar.e.add(bArr);
                }
            } else if (this.d.f) {
                continue;
            } else {
                atn atnVar = this.d.a;
                wx0 wx0Var = this.b;
                DataInputStream dataInputStream = this.a;
                wx0Var.getClass();
                yde a = wx0Var.a(wx0.c(readByte, dataInputStream));
                while (a == null) {
                    if (wx0Var.a == 3) {
                        long j = wx0Var.b;
                        if (j <= 0) {
                            xq0.q("Expects a greater than zero Content-Length.");
                            return;
                        }
                        int s = zc4.s(j);
                        vq1.A(s != -1);
                        byte[] bArr2 = new byte[s];
                        dataInputStream.readFully(bArr2, 0, s);
                        ArrayList arrayList = (ArrayList) wx0Var.c;
                        vq1.A(wx0Var.a == 3);
                        if (s > 0) {
                            int i = s - 1;
                            if (bArr2[i] == 10) {
                                if (s > 1) {
                                    int i2 = s - 2;
                                    if (bArr2[i2] == 13) {
                                        str = new String(bArr2, 0, i2, bjo.g);
                                        arrayList.add(str);
                                        a = yde.v(arrayList);
                                        ((ArrayList) wx0Var.c).clear();
                                        wx0Var.a = 1;
                                        wx0Var.b = 0L;
                                    }
                                }
                                str = new String(bArr2, 0, i, bjo.g);
                                arrayList.add(str);
                                a = yde.v(arrayList);
                                ((ArrayList) wx0Var.c).clear();
                                wx0Var.a = 1;
                                wx0Var.b = 0L;
                            }
                        }
                        xq0.x("Message body is empty or does not end with a LF.");
                        return;
                    }
                    a = wx0Var.a(wx0.c(dataInputStream.readByte(), dataInputStream));
                }
                ((Handler) atnVar.b).post(new zvh(21, atnVar, a));
            }
        }
    }

    @Override // defpackage.jgg
    public final void f() {
        this.c = true;
    }
}
