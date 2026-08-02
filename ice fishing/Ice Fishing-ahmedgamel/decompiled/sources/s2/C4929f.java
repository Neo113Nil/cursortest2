package s2;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.AbstractBinderC3382ie;
import com.google.android.gms.internal.ads.BinderC3487kd;
import com.google.android.gms.internal.ads.C3328he;
import com.google.android.gms.internal.ads.InterfaceC3434je;
import java.util.Objects;

/* renamed from: s2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4929f extends AbstractC4947o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f40430b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BinderC3487kd f40431c;

    public C4929f(C4945n c4945n, Context context, BinderC3487kd binderC3487kd) {
        this.f40430b = context;
        this.f40431c = binderC3487kd;
        Objects.requireNonNull(c4945n);
    }

    @Override // s2.AbstractC4947o
    public final /* bridge */ /* synthetic */ Object a() {
        return null;
    }

    @Override // s2.AbstractC4947o
    public final Object b() {
        IInterface c3328he;
        Context context = this.f40430b;
        Y2.b bVar = new Y2.b(context);
        try {
            try {
                IBinder b9 = com.bumptech.glide.e.y(context).b("com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl");
                int i = AbstractBinderC3382ie.f31831n;
                if (b9 == null) {
                    c3328he = null;
                } else {
                    IInterface queryLocalInterface = b9.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
                    c3328he = queryLocalInterface instanceof InterfaceC3434je ? (InterfaceC3434je) queryLocalInterface : new C3328he(b9, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator", 1);
                }
                return ((C3328he) c3328he).r1(bVar, this.f40431c);
            } catch (RemoteException | NullPointerException | x2.j unused) {
                return null;
            }
        } catch (Exception e9) {
            throw new x2.j(e9);
        }
    }

    @Override // s2.AbstractC4947o
    public final Object c(X x9) {
        return x9.f2(new Y2.b(this.f40430b), this.f40431c, ModuleDescriptor.MODULE_VERSION);
    }
}
