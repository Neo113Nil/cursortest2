package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.K;
import x0.InterfaceC5179b;

/* renamed from: androidx.activity.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0458f implements InterfaceC5179b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4413a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4414b;

    public /* synthetic */ C0458f(int i, Object obj) {
        this.f4413a = i;
        this.f4414b = obj;
    }

    @Override // x0.InterfaceC5179b
    public final Bundle a() {
        switch (this.f4413a) {
            case 0:
                return p.c((p) this.f4414b);
            default:
                return K.a((K) this.f4414b);
        }
    }
}
