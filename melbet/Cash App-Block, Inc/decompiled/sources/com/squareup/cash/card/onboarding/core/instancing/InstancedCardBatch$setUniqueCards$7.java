package com.squareup.cash.card.onboarding.core.instancing;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.protos.franklin.cards.CardTheme;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DeferredCoroutine;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class InstancedCardBatch$setUniqueCards$7 extends SuspendLambda implements Function2 {
    public final /* synthetic */ List $uniqueAlbedoKeys;
    public final /* synthetic */ List $uniqueHoloKeys;
    public final /* synthetic */ List $uniqueInkMetalHeatKeys;
    public final /* synthetic */ List $uniqueNormalKeys;
    public final /* synthetic */ List $viewModels;
    public long J$0;
    public long J$1;
    public long J$2;
    public long J$3;
    public long J$4;
    public long J$5;
    public /* synthetic */ Object L$0;
    public DeferredCoroutine L$1;
    public List L$2;
    public List L$3;
    public List L$4;
    public List L$5;
    public List L$6;
    public int label;
    public final /* synthetic */ InstancedCardBatch this$0;

    /* renamed from: com.squareup.cash.card.onboarding.core.instancing.InstancedCardBatch$setUniqueCards$7$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public final /* synthetic */ List $uniqueNormalKeys;
        public final /* synthetic */ List $viewModels;
        public final /* synthetic */ InstancedCardBatch this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(List list, InstancedCardBatch instancedCardBatch, List list2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$uniqueNormalKeys = list;
            this.this$0 = instancedCardBatch;
            this.$viewModels = list2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            switch (this.$r8$classId) {
                case 0:
                    return new AnonymousClass1(this.$uniqueNormalKeys, this.this$0, this.$viewModels, continuation, 0);
                case 1:
                    return new AnonymousClass1(this.$uniqueNormalKeys, this.this$0, this.$viewModels, continuation, 1);
                case 2:
                    return new AnonymousClass1(this.$uniqueNormalKeys, this.this$0, this.$viewModels, continuation, 2);
                case 3:
                    return new AnonymousClass1(this.$uniqueNormalKeys, this.this$0, this.$viewModels, continuation, 3);
                default:
                    return new AnonymousClass1(this.$uniqueNormalKeys, this.this$0, this.$viewModels, continuation, 4);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Bitmap createBitmap;
            Bitmap createBitmap2;
            int i = this.$r8$classId;
            List list = this.$viewModels;
            InstancedCardBatch instancedCardBatch = this.this$0;
            List list2 = this.$uniqueNormalKeys;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list3 = list2;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(InstancedCardBatch.access$scaleBitmapIfNeeded(instancedCardBatch, CardsKt.createNormal$default(instancedCardBatch.context, ((CardModelView.ViewModel) list.get(((IndexedValue) it.next()).index)).backgroundImage)));
                    }
                    return arrayList;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list4 = list2;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        CardModelView.ViewModel viewModel = (CardModelView.ViewModel) list.get(((IndexedValue) it2.next()).index);
                        Set set = InstancedCardBatch.DOUBLE_SIDED_CARD_IDS;
                        if (viewModel.id == CardTheme.Identifier.HOLO_ID) {
                            createBitmap = BitmapFactory.decodeResource(instancedCardBatch.context.getResources(), R.drawable.holo_reflect_env);
                            Timber.Forest.d("  Loaded holo_reflect_env: " + (createBitmap != null ? Integer.valueOf(createBitmap.getWidth()) : null) + "x" + (createBitmap != null ? Integer.valueOf(createBitmap.getHeight()) : null), new Object[0]);
                            if (createBitmap == null) {
                                createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                                createBitmap.eraseColor(-16777216);
                            }
                        } else {
                            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                            createBitmap.eraseColor(-16777216);
                        }
                        arrayList2.add(createBitmap);
                    }
                    return arrayList2;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list5 = list2;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        CardModelView.ViewModel viewModel2 = (CardModelView.ViewModel) list.get(((IndexedValue) it3.next()).index);
                        Context context = instancedCardBatch.context;
                        Paint paint = CardModelView.REMOVE_PAINT;
                        arrayList3.add(InstancedCardBatch.access$scaleBitmapIfNeeded(instancedCardBatch, CardsKt.createInkMetal$default(context, CardModelView.Companion.toCardFront(viewModel2), CardModelView.Companion.toCardBack(viewModel2))));
                    }
                    return arrayList3;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list6 = list2;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list6, 10));
                    Iterator it4 = list6.iterator();
                    while (it4.hasNext()) {
                        CardModelView.ViewModel viewModel3 = (CardModelView.ViewModel) list.get(((IndexedValue) it4.next()).index);
                        Set set2 = InstancedCardBatch.DOUBLE_SIDED_CARD_IDS;
                        CardTheme.Identifier identifier = viewModel3.id;
                        boolean z = identifier == CardTheme.Identifier.HOLO_ID;
                        Timber.Forest forest = Timber.Forest;
                        forest.d("createHoloBaseBitmap: id=" + identifier + ", isHolo=" + z, new Object[0]);
                        if (z) {
                            createBitmap2 = BitmapFactory.decodeResource(instancedCardBatch.context.getResources(), R.drawable.holo_base_gradient);
                            forest.d("  Loaded holo_base_gradient: " + (createBitmap2 != null ? Integer.valueOf(createBitmap2.getWidth()) : null) + "x" + (createBitmap2 != null ? Integer.valueOf(createBitmap2.getHeight()) : null), new Object[0]);
                            if (createBitmap2 == null) {
                                createBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                                createBitmap2.eraseColor(-16777216);
                            }
                        } else {
                            createBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                            createBitmap2.eraseColor(-16777216);
                        }
                        arrayList4.add(createBitmap2);
                    }
                    return arrayList4;
                default:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    List list7 = list2;
                    ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                    Iterator it5 = list7.iterator();
                    while (it5.hasNext()) {
                        CardModelView.ViewModel viewModel4 = (CardModelView.ViewModel) list.get(((IndexedValue) it5.next()).index);
                        Context context2 = instancedCardBatch.context;
                        CardTheme.Identifier identifier2 = viewModel4.id;
                        CardTheme.BackgroundImage backgroundImage = viewModel4.backgroundImage;
                        int i2 = viewModel4.color;
                        Paint paint2 = CardModelView.REMOVE_PAINT;
                        arrayList5.add(InstancedCardBatch.access$scaleBitmapIfNeeded(instancedCardBatch, CardsKt.createAlbedo$default(context2, identifier2, backgroundImage, i2, CardModelView.Companion.toCardBack(viewModel4), (int) (viewModel4.opacity * 255.0f), viewModel4.backInkColor, viewModel4.magStripColor)));
                    }
                    return arrayList5;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstancedCardBatch$setUniqueCards$7(InstancedCardBatch instancedCardBatch, List list, List list2, List list3, List list4, List list5, Continuation continuation) {
        super(2, continuation);
        this.this$0 = instancedCardBatch;
        this.$uniqueAlbedoKeys = list;
        this.$viewModels = list2;
        this.$uniqueNormalKeys = list3;
        this.$uniqueInkMetalHeatKeys = list4;
        this.$uniqueHoloKeys = list5;
    }

    public static final String invokeSuspend$mb(long j) {
        return String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(j / 1048576.0d)}, 1));
    }

    public static final long invokeSuspend$totalBytes(List list) {
        long j = 0;
        while (list.iterator().hasNext()) {
            j += ((Bitmap) r4.next()).getByteCount();
        }
        return j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InstancedCardBatch$setUniqueCards$7 instancedCardBatch$setUniqueCards$7 = new InstancedCardBatch$setUniqueCards$7(this.this$0, this.$uniqueAlbedoKeys, this.$viewModels, this.$uniqueNormalKeys, this.$uniqueInkMetalHeatKeys, this.$uniqueHoloKeys, continuation);
        instancedCardBatch$setUniqueCards$7.L$0 = obj;
        return instancedCardBatch$setUniqueCards$7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstancedCardBatch$setUniqueCards$7) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x06af A[LOOP:0: B:8:0x06a9->B:10:0x06af, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x05d6 A[LOOP:1: B:22:0x05d0->B:24:0x05d6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04c9 A[LOOP:2: B:38:0x04c3->B:40:0x04c9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03cb A[LOOP:3: B:53:0x03c5->B:55:0x03cb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02da A[LOOP:4: B:69:0x02d4->B:71:0x02da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02aa  */
    /* JADX WARN: Type inference failed for: r35v1, types: [java.util.List, kotlin.coroutines.Continuation, kotlinx.coroutines.CoroutineStart] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List list;
        String str;
        long currentTimeMillis;
        String str2;
        String str3;
        Object awaitInternal;
        List list2;
        String str4;
        long j;
        String str5;
        long currentTimeMillis2;
        long j2;
        Object join;
        CoroutineSingletons coroutineSingletons;
        DeferredCoroutine deferredCoroutine;
        InstancedCardBatch instancedCardBatch;
        ArrayList arrayList;
        Engine engine;
        List list3;
        String str6;
        Iterator it;
        Object obj2;
        Object await;
        long j3;
        long j4;
        String str7;
        String str8;
        String str9;
        long currentTimeMillis3;
        Engine engine2;
        ArrayList arrayList2;
        Object join2;
        DeferredCoroutine deferredCoroutine2;
        InstancedCardBatch instancedCardBatch2;
        List list4;
        List list5;
        long j5;
        long j6;
        long j7;
        ArrayList arrayList3;
        Engine engine3;
        String str10;
        Iterator it2;
        Object await2;
        CoroutineSingletons coroutineSingletons2;
        long j8;
        String str11;
        String str12;
        String str13;
        long j9;
        long currentTimeMillis4;
        Engine engine4;
        Job launch;
        CoroutineSingletons coroutineSingletons3;
        DeferredCoroutine deferredCoroutine3;
        InstancedCardBatch instancedCardBatch3;
        List list6;
        List list7;
        ArrayList arrayList4;
        long j10;
        long j11;
        long j12;
        Engine engine5;
        String str14;
        Iterator it3;
        long j13;
        Object await3;
        CoroutineSingletons coroutineSingletons4;
        long j14;
        long j15;
        String str15;
        String str16;
        String str17;
        long j16;
        DeferredCoroutine async$default;
        Job launch2;
        ArrayList arrayList5;
        long j17;
        List list8;
        long j18;
        long j19;
        long j20;
        Engine engine6;
        long j21;
        InstancedCardBatch instancedCardBatch4;
        String str18;
        Iterator it4;
        long j22;
        Object await4;
        CoroutineSingletons coroutineSingletons5;
        long j23;
        long j24;
        long j25;
        List list9;
        CoroutineSingletons coroutineSingletons6;
        Job launch3;
        long j26;
        Iterator it5;
        InstancedCardBatch instancedCardBatch5 = this.this$0;
        ArrayList arrayList6 = instancedCardBatch5.activeUploadJobs;
        Engine engine7 = instancedCardBatch5.engine;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        List list10 = this.$uniqueHoloKeys;
        List list11 = this.$viewModels;
        switch (i) {
            case 0:
                list = list10;
                str = "ms";
                SafeTrace.throwOnFailure(obj);
                currentTimeMillis = System.currentTimeMillis();
                DefaultScheduler defaultScheduler = Dispatchers.Default;
                str2 = " bitmaps (";
                str3 = " MB) in ";
                DeferredCoroutine async$default2 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(this.$uniqueAlbedoKeys, instancedCardBatch5, list11, null, 4), 2);
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.J$0 = currentTimeMillis;
                this.label = 1;
                awaitInternal = async$default2.awaitInternal(this);
                if (awaitInternal == coroutineSingletons7) {
                    return coroutineSingletons7;
                }
                list2 = (List) awaitInternal;
                long currentTimeMillis5 = System.currentTimeMillis() - currentTimeMillis;
                String str19 = str;
                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis5, str19, re$$ExternalSyntheticOutline0.m("Pipeline: albedo generated ", list2.size(), str2, invokeSuspend$mb(invokeSuspend$totalBytes(list2)), str3)), new Object[0]);
                long currentTimeMillis6 = System.currentTimeMillis();
                DefaultScheduler defaultScheduler2 = Dispatchers.Default;
                str4 = str2;
                j = currentTimeMillis6;
                instancedCardBatch5 = instancedCardBatch5;
                DeferredCoroutine async$default3 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(this.$uniqueNormalKeys, instancedCardBatch5, list11, null, 0), 2);
                str5 = str19;
                currentTimeMillis2 = System.currentTimeMillis();
                Job launch4 = engine7.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch5, list2, null, 4));
                arrayList6.add(launch4);
                this.L$0 = coroutineScope;
                this.L$1 = async$default3;
                this.L$2 = list2;
                this.J$0 = j;
                j2 = currentTimeMillis5;
                this.J$1 = j2;
                this.J$2 = currentTimeMillis2;
                this.label = 2;
                join = ((JobSupport) launch4).join(this);
                coroutineSingletons = coroutineSingletons7;
                if (join != coroutineSingletons) {
                    deferredCoroutine = async$default3;
                    instancedCardBatch = instancedCardBatch5;
                    arrayList = arrayList6;
                    engine = engine7;
                    list3 = list11;
                    List list12 = list2;
                    str6 = str5;
                    Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - currentTimeMillis2, "Pipeline: albedo uploaded in ", str6), new Object[0]);
                    it = list12.iterator();
                    while (it.hasNext()) {
                        ((Bitmap) it.next()).recycle();
                    }
                    this.L$0 = coroutineScope;
                    obj2 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.J$0 = j;
                    this.J$1 = j2;
                    this.J$2 = currentTimeMillis2;
                    this.label = 3;
                    await = deferredCoroutine.await(this);
                    if (await != coroutineSingletons) {
                        j3 = j2;
                        j4 = j;
                        List list13 = (List) await;
                        long currentTimeMillis7 = System.currentTimeMillis() - j4;
                        String str20 = str4;
                        Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis7, str6, re$$ExternalSyntheticOutline0.m("Pipeline: normal generated ", list13.size(), str20, invokeSuspend$mb(invokeSuspend$totalBytes(list13)), str3)), new Object[0]);
                        long currentTimeMillis8 = System.currentTimeMillis();
                        DefaultScheduler defaultScheduler3 = Dispatchers.Default;
                        CoroutineSingletons coroutineSingletons8 = coroutineSingletons;
                        str7 = str20;
                        str8 = str6;
                        ?? r35 = obj2;
                        InstancedCardBatch instancedCardBatch6 = instancedCardBatch;
                        List list14 = list3;
                        str9 = str3;
                        DeferredCoroutine async$default4 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, r35, new AnonymousClass1(this.$uniqueInkMetalHeatKeys, instancedCardBatch6, list14, r35, 2), 2);
                        currentTimeMillis3 = System.currentTimeMillis();
                        engine2 = engine;
                        Job launch5 = engine2.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch6, list13, r35, 5));
                        arrayList2 = arrayList;
                        arrayList2.add(launch5);
                        this.L$0 = coroutineScope;
                        this.L$1 = async$default4;
                        this.L$2 = r35;
                        this.L$3 = list13;
                        this.J$0 = currentTimeMillis8;
                        this.J$1 = j3;
                        this.J$2 = currentTimeMillis3;
                        this.J$3 = currentTimeMillis7;
                        this.label = 4;
                        join2 = ((JobSupport) launch5).join(this);
                        coroutineSingletons = coroutineSingletons8;
                        if (join2 != coroutineSingletons) {
                            deferredCoroutine2 = async$default4;
                            instancedCardBatch2 = instancedCardBatch6;
                            list4 = list14;
                            list5 = list13;
                            j5 = currentTimeMillis8;
                            j6 = j3;
                            j7 = currentTimeMillis7;
                            List list15 = list5;
                            arrayList3 = arrayList2;
                            engine3 = engine2;
                            CoroutineSingletons coroutineSingletons9 = coroutineSingletons;
                            str10 = str8;
                            Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - currentTimeMillis3, "Pipeline: normal uploaded in ", str10), new Object[0]);
                            it2 = list15.iterator();
                            while (it2.hasNext()) {
                                ((Bitmap) it2.next()).recycle();
                            }
                            this.L$0 = coroutineScope;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.J$0 = j5;
                            this.J$1 = j6;
                            this.J$2 = currentTimeMillis3;
                            this.J$3 = j7;
                            this.label = 5;
                            await2 = deferredCoroutine2.await(this);
                            coroutineSingletons2 = coroutineSingletons9;
                            if (await2 != coroutineSingletons2) {
                                j8 = j5;
                                List list16 = (List) await2;
                                long currentTimeMillis9 = System.currentTimeMillis() - j8;
                                String str21 = str9;
                                CoroutineSingletons coroutineSingletons10 = coroutineSingletons2;
                                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis9, str10, re$$ExternalSyntheticOutline0.m("Pipeline: inkMetalHeat generated ", list16.size(), str7, invokeSuspend$mb(invokeSuspend$totalBytes(list16)), str21)), new Object[0]);
                                long currentTimeMillis10 = System.currentTimeMillis();
                                DefaultScheduler defaultScheduler4 = Dispatchers.Default;
                                str11 = str10;
                                str12 = str21;
                                ArrayList arrayList7 = arrayList3;
                                str13 = str7;
                                long j27 = j7;
                                j9 = currentTimeMillis10;
                                List list17 = list4;
                                InstancedCardBatch instancedCardBatch7 = instancedCardBatch2;
                                DeferredCoroutine async$default5 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(list, instancedCardBatch7, list17, null, 3), 2);
                                long j28 = j6;
                                currentTimeMillis4 = System.currentTimeMillis();
                                engine4 = engine3;
                                launch = engine4.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch7, list16, null, 1));
                                arrayList7.add(launch);
                                this.L$0 = coroutineScope;
                                this.L$1 = async$default5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = list16;
                                this.J$0 = j9;
                                this.J$1 = j28;
                                this.J$2 = currentTimeMillis4;
                                this.J$3 = j27;
                                this.J$4 = currentTimeMillis9;
                                this.label = 6;
                                coroutineSingletons3 = coroutineSingletons10;
                                if (((JobSupport) launch).join(this) != coroutineSingletons3) {
                                    return coroutineSingletons3;
                                }
                                deferredCoroutine3 = async$default5;
                                instancedCardBatch3 = instancedCardBatch7;
                                list6 = list17;
                                list7 = list16;
                                arrayList4 = arrayList7;
                                j10 = j27;
                                j11 = j28;
                                j12 = currentTimeMillis9;
                                engine5 = engine4;
                                CoroutineSingletons coroutineSingletons11 = coroutineSingletons3;
                                DeferredCoroutine deferredCoroutine4 = deferredCoroutine3;
                                long j29 = j12;
                                str14 = str11;
                                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - currentTimeMillis4, "Pipeline: inkMetalHeat uploaded in ", str14), new Object[0]);
                                it3 = list7.iterator();
                                while (it3.hasNext()) {
                                    ((Bitmap) it3.next()).recycle();
                                }
                                this.L$0 = coroutineScope;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.J$0 = j9;
                                this.J$1 = j11;
                                this.J$2 = currentTimeMillis4;
                                this.J$3 = j10;
                                j13 = j29;
                                this.J$4 = j13;
                                this.label = 7;
                                await3 = deferredCoroutine4.await(this);
                                coroutineSingletons4 = coroutineSingletons11;
                                if (await3 != coroutineSingletons4) {
                                    return coroutineSingletons4;
                                }
                                long j30 = j11;
                                j14 = j10;
                                j15 = j30;
                                List list18 = (List) await3;
                                long currentTimeMillis11 = System.currentTimeMillis() - j9;
                                long j31 = j15;
                                CoroutineSingletons coroutineSingletons12 = coroutineSingletons4;
                                String str22 = str12;
                                String str23 = str13;
                                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis11, str14, re$$ExternalSyntheticOutline0.m("Pipeline: holoBase generated ", list18.size(), str23, invokeSuspend$mb(invokeSuspend$totalBytes(list18)), str22)), new Object[0]);
                                long currentTimeMillis12 = System.currentTimeMillis();
                                DefaultScheduler defaultScheduler5 = Dispatchers.Default;
                                str15 = str22;
                                str16 = str14;
                                str17 = str23;
                                long j32 = j13;
                                j16 = currentTimeMillis12;
                                instancedCardBatch5 = instancedCardBatch3;
                                async$default = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(list, instancedCardBatch5, list6, null, 1), 2);
                                long j33 = j14;
                                long currentTimeMillis13 = System.currentTimeMillis();
                                Engine engine8 = engine5;
                                launch2 = engine8.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch5, list18, null, 2));
                                ArrayList arrayList8 = arrayList4;
                                arrayList8.add(launch2);
                                this.L$0 = null;
                                this.L$1 = async$default;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.L$4 = null;
                                this.L$5 = list18;
                                this.J$0 = j16;
                                this.J$1 = j31;
                                this.J$2 = currentTimeMillis13;
                                this.J$3 = j33;
                                arrayList5 = arrayList8;
                                this.J$4 = j32;
                                j17 = currentTimeMillis11;
                                this.J$5 = j17;
                                this.label = 8;
                                coroutineSingletons2 = coroutineSingletons12;
                                if (((JobSupport) launch2).join(this) != coroutineSingletons2) {
                                    list8 = list18;
                                    j18 = currentTimeMillis13;
                                    j19 = j31;
                                    j20 = j33;
                                    engine6 = engine8;
                                    j21 = j32;
                                    instancedCardBatch4 = instancedCardBatch5;
                                    long j34 = j17;
                                    CoroutineSingletons coroutineSingletons13 = coroutineSingletons2;
                                    DeferredCoroutine deferredCoroutine5 = async$default;
                                    str18 = str16;
                                    Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - j18, "Pipeline: holoBase uploaded in ", str18), new Object[0]);
                                    it4 = list8.iterator();
                                    while (it4.hasNext()) {
                                        ((Bitmap) it4.next()).recycle();
                                    }
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.J$0 = j16;
                                    this.J$1 = j19;
                                    this.J$2 = j18;
                                    this.J$3 = j20;
                                    this.J$4 = j21;
                                    j22 = j34;
                                    this.J$5 = j22;
                                    this.label = 9;
                                    await4 = deferredCoroutine5.await(this);
                                    coroutineSingletons5 = coroutineSingletons13;
                                    if (await4 != coroutineSingletons5) {
                                        return coroutineSingletons5;
                                    }
                                    j23 = j21;
                                    j24 = j16;
                                    j25 = j19;
                                    list9 = (List) await4;
                                    long j35 = j22;
                                    long currentTimeMillis14 = System.currentTimeMillis() - j24;
                                    coroutineSingletons6 = coroutineSingletons5;
                                    Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis14, str18, re$$ExternalSyntheticOutline0.m("Pipeline: holoReflect generated ", list9.size(), str17, invokeSuspend$mb(invokeSuspend$totalBytes(list9)), str15)), new Object[0]);
                                    long currentTimeMillis15 = System.currentTimeMillis();
                                    launch3 = engine6.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch4, list9, null, 3));
                                    arrayList5.add(launch3);
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.L$3 = null;
                                    this.L$4 = null;
                                    this.L$5 = null;
                                    this.L$6 = list9;
                                    this.J$0 = j24;
                                    this.J$1 = j25;
                                    this.J$2 = currentTimeMillis15;
                                    this.J$3 = j20;
                                    this.J$4 = j23;
                                    this.J$5 = j35;
                                    this.label = 10;
                                    if (((JobSupport) launch3).join(this) != coroutineSingletons6) {
                                        return coroutineSingletons6;
                                    }
                                    j26 = currentTimeMillis15;
                                    Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - j26, "Pipeline: holoReflect uploaded in ", str18), new Object[0]);
                                    it5 = list9.iterator();
                                    while (it5.hasNext()) {
                                        ((Bitmap) it5.next()).recycle();
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                            return coroutineSingletons2;
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                list = list10;
                str = "ms";
                long j36 = this.J$0;
                SafeTrace.throwOnFailure(obj);
                currentTimeMillis = j36;
                str2 = " bitmaps (";
                str3 = " MB) in ";
                awaitInternal = obj;
                list2 = (List) awaitInternal;
                long currentTimeMillis52 = System.currentTimeMillis() - currentTimeMillis;
                String str192 = str;
                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis52, str192, re$$ExternalSyntheticOutline0.m("Pipeline: albedo generated ", list2.size(), str2, invokeSuspend$mb(invokeSuspend$totalBytes(list2)), str3)), new Object[0]);
                long currentTimeMillis62 = System.currentTimeMillis();
                DefaultScheduler defaultScheduler22 = Dispatchers.Default;
                str4 = str2;
                j = currentTimeMillis62;
                instancedCardBatch5 = instancedCardBatch5;
                DeferredCoroutine async$default32 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(this.$uniqueNormalKeys, instancedCardBatch5, list11, null, 0), 2);
                str5 = str192;
                currentTimeMillis2 = System.currentTimeMillis();
                Job launch42 = engine7.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch5, list2, null, 4));
                arrayList6.add(launch42);
                this.L$0 = coroutineScope;
                this.L$1 = async$default32;
                this.L$2 = list2;
                this.J$0 = j;
                j2 = currentTimeMillis52;
                this.J$1 = j2;
                this.J$2 = currentTimeMillis2;
                this.label = 2;
                join = ((JobSupport) launch42).join(this);
                coroutineSingletons = coroutineSingletons7;
                if (join != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 2:
                list = list10;
                str5 = "ms";
                long j37 = this.J$2;
                j2 = this.J$1;
                long j38 = this.J$0;
                list2 = this.L$2;
                DeferredCoroutine deferredCoroutine6 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                coroutineSingletons = coroutineSingletons7;
                j = j38;
                currentTimeMillis2 = j37;
                deferredCoroutine = deferredCoroutine6;
                str4 = " bitmaps (";
                str3 = " MB) in ";
                instancedCardBatch = instancedCardBatch5;
                arrayList = arrayList6;
                engine = engine7;
                list3 = list11;
                List list122 = list2;
                str6 = str5;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - currentTimeMillis2, "Pipeline: albedo uploaded in ", str6), new Object[0]);
                it = list122.iterator();
                while (it.hasNext()) {
                }
                this.L$0 = coroutineScope;
                obj2 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.J$0 = j;
                this.J$1 = j2;
                this.J$2 = currentTimeMillis2;
                this.label = 3;
                await = deferredCoroutine.await(this);
                if (await != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 3:
                list = list10;
                long j39 = this.J$1;
                j4 = this.J$0;
                List list19 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                list3 = list11;
                engine = engine7;
                str4 = " bitmaps (";
                str3 = " MB) in ";
                str6 = "ms";
                arrayList = arrayList6;
                j3 = j39;
                coroutineSingletons = coroutineSingletons7;
                await = obj;
                instancedCardBatch = instancedCardBatch5;
                obj2 = null;
                List list132 = (List) await;
                long currentTimeMillis72 = System.currentTimeMillis() - j4;
                String str202 = str4;
                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis72, str6, re$$ExternalSyntheticOutline0.m("Pipeline: normal generated ", list132.size(), str202, invokeSuspend$mb(invokeSuspend$totalBytes(list132)), str3)), new Object[0]);
                long currentTimeMillis82 = System.currentTimeMillis();
                DefaultScheduler defaultScheduler32 = Dispatchers.Default;
                CoroutineSingletons coroutineSingletons82 = coroutineSingletons;
                str7 = str202;
                str8 = str6;
                ?? r352 = obj2;
                InstancedCardBatch instancedCardBatch62 = instancedCardBatch;
                List list142 = list3;
                str9 = str3;
                DeferredCoroutine async$default42 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, r352, new AnonymousClass1(this.$uniqueInkMetalHeatKeys, instancedCardBatch62, list142, r352, 2), 2);
                currentTimeMillis3 = System.currentTimeMillis();
                engine2 = engine;
                Job launch52 = engine2.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch62, list132, r352, 5));
                arrayList2 = arrayList;
                arrayList2.add(launch52);
                this.L$0 = coroutineScope;
                this.L$1 = async$default42;
                this.L$2 = r352;
                this.L$3 = list132;
                this.J$0 = currentTimeMillis82;
                this.J$1 = j3;
                this.J$2 = currentTimeMillis3;
                this.J$3 = currentTimeMillis72;
                this.label = 4;
                join2 = ((JobSupport) launch52).join(this);
                coroutineSingletons = coroutineSingletons82;
                if (join2 != coroutineSingletons) {
                }
                return coroutineSingletons;
            case 4:
                list = list10;
                str8 = "ms";
                long j40 = this.J$3;
                long j41 = this.J$2;
                long j42 = this.J$1;
                long j43 = this.J$0;
                List list20 = this.L$3;
                List list21 = this.L$2;
                deferredCoroutine2 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                instancedCardBatch2 = instancedCardBatch5;
                coroutineSingletons = coroutineSingletons7;
                str9 = " MB) in ";
                list4 = list11;
                j5 = j43;
                str7 = " bitmaps (";
                arrayList2 = arrayList6;
                list5 = list20;
                j6 = j42;
                currentTimeMillis3 = j41;
                engine2 = engine7;
                j7 = j40;
                List list152 = list5;
                arrayList3 = arrayList2;
                engine3 = engine2;
                CoroutineSingletons coroutineSingletons92 = coroutineSingletons;
                str10 = str8;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - currentTimeMillis3, "Pipeline: normal uploaded in ", str10), new Object[0]);
                it2 = list152.iterator();
                while (it2.hasNext()) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = j5;
                this.J$1 = j6;
                this.J$2 = currentTimeMillis3;
                this.J$3 = j7;
                this.label = 5;
                await2 = deferredCoroutine2.await(this);
                coroutineSingletons2 = coroutineSingletons92;
                if (await2 != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 5:
                list = list10;
                long j44 = this.J$3;
                long j45 = this.J$1;
                j8 = this.J$0;
                List list22 = this.L$3;
                List list23 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                list4 = list11;
                j6 = j45;
                engine3 = engine7;
                coroutineSingletons2 = coroutineSingletons7;
                str7 = " bitmaps (";
                str9 = " MB) in ";
                arrayList3 = arrayList6;
                j7 = j44;
                str10 = "ms";
                await2 = obj;
                instancedCardBatch2 = instancedCardBatch5;
                List list162 = (List) await2;
                long currentTimeMillis92 = System.currentTimeMillis() - j8;
                String str212 = str9;
                CoroutineSingletons coroutineSingletons102 = coroutineSingletons2;
                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis92, str10, re$$ExternalSyntheticOutline0.m("Pipeline: inkMetalHeat generated ", list162.size(), str7, invokeSuspend$mb(invokeSuspend$totalBytes(list162)), str212)), new Object[0]);
                long currentTimeMillis102 = System.currentTimeMillis();
                DefaultScheduler defaultScheduler42 = Dispatchers.Default;
                str11 = str10;
                str12 = str212;
                ArrayList arrayList72 = arrayList3;
                str13 = str7;
                long j272 = j7;
                j9 = currentTimeMillis102;
                List list172 = list4;
                InstancedCardBatch instancedCardBatch72 = instancedCardBatch2;
                DeferredCoroutine async$default52 = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(list, instancedCardBatch72, list172, null, 3), 2);
                long j282 = j6;
                currentTimeMillis4 = System.currentTimeMillis();
                engine4 = engine3;
                launch = engine4.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch72, list162, null, 1));
                arrayList72.add(launch);
                this.L$0 = coroutineScope;
                this.L$1 = async$default52;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = list162;
                this.J$0 = j9;
                this.J$1 = j282;
                this.J$2 = currentTimeMillis4;
                this.J$3 = j272;
                this.J$4 = currentTimeMillis92;
                this.label = 6;
                coroutineSingletons3 = coroutineSingletons102;
                if (((JobSupport) launch).join(this) != coroutineSingletons3) {
                }
                break;
            case 6:
                list = list10;
                long j46 = this.J$4;
                long j47 = this.J$3;
                long j48 = this.J$2;
                long j49 = this.J$1;
                long j50 = this.J$0;
                List list24 = this.L$4;
                List list25 = this.L$3;
                List list26 = this.L$2;
                deferredCoroutine3 = this.L$1;
                SafeTrace.throwOnFailure(obj);
                instancedCardBatch3 = instancedCardBatch5;
                list6 = list11;
                j10 = j47;
                j12 = j46;
                str13 = " bitmaps (";
                str12 = " MB) in ";
                str11 = "ms";
                list7 = list24;
                arrayList4 = arrayList6;
                coroutineSingletons3 = coroutineSingletons7;
                engine4 = engine7;
                currentTimeMillis4 = j48;
                j11 = j49;
                j9 = j50;
                engine5 = engine4;
                CoroutineSingletons coroutineSingletons112 = coroutineSingletons3;
                DeferredCoroutine deferredCoroutine42 = deferredCoroutine3;
                long j292 = j12;
                str14 = str11;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - currentTimeMillis4, "Pipeline: inkMetalHeat uploaded in ", str14), new Object[0]);
                it3 = list7.iterator();
                while (it3.hasNext()) {
                }
                this.L$0 = coroutineScope;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.J$0 = j9;
                this.J$1 = j11;
                this.J$2 = currentTimeMillis4;
                this.J$3 = j10;
                j13 = j292;
                this.J$4 = j13;
                this.label = 7;
                await3 = deferredCoroutine42.await(this);
                coroutineSingletons4 = coroutineSingletons112;
                if (await3 != coroutineSingletons4) {
                }
                break;
            case 7:
                long j51 = this.J$4;
                long j52 = this.J$3;
                long j53 = this.J$1;
                list = list10;
                long j54 = this.J$0;
                List list27 = this.L$4;
                List list28 = this.L$3;
                List list29 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                list6 = list11;
                engine5 = engine7;
                coroutineSingletons4 = coroutineSingletons7;
                j14 = j52;
                str13 = " bitmaps (";
                str12 = " MB) in ";
                arrayList4 = arrayList6;
                j9 = j54;
                await3 = obj;
                instancedCardBatch3 = instancedCardBatch5;
                j15 = j53;
                j13 = j51;
                str14 = "ms";
                List list182 = (List) await3;
                long currentTimeMillis112 = System.currentTimeMillis() - j9;
                long j312 = j15;
                CoroutineSingletons coroutineSingletons122 = coroutineSingletons4;
                String str222 = str12;
                String str232 = str13;
                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis112, str14, re$$ExternalSyntheticOutline0.m("Pipeline: holoBase generated ", list182.size(), str232, invokeSuspend$mb(invokeSuspend$totalBytes(list182)), str222)), new Object[0]);
                long currentTimeMillis122 = System.currentTimeMillis();
                DefaultScheduler defaultScheduler52 = Dispatchers.Default;
                str15 = str222;
                str16 = str14;
                str17 = str232;
                long j322 = j13;
                j16 = currentTimeMillis122;
                instancedCardBatch5 = instancedCardBatch3;
                async$default = JobKt.async$default(coroutineScope, DefaultIoScheduler.INSTANCE, null, new AnonymousClass1(list, instancedCardBatch5, list6, null, 1), 2);
                long j332 = j14;
                long currentTimeMillis132 = System.currentTimeMillis();
                Engine engine82 = engine5;
                launch2 = engine82.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch5, list182, null, 2));
                ArrayList arrayList82 = arrayList4;
                arrayList82.add(launch2);
                this.L$0 = null;
                this.L$1 = async$default;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = list182;
                this.J$0 = j16;
                this.J$1 = j312;
                this.J$2 = currentTimeMillis132;
                this.J$3 = j332;
                arrayList5 = arrayList82;
                this.J$4 = j322;
                j17 = currentTimeMillis112;
                this.J$5 = j17;
                this.label = 8;
                coroutineSingletons2 = coroutineSingletons122;
                if (((JobSupport) launch2).join(this) != coroutineSingletons2) {
                }
                return coroutineSingletons2;
            case 8:
                long j55 = this.J$5;
                long j56 = this.J$4;
                long j57 = this.J$3;
                long j58 = this.J$2;
                long j59 = this.J$1;
                long j60 = this.J$0;
                List list30 = this.L$5;
                List list31 = this.L$4;
                List list32 = this.L$3;
                List list33 = this.L$2;
                async$default = this.L$1;
                SafeTrace.throwOnFailure(obj);
                arrayList5 = arrayList6;
                engine6 = engine7;
                j20 = j57;
                str17 = " bitmaps (";
                str15 = " MB) in ";
                str16 = "ms";
                list8 = list30;
                coroutineSingletons2 = coroutineSingletons7;
                j18 = j58;
                j19 = j59;
                j16 = j60;
                j21 = j56;
                j17 = j55;
                instancedCardBatch4 = instancedCardBatch5;
                long j342 = j17;
                CoroutineSingletons coroutineSingletons132 = coroutineSingletons2;
                DeferredCoroutine deferredCoroutine52 = async$default;
                str18 = str16;
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - j18, "Pipeline: holoBase uploaded in ", str18), new Object[0]);
                it4 = list8.iterator();
                while (it4.hasNext()) {
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.J$0 = j16;
                this.J$1 = j19;
                this.J$2 = j18;
                this.J$3 = j20;
                this.J$4 = j21;
                j22 = j342;
                this.J$5 = j22;
                this.label = 9;
                await4 = deferredCoroutine52.await(this);
                coroutineSingletons5 = coroutineSingletons132;
                if (await4 != coroutineSingletons5) {
                }
                break;
            case 9:
                long j61 = this.J$5;
                j23 = this.J$4;
                long j62 = this.J$3;
                j25 = this.J$1;
                j24 = this.J$0;
                List list34 = this.L$5;
                List list35 = this.L$4;
                List list36 = this.L$3;
                List list37 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                engine6 = engine7;
                str17 = " bitmaps (";
                str15 = " MB) in ";
                str18 = "ms";
                instancedCardBatch4 = instancedCardBatch5;
                await4 = obj;
                arrayList5 = arrayList6;
                j20 = j62;
                j22 = j61;
                coroutineSingletons5 = coroutineSingletons7;
                list9 = (List) await4;
                long j352 = j22;
                long currentTimeMillis142 = System.currentTimeMillis() - j24;
                coroutineSingletons6 = coroutineSingletons5;
                Timber.Forest.d(CameraState$Type$EnumUnboxingLocalUtility.m(currentTimeMillis142, str18, re$$ExternalSyntheticOutline0.m("Pipeline: holoReflect generated ", list9.size(), str17, invokeSuspend$mb(invokeSuspend$totalBytes(list9)), str15)), new Object[0]);
                long currentTimeMillis152 = System.currentTimeMillis();
                launch3 = engine6.launch(new InstancedCardBatch$setUniqueCards$8(instancedCardBatch4, list9, null, 3));
                arrayList5.add(launch3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.L$6 = list9;
                this.J$0 = j24;
                this.J$1 = j25;
                this.J$2 = currentTimeMillis152;
                this.J$3 = j20;
                this.J$4 = j23;
                this.J$5 = j352;
                this.label = 10;
                if (((JobSupport) launch3).join(this) != coroutineSingletons6) {
                }
                break;
            case 10:
                j26 = this.J$2;
                list9 = this.L$6;
                List list38 = this.L$5;
                List list39 = this.L$4;
                List list40 = this.L$3;
                List list41 = this.L$2;
                SafeTrace.throwOnFailure(obj);
                str18 = "ms";
                Timber.Forest.d(Boxes$$ExternalSyntheticOutline1.m(System.currentTimeMillis() - j26, "Pipeline: holoReflect uploaded in ", str18), new Object[0]);
                it5 = list9.iterator();
                while (it5.hasNext()) {
                }
                return Unit.INSTANCE;
            default:
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
