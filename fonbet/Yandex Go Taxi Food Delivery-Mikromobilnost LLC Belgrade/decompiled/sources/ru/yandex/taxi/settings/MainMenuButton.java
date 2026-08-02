package ru.yandex.taxi.settings;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.view.b;
import defpackage.hg;
import defpackage.i3y;
import defpackage.neh0;
import defpackage.nwy0;
import defpackage.qqh0;
import defpackage.rp31;
import defpackage.sls;
import defpackage.vng;
import defpackage.yzg0;
import io.appmetrica.analytics.impl.C0553n3;
import java.util.WeakHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.settings.MainMenuButton;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.accessibility.AccessibilityButtonFrameLayout;
import ru.yandex.video.m3.ott.data.local.db.DatabaseHelper;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\b\b\u0001\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u001a¢\u0006\u0004\b\u0018\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\r2\b\b\u0001\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\b\b\u0001\u0010 \u001a\u00020\u0007¢\u0006\u0004\b!\u0010\u0019R\u001b\u0010'\u001a\u00020\"8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00101\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010.¨\u00062"}, d2 = {"Lru/yandex/taxi/settings/MainMenuButton;", "Lru/yandex/taxi/widget/accessibility/AccessibilityButtonFrameLayout;", "Lnwy0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "Lzy11;", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "", "applyThemeForChildrenByDefault", "()Z", "Landroid/view/MotionEvent;", DatabaseHelper.OttTrackingTable.COLUMN_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "hamburgerIcon", "setMenuIcon", "(I)V", "Landroid/graphics/drawable/Drawable;", "(Landroid/graphics/drawable/Drawable;)V", C0553n3.g, "paddings", "setIconBackground", "(II)V", "foreground", "setIconForeground", "Landroid/view/ViewGroup;", "settingsMenuFrame$delegate", "Li3y;", "getSettingsMenuFrame", "()Landroid/view/ViewGroup;", "settingsMenuFrame", "Landroidx/appcompat/widget/AppCompatImageView;", "hamburger$delegate", "getHamburger", "()Landroidx/appcompat/widget/AppCompatImageView;", "hamburger", "cachedIconResource", CA20Status.STATUS_USER_I, "cachedBackgroundResource", "cachedBackgroundPaddings", "cachedForegroundResource", "button"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class MainMenuButton extends AccessibilityButtonFrameLayout implements nwy0 {
    private int cachedBackgroundPaddings;
    private int cachedBackgroundResource;
    private int cachedForegroundResource;
    private int cachedIconResource;

    /* renamed from: hamburger$delegate, reason: from kotlin metadata */
    private final i3y hamburger;

    /* renamed from: settingsMenuFrame$delegate, reason: from kotlin metadata */
    private final i3y settingsMenuFrame;

    public MainMenuButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i2 = 0;
        this.settingsMenuFrame = a.b(lazyThreadSafetyMode, new sls(this) { // from class: n500
            public final /* synthetic */ MainMenuButton b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ViewGroup viewGroup;
                AppCompatImageView hamburger_delegate$lambda$0;
                int i3 = i2;
                MainMenuButton mainMenuButton = this.b;
                switch (i3) {
                    case 0:
                        viewGroup = MainMenuButton.settingsMenuFrame_delegate$lambda$0(mainMenuButton);
                        return viewGroup;
                    default:
                        hamburger_delegate$lambda$0 = MainMenuButton.hamburger_delegate$lambda$0(mainMenuButton);
                        return hamburger_delegate$lambda$0;
                }
            }
        });
        final int i3 = 1;
        this.hamburger = a.b(lazyThreadSafetyMode, new sls(this) { // from class: n500
            public final /* synthetic */ MainMenuButton b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ViewGroup viewGroup;
                AppCompatImageView hamburger_delegate$lambda$0;
                int i32 = i3;
                MainMenuButton mainMenuButton = this.b;
                switch (i32) {
                    case 0:
                        viewGroup = MainMenuButton.settingsMenuFrame_delegate$lambda$0(mainMenuButton);
                        return viewGroup;
                    default:
                        hamburger_delegate$lambda$0 = MainMenuButton.hamburger_delegate$lambda$0(mainMenuButton);
                        return hamburger_delegate$lambda$0;
                }
            }
        });
        this.cachedIconResource = -1;
        this.cachedBackgroundResource = -1;
        this.cachedForegroundResource = -1;
        View.inflate(context, qqh0.settings_button, this);
        if (isInEditMode()) {
            return;
        }
        hg.a(getSettingsMenuFrame());
    }

    private final AppCompatImageView getHamburger() {
        return (AppCompatImageView) this.hamburger.getValue();
    }

    private final ViewGroup getSettingsMenuFrame() {
        return (ViewGroup) this.settingsMenuFrame.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppCompatImageView hamburger_delegate$lambda$0(MainMenuButton mainMenuButton) {
        int i = neh0.hamburger;
        WeakHashMap weakHashMap = b.a;
        return (AppCompatImageView) ((View) rp31.d(mainMenuButton, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ViewGroup settingsMenuFrame_delegate$lambda$0(MainMenuButton mainMenuButton) {
        int i = neh0.setting_menu_frame;
        WeakHashMap weakHashMap = b.a;
        return (ViewGroup) ((View) rp31.d(mainMenuButton, i));
    }

    @Override // defpackage.nwy0
    /* renamed from: allowTraverse */
    public /* bridge */ boolean getIsTrackingsRedesignEnabled() {
        return true;
    }

    @Override // defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        getSettingsMenuFrame().setBackground(vng.t(yzg0.bg_button_round, getContext()));
        setMenuIcon(this.cachedIconResource);
        setIconBackground(this.cachedBackgroundResource, this.cachedBackgroundPaddings);
        setIconForeground(this.cachedForegroundResource);
    }

    @Override // defpackage.nwy0
    public boolean applyThemeForChildrenByDefault() {
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (getVisibility() == 4 || getAlpha() < 0.1f) {
            return false;
        }
        return super.onTouchEvent(event);
    }

    public final void setIconBackground(int background, int paddings) {
        this.cachedBackgroundResource = background;
        this.cachedBackgroundPaddings = paddings;
        if (background != -1) {
            getHamburger().setBackgroundResource(background);
        }
        getHamburger().setPadding(paddings, paddings, paddings, paddings);
    }

    public final void setIconForeground(int foreground) {
        this.cachedForegroundResource = foreground;
        if (foreground != -1) {
            getHamburger().setForeground(vng.t(foreground, getContext()));
        }
    }

    public final void setMenuIcon(int hamburgerIcon) {
        this.cachedIconResource = hamburgerIcon;
        if (hamburgerIcon != -1) {
            getHamburger().setImageResource(hamburgerIcon);
        }
    }

    public final void setMenuIcon(Drawable hamburgerIcon) {
        this.cachedIconResource = -1;
        getHamburger().setImageDrawable(hamburgerIcon);
    }

    public MainMenuButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public MainMenuButton(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ MainMenuButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
