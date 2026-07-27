package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.Cd, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2500Cd implements x2.o {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f24157a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f24158b;

    /* renamed from: c, reason: collision with root package name */
    public final int f24159c;

    /* renamed from: d, reason: collision with root package name */
    public final C3462kb f24160d;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f24162f;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f24161e = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final HashMap f24163g = new HashMap();

    public C2500Cd(HashSet hashSet, boolean z3, int i, C3462kb c3462kb, ArrayList arrayList, boolean z6) {
        this.f24157a = hashSet;
        this.f24158b = z3;
        this.f24159c = i;
        this.f24160d = c3462kb;
        this.f24162f = z6;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (str.startsWith("custom:")) {
                    String[] split = str.split(":", 3);
                    if (split.length == 3) {
                        String str2 = split[2];
                        if ("true".equals(str2)) {
                            this.f24163g.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(str2)) {
                            this.f24163g.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f24161e.add(str);
                }
            }
        }
    }

    @Override // x2.InterfaceC5190d
    public final int a() {
        return this.f24159c;
    }

    @Override // x2.InterfaceC5190d
    public final boolean b() {
        return this.f24162f;
    }

    @Override // x2.InterfaceC5190d
    public final boolean c() {
        return this.f24158b;
    }

    @Override // x2.InterfaceC5190d
    public final Set d() {
        return this.f24157a;
    }
}
