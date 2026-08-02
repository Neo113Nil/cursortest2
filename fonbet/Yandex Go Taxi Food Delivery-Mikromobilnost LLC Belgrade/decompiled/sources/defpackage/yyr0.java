package defpackage;

import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes13.dex */
public interface yyr0 extends hx31 {
    @Override // defpackage.hx31
    default String c() {
        return e();
    }

    String d();

    String e();

    String f();

    /* renamed from: getAction */
    q1 getC();

    BaseShortcutModel$Source getSource();
}
