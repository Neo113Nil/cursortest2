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
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class i extends aur implements Function2 {
    public j j;
    public Object k;
    public qqi l;
    public String m;
    public String n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ j r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Object obj, j jVar, String str, Continuation continuation) {
        super(2, continuation);
        this.q = obj;
        this.r = jVar;
        this.s = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        i iVar = new i(this.q, this.r, this.s, continuation);
        iVar.p = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((i) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        t7o t7oVar;
        Object obj2;
        String sb;
        String c;
        j jVar;
        qqi qqiVar;
        j jVar2;
        oqi oqiVar;
        nm6 nm6Var = nm6.a;
        int i = this.o;
        try {
            if (i == 0) {
                qgg.h0(obj);
                j jVar3 = this.r;
                r7o r7oVar = z7o.b;
                StringBuilder sb2 = new StringBuilder();
                String str = jVar3.b;
                qqi qqiVar2 = jVar3.g;
                sb2.append(str);
                String str2 = this.s;
                if (str2 != null) {
                    sb2.append("[" + str2 + ']');
                }
                sb = sb2.toString();
                Object obj3 = this.q;
                if (obj3 == null) {
                    this.p = null;
                    this.j = jVar3;
                    this.k = qqiVar2;
                    this.l = null;
                    this.m = sb;
                    this.o = 1;
                    if (qqiVar2.a(this) != nm6Var) {
                        jVar2 = jVar3;
                        oqiVar = qqiVar2;
                        SharedPreferences sharedPreferences = jVar2.f;
                        sharedPreferences.getClass();
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.remove(sb);
                        edit.commit();
                        oqiVar.b(null);
                    }
                } else {
                    c = jVar3.d.c(jVar3.c, obj3);
                    this.p = null;
                    this.j = jVar3;
                    this.k = c;
                    this.l = qqiVar2;
                    this.m = null;
                    this.n = sb;
                    this.o = 2;
                    if (qqiVar2.a(this) != nm6Var) {
                        jVar = jVar3;
                        qqiVar = qqiVar2;
                        SharedPreferences sharedPreferences2 = jVar.f;
                        sharedPreferences2.getClass();
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.putString(sb, c);
                        edit2.commit();
                        jVar.h.put(sb, c);
                    }
                }
                return nm6Var;
            }
            if (i == 1) {
                sb = this.m;
                oqiVar = (oqi) this.k;
                jVar2 = this.j;
                qgg.h0(obj);
                try {
                    SharedPreferences sharedPreferences3 = jVar2.f;
                    sharedPreferences3.getClass();
                    SharedPreferences.Editor edit3 = sharedPreferences3.edit();
                    edit3.remove(sb);
                    edit3.commit();
                    oqiVar.b(null);
                } finally {
                }
            } else {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sb = this.n;
                qqiVar = this.l;
                c = (String) this.k;
                jVar = this.j;
                qgg.h0(obj);
                try {
                    SharedPreferences sharedPreferences22 = jVar.f;
                    sharedPreferences22.getClass();
                    SharedPreferences.Editor edit22 = sharedPreferences22.edit();
                    edit22.putString(sb, c);
                    edit22.commit();
                    jVar.h.put(sb, c);
                } finally {
                }
            }
            obj2 = Unit.a;
            r7o r7oVar2 = z7o.b;
        } catch (wis e) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(e);
            obj2 = t7oVar;
            return new z7o(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            r7o r7oVar4 = z7o.b;
            t7oVar = new t7o(th);
            obj2 = t7oVar;
            return new z7o(obj2);
        }
        return new z7o(obj2);
    }
}
