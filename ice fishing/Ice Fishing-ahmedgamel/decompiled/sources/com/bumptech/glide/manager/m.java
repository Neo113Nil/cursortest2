package com.bumptech.glide.manager;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import y1.C5207b;
import y1.InterfaceC5211f;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import y1.x;

/* loaded from: classes.dex */
public final class m implements N1.i, InterfaceC5224s, InterfaceC5211f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f23460n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f23461u;

    public /* synthetic */ m(Context context, int i) {
        this.f23460n = i;
        this.f23461u = context;
    }

    @Override // y1.InterfaceC5211f
    public Class a() {
        return Drawable.class;
    }

    @Override // y1.InterfaceC5211f
    public Object b(Resources resources, int i, Resources.Theme theme) {
        Context context = this.f23461u;
        return d6.c.f(context, context, i, theme);
    }

    @Override // y1.InterfaceC5211f
    public /* bridge */ /* synthetic */ void d(Object obj) {
    }

    @Override // N1.i
    public Object get() {
        return (ConnectivityManager) this.f23461u.getSystemService("connectivity");
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(x xVar) {
        switch (this.f23460n) {
            case 2:
                return new C5207b(this.f23461u, this);
            default:
                return new C5207b(this.f23461u, xVar.b(Integer.class, AssetFileDescriptor.class));
        }
    }
}
