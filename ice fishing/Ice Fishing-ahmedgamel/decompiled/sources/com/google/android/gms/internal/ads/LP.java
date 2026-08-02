package com.google.android.gms.internal.ads;

import O.C0335e0;
import android.content.Context;
import android.content.Intent;
import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import h.LayoutInflaterFactory2C4537A;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import k.AbstractC4625b;
import k.InterfaceC4624a;
import y1.C5201b;

/* loaded from: classes2.dex */
public class LP implements InterfaceC4624a, InterfaceC3248g5 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f26915n;

    /* renamed from: u, reason: collision with root package name */
    public Object f26916u;

    /* renamed from: v, reason: collision with root package name */
    public Object f26917v;

    public LP(int i) {
        this.f26915n = i;
        switch (i) {
            case 1:
                break;
            case 3:
                this.f26916u = new G3.u();
                this.f26917v = null;
                break;
            case 7:
                this.f26916u = new HashMap();
                this.f26917v = new H1.a(1);
                break;
            default:
                this.f26916u = new HashSet();
                break;
        }
    }

    public View a(int i, int i4, int i6, int i9) {
        t0.Y y7 = (t0.Y) this.f26916u;
        int e9 = y7.e();
        int l9 = y7.l();
        int i10 = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            View r9 = y7.r(i);
            int b9 = y7.b(r9);
            int s9 = y7.s(r9);
            t0.X x9 = (t0.X) this.f26917v;
            x9.f40687b = e9;
            x9.f40688c = l9;
            x9.f40689d = b9;
            x9.f40690e = s9;
            if (i6 != 0) {
                x9.f40686a = i6;
                if (x9.a()) {
                    return r9;
                }
            }
            if (i9 != 0) {
                x9.f40686a = i9;
                if (x9.a()) {
                    view = r9;
                }
            }
            i += i10;
        }
        return view;
    }

    @Override // k.InterfaceC4624a
    public boolean b(AbstractC4625b abstractC4625b, MenuItem menuItem) {
        return ((InterfaceC4624a) this.f26916u).b(abstractC4625b, menuItem);
    }

    public Object c(G3.u uVar) {
        return (Z0.G) this.f26917v;
    }

    public Object d(float f2, float f9, Object obj, Object obj2, float f10, float f11, float f12) {
        G3.u uVar = (G3.u) this.f26916u;
        uVar.f1169a = f2;
        uVar.f1170b = f9;
        uVar.f1174f = obj;
        uVar.f1175g = obj2;
        uVar.f1171c = f10;
        uVar.f1172d = f11;
        uVar.f1173e = f12;
        return c(uVar);
    }

    @Override // k.InterfaceC4624a
    public boolean e(AbstractC4625b abstractC4625b, l.m mVar) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C4537A) this.f26917v).f37806T;
        WeakHashMap weakHashMap = O.X.f2142a;
        O.J.c(viewGroup);
        return ((InterfaceC4624a) this.f26916u).e(abstractC4625b, mVar);
    }

    public boolean equals(Object obj) {
        switch (this.f26915n) {
            case 1:
                if (!(obj instanceof N.b)) {
                    return false;
                }
                ((N.b) obj).getClass();
                return ((String) this.f26916u) == null && ((String) this.f26917v) == null;
            default:
                return super.equals(obj);
        }
    }

    @Override // k.InterfaceC4624a
    public boolean f(AbstractC4625b abstractC4625b, l.m mVar) {
        return ((InterfaceC4624a) this.f26916u).f(abstractC4625b, mVar);
    }

    public boolean g(View view) {
        t0.Y y7 = (t0.Y) this.f26916u;
        int e9 = y7.e();
        int l9 = y7.l();
        int b9 = y7.b(view);
        int s9 = y7.s(view);
        t0.X x9 = (t0.X) this.f26917v;
        x9.f40687b = e9;
        x9.f40688c = l9;
        x9.f40689d = b9;
        x9.f40690e = s9;
        x9.f40686a = 24579;
        return x9.a();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [h.l, java.lang.Object] */
    @Override // k.InterfaceC4624a
    public void h(AbstractC4625b abstractC4625b) {
        ((InterfaceC4624a) this.f26916u).h(abstractC4625b);
        LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A = (LayoutInflaterFactory2C4537A) this.f26917v;
        if (layoutInflaterFactory2C4537A.f37802P != null) {
            layoutInflaterFactory2C4537A.f37788E.getDecorView().removeCallbacks(layoutInflaterFactory2C4537A.f37803Q);
        }
        if (layoutInflaterFactory2C4537A.f37801O != null) {
            C0335e0 c0335e0 = layoutInflaterFactory2C4537A.f37804R;
            if (c0335e0 != null) {
                c0335e0.b();
            }
            C0335e0 a9 = O.X.a(layoutInflaterFactory2C4537A.f37801O);
            a9.a(0.0f);
            layoutInflaterFactory2C4537A.f37804R = a9;
            a9.d(new h.s(2, this));
        }
        layoutInflaterFactory2C4537A.f37792G.onSupportActionModeFinished(layoutInflaterFactory2C4537A.f37800N);
        layoutInflaterFactory2C4537A.f37800N = null;
        ViewGroup viewGroup = layoutInflaterFactory2C4537A.f37806T;
        WeakHashMap weakHashMap = O.X.f2142a;
        O.J.c(viewGroup);
        layoutInflaterFactory2C4537A.K();
    }

    public int hashCode() {
        switch (this.f26915n) {
            case 1:
                String str = (String) this.f26916u;
                int hashCode = str == null ? 0 : str.hashCode();
                String str2 = (String) this.f26917v;
                return hashCode ^ (str2 != null ? str2.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public void i(Context context, Uri uri) {
        Intent intent = (Intent) this.f26916u;
        intent.setData(uri);
        context.startActivity(intent, (Bundle) this.f26917v);
    }

    public void j(String str) {
        C5201b c5201b;
        synchronized (this) {
            try {
                c5201b = (C5201b) ((HashMap) this.f26916u).get(str);
                P1.g.c(c5201b, "Argument must not be null");
                int i = c5201b.f41890b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c5201b.f41890b);
                }
                int i4 = i - 1;
                c5201b.f41890b = i4;
                if (i4 == 0) {
                    C5201b c5201b2 = (C5201b) ((HashMap) this.f26916u).remove(str);
                    if (!c5201b2.equals(c5201b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c5201b + ", but actually removed: " + c5201b2 + ", safeKey: " + str);
                    }
                    H1.a aVar = (H1.a) this.f26917v;
                    synchronized (aVar.f1188a) {
                        try {
                            if (aVar.f1188a.size() < 10) {
                                aVar.f1188a.offer(c5201b2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c5201b.f41889a.unlock();
    }

    public void k(int i) {
        LoudnessCodecController create;
        boolean addMediaCodec;
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.f26917v;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f26917v = null;
        }
        create = LoudnessCodecController.create(i, GD.f25742n, new KP());
        this.f26917v = create;
        Iterator it = ((HashSet) this.f26916u).iterator();
        while (it.hasNext()) {
            addMediaCodec = create.addMediaCodec((MediaCodec) it.next());
            if (!addMediaCodec) {
                it.remove();
            }
        }
    }

    public void l(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.f26916u).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.f26917v) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3248g5
    public void n(C3302h5 c3302h5) {
        String obj = c3302h5.toString();
        String str = (String) this.f26916u;
        String r9 = com.IceFishing.LiveIceFishing.k.r(new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(obj).length()), "Failed to load URL: ", str, "\n", obj);
        int i = w2.z.f41712b;
        x2.i.f(r9);
        ((w2.p) this.f26917v).b(null);
    }

    public String toString() {
        switch (this.f26915n) {
            case 1:
                StringBuilder sb = new StringBuilder("Pair{");
                sb.append(this.f26916u);
                sb.append(" ");
                sb.append(this.f26917v);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public LP(w2.r rVar, String str, w2.p pVar) {
        this.f26915n = 6;
        this.f26916u = str;
        this.f26917v = pVar;
        Objects.requireNonNull(rVar);
    }

    public LP(Z0.G g9) {
        this.f26915n = 3;
        this.f26916u = new G3.u();
        this.f26917v = g9;
    }

    public LP(t0.Y y7) {
        this.f26915n = 5;
        this.f26916u = y7;
        t0.X x9 = new t0.X();
        x9.f40686a = 0;
        this.f26917v = x9;
    }

    public LP(Intent intent, Bundle bundle) {
        this.f26915n = 4;
        this.f26916u = intent;
        this.f26917v = bundle;
    }

    public LP(LayoutInflaterFactory2C4537A layoutInflaterFactory2C4537A, InterfaceC4624a interfaceC4624a) {
        this.f26915n = 2;
        this.f26917v = layoutInflaterFactory2C4537A;
        this.f26916u = interfaceC4624a;
    }
}
