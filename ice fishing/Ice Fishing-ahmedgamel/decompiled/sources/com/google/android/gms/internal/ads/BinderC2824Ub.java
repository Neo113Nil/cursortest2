package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC2824Ub extends AbstractBinderC3359i8 implements InterfaceC2705Nb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f28731n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f28732u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2824Ub(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f28731n = i;
        this.f28732u = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:6|(2:7|8)|9|(2:10|11)|12|(2:13|14)|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:6|(2:7|8)|9|10|11|12|(2:13|14)|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:6|(2:7|8)|9|10|11|12|13|14|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        x2.i.d("Exception occurred while getting video controller", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        x2.i.d("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:
    
        x2.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008b, code lost:
    
        x2.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: RemoteException -> 0x00a8, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a8, blocks: (B:31:0x009d, B:33:0x00a3), top: B:30:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: RemoteException -> 0x00c5, TRY_LEAVE, TryCatch #6 {RemoteException -> 0x00c5, blocks: (B:37:0x00b7, B:39:0x00bd), top: B:36:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2705Nb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B3(InterfaceC2756Qb interfaceC2756Qb) {
        String str;
        String str2;
        String str3;
        String str4;
        Double d9;
        Y2.a B3;
        double k9;
        switch (this.f28731n) {
            case 0:
                C3887s c3887s = new C3887s(interfaceC2756Qb);
                Y0.b bVar = (Y0.b) this.f28732u;
                bVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                aVar.f24325l = new Bundle();
                InterfaceC2756Qb interfaceC2756Qb2 = (InterfaceC2756Qb) c3887s.f34554u;
                Object obj = null;
                try {
                    str = interfaceC2756Qb2.d();
                } catch (RemoteException e9) {
                    x2.i.d("", e9);
                    str = null;
                }
                aVar.f24315a = str;
                aVar.f24316b = (ArrayList) c3887s.f34555v;
                try {
                    str2 = interfaceC2756Qb2.h();
                } catch (RemoteException e10) {
                    x2.i.d("", e10);
                    str2 = null;
                }
                aVar.f24317c = str2;
                aVar.f24318d = (C3916sb) c3887s.f34556w;
                try {
                    str3 = interfaceC2756Qb2.n();
                } catch (RemoteException e11) {
                    x2.i.d("", e11);
                    str3 = null;
                }
                aVar.f24319e = str3;
                try {
                    str4 = interfaceC2756Qb2.j();
                } catch (RemoteException e12) {
                    x2.i.d("", e12);
                    str4 = null;
                }
                aVar.f24320f = str4;
                try {
                    k9 = interfaceC2756Qb2.k();
                } catch (RemoteException e13) {
                    x2.i.d("", e13);
                }
                try {
                    if (k9 != -1.0d) {
                        d9 = Double.valueOf(k9);
                        aVar.f24321g = d9;
                        String str5 = interfaceC2756Qb2.l();
                        aVar.f24322h = str5;
                        String str6 = interfaceC2756Qb2.q();
                        aVar.i = str6;
                        B3 = interfaceC2756Qb2.B();
                        if (B3 != null) {
                            obj = Y2.b.D0(B3);
                        }
                        aVar.f24324k = obj;
                        aVar.f24326m = true;
                        aVar.f24327n = true;
                        m2.v vVar = (m2.v) c3887s.f34557x;
                        if (interfaceC2756Qb2.p() != null) {
                            vVar.b(interfaceC2756Qb2.p());
                        }
                        aVar.f24323j = vVar;
                        C4297ze c4297ze = (C4297ze) ((z2.l) bVar.f3828v);
                        c4297ze.getClass();
                        R2.w.d("#008 Must be called on the main UI thread.");
                        x2.i.a("Adapter called onAdLoaded.");
                        c4297ze.f36134v = aVar;
                        if (!(((AbstractAdViewAdapter) bVar.f3827u) instanceof AdMobAdapter)) {
                            new m2.v().b(new BinderC4188xd());
                        }
                        ((InterfaceC3864rd) c4297ze.f36133u).j();
                        break;
                    }
                    ((InterfaceC3864rd) c4297ze.f36133u).j();
                } catch (RemoteException e14) {
                    x2.i.i("#007 Could not call remote method.", e14);
                    return;
                }
                d9 = null;
                aVar.f24321g = d9;
                String str52 = interfaceC2756Qb2.l();
                aVar.f24322h = str52;
                String str62 = interfaceC2756Qb2.q();
                aVar.i = str62;
                B3 = interfaceC2756Qb2.B();
                if (B3 != null) {
                }
                aVar.f24324k = obj;
                aVar.f24326m = true;
                aVar.f24327n = true;
                m2.v vVar2 = (m2.v) c3887s.f34557x;
                if (interfaceC2756Qb2.p() != null) {
                }
                aVar.f24323j = vVar2;
                C4297ze c4297ze2 = (C4297ze) ((z2.l) bVar.f3828v);
                c4297ze2.getClass();
                R2.w.d("#008 Must be called on the main UI thread.");
                x2.i.a("Adapter called onAdLoaded.");
                c4297ze2.f36134v = aVar;
                if (!(((AbstractAdViewAdapter) bVar.f3827u) instanceof AdMobAdapter)) {
                }
            default:
                ((C2.b) this.f28732u).onNativeAdLoaded(new C3166ee(interfaceC2756Qb));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3359i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2756Qb c2739Pb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c2739Pb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c2739Pb = queryLocalInterface instanceof InterfaceC2756Qb ? (InterfaceC2756Qb) queryLocalInterface : new C2739Pb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 1);
        }
        AbstractC3411j8.f(parcel);
        B3(c2739Pb);
        parcel2.writeNoException();
        return true;
    }
}
