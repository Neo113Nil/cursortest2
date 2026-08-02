package com.squareup.cash.db;

import android.content.Context;
import app.cash.broadway.ui.Ui;
import app.cash.paraphrase.FormattedResource;
import app.cash.sqldelight.EnumColumnAdapter;
import com.squareup.cash.R;
import com.squareup.cash.card.onboarding.core.CardShaderGenerator;
import com.squareup.cash.cdf.atm.AtmWithdrawalGrantLocationPermission;
import com.squareup.cash.cdf.papermoney.PaperMoneyDepositGrantLocationPermission;
import com.squareup.cash.deposits.physical.presenter.atm.AtmWithdrawalMapPresenter;
import com.squareup.cash.deposits.physical.presenter.map.PaperMoneyDepositMapPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningErrorManager;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.history.presenters.FormattedResources;
import com.squareup.cash.investing.viewmodels.categories.FilterSubFiltersViewEvent;
import com.squareup.cash.money.privacy.RealBalancePrivacy$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.util.android.Views;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final /* synthetic */ class EnumListAdapter$encode$1 extends FunctionReferenceImpl implements Function1 {
    public final /* synthetic */ int $r8$classId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnumListAdapter$encode$1(Object obj) {
        super(1, 0, EnumColumnAdapter.class, obj, "encode", "encode(Ljava/lang/Enum;)Ljava/lang/String;");
        this.$r8$classId = 0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AtmWithdrawalGrantLocationPermission.AndroidLocationAuthorizationStatus androidLocationAuthorizationStatus;
        PaperMoneyDepositGrantLocationPermission.AndroidLocationAuthorizationStatus androidLocationAuthorizationStatus2;
        List split$default;
        List split$default2;
        switch (this.$r8$classId) {
            case 0:
                Enum r6 = (Enum) obj;
                r6.getClass();
                ((EnumColumnAdapter) this.receiver).getClass();
                return r6.name();
            case 1:
                String str = (String) obj;
                str.getClass();
                ((CardShaderGenerator.SingleCard) this.receiver).getClass();
                return "uniform sampler2D u" + str + "Texture;";
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ((AtmWithdrawalMapPresenter) this.receiver).getClass();
                if (!booleanValue) {
                    androidLocationAuthorizationStatus = AtmWithdrawalGrantLocationPermission.AndroidLocationAuthorizationStatus.DENIED;
                } else {
                    if (!booleanValue) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    androidLocationAuthorizationStatus = AtmWithdrawalGrantLocationPermission.AndroidLocationAuthorizationStatus.GRANTED;
                }
                return new AtmWithdrawalGrantLocationPermission(androidLocationAuthorizationStatus);
            case 3:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                ((PaperMoneyDepositMapPresenter) this.receiver).getClass();
                if (!booleanValue2) {
                    androidLocationAuthorizationStatus2 = PaperMoneyDepositGrantLocationPermission.AndroidLocationAuthorizationStatus.DENIED;
                } else {
                    if (!booleanValue2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    androidLocationAuthorizationStatus2 = PaperMoneyDepositGrantLocationPermission.AndroidLocationAuthorizationStatus.GRANTED;
                }
                return new PaperMoneyDepositGrantLocationPermission(androidLocationAuthorizationStatus2);
            case 4:
                FidesmoProvisioningErrorManager.ErrorModel errorModel = (FidesmoProvisioningErrorManager.ErrorModel) obj;
                errorModel.getClass();
                ((FidesmoProvisioningPresenter) this.receiver).recordErrorModel$1(errorModel);
                return Unit.INSTANCE;
            case 5:
                UserJourney$Outcome userJourney$Outcome = (UserJourney$Outcome) obj;
                userJourney$Outcome.getClass();
                ((FidesmoProvisioningPresenter) this.receiver).endJourneyIfNeeded$1(userJourney$Outcome);
                return Unit.INSTANCE;
            case 6:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 7:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 8:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 9:
                ((Timber.Forest) this.receiver).e((Throwable) obj);
                return Unit.INSTANCE;
            case 10:
                String str2 = (String) obj;
                str2.getClass();
                ((RealGrowToolsManagerViewAppearanceTracker.Companion) this.receiver).getClass();
                if (str2.length() == 0) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    return emptyMap;
                }
                String trimEnd = StringsKt.trimEnd(StringsKt.trimStart(str2, '{'), '}');
                if (trimEnd.length() == 0) {
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    return emptyMap2;
                }
                split$default = StringsKt__StringsKt.split$default(trimEnd, new String[]{", "}, false, 0, 6, null);
                List list = split$default;
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{"="}, false, 0, 6, null);
                    linkedHashMap.put((String) split$default2.get(0), Boolean.valueOf(Boolean.parseBoolean((String) split$default2.get(1))));
                }
                return linkedHashMap;
            case 11:
                Map map = (Map) obj;
                map.getClass();
                ((RealGrowToolsManagerViewAppearanceTracker.Companion) this.receiver).getClass();
                return map.toString();
            case 12:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.history_check_status_pending_message, new Object[]{obj});
            case 13:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.history_check_status_cancel_pending, new Object[]{obj});
            case 14:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.history_check_status_already_sent, new Object[]{obj});
            case 15:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.activity_report_abuse_title, new Object[]{obj});
            case 16:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.activity_unreport_abuse_title, new Object[]{obj});
            case 17:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.activity_report_abuse_title, new Object[]{obj});
            case 18:
                obj.getClass();
                ((FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.activity_unreport_abuse_title, new Object[]{obj});
            case 19:
                FilterSubFiltersViewEvent filterSubFiltersViewEvent = (FilterSubFiltersViewEvent) obj;
                filterSubFiltersViewEvent.getClass();
                ((Ui.EventReceiver) this.receiver).sendEvent(filterSubFiltersViewEvent);
                return Unit.INSTANCE;
            case 20:
                FilterSubFiltersViewEvent filterSubFiltersViewEvent2 = (FilterSubFiltersViewEvent) obj;
                filterSubFiltersViewEvent2.getClass();
                ((Ui.EventReceiver) this.receiver).sendEvent(filterSubFiltersViewEvent2);
                return Unit.INSTANCE;
            case 21:
                obj.getClass();
                ((com.squareup.cash.investing.presenters.FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.investing_transfer_stock_subtitle_up_custom, new Object[]{obj});
            case 22:
                obj.getClass();
                ((com.squareup.cash.investing.presenters.FormattedResources) this.receiver).getClass();
                return new FormattedResource(R.string.investing_transfer_stock_subtitle_down_custom, new Object[]{obj});
            case 23:
                String str3 = (String) obj;
                str3.getClass();
                switch (((RealBalancePrivacy$$ExternalSyntheticLambda1) this.receiver).$r8$classId) {
                    case 0:
                        str3.getClass();
                        return "••••";
                    default:
                        str3.getClass();
                        return str3;
                }
            case 24:
                int intValue = ((Number) obj).intValue();
                ((ComposePlatform.Alignment.Companion) this.receiver).getClass();
                return ComposePlatform.Alignment.Companion.fromValue(intValue);
            case 25:
                int intValue2 = ((Number) obj).intValue();
                ((ComposePlatform.HorizontalAlignment.Companion) this.receiver).getClass();
                return ComposePlatform.HorizontalAlignment.Companion.fromValue(intValue2);
            case 26:
                int intValue3 = ((Number) obj).intValue();
                ((ComposePlatform.HorizontalArrangement.Companion) this.receiver).getClass();
                return ComposePlatform.HorizontalArrangement.Companion.fromValue(intValue3);
            case 27:
                int intValue4 = ((Number) obj).intValue();
                ((ComposePlatform.VerticalAlignment.Companion) this.receiver).getClass();
                return ComposePlatform.VerticalAlignment.Companion.fromValue(intValue4);
            case 28:
                int intValue5 = ((Number) obj).intValue();
                ((ComposePlatform.VerticalArrangement.Companion) this.receiver).getClass();
                return ComposePlatform.VerticalArrangement.Companion.fromValue(intValue5);
            default:
                return Float.valueOf(Views.dip((Context) this.receiver, ((Number) obj).floatValue()));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EnumListAdapter$encode$1(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.$r8$classId = i3;
    }
}
