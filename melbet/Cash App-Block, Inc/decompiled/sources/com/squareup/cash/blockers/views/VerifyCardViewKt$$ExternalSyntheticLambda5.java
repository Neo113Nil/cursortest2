package com.squareup.cash.blockers.views;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentViewEvent;
import com.squareup.cash.blockers.views.card.CardEditorUtilsKt$WhenMappings;
import com.squareup.cash.instruments.utils.CardBrandGuesser$Brand;
import com.squareup.protos.common.instrument.InstrumentType;
import com.squareup.protos.franklin.common.KeyedCard;
import com.squareup.util.Strings;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes4.dex */
public final /* synthetic */ class VerifyCardViewKt$$ExternalSyntheticLambda5 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;
    public final /* synthetic */ CardState f$1;

    public /* synthetic */ VerifyCardViewKt$$ExternalSyntheticLambda5(Function1 function1, CardState cardState, int i) {
        this.$r8$classId = i;
        this.f$0 = function1;
        this.f$1 = cardState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        CardState cardState = this.f$1;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                function1.invoke(new VerifyInstrumentViewEvent.SubmitCardNumber(cardState.get_number()));
                return Unit.INSTANCE;
            default:
                InstrumentType instrumentType = null;
                if (!((Boolean) cardState._isSubmittable$delegate.getValue()).booleanValue()) {
                    a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                    return null;
                }
                String str = cardState.get_number();
                String substring = cardState.get_number().substring(cardState.get_number().length() - 4);
                String padStart = StringsKt.padStart(4, (String) cardState._expiration$delegate.getValue());
                String concat = (padStart == null || padStart.length() != 4) ? null : padStart.substring(2, 4).concat(padStart.substring(0, 2));
                String str2 = (String) cardState._securityCode$delegate.getValue();
                String emptyAsNull = Strings.emptyAsNull((String) cardState._postalCode$delegate.getValue());
                String emptyAsNull2 = Strings.emptyAsNull((String) cardState._name$delegate.getValue());
                CardBrandGuesser$Brand cardBrandGuesser$Brand = cardState.get_brand();
                switch (cardBrandGuesser$Brand == null ? -1 : CardEditorUtilsKt$WhenMappings.$EnumSwitchMapping$0[cardBrandGuesser$Brand.ordinal()]) {
                    case -1:
                        break;
                    case 0:
                    default:
                        instrumentType = InstrumentType.UNKNOWN;
                        break;
                    case 1:
                        instrumentType = InstrumentType.VISA;
                        break;
                    case 2:
                        instrumentType = InstrumentType.MASTER_CARD;
                        break;
                    case 3:
                        instrumentType = InstrumentType.AMERICAN_EXPRESS;
                        break;
                    case 4:
                        instrumentType = InstrumentType.DISCOVER;
                        break;
                    case 5:
                        instrumentType = InstrumentType.DISCOVER_DINERS;
                        break;
                    case 6:
                        instrumentType = InstrumentType.JCB;
                        break;
                    case 7:
                        instrumentType = InstrumentType.UNKNOWN;
                        break;
                }
                function1.invoke(new InputCardInfoViewEvent.TapNext(new KeyedCard(str, concat, str2, emptyAsNull, substring, instrumentType, emptyAsNull2, null, ByteString.EMPTY)));
                return Unit.INSTANCE;
        }
    }
}
