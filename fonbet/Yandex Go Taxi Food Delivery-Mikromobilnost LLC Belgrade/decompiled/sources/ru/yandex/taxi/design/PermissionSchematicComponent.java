package ru.yandex.taxi.design;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import defpackage.agh0;
import defpackage.ak80;
import defpackage.cma1;
import defpackage.f1h0;
import defpackage.g4i0;
import defpackage.lfb0;
import defpackage.ny61;
import defpackage.sls;
import defpackage.t7a0;
import defpackage.tje;
import defpackage.usg0;
import defpackage.vng;
import defpackage.zrh0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.yandex.taxi.widget.PlaceholderView;
import ru.yandex.taxi.widget.RobotoTextView;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001c\u001a\u00020\u00142\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/yandex/taxi/design/PermissionSchematicComponent;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/content/res/TypedArray;", "attributes", "attribute", "Landroid/graphics/drawable/Drawable;", "getImageAttribute", "(Landroid/content/res/TypedArray;I)Landroid/graphics/drawable/Drawable;", "", "getTextAttribute", "(Landroid/content/res/TypedArray;I)Ljava/lang/CharSequence;", "iconId", "Lzy11;", "setIcon", "(I)V", "name", "setName", "(Ljava/lang/CharSequence;)V", "Lkotlin/Function0;", "listener", "setPermissionClickListener", "(Lsls;)V", "Llfb0;", "binding", "Llfb0;", "Landroidx/appcompat/widget/AppCompatImageView;", "logo", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/View;", "permissionItem", "Landroid/view/View;", "permissionIcon", "Lru/yandex/taxi/widget/RobotoTextView;", "permissionName", "Lru/yandex/taxi/widget/RobotoTextView;", "permissionClickListener", "Lsls;", "taxi_design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PermissionSchematicComponent extends ConstraintLayout {
    public static final int $stable = 8;
    private final lfb0 binding;
    private final AppCompatImageView logo;
    private sls permissionClickListener;
    private final AppCompatImageView permissionIcon;
    private final View permissionItem;
    private final RobotoTextView permissionName;

    public PermissionSchematicComponent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        View O;
        View O2;
        LayoutInflater.from(context).inflate(zrh0.phone_permissions_sample, this);
        int i2 = agh0.phone_permission_app_title;
        if (((PlaceholderView) cma1.O(i2, this)) != null && (O = cma1.O((i2 = agh0.phone_permission_app_title_divider), this)) != null) {
            i2 = agh0.phone_permission_content_bottom;
            if (((Guideline) cma1.O(i2, this)) != null) {
                i2 = agh0.phone_permission_content_end;
                if (((Guideline) cma1.O(i2, this)) != null) {
                    i2 = agh0.phone_permission_content_start;
                    if (((Guideline) cma1.O(i2, this)) != null) {
                        i2 = agh0.phone_permission_content_top;
                        if (((Guideline) cma1.O(i2, this)) != null) {
                            i2 = agh0.phone_permission_first_icon;
                            if (((PlaceholderView) cma1.O(i2, this)) != null) {
                                i2 = agh0.phone_permission_first_title;
                                if (((PlaceholderView) cma1.O(i2, this)) != null) {
                                    i2 = agh0.phone_permission_icons;
                                    if (((Guideline) cma1.O(i2, this)) != null) {
                                        i2 = agh0.phone_permission_logo;
                                        AppCompatImageView appCompatImageView = (AppCompatImageView) cma1.O(i2, this);
                                        if (appCompatImageView != null && (O2 = cma1.O((i2 = agh0.phone_permission_main_item), this)) != null) {
                                            i2 = agh0.phone_permission_second_arrow;
                                            if (((AppCompatImageView) cma1.O(i2, this)) != null) {
                                                i2 = agh0.phone_permission_second_icon;
                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) cma1.O(i2, this);
                                                if (appCompatImageView2 != null) {
                                                    i2 = agh0.phone_permission_second_name;
                                                    RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                                                    if (robotoTextView != null) {
                                                        i2 = agh0.phone_permission_third_icon;
                                                        if (((PlaceholderView) cma1.O(i2, this)) != null) {
                                                            i2 = agh0.phone_permission_third_title;
                                                            if (((PlaceholderView) cma1.O(i2, this)) != null) {
                                                                this.binding = new lfb0(this, O, appCompatImageView, O2, appCompatImageView2, robotoTextView);
                                                                this.logo = appCompatImageView;
                                                                this.permissionItem = O2;
                                                                this.permissionIcon = appCompatImageView2;
                                                                this.permissionName = robotoTextView;
                                                                int i3 = 25;
                                                                this.permissionClickListener = new t7a0(i3);
                                                                View.inflate(context, zrh0.phone_permissions_sample, this);
                                                                appCompatImageView.setOutlineProvider(new ViewOutlineProvider() { // from class: ru.yandex.taxi.design.PermissionSchematicComponent.1
                                                                    @Override // android.view.ViewOutlineProvider
                                                                    public void getOutline(View view, Outline outline) {
                                                                        outline.setOval(0, 0, view.getWidth(), view.getHeight());
                                                                    }
                                                                });
                                                                appCompatImageView.setClipToOutline(true);
                                                                setBackgroundResource(f1h0.phone_permission_background);
                                                                TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, g4i0.PermissionSchematicComponent, i, 0);
                                                                appCompatImageView2.setImageDrawable(getImageAttribute(obtainStyledAttributes, g4i0.PermissionSchematicComponent_permission_icon));
                                                                robotoTextView.setText(getTextAttribute(obtainStyledAttributes, g4i0.PermissionSchematicComponent_permission_name));
                                                                obtainStyledAttributes.recycle();
                                                                setMinWidth(tje.r(usg0.permission_phone_max_width, context));
                                                                ru.yandex.taxi.design.utils.c.z(new ak80(i3, this), O2);
                                                                return;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zy11 _init_$lambda$0(PermissionSchematicComponent permissionSchematicComponent) {
        permissionSchematicComponent.permissionClickListener.invoke();
        return zy11.a;
    }

    private final Drawable getImageAttribute(TypedArray attributes, int attribute) {
        int resourceId = attributes.getResourceId(attribute, 0);
        if (resourceId == 0) {
            return null;
        }
        return vng.t(resourceId, getContext());
    }

    private final CharSequence getTextAttribute(TypedArray attributes, int attribute) {
        return attributes.getText(attribute);
    }

    public final void setIcon(int iconId) {
        this.permissionIcon.setImageResource(iconId);
    }

    public final void setName(CharSequence name) {
        this.permissionName.setText(name);
    }

    public final void setPermissionClickListener(sls listener) {
        this.permissionClickListener = listener;
    }

    public PermissionSchematicComponent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public PermissionSchematicComponent(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ PermissionSchematicComponent(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
