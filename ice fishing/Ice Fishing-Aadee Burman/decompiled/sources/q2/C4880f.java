package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC3359ie;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C3305he;
import com.google.android.gms.internal.ads.InterfaceC3411je;
import java.util.Objects;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4880f extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40128b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40129c;

    public C4880f(C4896n c4896n, Context context, BinderC3464kd binderC3464kd) {
        this.f40128b = context;
        this.f40129c = binderC3464kd;
        Objects.requireNonNull(c4896n);
    }

    @Override // q2.AbstractC4898o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        IInterface c3305he;
        Context context = this.f40128b;
        W2.b bVar = new W2.b(context);
        try {
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = AbstractBinderC3359ie.f31060n;
                if (b9 == null) {
                    c3305he = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    c3305he = queryLocalInterface instanceof InterfaceC3411je ? (InterfaceC3411je) queryLocalInterface : new C3305he(b9, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 2);
                }
                return ((C3305he) c3305he).t1(bVar, this.f40129c);
            } catch (RemoteException | NullPointerException | v2.j unused) {
                return null;
            }
        } catch (Exception e9) {
            throw new v2.j(e9);
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.u0(new W2.b(this.f40128b), this.f40129c, ModuleDescriptor.MODULE_VERSION);
    }
}
