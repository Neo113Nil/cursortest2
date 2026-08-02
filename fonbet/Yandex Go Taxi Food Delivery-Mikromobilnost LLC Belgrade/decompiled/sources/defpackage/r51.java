package defpackage;

import com.yandex.go.search.model.DecideLaterConfig;
import ru.yandex.taxi.address.models.SourcePicker;

/* loaded from: classes12.dex */
public final class r51 {
    public final SourcePicker a;
    public final DecideLaterConfig b;
    public final b5v0 c;

    public r51(SourcePicker sourcePicker, DecideLaterConfig decideLaterConfig, e0p0 e0p0Var) {
        this.a = sourcePicker;
        this.b = decideLaterConfig;
        this.c = e0p0Var;
    }

    public r51() {
        this(0);
    }

    public /* synthetic */ r51(SourcePicker sourcePicker, DecideLaterConfig decideLaterConfig) {
        this(sourcePicker, decideLaterConfig, null);
    }

    public /* synthetic */ r51(int i) {
        this(SourcePicker.NONE);
    }

    public r51(SourcePicker sourcePicker) {
        this(sourcePicker, DecideLaterConfig.a, null);
    }
}
