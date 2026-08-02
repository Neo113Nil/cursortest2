package defpackage;

import ru.yandex.taxi.network.api.annotation.ObserveStrategy;

/* loaded from: classes9.dex */
public abstract class us50 {
    public final int a;
    public final String b;
    public final String c;
    public final String d;
    public final ObserveStrategy e;

    public /* synthetic */ us50(int i, String str, ObserveStrategy observeStrategy, int i2) {
        this(i, str, null, null, (i2 & 16) != 0 ? ObserveStrategy.Default : observeStrategy);
    }

    public us50(int i, String str, String str2, String str3, ObserveStrategy observeStrategy) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = observeStrategy;
    }
}
