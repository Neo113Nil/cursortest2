package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class llx implements IInterface {
    public final IBinder a;
    public final String h;

    public llx(IBinder iBinder, String str) {
        this.a = iBinder;
        this.h = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
