package ru.yandex.taxi.design.utils;

import android.text.Editable;
import android.text.TextWatcher;
import com.yandex.messaging.core.net.entities.BackendConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0012\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0015\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/design/utils/ToggledTextWatcher;", "Landroid/text/TextWatcher;", "", "listeners", "", BackendConfig.Restrictions.ENABLED, "<init>", "(Ljava/util/List;Z)V", "Landroid/text/Editable;", "s", "Lzy11;", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Ljava/util/List;", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ToggledTextWatcher implements TextWatcher {
    private boolean enabled;
    private final List<TextWatcher> listeners;

    /* JADX WARN: Multi-variable type inference failed */
    public ToggledTextWatcher(List<? extends TextWatcher> list, boolean z) {
        this.listeners = list;
        this.enabled = z;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        if (this.enabled) {
            Iterator<TextWatcher> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().afterTextChanged(s);
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (this.enabled) {
            Iterator<TextWatcher> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().beforeTextChanged(s, start, count, after);
            }
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        if (this.enabled) {
            Iterator<TextWatcher> it = this.listeners.iterator();
            while (it.hasNext()) {
                it.next().onTextChanged(s, start, before, count);
            }
        }
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }
}
