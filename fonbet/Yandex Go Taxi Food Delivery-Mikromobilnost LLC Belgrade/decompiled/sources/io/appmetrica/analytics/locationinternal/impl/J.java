package io.appmetrica.analytics.locationinternal.impl;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import defpackage.kbs;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.cache.CachedDataProvider;
import io.appmetrica.analytics.coreutils.internal.permission.SinglePermissionStrategy;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import io.appmetrica.analytics.locationinternal.internal.config.LocationConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes9.dex */
public final class J implements CachedDataProvider, InterfaceC0926a0 {
    public static final I h = new I();
    public static final P0 i = new P0();
    public final TelephonyManager a;
    public C0933c b;
    public final CachedDataProvider.CachedData c;
    public final Context d;
    public final C0983s e;
    public final InterfaceC0964l0 f;
    public final SinglePermissionStrategy g;

    public J(Context context, PermissionExtractor permissionExtractor, InterfaceC0964l0 interfaceC0964l0) {
        long j = i.a;
        this.c = new CachedDataProvider.CachedData(j, 2 * j, "cells");
        this.d = context;
        TelephonyManager telephonyManager = null;
        try {
            Object systemService = context.getSystemService("phone");
            if (systemService instanceof TelephonyManager) {
                telephonyManager = (TelephonyManager) systemService;
            }
        } catch (Throwable unused) {
        }
        this.a = telephonyManager;
        this.g = new C0925a(permissionExtractor).a();
        this.e = new C0983s(this, permissionExtractor);
        this.f = interfaceC0964l0;
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0926a0
    public final synchronized void a(LocationConfig locationConfig) {
        long j = locationConfig.getCacheControl().a;
        this.c.setExpirationPolicy(j, 2 * j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
    
        if (r0.d == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean b() {
        boolean z;
        C0933c c0933c = this.b;
        z = (c0933c == null || (r0 = c0933c.c) == null) ? false : true;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000c, code lost:
    
        if (r0.e == true) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean c() {
        boolean z;
        C0933c c0933c = this.b;
        z = (c0933c == null || (r0 = c0933c.c) == null) ? false : true;
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027 A[Catch: all -> 0x0012, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:3:0x0001, B:5:0x0009, B:8:0x001d, B:10:0x0027, B:15:0x0014), top: B:2:0x0001 }] */
    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0926a0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized List<C0966m> a() {
        List<C0966m> list;
        try {
            if (!this.c.isEmpty()) {
                if (this.c.shouldUpdateData()) {
                }
                list = (List) this.c.getData();
                if (list == null) {
                    list = EmptyList.a;
                }
            }
            this.c.setData(g());
            list = (List) this.c.getData();
            if (list == null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return list;
    }

    public final List e() {
        return (List) SystemServiceUtils.accessSystemServiceSafely(this.a, "getting all cell info", "telephony manager", new kbs(15));
    }

    public final Context f() {
        return this.d;
    }

    public final List<C0966m> g() {
        List e;
        ArrayList arrayList = new ArrayList();
        if (this.g.hasNecessaryPermissions(this.d) && b() && (e = e()) != null) {
            Iterator it = e.iterator();
            while (it.hasNext()) {
                C0966m a = ((C0960k) this.f).a((CellInfo) it.next());
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            return kotlin.collections.a.J0(arrayList);
        }
        C0966m b = this.e.b();
        if (b == null) {
            return null;
        }
        return Collections.singletonList(b);
    }

    public final TelephonyManager h() {
        return this.a;
    }

    public static final List a(TelephonyManager telephonyManager) {
        return telephonyManager.getAllCellInfo();
    }

    @Override // io.appmetrica.analytics.locationinternal.impl.InterfaceC0926a0, io.appmetrica.analytics.locationinternal.impl.J0
    public final synchronized void a(C0933c c0933c) {
        this.b = c0933c;
        ((C0960k) this.f).a.a(c0933c);
    }

    public J(ServiceContext serviceContext) {
        this(serviceContext.getContext(), serviceContext.getLocationServiceApi().getPermissionExtractor(), new C0960k());
    }
}
