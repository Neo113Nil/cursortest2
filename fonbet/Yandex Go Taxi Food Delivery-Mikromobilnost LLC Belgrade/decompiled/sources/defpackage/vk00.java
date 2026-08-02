package defpackage;

import com.yandex.runtime.Error;
import com.yandex.runtime.init.MiidListener;
import ru.yandex.yx_platform_api.d;

/* loaded from: classes7.dex */
public final class vk00 implements MiidListener {
    public final /* synthetic */ ba20 a;

    public vk00(ba20 ba20Var) {
        this.a = ba20Var;
    }

    @Override // com.yandex.runtime.init.MiidListener
    public void onMiidError(Error error) {
        this.a.success(null);
    }

    @Override // com.yandex.runtime.init.MiidListener
    public void onMiidReceived(String str) {
        this.a.success(str);
    }

    public vk00(ba20 ba20Var, d dVar) {
        this.a = ba20Var;
    }
}
