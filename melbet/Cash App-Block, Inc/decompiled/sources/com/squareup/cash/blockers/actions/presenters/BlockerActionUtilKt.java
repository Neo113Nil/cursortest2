package com.squareup.cash.blockers.actions.presenters;

import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.SubmitFormResponse;
import com.squareup.protos.franklin.common.ResponseContext;

/* loaded from: classes4.dex */
public abstract class BlockerActionUtilKt {

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlockerAction.EndFlowAction.Result.values().length];
            try {
                iArr[BlockerAction.EndFlowAction.Result.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlockerAction.EndFlowAction.Result.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void handleSubmitFormResponse(ApiResult apiResult, Screen screen, BlockersData blockersData, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator) {
        String str;
        apiResult.getClass();
        blockersData.getClass();
        if (!(apiResult instanceof ApiResult.Success)) {
            String str2 = null;
            screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str2, str2, 6));
            return;
        }
        SubmitFormResponse submitFormResponse = (SubmitFormResponse) ((ApiResult.Success) apiResult).response;
        ResponseContext responseContext = submitFormResponse.response_context;
        responseContext.getClass();
        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
        ResponseContext responseContext2 = submitFormResponse.response_context;
        screenNavigator.goTo((responseContext2 == null || (str = responseContext2.dialog_message) == null) ? blockersDataNavigator.getNext(screen, updateFromResponseContext) : new BlockersScreens.SuccessMessageScreen(blockersData, null, str, responseContext2.dialog_title, 2));
    }

    public static final void handleSubmitFormResponseContext(ApiResult apiResult, Screen screen, BlockersData blockersData, BetterNavigator.ScreenNavigator screenNavigator, BlockersDataNavigator blockersDataNavigator) {
        Screen next;
        screen.getClass();
        blockersData.getClass();
        if (!(apiResult instanceof ApiResult.Success)) {
            String str = null;
            screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str, str, 6));
            return;
        }
        ResponseContext responseContext = (ResponseContext) ((ApiResult.Success) apiResult).response;
        BlockersData updateFromResponseContext = blockersData.updateFromResponseContext(responseContext, false);
        String str2 = responseContext.dialog_message;
        if (str2 != null) {
            next = new BlockersScreens.SuccessMessageScreen(blockersData, null, str2, responseContext.dialog_title, 2);
        } else {
            next = blockersDataNavigator.getNext(screen, updateFromResponseContext);
        }
        screenNavigator.goTo(next);
    }
}
