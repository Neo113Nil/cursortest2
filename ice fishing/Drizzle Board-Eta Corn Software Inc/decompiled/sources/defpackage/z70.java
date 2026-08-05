package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class z70 extends SpannableStringBuilder {
    public final ArrayList MdtA4re8;
    public final Class NCTxEWno;

    public z70(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.MdtA4re8 = new ArrayList();
        fn.MdtA4re8(cls, "watcherClass cannot be null");
        this.NCTxEWno = cls;
    }

    public final y70 MdtA4re8(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.MdtA4re8;
            if (i >= arrayList.size()) {
                return null;
            }
            y70 y70Var = (y70) arrayList.get(i);
            if (y70Var.NCTxEWno == obj) {
                return y70Var;
            }
            i++;
        }
    }

    public final void NCTxEWno() {
        VgvYg0wo();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.MdtA4re8;
            if (i >= arrayList.size()) {
                return;
            }
            ((y70) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final void VgvYg0wo() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.MdtA4re8;
            if (i >= arrayList.size()) {
                return;
            }
            ((y70) arrayList.get(i)).MdtA4re8.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        y70 MdtA4re8;
        if (wxUZMvaN(obj) && (MdtA4re8 = MdtA4re8(obj)) != null) {
            obj = MdtA4re8;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        y70 MdtA4re8;
        if (wxUZMvaN(obj) && (MdtA4re8 = MdtA4re8(obj)) != null) {
            obj = MdtA4re8;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        y70 MdtA4re8;
        if (wxUZMvaN(obj) && (MdtA4re8 = MdtA4re8(obj)) != null) {
            obj = MdtA4re8;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.NCTxEWno != cls) {
            return super.getSpans(i, i2, cls);
        }
        y70[] y70VarArr = (y70[]) super.getSpans(i, i2, y70.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, y70VarArr.length);
        for (int i3 = 0; i3 < y70VarArr.length; i3++) {
            objArr[i3] = y70VarArr[i3].NCTxEWno;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        if (cls == null || this.NCTxEWno == cls) {
            cls = y70.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void qoPGr6Ce() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.MdtA4re8;
            if (i >= arrayList.size()) {
                return;
            }
            ((y70) arrayList.get(i)).MdtA4re8.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        y70 y70Var;
        if (wxUZMvaN(obj)) {
            y70Var = MdtA4re8(obj);
            if (y70Var != null) {
                obj = y70Var;
            }
        } else {
            y70Var = null;
        }
        super.removeSpan(obj);
        if (y70Var != null) {
            this.MdtA4re8.remove(y70Var);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        qoPGr6Ce();
        super.replace(i, i2, charSequence);
        VgvYg0wo();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (wxUZMvaN(obj)) {
            y70 y70Var = new y70(obj);
            this.MdtA4re8.add(y70Var);
            obj = y70Var;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new z70(this.NCTxEWno, this, i, i2);
    }

    public final boolean wxUZMvaN(Object obj) {
        if (obj != null) {
            return this.NCTxEWno == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        qoPGr6Ce();
        super.replace(i, i2, charSequence, i3, i4);
        VgvYg0wo();
        return this;
    }

    public z70(Class cls, z70 z70Var, int i, int i2) {
        super(z70Var, i, i2);
        this.MdtA4re8 = new ArrayList();
        fn.MdtA4re8(cls, "watcherClass cannot be null");
        this.NCTxEWno = cls;
    }
}
