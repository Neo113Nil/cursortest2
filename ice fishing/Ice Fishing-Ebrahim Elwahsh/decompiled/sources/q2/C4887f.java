package q2;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC3210fe;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C3155ee;
import com.google.android.gms.internal.ads.InterfaceC3264ge;
import java.util.Objects;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4887f extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40039b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40040c;

    public C4887f(C4903n c4903n, Context context, BinderC3317hd binderC3317hd) {
        this.f40039b = context;
        this.f40040c = binderC3317hd;
        Objects.requireNonNull(c4903n);
    }

    @Override // q2.AbstractC4905o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        IInterface c3155ee;
        Context context = this.f40039b;
        V2.b bVar = new V2.b(context);
        try {
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = AbstractBinderC3210fe.f30737n;
                if (b9 == null) {
                    c3155ee = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    c3155ee = queryLocalInterface instanceof InterfaceC3264ge ? (InterfaceC3264ge) queryLocalInterface : new C3155ee(b9, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 2);
                }
                return ((C3155ee) c3155ee).R0(bVar, this.f40040c);
            } catch (RemoteException | NullPointerException | u2.j unused) {
                return null;
            }
        } catch (Exception e6) {
            throw new u2.j(e6);
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.W0(new V2.b(this.f40039b), this.f40040c, 261710000);
    }
}
