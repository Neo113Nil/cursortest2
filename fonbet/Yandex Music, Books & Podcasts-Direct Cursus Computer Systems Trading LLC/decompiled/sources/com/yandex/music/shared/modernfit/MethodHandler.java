package com.yandex.music.shared.modernfit;

import androidx.annotation.Keep;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.cg6;
import defpackage.hbt;
import defpackage.l3i;
import defpackage.m3i;
import defpackage.n3i;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.pz0;
import defpackage.qgg;
import defpackage.uaf;
import defpackage.w4i;
import defpackage.xdh;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.y7g;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001J$\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0010\u0010\u0003\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0002H\u0083@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/music/shared/modernfit/MethodHandler;", "", "", "args", "suspendInvoke", "([Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shared-modernfit"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class MethodHandler {
    public final Object a;
    public final Method b;
    public final xdh c;
    public final String d;
    public final Method e;
    public final uaf f;
    public final String g;

    public MethodHandler(Object obj, Method method, xdh xdhVar, String str, w4i w4iVar, List list) {
        obj.getClass();
        list.getClass();
        this.a = obj;
        this.b = method;
        this.c = xdhVar;
        this.d = str;
        Method declaredMethod = MethodHandler.class.getDeclaredMethod("suspendInvoke", Object[].class, Continuation.class);
        declaredMethod.setAccessible(true);
        this.e = declaredMethod;
        uaf uafVar = new uaf(method, str, w4iVar, list);
        this.f = uafVar;
        this.g = uafVar.c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Keep
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object suspendInvoke(Object[] objArr, Continuation<Object> continuation) {
        n3i n3iVar;
        Object obj;
        int i;
        Type type;
        String str;
        Type type2;
        String str2;
        if (continuation instanceof n3i) {
            n3iVar = (n3i) continuation;
            int i2 = n3iVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n3iVar.o = i2 - Integer.MIN_VALUE;
                obj = n3iVar.m;
                Object obj2 = nm6.a;
                i = n3iVar.o;
                Method method = this.b;
                if (i != 0) {
                    qgg.h0(obj);
                    String a = this.f.a(objArr);
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    genericParameterTypes.getClass();
                    Object K = xz0.K(genericParameterTypes);
                    K.getClass();
                    Type type3 = ((ParameterizedType) K).getActualTypeArguments()[0];
                    type3.getClass();
                    type = ((WildcardType) type3).getLowerBounds()[0];
                    type.getClass();
                    n3iVar.j = objArr;
                    n3iVar.k = a;
                    n3iVar.l = type;
                    n3iVar.o = 1;
                    Object c = c(a, type, objArr, n3iVar);
                    if (c != obj2) {
                        str = a;
                        obj = c;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    type2 = n3iVar.l;
                    str2 = n3iVar.k;
                    qgg.h0(obj);
                    n3iVar.j = null;
                    n3iVar.k = null;
                    n3iVar.l = null;
                    n3iVar.o = 3;
                    Object b = b(str2, type2, obj, n3iVar);
                    return b != obj2 ? obj2 : b;
                }
                Type type4 = n3iVar.l;
                String str3 = n3iVar.k;
                Object[] objArr2 = n3iVar.j;
                qgg.h0(obj);
                type = type4;
                objArr = objArr2;
                str = str3;
                if (obj == null) {
                    return obj;
                }
                n3iVar.j = objArr;
                n3iVar.k = str;
                n3iVar.l = type;
                n3iVar.o = 2;
                pz0 pz0Var = new pz0(2);
                pz0Var.c(objArr);
                pz0Var.b(n3iVar);
                ArrayList arrayList = pz0Var.a;
                obj = y7g.p(this.a, method, arrayList.toArray(new Object[arrayList.size()]));
                obj.getClass();
                if (obj != obj2) {
                    type2 = type;
                    str2 = str;
                    n3iVar.j = null;
                    n3iVar.k = null;
                    n3iVar.l = null;
                    n3iVar.o = 3;
                    Object b2 = b(str2, type2, obj, n3iVar);
                    if (b2 != obj2) {
                    }
                }
            }
        }
        n3iVar = new n3i(this, continuation);
        obj = n3iVar.m;
        Object obj22 = nm6.a;
        i = n3iVar.o;
        Method method2 = this.b;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Type type, Object obj, cg6 cg6Var) {
        l3i l3iVar;
        int i;
        if (cg6Var instanceof l3i) {
            l3iVar = (l3i) cg6Var;
            int i2 = l3iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l3iVar.m = i2 - Integer.MIN_VALUE;
                l3i l3iVar2 = l3iVar;
                Object obj2 = l3iVar2.k;
                nm6 nm6Var = nm6.a;
                i = l3iVar2.m;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Object obj3 = l3iVar2.j;
                    qgg.h0(obj2);
                    return obj3;
                }
                qgg.h0(obj2);
                if (!this.f.d) {
                    return obj;
                }
                str.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                l3iVar2.j = obj;
                l3iVar2.m = 1;
                return this.c.J(str, type, obj, currentTimeMillis, l3iVar2) == nm6Var ? nm6Var : obj;
            }
        }
        l3iVar = new l3i(this, cg6Var);
        l3i l3iVar22 = l3iVar;
        Object obj22 = l3iVar22.k;
        nm6 nm6Var2 = nm6.a;
        i = l3iVar22.m;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Type type, Object[] objArr, cg6 cg6Var) {
        m3i m3iVar;
        int i;
        boolean z;
        Pair pair;
        if (cg6Var instanceof m3i) {
            m3iVar = (m3i) cg6Var;
            int i2 = m3iVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m3iVar.l = i2 - Integer.MIN_VALUE;
                Object obj = m3iVar.j;
                Object obj2 = nm6.a;
                i = m3iVar.l;
                uaf uafVar = this.f;
                if (i != 0) {
                    qgg.h0(obj);
                    if (uafVar.e) {
                        objArr.getClass();
                        throw ouj.g(objArr[uafVar.g]);
                    }
                    objArr.getClass();
                    int i3 = uafVar.h;
                    if (i3 != -1) {
                        Object obj3 = objArr[i3];
                        obj3.getClass();
                        if (((Boolean) obj3).booleanValue()) {
                            z = true;
                            if (!uafVar.d && !z) {
                                str.getClass();
                                m3iVar.l = 1;
                                obj = this.c.e(str, type, m3iVar);
                                if (obj == obj2) {
                                    return obj2;
                                }
                            }
                        }
                    }
                    z = false;
                    return !uafVar.d ? null : null;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                pair = (Pair) obj;
                if (pair != null) {
                    if (this.d == null) {
                        return null;
                    }
                    String str2 = uafVar.c;
                    return null;
                }
                Object obj4 = pair.a;
                long longValue = ((Number) pair.b).longValue();
                hbt hbtVar = uafVar.f;
                hbtVar.getClass();
                if (System.currentTimeMillis() - longValue > hbtVar.unit().toMillis(hbtVar.time())) {
                    return null;
                }
                return obj4;
            }
        }
        m3iVar = new m3i(this, cg6Var);
        Object obj5 = m3iVar.j;
        Object obj22 = nm6.a;
        i = m3iVar.l;
        uaf uafVar2 = this.f;
        if (i != 0) {
        }
        pair = (Pair) obj5;
        if (pair != null) {
        }
    }
}
