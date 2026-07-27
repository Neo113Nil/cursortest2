package kotlin.text;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class CatchingFishCustomViewJUnit extends SpannableStringBuilder {
    public final ArrayList CatchingFishDaggerWebsocket;
    public final Class CatchingFishReduxKtor;

    public CatchingFishCustomViewJUnit(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.CatchingFishDaggerWebsocket = new ArrayList();
        CatchingFishHiltMVPToast.CatchingFishWorkManager(cls, "watcherClass cannot be null");
        this.CatchingFishReduxKtor = cls;
    }

    public final CatchingFishMVIBundleHilt CatchingFishCoroutine(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.CatchingFishDaggerWebsocket;
            if (i >= arrayList.size()) {
                return null;
            }
            CatchingFishMVIBundleHilt catchingFishMVIBundleHilt = (CatchingFishMVIBundleHilt) arrayList.get(i);
            if (catchingFishMVIBundleHilt.CatchingFishReduxKtor == obj) {
                return catchingFishMVIBundleHilt;
            }
            i++;
        }
    }

    public final void CatchingFishDaggerWebsocket() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.CatchingFishDaggerWebsocket;
            if (i >= arrayList.size()) {
                return;
            }
            ((CatchingFishMVIBundleHilt) arrayList.get(i)).CatchingFishDaggerWebsocket.decrementAndGet();
            i++;
        }
    }

    public final void CatchingFishParcelableFAB() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.CatchingFishDaggerWebsocket;
            if (i >= arrayList.size()) {
                return;
            }
            ((CatchingFishMVIBundleHilt) arrayList.get(i)).CatchingFishDaggerWebsocket.incrementAndGet();
            i++;
        }
    }

    public final boolean CatchingFishReduxKtor(Object obj) {
        if (obj != null) {
            return this.CatchingFishReduxKtor == obj.getClass();
        }
        return false;
    }

    public final void CatchingFishSnackbar() {
        CatchingFishDaggerWebsocket();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.CatchingFishDaggerWebsocket;
            if (i >= arrayList.size()) {
                return;
            }
            ((CatchingFishMVIBundleHilt) arrayList.get(i)).onTextChanged(this, 0, length(), length());
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
        CatchingFishMVIBundleHilt CatchingFishCoroutine;
        if (CatchingFishReduxKtor(obj) && (CatchingFishCoroutine = CatchingFishCoroutine(obj)) != null) {
            obj = CatchingFishCoroutine;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        CatchingFishMVIBundleHilt CatchingFishCoroutine;
        if (CatchingFishReduxKtor(obj) && (CatchingFishCoroutine = CatchingFishCoroutine(obj)) != null) {
            obj = CatchingFishCoroutine;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        CatchingFishMVIBundleHilt CatchingFishCoroutine;
        if (CatchingFishReduxKtor(obj) && (CatchingFishCoroutine = CatchingFishCoroutine(obj)) != null) {
            obj = CatchingFishCoroutine;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.CatchingFishReduxKtor != cls) {
            return super.getSpans(i, i2, cls);
        }
        CatchingFishMVIBundleHilt[] catchingFishMVIBundleHiltArr = (CatchingFishMVIBundleHilt[]) super.getSpans(i, i2, CatchingFishMVIBundleHilt.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, catchingFishMVIBundleHiltArr.length);
        for (int i3 = 0; i3 < catchingFishMVIBundleHiltArr.length; i3++) {
            objArr[i3] = catchingFishMVIBundleHiltArr[i3].CatchingFishReduxKtor;
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
        if (cls == null || this.CatchingFishReduxKtor == cls) {
            cls = CatchingFishMVIBundleHilt.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        CatchingFishMVIBundleHilt catchingFishMVIBundleHilt;
        if (CatchingFishReduxKtor(obj)) {
            catchingFishMVIBundleHilt = CatchingFishCoroutine(obj);
            if (catchingFishMVIBundleHilt != null) {
                obj = catchingFishMVIBundleHilt;
            }
        } else {
            catchingFishMVIBundleHilt = null;
        }
        super.removeSpan(obj);
        if (catchingFishMVIBundleHilt != null) {
            this.CatchingFishDaggerWebsocket.remove(catchingFishMVIBundleHilt);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (CatchingFishReduxKtor(obj)) {
            CatchingFishMVIBundleHilt catchingFishMVIBundleHilt = new CatchingFishMVIBundleHilt(obj);
            this.CatchingFishDaggerWebsocket.add(catchingFishMVIBundleHilt);
            obj = catchingFishMVIBundleHilt;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new CatchingFishCustomViewJUnit(this.CatchingFishReduxKtor, this, i, i2);
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        CatchingFishParcelableFAB();
        super.replace(i, i2, charSequence);
        CatchingFishDaggerWebsocket();
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

    public CatchingFishCustomViewJUnit(Class cls, CatchingFishCustomViewJUnit catchingFishCustomViewJUnit, int i, int i2) {
        super(catchingFishCustomViewJUnit, i, i2);
        this.CatchingFishDaggerWebsocket = new ArrayList();
        CatchingFishHiltMVPToast.CatchingFishWorkManager(cls, "watcherClass cannot be null");
        this.CatchingFishReduxKtor = cls;
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        CatchingFishParcelableFAB();
        super.replace(i, i2, charSequence, i3, i4);
        CatchingFishDaggerWebsocket();
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

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }
}
