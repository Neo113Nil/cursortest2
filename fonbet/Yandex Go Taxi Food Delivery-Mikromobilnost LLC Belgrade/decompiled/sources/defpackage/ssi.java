package defpackage;

import com.yandex.go.dto.response.Action$SummaryRedirect;
import com.yandex.go.dto.response.q1;
import com.yandex.go.shortcuts.view.adapter.model.BaseShortcutModel$Source;

/* loaded from: classes5.dex */
public final class ssi implements yyr0 {
    public final Action$SummaryRedirect a;

    public ssi(Action$SummaryRedirect action$SummaryRedirect) {
        this.a = action$SummaryRedirect;
    }

    @Override // defpackage.yyr0, defpackage.hx31
    public final String c() {
        return "DELIVERY_DASHBOARD_SHORTCUT";
    }

    @Override // defpackage.yyr0
    public final String d() {
        return null;
    }

    @Override // defpackage.yyr0
    public final String e() {
        return "DELIVERY_DASHBOARD_SHORTCUT";
    }

    @Override // defpackage.yyr0
    public final String f() {
        return "DELIVERY_DASHBOARD_GRID";
    }

    @Override // defpackage.yyr0
    /* renamed from: getAction */
    public final q1 getC() {
        return this.a;
    }

    @Override // defpackage.yyr0
    public final BaseShortcutModel$Source getSource() {
        return BaseShortcutModel$Source.LOCAL;
    }
}
