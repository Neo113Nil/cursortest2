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
public final class BinderC2802Ub extends AbstractBinderC3336i8 implements InterfaceC2685Nb {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f27933n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f27934u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC2802Ub(int i, Object obj) {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
        this.f27933n = i;
        this.f27934u = obj;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:6|(2:7|8)|9|(2:10|11)|12|(2:13|14)|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(32:6|(2:7|8)|9|10|11|12|(2:13|14)|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:6|(2:7|8)|9|10|11|12|13|14|15|(2:16|17)|18|19|20|(19:61|23|24|25|26|27|28|29|30|31|(1:33)|35|36|37|(1:39)|41|(1:43)|44|45)|22|23|24|25|26|27|28|29|30|31|(0)|35|36|37|(0)|41|(0)|44|45) */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c5, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c6, code lost:
    
        v2.i.d("Exception occurred while getting video controller", r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a9, code lost:
    
        v2.i.d("", r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0096, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0097, code lost:
    
        v2.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x008a, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x008b, code lost:
    
        v2.i.d("", r5);
        r5 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a3 A[Catch: RemoteException -> 0x00a8, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00a8, blocks: (B:31:0x009d, B:33:0x00a3), top: B:30:0x009d }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[Catch: RemoteException -> 0x00c5, TRY_LEAVE, TryCatch #6 {RemoteException -> 0x00c5, blocks: (B:37:0x00b7, B:39:0x00bd), top: B:36:0x00b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    @Override // com.google.android.gms.internal.ads.InterfaceC2685Nb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G3(InterfaceC2736Qb interfaceC2736Qb) {
        String str;
        String str2;
        String str3;
        String str4;
        Double d2;
        W2.a B9;
        double k9;
        switch (this.f27933n) {
            case 0:
                C3864s c3864s = new C3864s(interfaceC2736Qb);
                com.google.ads.mediation.e eVar = (com.google.ads.mediation.e) this.f27934u;
                eVar.getClass();
                com.google.ads.mediation.a aVar = new com.google.ads.mediation.a();
                aVar.f23540l = new Bundle();
                InterfaceC2736Qb interfaceC2736Qb2 = (InterfaceC2736Qb) c3864s.f33786u;
                Object obj = null;
                try {
                    str = interfaceC2736Qb2.d();
                } catch (RemoteException e9) {
                    v2.i.d("", e9);
                    str = null;
                }
                aVar.f23530a = str;
                aVar.f23531b = (ArrayList) c3864s.f33787v;
                try {
                    str2 = interfaceC2736Qb2.h();
                } catch (RemoteException e10) {
                    v2.i.d("", e10);
                    str2 = null;
                }
                aVar.f23532c = str2;
                aVar.f23533d = (C3893sb) c3864s.f33788w;
                try {
                    str3 = interfaceC2736Qb2.n();
                } catch (RemoteException e11) {
                    v2.i.d("", e11);
                    str3 = null;
                }
                aVar.f23534e = str3;
                try {
                    str4 = interfaceC2736Qb2.j();
                } catch (RemoteException e12) {
                    v2.i.d("", e12);
                    str4 = null;
                }
                aVar.f23535f = str4;
                try {
                    k9 = interfaceC2736Qb2.k();
                } catch (RemoteException e13) {
                    v2.i.d("", e13);
                }
                try {
                    if (k9 != -1.0d) {
                        d2 = Double.valueOf(k9);
                        aVar.f23536g = d2;
                        String str5 = interfaceC2736Qb2.l();
                        aVar.f23537h = str5;
                        String str6 = interfaceC2736Qb2.q();
                        aVar.i = str6;
                        B9 = interfaceC2736Qb2.B();
                        if (B9 != null) {
                            obj = W2.b.F0(B9);
                        }
                        aVar.f23539k = obj;
                        aVar.f23541m = true;
                        aVar.f23542n = true;
                        k2.v vVar = (k2.v) c3864s.f33789x;
                        if (interfaceC2736Qb2.p() != null) {
                            vVar.b(interfaceC2736Qb2.p());
                        }
                        aVar.f23538j = vVar;
                        C4274ze c4274ze = (C4274ze) ((x2.m) eVar.f23550v);
                        c4274ze.getClass();
                        P2.w.d("#008 Must be called on the main UI thread.");
                        v2.i.a("Adapter called onAdLoaded.");
                        c4274ze.f35361v = aVar;
                        if (!(((AbstractAdViewAdapter) eVar.f23549u) instanceof AdMobAdapter)) {
                            new k2.v().b(new BinderC4165xd());
                        }
                        ((InterfaceC3841rd) c4274ze.f35360u).j();
                        break;
                    }
                    ((InterfaceC3841rd) c4274ze.f35360u).j();
                } catch (RemoteException e14) {
                    v2.i.i("#007 Could not call remote method.", e14);
                    return;
                }
                d2 = null;
                aVar.f23536g = d2;
                String str52 = interfaceC2736Qb2.l();
                aVar.f23537h = str52;
                String str62 = interfaceC2736Qb2.q();
                aVar.i = str62;
                B9 = interfaceC2736Qb2.B();
                if (B9 != null) {
                }
                aVar.f23539k = obj;
                aVar.f23541m = true;
                aVar.f23542n = true;
                k2.v vVar2 = (k2.v) c3864s.f33789x;
                if (interfaceC2736Qb2.p() != null) {
                }
                aVar.f23538j = vVar2;
                C4274ze c4274ze2 = (C4274ze) ((x2.m) eVar.f23550v);
                c4274ze2.getClass();
                P2.w.d("#008 Must be called on the main UI thread.");
                v2.i.a("Adapter called onAdLoaded.");
                c4274ze2.f35361v = aVar;
                if (!(((AbstractAdViewAdapter) eVar.f23549u) instanceof AdMobAdapter)) {
                }
            default:
                ((A2.b) this.f27934u).onNativeAdLoaded(new C3143ee(interfaceC2736Qb));
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractBinderC3336i8
    public final boolean T3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC2736Qb c2719Pb;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            c2719Pb = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            c2719Pb = queryLocalInterface instanceof InterfaceC2736Qb ? (InterfaceC2736Qb) queryLocalInterface : new C2719Pb(readStrongBinder, "com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd", 2);
        }
        AbstractC3388j8.f(parcel);
        G3(c2719Pb);
        parcel2.writeNoException();
        return true;
    }
}
