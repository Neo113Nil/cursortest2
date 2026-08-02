package com.yandex.pulse.mvi.tracker;

import android.util.SparseArray;
import androidx.annotation.Keep;
import defpackage.bai;
import defpackage.c11;
import defpackage.hvo;
import defpackage.l30;
import defpackage.mj;
import defpackage.nkk;
import defpackage.x3o;
import defpackage.yav;
import defpackage.yj4;
import defpackage.z3o;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes5.dex */
public class ResponsivenessTracker {
    public final bai a;
    public final long b;
    public final boolean c;
    public final long d;
    public final c11 e;
    public final yj4 f;
    public boolean g;
    public boolean h;
    public final SparseArray i;
    public final l30 j;

    @Keep
    private final yav mObservationCallback;

    public ResponsivenessTracker(bai baiVar) {
        c11 c11Var = new c11();
        c11Var.a = new ArrayList();
        this.e = c11Var;
        this.f = new yj4(3, this);
        this.i = new SparseArray();
        x3o x3oVar = new x3o(0, this);
        this.mObservationCallback = x3oVar;
        this.j = new l30(x3oVar);
        this.a = baiVar;
        this.b = Math.max(15000L, 1000L);
        this.c = true;
        this.d = Math.max(0L, 0L);
    }

    public final void a(Long l, nkk nkkVar, nkk nkkVar2) {
        if (this.h) {
            long max = Math.max(nkkVar2.a - nkkVar.a, l != null ? l.longValue() : 0L);
            c11 c11Var = this.e;
            ArrayList arrayList = c11Var.a;
            c11Var.b++;
            if (max <= 1) {
                return;
            }
            int binarySearch = Collections.binarySearch(arrayList, Long.valueOf(max), new mj(24));
            if (binarySearch < 0) {
                binarySearch = (-binarySearch) - 1;
            }
            arrayList.add(binarySearch, Long.valueOf(max));
            if (arrayList.size() > 10) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    public final void b(hvo hvoVar) {
        this.i.put(hvoVar.c[hvoVar.a() == 5 ? (hvoVar.b & 65280) >> 8 : 0], new z3o(new nkk(hvoVar.a)));
    }
}
