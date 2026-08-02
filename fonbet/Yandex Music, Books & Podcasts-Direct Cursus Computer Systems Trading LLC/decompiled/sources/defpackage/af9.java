package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public abstract class af9 extends FrameLayout {
    public /* synthetic */ af9(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.divImageStyle : i);
    }

    public /* bridge */ /* synthetic */ se9 getAttachedPlayer() {
        return null;
    }

    public /* bridge */ /* synthetic */ void setScale(@NotNull a0a a0aVar) {
    }

    public /* bridge */ /* synthetic */ void setVisibleOnScreen(boolean z) {
    }

    public af9(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void b() {
    }

    public void a(se9 se9Var) {
    }
}
