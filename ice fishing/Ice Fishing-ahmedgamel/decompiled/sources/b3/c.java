package b3;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes2.dex */
public final class c implements IInterface {

    /* renamed from: n, reason: collision with root package name */
    public final IBinder f5553n;

    public c(IBinder iBinder) {
        this.f5553n = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f5553n;
    }
}
