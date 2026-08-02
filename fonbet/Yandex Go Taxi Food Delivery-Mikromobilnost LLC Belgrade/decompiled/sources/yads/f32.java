package yads;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import defpackage.cu81;
import defpackage.cvu0;
import defpackage.d881;
import defpackage.eb81;
import defpackage.ei71;
import defpackage.ev81;
import defpackage.evu0;
import defpackage.h73;
import defpackage.jl40;
import defpackage.l481;
import defpackage.ld71;
import defpackage.m581;
import defpackage.ms81;
import defpackage.ny61;
import defpackage.qb71;
import defpackage.ql71;
import defpackage.se71;
import defpackage.sv81;
import defpackage.tg81;
import defpackage.tje;
import defpackage.tse;
import defpackage.v4r0;
import defpackage.v571;
import defpackage.v881;
import defpackage.vb71;
import defpackage.vn61;
import defpackage.wls;
import defpackage.ycc;
import defpackage.zk61;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Result;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

/* loaded from: classes7.dex */
public final class f32 extends SuspendLambda implements wls {
    public int b;
    public final /* synthetic */ ei71 c;
    public final /* synthetic */ tg81 d;
    public final /* synthetic */ v881 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f32(ei71 ei71Var, tg81 tg81Var, v881 v881Var, Continuation continuation) {
        super(2, continuation);
        this.c = ei71Var;
        this.d = tg81Var;
        this.e = v881Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f32(this.c, this.d, this.e, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((f32) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0193 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01af  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var;
        m581 m581Var;
        Iterator it;
        Object failure;
        Bitmap bitmap;
        Object failure2;
        Bitmap bitmap2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.b;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return zy11Var2;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        zk61 zk61Var = this.c.a;
        tg81 tg81Var = this.d;
        v881 v881Var = this.e;
        this.b = 1;
        zk61Var.g.getClass();
        l481 l481Var = new l481();
        ql71 ql71Var = zk61Var.f;
        ql71Var.getClass();
        v571 v571Var = ql71Var.a;
        d881 d881Var = tg81Var.b;
        qb71 qb71Var = tg81Var.a;
        List list = qb71Var.a;
        v571Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ycc.r(v571.a(((se71) it2.next()).b), linkedHashSet);
        }
        List list2 = qb71Var.f;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Iterable iterable = ((ld71) it3.next()).d;
            if (iterable == null) {
                iterable = EmptyList.a;
            }
            ycc.r(iterable, linkedHashSet2);
        }
        Set h = v4r0.h(linkedHashSet, linkedHashSet2);
        eb81 eb81Var = ql71Var.b;
        eb81Var.getClass();
        Set u = kotlin.sequences.b.u(kotlin.sequences.b.o(kotlin.sequences.b.o(kotlin.sequences.b.l(new h73(1, qb71Var.a), new p52(eb81Var)), q52.w), r52.w));
        LinkedHashSet h2 = v4r0.h(h, u);
        if (!d881Var.x) {
            h = null;
        }
        if (h == null) {
            h = EmptySet.a;
        }
        LinkedHashSet h3 = v4r0.h(u, h);
        HashSet hashSet = new HashSet();
        for (Object obj2 : h3) {
            if (((cu81) obj2).f) {
                hashSet.add(obj2);
            }
        }
        Set g = v4r0.g(h2, hashSet);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : h2) {
            if (((cu81) obj3).g != null && (!evu0.J(r14))) {
                arrayList.add(obj3);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            cu81 cu81Var = (cu81) it4.next();
            v881Var.getClass();
            LinkedHashMap linkedHashMap = v881Var.c;
            String str = cu81Var.g;
            int i2 = cu81Var.b;
            int i3 = cu81Var.a;
            if (str != null) {
                zy11Var = zy11Var2;
                m581Var = new m581(str, new vn61(i3, i2));
            } else {
                zy11Var = zy11Var2;
                m581Var = null;
            }
            if ((m581Var != null ? (Bitmap) linkedHashMap.get(m581Var) : null) == null && v881Var.a(cu81Var) == null) {
                if (str == null) {
                    it = it4;
                } else {
                    l481Var.a.getClass();
                    try {
                        it = it4;
                    } catch (Throwable th) {
                        th = th;
                        it = it4;
                    }
                    try {
                        byte[] decode = Base64.decode(evu0.Q("data:image/png;base64,", str), 0);
                        if (!cvu0.x(str, "data:image/png;base64,", false)) {
                            decode = decode.length == 0 ? new byte[0] : defpackage.f73.r((byte[]) ms81.a.getValue(), decode);
                        }
                        failure = decode.length == 0 ? null : BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    } catch (Throwable th2) {
                        th = th2;
                        failure = new Result.Failure(th);
                        if (failure instanceof Result.Failure) {
                        }
                        bitmap = (Bitmap) failure;
                        if (bitmap == null) {
                        }
                        if (bitmap2 != null) {
                        }
                        bitmap2 = null;
                        if (bitmap2 != null) {
                        }
                        it4 = it;
                        zy11Var2 = zy11Var;
                    }
                    if (failure instanceof Result.Failure) {
                        failure = null;
                    }
                    bitmap = (Bitmap) failure;
                    if (bitmap == null) {
                        try {
                            l481Var.b.getClass();
                            failure2 = ev81.a(bitmap, cu81Var);
                        } catch (Throwable th3) {
                            failure2 = new Result.Failure(th3);
                        }
                        if (failure2 instanceof Result.Failure) {
                            failure2 = null;
                        }
                        bitmap2 = (Bitmap) failure2;
                    } else {
                        bitmap2 = null;
                    }
                    if (bitmap2 != null) {
                        l481Var.c.getClass();
                        try {
                            bitmap2 = sv81.a(bitmap2, 1.0d);
                        } catch (Throwable unused) {
                        }
                        if (bitmap2 != null) {
                            m581 m581Var2 = str != null ? new m581(str, new vn61(i3, i2)) : null;
                            if (m581Var2 != null) {
                                linkedHashMap.put(m581Var2, bitmap2);
                            }
                        }
                        it4 = it;
                    }
                }
                bitmap2 = null;
                if (bitmap2 != null) {
                }
                it4 = it;
            }
            zy11Var2 = zy11Var;
        }
        zy11 zy11Var3 = zy11Var2;
        if (jl40.l(tg81Var.b.t, "loading_on_back")) {
            vb71 vb71Var = zk61Var.e;
            vb71Var.getClass();
            tje.N(zk61Var.a, null, null, new a32(e.g(new e21(vb71Var, g, null)), v881Var, null), 3);
        }
        Object a = zk61Var.a(hashSet, v881Var, tg81Var, this);
        if (a != CoroutineSingletons.COROUTINE_SUSPENDED) {
            a = zy11Var3;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var3;
    }
}
