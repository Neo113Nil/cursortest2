package kotlin.text;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class CatchingFishMVIBundleHilt implements TextWatcher, SpanWatcher {
    public final AtomicInteger CatchingFishDaggerWebsocket = new AtomicInteger(0);
    public final Object CatchingFishReduxKtor;

    public CatchingFishMVIBundleHilt(Object obj) {
        this.CatchingFishReduxKtor = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.CatchingFishReduxKtor).afterTextChanged(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.CatchingFishReduxKtor).beforeTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.text.SpanWatcher
    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.CatchingFishDaggerWebsocket.get() <= 0 || !(obj instanceof CatchingFishDaggerRealm)) {
            ((SpanWatcher) this.CatchingFishReduxKtor).onSpanAdded(spannable, obj, i, i2);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.CatchingFishDaggerWebsocket.get() <= 0 || !(obj instanceof CatchingFishDaggerRealm)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i5 = i;
                    i6 = 0;
                    ((SpanWatcher) this.CatchingFishReduxKtor).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                }
            }
            i5 = i;
            i6 = i3;
            ((SpanWatcher) this.CatchingFishReduxKtor).onSpanChanged(spannable, obj, i5, i2, i6, i4);
        }
    }

    @Override // android.text.SpanWatcher
    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.CatchingFishDaggerWebsocket.get() <= 0 || !(obj instanceof CatchingFishDaggerRealm)) {
            ((SpanWatcher) this.CatchingFishReduxKtor).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.CatchingFishReduxKtor).onTextChanged(charSequence, i, i2, i3);
    }
}
