package e1;

import X0.v;
import Z0.s;
import d1.C4455a;
import d1.C4456b;
import f1.AbstractC4490a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class o implements b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37301a;

    /* renamed from: b, reason: collision with root package name */
    public final C4456b f37302b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f37303c;

    /* renamed from: d, reason: collision with root package name */
    public final C4455a f37304d;

    /* renamed from: e, reason: collision with root package name */
    public final C4455a f37305e;

    /* renamed from: f, reason: collision with root package name */
    public final C4456b f37306f;

    /* renamed from: g, reason: collision with root package name */
    public final int f37307g;

    /* renamed from: h, reason: collision with root package name */
    public final int f37308h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f37309j;

    public o(String str, C4456b c4456b, ArrayList arrayList, C4455a c4455a, C4455a c4455a2, C4456b c4456b2, int i, int i4, float f6, boolean z8) {
        this.f37301a = str;
        this.f37302b = c4456b;
        this.f37303c = arrayList;
        this.f37304d = c4455a;
        this.f37305e = c4455a2;
        this.f37306f = c4456b2;
        this.f37307g = i;
        this.f37308h = i4;
        this.i = f6;
        this.f37309j = z8;
    }

    @Override // e1.b
    public final Z0.c a(v vVar, X0.i iVar, AbstractC4490a abstractC4490a) {
        return new s(vVar, abstractC4490a, this);
    }
}
