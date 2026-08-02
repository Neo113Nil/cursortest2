package com.squareup.cash.blockers.scenarioplan.api;

import app.cash.broadway.screen.Screen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.scenarioplan.models.ScenarioPlanInput;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes4.dex */
public interface ScenarioPlan {

    /* loaded from: classes.dex */
    public interface Factory {
        ScenarioPlan create(ScenarioPlanInput scenarioPlanInput, Screen screen);
    }

    BlockersData createBlockersData();

    default Object onFailure(BlockersData blockersData, Continuation continuation) {
        return Unit.INSTANCE;
    }

    default Object onSuccess(BlockersData blockersData, Continuation continuation) {
        return Unit.INSTANCE;
    }

    Object produceResponseContext(BlockersData blockersData, ContinuationImpl continuationImpl);
}
