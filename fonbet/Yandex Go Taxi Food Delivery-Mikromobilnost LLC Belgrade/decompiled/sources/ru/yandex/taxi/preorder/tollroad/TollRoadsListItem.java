package ru.yandex.taxi.preorder.tollroad;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.mqg0;
import defpackage.qje;
import defpackage.tje;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemCheckComponent;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/preorder/tollroad/TollRoadsListItem;", "Lru/yandex/taxi/design/ListItemCheckComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "text", "Lzy11;", "setTrailText", "(Ljava/lang/CharSequence;)V", "", "isEnabled", "isLoading", "setTextStyle", "(ZZ)V", "setIsLoading", "(Z)V", "applyStyle", "()V", "dialog"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TollRoadsListItem extends ListItemCheckComponent {
    public static final int $stable = 8;

    public TollRoadsListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 4, null);
        setEnabled(true);
    }

    public final void applyStyle() {
        setTitleTypeface(0);
        setTrailCompanionTextAlignment(2);
        setTrailTextSize((int) tje.b0(getContext(), 16.0f));
    }

    public final void setIsLoading(boolean isLoading) {
        if (isLoading) {
            startTitleProgressAnimation(null, 500);
            startSubtitleProgressAnimation(null, 500);
        } else {
            stopTitleProgressAnimation();
            stopSubtitleProgressAnimation();
        }
    }

    public final void setTextStyle(boolean isEnabled, boolean isLoading) {
        if (isEnabled && isLoading) {
            setTitleTextColor(getContext().getColor(mqg0.component_gray_250));
            setTrailTextStyle(3);
        } else if (isEnabled) {
            setTitleTextColor(qje.t(xng0.textMain, getContext()));
            setTrailTextStyle(3);
        } else {
            setTitleTextColor(getContext().getColor(mqg0.component_gray_250));
            setTrailTextStyle(0);
        }
    }

    public final void setTrailText(CharSequence text) {
        setTrailCompanionText(text);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TollRoadsListItem(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    public /* synthetic */ TollRoadsListItem(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
