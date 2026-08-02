package com.yandex.plus.pay.ui.common.api.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.yandex.passport.common.util.e;
import com.yandex.plus.bdui.plus.checkout.content.serializer.dto.r1;
import com.yandex.plus.bdui.plus.content.controller.f;
import defpackage.ern;
import defpackage.s9f;
import defpackage.yxm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class ProgressView extends FrameLayout {
    public static final /* synthetic */ s9f[] b;
    public final f a;

    static {
        yxm yxmVar = new yxm(ProgressView.class, "progressBar", "getProgressBar()Landroid/widget/ProgressBar;", 0);
        ern.a.getClass();
        b = new s9f[]{yxmVar};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.a = new f(new e(7, this));
        r1.p(this, R.layout.pay_sdk_view_tarifficator_progress, true);
        setClipChildren(false);
        setClipToPadding(false);
        setTag("com.yandex.plus.pay.ui.common.api.ui.view.ProgressView");
    }

    private final ProgressBar getProgressBar() {
        return (ProgressBar) this.a.g(b[0]);
    }

    public final int getProgress() {
        return getProgressBar().getProgress();
    }

    public final void setProgress(int i) {
        getProgressBar().setProgress(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ ProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProgressView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
