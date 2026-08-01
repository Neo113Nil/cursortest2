package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Lv {

    /* renamed from: a, reason: collision with root package name */
    public final String f26192a;

    /* renamed from: b, reason: collision with root package name */
    public final k2.b f26193b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26194c;

    public /* synthetic */ Lv(C3481ku c3481ku) {
        this.f26192a = (String) c3481ku.f31663u;
        this.f26193b = (k2.b) c3481ku.f31664v;
        this.f26194c = (String) c3481ku.f31665w;
    }

    public final String a() {
        k2.b bVar = this.f26193b;
        return bVar == null ? com.anythink.core.common.v.m.f16809e : bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        k2.b bVar;
        k2.b bVar2;
        if (obj instanceof Lv) {
            Lv lv = (Lv) obj;
            if (this.f26192a.equals(lv.f26192a) && (bVar = this.f26193b) != null && (bVar2 = lv.f26193b) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26192a, this.f26193b);
    }
}
