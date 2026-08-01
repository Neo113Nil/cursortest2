package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.qu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3805qu {

    /* renamed from: b, reason: collision with root package name */
    public final int f33438b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33439c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f33437a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final Cu f33440d = new Cu();

    public C3805qu(int i, int i6) {
        this.f33438b = i;
        this.f33439c = i6;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f33437a;
            if (linkedList.isEmpty()) {
                return;
            }
            C4020uu c4020uu = (C4020uu) linkedList.getFirst();
            C4835j.f39733C.f39745k.getClass();
            if (System.currentTimeMillis() - c4020uu.f34607d < this.f33439c) {
                return;
            }
            Cu cu = this.f33440d;
            cu.f24263f++;
            cu.f24259b.f23983u++;
            linkedList.remove();
        }
    }
}
