package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class dm3 implements kci {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dm3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        switch (this.a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new jci(new vhj(bArr), new pwh(1, bArr, (cm3) this.b));
            case 1:
                return new jci(new vhj(obj), new pwh(obj.toString(), (d51) this.b));
            default:
                File file = (File) obj;
                return new jci(new vhj(file), new cac(0, file, (dac) this.b));
        }
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }
}
