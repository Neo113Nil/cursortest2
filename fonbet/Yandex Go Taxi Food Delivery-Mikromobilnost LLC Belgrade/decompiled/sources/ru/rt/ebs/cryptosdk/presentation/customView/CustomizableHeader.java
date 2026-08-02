package ru.rt.ebs.cryptosdk.presentation.customView;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.a4i0;
import defpackage.bjn;
import defpackage.bvf0;
import defpackage.cma1;
import defpackage.cnf;
import defpackage.dnf;
import defpackage.l8x;
import defpackage.ny61;
import defpackage.o400;
import defpackage.sch0;
import defpackage.sjh;
import defpackage.t8;
import defpackage.tje;
import defpackage.tls;
import defpackage.u2v;
import defpackage.uh91;
import defpackage.uqb1;
import defpackage.uyj;
import defpackage.w511;
import defpackage.wng0;
import defpackage.xoh0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.rt.ebs.cryptosdk.entities.models.CryptoSdkDesign;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u00072\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u000b2\b\b\u0001\u0010\u0013\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0018\u0010\rJ!\u0010\u001c\u001a\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u000b2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b0\u0019¢\u0006\u0004\b\u001e\u0010\u001dJ\u0019\u0010 \u001a\u00020\u000b2\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/rt/ebs/cryptosdk/presentation/customView/CustomizableHeader;", "Landroid/widget/LinearLayout;", "Lu2v;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "setupActionButtonClickAnimation", "()V", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "textColor", "cameraSwitchIconColor", "customizeContent", "(IILjava/lang/Integer;)V", "colorRes", "setHeaderBackgroundColor", "(I)V", "tintId", "setActionButtonTint", "onDetachedFromWindow", "Lkotlin/Function1;", "Landroid/view/View;", "listener", "setOnCancelButtonClickListener", "(Ltls;)V", "setOnActionButtonClickListener", "iconResId", "setActionButtonIcon", "(Ljava/lang/Integer;)V", "", "isVisible", "showOrHideActionButton", "(Z)V", "Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;", "design", "applyDesign", "(Lru/rt/ebs/cryptosdk/entities/models/CryptoSdkDesign;)V", "Lru/rt/ebs/cryptosdk/presentation/customView/HeaderType;", "type", "Lru/rt/ebs/cryptosdk/presentation/customView/HeaderType;", "Ll8x;", "actionButtonRestoreOpacityJob", "Ll8x;", "Lbjn;", "viewBinding", "Lbjn;", "cryptosdk_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CustomizableHeader extends LinearLayout implements u2v {
    private l8x actionButtonRestoreOpacityJob;
    private final HeaderType type;
    private final bjn viewBinding;

    public CustomizableHeader(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        int e;
        int e2;
        LayoutInflater.from(context).inflate(xoh0.ebs_customizable_header, this);
        int i2 = sch0.view_btn_action;
        ImageView imageView = (ImageView) cma1.O(i2, this);
        TypedArray typedArray = null;
        Integer num = null;
        if (imageView != null) {
            i2 = sch0.view_btn_cancel;
            CustomizableTextView customizableTextView = (CustomizableTextView) cma1.O(i2, this);
            if (customizableTextView != null) {
                this.viewBinding = new bjn(this, imageView, customizableTextView);
                setOrientation(0);
                setClipToPadding(false);
                try {
                    obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a4i0.CustomizableHeader);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    HeaderType headerType = HeaderType.values()[obtainStyledAttributes.getInt(a4i0.CustomizableHeader_headerType, 0)];
                    this.type = headerType;
                    int i3 = dnf.a[headerType.ordinal()];
                    if (i3 == 1) {
                        e = uqb1.e(wng0.ebssdkHeaderBackgroundColor, context);
                        e2 = uqb1.e(wng0.ebssdkHeaderTextColor, context);
                    } else {
                        if (i3 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e = uqb1.e(wng0.ebssdkBiometryCapturingHeaderBackgroundColor, context);
                        e2 = uqb1.e(wng0.ebssdkBiometryCapturingHeaderTextColor, context);
                        num = Integer.valueOf(uqb1.e(wng0.ebssdkBiometryCapturingCameraSwitchIconColor, context));
                    }
                    customizeContent(e, e2, num);
                    obtainStyledAttributes.recycle();
                    setupActionButtonClickAnimation();
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    typedArray = obtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
        throw null;
    }

    private final void customizeContent(int backgroundColor, int textColor, Integer cameraSwitchIconColor) {
        setHeaderBackgroundColor(backgroundColor);
        uh91.d(this.viewBinding.c, textColor);
        if (cameraSwitchIconColor != null) {
            setActionButtonTint(cameraSwitchIconColor.intValue());
        }
    }

    public static /* synthetic */ void customizeContent$default(CustomizableHeader customizableHeader, int i, int i2, Integer num, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        customizableHeader.customizeContent(i, i2, num);
    }

    private final void setActionButtonTint(int tintId) {
        this.viewBinding.b.setImageTintList(ColorStateList.valueOf(getContext().getColor(tintId)));
    }

    private final void setHeaderBackgroundColor(int colorRes) {
        setBackgroundColor(getContext().getColor(colorRes));
    }

    private final void setupActionButtonClickAnimation() {
        this.viewBinding.b.setOnTouchListener(new t8(6, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean setupActionButtonClickAnimation$lambda$0(CustomizableHeader customizableHeader, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        l8x l8xVar = customizableHeader.actionButtonRestoreOpacityJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        sjh sjhVar = uyj.a;
        customizableHeader.actionButtonRestoreOpacityJob = tje.N(bvf0.a(o400.a), null, null, new a(customizableHeader, null), 3);
        return false;
    }

    @Override // defpackage.u2v
    public void applyDesign(CryptoSdkDesign design) {
        int headerBackgroundColor;
        int headerTextColor;
        Integer num;
        int i = dnf.a[this.type.ordinal()];
        if (i == 1) {
            headerBackgroundColor = design.getHeaderBackgroundColor();
            headerTextColor = design.getHeaderTextColor();
            num = null;
        } else if (i != 2) {
            w511.b();
            return;
        } else {
            headerBackgroundColor = design.getBiometryCapturingHeaderBackgroundColor();
            headerTextColor = design.getBiometryCapturingHeaderTextColor();
            num = Integer.valueOf(design.getBiometryCapturingCameraSwitchIconColor());
        }
        customizeContent(headerBackgroundColor, headerTextColor, num);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        l8x l8xVar = this.actionButtonRestoreOpacityJob;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        super.onDetachedFromWindow();
    }

    public final void setActionButtonIcon(Integer iconResId) {
        showOrHideActionButton(iconResId != null);
        if (iconResId != null) {
            this.viewBinding.b.setImageResource(iconResId.intValue());
        }
    }

    public final void setOnActionButtonClickListener(tls listener) {
        this.viewBinding.b.setOnClickListener(new cnf(1, listener));
    }

    public final void setOnCancelButtonClickListener(tls listener) {
        this.viewBinding.c.setOnClickListener(new cnf(0, listener));
    }

    public final void showOrHideActionButton(boolean isVisible) {
        l8x l8xVar;
        if (!isVisible && (l8xVar = this.actionButtonRestoreOpacityJob) != null) {
            l8xVar.a(null);
        }
        uh91.f(this.viewBinding.b, isVisible);
    }

    public CustomizableHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CustomizableHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public CustomizableHeader(Context context) {
        this(context, null, 0, 6, null);
    }
}
