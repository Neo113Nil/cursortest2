package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import defpackage.c4i0;
import defpackage.dhv;
import defpackage.k4o;
import defpackage.mfb;
import defpackage.pry;
import defpackage.qry;
import defpackage.vng;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002:\u00034\u001a1B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0019\u0010\rJ\u0017\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u0015¢\u0006\u0004\b)\u0010\u0018R\u0016\u0010&\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010*R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010,R\u0016\u0010-\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00102\u001a\u000601R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lru/yandex/taxi/design/ListItemCheckComponent;", "Lru/yandex/taxi/design/ListItemComponent;", "Landroid/widget/Checkable;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "invalidateChecker", "()V", "initAttributes", "(Landroid/util/AttributeSet;I)V", "updateCheckedChangeListener", "Landroid/view/View$OnClickListener;", "listener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "", "checked", "setChecked", "(Z)V", "toggle", "Lpry;", "checkedChangeListener", "setCheckedChangeListener", "(Lpry;)V", "Lru/yandex/taxi/design/ListItemCheckComponent$Mode;", "mode", "setMode", "(Lru/yandex/taxi/design/ListItemCheckComponent$Mode;)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "isChecked", "()Z", "checkToggleByClickEnabled", "setCheckToggleByClickEnabled", "Z", "Lpry;", "Lru/yandex/taxi/design/ListItemCheckComponent$Mode;", "isCheckToggleByClickEnabled", "Lmfb;", "checkDrawableProvider", "Lmfb;", "Lqry;", "listItemCheckComponentAccessibilityDelegate", "Lqry;", "Mode", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public class ListItemCheckComponent extends ListItemComponent implements Checkable {
    private mfb checkDrawableProvider;
    private pry checkedChangeListener;
    private boolean isCheckToggleByClickEnabled;
    private boolean isChecked;
    private final qry listItemCheckComponentAccessibilityDelegate;
    private Mode mode;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/design/ListItemCheckComponent$Mode;", "", "SINGLE", "MULTIPLE", "RECTANGLE", "RECTANGLE_DISABLED", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Mode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode MULTIPLE;
        public static final Mode RECTANGLE;
        public static final Mode RECTANGLE_DISABLED;
        public static final Mode SINGLE;

        static {
            Mode mode = new Mode("SINGLE", 0);
            SINGLE = mode;
            Mode mode2 = new Mode("MULTIPLE", 1);
            MULTIPLE = mode2;
            Mode mode3 = new Mode("RECTANGLE", 2);
            RECTANGLE = mode3;
            Mode mode4 = new Mode("RECTANGLE_DISABLED", 3);
            RECTANGLE_DISABLED = mode4;
            Mode[] modeArr = {mode, mode2, mode3, mode4};
            $VALUES = modeArr;
            $ENTRIES = kotlin.enums.a.a(modeArr);
        }

        public static k4o a() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    public ListItemCheckComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mode = Mode.SINGLE;
        this.isCheckToggleByClickEnabled = true;
        qry qryVar = new qry(this);
        this.listItemCheckComponentAccessibilityDelegate = qryVar;
        initAttributes(attributeSet, i);
        updateCheckedChangeListener();
        invalidateChecker();
        androidx.core.view.b.p(this, qryVar);
    }

    private final void initAttributes(AttributeSet attrs, int defStyleAttr) {
        this.checkDrawableProvider = new mfb(getContext(), attrs, defStyleAttr);
        try {
            TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, c4i0.ListCheckBoxComponent, defStyleAttr, 0);
            try {
                this.mode = (Mode) Mode.a().get(obtainStyledAttributes.getInt(c4i0.ListCheckBoxComponent_choice_mode, 0));
                this.isCheckToggleByClickEnabled = obtainStyledAttributes.getBoolean(c4i0.ListCheckBoxComponent_component_check_toggle_by_click_enabled, true);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } catch (Exception unused) {
        }
    }

    private final void invalidateChecker() {
        mfb mfbVar;
        Drawable t;
        Drawable t2;
        boolean z = this.isChecked;
        Mode mode = this.mode;
        if (!z) {
            int i = h.a[mode.ordinal()];
            mfb mfbVar2 = this.checkDrawableProvider;
            if (i == 1) {
                mfbVar = mfbVar2 != null ? mfbVar2 : null;
                t = vng.t(mfbVar.g, mfbVar.a);
            } else if (i != 2) {
                t = (mfbVar2 != null ? mfbVar2 : null).b();
            } else {
                mfbVar = mfbVar2 != null ? mfbVar2 : null;
                t = vng.t(mfbVar.h, mfbVar.a);
            }
            setTrailImage(t);
            return;
        }
        int i2 = h.a[mode.ordinal()];
        if (i2 != 1) {
            mfb mfbVar3 = this.checkDrawableProvider;
            if (i2 == 2) {
                mfbVar = mfbVar3 != null ? mfbVar3 : null;
                t2 = vng.t(mfbVar.d, mfbVar.a);
            } else if (i2 != 3) {
                t2 = (mfbVar3 != null ? mfbVar3 : null).a();
            } else {
                mfbVar = mfbVar3 != null ? mfbVar3 : null;
                t2 = vng.t(mfbVar.e, mfbVar.a);
            }
        } else {
            mfb mfbVar4 = this.checkDrawableProvider;
            mfbVar = mfbVar4 != null ? mfbVar4 : null;
            t2 = vng.t(mfbVar.c, mfbVar.a);
        }
        setTrailImage(t2);
    }

    private final void updateCheckedChangeListener() {
        setDebounceClickListener(new dhv(27, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateCheckedChangeListener$lambda$0(ListItemCheckComponent listItemCheckComponent) {
        if (listItemCheckComponent.isCheckToggleByClickEnabled) {
            listItemCheckComponent.setChecked(!listItemCheckComponent.isChecked);
            pry pryVar = listItemCheckComponent.checkedChangeListener;
            if (pryVar != null) {
                pryVar.a(listItemCheckComponent.isChecked);
            }
        }
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, ru.yandex.taxi.design.DividerAwareComponent, com.yandex.go.design.view.GoFrameLayout, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        invalidateChecker();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.isChecked;
    }

    public final void setCheckToggleByClickEnabled(boolean checkToggleByClickEnabled) {
        this.isCheckToggleByClickEnabled = checkToggleByClickEnabled;
        updateCheckedChangeListener();
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        if (checked == this.isChecked) {
            return;
        }
        this.isChecked = checked;
        invalidateChecker();
    }

    public final void setCheckedChangeListener(pry checkedChangeListener) {
        this.checkedChangeListener = checkedChangeListener;
    }

    public final void setMode(Mode mode) {
        this.mode = mode;
        invalidateChecker();
    }

    @Override // ru.yandex.taxi.design.ListItemComponent, android.view.View
    public void setOnClickListener(View.OnClickListener listener) {
        super.setOnClickListener(listener);
        androidx.core.view.b.p(this, this.listItemCheckComponentAccessibilityDelegate);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.isChecked);
    }

    public ListItemCheckComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ListItemCheckComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ ListItemCheckComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? xng0.listCheckBoxComponentStyle : i);
    }
}
