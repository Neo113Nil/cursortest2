package com.yandex.passport.internal.database;

import defpackage.e58;
import defpackage.iye;
import defpackage.yeo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class PassportDatabase_Impl extends PassportDatabase {
    public volatile com.yandex.passport.internal.database.diary.c n;
    public volatile com.yandex.passport.internal.database.diary.e o;
    public volatile com.yandex.passport.internal.database.auth_cookie.d p;

    @Override // defpackage.ueo
    public final iye d() {
        return new iye(this, new HashMap(0), new HashMap(0), "diary_method", "diary_parameter", "diary_upload", "modern_auth_cookie");
    }

    @Override // defpackage.ueo
    public final yeo e() {
        return new e58(this);
    }

    @Override // defpackage.ueo
    public final List h(LinkedHashMap linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(1, 2, 1));
        return arrayList;
    }

    @Override // defpackage.ueo
    public final Set l() {
        return new HashSet();
    }

    @Override // defpackage.ueo
    public final Map n() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(com.yandex.passport.internal.database.diary.c.class, list);
        hashMap.put(com.yandex.passport.internal.database.diary.e.class, list);
        hashMap.put(com.yandex.passport.internal.database.auth_cookie.d.class, list);
        return hashMap;
    }

    @Override // com.yandex.passport.internal.database.PassportDatabase
    public final com.yandex.passport.internal.database.auth_cookie.d v() {
        com.yandex.passport.internal.database.auth_cookie.d dVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new com.yandex.passport.internal.database.auth_cookie.d(this);
                }
                dVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // com.yandex.passport.internal.database.PassportDatabase
    public final com.yandex.passport.internal.database.diary.c w() {
        com.yandex.passport.internal.database.diary.c cVar;
        if (this.n != null) {
            return this.n;
        }
        synchronized (this) {
            try {
                if (this.n == null) {
                    this.n = new com.yandex.passport.internal.database.diary.c(this);
                }
                cVar = this.n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    @Override // com.yandex.passport.internal.database.PassportDatabase
    public final com.yandex.passport.internal.database.diary.e x() {
        com.yandex.passport.internal.database.diary.e eVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new com.yandex.passport.internal.database.diary.e(this);
                }
                eVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }
}
