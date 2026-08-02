package defpackage;

import java.io.File;

/* loaded from: classes.dex */
public final class uit implements kci {
    public static final uit b = new uit(0);
    public final /* synthetic */ int a;

    public /* synthetic */ uit(int i) {
        this.a = i;
    }

    @Override // defpackage.kci
    public final jci a(Object obj, int i, int i2, pwj pwjVar) {
        switch (this.a) {
            case 0:
                return new jci(new vhj(obj), new mm3(1, obj));
            case 1:
                File file = (File) obj;
                return new jci(new vhj(file), new mm3(0, file));
            default:
                return null;
        }
    }

    @Override // defpackage.kci
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }
}
