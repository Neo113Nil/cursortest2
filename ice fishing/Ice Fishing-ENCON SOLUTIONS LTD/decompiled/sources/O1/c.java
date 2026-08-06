package O1;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;

/* loaded from: classes.dex */
public final class c extends ThreadLocal {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1236a;

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.f1236a) {
            case 0:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(K1.b.f1054d);
                return simpleDateFormat;
            default:
                return new Random();
        }
    }
}
