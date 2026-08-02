package ru.yandex.taxi.widget.accessibility;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.core.view.b;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.evu0;
import defpackage.jl40;
import defpackage.mg;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/yandex/taxi/widget/accessibility/AccessibilityLiveRegionTextView;", "Lru/yandex/taxi/widget/RobotoTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "updateAccessibilityLiveRegion", "()V", "", "text", "Landroid/widget/TextView$BufferType;", "type", "setText", "(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V", "", BackendConfig.Restrictions.ENABLED, "setAccessibilityLiveRegion", "(Z)V", "enableAccessibilityLiveRegion", "Z", "getAccessibilityMode", "()I", "accessibilityMode", "mg", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AccessibilityLiveRegionTextView extends RobotoTextView {
    private boolean enableAccessibilityLiveRegion;

    public AccessibilityLiveRegionTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.enableAccessibilityLiveRegion = true;
        updateAccessibilityLiveRegion();
        b.p(this, new mg(1, this));
    }

    private final int getAccessibilityMode() {
        return this.enableAccessibilityLiveRegion ? 1 : 0;
    }

    private final void updateAccessibilityLiveRegion() {
        setAccessibilityLiveRegion(getAccessibilityMode());
    }

    public final void setAccessibilityLiveRegion(boolean enabled) {
        boolean z = this.enableAccessibilityLiveRegion != enabled;
        this.enableAccessibilityLiveRegion = enabled;
        if (z) {
            updateAccessibilityLiveRegion();
        }
    }

    @Override // ru.yandex.taxi.widget.RobotoTextView, android.widget.TextView
    public void setText(CharSequence text, TextView.BufferType type) {
        if ((type != TextView.BufferType.SPANNABLE || (getText() instanceof Spannable)) && text != null && !evu0.J(text) && jl40.l(getText().toString(), text.toString())) {
            return;
        }
        super.setText(text, type);
    }

    public AccessibilityLiveRegionTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public AccessibilityLiveRegionTextView(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ AccessibilityLiveRegionTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
