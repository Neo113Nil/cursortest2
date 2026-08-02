package com.squareup.cash.p2pblocking.presenters;

import androidx.compose.runtime.MutableState;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PSearchData;
import com.squareup.cash.p2pblocking.viewmodels.P2PListButtonValues;
import com.squareup.cash.p2pblocking.viewmodels.P2PListEmptyState;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowTapButtonEvent;
import com.squareup.protos.cash.blockly.common.BlockingContext;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes6.dex */
public interface P2PListController {
    Object fetchData(String str, BlockingContext blockingContext, ContinuationImpl continuationImpl);

    P2PListButtonValues getButtonValues(boolean z, boolean z2, boolean z3, Integer num);

    P2PListEmptyState getEmptyState(String str, boolean z, FamilyProfile familyProfile, BlockingContext blockingContext);

    String getFooter(String str, boolean z, boolean z2, Integer num);

    StateFlowImpl getListData();

    StateFlowImpl getSearchData();

    String getSearchHeaderTitle(boolean z);

    String getSearchPlaceholder();

    String getSearchTitle(boolean z);

    String getToolbarTitle();

    Object handleRowTap(String str, P2PListRowTapButtonEvent p2PListRowTapButtonEvent, MutableState mutableState, Continuation continuation);

    Object searchCustomers(String str, String str2, BlockingContext blockingContext, ContinuationImpl continuationImpl);

    SearchResultsData transformSearchResults(P2PSearchData p2PSearchData, String str, String str2, String str3, boolean z, boolean z2, Integer num, BlockingContext blockingContext);

    ArrayList transformToRowModels(P2PListData p2PListData, String str, String str2, String str3, boolean z, boolean z2, Integer num, BlockingContext blockingContext);

    Unit updateData(P2PListData p2PListData);
}
