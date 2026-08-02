package com.squareup.cash.card.onboarding.core;

import android.graphics.Bitmap;
import android.util.Log;
import androidx.camera.camera2.pipe.CameraError;
import androidx.camera.camera2.pipe.compat.AndroidCameraState;
import androidx.camera.camera2.pipe.compat.OpenCameraResult;
import app.cash.api.ApiResult;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.db2.BankingConfigQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.investing.backend.real.RealInvestmentPerformanceSyncer;
import com.squareup.cash.investing.db.InvestmentHoldingQueries$$ExternalSyntheticLambda4;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.work.tinygraph.models.IBaseEntity;
import com.squareup.cash.work.tinygraph.models.Location;
import com.squareup.cash.work.tinygraph.models.LocationStatus;
import com.squareup.cash.work.tinygraph.real.RealLocationRepository;
import com.squareup.cash.work.tinygraph.setting.SettingDao;
import com.squareup.protos.cash.portfolios.GetPortfoliosPerformanceResponse;
import com.squareup.workflow1.internal.SubtreeManager;
import com.withpersona.sdk2.camera.CameraProperties;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdState;
import com.withpersona.sdk2.inquiry.governmentid.GovernmentIdWorkflow;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStateManagerUtilsKt;
import com.withpersona.sdk2.inquiry.governmentid.persona_workflow.GovernmentIdStepStateManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardScene$applyIconToMaterial$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Object $icon;
    public final /* synthetic */ Object $material;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardScene$applyIconToMaterial$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.$r8$classId = i;
        this.$material = obj;
        this.$icon = obj2;
        this.this$0 = obj3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Object obj2 = this.$icon;
        Object obj3 = this.$material;
        switch (i) {
            case 0:
                return new CardScene$applyIconToMaterial$1((CardMaterial) obj3, (Bitmap) obj2, (CardScene) obj, continuation, 0);
            case 1:
                return new CardScene$applyIconToMaterial$1((Ref$ObjectRef) obj3, (Ref$ObjectRef) obj2, (AndroidCameraState) obj, continuation, 1);
            case 2:
                return new CardScene$applyIconToMaterial$1((CardGridNuxScene) obj3, (Quat) obj2, (Vector4) obj, continuation, 2);
            case 3:
                return new CardScene$applyIconToMaterial$1((ApiResult) obj3, (RealInvestmentPerformanceSyncer) obj2, (InvestmentEntityToken) obj, continuation, 3);
            case 4:
                return new CardScene$applyIconToMaterial$1((RealLocationRepository) obj3, (Collection) obj2, (LocationStatus) obj, continuation, 4);
            default:
                return new CardScene$applyIconToMaterial$1((GovernmentIdWorkflow.Input) obj3, (GovernmentIdState) obj2, (GovernmentIdStepStateManager) obj, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.$r8$classId) {
        }
        return ((CardScene$applyIconToMaterial$1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        Object obj3 = this.$icon;
        Object obj4 = this.$material;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardScene cardScene = (CardScene) obj2;
                ((CardMaterial) obj4).setIcon((Bitmap) obj3, CardsKt.ICON_TEXTURE_BOUNDS, cardScene.currentIndicatorRadius);
                cardScene.markDirty();
                return Unit.INSTANCE;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Log.d("CXCP", "tryOpenCamera: 3000ms elapsed");
                ((Ref$ObjectRef) obj4).element = null;
                if (((Ref$ObjectRef) obj3).element == null) {
                    return null;
                }
                Log.e("CXCP", "tryOpenCamera: openCamera() timed out");
                ((AndroidCameraState) obj2).close();
                return new OpenCameraResult(null, new CameraError(13), 1);
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) obj4;
                if (!cardGridNuxScene.heroAnimationComplete) {
                    return Unit.INSTANCE;
                }
                cardGridNuxScene.heroWobbleRotation = (Quat) obj3;
                cardGridNuxScene.heroWobbleTranslation = (Vector4) obj2;
                CardGridNuxScene.access$updateCardTransforms(cardGridNuxScene);
                cardGridNuxScene.markDirty();
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ApiResult apiResult = (ApiResult) obj4;
                if (apiResult instanceof ApiResult.Success) {
                    GetPortfoliosPerformanceResponse getPortfoliosPerformanceResponse = (GetPortfoliosPerformanceResponse) ((ApiResult.Success) apiResult).response;
                    GpsConfigQueries gpsConfigQueries = ((RealInvestmentPerformanceSyncer) obj3).queries;
                    String str = ((InvestmentEntityToken) obj2).value;
                    String str2 = getPortfoliosPerformanceResponse.title;
                    List list = getPortfoliosPerformanceResponse.sections;
                    gpsConfigQueries.getClass();
                    str.getClass();
                    list.getClass();
                    gpsConfigQueries.driver.execute(562506102, "INSERT OR REPLACE INTO investment_performance\nVALUES (?, ?, ?)", new BankingConfigQueries$$ExternalSyntheticLambda0(str, str2, gpsConfigQueries, list, 20));
                    gpsConfigQueries.notifyQueries(562506102, new InvestmentHoldingQueries$$ExternalSyntheticLambda4(2));
                }
                return Unit.INSTANCE;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                SettingDao settingDao = ((RealLocationRepository) obj4).dao;
                Collection<String> collection = (Collection) obj3;
                LocationStatus locationStatus = (LocationStatus) obj2;
                settingDao.getClass();
                collection.getClass();
                ArrayList arrayList = new ArrayList();
                for (String str3 : collection) {
                    str3.getClass();
                    IBaseEntity byId = settingDao.entityStore.getById(str3);
                    Location location = byId instanceof Location ? (Location) byId : null;
                    if (location != null) {
                        arrayList.add(location);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Location location2 = (Location) next;
                    if (locationStatus == null || location2.status == locationStatus) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            default:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                GovernmentIdWorkflow.Input input = (GovernmentIdWorkflow.Input) obj4;
                if (input.enabledIdClasses.size() == 1) {
                    GovernmentIdStateManagerUtilsKt.moveToNextStep$default((GovernmentIdState.ShowInstructions) ((GovernmentIdState) obj3), (SubtreeManager) r3.lastChild, input, null, r12, ((GovernmentIdStepStateManager) obj2).videoCaptureHelper, new CameraProperties(null, null, null, 0, 31, 0), false, ((IdConfig) CollectionsKt.first((List) input.enabledIdClasses)).parts, 0, null, 3584);
                }
                return Unit.INSTANCE;
        }
    }
}
