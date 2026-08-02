package ru.yandex.taxi.settings.support;

import android.content.Context;
import android.content.res.ColorStateList;
import defpackage.dzg0;
import defpackage.kyh0;
import defpackage.mqg0;
import defpackage.oj10;
import defpackage.rm4;
import defpackage.yjw0;
import kotlin.Metadata;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0010\u0010\u000bJ\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/settings/support/MenuBadge;", "Lru/yandex/taxi/widget/RobotoTextView;", "Lyjw0;", "Landroid/content/Context;", "context", "Loj10;", "presenter", "<init>", "(Landroid/content/Context;Loj10;)V", "Lzy11;", "onAttachedToWindow", "()V", "", "hasWindowFocus", "onWindowFocusChanged", "(Z)V", "onDetachedFromWindow", "Lrm4;", "uiState", "render", "(Lrm4;)V", "Loj10;", "button"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MenuBadge extends RobotoTextView implements yjw0 {
    private final oj10 presenter;

    public MenuBadge(Context context, oj10 oj10Var) {
        super(context, null, 0);
        this.presenter = oj10Var;
        setBackgroundResource(dzg0.bg_notification_badge);
        setBackgroundTintList(ColorStateList.valueOf(getContext().getColor(mqg0.red)));
        setGravity(17);
        setTextColor(getContext().getColor(mqg0.white));
        setTextSize(1, 10.0f);
        setVisibility(4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode()) {
            return;
        }
        this.presenter.Bg(this);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (isInEditMode()) {
            return;
        }
        this.presenter.Cg();
    }

    @Override // android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        if (isInEditMode()) {
            return;
        }
        this.presenter.refresh();
    }

    @Override // defpackage.eyi0
    public void render(rm4 uiState) {
        boolean z = uiState.c;
        String str = uiState.b;
        setVisibility(z ? 0 : 4);
        setText(uiState.a);
        if (str == null || str.length() == 0) {
            return;
        }
        setContentDescription(getContext().getString(kyh0.content_description_unread_messages, str));
    }
}
