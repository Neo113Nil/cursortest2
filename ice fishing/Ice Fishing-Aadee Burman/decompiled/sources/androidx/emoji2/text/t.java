package androidx.emoji2.text;

import L3.F;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: n, reason: collision with root package name */
    public final Class f4800n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4801u;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f4801u = new ArrayList();
        F.f(cls, "watcherClass cannot be null");
        this.f4800n = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4801u;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).f4799u.incrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4801u;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).onTextChanged(this, 0, length(), length());
            i++;
        }
    }

    public final s c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4801u;
            if (i >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar.f4798n == obj) {
                return sVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f4800n == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i6) {
        super.delete(i, i6);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4801u;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).f4799u.decrementAndGet();
            i++;
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        s c9;
        if (d(obj) && (c9 = c(obj)) != null) {
            obj = c9;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        s c9;
        if (d(obj) && (c9 = c(obj)) != null) {
            obj = c9;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        s c9;
        if (d(obj) && (c9 = c(obj)) != null) {
            obj = c9;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i6, Class cls) {
        if (this.f4800n != cls) {
            return super.getSpans(i, i6, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i, i6, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            objArr[i9] = sVarArr[i9].f4798n;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i6, Class cls) {
        if (cls == null || this.f4800n == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i, i6, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        s sVar;
        if (d(obj)) {
            sVar = c(obj);
            if (sVar != null) {
                obj = sVar;
            }
        } else {
            sVar = null;
        }
        super.removeSpan(obj);
        if (sVar != null) {
            this.f4801u.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i6, CharSequence charSequence) {
        replace(i, i6, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i6, int i9) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f4801u.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i, i6, i9);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i6) {
        return new t(this.f4800n, this, i, i6);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i6) {
        super.delete(i, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i6, CharSequence charSequence, int i9, int i10) {
        replace(i, i6, charSequence, i9, i10);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i6, int i9) {
        super.insert(i, charSequence, i6, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i6, CharSequence charSequence) {
        a();
        super.replace(i, i6, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i6, int i9) {
        super.insert(i, charSequence, i6, i9);
        return this;
    }

    public t(Class cls, t tVar, int i, int i6) {
        super(tVar, i, i6);
        this.f4801u = new ArrayList();
        F.f(cls, "watcherClass cannot be null");
        this.f4800n = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i6, CharSequence charSequence, int i9, int i10) {
        a();
        super.replace(i, i6, charSequence, i9, i10);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i6) {
        super.append(charSequence, i, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i6) {
        super.append(charSequence, i, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i6) {
        super.append(charSequence, i, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
