package androidx.emoji2.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t extends SpannableStringBuilder {

    /* renamed from: n, reason: collision with root package name */
    public final Class f4768n;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f4769u;

    public t(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f4769u = new ArrayList();
        A8.b.e(cls, "watcherClass cannot be null");
        this.f4768n = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4769u;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).f4767u.incrementAndGet();
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
            ArrayList arrayList = this.f4769u;
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
            ArrayList arrayList = this.f4769u;
            if (i >= arrayList.size()) {
                return null;
            }
            s sVar = (s) arrayList.get(i);
            if (sVar.f4766n == obj) {
                return sVar;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj != null) {
            return this.f4768n == obj.getClass();
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4769u;
            if (i >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i)).f4767u.decrementAndGet();
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
    public final Object[] getSpans(int i, int i4, Class cls) {
        if (this.f4768n != cls) {
            return super.getSpans(i, i4, cls);
        }
        s[] sVarArr = (s[]) super.getSpans(i, i4, s.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, sVarArr.length);
        for (int i6 = 0; i6 < sVarArr.length; i6++) {
            objArr[i6] = sVarArr[i6].f4766n;
        }
        return objArr;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i4, Class cls) {
        if (cls == null || this.f4768n == cls) {
            cls = s.class;
        }
        return super.nextSpanTransition(i, i4, cls);
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
            this.f4769u.remove(sVar);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence) {
        replace(i, i4, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i4, int i6) {
        if (d(obj)) {
            s sVar = new s(obj);
            this.f4769u.add(sVar);
            obj = sVar;
        }
        super.setSpan(obj, i, i4, i6);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i4) {
        return new t(this.f4768n, this, i, i4);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i4) {
        super.delete(i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i4, CharSequence charSequence, int i6, int i9) {
        replace(i, i4, charSequence, i6, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i4, int i6) {
        super.insert(i, charSequence, i4, i6);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence) {
        a();
        super.replace(i, i4, charSequence);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c9) {
        super.append(c9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i4, int i6) {
        super.insert(i, charSequence, i4, i6);
        return this;
    }

    public t(Class cls, t tVar, int i, int i4) {
        super(tVar, i, i4);
        this.f4769u = new ArrayList();
        A8.b.e(cls, "watcherClass cannot be null");
        this.f4768n = cls;
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
    public final SpannableStringBuilder replace(int i, int i4, CharSequence charSequence, int i6, int i9) {
        a();
        super.replace(i, i4, charSequence, i6, i9);
        e();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i4) {
        super.append(charSequence, i, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
