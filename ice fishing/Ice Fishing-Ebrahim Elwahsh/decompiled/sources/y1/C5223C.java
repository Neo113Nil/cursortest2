package y1;

import android.content.ContentResolver;

/* renamed from: y1.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5223C implements InterfaceC5245t {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f41816n;

    /* renamed from: u, reason: collision with root package name */
    public final ContentResolver f41817u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f41818v;

    public /* synthetic */ C5223C(ContentResolver contentResolver, boolean z8, int i) {
        this.f41816n = i;
        this.f41817u = contentResolver;
        this.f41818v = z8;
    }

    @Override // y1.InterfaceC5245t
    public final InterfaceC5244s i(y yVar) {
        switch (this.f41816n) {
        }
        return new C5224D(this);
    }
}
