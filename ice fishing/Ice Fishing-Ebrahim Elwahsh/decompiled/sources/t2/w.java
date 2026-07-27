package t2;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.internal.ads.InterfaceC3852rb;
import k2.InterfaceC4644o;
import m.c1;
import q2.N0;
import y1.C5227b;
import y1.InterfaceC5226a;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import z1.C5267a;

/* loaded from: classes.dex */
public final class w implements O1.a, InterfaceC5245t, InterfaceC5226a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40938n;

    /* renamed from: u, reason: collision with root package name */
    public Object f40939u;

    public /* synthetic */ w(int i, Object obj) {
        this.f40938n = i;
        this.f40939u = obj;
    }

    @Override // y1.InterfaceC5226a
    public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.i(assetManager, str, 0);
    }

    public void b(InterfaceC4644o interfaceC4644o) {
        InterfaceC3852rb interfaceC3852rb = ((NativeAdView) this.f40939u).f23749u;
        if (interfaceC3852rb == null) {
            return;
        }
        try {
            if (interfaceC4644o instanceof N0) {
                interfaceC3852rb.b2(((N0) interfaceC4644o).f39975a);
            } else if (interfaceC4644o == null) {
                interfaceC3852rb.b2(null);
            } else {
                u2.i.a("Use MediaContent provided by NativeAd.getMediaContent");
            }
        } catch (RemoteException e6) {
            u2.i.d("Unable to call setMediaContent on delegate", e6);
        }
    }

    @Override // O1.a
    public Object f() {
        c1 c1Var = (c1) this.f40939u;
        return new u1.o((x1.d) c1Var.f39394n, (x1.d) c1Var.f39395u, (x1.d) c1Var.f39396v, (x1.d) c1Var.f39397w, (u1.k) c1Var.f39398x, (u1.k) c1Var.f39399y, (Y2.e) c1Var.f39400z);
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y1.y yVar) {
        switch (this.f40938n) {
            case 4:
                return new C5227b(0, (AssetManager) this.f40939u, this);
            default:
                return new C5267a((i8.m) this.f40939u);
        }
    }

    public w(Context context) {
        this.f40938n = 3;
        this.f40939u = new U2.b(context);
    }

    public w(int i) {
        this.f40938n = i;
        switch (i) {
            case 5:
                this.f40939u = new i8.m(9);
                break;
        }
    }
}
