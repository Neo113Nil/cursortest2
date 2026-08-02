package defpackage;

import ru.yandex.taxi.map_common.style.source.e;

/* loaded from: classes13.dex */
public final class zxn0 implements cwn0 {
    public final bt00 a;

    public zxn0(bt00 bt00Var) {
        this.a = bt00Var;
    }

    @Override // defpackage.cwn0
    public final void b() {
        ((e) this.a).d("default");
    }

    @Override // defpackage.cwn0
    public final void onDismiss() {
        ((e) this.a).b();
    }
}
