package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import defpackage.c4i0;
import defpackage.k4o;
import defpackage.sph0;
import defpackage.w511;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0018B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0017¨\u0006\u0019"}, d2 = {"Lru/yandex/taxi/design/LoadingComponent;", "Lru/yandex/taxi/design/DividerAwareComponent;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "applyLoadingMode", "()V", "applyAttributes", "(Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/design/LoadingComponent$LoadingMode;", "loadingMode", "setLoadingMode", "(Lru/yandex/taxi/design/LoadingComponent$LoadingMode;)V", "", "applyThemeForChildrenByDefault", "()Z", "Lru/yandex/taxi/design/LoadingComponent$LoadingMode;", "LoadingMode", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class LoadingComponent extends DividerAwareComponent {
    private LoadingMode loadingMode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/design/LoadingComponent$LoadingMode;", "", "DOUBLE", "ICON", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class LoadingMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ LoadingMode[] $VALUES;
        public static final LoadingMode DOUBLE;
        public static final LoadingMode ICON;

        static {
            LoadingMode loadingMode = new LoadingMode("DOUBLE", 0);
            DOUBLE = loadingMode;
            LoadingMode loadingMode2 = new LoadingMode("ICON", 1);
            ICON = loadingMode2;
            LoadingMode[] loadingModeArr = {loadingMode, loadingMode2};
            $VALUES = loadingModeArr;
            $ENTRIES = kotlin.enums.a.a(loadingModeArr);
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static LoadingMode valueOf(String str) {
            return (LoadingMode) Enum.valueOf(LoadingMode.class, str);
        }

        public static LoadingMode[] values() {
            return (LoadingMode[]) $VALUES.clone();
        }
    }

    public /* synthetic */ LoadingComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.loadingComponentStyle : i);
    }

    private final void applyAttributes(AttributeSet attrs, int defStyleAttr) {
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.LoadingComponent, defStyleAttr, 0);
        try {
            this.loadingMode = (LoadingMode) LoadingMode.a().get(obtainStyledAttributes.getInt(c4i0.LoadingComponent_component_loading_mode, this.loadingMode.ordinal()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final void applyLoadingMode() {
        removeAllViews();
        int i = k.a[this.loadingMode.ordinal()];
        if (i == 1) {
            ru.yandex.taxi.design.utils.c.q(this, sph0.component_loading_double, true);
        } else if (i == 2) {
            ru.yandex.taxi.design.utils.c.q(this, sph0.component_loading_icon, true);
        } else {
            w511.b();
        }
    }

    @Override // com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    public final void setLoadingMode(LoadingMode loadingMode) {
        this.loadingMode = loadingMode;
        applyLoadingMode();
    }

    public LoadingComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public LoadingComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadingMode = LoadingMode.DOUBLE;
        applyAttributes(attributeSet, i);
        applyLoadingMode();
    }

    public LoadingComponent(Context context) {
        this(context, null, 0, 6, null);
    }
}
