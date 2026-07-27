package q2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC2806Uf;
import com.google.android.gms.internal.ads.BinderC3464kd;
import com.google.android.gms.internal.ads.C2790Tf;
import com.google.android.gms.internal.ads.InterfaceC2822Vf;
import java.util.Objects;

/* renamed from: q2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4878e extends AbstractC4898o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3464kd f40126c;

    public C4878e(C4896n c4896n, Context context, BinderC3464kd binderC3464kd) {
        this.f40125b = context;
        this.f40126c = binderC3464kd;
        Objects.requireNonNull(c4896n);
    }

    @Override // q2.AbstractC4898o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // q2.AbstractC4898o
    public final Object b() {
        IInterface c2790Tf;
        Context context = this.f40125b;
        W2.b bVar = new W2.b(context);
        try {
            try {
                IBinder b9 = com.bumptech.glide.f.D(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = AbstractBinderC2806Uf.f27946n;
                if (b9 == null) {
                    c2790Tf = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    c2790Tf = queryLocalInterface instanceof InterfaceC2822Vf ? (InterfaceC2822Vf) queryLocalInterface : new C2790Tf(b9, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 2);
                }
                return ((C2790Tf) c2790Tf).t1(bVar, this.f40126c);
            } catch (RemoteException | NullPointerException | v2.j unused) {
                return null;
            }
        } catch (Exception e9) {
            throw new v2.j(e9);
        }
    }

    @Override // q2.AbstractC4898o
    public final Object c(X x9) {
        return x9.C3(new W2.b(this.f40125b), this.f40126c, ModuleDescriptor.MODULE_VERSION);
    }
}
