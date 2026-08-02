package defpackage;

import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final class q4s0 {
    public final p4s0 a;
    public final ShortcutViewSourceType[] b;

    public q4s0(ShortcutViewSourceType... shortcutViewSourceTypeArr) {
        this(new p4s0(), (ShortcutViewSourceType[]) Arrays.copyOf(shortcutViewSourceTypeArr, shortcutViewSourceTypeArr.length));
    }

    public q4s0(p4s0 p4s0Var, ShortcutViewSourceType... shortcutViewSourceTypeArr) {
        this.a = p4s0Var;
        this.b = shortcutViewSourceTypeArr;
    }
}
