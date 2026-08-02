package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.requirements.ui.bubbles.RequirementsBubblesContainer;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes6.dex */
public final /* synthetic */ class wkx0 implements vpr, jms {
    public final /* synthetic */ int a;
    public final /* synthetic */ RequirementsBubblesContainer b;

    public /* synthetic */ wkx0(RequirementsBubblesContainer requirementsBubblesContainer, int i) {
        this.a = i;
        this.b = requirementsBubblesContainer;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        RequirementsBubblesContainer requirementsBubblesContainer = this.b;
        switch (i) {
            case 0:
                requirementsBubblesContainer.updateBubbles((List) obj);
                break;
            default:
                requirementsBubblesContainer.applyTheme((ThemeType) obj);
                break;
        }
        return zy11Var;
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
                    break;
                }
                break;
            default:
                if ((obj instanceof vpr) && (obj instanceof jms)) {
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
                return new AdaptedFunctionReference(2, this.b, RequirementsBubblesContainer.class, "updateBubbles", "updateBubbles(Ljava/util/List;)Z", 12);
            default:
                return new AdaptedFunctionReference(2, this.b, RequirementsBubblesContainer.class, "applyTheme", "applyTheme(Lru/yandex/taxi/theme/ThemeType;)V", 4);
        }
    }

    public final int hashCode() {
        switch (this.a) {
        }
        return getFunctionDelegate().hashCode();
    }
}
