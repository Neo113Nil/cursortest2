package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC2828Uf;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C2811Tf;
import com.google.android.gms.internal.ads.InterfaceC2845Vf;
import java.util.Objects;

/* renamed from: s2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4927e extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40427b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40428c;

    public C4927e(C4945n c4945n, Context context, BinderC3487kd binderC3487kd) {
        this.f40427b = context;
        this.f40428c = binderC3487kd;
        Objects.requireNonNull(c4945n);
    }

    @Override // s2.AbstractC4947o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        IInterface c2811Tf;
        Context context = this.f40427b;
        Y2.b bVar = new Y2.b(context);
        try {
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl");
                int i = AbstractBinderC2828Uf.f28744n;
                if (b9 == null) {
                    c2811Tf = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
                    c2811Tf = queryLocalInterface instanceof InterfaceC2845Vf ? (InterfaceC2845Vf) queryLocalInterface : new C2811Tf(b9, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator", 1);
                }
                return ((C2811Tf) c2811Tf).r1(bVar, this.f40428c);
            } catch (RemoteException | NullPointerException | x2.j unused) {
                return null;
            }
        } catch (Exception e9) {
            throw new x2.j(e9);
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.K2(new Y2.b(this.f40427b), this.f40428c, ModuleDescriptor.MODULE_VERSION);
    }
}
