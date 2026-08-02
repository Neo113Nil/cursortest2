package com.squareup.cash.reactions.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.Ui;
import app.cash.molecule.PlatformKt;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.reactions.viewmodels.ReactionViewEvent;
import com.squareup.protos.franklin.common.Reaction;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes7.dex */
public final class ChooseReactionDialog extends ViewGroup implements View.OnClickListener {
    public final int dialogHeight;
    public final ArrayList dividers;
    public final Ui.EventReceiver eventReceiver;
    public final int maxEmojiSize;
    public final int maxSpace;
    public final ImageView moreButton;
    public final Paint paint;
    public final ReactionBuilder reactionBuilder;
    public int spacing;
    public final int verticalAlignOffset;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseReactionDialog(Context context, Ui.EventReceiver eventReceiver, ReactionBuilder reactionBuilder, ArrayList arrayList, boolean z) {
        super(context);
        context.getClass();
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
        this.reactionBuilder = reactionBuilder;
        ColorPalette colorPalette = ThemeHelpersKt.themeInfo(this).colorPalette;
        this.maxSpace = context.getResources().getDimensionPixelOffset(R.dimen.reactions_dialog_max_spacing);
        Paint paint = new Paint();
        paint.setColor(colorPalette.elevatedBackground);
        paint.setAntiAlias(true);
        this.paint = paint;
        this.dividers = new ArrayList();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reactions_dialog_ellipsis_size);
        this.dialogHeight = context.getResources().getDimensionPixelSize(R.dimen.reactions_dialog_height);
        this.verticalAlignOffset = context.getResources().getDimensionPixelSize(R.dimen.reactions_dialog_v_align_offset);
        this.maxEmojiSize = context.getResources().getDimensionPixelSize(R.dimen.reactions_view_default_size);
        ImageView imageView = new ImageView(context);
        Drawable drawableCompat = PlatformKt.getDrawableCompat(context, R.drawable.ellipsis, null);
        drawableCompat.getClass();
        drawableCompat.setTint(colorPalette.secondaryIcon);
        imageView.setImageDrawable(drawableCompat);
        imageView.setMinimumWidth(dimensionPixelSize);
        imageView.setMinimumHeight(dimensionPixelSize);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(context.getString(R.string.more_button_content_description));
        imageView.setOnClickListener(this);
        this.moreButton = imageView;
        setClipToPadding(false);
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ReactionView reactionView = new ReactionView(context, (Reaction) it.next());
            reactionView.setOnClickListener(this);
            addView(reactionView);
        }
        if (z) {
            addView(this.moreButton);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.getClass();
        float height = getHeight() / 2.0f;
        canvas.drawRoundRect(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, getWidth(), getHeight(), height, height, this.paint);
        super.dispatchDraw(canvas);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z = view instanceof ReactionView;
        ReactionBuilder reactionBuilder = this.reactionBuilder;
        if (!z) {
            reactionBuilder.updateTimeout(2000L);
            this.eventReceiver.sendEvent(ReactionViewEvent.ShowAdditionalEmojis.INSTANCE);
        } else {
            Reaction reaction = ((ReactionView) view).reaction;
            reaction.getClass();
            reactionBuilder.appendToReaction(reaction, view, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.dividers;
        arrayList.clear();
        int i5 = this.spacing;
        int childCount = getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int height = ((getHeight() / 2) - (childAt.getMeasuredHeight() / 2)) + (childAt instanceof ReactionView ? this.verticalAlignOffset : 0);
            childAt.layout(i5, height, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + height);
            if (i6 < getChildCount() - 1) {
                arrayList.add(Float.valueOf((this.spacing / 2.0f) + childAt.getRight()));
            }
            i5 = childAt.getRight() + this.spacing;
        }
        arrayList.add(Float.valueOf(getWidth()));
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            int i5 = this.maxEmojiSize;
            childAt.measure(View.MeasureSpec.makeMeasureSpec(i5, PKIFailureInfo.systemUnavail), View.MeasureSpec.makeMeasureSpec(i5, PKIFailureInfo.systemUnavail));
            i3 += childAt.getMeasuredWidth();
        }
        int coerceIn = RangesKt___RangesKt.coerceIn((size - i3) / (getChildCount() + 1), 0, this.maxSpace);
        setMeasuredDimension(((getChildCount() + 1) * coerceIn) + i3, this.dialogHeight);
        this.spacing = coerceIn;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        Iterator it = this.dividers.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((Number) it.next()).floatValue() >= motionEvent.getX()) {
                break;
            }
            i++;
        }
        View childAt = getChildAt(i);
        if (childAt == null) {
            return true;
        }
        childAt.dispatchTouchEvent(motionEvent);
        return true;
    }
}
