package ru.yandex.taxi.summary.requirements.list.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import defpackage.pdj0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0016B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u00060\u0016R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/summary/requirements/list/ui/RequirementCheckComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View$OnClickListener;", "listener", "Lzy11;", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Landroid/graphics/drawable/Drawable;", "checkDrawable", "setChecked", "(Landroid/graphics/drawable/Drawable;)V", "", "isChecked", "Z", "Lpdj0;", "requirementCheckDelegate", "Lpdj0;", "list"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RequirementCheckComponent extends ListItemComponent {
    public static final int $stable = 8;
    private boolean isChecked;
    private final pdj0 requirementCheckDelegate;

    public RequirementCheckComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pdj0 pdj0Var = new pdj0(this);
        this.requirementCheckDelegate = pdj0Var;
        androidx.core.view.b.p(this, pdj0Var);
    }

    public final void setChecked(Drawable checkDrawable) {
        setTrailImage(checkDrawable);
        this.isChecked = checkDrawable != null;
        androidx.core.view.b.p(this, this.requirementCheckDelegate);
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
        androidx.core.view.b.p(this, this.requirementCheckDelegate);
    }

    public RequirementCheckComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public RequirementCheckComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ RequirementCheckComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
