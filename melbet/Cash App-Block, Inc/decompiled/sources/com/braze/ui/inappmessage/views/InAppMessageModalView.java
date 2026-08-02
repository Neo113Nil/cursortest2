package com.braze.ui.inappmessage.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.models.inappmessage.IInAppMessageImmersive;
import com.braze.models.inappmessage.InAppMessageModal;
import com.braze.support.BrazeLogger;
import com.braze.ui.R$dimen;
import com.braze.ui.R$id;
import com.braze.ui.inappmessage.config.BrazeInAppMessageParams;
import com.braze.ui.inappmessage.utils.InAppMessageViewUtils;
import com.braze.ui.support.ViewUtils;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda0;
import com.plaid.internal.Q0$$ExternalSyntheticLambda0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010$\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020!2\u0006\u0010#\u001a\u00020\"H\u0014¢\u0006\u0004\b$\u0010%J!\u0010&\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0014¢\u0006\u0004\b&\u0010 R$\u0010#\u001a\u0004\u0018\u00010'8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b#\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0016\u00108\u001a\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00107R\u0016\u0010<\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00103R\u0016\u0010>\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u00103R\u0016\u0010@\u001a\u0004\u0018\u0001058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00107R\u0016\u0010D\u001a\u0004\u0018\u00010A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0016\u0010H\u001a\u0004\u0018\u00010E8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/braze/ui/inappmessage/views/InAppMessageModalView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImmersiveBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "imageRetrievalSuccessful", "", "resetMessageMargins", "(Z)V", "", "color", "setMessageBackgroundColor", "(I)V", "numButtons", "", "Landroid/view/View;", "getMessageButtonViews", "(I)Ljava/util/List;", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lcom/braze/models/inappmessage/InAppMessageModal;", "inAppMessage", "applyInAppMessageParameters", "(Landroid/content/Context;Lcom/braze/models/inappmessage/InAppMessageModal;)V", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;", "inAppMessageImageView", "setInAppMessageImageViewAttributes", "(Landroid/content/Context;Lcom/braze/models/inappmessage/IInAppMessageImmersive;Lcom/braze/ui/inappmessage/views/IInAppMessageImageView;)V", "resizeGraphicFrameIfAppropriate", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "getInAppMessageImageView", "()Lcom/braze/ui/inappmessage/views/InAppMessageImageView;", "setInAppMessageImageView", "(Lcom/braze/ui/inappmessage/views/InAppMessageImageView;)V", "Lcom/braze/models/inappmessage/InAppMessageModal;", "getInAppMessage", "()Lcom/braze/models/inappmessage/InAppMessageModal;", "setInAppMessage", "(Lcom/braze/models/inappmessage/InAppMessageModal;)V", "getFrameView", "()Landroid/view/View;", "frameView", "Landroid/widget/TextView;", "getMessageTextView", "()Landroid/widget/TextView;", "messageTextView", "getMessageHeaderTextView", "messageHeaderTextView", "getMessageClickableView", "messageClickableView", "getMessageCloseButtonView", "messageCloseButtonView", "getMessageIconView", "messageIconView", "Landroid/graphics/drawable/Drawable;", "getMessageBackgroundObject", "()Landroid/graphics/drawable/Drawable;", "messageBackgroundObject", "Landroid/widget/ImageView;", "getMessageImageView", "()Landroid/widget/ImageView;", "messageImageView", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class InAppMessageModalView extends InAppMessageImmersiveBaseView {
    private InAppMessageModal inAppMessage;
    private InAppMessageImageView inAppMessageImageView;

    public InAppMessageModalView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resetMessageMargins$lambda$0(InAppMessageModalView inAppMessageModalView, View view) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) inAppMessageModalView, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(9), 7, (Object) null);
        View messageClickableView = inAppMessageModalView.getMessageClickableView();
        if (messageClickableView != null) {
            messageClickableView.performClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String resetMessageMargins$lambda$0$0() {
        return "Passing scrollView click event to message clickable view.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resizeGraphicFrameIfAppropriate$lambda$0(InAppMessageModalView inAppMessageModalView, int i, int i2, int i3, double d) {
        double min = Math.min(inAppMessageModalView.getMeasuredWidth() - i, i2);
        double min2 = Math.min(inAppMessageModalView.getMeasuredHeight() - i, i3);
        double d2 = min / min2;
        View findViewById = inAppMessageModalView.findViewById(R$id.com_braze_inappmessage_modal_graphic_bound);
        if (findViewById != null) {
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.getClass();
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (d >= d2) {
                layoutParams2.width = (int) min;
                layoutParams2.height = (int) (min / d);
            } else {
                layoutParams2.width = (int) (d * min2);
                layoutParams2.height = (int) min2;
            }
            findViewById.setLayoutParams(layoutParams2);
        }
    }

    public void applyInAppMessageParameters(Context context, InAppMessageModal inAppMessage) {
        context.getClass();
        inAppMessage.getClass();
        this.inAppMessage = inAppMessage;
        InAppMessageImageView inAppMessageImageView = (InAppMessageImageView) findViewById(R$id.com_braze_inappmessage_modal_imageview);
        this.inAppMessageImageView = inAppMessageImageView;
        if (inAppMessageImageView != null) {
            setInAppMessageImageViewAttributes(context, inAppMessage, inAppMessageImageView);
        }
        resizeGraphicFrameIfAppropriate(context, inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public View getFrameView() {
        return findViewById(R$id.com_braze_inappmessage_modal_frame);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public Drawable getMessageBackgroundObject() {
        View messageClickableView = getMessageClickableView();
        if (messageClickableView != null) {
            return messageClickableView.getBackground();
        }
        return null;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public List<View> getMessageButtonViews(int numButtons) {
        ArrayList arrayList = new ArrayList();
        if (numButtons == 1) {
            View findViewById = findViewById(R$id.com_braze_inappmessage_modal_button_layout_single);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View findViewById2 = findViewById(R$id.com_braze_inappmessage_modal_button_single_one);
            if (findViewById2 != null) {
                arrayList.add(findViewById2);
            }
        } else if (numButtons == 2) {
            View findViewById3 = findViewById(R$id.com_braze_inappmessage_modal_button_layout_dual);
            if (findViewById3 != null) {
                findViewById3.setVisibility(0);
            }
            View findViewById4 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_one);
            View findViewById5 = findViewById(R$id.com_braze_inappmessage_modal_button_dual_two);
            if (findViewById4 != null) {
                arrayList.add(findViewById4);
            }
            if (findViewById5 != null) {
                arrayList.add(findViewById5);
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView, com.braze.ui.inappmessage.views.IInAppMessageView
    public View getMessageClickableView() {
        return findViewById(R$id.com_braze_inappmessage_modal);
    }

    @Override // com.braze.ui.inappmessage.views.IInAppMessageImmersiveView
    public View getMessageCloseButtonView() {
        return findViewById(R$id.com_braze_inappmessage_modal_close_button);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView
    public TextView getMessageHeaderTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_header_text);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageIconView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_icon);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public ImageView getMessageImageView() {
        return this.inAppMessageImageView;
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public TextView getMessageTextView() {
        return (TextView) findViewById(R$id.com_braze_inappmessage_modal_message);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        Context context = getContext();
        context.getClass();
        resizeGraphicFrameIfAppropriate(context, this.inAppMessage);
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageImmersiveBaseView, com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void resetMessageMargins(boolean imageRetrievalSuccessful) {
        super.resetMessageMargins(imageRetrievalSuccessful);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R$id.com_braze_inappmessage_modal_image_layout);
        if ((imageRetrievalSuccessful || getMessageIconView() != null) && relativeLayout != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            relativeLayout.setLayoutParams(layoutParams);
        }
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal_text_layout);
        if (findViewById != null) {
            findViewById.setOnClickListener(new Q0$$ExternalSyntheticLambda0(this, 8));
        }
    }

    public void resizeGraphicFrameIfAppropriate(Context context, InAppMessageModal inAppMessage) {
        Bitmap bitmap;
        context.getClass();
        if (inAppMessage == null || (bitmap = inAppMessage.getBitmap()) == null || inAppMessage.getImageStyle() != ImageStyle.GRAPHIC) {
            return;
        }
        final double width = bitmap.getWidth() / bitmap.getHeight();
        Resources resources = context.getResources();
        final int dimensionPixelSize = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_margin);
        final int dimensionPixelSize2 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_width);
        final int dimensionPixelSize3 = resources.getDimensionPixelSize(R$dimen.com_braze_inappmessage_modal_max_height);
        post(new Runnable() { // from class: com.braze.ui.inappmessage.views.InAppMessageModalView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                InAppMessageModalView.resizeGraphicFrameIfAppropriate$lambda$0(InAppMessageModalView.this, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, width);
            }
        });
    }

    public void setInAppMessageImageViewAttributes(Context context, IInAppMessageImmersive inAppMessage, IInAppMessageImageView inAppMessageImageView) {
        context.getClass();
        inAppMessage.getClass();
        inAppMessageImageView.getClass();
        float convertDpToPixels = (float) ViewUtils.convertDpToPixels(context, BrazeInAppMessageParams.getModalizedImageRadiusDp());
        if (inAppMessage.getImageStyle() == ImageStyle.GRAPHIC) {
            inAppMessageImageView.setCornersRadiusPx(convertDpToPixels);
        } else {
            inAppMessageImageView.setCornersRadiiPx(convertDpToPixels, convertDpToPixels, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
        }
        inAppMessageImageView.setInAppMessageImageCropType(inAppMessage.getCropType());
        inAppMessageImageView.setAltImageText(inAppMessage.getAltImageText());
    }

    @Override // com.braze.ui.inappmessage.views.InAppMessageBaseView
    public void setMessageBackgroundColor(int color) {
        View findViewById = findViewById(R$id.com_braze_inappmessage_modal);
        findViewById.getClass();
        InAppMessageViewUtils.setViewBackgroundColorFilter(findViewById, color);
    }
}
