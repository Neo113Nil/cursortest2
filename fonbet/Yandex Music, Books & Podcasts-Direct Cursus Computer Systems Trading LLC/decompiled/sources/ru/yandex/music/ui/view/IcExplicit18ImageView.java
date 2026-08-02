package ru.yandex.music.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.b6e;
import defpackage.jzb;
import defpackage.ksw;
import defpackage.x9e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class IcExplicit18ImageView extends x9e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IcExplicit18ImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        setImageResource(R.drawable.ic_explicit_age_16);
        setColorFilter(ksw.C(context, R.attr.iconSecondary));
        setContentDescription(context.getString(R.string.explicit_element_content_description));
    }

    @Override // defpackage.x9e
    public final void c(jzb jzbVar) {
        int i;
        int ordinal = jzbVar.ordinal();
        if (ordinal == 0) {
            i = R.drawable.ic_explicit_16;
        } else if (ordinal == 1) {
            i = R.drawable.ic_explicit_age_16;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return;
            }
            i = R.drawable.ic_universal_marking_16;
        }
        setImageResource(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IcExplicit18ImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IcExplicit18ImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IcExplicit18ImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
