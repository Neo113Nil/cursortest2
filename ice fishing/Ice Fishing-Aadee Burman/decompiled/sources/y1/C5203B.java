package y1;

import android.content.ContentResolver;

/* renamed from: y1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5203B implements InterfaceC5224s {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41778n;

    /* renamed from: u, reason: collision with root package name */
    public final ContentResolver f41779u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f41780v;

    public /* synthetic */ C5203B(ContentResolver contentResolver, boolean z3, int i) {
        this.f41778n = i;
        this.f41779u = contentResolver;
        this.f41780v = z3;
    }

    @Override // y1.InterfaceC5224s
    public final InterfaceC5223r i(x xVar) {
        switch (this.f41778n) {
        }
        return new C5204C(this);
    }
}
