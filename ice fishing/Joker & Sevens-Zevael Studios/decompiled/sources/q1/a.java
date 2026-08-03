package q1;

import x4.i;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a extends hc.c {

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f5725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i f5726h;

    /* renamed from: i, reason: collision with root package name */
    public int f5727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(i iVar, hc.c cVar) {
        super(cVar);
        this.f5726h = iVar;
    }

    @Override // hc.a
    public final Object invokeSuspend(Object obj) {
        this.f5725g = obj;
        this.f5727i |= Integer.MIN_VALUE;
        return this.f5726h.a(0L, 0L, this);
    }
}
