package com.braze.ui.contentcards.adapters;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.processing.SurfaceEdge$$ExternalSyntheticLambda3;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OpReorderer;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.jg$$ExternalSyntheticLambda1;
import bo.app.xf$$ExternalSyntheticLambda0;
import com.braze.models.cards.Card;
import com.braze.models.cards.Card$$ExternalSyntheticLambda1;
import com.braze.support.BrazeLogger;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.listeners.IContentCardsActionListener;
import com.braze.ui.contentcards.managers.BrazeContentCardsManager;
import com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter;
import com.braze.ui.contentcards.view.ContentCardViewHolder;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\r\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00018B-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010#\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016J\u0010\u0010%\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020\u0002H\u0016J\u0010\u0010+\u001a\u00020,2\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u0014\u0010-\u001a\u00020 2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\n0\u0015J\u0006\u0010/\u001a\u00020 J\u000e\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020\u001eJ\u0012\u00102\u001a\u0004\u0018\u00010\n2\u0006\u00103\u001a\u00020\u001eH\u0007J\u0010\u00104\u001a\u00020'2\u0006\u00101\u001a\u00020\u001eH\u0007J\u0012\u00105\u001a\u00020 2\b\u00106\u001a\u0004\u0018\u00010\nH\u0007J\u0010\u00107\u001a\u00020'2\u0006\u00103\u001a\u00020\u001eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u00069"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/braze/ui/contentcards/view/ContentCardViewHolder;", "Lcom/braze/ui/contentcards/recycler/ItemTouchHelperAdapter;", "context", "Landroid/content/Context;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "cardData", "", "Lcom/braze/models/cards/Card;", "contentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "<init>", "(Landroid/content/Context;Landroidx/recyclerview/widget/LinearLayoutManager;Ljava/util/List;Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "handler", "Landroid/os/Handler;", "impressedCardIdsInternal", "", "", "impressedCardIds", "", "getImpressedCardIds", "()Ljava/util/List;", "setImpressedCardIds", "(Ljava/util/List;)V", "onCreateViewHolder", "viewGroup", "Landroid/view/ViewGroup;", "viewType", "", "onBindViewHolder", "", "viewHolder", "position", "getItemViewType", "getItemCount", "onItemDismiss", "isItemDismissable", "", "onViewAttachedToWindow", "holder", "onViewDetachedFromWindow", "getItemId", "", "replaceCards", "newCardData", "markOnScreenCardsAsRead", "isControlCardAtPosition", "adapterPosition", "getCardAtIndex", "index", "isAdapterPositionOnScreen", "logImpression", "card", "isInvalidIndex", "CardListDiffCallback", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ContentCardAdapter extends RecyclerView.Adapter implements ItemTouchHelperAdapter {
    private final List<Card> cardData;
    private final IContentCardsViewBindingHandler contentCardsViewBindingHandler;
    private final Context context;
    private final Handler handler;
    private Set<String> impressedCardIdsInternal;
    private final LinearLayoutManager layoutManager;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0016J\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/braze/ui/contentcards/adapters/ContentCardAdapter$CardListDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$Callback;", "oldCards", "", "Lcom/braze/models/cards/Card;", "newCards", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getOldListSize", "", "getNewListSize", "areItemsTheSame", "", "oldItemPosition", "newItemPosition", "areContentsTheSame", "doItemsShareIds", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardListDiffCallback extends DiffUtil.Callback {
        private final List<Card> newCards;
        private final List<Card> oldCards;

        /* JADX WARN: Multi-variable type inference failed */
        public CardListDiffCallback(List<? extends Card> list, List<? extends Card> list2) {
            list.getClass();
            list2.getClass();
            this.oldCards = list;
            this.newCards = list2;
        }

        private final boolean doItemsShareIds(int oldItemPosition, int newItemPosition) {
            return Intrinsics.areEqual(this.oldCards.get(oldItemPosition).getId(), this.newCards.get(newItemPosition).getId());
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
            return doItemsShareIds(oldItemPosition, newItemPosition);
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getNewListSize() {
            return this.newCards.size();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.Callback
        public int getOldListSize() {
            return this.oldCards.size();
        }
    }

    public ContentCardAdapter(Context context, LinearLayoutManager linearLayoutManager, List<Card> list, IContentCardsViewBindingHandler iContentCardsViewBindingHandler) {
        context.getClass();
        linearLayoutManager.getClass();
        list.getClass();
        iContentCardsViewBindingHandler.getClass();
        this.context = context;
        this.layoutManager = linearLayoutManager;
        this.cardData = list;
        this.contentCardsViewBindingHandler = iContentCardsViewBindingHandler;
        this.handler = new Handler(Looper.getMainLooper());
        this.impressedCardIdsInternal = new LinkedHashSet();
        setHasStableIds(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String getCardAtIndex$lambda$0(int i, ContentCardAdapter contentCardAdapter) {
        return Recorder$$ExternalSyntheticOutline2.m("Cannot return card at index: ", i, contentCardAdapter.cardData.size(), " in cards list of size: ");
    }

    private final boolean isInvalidIndex(int index) {
        return index < 0 || index >= this.cardData.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$0(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Logged impression for card ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logImpression$lambda$1(Card card) {
        return Recorder$$ExternalSyntheticOutline2.m("Already counted impression for card ", card.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$0() {
        return "Card list is empty. Not marking on-screen cards as read.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String markOnScreenCardsAsRead$lambda$1(int i, int i2) {
        return Recorder$$ExternalSyntheticOutline2.m("Not marking all on-screen cards as read. Either the first or last index is negative. First visible: ", i, i2, " . Last visible: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void markOnScreenCardsAsRead$lambda$2(int i, int i2, ContentCardAdapter contentCardAdapter) {
        contentCardAdapter.notifyItemRangeChanged(i2, (i - i2) + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onItemDismiss$lambda$0(int i, ContentCardAdapter contentCardAdapter) {
        return Recorder$$ExternalSyntheticOutline2.m("Cannot dismiss card at index: ", i, contentCardAdapter.cardData.size(), " in cards list of size: ");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewAttachedToWindow$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The card at position ", " isn't on screen or does not have a valid adapter position. Not logging impression.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onViewDetachedFromWindow$lambda$0(int i) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "The card at position ", " isn't on screen or does not have a valid adapter position. Not marking as read.");
    }

    public final Card getCardAtIndex(int index) {
        if (!isInvalidIndex(index)) {
            return this.cardData.get(index);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ContentCardAdapter$$ExternalSyntheticLambda1(index, 1, this), 7, (Object) null);
        return null;
    }

    public final List<String> getImpressedCardIds() {
        return CollectionsKt.toList(this.impressedCardIdsInternal);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.cardData.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        String id;
        Card cardAtIndex = getCardAtIndex(position);
        if (cardAtIndex == null || (id = cardAtIndex.getId()) == null) {
            return 0L;
        }
        return id.hashCode();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return this.contentCardsViewBindingHandler.getItemViewType(this.context, this.cardData, position);
    }

    public final boolean isAdapterPositionOnScreen(int adapterPosition) {
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        View findOneVisibleChild = linearLayoutManager.findOneVisibleChild(0, linearLayoutManager.getChildCount(), true, false);
        int min = Math.min(findFirstVisibleItemPosition, findOneVisibleChild == null ? -1 : RecyclerView.LayoutManager.getPosition(findOneVisibleChild));
        int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        LinearLayoutManager linearLayoutManager2 = this.layoutManager;
        View findOneVisibleChild2 = linearLayoutManager2.findOneVisibleChild(linearLayoutManager2.getChildCount() - 1, -1, true, false);
        return min <= adapterPosition && adapterPosition <= Math.max(findLastVisibleItemPosition, findOneVisibleChild2 != null ? RecyclerView.LayoutManager.getPosition(findOneVisibleChild2) : -1);
    }

    public final boolean isControlCardAtPosition(int adapterPosition) {
        Card cardAtIndex = getCardAtIndex(adapterPosition);
        return cardAtIndex != null && cardAtIndex.isControl();
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public boolean isItemDismissable(int position) {
        if (this.cardData.isEmpty() || isInvalidIndex(position)) {
            return false;
        }
        return this.cardData.get(position).getIsDismissibleByUser();
    }

    public final void logImpression(Card card) {
        if (card == null) {
            return;
        }
        if (this.impressedCardIdsInternal.contains(card.getId())) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Card$$ExternalSyntheticLambda1(card, 7), 6, (Object) null);
        } else {
            card.logImpression();
            this.impressedCardIdsInternal.add(card.getId());
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new Card$$ExternalSyntheticLambda1(card, 6), 6, (Object) null);
        }
        if (card.getWasViewedInternal()) {
            return;
        }
        card.setViewed(true);
    }

    public final void markOnScreenCardsAsRead() {
        if (this.cardData.isEmpty()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(27), 7, (Object) null);
            return;
        }
        int findFirstVisibleItemPosition = this.layoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = this.layoutManager.findLastVisibleItemPosition();
        if (findFirstVisibleItemPosition < 0 || findLastVisibleItemPosition < 0) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new xf$$ExternalSyntheticLambda0(findFirstVisibleItemPosition, findLastVisibleItemPosition, 4), 7, (Object) null);
            return;
        }
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int i = findFirstVisibleItemPosition;
            while (true) {
                Card cardAtIndex = getCardAtIndex(i);
                if (cardAtIndex != null) {
                    cardAtIndex.setIndicatorHighlighted(true);
                }
                if (i == findLastVisibleItemPosition) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.handler.post(new SurfaceEdge$$ExternalSyntheticLambda3(findLastVisibleItemPosition, findFirstVisibleItemPosition, this));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(ContentCardViewHolder viewHolder, int position) {
        viewHolder.getClass();
        this.contentCardsViewBindingHandler.onBindViewHolder(this.context, this.cardData, viewHolder, position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ContentCardViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        viewGroup.getClass();
        return this.contentCardsViewBindingHandler.onCreateViewHolder(this.context, this.cardData, viewGroup, viewType);
    }

    @Override // com.braze.ui.contentcards.recycler.ItemTouchHelperAdapter
    public void onItemDismiss(int position) {
        if (isInvalidIndex(position)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new ContentCardAdapter$$ExternalSyntheticLambda1(position, 0, this), 7, (Object) null);
            return;
        }
        Card remove = this.cardData.remove(position);
        remove.setDismissed(true);
        notifyItemRemoved(position);
        IContentCardsActionListener contentCardsActionListener = BrazeContentCardsManager.INSTANCE.getInstance().getContentCardsActionListener();
        if (contentCardsActionListener != null) {
            contentCardsActionListener.onContentCardDismissed(this.context, remove);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(ContentCardViewHolder holder) {
        holder.getClass();
        super.onViewAttachedToWindow((RecyclerView.ViewHolder) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(bindingAdapterPosition, 20), 6, (Object) null);
        } else {
            logImpression(getCardAtIndex(bindingAdapterPosition));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(ContentCardViewHolder holder) {
        holder.getClass();
        super.onViewDetachedFromWindow((RecyclerView.ViewHolder) holder);
        if (this.cardData.isEmpty()) {
            return;
        }
        int bindingAdapterPosition = holder.getBindingAdapterPosition();
        if (bindingAdapterPosition == -1 || !isAdapterPositionOnScreen(bindingAdapterPosition)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new jg$$ExternalSyntheticLambda1(bindingAdapterPosition, 21), 6, (Object) null);
            return;
        }
        Card cardAtIndex = getCardAtIndex(bindingAdapterPosition);
        if (cardAtIndex == null || cardAtIndex.getIsIndicatorHighlightedInternal()) {
            return;
        }
        cardAtIndex.setIndicatorHighlighted(true);
        this.handler.post(new Recorder$$ExternalSyntheticLambda14(this, bindingAdapterPosition, 9));
    }

    public final synchronized void replaceCards(List<? extends Card> newCardData) {
        newCardData.getClass();
        Recorder.SetupVideoTask calculateDiff = DiffUtil.calculateDiff(new CardListDiffCallback(this.cardData, newCardData));
        this.cardData.clear();
        this.cardData.addAll(newCardData);
        calculateDiff.dispatchUpdatesTo(new OpReorderer(this));
    }

    public final void setImpressedCardIds(List<String> list) {
        list.getClass();
        this.impressedCardIdsInternal = CollectionsKt.toMutableSet(list);
    }
}
