package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2520Cd implements z2.n {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f24892a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24893b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24894c;

    /* renamed from: d, reason: collision with root package name */
    public final C3485kb f24895d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24897f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24896e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f24898g = new HashMap();

    public C2520Cd(HashSet hashSet, boolean z6, int i, C3485kb c3485kb, ArrayList arrayList, boolean z9) {
        this.f24892a = hashSet;
        this.f24893b = z6;
        this.f24894c = i;
        this.f24895d = c3485kb;
        this.f24897f = z9;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        String str2 = split[2];
                        if ("true".equals(str2)) {
                            this.f24898g.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f24898g.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f24896e.add(str);
                }
            }
        }
    }

    @Override // z2.InterfaceC5227d
    public final int a() {
        return this.f24894c;
    }

    @Override // z2.InterfaceC5227d
    public final boolean b() {
        return this.f24897f;
    }

    @Override // z2.InterfaceC5227d
    public final boolean c() {
        return this.f24893b;
    }

    @Override // z2.InterfaceC5227d
    public final Set d() {
        return this.f24892a;
    }
}
