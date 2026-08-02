package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class pxf {
    public final ugk a;
    public qre b;
    public final int c;

    public pxf(ugk ugkVar) {
        int i;
        this.a = ugkVar;
        int ordinal = ugkVar.ordinal();
        if (ordinal != 0) {
            i = R.raw.paymentsdk_bindings_key_debug;
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    b6e.s();
                    throw null;
                }
                i = R.raw.paymentsdk_bindings_key_localdebug;
            }
        } else {
            i = R.raw.paymentsdk_bindings_key_release;
        }
        this.c = i;
    }

    public final String a() {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return "https://mobpayment.yandex-net.ru/";
        }
        if (ordinal == 1) {
            return "https://mobpayment-test.yandex-team.ru/";
        }
        if (ordinal == 2) {
            return "https://testing.crowdtest.mobpayment.yandex.ru/";
        }
        if (ordinal == 3) {
            return "https://mobpayment-test-mimino.yandex-team.ru/";
        }
        if (ordinal == 4) {
            return "http://127.0.0.1:8080/mobpayment/";
        }
        b6e.s();
        return null;
    }

    public final boolean b() {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4) {
            return true;
        }
        b6e.s();
        return false;
    }
}
