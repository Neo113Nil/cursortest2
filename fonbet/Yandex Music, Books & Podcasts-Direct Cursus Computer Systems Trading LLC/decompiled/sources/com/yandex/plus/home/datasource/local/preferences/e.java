package com.yandex.plus.home.datasource.local.preferences;

import android.content.SharedPreferences;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oqi;
import defpackage.qgg;
import defpackage.qqi;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e extends aur implements Function2 {
    public j j;
    public Object k;
    public Throwable l;
    public Object m;
    public String n;
    public int o;
    public int p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ j s;
    public final /* synthetic */ String t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.s = jVar;
        this.t = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        e eVar = new e(this.s, this.t, continuation);
        eVar.r = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0105 A[Catch: all -> 0x011a, TRY_LEAVE, TryCatch #3 {all -> 0x011a, blocks: (B:9:0x00f9, B:11:0x0105), top: B:8:0x00f9 }] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        String sb;
        oqi oqiVar;
        int i;
        j jVar;
        int i2;
        oqi oqiVar2;
        String str;
        String str2;
        Throwable th;
        nm6 nm6Var = nm6.a;
        int i3 = this.q;
        try {
            try {
                if (i3 == 0) {
                    qgg.h0(obj);
                    j jVar2 = this.s;
                    r7o r7oVar = z7o.b;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jVar2.b);
                    String str3 = this.t;
                    if (str3 != null) {
                        sb2.append("[" + str3 + ']');
                    }
                    sb = sb2.toString();
                    oqiVar = jVar2.g;
                    this.r = null;
                    this.j = jVar2;
                    this.k = oqiVar;
                    this.l = null;
                    this.m = sb;
                    i = 0;
                    this.o = 0;
                    this.p = 0;
                    this.q = 1;
                    if (oqiVar.a(this) != nm6Var) {
                        jVar = jVar2;
                        i2 = 0;
                    }
                    return nm6Var;
                }
                if (i3 != 1) {
                    if (i3 != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sb = this.n;
                    oqiVar2 = (oqi) this.m;
                    th = this.l;
                    str2 = (String) this.k;
                    jVar = this.j;
                    qgg.h0(obj);
                    try {
                        if (Intrinsics.d(jVar.h.get(sb), str2)) {
                            SharedPreferences sharedPreferences = jVar.f;
                            sharedPreferences.getClass();
                            SharedPreferences.Editor edit = sharedPreferences.edit();
                            edit.remove(sb);
                            edit.commit();
                            jVar.h.remove(sb);
                        }
                        oqiVar2.b(null);
                        throw new IllegalStateException(("Preferences by name='" + jVar.a + "' for key='" + sb + "' have invalid format encodedValue='" + str2 + "', message='" + th.getMessage() + '\'').toString());
                    } finally {
                        oqiVar2.b(null);
                    }
                }
                int i4 = this.p;
                int i5 = this.o;
                String str4 = (String) this.m;
                oqiVar = (oqi) this.k;
                j jVar3 = this.j;
                qgg.h0(obj);
                i2 = i5;
                i = i4;
                sb = str4;
                jVar = jVar3;
                LinkedHashMap linkedHashMap = jVar.h;
                if (linkedHashMap.containsKey(sb)) {
                    str = (String) linkedHashMap.get(sb);
                } else {
                    String string = jVar.f.getString(sb, null);
                    linkedHashMap.put(sb, string);
                    str = string;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (wis e) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th3) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th3);
        }
        if (str == null) {
            throw new IllegalStateException(("Preferences by name='" + jVar.a + "' don't contain key='" + sb + '\'').toString());
        }
        try {
            r7o r7oVar4 = z7o.b;
            t7oVar = jVar.d.b(jVar.c, str);
        } catch (Throwable th4) {
            r7o r7oVar5 = z7o.b;
            t7oVar = new t7o(th4);
        }
        Throwable a = z7o.a(t7oVar);
        if (a == null) {
            return new z7o(t7oVar);
        }
        qqi qqiVar = jVar.g;
        this.r = null;
        this.j = jVar;
        this.k = str;
        this.l = a;
        this.m = qqiVar;
        this.n = sb;
        this.o = i2;
        this.p = i;
        this.q = 2;
        if (qqiVar.a(this) != nm6Var) {
            oqiVar2 = qqiVar;
            str2 = str;
            th = a;
            if (Intrinsics.d(jVar.h.get(sb), str2)) {
            }
            oqiVar2.b(null);
            throw new IllegalStateException(("Preferences by name='" + jVar.a + "' for key='" + sb + "' have invalid format encodedValue='" + str2 + "', message='" + th.getMessage() + '\'').toString());
        }
        return nm6Var;
    }
}
