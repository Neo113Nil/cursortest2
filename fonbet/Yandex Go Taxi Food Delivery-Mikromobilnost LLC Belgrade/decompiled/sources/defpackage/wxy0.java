package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class wxy0 {
    public final View a;
    public final TextView b;
    public final View c;
    public final Drawable d;
    public final int e;
    public final int f;

    public wxy0(View view, TextView textView, View view2, Drawable drawable, int i, int i2) {
        this.a = view;
        this.b = textView;
        this.c = view2;
        this.d = drawable;
        this.e = i;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxy0)) {
            return false;
        }
        wxy0 wxy0Var = (wxy0) obj;
        return this.a.equals(wxy0Var.a) && this.b.equals(wxy0Var.b) && this.c.equals(wxy0Var.c) && jl40.l(this.d, wxy0Var.d) && this.e == wxy0Var.e && this.f == wxy0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        Drawable drawable = this.d;
        return Integer.hashCode(this.f) + oyr.b(this.e, (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ViewHolder(overlayView=");
        sb.append(this.a);
        sb.append(", countTextView=");
        sb.append(this.b);
        sb.append(", dotView=");
        sb.append(this.c);
        sb.append(", sobakaDrawable=");
        sb.append(this.d);
        sb.append(", sobakaEndPadding=");
        return ly3.k(this.e, this.f, ", textPadding=", Extension.C_BRAKE, sb);
    }
}
