package com.yandex.plus.core.activity.result.internal;

import android.app.Application;
import android.os.Build;
import android.os.Process;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u;
import defpackage.bsd;
import defpackage.c5b;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.hlr;
import defpackage.j5h;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.tah;
import defpackage.uh;
import defpackage.vh;
import defpackage.wis;
import defpackage.wwd;
import defpackage.x97;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.ydr;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class h extends u {
    public static final h d = new h();
    public Application a;
    public final ArrayList b = new ArrayList();
    public final xdr c = ydr.a(c5b.a);

    public static final void L(h hVar) {
        String myProcessName = Build.VERSION.SDK_INT >= 33 ? Process.myProcessName() : "доступно с 13 андроида :c";
        myProcessName.getClass();
        StringBuilder u = ouj.u("\n            'com.yandex.plus.core.activity.result.internal.ActivityWithResultLauncherImpl' не инициализирован!\n            Возможно, вы вызываете эту функцию вне процесса инициализации объекта класса!\n            Название текущего процесса: ", myProcessName, "\n            Идентификатор текущего процесса: ");
        u.append(Process.myPid());
        u.append("\n            \n            Если есть необходимость использовать данный функционал не из основного процесса,\n            то необходимо прописать в AndroidManifest.xml `InitializationProvider` со значением параметра \n            android:authorities, отличным от \"$\\{applicationId}.androidx-startup\", и добавить ему\n            название дочернего процесса после двоеточия в параметр android:process.\n            Также нужно добавить тег android:process для \n            `com.yandex.plus.core.activity.result.internal.PlusProxyActivity`.\n            Пример:\n            ```\n            <activity\n                android:name=\"com.yandex.plus.core.activity.result.internal.PlusProxyActivity\"\n                android:process=\":customProc\"\n                tools:node=\"merge\" />\n                \n            <provider\n                android:name=\"androidx.startup.InitializationProvider\"\n                android:authorities=\"$\\{applicationId}.androidx-startup\"\n                android:process=\":customProc\"\n                tools:node=\"merge\">\n            ```\n            ");
        throw new IllegalStateException(hlr.d(u.toString()).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object A(String[] strArr, Continuation continuation) {
        e eVar;
        int i;
        Object u;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i2 = eVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.m = i2 - Integer.MIN_VALUE;
                Object obj = eVar.k;
                Object obj2 = nm6.a;
                i = eVar.m;
                if (i != 0) {
                    qgg.h0(obj);
                    uh vhVar = new vh(2);
                    eVar.j = strArr;
                    eVar.m = 1;
                    u = u(vhVar, strArr, eVar);
                    if (u == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strArr = eVar.j;
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                }
                if (z7o.a(u) != null) {
                    return u;
                }
                int a = tah.a(strArr.length);
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (String str : strArr) {
                    linkedHashMap.put(str, Boolean.FALSE);
                }
                return linkedHashMap;
            }
        }
        eVar = new e(this, (cg6) continuation);
        Object obj3 = eVar.k;
        Object obj22 = nm6.a;
        i = eVar.m;
        if (i != 0) {
        }
        if (z7o.a(u) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(String str, Continuation continuation) {
        c cVar;
        int i;
        Object u;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i2 = cVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cVar.j;
                Object obj2 = nm6.a;
                i = cVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    uh vhVar = new vh(0);
                    cVar.l = 1;
                    u = u(vhVar, str, cVar);
                    if (u == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    u = ((z7o) obj).a;
                }
                return z7o.a(u) != null ? u : c5b.a;
            }
        }
        cVar = new c(this, (cg6) continuation);
        Object obj3 = cVar.j;
        Object obj22 = nm6.a;
        i = cVar.l;
        if (i != 0) {
        }
        if (z7o.a(u) != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // com.yandex.plus.bdui.plus.checkout.content.serializer.dto.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(uh uhVar, Object obj, cg6 cg6Var) {
        d dVar;
        int i;
        try {
            if (cg6Var instanceof d) {
                dVar = (d) cg6Var;
                int i2 = dVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    dVar.l = i2 - Integer.MIN_VALUE;
                    Object obj2 = dVar.j;
                    nm6 nm6Var = nm6.a;
                    i = dVar.l;
                    if (i != 0) {
                        qgg.h0(obj2);
                        r7o r7oVar = z7o.b;
                        dq7 dq7Var = ca8.a;
                        bsd bsdVar = j5h.a.g;
                        wwd wwdVar = new wwd(this, uhVar, obj, null, 4);
                        dVar.l = 1;
                        obj2 = x97.V(bsdVar, wwdVar, dVar);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                    }
                    r7o r7oVar2 = z7o.b;
                    return obj2;
                }
            }
            if (i != 0) {
            }
            r7o r7oVar22 = z7o.b;
            return obj2;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            return new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            return new t7o(th);
        }
        dVar = new d(this, cg6Var);
        Object obj22 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
    }
}
