package g1;

import Z0.v;
import b1.InterfaceC0519c;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37595a;

    /* renamed from: b, reason: collision with root package name */
    public final int f37596b;

    /* renamed from: c, reason: collision with root package name */
    public final C4515a f37597c;

    /* renamed from: d, reason: collision with root package name */
    public final C4515a f37598d;

    /* renamed from: e, reason: collision with root package name */
    public final C4515a f37599e;

    /* renamed from: f, reason: collision with root package name */
    public final C4515a f37600f;

    /* renamed from: g, reason: collision with root package name */
    public final C4516b f37601g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37602h;
    public final int i;

    /* renamed from: j, reason: collision with root package name */
    public final float f37603j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f37604k;

    /* renamed from: l, reason: collision with root package name */
    public final C4516b f37605l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f37606m;

    public e(String str, int i, C4515a c4515a, C4515a c4515a2, C4515a c4515a3, C4515a c4515a4, C4516b c4516b, int i4, int i6, float f2, ArrayList arrayList, C4516b c4516b2, boolean z6) {
        this.f37595a = str;
        this.f37596b = i;
        this.f37597c = c4515a;
        this.f37598d = c4515a2;
        this.f37599e = c4515a3;
        this.f37600f = c4515a4;
        this.f37601g = c4516b;
        this.f37602h = i4;
        this.i = i6;
        this.f37603j = f2;
        this.f37604k = arrayList;
        this.f37605l = c4516b2;
        this.f37606m = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new b1.i(vVar, abstractC4563a, this);
    }
}
