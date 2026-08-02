package defpackage;

import android.R;
import android.os.Build;

/* loaded from: classes.dex */
public enum y9s {
    Cut(R.string.cut),
    Copy(R.string.copy),
    Paste(R.string.paste),
    SelectAll(R.string.selectAll),
    Autofill(Build.VERSION.SDK_INT <= 26 ? ru.yandex.music.R.string.autofill : R.string.autofill);

    public final int a;

    y9s(int i) {
        this.a = i;
    }
}
