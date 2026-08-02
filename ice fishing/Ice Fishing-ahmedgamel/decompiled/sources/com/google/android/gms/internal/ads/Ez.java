package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class Ez implements InterfaceC3078cx {

    /* renamed from: a, reason: collision with root package name */
    public final Context f25450a;

    /* renamed from: b, reason: collision with root package name */
    public final C3521lA f25451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f25452c;

    /* renamed from: d, reason: collision with root package name */
    public final long f25453d;

    /* renamed from: e, reason: collision with root package name */
    public final long f25454e;

    public Ez(Context context, C2972ay c2972ay, C3521lA c3521lA) {
        this.f25450a = context;
        this.f25452c = c2972ay.R();
        this.f25453d = c2972ay.Y();
        this.f25454e = c2972ay.Z();
        this.f25451b = c3521lA;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(HashMap hashMap) {
        String str;
        P3.a aVar;
        H6 h62;
        hashMap.put("v", this.f25452c);
        hashMap.put("t", new Throwable());
        try {
            aVar = (P3.a) hashMap.get("gs");
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (aVar != null && ((Build.VERSION.SDK_INT < 31 || aVar.isDone()) && (h62 = (H6) aVar.get(this.f25453d, TimeUnit.MILLISECONDS)) != null && h62.v0().length() > 1)) {
            str = h62.v0();
            if (str.equals("E")) {
                try {
                    P3.a aVar2 = (P3.a) hashMap.get(com.anythink.expressad.f.a.b.da);
                    if (aVar2 != null) {
                        String str2 = (String) aVar2.get(this.f25454e, TimeUnit.MILLISECONDS);
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

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap d() {
        HashMap hashMap = new HashMap();
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap f() {
        HashMap a9 = this.f25451b.a();
        a(a9);
        return a9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap i() {
        HashMap b9 = this.f25451b.b(this.f25450a, null);
        a(b9);
        return b9;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3078cx
    public final HashMap o() {
        HashMap c9 = this.f25451b.c();
        a(c9);
        return c9;
    }
}
