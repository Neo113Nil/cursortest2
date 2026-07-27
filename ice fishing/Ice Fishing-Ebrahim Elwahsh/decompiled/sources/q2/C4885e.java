package q2;

import a.AbstractC0415a;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.AbstractBinderC2756Rf;
import com.google.android.gms.internal.ads.BinderC3317hd;
import com.google.android.gms.internal.ads.C2739Qf;
import com.google.android.gms.internal.ads.InterfaceC2773Sf;
import java.util.Objects;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4885e extends AbstractC4905o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3317hd f40037c;

    public C4885e(C4903n c4903n, Context context, BinderC3317hd binderC3317hd) {
        this.f40036b = context;
        this.f40037c = binderC3317hd;
        Objects.requireNonNull(c4903n);
    }

    @Override // q2.AbstractC4905o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q2.AbstractC4905o
    public final Object b() {
        InterfaceC2773Sf c2739Qf;
        Context context = this.f40036b;
        V2.b bVar = new V2.b(context);
        try {
            try {
                IBinder b9 = AbstractC0415a.I(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = AbstractBinderC2756Rf.f27391n;
                if (b9 == null) {
                    c2739Qf = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    c2739Qf = queryLocalInterface instanceof InterfaceC2773Sf ? (InterfaceC2773Sf) queryLocalInterface : new C2739Qf(b9, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 2);
                }
                return ((C2739Qf) c2739Qf).R0(bVar, this.f40037c);
            } catch (RemoteException | NullPointerException | u2.j unused) {
                return null;
            }
        } catch (Exception e6) {
            throw new u2.j(e6);
        }
    }

    @Override // q2.AbstractC4905o
    public final Object c(X x3) {
        return x3.f3(new V2.b(this.f40036b), this.f40037c, 261710000);
    }
}
