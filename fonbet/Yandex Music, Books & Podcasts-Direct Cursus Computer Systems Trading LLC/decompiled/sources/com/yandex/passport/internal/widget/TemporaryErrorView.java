package com.yandex.passport.internal.widget;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import com.yandex.passport.R;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class TemporaryErrorView extends ErrorView {
    public static final /* synthetic */ int s = 0;
    public final androidx.core.app.a q;
    public final Handler r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemporaryErrorView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.q = new androidx.core.app.a(12, this);
        this.r = new Handler(Looper.getMainLooper());
        setBackgroundColor(context.getColor(R.color.passport_red));
    }

    @Override // com.yandex.passport.internal.widget.ErrorView
    public final void p() {
        this.r.removeCallbacks(this.q);
        super.p();
    }

    @Override // com.yandex.passport.internal.widget.ErrorView
    public final void q(String str) {
        str.getClass();
        Handler handler = this.r;
        androidx.core.app.a aVar = this.q;
        handler.removeCallbacks(aVar);
        handler.postDelayed(aVar, 3000L);
        super.q(str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TemporaryErrorView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ TemporaryErrorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TemporaryErrorView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
