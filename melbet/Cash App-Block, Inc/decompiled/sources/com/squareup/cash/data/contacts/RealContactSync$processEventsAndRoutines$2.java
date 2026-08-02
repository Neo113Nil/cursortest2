package com.squareup.cash.data.contacts;

import androidx.compose.ui.node.NodeChain;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.data.contacts.ContactSync$SyncReason;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import com.squareup.cash.data.contacts.ContactSyncState;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.contacts.RealContactSync$syncRequest$2;
import com.squareup.cash.db2.Instrument$Adapter;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.integration.contacts.RealContactBook;
import com.squareup.cash.tabprovider.real.RealTabProvider;
import com.squareup.cash.util.clock.AndroidClock;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.internal.ContextScope;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealContactSync$processEventsAndRoutines$2 extends SuspendLambda implements Function2 {
    public int I$0;
    public int I$1;
    public /* synthetic */ Object L$0;
    public RealContactSyncEventAggregator L$1;
    public ContactSync$ResetReason L$10;
    public Long L$11;
    public RealContactSyncRoutineAggregator L$2;
    public ContactSyncEvent.SyncRoutines L$3;
    public ContactSyncEvent.NewContacts L$4;
    public Long L$5;
    public ContactSyncState L$6;
    public Ref$ObjectRef L$7;
    public BufferedChannel.BufferedChannelIterator L$8;
    public ContactSyncEvent.Reset L$9;
    public int label;
    public final /* synthetic */ RealContactSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealContactSync$processEventsAndRoutines$2(RealContactSync realContactSync, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realContactSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RealContactSync$processEventsAndRoutines$2 realContactSync$processEventsAndRoutines$2 = new RealContactSync$processEventsAndRoutines$2(this.this$0, continuation);
        realContactSync$processEventsAndRoutines$2.L$0 = obj;
        return realContactSync$processEventsAndRoutines$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealContactSync$processEventsAndRoutines$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0561, code lost:
    
        if (r11.setRateLimitedTime(r15) == r13) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x075b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x079f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0802  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x07e6  */
    /* JADX WARN: Removed duplicated region for block: B:196:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0648 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x068e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x06f6  */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v40, types: [com.squareup.cash.data.contacts.ContactSync$ResetReason, com.squareup.cash.data.contacts.ContactSyncEvent$Reset] */
    /* JADX WARN: Type inference failed for: r11v42 */
    /* JADX WARN: Type inference failed for: r11v51 */
    /* JADX WARN: Type inference failed for: r11v69, types: [com.squareup.cash.data.contacts.ContactSyncEvent$NewContacts, com.squareup.cash.data.contacts.ContactSyncEvent$SyncRoutines, com.squareup.cash.data.contacts.ContactSyncState, com.squareup.cash.data.contacts.RealContactSyncEventAggregator, com.squareup.cash.data.contacts.RealContactSyncRoutineAggregator, java.lang.Long, java.lang.Object, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r11v70 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x078c -> B:19:0x0790). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        RealContactSyncEventAggregator realContactSyncEventAggregator;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator;
        ContactSyncEvent.SyncRoutines syncRoutines;
        Ref$ObjectRef ref$ObjectRef;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator;
        int i;
        ContactSyncEvent.NewContacts newContacts;
        Long l;
        ContactSyncState contactSyncState;
        ContactSyncState contactSyncState2;
        Long l2;
        ContactSyncEvent.NewContacts newContacts2;
        RealContactSyncEventAggregator realContactSyncEventAggregator2;
        ContactSyncEvent.SyncRoutines syncRoutines2;
        int i2;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator2;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator2;
        AndroidClock androidClock;
        RealContactSyncEventAggregator realContactSyncEventAggregator3;
        ContactSyncState contactSyncState3;
        Object obj2;
        Ref$ObjectRef ref$ObjectRef2;
        ContactSyncEvent.SyncRoutines syncRoutines3;
        RealContactSyncEventAggregator realContactSyncEventAggregator4;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator3;
        int i3;
        Object obj3;
        ContactSync$ResetReason contactSync$ResetReason;
        Ref$ObjectRef ref$ObjectRef3;
        Long l3;
        ContactSyncEvent.NewContacts newContacts3;
        ContactSyncEvent contactSyncEvent;
        RealContactSyncDetailsRepository realContactSyncDetailsRepository;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator3;
        Object obj4;
        int i4;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator4;
        Ref$ObjectRef ref$ObjectRef4;
        ContactSyncEvent.SyncRoutines syncRoutines4;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator4;
        RealContactSyncEventAggregator realContactSyncEventAggregator5;
        RealContactSyncDetailsRepository realContactSyncDetailsRepository2;
        Long l4;
        Object obj5;
        Object obj6;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator5;
        Ref$ObjectRef ref$ObjectRef5;
        ContactSyncState contactSyncState4;
        ContactSyncEvent.NewContacts newContacts4;
        ContactSyncEvent.SyncRoutines syncRoutines5;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator5;
        RealContactSyncEventAggregator realContactSyncEventAggregator6;
        RealContactSyncDetailsRepository realContactSyncDetailsRepository3;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator6;
        Ref$ObjectRef ref$ObjectRef6;
        Long l5;
        ContactSyncState contactSyncState5;
        ContactSyncState contactSyncState6;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator6;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator7;
        ContactSyncEvent.SyncRoutines syncRoutines6;
        ContactSyncEvent.NewContacts newContacts5;
        Long l6;
        Ref$ObjectRef ref$ObjectRef7;
        int i5;
        RealContactSyncEventAggregator realContactSyncEventAggregator7;
        Object obj7;
        ContactSync$ResetReason contactSync$ResetReason2;
        RealContactSyncEventAggregator realContactSyncEventAggregator8;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator8;
        Ref$ObjectRef ref$ObjectRef8;
        RealContactSyncDetailsRepository realContactSyncDetailsRepository4;
        ContactSyncState contactSyncState7;
        boolean z;
        ContactSyncEvent.SyncRoutines syncRoutines7;
        CoroutineSingletons coroutineSingletons;
        int i6;
        ContactSyncEvent.NewContacts newContacts6;
        RealContactSync realContactSync;
        Object obj8;
        RealContactSync realContactSync2;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator7;
        Object obj9;
        CoroutineSingletons coroutineSingletons2;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator9;
        int i7;
        RealContactSyncEventAggregator realContactSyncEventAggregator9;
        ContactsSyncResponse contactsSyncResponse;
        int i8;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator8;
        ContactSyncEvent.SyncRoutines syncRoutines8;
        ContactSyncEvent.NewContacts newContacts7;
        Long l7;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator10;
        int i9;
        BufferedChannel.BufferedChannelIterator bufferedChannelIterator11;
        ContactSync$ResetReason contactSync$ResetReason3;
        Object stopContactsReading;
        ContactSyncEvent.SyncRoutines syncRoutines9;
        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator9;
        ContactSyncState contactSyncState8;
        Ref$ObjectRef ref$ObjectRef9;
        CoroutineSingletons coroutineSingletons3;
        ?? r11;
        ContactSyncEvent.NewContacts newContacts8;
        int i10;
        CoroutineSingletons coroutineSingletons4;
        Job job;
        Object obj10;
        int i11;
        ?? r112;
        Object hasNext;
        Job job2;
        Object obj11;
        RealContactSync realContactSync3 = this.this$0;
        RealContactSyncDetailsRepository realContactSyncDetailsRepository5 = realContactSync3.contactSyncDetailsRepository;
        ContextScope contextScope = realContactSync3.scope;
        AndroidClock androidClock2 = realContactSync3.clock;
        BufferedChannel bufferedChannel = realContactSync3.eventsAndRoutines;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = this.label;
        ContactSyncState contactSyncState9 = ContactSyncState.Unsynced.INSTANCE;
        switch (i12) {
            case 0:
                SafeTrace.throwOnFailure(obj);
                RealContactSyncEventAggregator$Factory$Impl realContactSyncEventAggregator$Factory$Impl = realContactSync3.eventsFactory;
                bufferedChannel.getClass();
                contextScope.getClass();
                RealContactBook realContactBook = (RealContactBook) realContactSyncEventAggregator$Factory$Impl.delegateFactory.staticImageLoader.invoke();
                realContactBook.getClass();
                realContactSyncEventAggregator = new RealContactSyncEventAggregator(bufferedChannel, realContactBook, null, contextScope);
                RealContactSyncRoutineAggregator$Factory$Impl realContactSyncRoutineAggregator$Factory$Impl = realContactSync3.routinesFactory;
                bufferedChannel.getClass();
                contextScope.getClass();
                Instrument$Adapter instrument$Adapter = realContactSyncRoutineAggregator$Factory$Impl.delegateFactory;
                RealContactRepository realContactRepository = (RealContactRepository) ((Provider) instrument$Adapter.cash_instrument_typeAdapter).invoke();
                NodeChain nodeChain = (NodeChain) ((RealTabProvider.MetroFactory) instrument$Adapter.card_brandAdapter).invoke();
                ComponentRegistry.Builder builder = (ComponentRegistry.Builder) ((RealSessionFlags.MetroFactory) instrument$Adapter.balance_currencyAdapter).invoke();
                realContactRepository.getClass();
                realContactSyncRoutineAggregator = new RealContactSyncRoutineAggregator(bufferedChannel, realContactRepository, nodeChain, builder, null, contextScope);
                syncRoutines = new ContactSyncEvent.SyncRoutines(null, null, null);
                Ref$ObjectRef ref$ObjectRef10 = new Ref$ObjectRef();
                bufferedChannel.getClass();
                ref$ObjectRef = ref$ObjectRef10;
                bufferedChannelIterator = bufferedChannel.new BufferedChannelIterator();
                i = 0;
                newContacts = null;
                l = null;
                contactSyncState = contactSyncState9;
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator;
                this.L$2 = realContactSyncRoutineAggregator;
                this.L$3 = syncRoutines;
                this.L$4 = newContacts;
                this.L$5 = l;
                this.L$6 = contactSyncState;
                this.L$7 = ref$ObjectRef;
                this.L$8 = bufferedChannelIterator;
                ContactSyncState contactSyncState10 = contactSyncState;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = i;
                this.label = 1;
                hasNext = bufferedChannelIterator.hasNext(this);
                if (hasNext != coroutineSingletons5) {
                    Long l8 = l;
                    newContacts2 = newContacts;
                    l2 = l8;
                    obj = hasNext;
                    realContactSyncEventAggregator2 = realContactSyncEventAggregator;
                    syncRoutines2 = syncRoutines;
                    contactSyncState2 = contactSyncState10;
                    if (((Boolean) obj).booleanValue()) {
                        androidClock = androidClock2;
                        contactSyncEvent = (ContactSyncEvent) bufferedChannelIterator.next();
                        contactSyncState3 = contactSyncState9;
                        if (contactSyncEvent instanceof ContactSyncEvent.RequestSync) {
                            ref$ObjectRef.element = ContactSync$SyncReason.AppLaunch.INSTANCE;
                            this.L$0 = coroutineScope;
                            this.L$1 = realContactSyncEventAggregator2;
                            this.L$2 = realContactSyncRoutineAggregator;
                            this.L$3 = syncRoutines2;
                            this.L$4 = newContacts2;
                            this.L$5 = l2;
                            this.L$6 = contactSyncState2;
                            this.L$7 = ref$ObjectRef;
                            this.L$8 = bufferedChannelIterator;
                            this.L$9 = null;
                            this.I$0 = 1;
                            this.label = 2;
                            realContactSyncRoutineAggregator.getClass();
                            obj2 = RealContactSyncRoutineAggregator.hasNotStarted$suspendImpl(realContactSyncRoutineAggregator, this);
                            if (obj2 != coroutineSingletons5) {
                                BufferedChannel.BufferedChannelIterator bufferedChannelIterator12 = bufferedChannelIterator;
                                realContactSyncRoutineAggregator2 = realContactSyncRoutineAggregator;
                                bufferedChannelIterator2 = bufferedChannelIterator12;
                                realContactSyncEventAggregator3 = realContactSyncEventAggregator2;
                                i2 = 1;
                                if (((Boolean) obj2).booleanValue()) {
                                    i10 = i2;
                                    realContactSyncEventAggregator2 = realContactSyncEventAggregator3;
                                    int i13 = i10;
                                    bufferedChannelIterator11 = bufferedChannelIterator2;
                                    i9 = i13;
                                    Long l9 = l2;
                                    contactSyncState6 = contactSyncState2.invalidateSynced();
                                    ref$ObjectRef6 = ref$ObjectRef;
                                    l6 = l9;
                                    realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator2;
                                    realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                                    newContacts5 = newContacts2;
                                    contactSync$ResetReason3 = null;
                                    Flow granted = realContactSync3.readContactsPermission.granted();
                                    this.L$0 = coroutineScope;
                                    this.L$1 = realContactSyncEventAggregator2;
                                    this.L$2 = realContactSyncRoutineAggregator6;
                                    this.L$3 = syncRoutines2;
                                    this.L$4 = newContacts5;
                                    this.L$5 = l6;
                                    this.L$6 = contactSyncState6;
                                    this.L$7 = ref$ObjectRef6;
                                    this.L$8 = bufferedChannelIterator11;
                                    RealContactSyncEventAggregator realContactSyncEventAggregator10 = realContactSyncEventAggregator2;
                                    this.L$9 = null;
                                    this.L$10 = contactSync$ResetReason3;
                                    this.L$11 = null;
                                    this.I$0 = i9;
                                    this.label = 9;
                                    obj7 = FlowKt.firstOrNull(granted, this);
                                    if (obj7 != coroutineSingletons5) {
                                    }
                                } else {
                                    this.L$0 = coroutineScope;
                                    this.L$1 = realContactSyncEventAggregator3;
                                    this.L$2 = null;
                                    this.L$3 = syncRoutines2;
                                    this.L$4 = newContacts2;
                                    this.L$5 = l2;
                                    this.L$6 = contactSyncState2;
                                    this.L$7 = ref$ObjectRef;
                                    this.L$8 = bufferedChannelIterator2;
                                    this.L$9 = null;
                                    this.I$0 = i2;
                                    this.label = 3;
                                    int i14 = i2;
                                    bufferedChannelIterator3 = bufferedChannelIterator2;
                                    StandaloneCoroutine launch$default = JobKt.launch$default(realContactSyncRoutineAggregator2.scope, null, null, new CardModelView.AnonymousClass1.C00581(realContactSyncRoutineAggregator2, null, 29), 3);
                                    Channel channel = realContactSyncRoutineAggregator2.events;
                                    ContactsSyncRoutine contactsSyncRoutine = realContactSyncRoutineAggregator2.contactDatabaseRoutine;
                                    ContactsSyncRoutine contactsSyncRoutine2 = realContactSyncRoutineAggregator2.detailedContactsSyncEncryptedRoutine;
                                    ContactsSyncRoutine contactsSyncRoutine3 = realContactSyncRoutineAggregator2.contactsSyncToServerRoutine;
                                    CoroutineScope coroutineScope2 = realContactSyncRoutineAggregator2.scope;
                                    channel.getClass();
                                    coroutineScope2.getClass();
                                    obj3 = new RealContactSyncRoutineAggregator(channel, contactsSyncRoutine, contactsSyncRoutine2, contactsSyncRoutine3, launch$default, coroutineScope2);
                                    if (obj3 != coroutineSingletons5) {
                                        i3 = i14;
                                        ref$ObjectRef2 = ref$ObjectRef;
                                        realContactSyncEventAggregator4 = realContactSyncEventAggregator3;
                                        syncRoutines3 = syncRoutines2;
                                        RealContactSyncEventAggregator realContactSyncEventAggregator11 = realContactSyncEventAggregator4;
                                        realContactSyncRoutineAggregator2 = (RealContactSyncRoutineAggregator) obj3;
                                        realContactSyncEventAggregator2 = realContactSyncEventAggregator11;
                                        syncRoutines2 = syncRoutines3;
                                        ref$ObjectRef = ref$ObjectRef2;
                                        i10 = i3;
                                        bufferedChannelIterator2 = bufferedChannelIterator3;
                                        int i132 = i10;
                                        bufferedChannelIterator11 = bufferedChannelIterator2;
                                        i9 = i132;
                                        Long l92 = l2;
                                        contactSyncState6 = contactSyncState2.invalidateSynced();
                                        ref$ObjectRef6 = ref$ObjectRef;
                                        l6 = l92;
                                        realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator2;
                                        realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                                        newContacts5 = newContacts2;
                                        contactSync$ResetReason3 = null;
                                        Flow granted2 = realContactSync3.readContactsPermission.granted();
                                        this.L$0 = coroutineScope;
                                        this.L$1 = realContactSyncEventAggregator2;
                                        this.L$2 = realContactSyncRoutineAggregator6;
                                        this.L$3 = syncRoutines2;
                                        this.L$4 = newContacts5;
                                        this.L$5 = l6;
                                        this.L$6 = contactSyncState6;
                                        this.L$7 = ref$ObjectRef6;
                                        this.L$8 = bufferedChannelIterator11;
                                        RealContactSyncEventAggregator realContactSyncEventAggregator102 = realContactSyncEventAggregator2;
                                        this.L$9 = null;
                                        this.L$10 = contactSync$ResetReason3;
                                        this.L$11 = null;
                                        this.I$0 = i9;
                                        this.label = 9;
                                        obj7 = FlowKt.firstOrNull(granted2, this);
                                        if (obj7 != coroutineSingletons5) {
                                        }
                                    }
                                }
                            }
                        } else if (contactSyncEvent instanceof ContactSyncEvent.SyncRoutines) {
                            Long l10 = l2;
                            contactSyncState6 = contactSyncState2;
                            ref$ObjectRef6 = ref$ObjectRef;
                            l6 = l10;
                            realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator;
                            i9 = i;
                            bufferedChannelIterator11 = bufferedChannelIterator;
                            syncRoutines2 = (ContactSyncEvent.SyncRoutines) contactSyncEvent;
                            newContacts5 = newContacts2;
                            realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                            contactSync$ResetReason3 = null;
                            Flow granted22 = realContactSync3.readContactsPermission.granted();
                            this.L$0 = coroutineScope;
                            this.L$1 = realContactSyncEventAggregator2;
                            this.L$2 = realContactSyncRoutineAggregator6;
                            this.L$3 = syncRoutines2;
                            this.L$4 = newContacts5;
                            this.L$5 = l6;
                            this.L$6 = contactSyncState6;
                            this.L$7 = ref$ObjectRef6;
                            this.L$8 = bufferedChannelIterator11;
                            RealContactSyncEventAggregator realContactSyncEventAggregator1022 = realContactSyncEventAggregator2;
                            this.L$9 = null;
                            this.L$10 = contactSync$ResetReason3;
                            this.L$11 = null;
                            this.I$0 = i9;
                            this.label = 9;
                            obj7 = FlowKt.firstOrNull(granted22, this);
                            if (obj7 != coroutineSingletons5) {
                            }
                        } else if (contactSyncEvent instanceof ContactSyncEvent.NewContacts) {
                            Long l11 = l2;
                            contactSyncState6 = contactSyncState2.invalidateSynced();
                            ref$ObjectRef6 = ref$ObjectRef;
                            l6 = l11;
                            realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator;
                            i9 = i;
                            bufferedChannelIterator11 = bufferedChannelIterator;
                            newContacts5 = (ContactSyncEvent.NewContacts) contactSyncEvent;
                            contactSync$ResetReason3 = null;
                            realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                            Flow granted222 = realContactSync3.readContactsPermission.granted();
                            this.L$0 = coroutineScope;
                            this.L$1 = realContactSyncEventAggregator2;
                            this.L$2 = realContactSyncRoutineAggregator6;
                            this.L$3 = syncRoutines2;
                            this.L$4 = newContacts5;
                            this.L$5 = l6;
                            this.L$6 = contactSyncState6;
                            this.L$7 = ref$ObjectRef6;
                            this.L$8 = bufferedChannelIterator11;
                            RealContactSyncEventAggregator realContactSyncEventAggregator10222 = realContactSyncEventAggregator2;
                            this.L$9 = null;
                            this.L$10 = contactSync$ResetReason3;
                            this.L$11 = null;
                            this.I$0 = i9;
                            this.label = 9;
                            obj7 = FlowKt.firstOrNull(granted222, this);
                            if (obj7 != coroutineSingletons5) {
                            }
                        } else if (contactSyncEvent instanceof ContactSyncEvent.Reset) {
                            ContactSyncEvent.Reset reset = (ContactSyncEvent.Reset) contactSyncEvent;
                            realContactSyncDetailsRepository = realContactSyncDetailsRepository5;
                            ContactSync$ResetReason reason = reset.getReason();
                            this.L$0 = coroutineScope;
                            this.L$1 = realContactSyncEventAggregator2;
                            this.L$2 = realContactSyncRoutineAggregator;
                            this.L$3 = syncRoutines2;
                            this.L$4 = newContacts2;
                            this.L$5 = l2;
                            Long l12 = l2;
                            this.L$6 = null;
                            this.L$7 = ref$ObjectRef;
                            this.L$8 = bufferedChannelIterator;
                            this.L$9 = reset;
                            this.L$10 = reason;
                            this.I$0 = i;
                            this.label = 4;
                            obj4 = RealContactSync.access$resetState(realContactSync3, contactSyncState2, reason, this);
                            if (obj4 != coroutineSingletons5) {
                                realContactSyncRoutineAggregator3 = realContactSyncRoutineAggregator;
                                contactSync$ResetReason = reason;
                                ref$ObjectRef3 = ref$ObjectRef;
                                newContacts3 = newContacts2;
                                l3 = l12;
                                ((RealContactSync$reset$2$1) ((ContactSyncEvent.Reset) contactSyncEvent).getOnDone()).invoke();
                                Long l13 = l3;
                                contactSync$ResetReason3 = contactSync$ResetReason;
                                i9 = i;
                                bufferedChannelIterator11 = bufferedChannelIterator;
                                newContacts5 = newContacts3;
                                l6 = l13;
                                Ref$ObjectRef ref$ObjectRef11 = ref$ObjectRef3;
                                contactSyncState6 = (ContactSyncState) obj4;
                                ref$ObjectRef6 = ref$ObjectRef11;
                                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator3;
                                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository;
                                Flow granted2222 = realContactSync3.readContactsPermission.granted();
                                this.L$0 = coroutineScope;
                                this.L$1 = realContactSyncEventAggregator2;
                                this.L$2 = realContactSyncRoutineAggregator6;
                                this.L$3 = syncRoutines2;
                                this.L$4 = newContacts5;
                                this.L$5 = l6;
                                this.L$6 = contactSyncState6;
                                this.L$7 = ref$ObjectRef6;
                                this.L$8 = bufferedChannelIterator11;
                                RealContactSyncEventAggregator realContactSyncEventAggregator102222 = realContactSyncEventAggregator2;
                                this.L$9 = null;
                                this.L$10 = contactSync$ResetReason3;
                                this.L$11 = null;
                                this.I$0 = i9;
                                this.label = 9;
                                obj7 = FlowKt.firstOrNull(granted2222, this);
                                if (obj7 != coroutineSingletons5) {
                                    ContactSyncEvent.SyncRoutines syncRoutines10 = syncRoutines2;
                                    bufferedChannelIterator7 = bufferedChannelIterator11;
                                    syncRoutines6 = syncRoutines10;
                                    contactSync$ResetReason2 = contactSync$ResetReason3;
                                    realContactSyncEventAggregator7 = realContactSyncEventAggregator102222;
                                    ref$ObjectRef7 = ref$ObjectRef6;
                                    i5 = i9;
                                    int i15 = (Intrinsics.areEqual(obj7, Boolean.TRUE) || realContactSync3.contactsSyncState.get() == ContactsSyncState.OFF) ? 0 : 1;
                                    contactSyncState8 = contactSyncState3;
                                    if (Intrinsics.areEqual(contactSyncState6, contactSyncState8) || newContacts5 == null) {
                                        contactSyncState7 = contactSyncState8;
                                    } else {
                                        contactSyncState7 = contactSyncState8;
                                        if (!(syncRoutines6.databaseUpdate == null && syncRoutines6.hashAliasUpload == null && syncRoutines6.detailedContactsUpload == null) && i15 != 0 && contactSync$ResetReason2 == null) {
                                            Long l14 = l6;
                                            int i16 = i15;
                                            newContacts8 = newContacts5;
                                            realContactSyncDetailsRepository4 = realContactSyncDetailsRepository3;
                                            coroutineSingletons3 = coroutineSingletons5;
                                            i6 = i16;
                                            r11 = 0;
                                            z = true;
                                            RealContactSync$syncRequest$2.AnonymousClass1 anonymousClass1 = new RealContactSync$syncRequest$2.AnonymousClass1(realContactSync3, newContacts8, syncRoutines6, i5 != 0, l14, ref$ObjectRef7, (Continuation) null, 4);
                                            realContactSync = realContactSync3;
                                            ref$ObjectRef9 = ref$ObjectRef7;
                                            l = l14;
                                            contactSyncState6 = new ContactSyncState.Syncing(JobKt.async$default(coroutineScope, null, null, anonymousClass1, 3));
                                            i5 = 0;
                                            if (!((syncRoutines6.databaseUpdate != null && syncRoutines6.hashAliasUpload == null && syncRoutines6.detailedContactsUpload == null) ? z : false) || i6 == 0) {
                                                realContactSync2 = realContactSync;
                                                coroutineSingletons2 = coroutineSingletons3;
                                                int i17 = i5;
                                                syncRoutines = syncRoutines6;
                                                i = i17;
                                                ref$ObjectRef = ref$ObjectRef9;
                                                realContactSyncEventAggregator9 = realContactSyncEventAggregator7;
                                                bufferedChannelIterator9 = bufferedChannelIterator7;
                                                newContacts6 = newContacts8;
                                                int i18 = i6;
                                                realContactSyncRoutineAggregator = realContactSyncRoutineAggregator6;
                                                if ((syncRoutines.databaseUpdate != null && syncRoutines.hashAliasUpload == null && syncRoutines.detailedContactsUpload == null) || i18 == 0) {
                                                    this.L$0 = coroutineScope;
                                                    this.L$1 = realContactSyncEventAggregator9;
                                                    this.L$2 = realContactSyncRoutineAggregator;
                                                    this.L$3 = syncRoutines;
                                                    this.L$4 = newContacts6;
                                                    this.L$5 = l;
                                                    this.L$6 = contactSyncState6;
                                                    this.L$7 = ref$ObjectRef;
                                                    this.L$8 = bufferedChannelIterator9;
                                                    this.L$9 = null;
                                                    this.L$10 = null;
                                                    this.I$0 = i;
                                                    this.I$1 = i18;
                                                    this.label = 12;
                                                    obj9 = Boolean.valueOf(realContactSyncEventAggregator9.readContactsJob != null ? z : false);
                                                    if (obj9 == coroutineSingletons2) {
                                                        return coroutineSingletons2;
                                                    }
                                                    i7 = i18;
                                                    contactSyncState = contactSyncState6;
                                                    realContactSyncRoutineAggregator7 = realContactSyncRoutineAggregator;
                                                    if (((Boolean) obj9).booleanValue()) {
                                                        coroutineSingletons5 = coroutineSingletons2;
                                                        realContactSyncRoutineAggregator = realContactSyncRoutineAggregator7;
                                                        bufferedChannelIterator = bufferedChannelIterator9;
                                                        newContacts = newContacts6;
                                                        contactSyncState9 = contactSyncState7;
                                                        realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                                                        realContactSync3 = realContactSync2;
                                                        realContactSyncEventAggregator = realContactSyncEventAggregator9;
                                                        androidClock2 = androidClock;
                                                        this.L$0 = coroutineScope;
                                                        this.L$1 = realContactSyncEventAggregator;
                                                        this.L$2 = realContactSyncRoutineAggregator;
                                                        this.L$3 = syncRoutines;
                                                        this.L$4 = newContacts;
                                                        this.L$5 = l;
                                                        this.L$6 = contactSyncState;
                                                        this.L$7 = ref$ObjectRef;
                                                        this.L$8 = bufferedChannelIterator;
                                                        ContactSyncState contactSyncState102 = contactSyncState;
                                                        this.L$9 = null;
                                                        this.L$10 = null;
                                                        this.I$0 = i;
                                                        this.label = 1;
                                                        hasNext = bufferedChannelIterator.hasNext(this);
                                                        if (hasNext != coroutineSingletons5) {
                                                        }
                                                    } else {
                                                        Timber.Forest.i("No listeners are active or permission removed, disabling contacts reading.", new Object[0]);
                                                        this.L$0 = coroutineScope;
                                                        this.L$1 = null;
                                                        this.L$2 = realContactSyncRoutineAggregator7;
                                                        this.L$3 = syncRoutines;
                                                        this.L$4 = null;
                                                        this.L$5 = l;
                                                        this.L$6 = contactSyncState;
                                                        this.L$7 = ref$ObjectRef;
                                                        this.L$8 = bufferedChannelIterator9;
                                                        this.L$9 = null;
                                                        this.L$10 = null;
                                                        this.I$0 = i;
                                                        this.I$1 = i7;
                                                        this.label = 13;
                                                        stopContactsReading = realContactSyncEventAggregator9.stopContactsReading(this);
                                                        if (stopContactsReading == coroutineSingletons2) {
                                                            return coroutineSingletons2;
                                                        }
                                                        RealContactSyncRoutineAggregator realContactSyncRoutineAggregator10 = realContactSyncRoutineAggregator7;
                                                        syncRoutines9 = syncRoutines;
                                                        realContactSyncRoutineAggregator9 = realContactSyncRoutineAggregator10;
                                                        bufferedChannelIterator = bufferedChannelIterator9;
                                                        realContactSyncEventAggregator = (RealContactSyncEventAggregator) stopContactsReading;
                                                        coroutineSingletons5 = coroutineSingletons2;
                                                        realContactSyncRoutineAggregator = realContactSyncRoutineAggregator9;
                                                        syncRoutines = syncRoutines9;
                                                        contactSyncState9 = contactSyncState7;
                                                        androidClock2 = androidClock;
                                                        realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                                                        newContacts = null;
                                                        realContactSync3 = realContactSync2;
                                                        this.L$0 = coroutineScope;
                                                        this.L$1 = realContactSyncEventAggregator;
                                                        this.L$2 = realContactSyncRoutineAggregator;
                                                        this.L$3 = syncRoutines;
                                                        this.L$4 = newContacts;
                                                        this.L$5 = l;
                                                        this.L$6 = contactSyncState;
                                                        this.L$7 = ref$ObjectRef;
                                                        this.L$8 = bufferedChannelIterator;
                                                        ContactSyncState contactSyncState1022 = contactSyncState;
                                                        this.L$9 = null;
                                                        this.L$10 = null;
                                                        this.I$0 = i;
                                                        this.label = 1;
                                                        hasNext = bufferedChannelIterator.hasNext(this);
                                                        if (hasNext != coroutineSingletons5) {
                                                        }
                                                    }
                                                } else {
                                                    coroutineSingletons5 = coroutineSingletons2;
                                                    contactSyncState = contactSyncState6;
                                                    bufferedChannelIterator = bufferedChannelIterator9;
                                                    newContacts = newContacts6;
                                                    contactSyncState9 = contactSyncState7;
                                                    realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                                                    realContactSync3 = realContactSync2;
                                                    realContactSyncEventAggregator = realContactSyncEventAggregator9;
                                                    androidClock2 = androidClock;
                                                    this.L$0 = coroutineScope;
                                                    this.L$1 = realContactSyncEventAggregator;
                                                    this.L$2 = realContactSyncRoutineAggregator;
                                                    this.L$3 = syncRoutines;
                                                    this.L$4 = newContacts;
                                                    this.L$5 = l;
                                                    this.L$6 = contactSyncState;
                                                    this.L$7 = ref$ObjectRef;
                                                    this.L$8 = bufferedChannelIterator;
                                                    ContactSyncState contactSyncState10222 = contactSyncState;
                                                    this.L$9 = null;
                                                    this.L$10 = null;
                                                    this.I$0 = i;
                                                    this.label = 1;
                                                    hasNext = bufferedChannelIterator.hasNext(this);
                                                    if (hasNext != coroutineSingletons5) {
                                                    }
                                                }
                                            } else {
                                                this.L$0 = coroutineScope;
                                                this.L$1 = realContactSyncEventAggregator7;
                                                this.L$2 = realContactSyncRoutineAggregator6;
                                                this.L$3 = syncRoutines6;
                                                this.L$4 = newContacts8;
                                                this.L$5 = l;
                                                this.L$6 = contactSyncState6;
                                                this.L$7 = ref$ObjectRef9;
                                                this.L$8 = bufferedChannelIterator7;
                                                this.L$9 = r11;
                                                this.L$10 = r11;
                                                this.I$0 = i5;
                                                this.I$1 = i6;
                                                this.label = 10;
                                                obj8 = Boolean.valueOf(realContactSyncEventAggregator7.readContactsJob != null ? z : false);
                                                coroutineSingletons = coroutineSingletons3;
                                                if (obj8 == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                                ContactSyncEvent.SyncRoutines syncRoutines11 = syncRoutines6;
                                                ref$ObjectRef8 = ref$ObjectRef9;
                                                realContactSyncEventAggregator8 = realContactSyncEventAggregator7;
                                                syncRoutines7 = syncRoutines11;
                                                BufferedChannel.BufferedChannelIterator bufferedChannelIterator13 = bufferedChannelIterator7;
                                                newContacts6 = newContacts8;
                                                bufferedChannelIterator8 = bufferedChannelIterator13;
                                                if (((Boolean) obj8).booleanValue()) {
                                                    realContactSync2 = realContactSync;
                                                    CoroutineSingletons coroutineSingletons6 = coroutineSingletons;
                                                    Timber.Forest.i("Permissions have been granted, requesting contacts.", new Object[0]);
                                                    this.L$0 = coroutineScope;
                                                    this.L$1 = null;
                                                    this.L$2 = realContactSyncRoutineAggregator6;
                                                    this.L$3 = syncRoutines7;
                                                    this.L$4 = newContacts6;
                                                    this.L$5 = l;
                                                    this.L$6 = contactSyncState6;
                                                    this.L$7 = ref$ObjectRef8;
                                                    this.L$8 = bufferedChannelIterator8;
                                                    this.L$9 = null;
                                                    this.L$10 = null;
                                                    this.I$0 = i5;
                                                    this.I$1 = i6;
                                                    this.label = 11;
                                                    if (realContactSyncEventAggregator8.readContactsJob != null) {
                                                        a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
                                                        return null;
                                                    }
                                                    RealContactSyncEventAggregator copy$default = RealContactSyncEventAggregator.copy$default(realContactSyncEventAggregator8, JobKt.launch$default(realContactSyncEventAggregator8.scope, null, null, new CardModelView.AnonymousClass1.C00581(realContactSyncEventAggregator8, null, 28), 3));
                                                    if (copy$default == coroutineSingletons6) {
                                                        return coroutineSingletons6;
                                                    }
                                                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator14 = bufferedChannelIterator8;
                                                    ContactSyncEvent.SyncRoutines syncRoutines12 = syncRoutines7;
                                                    realContactSyncRoutineAggregator = realContactSyncRoutineAggregator6;
                                                    Ref$ObjectRef ref$ObjectRef12 = ref$ObjectRef8;
                                                    i = i5;
                                                    ContactSyncState contactSyncState11 = contactSyncState6;
                                                    newContacts = newContacts6;
                                                    realContactSyncEventAggregator = copy$default;
                                                    contactSyncState = contactSyncState11;
                                                    syncRoutines = syncRoutines12;
                                                    ref$ObjectRef = ref$ObjectRef12;
                                                    bufferedChannelIterator = bufferedChannelIterator14;
                                                    contactSyncState9 = contactSyncState7;
                                                    androidClock2 = androidClock;
                                                    realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                                                    coroutineSingletons5 = coroutineSingletons6;
                                                    realContactSync3 = realContactSync2;
                                                    this.L$0 = coroutineScope;
                                                    this.L$1 = realContactSyncEventAggregator;
                                                    this.L$2 = realContactSyncRoutineAggregator;
                                                    this.L$3 = syncRoutines;
                                                    this.L$4 = newContacts;
                                                    this.L$5 = l;
                                                    this.L$6 = contactSyncState;
                                                    this.L$7 = ref$ObjectRef;
                                                    this.L$8 = bufferedChannelIterator;
                                                    ContactSyncState contactSyncState102222 = contactSyncState;
                                                    this.L$9 = null;
                                                    this.L$10 = null;
                                                    this.I$0 = i;
                                                    this.label = 1;
                                                    hasNext = bufferedChannelIterator.hasNext(this);
                                                    if (hasNext != coroutineSingletons5) {
                                                    }
                                                } else {
                                                    realContactSync2 = realContactSync;
                                                    coroutineSingletons2 = coroutineSingletons;
                                                    realContactSyncEventAggregator9 = realContactSyncEventAggregator8;
                                                    ref$ObjectRef = ref$ObjectRef8;
                                                    i = i5;
                                                    syncRoutines = syncRoutines7;
                                                    bufferedChannelIterator9 = bufferedChannelIterator8;
                                                    int i182 = i6;
                                                    realContactSyncRoutineAggregator = realContactSyncRoutineAggregator6;
                                                    if (syncRoutines.databaseUpdate != null) {
                                                    }
                                                    coroutineSingletons5 = coroutineSingletons2;
                                                    contactSyncState = contactSyncState6;
                                                    bufferedChannelIterator = bufferedChannelIterator9;
                                                    newContacts = newContacts6;
                                                    contactSyncState9 = contactSyncState7;
                                                    realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                                                    realContactSync3 = realContactSync2;
                                                    realContactSyncEventAggregator = realContactSyncEventAggregator9;
                                                    androidClock2 = androidClock;
                                                    this.L$0 = coroutineScope;
                                                    this.L$1 = realContactSyncEventAggregator;
                                                    this.L$2 = realContactSyncRoutineAggregator;
                                                    this.L$3 = syncRoutines;
                                                    this.L$4 = newContacts;
                                                    this.L$5 = l;
                                                    this.L$6 = contactSyncState;
                                                    this.L$7 = ref$ObjectRef;
                                                    this.L$8 = bufferedChannelIterator;
                                                    ContactSyncState contactSyncState1022222 = contactSyncState;
                                                    this.L$9 = null;
                                                    this.L$10 = null;
                                                    this.I$0 = i;
                                                    this.label = 1;
                                                    hasNext = bufferedChannelIterator.hasNext(this);
                                                    if (hasNext != coroutineSingletons5) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    ref$ObjectRef9 = ref$ObjectRef7;
                                    l = l6;
                                    realContactSyncDetailsRepository4 = realContactSyncDetailsRepository3;
                                    coroutineSingletons3 = coroutineSingletons5;
                                    r11 = 0;
                                    z = true;
                                    realContactSync = realContactSync3;
                                    i6 = i15;
                                    newContacts8 = newContacts5;
                                    if ((syncRoutines6.databaseUpdate != null && syncRoutines6.hashAliasUpload == null && syncRoutines6.detailedContactsUpload == null) ? z : false) {
                                    }
                                    realContactSync2 = realContactSync;
                                    coroutineSingletons2 = coroutineSingletons3;
                                    int i172 = i5;
                                    syncRoutines = syncRoutines6;
                                    i = i172;
                                    ref$ObjectRef = ref$ObjectRef9;
                                    realContactSyncEventAggregator9 = realContactSyncEventAggregator7;
                                    bufferedChannelIterator9 = bufferedChannelIterator7;
                                    newContacts6 = newContacts8;
                                    int i1822 = i6;
                                    realContactSyncRoutineAggregator = realContactSyncRoutineAggregator6;
                                    if (syncRoutines.databaseUpdate != null) {
                                    }
                                    coroutineSingletons5 = coroutineSingletons2;
                                    contactSyncState = contactSyncState6;
                                    bufferedChannelIterator = bufferedChannelIterator9;
                                    newContacts = newContacts6;
                                    contactSyncState9 = contactSyncState7;
                                    realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                                    realContactSync3 = realContactSync2;
                                    realContactSyncEventAggregator = realContactSyncEventAggregator9;
                                    androidClock2 = androidClock;
                                    this.L$0 = coroutineScope;
                                    this.L$1 = realContactSyncEventAggregator;
                                    this.L$2 = realContactSyncRoutineAggregator;
                                    this.L$3 = syncRoutines;
                                    this.L$4 = newContacts;
                                    this.L$5 = l;
                                    this.L$6 = contactSyncState;
                                    this.L$7 = ref$ObjectRef;
                                    this.L$8 = bufferedChannelIterator;
                                    ContactSyncState contactSyncState10222222 = contactSyncState;
                                    this.L$9 = null;
                                    this.L$10 = null;
                                    this.I$0 = i;
                                    this.label = 1;
                                    hasNext = bufferedChannelIterator.hasNext(this);
                                    if (hasNext != coroutineSingletons5) {
                                    }
                                }
                            }
                        } else {
                            Long l15 = l2;
                            realContactSyncDetailsRepository2 = realContactSyncDetailsRepository5;
                            if (!(contactSyncEvent instanceof ContactSyncEvent.ContactSyncCompleted)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (contactSyncState2 instanceof ContactSyncState.Syncing) {
                                Deferred job3 = ((ContactSyncState.Syncing) contactSyncState2).getJob();
                                this.L$0 = coroutineScope;
                                this.L$1 = realContactSyncEventAggregator2;
                                this.L$2 = realContactSyncRoutineAggregator;
                                this.L$3 = syncRoutines2;
                                this.L$4 = newContacts2;
                                l4 = l15;
                                this.L$5 = l4;
                                this.L$6 = contactSyncState2;
                                this.L$7 = ref$ObjectRef;
                                this.L$8 = bufferedChannelIterator;
                                this.L$9 = null;
                                this.I$0 = i;
                                this.label = 5;
                                obj5 = ((DeferredCoroutine) job3).awaitInternal(this);
                                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                if (obj5 != coroutineSingletons5) {
                                    ContactSyncEvent.SyncRoutines syncRoutines13 = syncRoutines2;
                                    realContactSyncEventAggregator5 = realContactSyncEventAggregator2;
                                    i4 = i;
                                    ref$ObjectRef4 = ref$ObjectRef;
                                    syncRoutines4 = syncRoutines13;
                                    BufferedChannel.BufferedChannelIterator bufferedChannelIterator15 = bufferedChannelIterator;
                                    realContactSyncRoutineAggregator4 = realContactSyncRoutineAggregator;
                                    bufferedChannelIterator4 = bufferedChannelIterator15;
                                    contactsSyncResponse = (ContactsSyncResponse) obj5;
                                    Ref$ObjectRef ref$ObjectRef13 = ref$ObjectRef4;
                                    bufferedChannelIterator6 = bufferedChannelIterator4;
                                    contactSyncState5 = contactSyncState2;
                                    ref$ObjectRef6 = ref$ObjectRef13;
                                    if (!(contactsSyncResponse instanceof ContactsSyncResponse.Success)) {
                                        realContactSyncDetailsRepository3 = realContactSyncDetailsRepository2;
                                        if (!(contactsSyncResponse instanceof ContactsSyncResponse.WasRateLimited)) {
                                            if ((contactsSyncResponse instanceof ContactsSyncResponse.Failure) && ((ContactsSyncResponse.Failure) contactsSyncResponse).getRateLimited()) {
                                                l5 = new Long(androidClock.millis() + RealContactSync.SOFT_RATE_LIMIT_DELAY);
                                                Long l16 = new Long(l5.longValue());
                                                this.L$0 = coroutineScope;
                                                this.L$1 = realContactSyncEventAggregator5;
                                                this.L$2 = realContactSyncRoutineAggregator4;
                                                this.L$3 = syncRoutines4;
                                                this.L$4 = newContacts2;
                                                this.L$5 = null;
                                                this.L$6 = contactSyncState5;
                                                this.L$7 = ref$ObjectRef6;
                                                this.L$8 = bufferedChannelIterator6;
                                                this.L$9 = null;
                                                this.L$10 = null;
                                                this.L$11 = l5;
                                                this.I$0 = i4;
                                                this.I$1 = 0;
                                                this.label = 8;
                                                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository3;
                                                break;
                                            } else {
                                                bufferedChannelIterator10 = bufferedChannelIterator6;
                                                i8 = i4;
                                                realContactSyncEventAggregator2 = realContactSyncEventAggregator5;
                                                realContactSyncRoutineAggregator8 = realContactSyncRoutineAggregator4;
                                                syncRoutines8 = syncRoutines4;
                                                newContacts7 = newContacts2;
                                                l7 = null;
                                                BufferedChannel.BufferedChannelIterator bufferedChannelIterator16 = bufferedChannelIterator10;
                                                contactSyncState6 = !(contactSyncState5 instanceof ContactSyncState.Syncing) ? ContactSyncState.Synced.INSTANCE : contactSyncState3;
                                                i9 = i8;
                                                bufferedChannelIterator11 = bufferedChannelIterator16;
                                                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator8;
                                                syncRoutines2 = syncRoutines8;
                                                newContacts5 = newContacts7;
                                                l6 = l7;
                                                contactSync$ResetReason3 = null;
                                                Flow granted22222 = realContactSync3.readContactsPermission.granted();
                                                this.L$0 = coroutineScope;
                                                this.L$1 = realContactSyncEventAggregator2;
                                                this.L$2 = realContactSyncRoutineAggregator6;
                                                this.L$3 = syncRoutines2;
                                                this.L$4 = newContacts5;
                                                this.L$5 = l6;
                                                this.L$6 = contactSyncState6;
                                                this.L$7 = ref$ObjectRef6;
                                                this.L$8 = bufferedChannelIterator11;
                                                RealContactSyncEventAggregator realContactSyncEventAggregator1022222 = realContactSyncEventAggregator2;
                                                this.L$9 = null;
                                                this.L$10 = contactSync$ResetReason3;
                                                this.L$11 = null;
                                                this.I$0 = i9;
                                                this.label = 9;
                                                obj7 = FlowKt.firstOrNull(granted22222, this);
                                                if (obj7 != coroutineSingletons5) {
                                                }
                                            }
                                        } else {
                                            bufferedChannelIterator10 = bufferedChannelIterator6;
                                            i8 = i4;
                                            realContactSyncEventAggregator2 = realContactSyncEventAggregator5;
                                            realContactSyncRoutineAggregator8 = realContactSyncRoutineAggregator4;
                                            syncRoutines8 = syncRoutines4;
                                            newContacts7 = newContacts2;
                                            l7 = l4;
                                            BufferedChannel.BufferedChannelIterator bufferedChannelIterator162 = bufferedChannelIterator10;
                                            contactSyncState6 = !(contactSyncState5 instanceof ContactSyncState.Syncing) ? ContactSyncState.Synced.INSTANCE : contactSyncState3;
                                            i9 = i8;
                                            bufferedChannelIterator11 = bufferedChannelIterator162;
                                            realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator8;
                                            syncRoutines2 = syncRoutines8;
                                            newContacts5 = newContacts7;
                                            l6 = l7;
                                            contactSync$ResetReason3 = null;
                                            Flow granted222222 = realContactSync3.readContactsPermission.granted();
                                            this.L$0 = coroutineScope;
                                            this.L$1 = realContactSyncEventAggregator2;
                                            this.L$2 = realContactSyncRoutineAggregator6;
                                            this.L$3 = syncRoutines2;
                                            this.L$4 = newContacts5;
                                            this.L$5 = l6;
                                            this.L$6 = contactSyncState6;
                                            this.L$7 = ref$ObjectRef6;
                                            this.L$8 = bufferedChannelIterator11;
                                            RealContactSyncEventAggregator realContactSyncEventAggregator10222222 = realContactSyncEventAggregator2;
                                            this.L$9 = null;
                                            this.L$10 = contactSync$ResetReason3;
                                            this.L$11 = null;
                                            this.I$0 = i9;
                                            this.label = 9;
                                            obj7 = FlowKt.firstOrNull(granted222222, this);
                                            if (obj7 != coroutineSingletons5) {
                                            }
                                        }
                                    } else if (((ContactsSyncResponse.Success) contactsSyncResponse).getRateLimited()) {
                                        Long l17 = new Long(androidClock.millis() + RealContactSync.RATE_LIMITED_DELAY);
                                        this.L$0 = coroutineScope;
                                        this.L$1 = realContactSyncEventAggregator5;
                                        this.L$2 = realContactSyncRoutineAggregator4;
                                        this.L$3 = syncRoutines4;
                                        this.L$4 = newContacts2;
                                        this.L$5 = null;
                                        this.L$6 = contactSyncState5;
                                        this.L$7 = ref$ObjectRef6;
                                        this.L$8 = bufferedChannelIterator6;
                                        this.L$9 = null;
                                        this.L$10 = null;
                                        this.I$0 = i4;
                                        this.label = 7;
                                        realContactSyncDetailsRepository3 = realContactSyncDetailsRepository2;
                                        if (realContactSyncDetailsRepository3.setRateLimitedTime(l17) != coroutineSingletons5) {
                                            contactSyncState4 = contactSyncState5;
                                            bufferedChannelIterator5 = bufferedChannelIterator6;
                                            ref$ObjectRef5 = ref$ObjectRef6;
                                            newContacts4 = newContacts2;
                                            syncRoutines5 = syncRoutines4;
                                            realContactSyncRoutineAggregator5 = realContactSyncRoutineAggregator4;
                                            realContactSyncEventAggregator6 = realContactSyncEventAggregator5;
                                            Ref$ObjectRef ref$ObjectRef14 = ref$ObjectRef5;
                                            bufferedChannelIterator6 = bufferedChannelIterator5;
                                            contactSyncState5 = contactSyncState4;
                                            ref$ObjectRef6 = ref$ObjectRef14;
                                            realContactSyncEventAggregator5 = realContactSyncEventAggregator6;
                                            realContactSyncRoutineAggregator4 = realContactSyncRoutineAggregator5;
                                            syncRoutines4 = syncRoutines5;
                                            newContacts2 = newContacts4;
                                            bufferedChannelIterator10 = bufferedChannelIterator6;
                                            l4 = new Long(androidClock.millis() + RealContactSync.SOFT_RATE_LIMIT_DELAY);
                                            contactSyncState5 = contactSyncState5;
                                            i8 = i4;
                                            realContactSyncEventAggregator2 = realContactSyncEventAggregator5;
                                            realContactSyncRoutineAggregator8 = realContactSyncRoutineAggregator4;
                                            syncRoutines8 = syncRoutines4;
                                            newContacts7 = newContacts2;
                                            l7 = l4;
                                            BufferedChannel.BufferedChannelIterator bufferedChannelIterator1622 = bufferedChannelIterator10;
                                            contactSyncState6 = !(contactSyncState5 instanceof ContactSyncState.Syncing) ? ContactSyncState.Synced.INSTANCE : contactSyncState3;
                                            i9 = i8;
                                            bufferedChannelIterator11 = bufferedChannelIterator1622;
                                            realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator8;
                                            syncRoutines2 = syncRoutines8;
                                            newContacts5 = newContacts7;
                                            l6 = l7;
                                            contactSync$ResetReason3 = null;
                                            Flow granted2222222 = realContactSync3.readContactsPermission.granted();
                                            this.L$0 = coroutineScope;
                                            this.L$1 = realContactSyncEventAggregator2;
                                            this.L$2 = realContactSyncRoutineAggregator6;
                                            this.L$3 = syncRoutines2;
                                            this.L$4 = newContacts5;
                                            this.L$5 = l6;
                                            this.L$6 = contactSyncState6;
                                            this.L$7 = ref$ObjectRef6;
                                            this.L$8 = bufferedChannelIterator11;
                                            RealContactSyncEventAggregator realContactSyncEventAggregator102222222 = realContactSyncEventAggregator2;
                                            this.L$9 = null;
                                            this.L$10 = contactSync$ResetReason3;
                                            this.L$11 = null;
                                            this.I$0 = i9;
                                            this.label = 9;
                                            obj7 = FlowKt.firstOrNull(granted2222222, this);
                                            if (obj7 != coroutineSingletons5) {
                                            }
                                        }
                                    } else {
                                        realContactSyncDetailsRepository3 = realContactSyncDetailsRepository2;
                                        bufferedChannelIterator10 = bufferedChannelIterator6;
                                        l4 = new Long(androidClock.millis() + RealContactSync.SOFT_RATE_LIMIT_DELAY);
                                        contactSyncState5 = contactSyncState5;
                                        i8 = i4;
                                        realContactSyncEventAggregator2 = realContactSyncEventAggregator5;
                                        realContactSyncRoutineAggregator8 = realContactSyncRoutineAggregator4;
                                        syncRoutines8 = syncRoutines4;
                                        newContacts7 = newContacts2;
                                        l7 = l4;
                                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator16222 = bufferedChannelIterator10;
                                        contactSyncState6 = !(contactSyncState5 instanceof ContactSyncState.Syncing) ? ContactSyncState.Synced.INSTANCE : contactSyncState3;
                                        i9 = i8;
                                        bufferedChannelIterator11 = bufferedChannelIterator16222;
                                        realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator8;
                                        syncRoutines2 = syncRoutines8;
                                        newContacts5 = newContacts7;
                                        l6 = l7;
                                        contactSync$ResetReason3 = null;
                                        Flow granted22222222 = realContactSync3.readContactsPermission.granted();
                                        this.L$0 = coroutineScope;
                                        this.L$1 = realContactSyncEventAggregator2;
                                        this.L$2 = realContactSyncRoutineAggregator6;
                                        this.L$3 = syncRoutines2;
                                        this.L$4 = newContacts5;
                                        this.L$5 = l6;
                                        this.L$6 = contactSyncState6;
                                        this.L$7 = ref$ObjectRef6;
                                        this.L$8 = bufferedChannelIterator11;
                                        RealContactSyncEventAggregator realContactSyncEventAggregator1022222222 = realContactSyncEventAggregator2;
                                        this.L$9 = null;
                                        this.L$10 = contactSync$ResetReason3;
                                        this.L$11 = null;
                                        this.I$0 = i9;
                                        this.label = 9;
                                        obj7 = FlowKt.firstOrNull(granted22222222, this);
                                        if (obj7 != coroutineSingletons5) {
                                        }
                                    }
                                }
                            } else {
                                l4 = l15;
                                if (contactSyncState2 instanceof ContactSyncState.SyncingInvalidated) {
                                    Deferred job4 = ((ContactSyncState.SyncingInvalidated) contactSyncState2).getJob();
                                    this.L$0 = coroutineScope;
                                    this.L$1 = realContactSyncEventAggregator2;
                                    this.L$2 = realContactSyncRoutineAggregator;
                                    this.L$3 = syncRoutines2;
                                    this.L$4 = newContacts2;
                                    this.L$5 = l4;
                                    this.L$6 = contactSyncState2;
                                    this.L$7 = ref$ObjectRef;
                                    this.L$8 = bufferedChannelIterator;
                                    this.L$9 = null;
                                    this.I$0 = i;
                                    this.label = 6;
                                    obj6 = job4.await(this);
                                    if (obj6 != coroutineSingletons5) {
                                        ContactSyncEvent.SyncRoutines syncRoutines14 = syncRoutines2;
                                        realContactSyncEventAggregator5 = realContactSyncEventAggregator2;
                                        i4 = i;
                                        ref$ObjectRef4 = ref$ObjectRef;
                                        syncRoutines4 = syncRoutines14;
                                        BufferedChannel.BufferedChannelIterator bufferedChannelIterator17 = bufferedChannelIterator;
                                        realContactSyncRoutineAggregator4 = realContactSyncRoutineAggregator;
                                        bufferedChannelIterator4 = bufferedChannelIterator17;
                                        contactsSyncResponse = (ContactsSyncResponse) obj6;
                                        Ref$ObjectRef ref$ObjectRef132 = ref$ObjectRef4;
                                        bufferedChannelIterator6 = bufferedChannelIterator4;
                                        contactSyncState5 = contactSyncState2;
                                        ref$ObjectRef6 = ref$ObjectRef132;
                                        if (!(contactsSyncResponse instanceof ContactsSyncResponse.Success)) {
                                        }
                                    }
                                }
                            }
                        }
                    }
                    coroutineSingletons4 = coroutineSingletons5;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = realContactSyncRoutineAggregator;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.L$8 = null;
                    this.I$0 = i;
                    this.label = 14;
                    job = realContactSyncEventAggregator2.readContactsJob;
                    if (job == null) {
                        obj10 = JobKt.cancelAndJoin(job, this);
                        if (obj10 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj10 = Unit.INSTANCE;
                        }
                    } else {
                        obj10 = Unit.INSTANCE;
                    }
                    if (obj10 != coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    i11 = i;
                    r112 = 0;
                    this.L$0 = r112;
                    this.L$1 = r112;
                    this.L$2 = r112;
                    this.L$3 = r112;
                    this.L$4 = r112;
                    this.L$5 = r112;
                    this.L$6 = r112;
                    this.L$7 = r112;
                    this.I$0 = i11;
                    this.label = 15;
                    job2 = realContactSyncRoutineAggregator.job;
                    if (job2 == null) {
                        obj11 = JobKt.cancelAndJoin(job2, this);
                        if (obj11 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            obj11 = Unit.INSTANCE;
                        }
                    } else {
                        obj11 = Unit.INSTANCE;
                    }
                    if (obj11 == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    return Unit.INSTANCE;
                }
                return coroutineSingletons5;
            case 1:
                int i19 = this.I$0;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator18 = this.L$8;
                Ref$ObjectRef ref$ObjectRef15 = this.L$7;
                contactSyncState2 = this.L$6;
                l2 = this.L$5;
                newContacts2 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines15 = this.L$3;
                RealContactSyncRoutineAggregator realContactSyncRoutineAggregator11 = this.L$2;
                RealContactSyncEventAggregator realContactSyncEventAggregator12 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i = i19;
                realContactSyncEventAggregator2 = realContactSyncEventAggregator12;
                syncRoutines2 = syncRoutines15;
                ref$ObjectRef = ref$ObjectRef15;
                bufferedChannelIterator = bufferedChannelIterator18;
                realContactSyncRoutineAggregator = realContactSyncRoutineAggregator11;
                if (((Boolean) obj).booleanValue()) {
                }
                coroutineSingletons4 = coroutineSingletons5;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = realContactSyncRoutineAggregator;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = null;
                this.L$7 = null;
                this.L$8 = null;
                this.I$0 = i;
                this.label = 14;
                job = realContactSyncEventAggregator2.readContactsJob;
                if (job == null) {
                }
                if (obj10 != coroutineSingletons4) {
                }
                break;
            case 2:
                i2 = this.I$0;
                bufferedChannelIterator2 = this.L$8;
                Ref$ObjectRef ref$ObjectRef16 = this.L$7;
                contactSyncState2 = this.L$6;
                l2 = this.L$5;
                newContacts2 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines16 = this.L$3;
                realContactSyncRoutineAggregator2 = this.L$2;
                RealContactSyncEventAggregator realContactSyncEventAggregator13 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                androidClock = androidClock2;
                realContactSyncEventAggregator3 = realContactSyncEventAggregator13;
                contactSyncState3 = contactSyncState9;
                syncRoutines2 = syncRoutines16;
                ref$ObjectRef = ref$ObjectRef16;
                obj2 = obj;
                if (((Boolean) obj2).booleanValue()) {
                }
                break;
            case 3:
                int i20 = this.I$0;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator19 = this.L$8;
                ref$ObjectRef2 = this.L$7;
                contactSyncState2 = this.L$6;
                l2 = this.L$5;
                newContacts2 = this.L$4;
                syncRoutines3 = this.L$3;
                realContactSyncEventAggregator4 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                bufferedChannelIterator3 = bufferedChannelIterator19;
                androidClock = androidClock2;
                contactSyncState3 = contactSyncState9;
                i3 = i20;
                obj3 = obj;
                RealContactSyncEventAggregator realContactSyncEventAggregator112 = realContactSyncEventAggregator4;
                realContactSyncRoutineAggregator2 = (RealContactSyncRoutineAggregator) obj3;
                realContactSyncEventAggregator2 = realContactSyncEventAggregator112;
                syncRoutines2 = syncRoutines3;
                ref$ObjectRef = ref$ObjectRef2;
                i10 = i3;
                bufferedChannelIterator2 = bufferedChannelIterator3;
                int i1322 = i10;
                bufferedChannelIterator11 = bufferedChannelIterator2;
                i9 = i1322;
                Long l922 = l2;
                contactSyncState6 = contactSyncState2.invalidateSynced();
                ref$ObjectRef6 = ref$ObjectRef;
                l6 = l922;
                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator2;
                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                newContacts5 = newContacts2;
                contactSync$ResetReason3 = null;
                Flow granted222222222 = realContactSync3.readContactsPermission.granted();
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator2;
                this.L$2 = realContactSyncRoutineAggregator6;
                this.L$3 = syncRoutines2;
                this.L$4 = newContacts5;
                this.L$5 = l6;
                this.L$6 = contactSyncState6;
                this.L$7 = ref$ObjectRef6;
                this.L$8 = bufferedChannelIterator11;
                RealContactSyncEventAggregator realContactSyncEventAggregator10222222222 = realContactSyncEventAggregator2;
                this.L$9 = null;
                this.L$10 = contactSync$ResetReason3;
                this.L$11 = null;
                this.I$0 = i9;
                this.label = 9;
                obj7 = FlowKt.firstOrNull(granted222222222, this);
                if (obj7 != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 4:
                int i21 = this.I$0;
                contactSync$ResetReason = this.L$10;
                ContactSyncEvent.Reset reset2 = this.L$9;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator20 = this.L$8;
                ref$ObjectRef3 = this.L$7;
                l3 = this.L$5;
                newContacts3 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines17 = this.L$3;
                RealContactSyncRoutineAggregator realContactSyncRoutineAggregator12 = this.L$2;
                realContactSyncEventAggregator2 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                contactSyncEvent = reset2;
                i = i21;
                androidClock = androidClock2;
                realContactSyncDetailsRepository = realContactSyncDetailsRepository5;
                realContactSyncRoutineAggregator3 = realContactSyncRoutineAggregator12;
                contactSyncState3 = contactSyncState9;
                syncRoutines2 = syncRoutines17;
                bufferedChannelIterator = bufferedChannelIterator20;
                obj4 = obj;
                ((RealContactSync$reset$2$1) ((ContactSyncEvent.Reset) contactSyncEvent).getOnDone()).invoke();
                Long l132 = l3;
                contactSync$ResetReason3 = contactSync$ResetReason;
                i9 = i;
                bufferedChannelIterator11 = bufferedChannelIterator;
                newContacts5 = newContacts3;
                l6 = l132;
                Ref$ObjectRef ref$ObjectRef112 = ref$ObjectRef3;
                contactSyncState6 = (ContactSyncState) obj4;
                ref$ObjectRef6 = ref$ObjectRef112;
                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator3;
                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository;
                Flow granted2222222222 = realContactSync3.readContactsPermission.granted();
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator2;
                this.L$2 = realContactSyncRoutineAggregator6;
                this.L$3 = syncRoutines2;
                this.L$4 = newContacts5;
                this.L$5 = l6;
                this.L$6 = contactSyncState6;
                this.L$7 = ref$ObjectRef6;
                this.L$8 = bufferedChannelIterator11;
                RealContactSyncEventAggregator realContactSyncEventAggregator102222222222 = realContactSyncEventAggregator2;
                this.L$9 = null;
                this.L$10 = contactSync$ResetReason3;
                this.L$11 = null;
                this.I$0 = i9;
                this.label = 9;
                obj7 = FlowKt.firstOrNull(granted2222222222, this);
                if (obj7 != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 5:
                i4 = this.I$0;
                bufferedChannelIterator4 = this.L$8;
                ref$ObjectRef4 = this.L$7;
                contactSyncState2 = this.L$6;
                Long l18 = this.L$5;
                newContacts2 = this.L$4;
                syncRoutines4 = this.L$3;
                realContactSyncRoutineAggregator4 = this.L$2;
                realContactSyncEventAggregator5 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                realContactSyncDetailsRepository2 = realContactSyncDetailsRepository5;
                androidClock = androidClock2;
                contactSyncState3 = contactSyncState9;
                l4 = l18;
                obj5 = obj;
                contactsSyncResponse = (ContactsSyncResponse) obj5;
                Ref$ObjectRef ref$ObjectRef1322 = ref$ObjectRef4;
                bufferedChannelIterator6 = bufferedChannelIterator4;
                contactSyncState5 = contactSyncState2;
                ref$ObjectRef6 = ref$ObjectRef1322;
                if (!(contactsSyncResponse instanceof ContactsSyncResponse.Success)) {
                }
                return coroutineSingletons5;
            case 6:
                i4 = this.I$0;
                bufferedChannelIterator4 = this.L$8;
                ref$ObjectRef4 = this.L$7;
                contactSyncState2 = this.L$6;
                Long l19 = this.L$5;
                newContacts2 = this.L$4;
                syncRoutines4 = this.L$3;
                realContactSyncRoutineAggregator4 = this.L$2;
                realContactSyncEventAggregator5 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                realContactSyncDetailsRepository2 = realContactSyncDetailsRepository5;
                androidClock = androidClock2;
                contactSyncState3 = contactSyncState9;
                l4 = l19;
                obj6 = obj;
                contactsSyncResponse = (ContactsSyncResponse) obj6;
                Ref$ObjectRef ref$ObjectRef13222 = ref$ObjectRef4;
                bufferedChannelIterator6 = bufferedChannelIterator4;
                contactSyncState5 = contactSyncState2;
                ref$ObjectRef6 = ref$ObjectRef13222;
                if (!(contactsSyncResponse instanceof ContactsSyncResponse.Success)) {
                }
                return coroutineSingletons5;
            case 7:
                i4 = this.I$0;
                bufferedChannelIterator5 = this.L$8;
                ref$ObjectRef5 = this.L$7;
                contactSyncState4 = this.L$6;
                newContacts4 = this.L$4;
                syncRoutines5 = this.L$3;
                realContactSyncRoutineAggregator5 = this.L$2;
                realContactSyncEventAggregator6 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                androidClock = androidClock2;
                contactSyncState3 = contactSyncState9;
                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                Ref$ObjectRef ref$ObjectRef142 = ref$ObjectRef5;
                bufferedChannelIterator6 = bufferedChannelIterator5;
                contactSyncState5 = contactSyncState4;
                ref$ObjectRef6 = ref$ObjectRef142;
                realContactSyncEventAggregator5 = realContactSyncEventAggregator6;
                realContactSyncRoutineAggregator4 = realContactSyncRoutineAggregator5;
                syncRoutines4 = syncRoutines5;
                newContacts2 = newContacts4;
                bufferedChannelIterator10 = bufferedChannelIterator6;
                l4 = new Long(androidClock.millis() + RealContactSync.SOFT_RATE_LIMIT_DELAY);
                contactSyncState5 = contactSyncState5;
                i8 = i4;
                realContactSyncEventAggregator2 = realContactSyncEventAggregator5;
                realContactSyncRoutineAggregator8 = realContactSyncRoutineAggregator4;
                syncRoutines8 = syncRoutines4;
                newContacts7 = newContacts2;
                l7 = l4;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator162222 = bufferedChannelIterator10;
                contactSyncState6 = !(contactSyncState5 instanceof ContactSyncState.Syncing) ? ContactSyncState.Synced.INSTANCE : contactSyncState3;
                i9 = i8;
                bufferedChannelIterator11 = bufferedChannelIterator162222;
                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator8;
                syncRoutines2 = syncRoutines8;
                newContacts5 = newContacts7;
                l6 = l7;
                contactSync$ResetReason3 = null;
                Flow granted22222222222 = realContactSync3.readContactsPermission.granted();
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator2;
                this.L$2 = realContactSyncRoutineAggregator6;
                this.L$3 = syncRoutines2;
                this.L$4 = newContacts5;
                this.L$5 = l6;
                this.L$6 = contactSyncState6;
                this.L$7 = ref$ObjectRef6;
                this.L$8 = bufferedChannelIterator11;
                RealContactSyncEventAggregator realContactSyncEventAggregator1022222222222 = realContactSyncEventAggregator2;
                this.L$9 = null;
                this.L$10 = contactSync$ResetReason3;
                this.L$11 = null;
                this.I$0 = i9;
                this.label = 9;
                obj7 = FlowKt.firstOrNull(granted22222222222, this);
                if (obj7 != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 8:
                i4 = this.I$0;
                Long l20 = this.L$11;
                bufferedChannelIterator6 = this.L$8;
                ref$ObjectRef6 = this.L$7;
                ContactSyncState contactSyncState12 = this.L$6;
                newContacts2 = this.L$4;
                syncRoutines4 = this.L$3;
                realContactSyncRoutineAggregator4 = this.L$2;
                realContactSyncEventAggregator5 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                l5 = l20;
                contactSyncState5 = contactSyncState12;
                androidClock = androidClock2;
                contactSyncState3 = contactSyncState9;
                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator21 = bufferedChannelIterator6;
                i8 = i4;
                realContactSyncEventAggregator2 = realContactSyncEventAggregator5;
                realContactSyncRoutineAggregator8 = realContactSyncRoutineAggregator4;
                syncRoutines8 = syncRoutines4;
                newContacts7 = newContacts2;
                l7 = l5;
                bufferedChannelIterator10 = bufferedChannelIterator21;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator1622222 = bufferedChannelIterator10;
                contactSyncState6 = !(contactSyncState5 instanceof ContactSyncState.Syncing) ? ContactSyncState.Synced.INSTANCE : contactSyncState3;
                i9 = i8;
                bufferedChannelIterator11 = bufferedChannelIterator1622222;
                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator8;
                syncRoutines2 = syncRoutines8;
                newContacts5 = newContacts7;
                l6 = l7;
                contactSync$ResetReason3 = null;
                Flow granted222222222222 = realContactSync3.readContactsPermission.granted();
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator2;
                this.L$2 = realContactSyncRoutineAggregator6;
                this.L$3 = syncRoutines2;
                this.L$4 = newContacts5;
                this.L$5 = l6;
                this.L$6 = contactSyncState6;
                this.L$7 = ref$ObjectRef6;
                this.L$8 = bufferedChannelIterator11;
                RealContactSyncEventAggregator realContactSyncEventAggregator10222222222222 = realContactSyncEventAggregator2;
                this.L$9 = null;
                this.L$10 = contactSync$ResetReason3;
                this.L$11 = null;
                this.I$0 = i9;
                this.label = 9;
                obj7 = FlowKt.firstOrNull(granted222222222222, this);
                if (obj7 != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 9:
                int i22 = this.I$0;
                ContactSync$ResetReason contactSync$ResetReason4 = this.L$10;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator22 = this.L$8;
                Ref$ObjectRef ref$ObjectRef17 = this.L$7;
                contactSyncState6 = this.L$6;
                Long l21 = this.L$5;
                ContactSyncEvent.NewContacts newContacts9 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines18 = this.L$3;
                RealContactSyncRoutineAggregator realContactSyncRoutineAggregator13 = this.L$2;
                RealContactSyncEventAggregator realContactSyncEventAggregator14 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                contactSyncState3 = contactSyncState9;
                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator13;
                bufferedChannelIterator7 = bufferedChannelIterator22;
                syncRoutines6 = syncRoutines18;
                newContacts5 = newContacts9;
                l6 = l21;
                ref$ObjectRef7 = ref$ObjectRef17;
                i5 = i22;
                androidClock = androidClock2;
                realContactSyncDetailsRepository3 = realContactSyncDetailsRepository5;
                realContactSyncEventAggregator7 = realContactSyncEventAggregator14;
                obj7 = obj;
                contactSync$ResetReason2 = contactSync$ResetReason4;
                if (Intrinsics.areEqual(obj7, Boolean.TRUE)) {
                    break;
                }
                contactSyncState8 = contactSyncState3;
                if (Intrinsics.areEqual(contactSyncState6, contactSyncState8)) {
                }
                contactSyncState7 = contactSyncState8;
                ref$ObjectRef9 = ref$ObjectRef7;
                l = l6;
                realContactSyncDetailsRepository4 = realContactSyncDetailsRepository3;
                coroutineSingletons3 = coroutineSingletons5;
                r11 = 0;
                z = true;
                realContactSync = realContactSync3;
                i6 = i15;
                newContacts8 = newContacts5;
                if ((syncRoutines6.databaseUpdate != null && syncRoutines6.hashAliasUpload == null && syncRoutines6.detailedContactsUpload == null) ? z : false) {
                }
                realContactSync2 = realContactSync;
                coroutineSingletons2 = coroutineSingletons3;
                int i1722 = i5;
                syncRoutines = syncRoutines6;
                i = i1722;
                ref$ObjectRef = ref$ObjectRef9;
                realContactSyncEventAggregator9 = realContactSyncEventAggregator7;
                bufferedChannelIterator9 = bufferedChannelIterator7;
                newContacts6 = newContacts8;
                int i18222 = i6;
                realContactSyncRoutineAggregator = realContactSyncRoutineAggregator6;
                if (syncRoutines.databaseUpdate != null) {
                }
                coroutineSingletons5 = coroutineSingletons2;
                contactSyncState = contactSyncState6;
                bufferedChannelIterator = bufferedChannelIterator9;
                newContacts = newContacts6;
                contactSyncState9 = contactSyncState7;
                realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                realContactSync3 = realContactSync2;
                realContactSyncEventAggregator = realContactSyncEventAggregator9;
                androidClock2 = androidClock;
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator;
                this.L$2 = realContactSyncRoutineAggregator;
                this.L$3 = syncRoutines;
                this.L$4 = newContacts;
                this.L$5 = l;
                this.L$6 = contactSyncState;
                this.L$7 = ref$ObjectRef;
                this.L$8 = bufferedChannelIterator;
                ContactSyncState contactSyncState102222222 = contactSyncState;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = i;
                this.label = 1;
                hasNext = bufferedChannelIterator.hasNext(this);
                if (hasNext != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 10:
                int i23 = this.I$1;
                int i24 = this.I$0;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator23 = this.L$8;
                Ref$ObjectRef ref$ObjectRef18 = this.L$7;
                contactSyncState6 = this.L$6;
                l = this.L$5;
                ContactSyncEvent.NewContacts newContacts10 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines19 = this.L$3;
                RealContactSyncRoutineAggregator realContactSyncRoutineAggregator14 = this.L$2;
                realContactSyncEventAggregator8 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                i5 = i24;
                bufferedChannelIterator8 = bufferedChannelIterator23;
                ref$ObjectRef8 = ref$ObjectRef18;
                realContactSyncDetailsRepository4 = realContactSyncDetailsRepository5;
                contactSyncState7 = contactSyncState9;
                z = true;
                syncRoutines7 = syncRoutines19;
                coroutineSingletons = coroutineSingletons5;
                realContactSyncRoutineAggregator6 = realContactSyncRoutineAggregator14;
                i6 = i23;
                newContacts6 = newContacts10;
                androidClock = androidClock2;
                realContactSync = realContactSync3;
                obj8 = obj;
                if (((Boolean) obj8).booleanValue()) {
                }
                break;
            case 11:
                int i25 = this.I$0;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator24 = this.L$8;
                Ref$ObjectRef ref$ObjectRef19 = this.L$7;
                ContactSyncState contactSyncState13 = this.L$6;
                Long l22 = this.L$5;
                ContactSyncEvent.NewContacts newContacts11 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines20 = this.L$3;
                RealContactSyncRoutineAggregator realContactSyncRoutineAggregator15 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                l = l22;
                newContacts = newContacts11;
                i = i25;
                realContactSync2 = realContactSync3;
                realContactSyncRoutineAggregator = realContactSyncRoutineAggregator15;
                realContactSyncEventAggregator = (RealContactSyncEventAggregator) obj;
                contactSyncState = contactSyncState13;
                syncRoutines = syncRoutines20;
                ref$ObjectRef = ref$ObjectRef19;
                bufferedChannelIterator = bufferedChannelIterator24;
                contactSyncState9 = contactSyncState9;
                androidClock2 = androidClock2;
                realContactSyncDetailsRepository5 = realContactSyncDetailsRepository5;
                coroutineSingletons5 = coroutineSingletons5;
                realContactSync3 = realContactSync2;
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator;
                this.L$2 = realContactSyncRoutineAggregator;
                this.L$3 = syncRoutines;
                this.L$4 = newContacts;
                this.L$5 = l;
                this.L$6 = contactSyncState;
                this.L$7 = ref$ObjectRef;
                this.L$8 = bufferedChannelIterator;
                ContactSyncState contactSyncState1022222222 = contactSyncState;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = i;
                this.label = 1;
                hasNext = bufferedChannelIterator.hasNext(this);
                if (hasNext != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 12:
                int i26 = this.I$1;
                int i27 = this.I$0;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator25 = this.L$8;
                Ref$ObjectRef ref$ObjectRef20 = this.L$7;
                ContactSyncState contactSyncState14 = this.L$6;
                Long l23 = this.L$5;
                ContactSyncEvent.NewContacts newContacts12 = this.L$4;
                ContactSyncEvent.SyncRoutines syncRoutines21 = this.L$3;
                realContactSyncRoutineAggregator7 = this.L$2;
                RealContactSyncEventAggregator realContactSyncEventAggregator15 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                obj9 = obj;
                realContactSync2 = realContactSync3;
                coroutineSingletons2 = coroutineSingletons5;
                realContactSyncDetailsRepository4 = realContactSyncDetailsRepository5;
                contactSyncState7 = contactSyncState9;
                bufferedChannelIterator9 = bufferedChannelIterator25;
                i = i27;
                i7 = i26;
                androidClock = androidClock2;
                realContactSyncEventAggregator9 = realContactSyncEventAggregator15;
                contactSyncState = contactSyncState14;
                l = l23;
                ref$ObjectRef = ref$ObjectRef20;
                syncRoutines = syncRoutines21;
                newContacts6 = newContacts12;
                if (((Boolean) obj9).booleanValue()) {
                }
                break;
            case 13:
                int i28 = this.I$0;
                BufferedChannel.BufferedChannelIterator bufferedChannelIterator26 = this.L$8;
                Ref$ObjectRef ref$ObjectRef21 = this.L$7;
                ContactSyncState contactSyncState15 = this.L$6;
                Long l24 = this.L$5;
                ContactSyncEvent.SyncRoutines syncRoutines22 = this.L$3;
                realContactSyncRoutineAggregator9 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                i = i28;
                contactSyncState = contactSyncState15;
                ref$ObjectRef = ref$ObjectRef21;
                l = l24;
                bufferedChannelIterator = bufferedChannelIterator26;
                syncRoutines9 = syncRoutines22;
                realContactSyncDetailsRepository4 = realContactSyncDetailsRepository5;
                androidClock = androidClock2;
                contactSyncState7 = contactSyncState9;
                stopContactsReading = obj;
                realContactSync2 = realContactSync3;
                coroutineSingletons2 = coroutineSingletons5;
                realContactSyncEventAggregator = (RealContactSyncEventAggregator) stopContactsReading;
                coroutineSingletons5 = coroutineSingletons2;
                realContactSyncRoutineAggregator = realContactSyncRoutineAggregator9;
                syncRoutines = syncRoutines9;
                contactSyncState9 = contactSyncState7;
                androidClock2 = androidClock;
                realContactSyncDetailsRepository5 = realContactSyncDetailsRepository4;
                newContacts = null;
                realContactSync3 = realContactSync2;
                this.L$0 = coroutineScope;
                this.L$1 = realContactSyncEventAggregator;
                this.L$2 = realContactSyncRoutineAggregator;
                this.L$3 = syncRoutines;
                this.L$4 = newContacts;
                this.L$5 = l;
                this.L$6 = contactSyncState;
                this.L$7 = ref$ObjectRef;
                this.L$8 = bufferedChannelIterator;
                ContactSyncState contactSyncState10222222222 = contactSyncState;
                this.L$9 = null;
                this.L$10 = null;
                this.I$0 = i;
                this.label = 1;
                hasNext = bufferedChannelIterator.hasNext(this);
                if (hasNext != coroutineSingletons5) {
                }
                return coroutineSingletons5;
            case 14:
                i11 = this.I$0;
                RealContactSyncRoutineAggregator realContactSyncRoutineAggregator16 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                realContactSyncRoutineAggregator = realContactSyncRoutineAggregator16;
                r112 = 0;
                coroutineSingletons4 = coroutineSingletons5;
                this.L$0 = r112;
                this.L$1 = r112;
                this.L$2 = r112;
                this.L$3 = r112;
                this.L$4 = r112;
                this.L$5 = r112;
                this.L$6 = r112;
                this.L$7 = r112;
                this.I$0 = i11;
                this.label = 15;
                job2 = realContactSyncRoutineAggregator.job;
                if (job2 == null) {
                }
                if (obj11 == coroutineSingletons4) {
                }
                return Unit.INSTANCE;
            case 15:
                SafeTrace.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
