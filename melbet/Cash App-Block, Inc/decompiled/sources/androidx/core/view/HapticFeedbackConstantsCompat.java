package androidx.core.view;

import android.os.Build;
import androidx.compose.ui.draw.RotateKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.savings.backend.api.SavingsParsingErrorFactory;
import com.squareup.cash.savings.backend.api.SavingsProtoParsingError;
import com.squareup.cash.savings.backend.api.model.SavingsAction;
import com.squareup.cash.savings.backend.api.model.SavingsCard;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Reflection;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.savings.bespoke_elements.Card;
import squareup.cash.savings.bespoke_elements.CardImage;
import squareup.cash.ui.arcade.elements.InlineMessage;

/* loaded from: classes3.dex */
public abstract class HapticFeedbackConstantsCompat {
    public static List getDeepLinkSpecs() {
        return ClientRoute.DeprecatedViewShopInfo.deepLinkSpecs;
    }

    public static int getFeedbackConstantOrFallback(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 34) {
            switch (i) {
                case 21:
                case 23:
                case 26:
                    i = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i = 4;
                    break;
                case 25:
                    i = 0;
                    break;
            }
        }
        if (i2 >= 30) {
            return i;
        }
        if (i != 12) {
            if (i == 13) {
                return 6;
            }
            if (i != 16) {
                if (i != 17) {
                    return i;
                }
                return 0;
            }
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SavingsCard mapCard(ProtoValidationScope protoValidationScope) {
        SavingsCard.Image image;
        SavingsCard.Image remoteImage;
        String reportIfNullAndContinue;
        String str;
        LocalizedString localizedString;
        SavingsCard.Button button;
        Card card = (Card) protoValidationScope.proto;
        InlineMessage inlineMessage = (InlineMessage) protoValidationScope.reportIfNullAndContinue("inline_message", (String) null, card.inline_message);
        if (inlineMessage == null) {
            return null;
        }
        String reportIfNullAndContinue2 = protoValidationScope.reportIfNullAndContinue(inlineMessage.title_text, "title_text", "InlineMessage");
        String str2 = reportIfNullAndContinue2 == null ? "" : reportIfNullAndContinue2;
        String reportIfNullAndContinue3 = protoValidationScope.reportIfNullAndContinue(inlineMessage.body_text, "body_text", "InlineMessage");
        String str3 = reportIfNullAndContinue3 == null ? "" : reportIfNullAndContinue3;
        CardImage cardImage = card.image;
        if (cardImage != null) {
            remoteImage = new SavingsCard.Image.LocalImage(cardImage);
        } else {
            Image image2 = inlineMessage.image;
            if (image2 == null) {
                image = null;
                reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(inlineMessage.primary_button_text, "primary_button_text", "InlineMessage");
                if (reportIfNullAndContinue == null) {
                    reportIfNullAndContinue = "";
                }
                str = (String) protoValidationScope.reportIfNullAndContinue("primary_button_client_route", (String) null, card.primary_button_client_route);
                if (str == null) {
                    str = "";
                }
                SavingsCard.Button button2 = new SavingsCard.Button(reportIfNullAndContinue, str, card.primary_button_cdf_event);
                localizedString = inlineMessage.secondary_button_text;
                if (localizedString == null) {
                    String str4 = (String) protoValidationScope.reportIfNullAndContinue("secondary_button_text translated_value", "InlineMessage", localizedString.translated_value);
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = (String) protoValidationScope.reportIfNullAndContinue("secondary_button_client_route", (String) null, card.secondary_button_client_route);
                    button = new SavingsCard.Button(str4, str5 != null ? str5 : "", card.secondary_button_cdf_event);
                } else {
                    button = null;
                }
                return new SavingsCard(str2, str3, image, button2, button);
            }
            remoteImage = new SavingsCard.Image.RemoteImage(image2);
        }
        image = remoteImage;
        reportIfNullAndContinue = protoValidationScope.reportIfNullAndContinue(inlineMessage.primary_button_text, "primary_button_text", "InlineMessage");
        if (reportIfNullAndContinue == null) {
        }
        str = (String) protoValidationScope.reportIfNullAndContinue("primary_button_client_route", (String) null, card.primary_button_client_route);
        if (str == null) {
        }
        SavingsCard.Button button22 = new SavingsCard.Button(reportIfNullAndContinue, str, card.primary_button_cdf_event);
        localizedString = inlineMessage.secondary_button_text;
        if (localizedString == null) {
        }
        return new SavingsCard(str2, str3, image, button22, button);
    }

    public static final SavingsCard toCard(HasObservability hasObservability, Card card) {
        hasObservability.getClass();
        card.getClass();
        SavingsParsingErrorFactory savingsParsingErrorFactory = SavingsParsingErrorFactory.INSTANCE;
        try {
            return mapCard(new ProtoValidationScope(card, savingsParsingErrorFactory, hasObservability));
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(Card.class), savingsParsingErrorFactory, null);
        }
    }

    public static final SavingsAction.ClientRoute toSavingsAction(ProtoValidationScope protoValidationScope, squareup.cash.savings.action.SavingsAction savingsAction) {
        savingsAction.getClass();
        try {
            SavingsAction.Action action = savingsAction.action;
            if (action instanceof SavingsAction.Action.ClientRoute) {
                return new SavingsAction.ClientRoute(((SavingsAction.Action.ClientRoute) action).value, savingsAction.cdfEvent);
            }
            if (!(action instanceof SavingsAction.Action.PresentCard)) {
                if (action == null) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            SavingsProtoParsingError savingsProtoParsingError = new SavingsProtoParsingError("SavingsAction", ProtoParsingError.ErrorType.INVALID_TYPE_TO_SEALED_INTERFACE_MAPPING, (String) null, 12);
            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
            if (errorReporter == null) {
                throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
            }
            errorReporter.report(savingsProtoParsingError, defaultSamplingStrategy);
            return null;
        } catch (Exception e) {
            throw RotateKt.toProtoParsingExceptionFor(e, Reflection.factory.getOrCreateKotlinClass(squareup.cash.savings.action.SavingsAction.class), SavingsParsingErrorFactory.INSTANCE, null);
        }
    }
}
