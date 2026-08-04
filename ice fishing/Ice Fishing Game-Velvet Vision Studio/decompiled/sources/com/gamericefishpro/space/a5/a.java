package com.gamericefishpro.space.a5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.h1.m;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.n7.q;
import com.gamericefishpro.space.t0.r;
import com.gamericefishpro.space.z4.u;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ com.gamericefishpro.space.oh.d y;

    public /* synthetic */ a(int i, Function2 function2, Function1 function1, Function0 function0, q qVar, int i2) {
        this.d = 2;
        this.e = i;
        this.i = function2;
        this.y = function1;
        this.v = function0;
        this.w = qVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.d9.h.g((Boolean) this.i, this.v, (u) this.w, (Function1) this.y, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                a4.b((m) this.i, (String) this.v, (com.gamericefishpro.space.u1.f) this.w, (Function0) this.y, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iD = com.gamericefishpro.space.t0.i.D(1);
                com.gamericefishpro.space.n7.f.a(this.e, (Function2) this.i, (Function1) this.y, (Function0) this.v, (q) this.w, (r) obj, iD);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iD2 = com.gamericefishpro.space.t0.i.D(1);
                y3.f((Map) this.i, this.e, (com.gamericefishpro.space.i7.d) this.v, (Function1) this.y, (Function1) this.w, (r) obj, iD2);
                break;
            default:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.d9.h.e((String) this.i, (String) this.v, (m) this.w, (Function0) this.y, (r) obj, com.gamericefishpro.space.t0.i.D(this.e | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, com.gamericefishpro.space.oh.d dVar, int i, int i2) {
        this.d = i2;
        this.i = obj;
        this.v = obj2;
        this.w = obj3;
        this.y = dVar;
        this.e = i;
    }

    public /* synthetic */ a(Map map, int i, com.gamericefishpro.space.i7.d dVar, Function1 function1, Function1 function2, int i2) {
        this.d = 3;
        this.i = map;
        this.e = i;
        this.v = dVar;
        this.y = function1;
        this.w = function2;
    }
}
