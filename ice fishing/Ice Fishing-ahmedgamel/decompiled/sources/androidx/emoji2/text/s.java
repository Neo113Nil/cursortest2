package androidx.emoji2.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class s implements TextWatcher, SpanWatcher {

    /* renamed from: n, reason: collision with root package name */
    public final Object f4766n;

    /* renamed from: u, reason: collision with root package name */
    public final AtomicInteger f4767u = new AtomicInteger(0);

    public s(Object obj) {
        this.f4766n = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.f4766n).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        ((TextWatcher) this.f4766n).beforeTextChanged(charSequence, i, i4, i6);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i4) {
        if (this.f4767u.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f4766n).onSpanAdded(spannable, obj, i, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i4, int i6, int i9) {
        int i10;
        int i11;
        if (this.f4767u.get() <= 0 || !(obj instanceof v)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i4) {
                    i = 0;
                }
                if (i6 > i9) {
                    i10 = i;
                    i11 = 0;
                    ((SpanWatcher) this.f4766n).onSpanChanged(spannable, obj, i10, i4, i11, i9);
                }
            }
            i10 = i;
            i11 = i6;
            ((SpanWatcher) this.f4766n).onSpanChanged(spannable, obj, i10, i4, i11, i9);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i4) {
        if (this.f4767u.get() <= 0 || !(obj instanceof v)) {
            ((SpanWatcher) this.f4766n).onSpanRemoved(spannable, obj, i, i4);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        ((TextWatcher) this.f4766n).onTextChanged(charSequence, i, i4, i6);
    }
}
