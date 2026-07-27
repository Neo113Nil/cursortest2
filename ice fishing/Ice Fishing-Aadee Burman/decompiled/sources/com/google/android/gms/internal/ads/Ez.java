package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class Ez implements InterfaceC3055cx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24694a;

    /* renamed from: b, reason: collision with root package name */
    public final C3498lA f24695b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24696c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24697d;

    /* renamed from: e, reason: collision with root package name */
    public final long f24698e;

    public Ez(Context context, C2949ay c2949ay, C3498lA c3498lA) {
        this.f24694a = context;
        this.f24696c = c2949ay.R();
        this.f24697d = c2949ay.Y();
        this.f24698e = c2949ay.Z();
        this.f24695b = c3498lA;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap hashMap) {
        String str;
        N3.a aVar;
        H6 h62;
        hashMap.put("v", this.f24696c);
        hashMap.put("t", new Throwable());
        try {
            aVar = (N3.a) hashMap.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (h62 = (H6) aVar.get(this.f24697d, TimeUnit.MILLISECONDS)) != null && h62.v0().length() > 1)) {
            str = h62.v0();
            if (str.equals("E")) {
                try {
                    N3.a aVar2 = (N3.a) hashMap.get(com.anythink.expressad.f.a.b.da);
                    if (aVar2 != null) {
                        String str2 = (String) aVar2.get(this.f24698e, TimeUnit.MILLISECONDS);
                        if (!SK.n(str2)) {
                            str = str2;
                        }
                    }
                } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
                }
            }
            hashMap.put("int", str);
        }
        str = "E";
        if (str.equals("E")) {
        }
        hashMap.put("int", str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap d() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap f() {
        HashMap a9 = this.f24695b.a();
        a(a9);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap i() {
        HashMap b9 = this.f24695b.b(this.f24694a, null);
        a(b9);
        return b9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3055cx
    public final HashMap o() {
        HashMap c9 = this.f24695b.c();
        a(c9);
        return c9;
    }
}
