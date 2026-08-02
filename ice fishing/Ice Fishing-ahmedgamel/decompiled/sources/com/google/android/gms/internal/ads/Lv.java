package com.google.android.gms.internal.ads;

import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Lv {

    /* renamed from: a, reason: collision with root package name */
    public final String f26983a;

    /* renamed from: b, reason: collision with root package name */
    public final m2.b f26984b;

    /* renamed from: c, reason: collision with root package name */
    public final String f26985c;

    public /* synthetic */ Lv(C3504ku c3504ku) {
        this.f26983a = (String) c3504ku.f32445u;
        this.f26984b = (m2.b) c3504ku.f32446v;
        this.f26985c = (String) c3504ku.f32447w;
    }

    public final String a() {
        m2.b bVar = this.f26984b;
        return bVar == null ? com.anythink.core.common.v.m.f17596e : bVar.name().toLowerCase(Locale.ENGLISH);
    }

    public final boolean equals(Object obj) {
        m2.b bVar;
        m2.b bVar2;
        if (obj instanceof Lv) {
            Lv lv = (Lv) obj;
            if (this.f26983a.equals(lv.f26983a) && (bVar = this.f26984b) != null && (bVar2 = lv.f26984b) != null && bVar.equals(bVar2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f26983a, this.f26984b);
    }
}
