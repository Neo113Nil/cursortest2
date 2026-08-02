package com.squareup.cash.blockers.flow;

import app.cash.local.db.LocalTabContentQueries;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.app.UploadFileRequest;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.JobKt;
import org.commonmark.node.Node;

/* loaded from: classes.dex */
public final class RealMultiBlockerFacilitator {
    public final AppService appService;
    public final BlockersDataNavigator blockersNavigator;
    public final AppService franklinAppService;
    public final CoroutineContext ioDispatcher;
    public final LocalTabContentQueries queries;

    /* loaded from: classes4.dex */
    public final class GroupResolver extends Node {
        public final /* synthetic */ RealMultiBlockerFacilitator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupResolver(RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersScreens blockersScreens) {
            super(realMultiBlockerFacilitator, blockersScreens);
            blockersScreens.getClass();
            this.this$0 = realMultiBlockerFacilitator;
        }

        @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
        public final boolean getResolvesSynchronously() {
            return false;
        }

        @Override // org.commonmark.node.Node
        public final Object proceed(RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9) {
            RealMultiBlockerFacilitator realMultiBlockerFacilitator = this.this$0;
            return JobKt.withContext(realMultiBlockerFacilitator.ioDispatcher, new SsnPresenter$models$2$2(realMultiBlockerFacilitator, this, null, 6), realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9);
        }

        @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
        public final Object resolve(UploadFileRequest uploadFileRequest, Continuation continuation) {
            return null;
        }
    }

    /* loaded from: classes4.dex */
    public final class ProceedToNextBlockerResolver extends Node {
        public final BlockersDataNavigator blockersNavigator;
        public final BetterNavigator.ScreenNavigator navigator;
        public final boolean resolvesSynchronously;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProceedToNextBlockerResolver(RealMultiBlockerFacilitator realMultiBlockerFacilitator, BlockersDataNavigator blockersDataNavigator, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens blockersScreens) {
            super(realMultiBlockerFacilitator, blockersScreens);
            blockersScreens.getClass();
            this.blockersNavigator = blockersDataNavigator;
            this.navigator = screenNavigator;
            this.resolvesSynchronously = true;
        }

        @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
        public final boolean getResolvesSynchronously() {
            return this.resolvesSynchronously;
        }

        @Override // org.commonmark.node.Node
        public final Object proceed(RealMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9 realMultiBlockerFacilitator$AbstractMultiBlockerResolver$resolve$9) {
            BlockersData blockersData = (BlockersData) this.firstChild;
            ScenarioPlan scenarioPlan = blockersData.scenarioPlan;
            scenarioPlan.getClass();
            ScenarioPlan scenarioPlan2 = blockersData.scenarioPlan;
            scenarioPlan2.getClass();
            List<BlockerDescriptor> list = scenarioPlan2.blocker_descriptors;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!Intrinsics.areEqual(((BlockerDescriptor) obj).id, blockersData.blockerId)) {
                    arrayList.add(obj);
                }
            }
            BlockersData copy$default = BlockersData.copy$default(blockersData, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, ScenarioPlan.copy$default(scenarioPlan, null, null, arrayList, null, null, 503), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, -262145, 65535);
            this.navigator.goTo(this.blockersNavigator.getNext((BlockersScreens) this.parent, copy$default));
            return null;
        }

        @Override // com.squareup.cash.blockers.flow.api.MultiBlockerFacilitator$Resolver
        public final Object resolve(UploadFileRequest uploadFileRequest, Continuation continuation) {
            return null;
        }
    }

    public RealMultiBlockerFacilitator(AppService appService, AppService appService2, BlockersDataNavigator blockersDataNavigator, CashAccountDatabaseImpl cashAccountDatabaseImpl, CoroutineContext coroutineContext) {
        this.appService = appService;
        this.franklinAppService = appService2;
        this.blockersNavigator = blockersDataNavigator;
        this.ioDispatcher = coroutineContext;
        this.queries = cashAccountDatabaseImpl.multiBlockerQueries;
    }

    public final MultiBlockerFacilitator$Resolver getResolver(BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens blockersScreens) {
        String str;
        Object obj;
        BlockerDescriptor blockerDescriptor;
        blockersScreens.getClass();
        BlockersData blockersData = blockersScreens.getBlockersData();
        String str2 = blockersData.blockerId;
        String str3 = blockersData.groupId;
        if (str3 == null) {
            return new BinaryBitmap(this, blockersScreens);
        }
        Iterator it = CollectionsKt.windowed$default(blockersData.getNextBlockers(), 2, 0, 6).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((BlockerDescriptor) CollectionsKt.first((List) obj)).id, str2)) {
                break;
            }
        }
        List list = (List) obj;
        if (list != null && (blockerDescriptor = (BlockerDescriptor) CollectionsKt.getOrNull(1, list)) != null) {
            str = blockerDescriptor.group_id;
        }
        return Intrinsics.areEqual(str, str3) ? new ProceedToNextBlockerResolver(this, this.blockersNavigator, screenNavigator, blockersScreens) : new GroupResolver(this, blockersScreens);
    }
}
