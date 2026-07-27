package androidx.activity;

import android.os.Bundle;
import androidx.lifecycle.K;
import x0.InterfaceC5180b;

/* renamed from: androidx.activity.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0454f implements InterfaceC5180b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4445a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4446b;

    public /* synthetic */ C0454f(int i, Object obj) {
        this.f4445a = i;
        this.f4446b = obj;
    }

    @Override // x0.InterfaceC5180b
    public final Bundle a() {
        switch (this.f4445a) {
            case 0:
                return p.c((p) this.f4446b);
            default:
                return K.a((K) this.f4446b);
        }
    }
}
