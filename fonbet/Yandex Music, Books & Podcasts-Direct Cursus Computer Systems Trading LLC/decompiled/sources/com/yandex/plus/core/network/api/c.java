package com.yandex.plus.core.network.api;

import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.d0o;
import defpackage.os3;
import retrofit2.Call;

/* loaded from: classes4.dex */
public final class c implements Call {
    public final /* synthetic */ int a;
    public final Call b;

    public c(Call call, int i) {
        this.a = i;
        switch (i) {
            case 1:
                call.getClass();
                this.b = call;
                break;
            default:
                call.getClass();
                this.b = call;
                break;
        }
    }

    @Override // retrofit2.Call
    public final void D(os3 os3Var) {
        switch (this.a) {
            case 0:
                this.b.D(new b(os3Var, this));
                break;
            default:
                Call call = this.b;
                f fVar = new f(7, this, os3Var);
                try {
                    call.D(fVar);
                    break;
                } catch (Throwable th) {
                    fVar.A(call, th);
                }
        }
    }

    @Override // retrofit2.Call
    public final d0o a() {
        switch (this.a) {
            case 0:
                d0o a = this.b.a();
                a.getClass();
                return a;
            default:
                d0o a2 = this.b.a();
                a2.getClass();
                return a2;
        }
    }

    @Override // retrofit2.Call
    public final void cancel() {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                this.b.cancel();
                break;
        }
    }

    @Override // retrofit2.Call
    /* renamed from: clone, reason: collision with other method in class */
    public final Call mo12clone() {
        switch (this.a) {
            case 0:
                return new c(this.b.mo12clone(), 0);
            default:
                return new c(this.b.mo12clone(), 1);
        }
    }

    @Override // retrofit2.Call
    public final boolean o() {
        switch (this.a) {
        }
        return this.b.o();
    }

    public final Object clone() {
        switch (this.a) {
            case 0:
                return new c(this.b.mo12clone(), 0);
            default:
                return mo12clone();
        }
    }
}
