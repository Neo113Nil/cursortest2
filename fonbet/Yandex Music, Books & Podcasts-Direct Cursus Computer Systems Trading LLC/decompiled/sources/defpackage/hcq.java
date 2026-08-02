package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class hcq implements df5 {
    public final Function0 a;

    public hcq(Function0 function0) {
        function0.getClass();
        this.a = function0;
    }

    @Override // defpackage.cf5
    public final int c() {
        return R.drawable.ic_cast_24;
    }

    @Override // defpackage.cf5
    public final String e() {
        return "dialog_action_picker";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hcq) && Intrinsics.d(this.a, ((hcq) obj).a);
    }

    @Override // defpackage.cf5
    public final int getText() {
        return R.string.play_on_device;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SheetDevicePickerActionUiData(action=" + this.a + ")";
    }
}
