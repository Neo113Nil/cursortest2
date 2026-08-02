package com.google.android.gms.internal.ads;

import java.util.LinkedList;
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.qu, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3828qu {

    /* renamed from: b, reason: collision with root package name */
    public final int f34205b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34206c;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f34204a = new LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final Cu f34207d = new Cu();

    public C3828qu(int i, int i4) {
        this.f34205b = i;
        this.f34206c = i4;
    }

    public final void a() {
        while (true) {
            LinkedList linkedList = this.f34204a;
            if (linkedList.isEmpty()) {
                return;
            }
            C4043uu c4043uu = (C4043uu) linkedList.getFirst();
            C4906k.f40186C.f40198k.getClass();
            if (System.currentTimeMillis() - c4043uu.f35370d < this.f34206c) {
                return;
            }
            Cu cu = this.f34207d;
            cu.f25008f++;
            cu.f25004b.f24746u++;
            linkedList.remove();
        }
    }
}
