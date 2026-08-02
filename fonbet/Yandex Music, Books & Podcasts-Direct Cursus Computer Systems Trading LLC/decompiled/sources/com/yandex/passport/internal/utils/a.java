package com.yandex.passport.internal.utils;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.chip.Chip;
import defpackage.y5d;

/* loaded from: classes4.dex */
public final class a extends y5d {
    public final Chip b;

    public a(Chip chip) {
        this.b = chip;
    }

    @Override // defpackage.y5d
    public final void a(Drawable drawable) {
        this.b.setChipIcon(drawable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return this.b.equals(((a) obj).b);
        }
        return false;
    }

    @Override // defpackage.lhu
    public final View getView() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.y5d, defpackage.z8t
    public final Drawable q() {
        return this.b.getChipIcon();
    }
}
