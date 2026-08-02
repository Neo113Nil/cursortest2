package ru.yandex.music.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.b6d;
import defpackage.b6e;
import defpackage.hag;
import defpackage.jyr;
import defpackage.jzb;
import defpackage.ksw;
import defpackage.l18;
import defpackage.prn;
import defpackage.rrn;
import defpackage.x9e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class IcExplicitImageView extends x9e {
    public final jyr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IcExplicitImageView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = l18.b.b(hag.I(prn.class), false);
        b6d b6dVar = isInEditMode() ? new b6d("ru") : (b6d) ((rrn) getRegionCenter()).c.getValue();
        b6dVar.getClass();
        String str = b6dVar.a;
        str.getClass();
        setImageResource(str.equalsIgnoreCase("BY") ? R.drawable.ic_explicit_age_16 : R.drawable.ic_explicit_16);
        setColorFilter(ksw.C(context, R.attr.iconSecondary));
        setContentDescription(context.getString(R.string.explicit_element_content_description));
    }

    private final prn getRegionCenter() {
        return (prn) this.a.getValue();
    }

    @Override // defpackage.x9e
    public final void c(jzb jzbVar) {
        int i;
        int ordinal = jzbVar.ordinal();
        if (ordinal != 0) {
            i = R.drawable.ic_explicit_age_16;
            if (ordinal != 1 && ordinal != 2) {
                b6e.s();
                return;
            }
        } else {
            i = R.drawable.ic_explicit_16;
        }
        setImageResource(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IcExplicitImageView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IcExplicitImageView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ IcExplicitImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
