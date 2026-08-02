package defpackage;

import com.yandex.go.dto.response.q1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsView;

/* loaded from: classes6.dex */
public final /* synthetic */ class x3s0 implements ays, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ ShortcutsView b;

    public /* synthetic */ x3s0(ShortcutsView shortcutsView, int i) {
        this.a = i;
        this.b = shortcutsView;
    }

    @Override // defpackage.ays
    public final void a(Object obj) {
        int i = this.a;
        ShortcutsView shortcutsView = this.b;
        switch (i) {
            case 0:
                shortcutsView.onItemClick((e6v) obj);
                break;
            case 1:
                shortcutsView.onNestedClick((q1) obj);
                break;
            default:
                shortcutsView.onBadgeClick((sj4) obj);
                break;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            case 1:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof ays) && (obj instanceof jms)) {
                    break;
                }
                break;
        }
        return jl40.l(getFunctionDelegate(), ((jms) obj).getFunctionDelegate());
    }

    @Override // defpackage.jms
    public final cms getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return new FunctionReferenceImpl(1, this.b, ShortcutsView.class, "onItemClick", "onItemClick(Lru/yandex/taxi/shortcuts/view/adapter/generic/Identifiable;)V", 0);
            case 1:
                return new FunctionReferenceImpl(1, this.b, ShortcutsView.class, "onNestedClick", "onNestedClick(Lcom/yandex/go/dto/response/Action;)V", 0);
            default:
                return new FunctionReferenceImpl(1, this.b, ShortcutsView.class, "onBadgeClick", "onBadgeClick(Lcom/yandex/go/shortcuts/view/adapter/model/model/BadgeAction;)V", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
