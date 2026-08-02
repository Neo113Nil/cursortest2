package defpackage;

import java.util.Locale;

/* loaded from: classes8.dex */
public final /* synthetic */ class vkd0 implements o5z {
    public final /* synthetic */ int a;

    @Override // defpackage.o5z
    public final Locale a() {
        switch (this.a) {
            case 0:
                return Locale.getDefault();
            default:
                return Locale.US;
        }
    }
}
