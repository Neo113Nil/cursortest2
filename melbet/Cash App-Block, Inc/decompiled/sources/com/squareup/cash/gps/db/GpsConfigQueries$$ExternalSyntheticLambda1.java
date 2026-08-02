package com.squareup.cash.gps.db;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.autofill.ContentType;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.genericelements.viewmodels.GenericTreeElementsViewEvent;
import com.squareup.cash.globalsearch.backend.real.RealGlobalSearchRepository;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewEvent;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.mooncake.components.MooncakeEmptyView;
import com.squareup.protos.cash.taply.syncvalues.TagThemeDefinitions;
import com.squareup.protos.franklin.app.ProvisionDigitalWalletTokenResponse;
import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.util.android.Views;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class GpsConfigQueries$$ExternalSyntheticLambda1 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ GpsConfigQueries$$ExternalSyntheticLambda1(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long duration;
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("gpsConfig");
                break;
            case 1:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 2:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 3:
                List list = (List) obj;
                list.getClass();
                TagThemeDefinitions tagThemeDefinitions = (TagThemeDefinitions) CollectionsKt.firstOrNull(list);
                Map map = tagThemeDefinitions != null ? tagThemeDefinitions.tag_theme_definitions : null;
                if (map == null) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    break;
                }
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                Context context = (Context) obj;
                context.getClass();
                break;
            case 9:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                ContentType.Companion.getClass();
                SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, ContentType.Companion.BirthDateFull);
                break;
            case 10:
                Context context2 = (Context) obj;
                context2.getClass();
                CashLottieAnimationView cashLottieAnimationView = new CashLottieAnimationView(context2);
                cashLottieAnimationView.setRepeatMode(1);
                cashLottieAnimationView.setRepeatCount(-1);
                cashLottieAnimationView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                break;
            case 11:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 12:
                ((String) obj).getClass();
                break;
            case 13:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
                SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.Password;
                Unit unit = Unit.INSTANCE;
                semanticsPropertyReceiver2.set(semanticsPropertyKey, unit);
                break;
            case 14:
                Context context3 = (Context) obj;
                context3.getClass();
                MooncakeEmptyView mooncakeEmptyView = new MooncakeEmptyView(context3, null);
                mooncakeEmptyView.setExtraHeight(Views.dip((View) mooncakeEmptyView, 112));
                break;
            case 15:
                ((GenericTreeElementsViewEvent) obj).getClass();
                break;
            case 16:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 17:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 18:
                ((GenericTreeElementsViewEvent) obj).getClass();
                break;
            case 19:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 20:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 21:
                RealGlobalSearchRepository.SectionHandleState sectionHandleState = (RealGlobalSearchRepository.SectionHandleState) obj;
                sectionHandleState.getClass();
                int i = sectionHandleState.itemLimit;
                GlobalSearchResponseSectionModel globalSearchResponseSectionModel = sectionHandleState.model;
                if (globalSearchResponseSectionModel.getItems().size() > i) {
                    if (!(globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Activities)) {
                        if (!(globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Rows)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            GlobalSearchResponseSectionModel.Rows rows = (GlobalSearchResponseSectionModel.Rows) globalSearchResponseSectionModel;
                            break;
                        }
                    } else {
                        GlobalSearchResponseSectionModel.Activities activities = (GlobalSearchResponseSectionModel.Activities) globalSearchResponseSectionModel;
                        break;
                    }
                } else {
                    break;
                }
            case 22:
                if (((GlobalSearchViewEvent.QueryUpdateEvent) obj).query.getValue().length() > 0) {
                    Duration.Companion companion = Duration.Companion;
                    duration = DurationKt.toDuration(350, DurationUnit.MILLISECONDS);
                } else {
                    Duration.Companion companion2 = Duration.Companion;
                    duration = DurationKt.toDuration(0, DurationUnit.MILLISECONDS);
                }
                break;
            case 23:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 24:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 25:
                GlobalSearchViewModel.Item item = (GlobalSearchViewModel.Item) obj;
                item.getClass();
                break;
            case 26:
                UiCallbackModel uiCallbackModel = (UiCallbackModel) obj;
                uiCallbackModel.getClass();
                break;
            case 27:
                ApiResult.Success success = (ApiResult.Success) obj;
                success.getClass();
                DigitalWalletTokenProvisioningResponseData digitalWalletTokenProvisioningResponseData = ((ProvisionDigitalWalletTokenResponse) success.response).provisioning_response;
                digitalWalletTokenProvisioningResponseData.getClass();
                DigitalWalletTokenProvisioningResponseData.Status status = digitalWalletTokenProvisioningResponseData.status;
                if (status == null) {
                    status = ProtoDefaults.PROVISION_DIGITAL_TOKEN_STATUS;
                }
                int ordinal = status.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 28:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("gpsConfig");
                break;
            default:
                Throwable th = (Throwable) obj;
                th.getClass();
                Timber.Forest forest = Timber.Forest;
                forest.tag("SwampGL");
                forest.e("Uncaught exception on render thread", new Object[0], th);
                break;
        }
        return Unit.INSTANCE;
    }
}
