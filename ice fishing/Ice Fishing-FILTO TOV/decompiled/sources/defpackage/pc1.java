package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class pc1 implements Spannable {
    public Spannable EljAMC1QTz;
    public boolean OOA6hdeuvCS = false;

    public pc1(Spannable spannable) {
        this.EljAMC1QTz = spannable;
    }

    public final void GWasM1elztuh() {
        Spannable spannable = this.EljAMC1QTz;
        if (!this.OOA6hdeuvCS) {
            if ((Build.VERSION.SDK_INT < 28 ? new x51(7) : new oc1(7)).EljAMC1QTz(spannable)) {
                this.EljAMC1QTz = new SpannableString(spannable);
            }
        }
        this.OOA6hdeuvCS = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.EljAMC1QTz.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.EljAMC1QTz.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.EljAMC1QTz.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.EljAMC1QTz.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.EljAMC1QTz.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.EljAMC1QTz.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.EljAMC1QTz.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.EljAMC1QTz.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.EljAMC1QTz.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        GWasM1elztuh();
        this.EljAMC1QTz.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        GWasM1elztuh();
        this.EljAMC1QTz.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.EljAMC1QTz.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.EljAMC1QTz.toString();
    }
}
