package defpackage;

import com.yandex.passport.internal.usecase.l;
import java.util.function.Supplier;
import javax.crypto.Cipher;

/* loaded from: classes5.dex */
public final /* synthetic */ class btd extends ThreadLocal {
    public final /* synthetic */ int a;
    public final /* synthetic */ Supplier b;

    public /* synthetic */ btd(Supplier supplier, int i) {
        this.a = i;
        this.b = supplier;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                ((atd) this.b).getClass();
                break;
            case 1:
                ((atd) this.b).getClass();
                break;
            case 2:
                ((atd) this.b).getClass();
                break;
            case 3:
                ((atd) this.b).getClass();
                break;
            case 4:
                ((l) this.b).getClass();
                break;
            default:
                ((l) this.b).getClass();
                break;
        }
        return Cipher.getInstance("AES/GCM/NoPadding");
    }
}
