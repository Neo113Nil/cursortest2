package y0;

import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public abstract class a implements IInterface {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f8598a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8599b;

    public a(IBinder iBinder, String str) {
        this.f8598a = iBinder;
        this.f8599b = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f8598a;
    }
}
