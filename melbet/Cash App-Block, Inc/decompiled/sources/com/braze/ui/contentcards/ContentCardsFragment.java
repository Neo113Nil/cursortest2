package com.braze.ui.contentcards;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import bo.app.yf$$ExternalSyntheticLambda2;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.ContentCardsUpdatedEvent;
import com.braze.events.IEventSubscriber;
import com.braze.events.SdkDataWipeEvent;
import com.braze.models.cards.Card;
import com.braze.support.BrazeLogger;
import com.braze.support.c$$ExternalSyntheticLambda2;
import com.braze.ui.R$color;
import com.braze.ui.R$id;
import com.braze.ui.R$layout;
import com.braze.ui.contentcards.adapters.ContentCardAdapter;
import com.braze.ui.contentcards.adapters.EmptyContentCardsAdapter;
import com.braze.ui.contentcards.handlers.DefaultContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.DefaultContentCardsViewBindingHandler;
import com.braze.ui.contentcards.handlers.IContentCardsUpdateHandler;
import com.braze.ui.contentcards.handlers.IContentCardsViewBindingHandler;
import com.braze.ui.contentcards.recycler.ContentCardsDividerItemDecoration;
import com.braze.ui.contentcards.recycler.SimpleItemTouchHelperCallback;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0001hB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001a\u0010\u0004J\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u0004J\u000f\u0010\u001c\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u0004J\u0017\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010 \u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\tH\u0004¢\u0006\u0004\b!\u0010\u0004J\u000f\u0010\"\u001a\u00020\tH\u0004¢\u0006\u0004\b\"\u0010\u0004J\u0017\u0010%\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0004¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\t2\u0006\u0010$\u001a\u00020#H\u0084@¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\tH\u0084@¢\u0006\u0004\b)\u0010*J\u001b\u0010-\u001a\u00020\t2\n\u0010,\u001a\u0006\u0012\u0002\b\u00030+H\u0004¢\u0006\u0004\b-\u0010.R$\u00100\u001a\u0004\u0018\u00010/8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R.\u00107\u001a\u0004\u0018\u0001062\b\u0010\b\u001a\u0004\u0018\u0001068\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\"\u0010A\u001a\u00020@8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010H\u001a\u0004\u0018\u00010G8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR*\u0010O\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010V\u001a\n\u0012\u0004\u0012\u00020U\u0018\u00010N8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bV\u0010P\u001a\u0004\bW\u0010R\"\u0004\bX\u0010TR\u001a\u0010Y\u001a\u00020\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\u0007R$\u0010\\\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\\\u0010Z\u001a\u0004\b]\u0010\u0007\"\u0004\b^\u0010\u000bR\u001a\u0010_\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010\u000eR$\u0010b\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bb\u0010`\u001a\u0004\bc\u0010\u000e\"\u0004\bd\u0010\u0010R\u0018\u0010g\u001a\u0006\u0012\u0002\b\u00030+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\be\u0010f¨\u0006i"}, d2 = {"Lcom/braze/ui/contentcards/ContentCardsFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "<init>", "()V", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getContentCardUpdateHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "value", "", "setContentCardUpdateHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;)V", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getContentCardsViewBindingHandler", "()Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "setContentCardsViewBindingHandler", "(Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onRefresh", "onResume", "onPause", "outState", "onSaveInstanceState", "(Landroid/os/Bundle;)V", "onViewStateRestored", "initializeRecyclerView", "attachSwipeHelperCallback", "Lcom/braze/events/ContentCardsUpdatedEvent;", BreadcrumbHelper.Category.EVENT, "handleContentCardsUpdatedEvent", "(Lcom/braze/events/ContentCardsUpdatedEvent;)V", "contentCardsUpdate", "(Lcom/braze/events/ContentCardsUpdatedEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkUnavailable", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "newAdapter", "swapRecyclerViewAdapter", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V", "Lkotlinx/coroutines/Job;", "networkUnavailableJob", "Lkotlinx/coroutines/Job;", "getNetworkUnavailableJob", "()Lkotlinx/coroutines/Job;", "setNetworkUnavailableJob", "(Lkotlinx/coroutines/Job;)V", "Landroidx/recyclerview/widget/RecyclerView;", "contentCardsRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getContentCardsRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setContentCardsRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "cardAdapter", "Lcom/braze/ui/contentcards/adapters/ContentCardAdapter;", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "defaultEmptyContentCardsAdapter", "Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "getDefaultEmptyContentCardsAdapter", "()Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;", "setDefaultEmptyContentCardsAdapter", "(Lcom/braze/ui/contentcards/adapters/EmptyContentCardsAdapter;)V", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "contentCardsSwipeLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getContentCardsSwipeLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setContentCardsSwipeLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "Lcom/braze/events/IEventSubscriber;", "contentCardsUpdatedSubscriber", "Lcom/braze/events/IEventSubscriber;", "getContentCardsUpdatedSubscriber", "()Lcom/braze/events/IEventSubscriber;", "setContentCardsUpdatedSubscriber", "(Lcom/braze/events/IEventSubscriber;)V", "Lcom/braze/events/SdkDataWipeEvent;", "sdkDataWipeEventSubscriber", "getSdkDataWipeEventSubscriber", "setSdkDataWipeEventSubscriber", "defaultContentCardUpdateHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsUpdateHandler;", "getDefaultContentCardUpdateHandler", "customContentCardUpdateHandler", "getCustomContentCardUpdateHandler", "setCustomContentCardUpdateHandler", "defaultContentCardsViewBindingHandler", "Lcom/braze/ui/contentcards/handlers/IContentCardsViewBindingHandler;", "getDefaultContentCardsViewBindingHandler", "customContentCardsViewBindingHandler", "getCustomContentCardsViewBindingHandler", "setCustomContentCardsViewBindingHandler", "getEmptyCardsAdapter", "()Landroidx/recyclerview/widget/RecyclerView$Adapter;", "emptyCardsAdapter", "Companion", "android-sdk-ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ContentCardsFragment extends Fragment implements SwipeRefreshLayout.OnRefreshListener {
    public ContentCardAdapter cardAdapter;
    private RecyclerView contentCardsRecyclerView;
    private SwipeRefreshLayout contentCardsSwipeLayout;
    private IEventSubscriber<ContentCardsUpdatedEvent> contentCardsUpdatedSubscriber;
    private IContentCardsUpdateHandler customContentCardUpdateHandler;
    private IContentCardsViewBindingHandler customContentCardsViewBindingHandler;
    private Job networkUnavailableJob;
    private IEventSubscriber<SdkDataWipeEvent> sdkDataWipeEventSubscriber;
    private EmptyContentCardsAdapter defaultEmptyContentCardsAdapter = new EmptyContentCardsAdapter();
    private final IContentCardsUpdateHandler defaultContentCardUpdateHandler = new DefaultContentCardsUpdateHandler();
    private final IContentCardsViewBindingHandler defaultContentCardsViewBindingHandler = new DefaultContentCardsViewBindingHandler();

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$0(ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        return "Updating Content Cards views in response to ContentCardsUpdatedEvent: " + contentCardsUpdatedEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$1() {
        return "ContentCards received was older than the max time to live of 60 seconds, displaying it for now, but requesting an updated view from the server.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String contentCardsUpdate$lambda$2() {
        return "Old Content Cards was empty, putting up a network spinner and registering the network error message on a delay of 5000 ms.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String networkUnavailable$lambda$0() {
        return "Network is unavailable.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String onPause$lambda$0() {
        return "Invoked com.braze.ui.contentcards.ContentCardsFragment.onPause()";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$0(ContentCardsFragment contentCardsFragment, ContentCardsUpdatedEvent contentCardsUpdatedEvent) {
        contentCardsUpdatedEvent.getClass();
        contentCardsFragment.handleContentCardsUpdatedEvent(contentCardsUpdatedEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onResume$lambda$2(ContentCardsFragment contentCardsFragment, SdkDataWipeEvent sdkDataWipeEvent) {
        sdkDataWipeEvent.getClass();
        contentCardsFragment.handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent.INSTANCE.getEmptyUpdate());
    }

    public final void attachSwipeHelperCallback() {
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            new ItemTouchHelper(new SimpleItemTouchHelperCallback(contentCardAdapter)).attachToRecyclerView(this.contentCardsRecyclerView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object contentCardsUpdate(ContentCardsUpdatedEvent contentCardsUpdatedEvent, Continuation<? super Unit> continuation) {
        SwipeRefreshLayout swipeRefreshLayout;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new yf$$ExternalSyntheticLambda2(contentCardsUpdatedEvent, 9), 6, (Object) null);
        List<Card> handleCardUpdate = getContentCardUpdateHandler().handleCardUpdate(contentCardsUpdatedEvent);
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.replaceCards(handleCardUpdate);
        }
        Job job = this.networkUnavailableJob;
        if (job != null) {
            job.cancel(null);
        }
        this.networkUnavailableJob = null;
        if (contentCardsUpdatedEvent.getIsFromOfflineStorage() && contentCardsUpdatedEvent.isTimestampOlderThan(60L)) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(24), 6, (Object) null);
            Braze.Companion companion = Braze.INSTANCE;
            Context requireContext = requireContext();
            requireContext.getClass();
            companion.getInstance(requireContext).requestContentCardsRefresh();
            if (handleCardUpdate.isEmpty()) {
                SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
                if (swipeRefreshLayout2 != null) {
                    swipeRefreshLayout2.setRefreshing(true);
                }
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(25), 7, (Object) null);
                Job job2 = this.networkUnavailableJob;
                if (job2 != null) {
                    job2.cancel(null);
                }
                BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
                Long l = new Long(5000L);
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                this.networkUnavailableJob = brazeCoroutineScope.launchDelayed(l, MainDispatcherLoader.dispatcher, new ContentCardsFragment$contentCardsUpdate$5(this, null));
                return Unit.INSTANCE;
            }
        }
        List<Card> list = handleCardUpdate;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((Card) it.next()).isControl()) {
                    ContentCardAdapter contentCardAdapter2 = this.cardAdapter;
                    if (contentCardAdapter2 != null) {
                        swapRecyclerViewAdapter(contentCardAdapter2);
                    }
                    swipeRefreshLayout = this.contentCardsSwipeLayout;
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                    return Unit.INSTANCE;
                }
            }
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            ((Card) it2.next()).logImpression();
        }
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
        }
        return Unit.INSTANCE;
    }

    public final IContentCardsUpdateHandler getContentCardUpdateHandler() {
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        return iContentCardsUpdateHandler == null ? this.defaultContentCardUpdateHandler : iContentCardsUpdateHandler;
    }

    public final RecyclerView getContentCardsRecyclerView() {
        return this.contentCardsRecyclerView;
    }

    public final SwipeRefreshLayout getContentCardsSwipeLayout() {
        return this.contentCardsSwipeLayout;
    }

    public final IContentCardsViewBindingHandler getContentCardsViewBindingHandler() {
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        return iContentCardsViewBindingHandler == null ? this.defaultContentCardsViewBindingHandler : iContentCardsViewBindingHandler;
    }

    public final RecyclerView.Adapter getEmptyCardsAdapter() {
        return this.defaultEmptyContentCardsAdapter;
    }

    public final void handleContentCardsUpdatedEvent(ContentCardsUpdatedEvent event) {
        event.getClass();
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        JobKt.launch$default(brazeCoroutineScope, MainDispatcherLoader.dispatcher, null, new ContentCardsFragment$handleContentCardsUpdatedEvent$1(this, event, null), 2);
    }

    public final void initializeRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        Context requireContext = requireContext();
        requireContext.getClass();
        ContentCardAdapter contentCardAdapter = new ContentCardAdapter(requireContext, linearLayoutManager, new ArrayList(), getContentCardsViewBindingHandler());
        this.cardAdapter = contentCardAdapter;
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null) {
            recyclerView.setAdapter(contentCardAdapter);
        }
        RecyclerView recyclerView2 = this.contentCardsRecyclerView;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(linearLayoutManager);
        }
        attachSwipeHelperCallback();
        RecyclerView recyclerView3 = this.contentCardsRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView3 != null ? recyclerView3.mItemAnimator : null;
        if (itemAnimator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) itemAnimator).mSupportsChangeAnimations = false;
        }
        if (recyclerView3 != null) {
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            recyclerView3.addItemDecoration(new ContentCardsDividerItemDecoration(requireContext2));
        }
    }

    public final Object networkUnavailable(Continuation<? super Unit> continuation) {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(26), 6, (Object) null);
        swapRecyclerViewAdapter(getEmptyCardsAdapter());
        SwipeRefreshLayout swipeRefreshLayout = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setRefreshing(false);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        inflater.getClass();
        View inflate = inflater.inflate(R$layout.com_braze_content_cards, container, false);
        this.contentCardsRecyclerView = (RecyclerView) inflate.findViewById(R$id.com_braze_content_cards_recycler);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R$id.braze_content_cards_swipe_container);
        this.contentCardsSwipeLayout = swipeRefreshLayout;
        if (swipeRefreshLayout != null) {
            swipeRefreshLayout.setOnRefreshListener(this);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = this.contentCardsSwipeLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setColorSchemeResources(R$color.com_braze_content_cards_swipe_refresh_color_1, R$color.com_braze_content_cards_swipe_refresh_color_2, R$color.com_braze_content_cards_swipe_refresh_color_3, R$color.com_braze_content_cards_swipe_refresh_color_4);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, (Function0) new c$$ExternalSyntheticLambda2(23), 6, (Object) null);
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        requireContext.getClass();
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        Context requireContext2 = requireContext();
        requireContext2.getClass();
        companion.getInstance(requireContext2).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        Job job = this.networkUnavailableJob;
        if (job != null) {
            job.cancel(null);
        }
        this.networkUnavailableJob = null;
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            contentCardAdapter.markOnScreenCardsAsRead();
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public void onRefresh() {
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        requireContext.getClass();
        companion.getInstance(requireContext).requestContentCardsRefresh();
        BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, 2500L, null, new ContentCardsFragment$onRefresh$1(this, null), 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Braze.Companion companion = Braze.INSTANCE;
        Context requireContext = requireContext();
        requireContext.getClass();
        companion.getInstance(requireContext).removeSingleSubscription(this.contentCardsUpdatedSubscriber, ContentCardsUpdatedEvent.class);
        if (this.contentCardsUpdatedSubscriber == null) {
            final int i = 0;
            this.contentCardsUpdatedSubscriber = new IEventSubscriber(this) { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda0
                public final /* synthetic */ ContentCardsFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    int i2 = i;
                    ContentCardsFragment contentCardsFragment = this.f$0;
                    switch (i2) {
                        case 0:
                            ContentCardsFragment.onResume$lambda$0(contentCardsFragment, (ContentCardsUpdatedEvent) obj);
                            break;
                        default:
                            ContentCardsFragment.onResume$lambda$2(contentCardsFragment, (SdkDataWipeEvent) obj);
                            break;
                    }
                }
            };
        }
        IEventSubscriber<ContentCardsUpdatedEvent> iEventSubscriber = this.contentCardsUpdatedSubscriber;
        if (iEventSubscriber != null) {
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            companion.getInstance(requireContext2).subscribeToContentCardsUpdates(iEventSubscriber);
        }
        Context requireContext3 = requireContext();
        requireContext3.getClass();
        companion.getInstance(requireContext3).requestContentCardsRefreshFromCache();
        Context requireContext4 = requireContext();
        requireContext4.getClass();
        companion.getInstance(requireContext4).removeSingleSubscription(this.sdkDataWipeEventSubscriber, SdkDataWipeEvent.class);
        if (this.sdkDataWipeEventSubscriber == null) {
            final int i2 = 1;
            this.sdkDataWipeEventSubscriber = new IEventSubscriber(this) { // from class: com.braze.ui.contentcards.ContentCardsFragment$$ExternalSyntheticLambda0
                public final /* synthetic */ ContentCardsFragment f$0;

                {
                    this.f$0 = this;
                }

                @Override // com.braze.events.IEventSubscriber
                public final void trigger(Object obj) {
                    int i22 = i2;
                    ContentCardsFragment contentCardsFragment = this.f$0;
                    switch (i22) {
                        case 0:
                            ContentCardsFragment.onResume$lambda$0(contentCardsFragment, (ContentCardsUpdatedEvent) obj);
                            break;
                        default:
                            ContentCardsFragment.onResume$lambda$2(contentCardsFragment, (SdkDataWipeEvent) obj);
                            break;
                    }
                }
            };
        }
        IEventSubscriber<SdkDataWipeEvent> iEventSubscriber2 = this.sdkDataWipeEventSubscriber;
        if (iEventSubscriber2 != null) {
            Context requireContext5 = requireContext();
            requireContext5.getClass();
            companion.getInstance(requireContext5).addSingleSynchronousSubscription(iEventSubscriber2, SdkDataWipeEvent.class);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        RecyclerView.LayoutManager layoutManager;
        outState.getClass();
        super.onSaveInstanceState(outState);
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView != null && (layoutManager = recyclerView.mLayout) != null) {
            outState.putParcelable("LAYOUT_MANAGER_SAVED_INSTANCE_STATE_KEY", layoutManager.onSaveInstanceState());
        }
        ContentCardAdapter contentCardAdapter = this.cardAdapter;
        if (contentCardAdapter != null) {
            outState.putStringArrayList("KNOWN_CARD_IMPRESSIONS_SAVED_INSTANCE_STATE_KEY", new ArrayList<>(contentCardAdapter.getImpressedCardIds()));
        }
        IContentCardsViewBindingHandler iContentCardsViewBindingHandler = this.customContentCardsViewBindingHandler;
        if (iContentCardsViewBindingHandler != null) {
            outState.putParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsViewBindingHandler);
        }
        IContentCardsUpdateHandler iContentCardsUpdateHandler = this.customContentCardUpdateHandler;
        if (iContentCardsUpdateHandler != null) {
            outState.putParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", iContentCardsUpdateHandler);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            int i = Build.VERSION.SDK_INT;
            IContentCardsUpdateHandler iContentCardsUpdateHandler = i >= 33 ? (IContentCardsUpdateHandler) savedInstanceState.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsUpdateHandler.class) : (IContentCardsUpdateHandler) savedInstanceState.getParcelable("UPDATE_HANDLER_SAVED_INSTANCE_STATE_KEY");
            if (iContentCardsUpdateHandler != null) {
                setContentCardUpdateHandler(iContentCardsUpdateHandler);
            }
            IContentCardsViewBindingHandler iContentCardsViewBindingHandler = i >= 33 ? (IContentCardsViewBindingHandler) savedInstanceState.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY", IContentCardsViewBindingHandler.class) : (IContentCardsViewBindingHandler) savedInstanceState.getParcelable("VIEW_BINDING_HANDLER_SAVED_INSTANCE_STATE_KEY");
            if (iContentCardsViewBindingHandler != null) {
                setContentCardsViewBindingHandler(iContentCardsViewBindingHandler);
            }
            BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
            DefaultScheduler defaultScheduler = Dispatchers.Default;
            JobKt.launch$default(brazeCoroutineScope, MainDispatcherLoader.dispatcher, null, new ContentCardsFragment$onViewStateRestored$1(savedInstanceState, this, null), 2);
        }
        initializeRecyclerView();
    }

    public final void setContentCardUpdateHandler(IContentCardsUpdateHandler value) {
        this.customContentCardUpdateHandler = value;
    }

    public final void setContentCardsViewBindingHandler(IContentCardsViewBindingHandler value) {
        this.customContentCardsViewBindingHandler = value;
    }

    public final void swapRecyclerViewAdapter(RecyclerView.Adapter newAdapter) {
        newAdapter.getClass();
        RecyclerView recyclerView = this.contentCardsRecyclerView;
        if (recyclerView == null || recyclerView.mAdapter == newAdapter) {
            return;
        }
        recyclerView.setAdapter(newAdapter);
    }
}
