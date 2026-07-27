package t0;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import y1.C5207b;
import y1.InterfaceC5206a;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import z1.C5254a;

/* renamed from: t0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4988C implements a0, O1.a, InterfaceC5224s, InterfaceC5206a {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40531n;

    /* renamed from: u, reason: collision with root package name */
    public final Object f40532u;

    public /* synthetic */ C4988C(int i, Object obj) {
        this.f40531n = i;
        this.f40532u = obj;
    }

    @Override // y1.InterfaceC5206a
    public com.bumptech.glide.load.data.d a(AssetManager assetManager, String str) {
        return new com.bumptech.glide.load.data.i(assetManager, str, 1);
    }

    @Override // t0.a0
    public int e(View view) {
        C4991F c4991f = (C4991F) view.getLayoutParams();
        ((AbstractC4990E) this.f40532u).getClass();
        return (view.getLeft() - ((C4991F) view.getLayoutParams()).f40552b.left) - ((ViewGroup.MarginLayoutParams) c4991f).leftMargin;
    }

    @Override // O1.a
    public Object f() {
        F.d dVar = (F.d) this.f40532u;
        return new u1.i((N1.h) dVar.f855c, (Z2.e) dVar.f856d);
    }

    @Override // t0.a0
    public int g() {
        return ((AbstractC4990E) this.f40532u).E();
    }

    @Override // t0.a0
    public int h() {
        AbstractC4990E abstractC4990E = (AbstractC4990E) this.f40532u;
        return abstractC4990E.f40549n - abstractC4990E.F();
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(y1.x xVar) {
        switch (this.f40531n) {
            case 4:
                return new C5207b(0, (AssetManager) this.f40532u, this);
            case 5:
                return new C5207b((Resources) this.f40532u, xVar.b(Uri.class, AssetFileDescriptor.class));
            default:
                return new C5254a((t2.n) this.f40532u);
        }
    }

    @Override // t0.a0
    public View m(int i) {
        return ((AbstractC4990E) this.f40532u).u(i);
    }

    @Override // t0.a0
    public int n(View view) {
        C4991F c4991f = (C4991F) view.getLayoutParams();
        ((AbstractC4990E) this.f40532u).getClass();
        return view.getRight() + ((C4991F) view.getLayoutParams()).f40552b.right + ((ViewGroup.MarginLayoutParams) c4991f).rightMargin;
    }

    public C4988C(int i) {
        this.f40531n = i;
        switch (i) {
            case 6:
                this.f40532u = new t2.n(2);
                break;
            default:
                this.f40532u = new ConcurrentHashMap();
                new AtomicInteger(0);
                break;
        }
    }

    public C4988C(Context context) {
        this.f40531n = 3;
        this.f40532u = new com.bumptech.glide.manager.m(context, 1);
    }
}
