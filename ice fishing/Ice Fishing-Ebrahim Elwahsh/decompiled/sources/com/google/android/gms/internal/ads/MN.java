package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class MN {

    /* renamed from: a, reason: collision with root package name */
    public final String f26331a;

    /* renamed from: b, reason: collision with root package name */
    public final TP f26332b;

    /* renamed from: c, reason: collision with root package name */
    public final TP f26333c;

    /* renamed from: d, reason: collision with root package name */
    public final int f26334d;

    /* renamed from: e, reason: collision with root package name */
    public final int f26335e;

    public MN(String str, TP tp, TP tp2, int i, int i4) {
        boolean z8;
        if (i != 0) {
            z8 = false;
            i4 = i4 == 0 ? 0 : i4;
            PA.n(z8);
            PA.n(true ^ TextUtils.isEmpty(str));
            this.f26331a = str;
            this.f26332b = tp;
            tp2.getClass();
            this.f26333c = tp2;
            this.f26334d = i;
            this.f26335e = i4;
        }
        z8 = true;
        PA.n(z8);
        PA.n(true ^ TextUtils.isEmpty(str));
        this.f26331a = str;
        this.f26332b = tp;
        tp2.getClass();
        this.f26333c = tp2;
        this.f26334d = i;
        this.f26335e = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && MN.class == obj.getClass()) {
            MN mn = (MN) obj;
            if (this.f26334d == mn.f26334d && this.f26335e == mn.f26335e && this.f26331a.equals(mn.f26331a) && this.f26332b.equals(mn.f26332b) && this.f26333c.equals(mn.f26333c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f26333c.hashCode() + ((this.f26332b.hashCode() + ((this.f26331a.hashCode() + ((((this.f26334d + 527) * 31) + this.f26335e) * 31)) * 31)) * 31);
    }
}
