package ru.yandex.taxi.design.utils;

import android.text.Editable;
import android.text.TextWatcher;
import defpackage.tls;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0014\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0012R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/design/utils/TextChangedListener;", "Landroid/text/TextWatcher;", "Lkotlin/Function1;", "", "Lzy11;", "listener", "<init>", "(Ltls;)V", "Landroid/text/Editable;", "s", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Ltls;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TextChangedListener implements TextWatcher {
    public static final int $stable = 0;
    private final tls listener;

    public TextChangedListener(tls tlsVar) {
        this.listener = tlsVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s) {
        String str;
        tls tlsVar = this.listener;
        if (s == null || (str = s.toString()) == null) {
            str = "";
        }
        tlsVar.invoke(str);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s, int start, int before, int count) {
    }
}
