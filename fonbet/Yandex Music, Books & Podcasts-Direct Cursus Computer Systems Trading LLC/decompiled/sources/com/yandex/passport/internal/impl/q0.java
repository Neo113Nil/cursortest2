package com.yandex.passport.internal.impl;

import android.content.Context;
import com.yandex.passport.api.h1;
import com.yandex.passport.api.h2;
import com.yandex.passport.api.u1;
import com.yandex.passport.internal.methods.j3;
import com.yandex.passport.internal.methods.l5;
import com.yandex.passport.internal.ui.sloth.ebs.n1;
import defpackage.b6e;
import defpackage.bw1;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.dxd;
import defpackage.ern;
import defpackage.f9f;
import defpackage.nm6;
import defpackage.ocu;
import defpackage.qgg;
import defpackage.qyf;
import defpackage.r7o;
import defpackage.rh;
import defpackage.rhw;
import defpackage.sh;
import defpackage.vh;
import defpackage.x0q;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y0q;
import defpackage.z7o;
import defpackage.zh;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class q0 {
    public final qyf a;
    public final x b;
    public final x0q c;
    public final x0q d;
    public final x0q e;
    public final x0q f;
    public final x0q g;
    public final x0q h;
    public final x0q i;
    public final x0q j;
    public final x0q k;
    public final x0q l;
    public final x0q m;
    public final x0q n;
    public final x0q o;
    public final x0q p;
    public final zh q;
    public final bw1 r;
    public final zh s;
    public final zh t;
    public final zh u;
    public final zh v;
    public final zh w;
    public final zh x;

    /* JADX WARN: Multi-variable type inference failed */
    public q0(t0 t0Var, y yVar, sh shVar, qyf qyfVar, f0 f0Var, x xVar, Context context) {
        t0Var.getClass();
        yVar.getClass();
        shVar.getClass();
        f0Var.getClass();
        context.getClass();
        this.a = qyfVar;
        this.b = xVar;
        x0q b = y0q.b(1, 0, null, 6);
        x0q b2 = y0q.b(1, 0, null, 6);
        x0q b3 = y0q.b(1, 0, null, 6);
        x0q b4 = y0q.b(1, 0, null, 6);
        x0q b5 = y0q.b(1, 0, null, 6);
        x0q b6 = y0q.b(1, 0, null, 6);
        this.c = b6;
        x0q b7 = y0q.b(1, 0, null, 6);
        this.d = b7;
        x0q b8 = y0q.b(1, 0, null, 6);
        this.e = b8;
        x0q b9 = y0q.b(1, 0, null, 6);
        x0q b10 = y0q.b(0, 0, null, 7);
        this.f = y0q.b(1, 0, null, 6);
        this.g = y0q.b(1, 0, null, 6);
        this.h = y0q.b(1, 0, null, 6);
        this.i = y0q.b(1, 0, null, 6);
        x0q b11 = y0q.b(1, 0, null, 6);
        x0q b12 = y0q.b(1, 0, null, 6);
        x0q b13 = y0q.b(1, 0, null, 6);
        this.j = y0q.b(1, 0, null, 6);
        this.k = y0q.b(1, 0, null, 6);
        this.l = y0q.b(1, 0, null, 6);
        this.m = y0q.b(0, 0, null, 7);
        this.n = y0q.b(1, 0, null, 6);
        this.o = y0q.b(0, 0, null, 7);
        this.p = y0q.b(0, 0, null, 7);
        com.yandex.passport.api.i iVar = t0Var.a;
        this.q = shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 2), new p0(b6, this, b, 0));
        this.r = new bw1(context, this, f0Var, xVar, yVar, shVar, qyfVar, b8, new rhw(this, (Continuation) null, 24));
        this.s = shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 11), new p0(b7, this, b2, 1));
        shVar.registerForActivityResult(new s0(iVar, t0Var), new l0(b9, this));
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 6, false), new l0(b10, this));
        iVar.getClass();
        vh vhVar = new vh(12);
        final Object[] objArr = 0 == true ? 1 : 0;
        shVar.registerForActivityResult(vhVar, new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (objArr) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i = 8;
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 8, 0 == true ? 1 : 0), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i2 = 9;
        shVar.registerForActivityResult(new dxd(1, t0Var), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i3 = 10;
        shVar.registerForActivityResult(new vh(13), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 4), new p0(b6, this, b5, 2));
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 1), new p0(b6, this, b4, 3));
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, t0Var), new l0(b11, this));
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 3), new p0(b6, this, b3, 4));
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 5), new p0(b13, this, b12, 5));
        final int i4 = 11;
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 12), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i5 = 12;
        shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 9), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i6 = 1;
        this.t = shVar.registerForActivityResult(new com.yandex.passport.internal.autologin.ui.n(iVar, 10), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i6) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i7 = 2;
        this.u = shVar.registerForActivityResult(new vh(15), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i7) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i8 = 3;
        shVar.registerForActivityResult(new vh(14), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i8) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i9 = 4;
        this.v = shVar.registerForActivityResult(new n1(3), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i9) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i10 = 5;
        this.w = shVar.registerForActivityResult(new n1(2), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i10) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        final int i11 = 6;
        shVar.registerForActivityResult(new vh(29), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i11) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
        this.x = shVar.registerForActivityResult(new vh(24), new i0());
        final int i12 = 7;
        shVar.registerForActivityResult(new n1(5), new rh(this) { // from class: com.yandex.passport.internal.impl.h0
            public final /* synthetic */ q0 b;

            {
                this.b = this;
            }

            @Override // defpackage.rh
            public final void a(Object obj) {
                switch (i12) {
                    case 0:
                        com.yandex.passport.api.v vVar = (com.yandex.passport.api.v) obj;
                        vVar.getClass();
                        q0 q0Var = this.b;
                        x97.y(q0Var.a, null, null, new m0(q0Var.f, null, vVar, 0), 3);
                        break;
                    case 1:
                        com.yandex.passport.api.j0 j0Var = (com.yandex.passport.api.j0) obj;
                        j0Var.getClass();
                        q0 q0Var2 = this.b;
                        x97.y(q0Var2.a, null, null, new j0(q0Var2.k, null, j0Var, 1), 3);
                        break;
                    case 2:
                        q0 q0Var3 = this.b;
                        x97.y(q0Var3.a, null, null, new rhw(q0Var3.m, (Continuation) null, (com.yandex.passport.internal.sloth.credentialmanager.a) obj, 28), 3);
                        break;
                    case 3:
                        com.yandex.passport.api.v vVar2 = (com.yandex.passport.api.v) obj;
                        vVar2.getClass();
                        q0 q0Var4 = this.b;
                        x97.y(q0Var4.a, null, null, new m0(q0Var4.l, null, vVar2, 1), 3);
                        break;
                    case 4:
                        h1 h1Var = (h1) obj;
                        h1Var.getClass();
                        q0 q0Var5 = this.b;
                        x97.y(q0Var5.a, null, null, new k0(q0Var5.n, null, h1Var, 1), 3);
                        break;
                    case 5:
                        h1 h1Var2 = (h1) obj;
                        h1Var2.getClass();
                        q0 q0Var6 = this.b;
                        x97.y(q0Var6.a, null, null, new k0(q0Var6.n, null, h1Var2, 0), 3);
                        break;
                    case 6:
                        com.yandex.passport.api.b0 b0Var = (com.yandex.passport.api.b0) obj;
                        b0Var.getClass();
                        q0 q0Var7 = this.b;
                        x97.y(q0Var7.a, null, null, new rhw(q0Var7.o, (Continuation) null, b0Var, 25), 3);
                        break;
                    case 7:
                        u1 u1Var = (u1) obj;
                        u1Var.getClass();
                        q0 q0Var8 = this.b;
                        x97.y(q0Var8.a, null, null, new rhw(q0Var8.p, (Continuation) null, u1Var, 27), 3);
                        break;
                    case 8:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        q0 q0Var9 = this.b;
                        x97.y(q0Var9.a, null, null, new o0(q0Var9.g, null, booleanValue, 0), 3);
                        break;
                    case 9:
                        boolean booleanValue2 = ((Boolean) obj).booleanValue();
                        q0 q0Var10 = this.b;
                        x97.y(q0Var10.a, null, null, new o0(q0Var10.h, null, booleanValue2, 1), 3);
                        break;
                    case 10:
                        com.yandex.passport.api.o0 o0Var = (com.yandex.passport.api.o0) obj;
                        o0Var.getClass();
                        q0 q0Var11 = this.b;
                        x97.y(q0Var11.a, null, null, new rhw(q0Var11.i, (Continuation) null, o0Var, 26), 3);
                        break;
                    case 11:
                        h2 h2Var = (h2) obj;
                        h2Var.getClass();
                        q0 q0Var12 = this.b;
                        x97.y(q0Var12.a, null, null, new rhw(q0Var12.j, (Continuation) null, h2Var, 29), 3);
                        break;
                    default:
                        com.yandex.passport.api.j0 j0Var2 = (com.yandex.passport.api.j0) obj;
                        j0Var2.getClass();
                        q0 q0Var13 = this.b;
                        x97.y(q0Var13.a, null, null, new j0(q0Var13.k, null, j0Var2, 0), 3);
                        break;
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(5:11|12|(4:14|(1:16)|17|(1:19)(2:23|(2:27|28)))(2:29|(1:31))|20|21)(2:32|33))(2:34|35))(3:46|(2:48|(2:50|44))|42)|36|(2:38|(1:40))|41|42))|52|6|7|(0)(0)|36|(0)|41|42) */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b0, code lost:
    
        if (r15 == r7) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0084, code lost:
    
        r15 = defpackage.z7o.b;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070 A[Catch: all -> 0x0084, TryCatch #0 {all -> 0x0084, blocks: (B:35:0x003e, B:36:0x0066, B:38:0x0070, B:40:0x007a, B:41:0x0081, B:48:0x0047), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, boolean z2, Continuation continuation) {
        n0 n0Var;
        int i;
        Throwable a;
        com.yandex.passport.internal.methods.requester.f fVar = this.b.f;
        if (continuation instanceof n0) {
            n0Var = (n0) continuation;
            int i2 = n0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n0Var.n = i2 - Integer.MIN_VALUE;
                Object obj = n0Var.l;
                nm6 nm6Var = nm6.a;
                i = n0Var.n;
                Continuation continuation2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    if (z2) {
                        r7o r7oVar = z7o.b;
                        dq7 dq7Var = ca8.a;
                        ocu ocuVar = new ocu(fVar, new l5(false), new f9f[0], continuation2, 21);
                        n0Var.j = z;
                        n0Var.k = z2;
                        n0Var.n = 1;
                        obj = x97.V(dq7Var, ocuVar, n0Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    }
                    j3 j3Var = new j3(z);
                    f9f[] f9fVarArr = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class)};
                    dq7 dq7Var2 = ca8.a;
                    ocu ocuVar2 = new ocu(fVar, j3Var, f9fVarArr, continuation2, 21);
                    n0Var.j = z;
                    n0Var.k = z2;
                    n0Var.n = 2;
                    obj = x97.V(dq7Var2, ocuVar2, n0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        Object obj2 = ((z7o) obj).a;
                        Throwable a2 = z7o.a(obj2);
                        if (a2 == null) {
                            com.yandex.passport.internal.entities.a0 a0Var = (com.yandex.passport.internal.entities.a0) obj2;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "showVpnBlockerIfNeeded: " + a0Var, 8);
                            }
                            if (a0Var instanceof com.yandex.passport.internal.entities.y) {
                                this.x.a(((com.yandex.passport.internal.entities.y) a0Var).a);
                            } else if (!Intrinsics.d(a0Var, com.yandex.passport.internal.entities.x.a) && !Intrinsics.d(a0Var, com.yandex.passport.internal.entities.z.a)) {
                                b6e.s();
                                return null;
                            }
                        } else {
                            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "showVpnBlockerIfNeeded failed", a2);
                            }
                        }
                        return Unit.a;
                    }
                    z2 = n0Var.k;
                    z = n0Var.j;
                    qgg.h0(obj);
                }
                a = z7o.a(((z7o) obj).a);
                if (a != null) {
                    com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "resetUserDisable failed", a);
                    }
                }
                j3 j3Var2 = new j3(z);
                f9f[] f9fVarArr2 = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class)};
                dq7 dq7Var22 = ca8.a;
                ocu ocuVar22 = new ocu(fVar, j3Var2, f9fVarArr2, continuation2, 21);
                n0Var.j = z;
                n0Var.k = z2;
                n0Var.n = 2;
                obj = x97.V(dq7Var22, ocuVar22, n0Var);
            }
        }
        n0Var = new n0(this, (cg6) continuation);
        Object obj3 = n0Var.l;
        nm6 nm6Var2 = nm6.a;
        i = n0Var.n;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        a = z7o.a(((z7o) obj3).a);
        if (a != null) {
        }
        j3 j3Var22 = new j3(z);
        f9f[] f9fVarArr22 = {ern.a(com.yandex.passport.api.exception.b.class), ern.a(com.yandex.passport.api.exception.a.class)};
        dq7 dq7Var222 = ca8.a;
        ocu ocuVar222 = new ocu(fVar, j3Var22, f9fVarArr22, continuation22, 21);
        n0Var.j = z;
        n0Var.k = z2;
        n0Var.n = 2;
        obj3 = x97.V(dq7Var222, ocuVar222, n0Var);
    }
}
