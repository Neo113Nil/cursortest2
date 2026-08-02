package defpackage;

import java.io.File;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class cr4 extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ String s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr4(vx6 vx6Var, String str) {
        super(0);
        this.r = 5;
        this.s = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object t7oVar;
        boolean z;
        y7o y7oVar;
        int i = this.r;
        String str = this.s;
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                return str;
            case 4:
                if (str != null) {
                    try {
                        r7o r7oVar = z7o.b;
                        t7oVar = UUID.fromString(new StringBuilder(str).insert(20, '-').insert(16, '-').insert(12, '-').insert(8, '-').toString());
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                    }
                    UUID uuid = (UUID) (t7oVar instanceof t7o ? null : t7oVar);
                    if (uuid != null) {
                        return uuid;
                    }
                }
                return kl7.c;
            case 5:
                try {
                    z = new File(str).exists();
                } catch (Throwable unused) {
                    z = false;
                }
                return new y7o(Boolean.valueOf(z), null);
            default:
                File file = new File(str);
                try {
                    if (file.exists()) {
                        y7oVar = new y7o(null, new mac("File item already exists at destination path: '" + str + "'", (Throwable) null));
                    } else if (file.mkdirs()) {
                        y7oVar = new y7o(Unit.a, null);
                    } else {
                        y7oVar = new y7o(null, new mac("Received unexpected error when accessing file item at path: '" + str + "'", (Throwable) null));
                    }
                    return y7oVar;
                } catch (Throwable th2) {
                    return new y7o(null, new mac(hrg.q("Received unexpected error when accessing file item at path: '", str, "'"), th2));
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr4(vx6 vx6Var, String str, mvt mvtVar) {
        super(0);
        this.r = 6;
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cr4(String str, int i) {
        super(0);
        this.r = i;
        this.s = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cr4(String str, kl7 kl7Var) {
        super(0);
        this.r = 4;
        this.s = str;
    }
}
