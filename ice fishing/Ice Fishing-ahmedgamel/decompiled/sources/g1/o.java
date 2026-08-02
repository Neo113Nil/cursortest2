package g1;

import Z0.v;
import b1.InterfaceC0519c;
import b1.s;
import f1.C4515a;
import f1.C4516b;
import h1.AbstractC4563a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37646a;

    /* renamed from: b, reason: collision with root package name */
    public final C4516b f37647b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37648c;

    /* renamed from: d, reason: collision with root package name */
    public final C4515a f37649d;

    /* renamed from: e, reason: collision with root package name */
    public final C4515a f37650e;

    /* renamed from: f, reason: collision with root package name */
    public final C4516b f37651f;

    /* renamed from: g, reason: collision with root package name */
    public final int f37652g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37653h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f37654j;

    public o(String str, C4516b c4516b, ArrayList arrayList, C4515a c4515a, C4515a c4515a2, C4516b c4516b2, int i, int i4, float f2, boolean z6) {
        this.f37646a = str;
        this.f37647b = c4516b;
        this.f37648c = arrayList;
        this.f37649d = c4515a;
        this.f37650e = c4515a2;
        this.f37651f = c4516b2;
        this.f37652g = i;
        this.f37653h = i4;
        this.i = f2;
        this.f37654j = z6;
    }

    @Override // g1.b
    public final InterfaceC0519c a(v vVar, Z0.i iVar, AbstractC4563a abstractC4563a) {
        return new s(vVar, abstractC4563a, this);
    }
}
