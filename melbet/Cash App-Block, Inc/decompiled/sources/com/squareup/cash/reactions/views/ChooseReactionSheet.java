package com.squareup.cash.reactions.views;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.stats.zza;
import com.squareup.cash.R;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.sheet.BottomSheet$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.BottomSheetConfig;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.protos.franklin.common.Reaction;
import java.util.List;

/* loaded from: classes7.dex */
public final class ChooseReactionSheet extends RecyclerView implements OutsideTapCloses, BottomSheetConfig {
    public final List extended;
    public final boolean isLocked;
    public final int maxEmojiSize;
    public final BottomSheetConfig.HeightMode maxHeightMode;
    public final ReactionBuilder reactionBuilder;

    public final class ReactionAdapter extends RecyclerView.Adapter {
        public ReactionAdapter() {
            ChooseReactionSheet.this.setBackgroundColor(ThemeHelpersKt.themeInfo(ChooseReactionSheet.this).colorPalette.elevatedBackground);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return ChooseReactionSheet.this.extended.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ReactionViewHolder reactionViewHolder = (ReactionViewHolder) viewHolder;
            reactionViewHolder.getClass();
            reactionViewHolder.reactionView.setReaction((Reaction) ChooseReactionSheet.this.extended.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            viewGroup.getClass();
            ChooseReactionSheet chooseReactionSheet = ChooseReactionSheet.this;
            Context context = chooseReactionSheet.getContext();
            context.getClass();
            ReactionView reactionView = new ReactionView(context);
            reactionView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            reactionView.setLockHeightToWidth(true);
            reactionView.setOnClickListener(new BottomSheet$$ExternalSyntheticLambda0(27, chooseReactionSheet, reactionView));
            return new ReactionViewHolder(reactionView);
        }
    }

    public final class ReactionViewHolder extends RecyclerView.ViewHolder {
        public final ReactionView reactionView;

        public ReactionViewHolder(ReactionView reactionView) {
            super(reactionView);
            this.reactionView = reactionView;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseReactionSheet(final Context context, ReactionBuilder reactionBuilder, List list) {
        super(context);
        context.getClass();
        reactionBuilder.getClass();
        list.getClass();
        this.reactionBuilder = reactionBuilder;
        this.extended = list;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.reactions_sheet_top_padding);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.reactions_view_default_size);
        this.maxEmojiSize = dimensionPixelSize2;
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.reactions_sheet_overflow);
        this.maxHeightMode = BottomSheetConfig.HeightMode.FIFTY_PERCENT;
        this.isLocked = true;
        final int dimensionPixelSize4 = context.getResources().getDimensionPixelSize(R.dimen.reactions_sheet_lrb_padding);
        setItemAnimator(null);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        setAdapter(new ReactionAdapter());
        setPadding(dimensionPixelSize4, dimensionPixelSize, dimensionPixelSize4, dimensionPixelSize3 + dimensionPixelSize4);
        setClipToPadding(false);
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.squareup.cash.reactions.views.ChooseReactionSheet$special$$inlined$doOnLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    view.removeOnLayoutChangeListener(this);
                    ChooseReactionSheet chooseReactionSheet = ChooseReactionSheet.this;
                    chooseReactionSheet.setLayoutManager(new GridLayoutManager(context, (chooseReactionSheet.getWidth() - (dimensionPixelSize4 * 2)) / chooseReactionSheet.maxEmojiSize));
                    chooseReactionSheet.post(new zza(chooseReactionSheet, 17));
                }
            });
        } else {
            setLayoutManager(new GridLayoutManager(context, (getWidth() - (dimensionPixelSize4 * 2)) / dimensionPixelSize2));
            post(new zza(this, 17));
        }
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final BottomSheetConfig.HeightMode getMaxHeightMode() {
        return this.maxHeightMode;
    }

    @Override // com.squareup.cash.ui.BottomSheetConfig
    public final boolean isLocked() {
        return this.isLocked;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getClass();
        int actionMasked = motionEvent.getActionMasked();
        ReactionBuilder reactionBuilder = this.reactionBuilder;
        if (actionMasked == 0) {
            reactionBuilder.handler.removeCallbacks(reactionBuilder.reactionTimeout);
            reactionBuilder.timeoutScheduledFor = -1L;
        } else if (actionMasked != 2) {
            reactionBuilder.updateTimeout(2000L);
        }
        return super.onTouchEvent(motionEvent);
    }
}
